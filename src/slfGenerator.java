import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class slfGenerator extends slfBaseVisitor<String>
{
	private String filename;
	private SymbolTable st;
	private ParseTreeProperty<Type> decoratedTree;
	private int var_counter = 0;

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
				out = addCommand("istore "+i);
				break;
				
			case STRING:
				out = addCommand("astore "+i);
				break;
				
			default:
				out = "";
				break;				
		}
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

		st.openScope();
		for (slfParser.CommandContext cc : ctx.command())
		{
			out += visit(cc);
		}
		st.closeScope();

		out += addCommand("  return");
		out += addCommand(".end method");
		return out;
	}
	
	/*@Override
	public String visitCommand(slfParser.CommandContext ctx) {
		return visitChildren(ctx);
	}*/

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
	public String visitLiteral_number(slfParser.Literal_numberContext ctx) {
		String integer = ctx.LITERALNUMBER().getText();
		return addCommand("bipush "+integer);
	}

}