import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class slf {

	public static void main(String[] args) {
		System.out.println("**** Segerlan Fruity ****");

		InputStream is = System.in;
		String outputFile = "slf.class";

		if (args.length > 0) {
			String inputFile = args[0];
			try {
				is = new FileInputStream(inputFile);
			} catch (FileNotFoundException e) {
				System.out.println("File not found: ('" + inputFile + "').");
				System.out.println("Please ensure that this is a valid path, and that the compiler has read access.");
				System.exit(1);
			}
			
			// Remove extension; automatically added when writing the class
			outputFile = inputFile.replace(".slf", "");
		}

		// Now let's see what the classname will be... Remove the .class and anything before the last / or \
		String mainClassName = outputFile;
		
		String pathToFolder = outputFile.substring(0, outputFile.length() - mainClassName.length());

		CharStream input = new UnbufferedCharStream(is);

		// Start lexing
		slfLexer lexer = new slfLexer(input);
		lexer.setTokenFactory(new CommonTokenFactory(true));
		TokenStream tokens = new UnbufferedTokenStream<CommonToken>(lexer);

		// Start parsing
		slfParser parser = new slfParser(tokens);
		ParseTree tree = parser.program();

		System.out.println(tree.toStringTree(parser));

		slfChecker checker = new slfChecker();
		checker.start(tree);
		
		slfGenerator generator = new slfGenerator();
		String output = generator.start(tree);
		
		// TODO schrijf output naar outputFile
		
	}
}