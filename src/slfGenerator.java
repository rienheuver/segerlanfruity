import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Klasse voor het genereren van jasmin-instructies voor Seger Lan
 * Fruity-programma's.
 * 
 * @author Syste Hartvelt en Rien Heuver
 *
 */
public class slfGenerator extends slfBaseVisitor<String>
{
	/**
	 * Naam van het slf-programma
	 */
	private String filename;
	/**
	 * Symboltable waarin variabelen, scopes e.d. worden bijgehouden
	 */
	private SymbolTable st;
	/**
	 * Geannoteerde boom met extra informatie over typen bij bepaalde delen van
	 * de boom.
	 */
	private ParseTreeProperty<Type> decoratedTree;
	/**
	 * Teller van het aantal variabelen. Wordt gebruikt om unieke
	 * geheugennummers te maken voor variabelen.
	 */
	private int var_counter = 1;
	/**
	 * Teller van het aantal labels. Wordt gebruikt om unieke labels te
	 * genereren.
	 */
	private int labelcounter = 0;

	/**
	 * Constructor van de klasse. Initialiseert de naam van het programma.
	 * 
	 * @param filename,
	 *            de naam van het programma
	 */
	public slfGenerator(String filename)
	{
		st = new SymbolTable();
		this.filename = filename;
	}

	/**
	 * Functie om eenvoudiger instructies aan te maken
	 * 
	 * @param s,
	 *            de instructie zelf
	 * @return De instructie met een newline
	 */
	private String addCommand(String s)
	{
		return s + "\n";
	}

	/**
	 * Genereert instructies om variabelen op te slaan.
	 * 
	 * @param t,
	 *            de type variabele
	 * @param i,
	 *            het geheugennummer van de variabele
	 * @return een instructie waarmee de variabele opgeslagen kan worden
	 */
	private String var_store(Type t, int i)
	{
		String out;
		switch (t)
		{
			case INTEGER:
			case BOOLEAN:
			case CHARACTER:
				out = addCommand("istore " + i);
				break;

			case STRING:
				out = addCommand("astore " + i);
				break;

			default:
				out = "";
				break;
		}
		return out;
	}

	/**
	 * Genereert een uniek label @return, een uniek label
	 */
	private String newLabel()
	{
		labelcounter++;
		return "Label" + labelcounter;
	}

	/**
	 * Genereert instructies om statische tekst naar het scherm te outputten.
	 * 
	 * @param s,
	 *            de tekst om te outputten @return, instructies om de tekst te
	 *            outputten
	 */
	private String printString(String s)
	{
		String out = addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
		out += addCommand("ldc " + "\"" + s + "\"");
		out += addCommand("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
		return out;
	}

	/**
	 * Start het genereren van instructies voor slf-programma's
	 * 
	 * @param decoratedTree,
	 *            de geannoteerde boom, gegenereerd door de slfChecker
	 * @param tree,
	 *            de originele boom, gegenereerd door de slfParser
	 * @return een lijst van jasmin-instructies die het gehele programma
	 *         beschrijven
	 */
	public String start(ParseTreeProperty<Type> decoratedTree, ParseTree tree)
	{
		this.decoratedTree = decoratedTree;
		String out = "";
		out += addCommand(".class public " + filename);
		out += addCommand(".super java/lang/Object");
		out += addCommand(".method public <init>()V");
		out += addCommand("  aload 0");
		out += addCommand("  invokespecial java/lang/Object/<init>()V");
		out += addCommand("  return");
		out += addCommand(".end method");
		out += addCommand(".method public static main([Ljava/lang/String;)V");
		out += addCommand(".limit stack 500");
		out += addCommand(".limit locals 500");

		out += addCommand("; create scanner for inputs");
		out += addCommand("new java/util/Scanner");
		out += addCommand("dup");
		out += addCommand("getstatic java/lang/System/in Ljava/io/InputStream;");
		out += addCommand("invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V");
		out += addCommand("astore 1");

		out += addCommand("; start of actual program");
		
		out += visit(tree);
		
		out += addCommand("; end of actual program");
		out += addCommand("return");
		out += addCommand(".end method");
		
		return out;
	}

	@Override
	public String visitProgram(slfParser.ProgramContext ctx)
	{
		String out = "";
		st.openScope();
		for (slfParser.CommandContext cc : ctx.command())
		{
			out += visit(cc);
		}
		st.closeScope();
		return out;
	}

	@Override
	public String visitWhileStatementCommand(slfParser.WhileStatementCommandContext ctx)
	{
		return visit(ctx.while_statement());
	}

	@Override
	public String visitExpressionCommand(slfParser.ExpressionCommandContext ctx)
	{
		String out = visit(ctx.expression());
		Type type = decoratedTree.get(ctx);
		if (type != Type.VOID)
		{
			out += addCommand("pop");
		}
		return out;
	}

	@Override
	public String visitDeclarationCommand(slfParser.DeclarationCommandContext ctx)
	{
		return visit(ctx.declaration());
	}

	@Override
	public String visitIf_statement(slfParser.If_statementContext ctx)
	{
		if (ctx.ELSE() != null)
		{
			String elseLabel = newLabel();
			String continueLabel = newLabel();
			String out = visit(ctx.expression());
			out += addCommand("ifeq " + elseLabel);
			out += visit(ctx.program(0));
			out += addCommand("goto " + continueLabel);
			out += addCommand(elseLabel + ":");
			out += visit(ctx.program(1));
			out += addCommand(continueLabel + ":");
			return out;
		}
		else
		{
			String continueLabel = newLabel();
			String out = visit(ctx.expression());
			out += addCommand("ifeq " + continueLabel);
			out += visit(ctx.program(0));
			out += addCommand("pop");
			out += addCommand(continueLabel + ":");
			return out;
		}
	}

	@Override
	public String visitWhile_statement(slfParser.While_statementContext ctx)
	{
		String whileLabel = newLabel();
		String falseLabel = newLabel();
		labelcounter++;
		String out = addCommand(whileLabel + ":");
		out += visit(ctx.expression());
		out += addCommand("ifeq " + falseLabel);
		out += visit(ctx.program());
		out += addCommand("goto " + whileLabel);
		out += addCommand(falseLabel + ":");
		return out;
	}

	@Override
	public String visitReturn_expression(slfParser.Return_expressionContext ctx)
	{
		return visit(ctx.expression());
	}

	@Override
	public String visitDeclaration(slfParser.DeclarationContext ctx)
	{
		Type type = decoratedTree.get(ctx);
		boolean constant = ctx.CONSTANT() != null;
		if (ctx.BECOMES() == null) // geen toewijzing, alleen declaratie
		{
			for (org.antlr.v4.runtime.tree.TerminalNode id : ctx.IDENTIFIER())
			{
				try
				{
					st.enter(id.getText(), new IdEntry(constant, type));
					var_counter++;
					st.retrieve(id.getText()).setMemId(var_counter);
				}
				catch (SymbolTableException ste)
				{
					System.out.println(ste.getMessage());
				}
			}
			return "";
		}
		else // declaratie met toewijzing
		{
			String out = "";
			for (org.antlr.v4.runtime.tree.TerminalNode id : ctx.IDENTIFIER())
			{
				try
				{
					st.enter(id.getText(), new IdEntry(constant, type));
					var_counter++;
					st.retrieve(id.getText()).setMemId(var_counter);
				}
				catch (SymbolTableException ste)
				{
					System.out.println(ste.getMessage());
				}
				out += visit(ctx.expression());
				out += var_store(type, st.retrieve(id.getText()).getMemId());
			}
			return out;
		}
	}

	@Override
	public String visitClosedExpression(slfParser.ClosedExpressionContext ctx)
	{
		return visit(ctx.expression());
	}

	@Override
	public String visitNegativeExpression(slfParser.NegativeExpressionContext ctx)
	{
		String out = visit(ctx.expression());
		out += addCommand("ineg");
		return out;
	}

	@Override
	public String visitNegateExpression(slfParser.NegateExpressionContext ctx)
	{
		String out = visit(ctx.expression());
		String falseLabel = newLabel();
		String continueLabel = newLabel();
		out += addCommand("ifne " + falseLabel);
		out += addCommand("iconst_1");
		out += addCommand("goto " + continueLabel);
		out += addCommand(falseLabel + ":");
		out += addCommand("iconst_0");
		out += addCommand(continueLabel + ":");
		return out;
	}

	@Override
	public String visitMultiplyExpression(slfParser.MultiplyExpressionContext ctx)
	{
		String out = visit(ctx.expression(0));
		out += visit(ctx.expression(1));
		if (ctx.TIMES() != null)
		{
			out += addCommand("imul");
		}
		else if (ctx.DIVIDE() != null)
		{
			String label = newLabel();
			out += addCommand("dup");
			out += addCommand("ifne " + label);
			out += printString("Division by zero. Exiting program.");
			out += addCommand("iconst_1");
			out += addCommand("invokestatic java/lang/System/exit(I)V");
			out += addCommand("return");
			out += addCommand(label + ":");
			out += addCommand("idiv");
		}
		else if (ctx.MODULO() != null)
		{
			out += addCommand("irem");
		}
		return out;
	}

	@Override
	public String visitAdditionExpression(slfParser.AdditionExpressionContext ctx)
	{
		String out = visit(ctx.expression(0));
		out += visit(ctx.expression(1));
		if (ctx.PLUS() != null)
		{
			Type type = decoratedTree.get(ctx);
			if (type == Type.INTEGER)
			{
				out += addCommand("iadd");
			}
			else if (type == Type.STRING)
			{
				out += addCommand("invokevirtual java/lang/String/concat(Ljava/lang/String;)Ljava/lang/String;");
			}
		}
		else if (ctx.MINUS() != null)
		{
			out += addCommand("isub");
		}
		return out;
	}

	@Override
	public String visitCompareExpression(slfParser.CompareExpressionContext ctx)
	{
		String trueLabel = newLabel();
		String continueLabel = newLabel();
		String out = visit(ctx.expression(0));
		out += visit(ctx.expression(1));
		if (ctx.LT() != null)
		{
			out += addCommand("if_icmplt " + trueLabel);
		}
		else if (ctx.LTE() != null)
		{
			out += addCommand("if_icmple " + trueLabel);
		}
		else if (ctx.GT() != null)
		{
			out += addCommand("if_icmpgt " + trueLabel);
		}
		else if (ctx.GTE() != null)
		{
			out += addCommand("if_icmpge " + trueLabel);
		}
		else if (ctx.EQUALS() != null)
		{
			out += addCommand("if_icmpeq " + trueLabel);
		}
		else if (ctx.UNEQUALS() != null)
		{
			out += addCommand("if_icmpne " + trueLabel);
		}
		out += addCommand("iconst_0");
		out += addCommand("goto " + continueLabel);
		out += addCommand(trueLabel + ":");
		out += addCommand("iconst_1");
		out += addCommand(continueLabel + ":");
		return out;
	}

	@Override
	public String visitAndExpression(slfParser.AndExpressionContext ctx)
	{
		String falseLabel = newLabel();
		String continueLabel = newLabel();
		String out = visit(ctx.expression(0)); // stack left side of &&
		out += addCommand("ifeq " + falseLabel); // if false, jump
		out += visit(ctx.expression(1)); // stack right side of &&
		out += addCommand("ifeq " + falseLabel); // if false, jump
		out += addCommand("iconst_1"); // both true, thus true
		out += addCommand("goto " + continueLabel); // continue program
		out += addCommand(falseLabel + ":");
		out += addCommand("iconst_0"); // either was false, thus false
		out += addCommand(continueLabel + ":");
		return out;
	}

	@Override
	public String visitOrExpression(slfParser.OrExpressionContext ctx)
	{
		String trueLabel = newLabel();
		String continueLabel = newLabel();
		String out = visit(ctx.expression(0)); // stack left side of ||
		out += addCommand("ifne " + trueLabel); // if true, jump
		out += visit(ctx.expression(1)); // stack right side of ||
		out += addCommand("ifne " + trueLabel); // if true, jump
		out += addCommand("iconst_0"); // both false, thus false
		out += addCommand("goto " + continueLabel); // continue program
		out += addCommand(trueLabel + ":");
		out += addCommand("iconst_1"); // either was true, thus true
		out += addCommand(continueLabel + ":");
		return out;
	}

	@Override
	public String visitRead_expression(slfParser.Read_expressionContext ctx)
	{
		Type type = Type.ERROR;
		String out = "";
		for (org.antlr.v4.runtime.tree.TerminalNode identifier : ctx.IDENTIFIER())
		{
			type = st.retrieve(identifier.getText()).getType();
			switch (type)
			{
				case STRING:
					out += printString("Voer een karakterreeks in");
					break;
				case BOOLEAN:
					out += printString("Voer een boolse waarde in");
					break;
				case INTEGER:
					out += printString("Voer een geheel getal in");
					break;
				case CHARACTER:
					out += printString("Voer een karakter in");
					break;
				default:
					throw new IllegalArgumentException(
							"Something unlikely happened. You entered a non-existing type to be read.");
			}
			out += addCommand("aload 1");
			out += addCommand("invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;");
			switch (type)
			{
				case STRING:
					break;

				case BOOLEAN:
					out += addCommand("ldc \"true\"");
					out += addCommand("invokevirtual java/lang/String/equals(Ljava/lang/Object;)Z");
					break;

				case INTEGER:
					out += addCommand("invokestatic java/lang/Integer/parseInt(Ljava/lang/String;)I");
					break;

				case CHARACTER:
					out += addCommand("iconst_0");
					out += addCommand("invokevirtual java/lang/String/charAt(I)I");
					break;

				default:
					throw new IllegalArgumentException(
							"Something unlikely happened. You entered a non-existing type to be read.");
			}
			if (ctx.IDENTIFIER().size() == 1)
			{
				out += addCommand("dup");
			}

			switch (type)
			{
				case STRING:
					out += addCommand("astore " + st.retrieve(identifier.getText()).getMemId());
					break;

				case BOOLEAN:
				case INTEGER:
				case CHARACTER:
					out += addCommand("istore " + st.retrieve(identifier.getText()).getMemId());
					break;

				default:
					throw new IllegalArgumentException(
							"Something unlikely happened. You entered a non-existing type to be read.");
			}
		}
		return out;
	}

	@Override
	public String visitPrint_expression(slfParser.Print_expressionContext ctx)
	{
		String out = "";
		Type type = Type.VOID;
		for (slfParser.ExpressionContext ec : ctx.expression())
		{
			type = decoratedTree.get(ec);
			switch (type)
			{
				case STRING:
					out += visit(ec);
					out += addCommand("dup");
					out += addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
					out += addCommand("swap");
					out += addCommand("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
					break;
				case BOOLEAN:
					out += visit(ec);
					out += addCommand("dup");
					out += addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
					out += addCommand("swap");
					out += addCommand("invokevirtual java/io/PrintStream/println(Z)V");
					break;
				case INTEGER:
					out += visit(ec);
					out += addCommand("dup");
					out += addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
					out += addCommand("swap");
					out += addCommand("invokevirtual java/io/PrintStream/println(I)V");
					break;
				case CHARACTER:
					out += visit(ec);
					out += addCommand("dup");
					out += addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
					out += addCommand("swap");
					out += addCommand("i2c");
					out += addCommand("invokevirtual java/io/PrintStream/println(C)V");
					break;

				default:
					throw new IllegalArgumentException(
							"Something unlikely happened. You entered a non-existing type to be printed. Type found: "
									+ type.toString());
			}
		}
		if (ctx.expression().size() > 1)
		{
			out += addCommand("pop");
		}
		return out;
	}

	@Override
	public String visitIf_expression(slfParser.If_expressionContext ctx)
	{
		if (ctx.compound_expression().size() > 1)
		{
			String elseLabel = newLabel();
			String continueLabel = newLabel();
			String out = visit(ctx.expression());
			out += addCommand("ifeq " + elseLabel);
			out += visit(ctx.compound_expression(0));
			out += addCommand("goto " + continueLabel);
			out += addCommand(elseLabel + ":");
			out += visit(ctx.compound_expression(1));
			out += addCommand(continueLabel + ":");
			return out;
		}
		else
		{
			String continueLabel = newLabel();
			String out = visit(ctx.expression());
			out += addCommand("ifeq " + continueLabel);
			out += visit(ctx.compound_expression(0));
			out += addCommand("pop");
			out += addCommand(continueLabel + ":");
			return out;
		}
	}

	@Override
	public String visitCompound_expression(slfParser.Compound_expressionContext ctx)
	{
		String out = "";
		visit(ctx.program());
		out += visit(ctx.return_expression());
		return out;
	}

	@Override
	public String visitAssignment_expression(slfParser.Assignment_expressionContext ctx)
	{
		String out = visit(ctx.expression());
		IdEntry variable = st.retrieve(ctx.IDENTIFIER().getText());
		out += addCommand("dup");
		out += var_store(variable.getType(), variable.getMemId());
		return out;
	}

	@Override
	public String visitLiteral_boolean(slfParser.Literal_booleanContext ctx)
	{
		String bool = ctx.LITERALBOOLEAN().getText();
		if (bool.equals("false"))
		{
			return addCommand("iconst_0");
		}
		else
		{
			return addCommand("iconst_1");
		}
	}

	@Override
	public String visitLiteral_string(slfParser.Literal_stringContext ctx)
	{
		String text = ctx.LITERALSTRING().getText();
		return addCommand("ldc " + text);
	}

	@Override
	public String visitLiteral_character(slfParser.Literal_characterContext ctx)
	{
		char character = ctx.LITERALCHARACTER().getText().charAt(0);
		return addCommand("ldc " + (int) character);
	}

	@Override
	public String visitLiteral_number(slfParser.Literal_numberContext ctx)
	{
		String integer = ctx.LITERALNUMBER().getText();
		return addCommand("ldc " + integer);
	}

	@Override
	public String visitIDENTIFIERExpression(slfParser.IDENTIFIERExpressionContext ctx)
	{
		String out = "";
		int mem_id = st.retrieve(ctx.IDENTIFIER().getText()).getMemId();
		switch (decoratedTree.get(ctx))
		{
			case STRING:
				out = addCommand("aload " + mem_id);
				break;

			case BOOLEAN:
			case CHARACTER:
			case INTEGER:
				out = addCommand("iload " + mem_id);
				break;

			default:
				throw new IllegalArgumentException("Something unlikely happened. Your variable has no known type.");
		}
		return out;
	}

}