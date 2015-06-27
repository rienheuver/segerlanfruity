/**
 * 
 * @author Sytse en Rien
 * Klasse voor het bijhouden van diverse gegevens van variabelen in een SymbolTable.
 */
public class IdEntry {
	/**
	 * De scope waarop deze variabele gedeclareerd is.
	 */
    private int  level = -1;
    /**
     * Boolean waarin staat of het een static variable is of niet
     */
    private boolean statisch;
    /**
     * Boolean waarin staat of de variabele al een waarde toegekend heeft gekregen
     */
    private boolean initialized = false;
    /**
     * Type van de variabele, opties: char, boolean, integer
     */
    private String type;

    /**
     * Constructor van de klasse. Hiermee wordt direct het type en de static-boolean vast gezet.
     * @param statisch true als de variabele statisch moet zijn, false als dat niet zo is
     * @param type van de variabele, opties; char, boolean, integer
     */
    public IdEntry(boolean statisch, String type)
    {
    	this.statisch = statisch;
    	this.type = type;
    }
    
    /**
     * Levert de booleanwaarde van statisch op
     * @return this.statisch, de waarde van de klassevariabele statisch
     * @pure
     */
    public boolean getStatisch()
    {
    	return this.statisch;
    }

    /**
     * Levert de String van het type op
     * @return this.type, de waarde van de klassevariabele type
     * @pure
     */
    public String getType()
    {
    	return this.type;
    }

    /**
     * Levert de boolean van de initialisatie op
     * @return this.initialized, de waarde van de klassevariabele initialized
     * @pure
     */
    public boolean getInitialized()
    {
        return this.initialized;
    }

    /**
     * Levert de scopelevel van de variabele op
     * @return this.level, de waarde van de klassevariabele level
     * @pure
     */
    public int   getLevel()             { return this.level;    }
    /**
     * Stelt de scopelevel van de variabele in
     * @param level, de scope waarop deze variabele gedeclareerd is
     * @pure
     */
    public void  setLevel(int level)    { this.level = level;   }
    /**
     * Zet de klassevariabele initialized op true.
     * @ensures this.initialized == true;
     */
    public void initialize()            { this.initialized = true; }
}