public class Type {
	private int type;

	public static final Integer NUMBER = 0;
	public static final Integer CHARACTER = 1;
	public static final Integer BOOLEAN = 2;
	public static final Integer STRING = 3;
	public static final Integer VOID = 4;
	public static final Integer ERROR = 5;

	public Type(int value) {
		this.type = value;
	}

	public int getType() {
		return this.type;
	}
}