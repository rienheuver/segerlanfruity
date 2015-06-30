// Generated from slfLexer.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class slfLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BECOMES=1, PLUS=2, MINUS=3, TIMES=4, DIVIDE=5, MODULO=6, EQUALS=7, LT=8, 
		LTE=9, GT=10, GTE=11, UNEQUALS=12, AND=13, OR=14, NOT=15, CONSTANT=16, 
		PRINT=17, READ=18, IF=19, THEN=20, ELSE=21, WHILE=22, INT=23, CHAR=24, 
		BOOLEAN=25, STRING=26, COLON=27, SEMICOLON=28, OPAREN=29, CPAREN=30, OCURLY=31, 
		CCURLY=32, COMMA=33, LITERALBOOLEAN=34, LITERALSTRING=35, LITERALCHARACTER=36, 
		LITERALNUMBER=37, IDENTIFIER=38, COMMENT=39, WS=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('"
	};
	public static final String[] ruleNames = {
		"BECOMES", "PLUS", "MINUS", "TIMES", "DIVIDE", "MODULO", "EQUALS", "LT", 
		"LTE", "GT", "GTE", "UNEQUALS", "AND", "OR", "NOT", "CONSTANT", "PRINT", 
		"READ", "IF", "THEN", "ELSE", "WHILE", "INT", "CHAR", "BOOLEAN", "STRING", 
		"COLON", "SEMICOLON", "OPAREN", "CPAREN", "OCURLY", "CCURLY", "COMMA", 
		"LITERALBOOLEAN", "LITERALSTRING", "LITERALCHARACTER", "LITERALNUMBER", 
		"IDENTIFIER", "COMMENT", "WS", "DIGIT", "LETTER"
	};


	public slfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "slfLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u010e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00d2"+
		"\n#\3$\3$\3$\3$\3$\3$\7$\u00da\n$\f$\16$\u00dd\13$\3$\3$\3%\3%\3%\3%\7"+
		"%\u00e5\n%\f%\16%\u00e8\13%\3%\3%\3&\6&\u00ed\n&\r&\16&\u00ee\3\'\3\'"+
		"\3\'\7\'\u00f4\n\'\f\'\16\'\u00f7\13\'\3(\3(\3(\3(\7(\u00fd\n(\f(\16("+
		"\u0100\13(\3(\3(\3)\6)\u0105\n)\r)\16)\u0106\3)\3)\3*\3*\3+\3+\4\u00db"+
		"\u00e6\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2\3\2\5\4\2\f\f\17\17\5\2\13\f"+
		"\17\17\"\"\4\2C\\c|\u0116\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\r"+
		"a\3\2\2\2\17c\3\2\2\2\21f\3\2\2\2\23h\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2"+
		"\31p\3\2\2\2\33s\3\2\2\2\35v\3\2\2\2\37y\3\2\2\2!{\3\2\2\2#\u0084\3\2"+
		"\2\2%\u008a\3\2\2\2\'\u008f\3\2\2\2)\u0092\3\2\2\2+\u0097\3\2\2\2-\u009c"+
		"\3\2\2\2/\u00a2\3\2\2\2\61\u00a6\3\2\2\2\63\u00ab\3\2\2\2\65\u00b3\3\2"+
		"\2\2\67\u00ba\3\2\2\29\u00bc\3\2\2\2;\u00be\3\2\2\2=\u00c0\3\2\2\2?\u00c2"+
		"\3\2\2\2A\u00c4\3\2\2\2C\u00c6\3\2\2\2E\u00d1\3\2\2\2G\u00d3\3\2\2\2I"+
		"\u00e0\3\2\2\2K\u00ec\3\2\2\2M\u00f0\3\2\2\2O\u00f8\3\2\2\2Q\u0104\3\2"+
		"\2\2S\u010a\3\2\2\2U\u010c\3\2\2\2WX\7?\2\2X\4\3\2\2\2YZ\7-\2\2Z\6\3\2"+
		"\2\2[\\\7/\2\2\\\b\3\2\2\2]^\7,\2\2^\n\3\2\2\2_`\7\61\2\2`\f\3\2\2\2a"+
		"b\7\'\2\2b\16\3\2\2\2cd\7?\2\2de\7?\2\2e\20\3\2\2\2fg\7>\2\2g\22\3\2\2"+
		"\2hi\7>\2\2ij\7?\2\2j\24\3\2\2\2kl\7@\2\2l\26\3\2\2\2mn\7@\2\2no\7?\2"+
		"\2o\30\3\2\2\2pq\7#\2\2qr\7?\2\2r\32\3\2\2\2st\7(\2\2tu\7(\2\2u\34\3\2"+
		"\2\2vw\7~\2\2wx\7~\2\2x\36\3\2\2\2yz\7#\2\2z \3\2\2\2{|\7e\2\2|}\7q\2"+
		"\2}~\7p\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081\7c\2\2\u0081\u0082"+
		"\7p\2\2\u0082\u0083\7v\2\2\u0083\"\3\2\2\2\u0084\u0085\7r\2\2\u0085\u0086"+
		"\7t\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7v\2\2\u0089"+
		"$\3\2\2\2\u008a\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7f\2\2\u008e&\3\2\2\2\u008f\u0090\7k\2\2\u0090\u0091\7h\2\2\u0091"+
		"(\3\2\2\2\u0092\u0093\7v\2\2\u0093\u0094\7j\2\2\u0094\u0095\7g\2\2\u0095"+
		"\u0096\7p\2\2\u0096*\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b,\3\2\2\2\u009c\u009d\7y\2\2\u009d"+
		"\u009e\7j\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7g\2\2"+
		"\u00a1.\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2"+
		"\2\u00a5\60\3\2\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9"+
		"\7c\2\2\u00a9\u00aa\7t\2\2\u00aa\62\3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b2\7p\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\7u\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2"+
		"\u00b8\u00b9\7i\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7<\2\2\u00bb8\3\2\2\2"+
		"\u00bc\u00bd\7=\2\2\u00bd:\3\2\2\2\u00be\u00bf\7*\2\2\u00bf<\3\2\2\2\u00c0"+
		"\u00c1\7+\2\2\u00c1>\3\2\2\2\u00c2\u00c3\7}\2\2\u00c3@\3\2\2\2\u00c4\u00c5"+
		"\7\177\2\2\u00c5B\3\2\2\2\u00c6\u00c7\7.\2\2\u00c7D\3\2\2\2\u00c8\u00c9"+
		"\7v\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7w\2\2\u00cb\u00d2\7g\2\2\u00cc"+
		"\u00cd\7h\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7u\2\2"+
		"\u00d0\u00d2\7g\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2F\3\2"+
		"\2\2\u00d3\u00db\7$\2\2\u00d4\u00d5\7^\2\2\u00d5\u00da\7$\2\2\u00d6\u00d7"+
		"\7^\2\2\u00d7\u00da\7^\2\2\u00d8\u00da\n\2\2\2\u00d9\u00d4\3\2\2\2\u00d9"+
		"\u00d6\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\7$\2\2\u00dfH\3\2\2\2\u00e0\u00e6\7)\2\2\u00e1\u00e2\7^\2\2\u00e2"+
		"\u00e5\7)\2\2\u00e3\u00e5\n\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7)\2\2\u00eaJ\3\2\2\2\u00eb"+
		"\u00ed\5S*\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2"+
		"\2\u00ee\u00ef\3\2\2\2\u00efL\3\2\2\2\u00f0\u00f5\5U+\2\u00f1\u00f4\5"+
		"U+\2\u00f2\u00f4\5S*\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6N\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fe\3"+
		"\2\2\2\u00fb\u00fd\n\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0102\b(\2\2\u0102P\3\2\2\2\u0103\u0105\t\3\2\2\u0104\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\b)\2\2\u0109R\3\2\2\2\u010a\u010b\4\62;\2\u010b"+
		"T\3\2\2\2\u010c\u010d\t\4\2\2\u010dV\3\2\2\2\r\2\u00d1\u00d9\u00db\u00e4"+
		"\u00e6\u00ee\u00f3\u00f5\u00fe\u0106\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}