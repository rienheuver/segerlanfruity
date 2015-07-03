import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Klasse voor het context-checken van Seger Lan Fruity programma's.
 * @author Sytse Hartvelt en Rien Heuver
 *
 */
public class slfChecker extends slfBaseVisitor<Type>
{
	/**
	 * Symboltable waarin alle variabelen, scopes e.d. worden bijgehouden.
	 */
	private SymbolTable st;
	/**
	 * Het aantal gevonden fouten tijdens het checken.
	 */
	private int error_count;
	/**
	 * Een geannoteerde boom van het programma zodat de slfGenerator extra informatie over het programma heeft.
	 */
	private ParseTreeProperty<Type> decoratedTree;

	/**
	 * Constructor van de klasse. Initialiseert de symboltable, geannoteerde boom en het aantal foutmeldingen.
	 */
	public slfChecker()
	{
		st = new SymbolTable();
		decoratedTree = new ParseTreeProperty<Type>();
		error_count = 0;
	}

	/**
	 * Functie waarmee een fout aan de user gegeven wordt en het aantal fouten incrementeerd.
	 * @param msg, de foutmelding voor de gebruiker
	 * @param ctx, de plek in het programma waar de fout plaatsvond
	 */
	public void error(String msg, ParserRuleContext ctx)
	{
		error_count++;
		System.out.println("Error on line " + ctx.getStart().getLine() + ": "
				+ msg);
	}

	/**
	 * Start het checken van het programma.
	 * @param tree, boom van het programma gegenereerd door de slfParser
	 * @return een geannoteerde boom met extra informatie, this.decoratedTree
	 */
	public ParseTreeProperty<Type> start(ParseTree tree)
	{
		this.visit(tree);
		if (error_count > 0)
		{
			System.out.println("Compilation stopped. " + error_count
					+ " errors found.");
			System.exit(1);
		}
		return this.decoratedTree;
	}

	@Override
	public Type visitProgram(slfParser.ProgramContext ctx)
	{
		st.openScope();
		visitChildren(ctx);
		st.closeScope();
		return Type.VOID;
	}

	@Override
	public Type visitWhileStatementCommand(
			slfParser.WhileStatementCommandContext ctx)
	{
		return visit(ctx.while_statement());
	}

	@Override
	public Type visitExpressionCommand(slfParser.ExpressionCommandContext ctx)
	{
		Type type = visit(ctx.expression());
		decoratedTree.put(ctx, type);
		return type;
	}

	@Override
	public Type visitDeclarationCommand(slfParser.DeclarationCommandContext ctx)
	{
		return visit(ctx.declaration());
	}

	@Override
	public Type visitReturn_expression(slfParser.Return_expressionContext ctx)
	{
		return visit(ctx.expression());
	}

	@Override
	public Type visitWhile_statement(slfParser.While_statementContext ctx)
	{
		Type exp = visit(ctx.expression());
		if (exp != Type.BOOLEAN)
		{
			error("while-expression should be of type BOOLEAN. Type found: "+exp.toString(), ctx);
			return Type.ERROR;
		}
		else
		{
			st.openScope();
			for (slfParser.CommandContext cc : ctx.command())
			{
				visit(cc);
			}
			st.closeScope();
			return Type.VOID; // while-statement is always type void
		}
	}

	@Override
	public Type visitDeclaration(slfParser.DeclarationContext ctx)
	{
		Type type = visit(ctx.type());
		boolean constant = ctx.CONSTANT() != null;
		if (ctx.BECOMES() == null) // no assignment, only declaration
		{
			int err = 0;
			for (org.antlr.v4.runtime.tree.TerminalNode id : ctx.IDENTIFIER())
			{
				try
				{
					st.enter(id.getText(), new IdEntry(constant, type));
				}
				catch (SymbolTableException ste)
				{
					error(ste.getMessage(), ctx);
					err++;
				}
			}
			if (err > 0)
			{
				return Type.ERROR;
			}
			else
			{
				decoratedTree.put(ctx, type);
				return Type.VOID;
			}
		}
		else
		// declaration followed by assignment
		{
			for (org.antlr.v4.runtime.tree.TerminalNode id : ctx.IDENTIFIER())
			{
				try
				{
					st.enter(id.getText(), new IdEntry(constant, type));
					st.retrieve(id.getText()).initialize();
				}
				catch (SymbolTableException ste)
				{
					error(ste.getMessage(), ctx);
				}
			}
			Type exp = visit(ctx.expression());
			if (exp != type)
			{
				error("The expression is not of the right type. Type found: "+exp.toString()+". Type expected: "+type.toString(), ctx);
				return Type.ERROR;
			}
			else
			{
				decoratedTree.put(ctx, type);
				return Type.VOID;
			}
		}
	}
	
	@Override
	public Type visitClosedExpression(slfParser.ClosedExpressionContext ctx)
	{
		return visit(ctx.expression());
	}

	@Override
	public Type visitNegativeExpression(slfParser.NegativeExpressionContext ctx)
	{
		Type exp = visit(ctx.expression());
		if (exp != Type.INTEGER)
		{
			error("using negative requires one operand of type INTEGER. Type found: "+exp.toString(), ctx);
			return Type.ERROR;
		}
		else
		{
			return Type.INTEGER;
		}
	}

	@Override
	public Type visitNegateExpression(slfParser.NegateExpressionContext ctx)
	{
		Type exp = visit(ctx.expression());
		if (exp != Type.BOOLEAN)
		{
			error("negating requires one operand of type BOOLEAN. Type found: "+exp.toString(), ctx);
			return Type.ERROR;
		}
		else
		{
			return Type.BOOLEAN;
		}
	}

	@Override
	public Type visitMultiplyExpression(slfParser.MultiplyExpressionContext ctx)
	{
		Type exp1 = visit(ctx.expression(0));
		Type exp2 = visit(ctx.expression(1));
		if (exp1 != Type.INTEGER || exp2 != Type.INTEGER)
		{
			error("multiplication/division requires two operands of type INTEGER. Types found: "+exp1.toString()+" and "+exp2.toString(),
					ctx);
			return Type.ERROR;
		}
		else
		{
			return Type.INTEGER;
		}
	}

	@Override
	public Type visitAdditionExpression(slfParser.AdditionExpressionContext ctx)
	{
		Type exp1 = visit(ctx.expression(0));
		Type exp2 = visit(ctx.expression(1));
		if (exp1 == Type.INTEGER && exp2 == Type.INTEGER)
		{
			decoratedTree.put(ctx, Type.INTEGER);
			return Type.INTEGER;
		}
		else if (exp1 == Type.STRING && exp2 == Type.STRING && ctx.PLUS() != null)
		{
			decoratedTree.put(ctx, Type.STRING);
			return Type.STRING;
		}
		else
		{
			System.out.println(ctx.expression().size());
			error("add/substract requires two operands of type INTEGER. Types found: "+exp1.toString()+" and "+exp2.toString(), ctx);
			return Type.ERROR;
		}
	}

	@Override
	public Type visitCompareExpression(slfParser.CompareExpressionContext ctx)
	{
		Type exp1 = visit(ctx.expression(0));
		Type exp2 = visit(ctx.expression(1));
		if (exp1 != Type.INTEGER || exp2 != Type.INTEGER)
		{
			error("comparing requires two operands of type INTEGER. Types found: "+exp1.toString()+" and "+exp2.toString(), ctx);
			return Type.ERROR;
		}
		else
		{
			return Type.BOOLEAN;
		}
	}

	@Override
	public Type visitAndExpression(slfParser.AndExpressionContext ctx)
	{
		Type exp1 = visit(ctx.expression(0));
		Type exp2 = visit(ctx.expression(1));
		if (exp1 != Type.BOOLEAN || exp2 != Type.BOOLEAN)
		{
			error("AND-operator requires two operands of type BOOLEAN. Types found: "+exp1.toString()+" and "+exp2.toString(), ctx);
			return Type.ERROR;
		}
		else
		{
			return Type.BOOLEAN;
		}
	}

	@Override
	public Type visitOrExpression(slfParser.OrExpressionContext ctx)
	{
		Type exp1 = visit(ctx.expression(0));
		Type exp2 = visit(ctx.expression(1));
		if (exp1 != Type.BOOLEAN || exp2 != Type.BOOLEAN)
		{
			error("AND-operator requires two operands of type BOOLEAN. Types found: "+exp1.toString()+" and "+exp2.toString(), ctx);
			return Type.ERROR;
		}
		else
		{
			return Type.BOOLEAN;
		}
	}

	@Override
	public Type visitRead_expression(slfParser.Read_expressionContext ctx)
	{
		int err = 0;
		for (org.antlr.v4.runtime.tree.TerminalNode identifier : ctx
				.IDENTIFIER())
		{
			if (!st.exists(identifier.getText()))
			{
				err++;
			}
		}
		if (err > 0)
		{
			error("One of the identifiers was not declared yet.", ctx);
			return Type.ERROR;
		}
		else
		{
			// more than 1 parameter, thus type is void
			if (ctx.IDENTIFIER().size() > 1)
			{
				return Type.VOID;
			}
			else
			// one parameter, return type of parameter
			{
				return visit(ctx.IDENTIFIER(0));
			}
		}
	}

	@Override
	public Type visitPrint_expression(slfParser.Print_expressionContext ctx)
	{
		int err = 0;
		for (slfParser.ExpressionContext ec : ctx.expression())
		{
			Type ecType = visit(ec);
			decoratedTree.put(ec, ecType);
			if (ecType == Type.VOID || ecType == Type.ERROR)
			{
				err++;
			}
		}
		if (err > 0)
		{
			error("All print-expressions must have a non-void type.", ctx);
			return Type.ERROR;
		}
		else
		{
			// more than 1 parameter, thus type is void
			if (ctx.expression().size() > 1)
			{
				return Type.VOID;
			}
			else
			// one parameter, return type of parameter
			{
				return visit(ctx.getChild(2));
			}
		}
	}

	@Override
	public Type visitIf_expression(slfParser.If_expressionContext ctx)
	{
		Type exp = visit(ctx.expression());
		if (exp != Type.BOOLEAN)
		{
			error("if-expression should be of type boolean. Type found: "+exp.toString(), ctx);
			return Type.ERROR;
		}
		else
		{
			if (ctx.ELSE() != null) // check if else-clause
			{
				// scopes are opened and closed within the compound_expression
				Type comp_if = visit(ctx.compound_expression(0));
				Type comp_else = visit(ctx.compound_expression(1));
				if (comp_if == comp_else)
				{ // check if compound_expressions are of same type
					return comp_if;
				}
				else
				{
					return Type.VOID;
				}
			}
			else
			// no else-clause
			{
				visit(ctx.compound_expression(0)); // visit the if-compound
				return Type.VOID;
			}
		}
	}

	@Override
	public Type visitCompound_expression(
			slfParser.Compound_expressionContext ctx)
	{
		st.openScope();
		for (slfParser.CommandContext cc : ctx.command())
		{
			visit(cc);
		}
		Type type = visit(ctx.return_expression());
		st.closeScope();
		return type;
	}

	@Override
	public Type visitAssignment_expression(
			slfParser.Assignment_expressionContext ctx)
	{
		String identifier = ctx.IDENTIFIER().getText();
		if (!st.exists(identifier))
		{
			error("The variable " + identifier
					+ " was not declared before assignment.", ctx);
			return Type.ERROR;
		}
		else if (st.retrieve(identifier).getConstant()
				&& st.retrieve(identifier).getInitialized())
		{
			error("The variable is a constant and was already initialized.",
					ctx);
			return Type.ERROR;
		}
		else
		{
			Type exp = visit(ctx.expression());
			Type type = st.retrieve(identifier).getType();
			st.retrieve(identifier).initialize();
			if (exp == type)
			{
				decoratedTree.put(ctx, type);
				return type;
			}
			else
			{
				error("The assigned value is not of same type as " + identifier+". Type found: "+exp.toString()+". Type expected: "+type.toString(),
						ctx);
				return Type.ERROR;
			}
		}
	}

	@Override
	public Type visitLiteral_string(slfParser.Literal_stringContext ctx)
	{
		return Type.STRING;
	}

	@Override
	public Type visitLiteral_number(slfParser.Literal_numberContext ctx)
	{
		return Type.INTEGER;
	}

	@Override
	public Type visitLiteral_character(slfParser.Literal_characterContext ctx)
	{
		return Type.CHARACTER;
	}

	@Override
	public Type visitLiteral_boolean(slfParser.Literal_booleanContext ctx)
	{
		return Type.BOOLEAN;
	}

	@Override
	public Type visitString(slfParser.StringContext ctx)
	{
		return Type.STRING;
	}

	@Override
	public Type visitInt(slfParser.IntContext ctx)
	{
		return Type.INTEGER;
	}

	@Override
	public Type visitChar(slfParser.CharContext ctx)
	{
		return Type.CHARACTER;
	}

	@Override
	public Type visitBoolean(slfParser.BooleanContext ctx)
	{
		return Type.BOOLEAN;
	}

	@Override
	public Type visitIDENTIFIERExpression(
			slfParser.IDENTIFIERExpressionContext ctx)
	{
		String identifier = ctx.IDENTIFIER().getText();
		if (!st.exists(identifier))
		{
			error("The variable " + identifier + " was not declared yet.", ctx);
			return Type.ERROR;
		}
		else
		{
			decoratedTree.put(ctx, st.retrieve(identifier).getType());
			return st.retrieve(identifier).getType();
		}
	}
}