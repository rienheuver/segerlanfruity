//import SymbolTable.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.lang.*;

public class slfChecker extends slfBaseVisitor<Integer> {
	SymbolTable st = new SymbolTable();

	private ParseTreeProperty<Integer> decoratedTree;

	public static final Integer NUMBER = 0;
	public static final Integer CHARACTER = 1;
	public static final Integer BOOLEAN = 2;
	public static final Integer STRING = 3;

	public slfChecker() {}

	public ParseTreeProperty<Integer> start(ParseTree tree) {
		this.decoratedTree = new ParseTreeProperty<Integer>();
		this.visit(tree);
		return this.decoratedTree;
	}

	@Override public Integer visitAdditionExpression(slfParser.AdditionExpressionContext ctx) {
		Integer e1 = visit(ctx.getChild(0));
		Integer e2 = visit(ctx.getChild(2));
		if (e1 != NUMBER || e2 != NUMBER)
		{
			System.out.println("Typechecking error");
		}
		return NUMBER;
	}

	@Override public Integer visitLiteralExpression(slfParser.LiteralExpressionContext ctx) {
		switch(ctx.getStart().getType()) {
			case 35:
				return NUMBER;

			case 32:
				return STRING;

			case 31:
				return BOOLEAN;
			case 33:
				return CHARACTER;

			default:
				System.out.println("Wtf?");
				return 4;
		}
	}
}