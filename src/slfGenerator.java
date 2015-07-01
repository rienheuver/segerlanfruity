import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class slfGenerator extends slfBaseVisitor<String>
{
	private String filename;
	private SymbolTable st;
	private ParseTreeProperty<Type> decoratedTree;
	private int var_counter = 0;
	private int labelcounter = 0;

	public slfGenerator(String filename)
	{
		st = new SymbolTable();
		this.filename = filename;
	}

	private String addCommand(String s)
	{
		return s + "\n";
	}

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

	private String newLabel()
	{
		labelcounter++;
		return "Label" + labelcounter + ":";
	}

	private String printString(String s)
	{
		String out = addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
		out += addCommand("ldc " + s);
		out += addCommand("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
		return out;
	}

	public String start(ParseTreeProperty<Type> decoratedTree, ParseTree tree)
	{
		this.decoratedTree = decoratedTree;
		return this.visit(tree);
	}

	@Override
	public String visitProgram(slfParser.ProgramContext ctx)
	{
		String out = "";
		out += addCommand(".class public " + filename);
		out += addCommand(".super java/lang/Object");
		out += addCommand(".method public <init>()V");
		out += addCommand("  aload_0");
		out += addCommand("  invokespecial java/lang/Object/<init>()V");
		out += addCommand("  return");
		out += addCommand(".end method");
		out += addCommand(".method public static main([Ljava/lang/String;)V");
		out += addCommand(".limit stack 500");
		out += addCommand(".limit locals 500");
		out += addCommand("; start of actual program");

		st.openScope();
		for (slfParser.CommandContext cc : ctx.command())
		{
			out += visit(cc);
		}
		st.closeScope();

		out += addCommand("; end of actual program");
		out += addCommand("return");
		out += addCommand(".end method");
		return out;
	}

	@Override
	public String visitWhile_statement(slfParser.While_statementContext ctx)
	{
		String whileLabel = newLabel();
		String falseLabel = newLabel();
		labelcounter++;
		String out = addCommand(whileLabel);
		out += visit(ctx.expression());
		out += addCommand("ifeq " + falseLabel);
		out += visit(ctx.compound_expression());
		out += addCommand("goto " + whileLabel);
		out += addCommand(falseLabel);
		return out;
	}

	@Override
	public String visitDeclaration(slfParser.DeclarationContext ctx)
	{
		Type type = decoratedTree.get(ctx);
		boolean constant = ctx.CONSTANT() != null;
		if (ctx.BECOMES() == null) // no assignment, only declaration
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
		else
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
				out += var_store(type, var_counter);
			}
			return out;
		}
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
		out += addCommand(falseLabel);
		out += addCommand("iconst_0");
		out += addCommand(continueLabel);
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
			out += addCommand(label);
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
			out += addCommand("iadd");
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
			out += addCommand("if_icmplt");
		}
		else if (ctx.LTE() != null)
		{
			out += addCommand("if_icmple");
		}
		else if (ctx.GT() != null)
		{
			out += addCommand("if_icmpgt");
		}
		else if (ctx.GTE() != null)
		{
			out += addCommand("if_icmpge");
		}
		else if (ctx.EQUALS() != null)
		{
			out += addCommand("if_icmpeq");
		}
		else if (ctx.UNEQUALS() != null)
		{
			out += addCommand("if_icmpne");
		}
		out += addCommand("iconst_0");
		out += addCommand("goto " + continueLabel);
		out += addCommand(trueLabel);
		out += addCommand("iconst_1");
		out += addCommand(continueLabel);
		return out;
	}

	@Override
	public String visitAndExpression(slfParser.AndExpressionContext ctx)
	{
		String falseLabel = newLabel();
		String continueLabel = newLabel();
		String out = visit(ctx.expression(0)); // stack left side of &&
		out += addCommand("ifeq "+falseLabel); // if false, jump
		out += visit(ctx.expression(1)); // stack right side of &&
		out += addCommand("ifeq "+falseLabel); // if false, jump
		out += addCommand("iconst_1"); // both true, thus true
		out += addCommand("goto "+continueLabel); // continue program
		out += addCommand(falseLabel);
		out += addCommand("iconst_0"); // either was false, thus false
		out += addCommand(continueLabel);
		return out;
	}
	
	@Override
	public String visitOrExpression(slfParser.OrExpressionContext ctx)
	{
		String trueLabel = newLabel();
		String continueLabel = newLabel();
		String out = visit(ctx.expression(0)); // stack left side of ||
		out += addCommand("ifne "+trueLabel); // if true, jump
		out += visit(ctx.expression(1)); // stack right side of ||
		out += addCommand("ifne "+trueLabel); // if true, jump
		out += addCommand("iconst_0"); // both false, thus false
		out += addCommand("goto "+continueLabel); // continue program
		out += addCommand(trueLabel);
		out += addCommand("iconst_1"); // either was true, thus true
		out += addCommand(continueLabel);
		return out;
	}

	@Override
	public String visitLiteral_number(slfParser.Literal_numberContext ctx)
	{
		String integer = ctx.LITERALNUMBER().getText();
		return addCommand("bipush " + integer);
	}

}