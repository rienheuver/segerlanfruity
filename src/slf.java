import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class slf {

	public static void main(String[] args) {
		System.out.println("**** Segerlan Fruity ****");

		if (args.length > 0) {
			String inputFile = args[0];
			InputStream is = System.in;
			try {
				is = new FileInputStream(inputFile);
			} catch (FileNotFoundException e) {
				System.out.println("File not found: ('" + inputFile + "').");
				System.out.println("Please ensure that this is a valid path, and that the compiler has read access.");
				System.exit(1);
			}
			
			String outputFile = inputFile.replace(".slf", ".j");
			String outputFileLocation = "jasmins/"+outputFile;
			String className = inputFile.replace(".slf", "");			
			
			if (className.contains("/"))
			{
				className = className.substring(className.lastIndexOf('/')+1);
			}

			CharStream input = new UnbufferedCharStream(is);
			
			System.out.println("Start lexing...");
			// Start lexing
			slfLexer lexer = new slfLexer(input);
			lexer.setTokenFactory(new CommonTokenFactory(true));
			TokenStream tokens = new UnbufferedTokenStream<CommonToken>(lexer);
			
			System.out.println("Start parsing...");
			// Start parsing
			slfParser parser = new slfParser(tokens);
			ParseTree tree = parser.program();
	
			System.out.println("Start checking...");
	
			slfChecker checker = new slfChecker();
			ParseTreeProperty<Type> decoratedTree = checker.start(tree);
			
			System.out.println("Start generating...");
			slfGenerator generator = new slfGenerator(className);
			String output = generator.start(decoratedTree, tree);
			
			
			try
			{
				PrintWriter pw = new PrintWriter(outputFileLocation);
				pw.write(output);
				pw.close();
			}
			catch (FileNotFoundException ex)
			{
				System.out.println(ex.getMessage());
			}
			
			String[] arguments = {"-d","classes",outputFileLocation};
			
			// Write bytecode to file in folder /classes
			jasmin.Main.main(arguments);
			System.out.println("File compiled. You can find it in /classes and run it from that folder by typing:");
			System.out.println("java "+className);
		}
		
	}
}