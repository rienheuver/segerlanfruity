import org.antlr.v4.runtime.tree.ParseTree;

public class slfGenerator extends slfBaseVisitor<String>
{
	
	// TODO iets met scopes zodat je variabelen in een nieuwe scope opnieuw kan declareren
	// ofwel door een nieuwe symboltable te bouwen, of door toch een annotated tree te maken in de checker
	
	public slfGenerator()
	{
	}
	
	public String start(ParseTree tree)
	{
		return this.visit(tree);
	}
	
	@Override public String visitProgram(slfParser.ProgramContext ctx) {
		// start of .j file
		// visitchildren
		// end of .j file
		return "";
	}
	
}