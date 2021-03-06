/**
 * Klasse voor het bijhouden van diverse gegevens van variabelen in een SymbolTable.
 * @author Sytse Hartvelt en Rien Heuver
 */
public class IdEntry
{
	/**
	 * De scope waarop deze variabele gedeclareerd is.
	 */
	private int level = -1;
	/**
	 * Boolean waarin staat of het een constant variable is of niet
	 */
	private boolean constant;
	/**
	 * Boolean waarin staat of de variabele al een waarde toegekend heeft
	 * gekregen
	 */
	private boolean initialized = false;
	/**
	 * Type van de variabele, opties: char, boolean, integer
	 */
	private Type type;

	/**
	 * Het memory-id waarmee hij in de generator opgeslagen en geladen kan worden
	 */
	private int mem_id;

	/**
	 * Constructor van de klasse. Hiermee wordt direct het type en de
	 * constant-boolean vast gezet.
	 * 
	 * @param constant
	 *            true als de variabele constant moet zijn, false als dat niet
	 *            zo is
	 * @param type
	 *            van de variabele
	 */
	public IdEntry(boolean constant, Type type)
	{
		this.constant = constant;
		this.type = type;
	}

	/**
	 * Levert de boolse waarde van constant op
	 * 
	 * @return this.constant, de waarde van de klassevariabele constant
	 * @pure
	 */
	public boolean getConstant()
	{
		return this.constant;
	}

	/**
	 * Levert het type op
	 * 
	 * @return this.type, de waarde van de klassevariabele type
	 * @pure
	 */
	public Type getType()
	{
		return this.type;
	}

	/**
	 * Levert de boolean van de initialisatie op
	 * 
	 * @return this.initialized, de waarde van de klassevariabele initialized
	 * @pure
	 */
	public boolean getInitialized()
	{
		return this.initialized;
	}

	/**
	 * Levert de scopelevel van de variabele op
	 * 
	 * @return this.level, de waarde van de klassevariabele level
	 * @pure
	 */
	public int getLevel()
	{
		return this.level;
	}

	/**
	 * Stelt de scopelevel van de variabele in
	 * 
	 * @param level,
	 *            de scope waarop deze variabele gedeclareerd is
	 * @pure
	 */
	public void setLevel(int level)
	{
		this.level = level;
	}

	/**
	 * Levert het memory-id van de variabele op
	 * 
	 * @return this.mem_id, de waarde van de klassevariabele mem_id
	 * @pure
	 */
	public int getMemId()
	{
		return this.mem_id;
	}

	/**
	 * Stelt het memory-id van de variabele in
	 * 
	 * @param id,
	 *            het id waarin het in locals staat in de jvm
	 * @pure
	 */
	public void setMemId(int id)
	{
		this.mem_id = id;
	}

	/**
	 * Zet de klassevariabele initialized op true.
	 * 
	 * @ensures this.initialized == true;
	 */
	public void initialize()
	{
		this.initialized = true;
	}
}