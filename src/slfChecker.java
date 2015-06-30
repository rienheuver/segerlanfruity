import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class slfChecker extends slfBaseVisitor<Type>
{
	private SymbolTable st;
	private int error_count;

	public slfChecker()
	{
		st = new SymbolTable();
		error_count = 0;
	}
	
	public void error(String msg, ParserRuleContext ctx)
	{
		error_count++;
		System.out.println("Error on line "+ctx.getStart().getLine()+": "+msg);
	}

	public int start(ParseTree tree)
	{
		this.visit(tree);
		return error_count;
	}

	@Override
	public Type visitWhile_statement(slfParser.While_statementContext ctx)
	{
		Type exp = visit(ctx.expression());
		if (exp != Type.BOOLEAN)
		{
			error("while-expression should be of type BOOLEAN",ctx);
			return Type.ERROR;
		}
		else
		{
			visit(ctx.compound_expression());
			return Type.VOID; // while-statement is always type void
		}
	}

	@Override
	public Type visitDeclaration(slfParser.DeclarationContext ctx)
	{
		Type type = visit(ctx.type());
		if (ctx.BECOMES() == null) // no assignment, only declaration
		{
			int err = 0;
			boolean constant = ctx.CONSTANT() != null;
			for (org.antlr.v4.runtime.tree.TerminalNode id : ctx.IDENTIFIER())
			{
				try
				{
					st.enter(id.getText(), new IdEntry(constant, type));
				}
				catch (SymbolTableException ste)
				{
					error(ste.getMessage(),ctx);
					err++;
				}
			}
			if (err > 0)
			{
				return Type.ERROR;
			}
			else
			{
				return Type.VOID;
			}
		}
		else
		// declaration followed by assignment
		{
			Type exp = visit(ctx.expression());
			if (exp != type)
			{
				error("The expression is not of the right type.",ctx);
				return Type.ERROR;
			}
			else
			{
				return Type.VOID;
			}
		}
	}

	@Override
	public Type visitNegativeExpression(
			slfParser.NegativeExpressionContext ctx)
	{
		Type exp = visit(ctx.expression());
		if (exp != Type.INTEGER)
		{
			error("using negative requires one operand of type INTEGER",ctx);
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
			error("negating requires one operand of type BOOLEAN",ctx);
			return Type.ERROR;
		}
		else
		{
			return Type.BOOLEAN;
		}
	}

	@Override
	public Type visitMultiplyExpression(
			slfParser.MultiplyExpressionContext ctx)
	{
		Type exp1 = visit(ctx.expression(0));
		Type exp2 = visit(ctx.expression(1));
		if (exp1 != Type.INTEGER || exp2 != Type.INTEGER)
		{
			error("multiplication/division requires two operands of type INTEGER",ctx);
			return Type.ERROR;
		}
		else
		{
			return Type.INTEGER;
		}
	}

	@Override
	public Type visitAdditionExpression(
			slfParser.AdditionExpressionContext ctx)
	{
		Type exp1 = visit(ctx.expression(0));
		Type exp2 = visit(ctx.expression(1));
		if (exp1 != Type.INTEGER || exp2 != Type.INTEGER)
		{
			error("add/substract requires two operands of type INTEGER",ctx);
			return Type.ERROR;
		}
		else
		{
			return Type.INTEGER;
		}
	}

	@Override
	public Type visitCompareExpression(slfParser.CompareExpressionContext ctx)
	{
		Type exp1 = visit(ctx.expression(0));
		Type exp2 = visit(ctx.expression(1));
		if (exp1 != Type.BOOLEAN || exp2 != Type.BOOLEAN)
		{
			error("comparing requires two operands of type BOOLEAN",ctx);
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
			error("AND-operator requires two operands of type BOOLEAN",ctx);
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
			error("AND-operator requires two operands of type BOOLEAN",ctx);
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

	@Override
	public Type visitPrint_expression(slfParser.Print_expressionContext ctx)
	{
		int err = 0;
		for (slfParser.ExpressionContext ec : ctx.expression())
		{
			if (visit(ec) == Type.VOID || visit(ec) == Type.ERROR)
			{
				err++;
			}
		}
		if (err > 0)
		{
			error("All print-expressions must have a non-void type",ctx);
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
			error("if-expression should be of type boolean",ctx);
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
		Type type = Type.ERROR;
		for (slfParser.CommandContext cc : ctx.command())
		{
			type = visit(cc);
		}
		st.closeScope();
		return type;
	}

	@Override
	public Type visitAssignment_expression(
			slfParser.Assignment_expressionContext ctx)
	{
		String identifier = ctx.IDENTIFIER().getText();
		Type type = st.retrieve(identifier).getType();
		if (st.exists(identifier))
		{
			error("The variable " + identifier + " was not declared before assignment.",ctx);
			return Type.ERROR;
		}
		else
		{
			Type exp = visit(ctx.expression());
			if (exp == type)
			{
				return type;
			}
			else
			{
				error("The assigned value is not of same type as " + identifier,ctx);
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
			error("The variable " + identifier	+ " was not declared yet.",ctx);
			return Type.ERROR;
		}
		else
		{
			return st.retrieve(identifier).getType();
		}
	}
}