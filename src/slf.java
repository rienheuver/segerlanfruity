import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

/**
 * Klasse die voor het lexen, parsen, checken en generen, oftewel compileren, van Seger Lan Fruity-programma's.
 * @author Sytse Hartvelt en Rien Heuver
 *
 */
public class slf {

	/**
	 * De functie die het gehele compilatieproces in gang zet.
	 * @param args, het eerste argument is het programma wat gecompileert dient te worden. Er zijn geen verdere argumenten.
	 */
	public static void main(String[] args) {
		System.out.println("**** Seger Lan Fruity ****");

		if (args.length > 0) { // minstens 1 argument
			String inputFile = args[0];
			InputStream is = System.in;
			try {
				is = new FileInputStream(inputFile);
			} catch (FileNotFoundException e) {
				System.out.println("Bestand niet gevonden: ('" + inputFile + "').");
				System.out.println("Zorg ervoor dat het pad naar het bestand klopt en dat Seger Lan Fruity leesrechten heeft.");
				System.exit(1);
			}
			
			String outputFile = inputFile.replace(".slf", ".j"); // bestandsextensie vervangen
			if (outputFile.contains("/")) // als het pad naar het bestand een map bevat, de rest van het pad weghalen van de naam
			{
				outputFile = outputFile.substring(outputFile.lastIndexOf('/')+1);
			}
			
			new File("jasmins").mkdir();
			
			String outputFileLocation = "jasmins/"+outputFile; // opslaglocatie van het jasmin-tussenbestand
			String className = outputFile.replace(".j", ""); // classname zoals die gebruikt zal worden als naam van de klasse van het programma

			CharStream input = new UnbufferedCharStream(is);
			
			System.out.println("Start lexen...");
			// Start lexen
			slfLexer lexer = new slfLexer(input);
			lexer.setTokenFactory(new CommonTokenFactory(true));
			TokenStream tokens = new UnbufferedTokenStream<CommonToken>(lexer);
			
			System.out.println("Start parsen...");
			// Start parsen
			slfParser parser = new slfParser(tokens);
			ParseTree tree = parser.program();
			
			int parse_errors = parser.getNumberOfSyntaxErrors();
			if (parse_errors>0)
			{
				System.out.println(parse_errors+" errors gevonden tijdens het parsen.");
				System.exit(1);
			}
	
			System.out.println("Start checken...");
			// Start checken
			slfChecker checker = new slfChecker();
			ParseTreeProperty<Type> decoratedTree = checker.start(tree);
			
			System.out.println("Start genereren...");
			// Start genereren
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
			
			// Schrijf bytecode naar bestand in map /classes
			jasmin.Main.main(arguments);
			System.out.println("Programma gecompileerd. Je kunt hem vinden in /classes en hem draaien vanaf die map door het volgende commando te gebruiken:");
			System.out.println("java "+className);
		}
		
	}
}