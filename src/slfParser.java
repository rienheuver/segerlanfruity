// Generated from slf.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=17, BECOMES=1, LT=8, CHAR=24, INT=23, COMMENT=39, MINUS=3, DIVIDE=5, 
		LITERALBOOLEAN=34, LITERALCHARACTER=36, SEMICOLON=28, OCURLY=31, ELSE=21, 
		LITERALNUMBER=37, IDENTIFIER=38, WS=40, UNEQUALS=12, IF=19, CPAREN=30, 
		LITERALSTRING=35, COMMA=33, OR=14, TIMES=4, EQUALS=7, CCURLY=32, MODULO=6, 
		CONSTANT=16, COLON=27, GT=10, BOOLEAN=25, OPAREN=29, READ=18, NOT=15, 
		AND=13, GTE=11, STRING=26, THEN=20, WHILE=22, LTE=9, PLUS=2;
	public static final String[] tokenNames = {
		"<INVALID>", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'<'", 
		"'<='", "'>'", "'>='", "'!='", "'&&'", "'||'", "'!'", "'constant'", "'print'", 
		"'read'", "'if'", "'then'", "'else'", "'while'", "'int'", "'char'", "'boolean'", 
		"'string'", "':'", "';'", "'('", "')'", "'{'", "'}'", "','", "LITERALBOOLEAN", 
		"LITERALSTRING", "LITERALCHARACTER", "LITERALNUMBER", "IDENTIFIER", "COMMENT", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_expression = 2, RULE_while_statement = 3, 
		RULE_declaration = 4, RULE_read_expression = 5, RULE_print_expression = 6, 
		RULE_if_expression = 7, RULE_compound_expression = 8, RULE_assignment_expression = 9, 
		RULE_literal = 10, RULE_type = 11;
	public static final String[] ruleNames = {
		"program", "command", "expression", "while_statement", "declaration", 
		"read_expression", "print_expression", "if_expression", "compound_expression", 
		"assignment_expression", "literal", "type"
	};

	@Override
	public String getGrammarFileName() { return "slf.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << CONSTANT) | (1L << PRINT) | (1L << READ) | (1L << IF) | (1L << WHILE) | (1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << OPAREN) | (1L << OCURLY) | (1L << LITERALBOOLEAN) | (1L << LITERALSTRING) | (1L << LITERALCHARACTER) | (1L << LITERALNUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(24); command();
				}
				}
				setState(29);
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
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(slfParser.SEMICOLON, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(39);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
			case PRINT:
			case READ:
			case IF:
			case OPAREN:
			case OCURLY:
			case LITERALBOOLEAN:
			case LITERALSTRING:
			case LITERALCHARACTER:
			case LITERALNUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); expression(0);
				setState(31); match(SEMICOLON);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(33); while_statement();
				setState(34); match(SEMICOLON);
				}
				break;
			case CONSTANT:
			case INT:
			case CHAR:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(36); declaration();
				setState(37); match(SEMICOLON);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegativeExpressionContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(slfParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterNegativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitNegativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitNegativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(slfParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(slfParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AdditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterAdditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitAdditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadExpressionContext extends ExpressionContext {
		public Read_expressionContext read_expression() {
			return getRuleContext(Read_expressionContext.class,0);
		}
		public ReadExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterReadExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitReadExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitReadExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExpressionContext extends ExpressionContext {
		public Print_expressionContext print_expression() {
			return getRuleContext(Print_expressionContext.class,0);
		}
		public PrintExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExpressionContext extends ExpressionContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyExpressionContext extends ExpressionContext {
		public TerminalNode TIMES() { return getToken(slfParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(slfParser.DIVIDE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MODULO() { return getToken(slfParser.MODULO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MultiplyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitMultiplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitMultiplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareExpressionContext extends ExpressionContext {
		public TerminalNode EQUALS() { return getToken(slfParser.EQUALS, 0); }
		public TerminalNode LT() { return getToken(slfParser.LT, 0); }
		public TerminalNode GTE() { return getToken(slfParser.GTE, 0); }
		public TerminalNode UNEQUALS() { return getToken(slfParser.UNEQUALS, 0); }
		public TerminalNode GT() { return getToken(slfParser.GT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LTE() { return getToken(slfParser.LTE, 0); }
		public CompareExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(slfParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(slfParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompoundExpressionContext extends ExpressionContext {
		public Compound_expressionContext compound_expression() {
			return getRuleContext(Compound_expressionContext.class,0);
		}
		public CompoundExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterCompoundExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitCompoundExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitCompoundExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(slfParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegateExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterNegateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitNegateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitNegateExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExpressionContext extends ExpressionContext {
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public IfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClosedExpressionContext extends ExpressionContext {
		public TerminalNode OPAREN() { return getToken(slfParser.OPAREN, 0); }
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClosedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterClosedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitClosedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitClosedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDENTIFIERExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(slfParser.IDENTIFIER, 0); }
		public IDENTIFIERExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterIDENTIFIERExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitIDENTIFIERExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitIDENTIFIERExpression(this);
			else return visitor.visitChildren(this);
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
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new NegativeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(42); match(MINUS);
				setState(43); expression(14);
				}
				break;
			case 2:
				{
				_localctx = new NegateExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44); match(NOT);
				setState(45); expression(13);
				}
				break;
			case 3:
				{
				_localctx = new ClosedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46); match(OPAREN);
				setState(47); expression(0);
				setState(48); match(CPAREN);
				}
				break;
			case 4:
				{
				_localctx = new ReadExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50); read_expression();
				}
				break;
			case 5:
				{
				_localctx = new PrintExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51); print_expression();
				}
				break;
			case 6:
				{
				_localctx = new IfExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52); if_expression();
				}
				break;
			case 7:
				{
				_localctx = new CompoundExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53); compound_expression();
				}
				break;
			case 8:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54); assignment_expression();
				}
				break;
			case 9:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55); literal();
				}
				break;
			case 10:
				{
				_localctx = new IDENTIFIERExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56); match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(59);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(60);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(61); expression(13);
						}
						break;
					case 2:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(63);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(64); expression(12);
						}
						break;
					case 3:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(66);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE) | (1L << UNEQUALS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(67); expression(11);
						}
						break;
					case 4:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(69); match(AND);
						setState(70); expression(10);
						}
						break;
					case 5:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(72); match(OR);
						setState(73); expression(9);
						}
						break;
					}
					} 
				}
				setState(78);
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
		public TerminalNode OPAREN() { return getToken(slfParser.OPAREN, 0); }
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public Compound_expressionContext compound_expression() {
			return getRuleContext(Compound_expressionContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(slfParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(WHILE);
			setState(80); match(OPAREN);
			setState(81); expression(0);
			setState(82); match(CPAREN);
			setState(83); compound_expression();
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
		public TerminalNode BECOMES() { return getToken(slfParser.BECOMES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(slfParser.COMMA); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(slfParser.IDENTIFIER, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(slfParser.CONSTANT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(slfParser.IDENTIFIER); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(slfParser.COMMA, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); type();
				setState(86); match(IDENTIFIER);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(87); match(COMMA);
					setState(88); match(IDENTIFIER);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(94); match(CONSTANT);
					}
				}

				setState(97); type();
				setState(98); match(IDENTIFIER);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(99); match(COMMA);
					setState(100); match(IDENTIFIER);
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106); match(BECOMES);
				setState(107); expression(0);
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
		public TerminalNode OPAREN() { return getToken(slfParser.OPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(slfParser.COMMA); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(slfParser.IDENTIFIER, i);
		}
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public TerminalNode READ() { return getToken(slfParser.READ, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(slfParser.IDENTIFIER); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitRead_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_expressionContext read_expression() throws RecognitionException {
		Read_expressionContext _localctx = new Read_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_read_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(READ);
			setState(112); match(OPAREN);
			setState(113); match(IDENTIFIER);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(114); match(COMMA);
				setState(115); match(IDENTIFIER);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121); match(CPAREN);
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
		public List<TerminalNode> COMMA() { return getTokens(slfParser.COMMA); }
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitPrint_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_expressionContext print_expression() throws RecognitionException {
		Print_expressionContext _localctx = new Print_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(PRINT);
			setState(124); match(OPAREN);
			setState(125); expression(0);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126); match(COMMA);
				setState(127); expression(0);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133); match(CPAREN);
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
		public TerminalNode ELSE() { return getToken(slfParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(slfParser.IF, 0); }
		public TerminalNode OPAREN() { return getToken(slfParser.OPAREN, 0); }
		public TerminalNode THEN() { return getToken(slfParser.THEN, 0); }
		public Compound_expressionContext compound_expression(int i) {
			return getRuleContext(Compound_expressionContext.class,i);
		}
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public List<Compound_expressionContext> compound_expression() {
			return getRuleContexts(Compound_expressionContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitIf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(IF);
			setState(136); match(OPAREN);
			setState(137); expression(0);
			setState(138); match(CPAREN);
			setState(139); match(THEN);
			setState(140); compound_expression();
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(141); match(ELSE);
				setState(142); compound_expression();
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
		public TerminalNode CCURLY() { return getToken(slfParser.CCURLY, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public TerminalNode OCURLY() { return getToken(slfParser.OCURLY, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitCompound_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_expressionContext compound_expression() throws RecognitionException {
		Compound_expressionContext _localctx = new Compound_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compound_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(OCURLY);
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146); command();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << CONSTANT) | (1L << PRINT) | (1L << READ) | (1L << IF) | (1L << WHILE) | (1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << OPAREN) | (1L << OCURLY) | (1L << LITERALBOOLEAN) | (1L << LITERALSTRING) | (1L << LITERALCHARACTER) | (1L << LITERALNUMBER) | (1L << IDENTIFIER))) != 0) );
			setState(151); match(CCURLY);
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
		public TerminalNode BECOMES() { return getToken(slfParser.BECOMES, 0); }
		public TerminalNode IDENTIFIER() { return getToken(slfParser.IDENTIFIER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitAssignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(IDENTIFIER);
			setState(154); match(BECOMES);
			setState(155); expression(0);
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
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Literal_characterContext extends LiteralContext {
		public TerminalNode LITERALCHARACTER() { return getToken(slfParser.LITERALCHARACTER, 0); }
		public Literal_characterContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterLiteral_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitLiteral_character(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitLiteral_character(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal_booleanContext extends LiteralContext {
		public TerminalNode LITERALBOOLEAN() { return getToken(slfParser.LITERALBOOLEAN, 0); }
		public Literal_booleanContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterLiteral_boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitLiteral_boolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitLiteral_boolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal_numberContext extends LiteralContext {
		public TerminalNode LITERALNUMBER() { return getToken(slfParser.LITERALNUMBER, 0); }
		public Literal_numberContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterLiteral_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitLiteral_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitLiteral_number(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal_stringContext extends LiteralContext {
		public TerminalNode LITERALSTRING() { return getToken(slfParser.LITERALSTRING, 0); }
		public Literal_stringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterLiteral_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitLiteral_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitLiteral_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal);
		try {
			setState(161);
			switch (_input.LA(1)) {
			case LITERALBOOLEAN:
				_localctx = new Literal_booleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157); match(LITERALBOOLEAN);
				}
				break;
			case LITERALSTRING:
				_localctx = new Literal_stringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158); match(LITERALSTRING);
				}
				break;
			case LITERALCHARACTER:
				_localctx = new Literal_characterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159); match(LITERALCHARACTER);
				}
				break;
			case LITERALNUMBER:
				_localctx = new Literal_numberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(160); match(LITERALNUMBER);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(slfParser.BOOLEAN, 0); }
		public BooleanContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends TypeContext {
		public TerminalNode STRING() { return getToken(slfParser.STRING, 0); }
		public StringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends TypeContext {
		public TerminalNode CHAR() { return getToken(slfParser.CHAR, 0); }
		public CharContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends TypeContext {
		public TerminalNode INT() { return getToken(slfParser.INT, 0); }
		public IntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(167);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163); match(BOOLEAN);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164); match(STRING);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(165); match(CHAR);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166); match(INT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 12);
		case 1: return precpred(_ctx, 11);
		case 2: return precpred(_ctx, 10);
		case 3: return precpred(_ctx, 9);
		case 4: return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\6\5\6b\n\6\3\6\3\6\3\6\3\6"+
		"\7\6h\n\6\f\6\16\6k\13\6\3\6\3\6\3\6\5\6p\n\6\3\7\3\7\3\7\3\7\3\7\7\7"+
		"w\n\7\f\7\16\7z\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u0083\n\b\f\b\16"+
		"\b\u0086\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0092\n\t\3"+
		"\n\3\n\6\n\u0096\n\n\r\n\16\n\u0097\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\5\f\u00a4\n\f\3\r\3\r\3\r\3\r\5\r\u00aa\n\r\3\r\2\3\6\16\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\2\5\3\2\6\b\3\2\4\5\3\2\t\16\u00be\2\35\3"+
		"\2\2\2\4)\3\2\2\2\6;\3\2\2\2\bQ\3\2\2\2\no\3\2\2\2\fq\3\2\2\2\16}\3\2"+
		"\2\2\20\u0089\3\2\2\2\22\u0093\3\2\2\2\24\u009b\3\2\2\2\26\u00a3\3\2\2"+
		"\2\30\u00a9\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3"+
		"\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37\35\3\2\2\2 !\5\6\4\2!\"\7\36\2\2"+
		"\"*\3\2\2\2#$\5\b\5\2$%\7\36\2\2%*\3\2\2\2&\'\5\n\6\2\'(\7\36\2\2(*\3"+
		"\2\2\2) \3\2\2\2)#\3\2\2\2)&\3\2\2\2*\5\3\2\2\2+,\b\4\1\2,-\7\5\2\2-<"+
		"\5\6\4\20./\7\21\2\2/<\5\6\4\17\60\61\7\37\2\2\61\62\5\6\4\2\62\63\7 "+
		"\2\2\63<\3\2\2\2\64<\5\f\7\2\65<\5\16\b\2\66<\5\20\t\2\67<\5\22\n\28<"+
		"\5\24\13\29<\5\26\f\2:<\7(\2\2;+\3\2\2\2;.\3\2\2\2;\60\3\2\2\2;\64\3\2"+
		"\2\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2"+
		"<N\3\2\2\2=>\f\16\2\2>?\t\2\2\2?M\5\6\4\17@A\f\r\2\2AB\t\3\2\2BM\5\6\4"+
		"\16CD\f\f\2\2DE\t\4\2\2EM\5\6\4\rFG\f\13\2\2GH\7\17\2\2HM\5\6\4\fIJ\f"+
		"\n\2\2JK\7\20\2\2KM\5\6\4\13L=\3\2\2\2L@\3\2\2\2LC\3\2\2\2LF\3\2\2\2L"+
		"I\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\7\3\2\2\2PN\3\2\2\2QR\7\30\2"+
		"\2RS\7\37\2\2ST\5\6\4\2TU\7 \2\2UV\5\22\n\2V\t\3\2\2\2WX\5\30\r\2X]\7"+
		"(\2\2YZ\7#\2\2Z\\\7(\2\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^p\3"+
		"\2\2\2_]\3\2\2\2`b\7\22\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\5\30\r\2d"+
		"i\7(\2\2ef\7#\2\2fh\7(\2\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3"+
		"\2\2\2ki\3\2\2\2lm\7\3\2\2mn\5\6\4\2np\3\2\2\2oW\3\2\2\2oa\3\2\2\2p\13"+
		"\3\2\2\2qr\7\24\2\2rs\7\37\2\2sx\7(\2\2tu\7#\2\2uw\7(\2\2vt\3\2\2\2wz"+
		"\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7 \2\2|\r\3\2\2\2}"+
		"~\7\23\2\2~\177\7\37\2\2\177\u0084\5\6\4\2\u0080\u0081\7#\2\2\u0081\u0083"+
		"\5\6\4\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7 "+
		"\2\2\u0088\17\3\2\2\2\u0089\u008a\7\25\2\2\u008a\u008b\7\37\2\2\u008b"+
		"\u008c\5\6\4\2\u008c\u008d\7 \2\2\u008d\u008e\7\26\2\2\u008e\u0091\5\22"+
		"\n\2\u008f\u0090\7\27\2\2\u0090\u0092\5\22\n\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\21\3\2\2\2\u0093\u0095\7!\2\2\u0094\u0096\5\4\3\2"+
		"\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\"\2\2\u009a\23\3\2\2\2\u009b"+
		"\u009c\7(\2\2\u009c\u009d\7\3\2\2\u009d\u009e\5\6\4\2\u009e\25\3\2\2\2"+
		"\u009f\u00a4\7$\2\2\u00a0\u00a4\7%\2\2\u00a1\u00a4\7&\2\2\u00a2\u00a4"+
		"\7\'\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\27\3\2\2\2\u00a5\u00aa\7\33\2\2\u00a6\u00aa\7\34"+
		"\2\2\u00a7\u00aa\7\32\2\2\u00a8\u00aa\7\31\2\2\u00a9\u00a5\3\2\2\2\u00a9"+
		"\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\31\3\2\2"+
		"\2\21\35);LN]aiox\u0084\u0091\u0097\u00a3\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}