import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class slfChecker extends slfBaseVisitor<Integer>
{
	SymbolTable st = new SymbolTable();

	private ParseTreeProperty<Integer> decoratedTree;

	public slfChecker() {}

	public ParseTreeProperty<Integer> start(ParseTree tree)
	{
		this.decoratedTree = new ParseTreeProperty<Integer>();
		this.visit(tree);
		return this.decoratedTree;
	}

	@Override public Integer visitAdditionExpression(slfParser.AdditionExpressionContext ctx)
	{
		int exp1 = visit(ctx.expression(0));
		int exp2 = visit(ctx.expression(1));
		if (exp1 != Type.NUMBER || exp2 != Type.NUMBER)
		{
			System.out.println("add/substract requires two operands of type number");
			return Type.ERROR;
		}
		else
		{
			return Type.NUMBER;
		}
	}
	
	@Override public Integer visitIf_expression(slfParser.If_expressionContext ctx)
	{
		int exp = visit(ctx.expression());
		if (exp != Type.BOOLEAN)
		{
			System.out.println("if-expression should be of type boolean");
			return Type.ERROR;
		}
		else
		{
			if (ctx.ELSE() != null) // check if else-clause
			{
				Integer comp_if = visit(ctx.compound_expression(0));
				Integer comp_else = visit(ctx.compound_expression(1));
				if (comp_if == comp_else) // check if compound_expressions are of same type
				{
					return comp_if;
				}
				else // 
				{
					return Type.VOID;
				}
			}
			else // no else-clause
			{
				return Type.VOID;
			}
		}
	}
	
	@Override public Integer visitRead_expression(slfParser.Read_expressionContext ctx) {
		if (ctx.IDENTIFIER().size()>1) // more than 1 parameter, thus type is void
		{
			return Type.VOID;
		}
		else // one parameter, return type of parameter
		{
			return visit(ctx.IDENTIFIER(0));
		}
	}
	
	@Override public Integer visitPrint_expression(slfParser.Print_expressionContext ctx) {
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
			System.out.println("All print-expressions must have a non-void type");
			return Type.ERROR;
		}
		else
		{
			if (ctx.expression().size()>1) // more than 1 parameter, thus type is void
			{
				return Type.VOID;
			}
			else // one parameter, return type of parameter
			{
				return visit(ctx.getChild(2));
			}
		}
	}
	
	@Override public Integer visitAssignment_expression(slfParser.Assignment_expressionContext ctx) {
		String identifier = ctx.IDENTIFIER().getText();
		int type = st.retrieve(identifier).getType();
		if (st.exists(identifier))
		{
			System.out.println("The variable "+identifier+" was not declared before assignment.");
			return Type.ERROR;
		}
		else
		{
			int exp = visit(ctx.expression());
			if (exp == type)
			{
				return type;
			}
			else
			{
				System.out.println("The assigned value is not of same type as "+identifier);
				return Type.ERROR;
			}
		}
	}
	
	@Override public Integer visitDeclaration(slfParser.DeclarationContext ctx) {
		int type = visit(ctx.TYPE());
		if (ctx.BECOMES() == null) // no assignment, only declaration
		{
			int err = 0;
			boolean constant = ctx.CONSTANT() != null;
			for (org.antlr.v4.runtime.tree.TerminalNode id : ctx.IDENTIFIER())
			{
				System.out.println(id.getText());
				try {
					st.enter(id.getText(), new IdEntry(constant, type));
				}
				catch (SymbolTableException ste)
				{
					System.out.println(ste.getMessage());
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
		else // declaration followed by assignment
		{
			int exp = visit(ctx.expression());
			if (exp != type)
			{
				System.out.println("The expression is not of the right type.");
				return Type.ERROR;
			}
			else
			{
				return Type.VOID;
			}
		}
	}

	@Override public Integer visitString(slfParser.StringContext ctx) {
		return Type.STRING;
	}
	
	@Override public Integer visitNumber(slfParser.NumberContext ctx) {
		return Type.NUMBER;
	}
	
	@Override public Integer visitCharacter(slfParser.CharacterContext ctx) {
		return Type.CHARACTER;
	}
	
	@Override public Integer visitBoolean(slfParser.BooleanContext ctx) {
		return Type.BOOLEAN;
	}

	@Override public Integer visitIDENTIFIERExpression(slfParser.IDENTIFIERExpressionContext ctx)
	{
		String identifier = ctx.IDENTIFIER().getText();
		return st.retrieve(identifier).getType();
	}
}