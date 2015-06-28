public class SymbolTableException extends Exception {
    /**
     * {@link serialVersionUID} is required for Serializable
     */
    public static final long serialVersionUID = 24362462L;
    /**
     * An exception for usage in SymbolTable
     */
    public SymbolTableException(String msg) { super(msg); }
}