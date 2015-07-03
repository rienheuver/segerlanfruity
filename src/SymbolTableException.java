/**
 * Klasse voor de exceptie die gebruikt wordt door SymbolTable
 * @author Sytse Hartvelt en Rien Heuver
 *
 */
public class SymbolTableException extends Exception {
    /**
     * {@link serialVersionUID} is vereist voor Serializable
     */
    public static final long serialVersionUID = 24362462L;
    /**
     * Een exceptie die gebruikt wordt in SymbolTable
     */
    public SymbolTableException(String msg) { super(msg); }
}