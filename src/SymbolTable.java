import java.util.*;

/**
 * 
 * @author Sytse en Rien
 * Klasse die de declaraties van variabelen bijhoudt.
 *
 */
public class SymbolTable
{
	/**
	 * Mapping van variabele-identifiers naar stacks waarop IdEntry's staan voor iedere scope waarop deze variabele (opnieuw) gedeclareerd is
	 */
	private Map<String, Stack<IdEntry>> symtab;
	/**
	 * Per scope een stack waarop alle variabele-identifiers staan die op die scope gedeclareerd zijn.
	 */
	private Stack<Set<String>> scopeStack;
	

    /**
     * Constructor.
     * initialiseert de symboltable en de scopestack
     * @ensures  this.currentLevel() == -1
     */
    public SymbolTable()
    {
        symtab = new HashMap<String, Stack<IdEntry>>();
        scopeStack = new Stack<Set<String>>();
    }

    /**
     * Opens a new scope.
     * @ensures this.currentLevel() == old.currentLevel()+1;
     */
    public void openScope()
    {
        scopeStack.push(new HashSet<String>());
    }

    /**
     * Closes the current scope. All identifiers in
     * the current scope will be removed from the SymbolTable and
     * all IdEntry's responding to the variables that were declared in the current scope
     * will be popped from the stack responding to that variable in scopeStack
     * @requires old.currentLevel() > -1;
     * @ensures  this.currentLevel() == old.currentLevel()-1;
     */
    public void closeScope()
    {
        for (String var : scopeStack.peek())
        {
            symtab.get(var).pop();
        }
        scopeStack.pop();
    }

    /** Returns the current scope level. */
    public int currentLevel()
    {
        return scopeStack.size()-1;
    }

    /**
     * Enters an id together with an entry into this SymbolTable
     * using the current scope level. The entry's level is set to
     * currentLevel().
     * @requires id != null && id.length() > 0 && entry != null;
     * @ensures  this.retrieve(id).getLevel() == currentLevel();
     * @param id, the variable-identifier to declare
     * @param entry, the IdEntry corresponding to id on the current scope
     * @throws SymbolTableException when there is no valid
     *    current scope level, or when the id is already declared
     *    on the current level.
     */
    public void enter(String id, IdEntry entry) throws SymbolTableException
    {
        entry.setLevel(scopeStack.size()-1);
        if (scopeStack.peek().contains(id))
        {
            throw new SymbolTableException(id + "' already declared on the current level");
        }
        else
        {
            scopeStack.peek().add(id);
            if (symtab.get(id) != null)
            {
                symtab.get(id).push(entry);
            }
            else
            {
                Stack<IdEntry> s = new Stack<IdEntry>();
                s.push(entry);
                symtab.put(id, s);
            }
        }
    }

    /**
     * Get the IdEntry corresponding with id whose level is
     * the highest; in other words, that is defined last.
     * @param id, the variable-identifier to retrieve the IdEntry for
     * @return  IdEntry of this id on the highest level
     *          null if this SymbolTable does not contain id
     */

    public IdEntry retrieve(String id)
    {
        if (symtab.get(id) != null)
        {
            return symtab.get(id).peek();
        }
        else
        {
            return null;
        }
    }

    /**
     * returns a boolean for whether or not id is declared on the current or an underlying scope
     * @param id, the variable-identifier
     * @return a boolean. If id is declared on this scope or an underlying one, it's true, otherwise it's false.
     */
    public boolean exists(String id)
    {
        return symtab.get(id) != null && symtab.get(id).peek().getLevel() <= currentLevel();
    }
}