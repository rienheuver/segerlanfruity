// Generated from slf.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class slfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BECOMES=1, PLUS=2, MINUS=3, TIMES=4, DIVIDE=5, MODULO=6, EQUALS=7, LT=8, 
		LTE=9, GT=10, GTE=11, UNEQUALS=12, AND=13, OR=14, NOT=15, CONSTANT=16, 
		PRINT=17, READ=18, IF=19, THEN=20, ELSE=21, WHILE=22, TYPE=23, COLON=24, 
		SEMICOLON=25, OPAREN=26, CPAREN=27, OCURLY=28, CCURLY=29, COMMA=30, BOOLEAN=31, 
		STRING=32, CHARACTER=33, IDENTIFIER=34, NUMBER=35, COMMENT=36, WS=37;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_expression = 2, RULE_while_statement = 3, 
		RULE_declaration = 4, RULE_read_expression = 5, RULE_print_expression = 6, 
		RULE_if_expression = 7, RULE_compound_expression = 8, RULE_assignment_expression = 9, 
		RULE_literal = 10;
	public static final String[] ruleNames = {
		"program", "command", "expression", "while_statement", "declaration", 
		"read_expression", "print_expression", "if_expression", "compound_expression", 
		"assignment_expression", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'<'", "'<='", 
		"'>'", "'>='", "'!='", "'&&'", "'||'", "'!'", "'constant'", "'print'", 
		"'read'", "'if'", "'then'", "'else'", "'while'", null, "':'", "';'", "'('", 
		"')'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BECOMES", "PLUS", "MINUS", "TIMES", "DIVIDE", "MODULO", "EQUALS", 
		"LT", "LTE", "GT", "GTE", "UNEQUALS", "AND", "OR", "NOT", "CONSTANT", 
		"PRINT", "READ", "IF", "THEN", "ELSE", "WHILE", "TYPE", "COLON", "SEMICOLON", 
		"OPAREN", "CPAREN", "OCURLY", "CCURLY", "COMMA", "BOOLEAN", "STRING", 
		"CHARACTER", "IDENTIFIER", "NUMBER", "COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "slf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public slfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << CONSTANT) | (1L << PRINT) | (1L << READ) | (1L << IF) | (1L << WHILE) | (1L << TYPE) | (1L << OCURLY) | (1L << BOOLEAN) | (1L << STRING) | (1L << CHARACTER) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(22);
				command();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(slfParser.SEMICOLON, 0); }
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(37);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
			case PRINT:
			case READ:
			case IF:
			case OCURLY:
			case BOOLEAN:
			case STRING:
			case CHARACTER:
			case IDENTIFIER:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				expression(0);
				setState(29);
				match(SEMICOLON);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				while_statement();
				setState(32);
				match(SEMICOLON);
				}
				break;
			case CONSTANT:
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				declaration();
				setState(35);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(slfParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(slfParser.NOT, 0); }
		public Read_expressionContext read_expression() {
			return getRuleContext(Read_expressionContext.class,0);
		}
		public Print_expressionContext print_expression() {
			return getRuleContext(Print_expressionContext.class,0);
		}
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public Compound_expressionContext compound_expression() {
			return getRuleContext(Compound_expressionContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode MODULO() { return getToken(slfParser.MODULO, 0); }
		public TerminalNode TIMES() { return getToken(slfParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(slfParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(slfParser.PLUS, 0); }
		public TerminalNode LT() { return getToken(slfParser.LT, 0); }
		public TerminalNode LTE() { return getToken(slfParser.LTE, 0); }
		public TerminalNode GT() { return getToken(slfParser.GT, 0); }
		public TerminalNode GTE() { return getToken(slfParser.GTE, 0); }
		public TerminalNode EQUALS() { return getToken(slfParser.EQUALS, 0); }
		public TerminalNode UNEQUALS() { return getToken(slfParser.UNEQUALS, 0); }
		public TerminalNode AND() { return getToken(slfParser.AND, 0); }
		public TerminalNode OR() { return getToken(slfParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				{
				setState(40);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(41);
				expression(12);
				}
				break;
			case READ:
				{
				setState(42);
				read_expression();
				}
				break;
			case PRINT:
				{
				setState(43);
				print_expression();
				}
				break;
			case IF:
				{
				setState(44);
				if_expression();
				}
				break;
			case OCURLY:
				{
				setState(45);
				compound_expression();
				}
				break;
			case IDENTIFIER:
				{
				setState(46);
				assignment_expression();
				}
				break;
			case BOOLEAN:
			case STRING:
			case CHARACTER:
			case NUMBER:
				{
				setState(47);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(50);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(51);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(52);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(53);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(54);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(55);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(56);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(57);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE) | (1L << UNEQUALS))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(58);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(59);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(60);
						match(AND);
						setState(61);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(63);
						match(OR);
						setState(64);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(slfParser.WHILE, 0); }
		public TerminalNode OPAREN() { return getToken(slfParser.OPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public TerminalNode OCURLY() { return getToken(slfParser.OCURLY, 0); }
		public TerminalNode CCURLY() { return getToken(slfParser.CCURLY, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(WHILE);
			setState(71);
			match(OPAREN);
			setState(72);
			expression(0);
			setState(73);
			match(CPAREN);
			setState(74);
			match(OCURLY);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				command();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << CONSTANT) | (1L << PRINT) | (1L << READ) | (1L << IF) | (1L << WHILE) | (1L << TYPE) | (1L << OCURLY) | (1L << BOOLEAN) | (1L << STRING) | (1L << CHARACTER) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0) );
			setState(80);
			match(CCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(slfParser.TYPE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(slfParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(slfParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(slfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(slfParser.COMMA, i);
		}
		public TerminalNode BECOMES() { return getToken(slfParser.BECOMES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(slfParser.CONSTANT, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(TYPE);
				setState(83);
				match(IDENTIFIER);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(84);
					match(COMMA);
					setState(85);
					match(IDENTIFIER);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(91);
					match(CONSTANT);
					}
				}

				setState(94);
				match(TYPE);
				setState(95);
				match(IDENTIFIER);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(96);
					match(COMMA);
					setState(97);
					match(IDENTIFIER);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(BECOMES);
				setState(104);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_expressionContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(slfParser.READ, 0); }
		public TerminalNode OPAREN() { return getToken(slfParser.OPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(slfParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(slfParser.IDENTIFIER, i);
		}
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(slfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(slfParser.COMMA, i);
		}
		public Read_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterRead_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitRead_expression(this);
		}
	}

	public final Read_expressionContext read_expression() throws RecognitionException {
		Read_expressionContext _localctx = new Read_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_read_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(READ);
			setState(108);
			match(OPAREN);
			setState(109);
			match(IDENTIFIER);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(110);
				match(COMMA);
				setState(111);
				match(IDENTIFIER);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(CPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_expressionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(slfParser.PRINT, 0); }
		public TerminalNode OPAREN() { return getToken(slfParser.OPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(slfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(slfParser.COMMA, i);
		}
		public Print_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterPrint_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitPrint_expression(this);
		}
	}

	public final Print_expressionContext print_expression() throws RecognitionException {
		Print_expressionContext _localctx = new Print_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(PRINT);
			setState(120);
			match(OPAREN);
			setState(121);
			expression(0);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(122);
				match(COMMA);
				setState(123);
				expression(0);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(CPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_expressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(slfParser.IF, 0); }
		public TerminalNode OPAREN() { return getToken(slfParser.OPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public TerminalNode THEN() { return getToken(slfParser.THEN, 0); }
		public List<TerminalNode> OCURLY() { return getTokens(slfParser.OCURLY); }
		public TerminalNode OCURLY(int i) {
			return getToken(slfParser.OCURLY, i);
		}
		public List<TerminalNode> CCURLY() { return getTokens(slfParser.CCURLY); }
		public TerminalNode CCURLY(int i) {
			return getToken(slfParser.CCURLY, i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(slfParser.ELSE, 0); }
		public If_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterIf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitIf_expression(this);
		}
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IF);
			setState(132);
			match(OPAREN);
			setState(133);
			expression(0);
			setState(134);
			match(CPAREN);
			setState(135);
			match(THEN);
			setState(136);
			match(OCURLY);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				command();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << CONSTANT) | (1L << PRINT) | (1L << READ) | (1L << IF) | (1L << WHILE) | (1L << TYPE) | (1L << OCURLY) | (1L << BOOLEAN) | (1L << STRING) | (1L << CHARACTER) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0) );
			setState(142);
			match(CCURLY);
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(143);
				match(ELSE);
				setState(144);
				match(OCURLY);
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
					command();
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << CONSTANT) | (1L << PRINT) | (1L << READ) | (1L << IF) | (1L << WHILE) | (1L << TYPE) | (1L << OCURLY) | (1L << BOOLEAN) | (1L << STRING) | (1L << CHARACTER) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0) );
				setState(150);
				match(CCURLY);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_expressionContext extends ParserRuleContext {
		public TerminalNode OCURLY() { return getToken(slfParser.OCURLY, 0); }
		public TerminalNode CCURLY() { return getToken(slfParser.CCURLY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Compound_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterCompound_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitCompound_expression(this);
		}
	}

	public final Compound_expressionContext compound_expression() throws RecognitionException {
		Compound_expressionContext _localctx = new Compound_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compound_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(OCURLY);
			setState(162);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << CONSTANT) | (1L << PRINT) | (1L << READ) | (1L << IF) | (1L << WHILE) | (1L << TYPE) | (1L << OCURLY) | (1L << BOOLEAN) | (1L << STRING) | (1L << CHARACTER) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(155);
						command();
						}
						} 
					}
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(161);
				expression(0);
				}
			}

			setState(164);
			match(CCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(slfParser.IDENTIFIER, 0); }
		public TerminalNode BECOMES() { return getToken(slfParser.BECOMES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IDENTIFIER);
			setState(167);
			match(BECOMES);
			setState(168);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(slfParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(slfParser.STRING, 0); }
		public TerminalNode CHARACTER() { return getToken(slfParser.CHARACTER, 0); }
		public TerminalNode NUMBER() { return getToken(slfParser.NUMBER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING) | (1L << CHARACTER) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4D\n\4\f\4"+
		"\16\4G\13\4\3\5\3\5\3\5\3\5\3\5\3\5\6\5O\n\5\r\5\16\5P\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\5\6_\n\6\3\6\3\6\3\6\3\6\7\6e\n"+
		"\6\f\6\16\6h\13\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\3\7\7\7s\n\7\f\7\16"+
		"\7v\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\177\n\b\f\b\16\b\u0082\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u008d\n\t\r\t\16\t\u008e\3\t\3"+
		"\t\3\t\3\t\6\t\u0095\n\t\r\t\16\t\u0096\3\t\3\t\5\t\u009b\n\t\3\n\3\n"+
		"\7\n\u009f\n\n\f\n\16\n\u00a2\13\n\3\n\5\n\u00a5\n\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\2\3\6\r\2\4\6\b\n\f\16\20\22\24\26\2\7\4\2\5\5"+
		"\21\21\3\2\6\b\3\2\4\5\3\2\t\16\4\2!#%%\u00bd\2\33\3\2\2\2\4\'\3\2\2\2"+
		"\6\62\3\2\2\2\bH\3\2\2\2\nk\3\2\2\2\fm\3\2\2\2\16y\3\2\2\2\20\u0085\3"+
		"\2\2\2\22\u009c\3\2\2\2\24\u00a8\3\2\2\2\26\u00ac\3\2\2\2\30\32\5\4\3"+
		"\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2"+
		"\2\35\33\3\2\2\2\36\37\5\6\4\2\37 \7\33\2\2 (\3\2\2\2!\"\5\b\5\2\"#\7"+
		"\33\2\2#(\3\2\2\2$%\5\n\6\2%&\7\33\2\2&(\3\2\2\2\'\36\3\2\2\2\'!\3\2\2"+
		"\2\'$\3\2\2\2(\5\3\2\2\2)*\b\4\1\2*+\t\2\2\2+\63\5\6\4\16,\63\5\f\7\2"+
		"-\63\5\16\b\2.\63\5\20\t\2/\63\5\22\n\2\60\63\5\24\13\2\61\63\5\26\f\2"+
		"\62)\3\2\2\2\62,\3\2\2\2\62-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2"+
		"\2\2\62\61\3\2\2\2\63E\3\2\2\2\64\65\f\r\2\2\65\66\t\3\2\2\66D\5\6\4\16"+
		"\678\f\f\2\289\t\4\2\29D\5\6\4\r:;\f\13\2\2;<\t\5\2\2<D\5\6\4\f=>\f\n"+
		"\2\2>?\7\17\2\2?D\5\6\4\13@A\f\t\2\2AB\7\20\2\2BD\5\6\4\nC\64\3\2\2\2"+
		"C\67\3\2\2\2C:\3\2\2\2C=\3\2\2\2C@\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2"+
		"\2F\7\3\2\2\2GE\3\2\2\2HI\7\30\2\2IJ\7\34\2\2JK\5\6\4\2KL\7\35\2\2LN\7"+
		"\36\2\2MO\5\4\3\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS"+
		"\7\37\2\2S\t\3\2\2\2TU\7\31\2\2UZ\7$\2\2VW\7 \2\2WY\7$\2\2XV\3\2\2\2Y"+
		"\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[l\3\2\2\2\\Z\3\2\2\2]_\7\22\2\2^]\3\2\2"+
		"\2^_\3\2\2\2_`\3\2\2\2`a\7\31\2\2af\7$\2\2bc\7 \2\2ce\7$\2\2db\3\2\2\2"+
		"eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\3\2\2jl\5\6\4\2"+
		"kT\3\2\2\2k^\3\2\2\2l\13\3\2\2\2mn\7\24\2\2no\7\34\2\2ot\7$\2\2pq\7 \2"+
		"\2qs\7$\2\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2"+
		"\2wx\7\35\2\2x\r\3\2\2\2yz\7\23\2\2z{\7\34\2\2{\u0080\5\6\4\2|}\7 \2\2"+
		"}\177\5\6\4\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\35\2\2\u0084"+
		"\17\3\2\2\2\u0085\u0086\7\25\2\2\u0086\u0087\7\34\2\2\u0087\u0088\5\6"+
		"\4\2\u0088\u0089\7\35\2\2\u0089\u008a\7\26\2\2\u008a\u008c\7\36\2\2\u008b"+
		"\u008d\5\4\3\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u009a\7\37\2\2\u0091"+
		"\u0092\7\27\2\2\u0092\u0094\7\36\2\2\u0093\u0095\5\4\3\2\u0094\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\7\37\2\2\u0099\u009b\3\2\2\2\u009a\u0091\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\21\3\2\2\2\u009c\u00a4\7\36\2\2\u009d"+
		"\u009f\5\4\3\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a5\5\6\4\2\u00a4\u00a0\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\7\37\2\2\u00a7\23\3\2\2\2\u00a8\u00a9\7$\2\2\u00a9\u00aa"+
		"\7\3\2\2\u00aa\u00ab\5\6\4\2\u00ab\25\3\2\2\2\u00ac\u00ad\t\6\2\2\u00ad"+
		"\27\3\2\2\2\23\33\'\62CEPZ^fkt\u0080\u008e\u0096\u009a\u00a0\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}