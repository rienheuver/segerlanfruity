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
		PRINT=17, READ=18, IF=19, THEN=20, ELSE=21, WHILE=22, TYPE=23, COLON=24, 
		SEMICOLON=25, OPAREN=26, CPAREN=27, OCURLY=28, CCURLY=29, COMMA=30, BOOLEAN=31, 
		STRING=32, CHARACTER=33, IDENTIFIER=34, NUMBER=35, COMMENT=36, WS=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'"
	};
	public static final String[] ruleNames = {
		"BECOMES", "PLUS", "MINUS", "TIMES", "DIVIDE", "MODULO", "EQUALS", "LT", 
		"LTE", "GT", "GTE", "UNEQUALS", "AND", "OR", "NOT", "CONSTANT", "PRINT", 
		"READ", "IF", "THEN", "ELSE", "WHILE", "TYPE", "COLON", "SEMICOLON", "OPAREN", 
		"CPAREN", "OCURLY", "CCURLY", "COMMA", "BOOLEAN", "STRING", "CHARACTER", 
		"IDENTIFIER", "NUMBER", "COMMENT", "WS", "DIGIT", "LETTER"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0106\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00b1\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00ca\n \3!\3"+
		"!\3!\3!\3!\3!\7!\u00d2\n!\f!\16!\u00d5\13!\3!\3!\3\"\3\"\3\"\3\"\7\"\u00dd"+
		"\n\"\f\"\16\"\u00e0\13\"\3\"\3\"\3#\3#\3#\7#\u00e7\n#\f#\16#\u00ea\13"+
		"#\3$\6$\u00ed\n$\r$\16$\u00ee\3%\3%\3%\3%\7%\u00f5\n%\f%\16%\u00f8\13"+
		"%\3%\3%\3&\6&\u00fd\n&\r&\16&\u00fe\3&\3&\3\'\3\'\3(\3(\4\u00d3\u00de"+
		"\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M\2O\2\3\2\5\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4"+
		"\2C\\c|\u0111\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\t"+
		"W\3\2\2\2\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21`\3\2\2\2\23b\3\2\2\2\25"+
		"e\3\2\2\2\27g\3\2\2\2\31j\3\2\2\2\33m\3\2\2\2\35p\3\2\2\2\37s\3\2\2\2"+
		"!u\3\2\2\2#~\3\2\2\2%\u0084\3\2\2\2\'\u0089\3\2\2\2)\u008c\3\2\2\2+\u0091"+
		"\3\2\2\2-\u0096\3\2\2\2/\u00b0\3\2\2\2\61\u00b2\3\2\2\2\63\u00b4\3\2\2"+
		"\2\65\u00b6\3\2\2\2\67\u00b8\3\2\2\29\u00ba\3\2\2\2;\u00bc\3\2\2\2=\u00be"+
		"\3\2\2\2?\u00c9\3\2\2\2A\u00cb\3\2\2\2C\u00d8\3\2\2\2E\u00e3\3\2\2\2G"+
		"\u00ec\3\2\2\2I\u00f0\3\2\2\2K\u00fc\3\2\2\2M\u0102\3\2\2\2O\u0104\3\2"+
		"\2\2QR\7?\2\2R\4\3\2\2\2ST\7-\2\2T\6\3\2\2\2UV\7/\2\2V\b\3\2\2\2WX\7,"+
		"\2\2X\n\3\2\2\2YZ\7\61\2\2Z\f\3\2\2\2[\\\7\'\2\2\\\16\3\2\2\2]^\7?\2\2"+
		"^_\7?\2\2_\20\3\2\2\2`a\7>\2\2a\22\3\2\2\2bc\7>\2\2cd\7?\2\2d\24\3\2\2"+
		"\2ef\7@\2\2f\26\3\2\2\2gh\7@\2\2hi\7?\2\2i\30\3\2\2\2jk\7#\2\2kl\7?\2"+
		"\2l\32\3\2\2\2mn\7(\2\2no\7(\2\2o\34\3\2\2\2pq\7~\2\2qr\7~\2\2r\36\3\2"+
		"\2\2st\7#\2\2t \3\2\2\2uv\7e\2\2vw\7q\2\2wx\7p\2\2xy\7u\2\2yz\7v\2\2z"+
		"{\7c\2\2{|\7p\2\2|}\7v\2\2}\"\3\2\2\2~\177\7r\2\2\177\u0080\7t\2\2\u0080"+
		"\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083$\3\2\2\2\u0084"+
		"\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\7c\2\2\u0087\u0088\7f\2\2"+
		"\u0088&\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7h\2\2\u008b(\3\2\2\2\u008c"+
		"\u008d\7v\2\2\u008d\u008e\7j\2\2\u008e\u008f\7g\2\2\u008f\u0090\7p\2\2"+
		"\u0090*\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2"+
		"\2\u0094\u0095\7g\2\2\u0095,\3\2\2\2\u0096\u0097\7y\2\2\u0097\u0098\7"+
		"j\2\2\u0098\u0099\7k\2\2\u0099\u009a\7n\2\2\u009a\u009b\7g\2\2\u009b."+
		"\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u00b1\7v\2\2\u009f"+
		"\u00a0\7e\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7c\2\2\u00a2\u00b1\7t\2\2"+
		"\u00a3\u00a4\7d\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7"+
		"\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7c\2\2\u00a9\u00b1\7p\2\2\u00aa"+
		"\u00ab\7u\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7k\2\2"+
		"\u00ae\u00af\7p\2\2\u00af\u00b1\7i\2\2\u00b0\u009c\3\2\2\2\u00b0\u009f"+
		"\3\2\2\2\u00b0\u00a3\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b1\60\3\2\2\2\u00b2"+
		"\u00b3\7<\2\2\u00b3\62\3\2\2\2\u00b4\u00b5\7=\2\2\u00b5\64\3\2\2\2\u00b6"+
		"\u00b7\7*\2\2\u00b7\66\3\2\2\2\u00b8\u00b9\7+\2\2\u00b98\3\2\2\2\u00ba"+
		"\u00bb\7}\2\2\u00bb:\3\2\2\2\u00bc\u00bd\7\177\2\2\u00bd<\3\2\2\2\u00be"+
		"\u00bf\7.\2\2\u00bf>\3\2\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7w\2\2\u00c3\u00ca\7g\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7c\2\2"+
		"\u00c6\u00c7\7n\2\2\u00c7\u00c8\7u\2\2\u00c8\u00ca\7g\2\2\u00c9\u00c0"+
		"\3\2\2\2\u00c9\u00c4\3\2\2\2\u00ca@\3\2\2\2\u00cb\u00d3\7$\2\2\u00cc\u00cd"+
		"\7^\2\2\u00cd\u00d2\7$\2\2\u00ce\u00cf\7^\2\2\u00cf\u00d2\7^\2\2\u00d0"+
		"\u00d2\n\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00d0\3\2"+
		"\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7$\2\2\u00d7B\3\2\2\2\u00d8"+
		"\u00de\7)\2\2\u00d9\u00da\7^\2\2\u00da\u00dd\7)\2\2\u00db\u00dd\n\2\2"+
		"\2\u00dc\u00d9\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\7)\2\2\u00e2D\3\2\2\2\u00e3\u00e8\5O(\2\u00e4\u00e7\5O(\2\u00e5"+
		"\u00e7\5M\'\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9F\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ed\5M\'\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efH\3\2\2\2\u00f0\u00f1\7\61\2\2"+
		"\u00f1\u00f2\7\61\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f5\n\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\b%\2\2\u00faJ\3\2\2\2\u00fb"+
		"\u00fd\t\3\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b&\2\2\u0101"+
		"L\3\2\2\2\u0102\u0103\4\62;\2\u0103N\3\2\2\2\u0104\u0105\t\4\2\2\u0105"+
		"P\3\2\2\2\16\2\u00b0\u00c9\u00d1\u00d3\u00dc\u00de\u00e6\u00e8\u00ee\u00f6"+
		"\u00fe\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}