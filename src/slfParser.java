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
		LITERALCHARACTER=37, LITERALBOOLEAN=35, LT=8, MODULO=6, UNEQUALS=12, WHILE=22, 
		OPAREN=30, GTE=11, ELSE=21, BECOMES=1, CHAR=24, CCURLY=33, SEMICOLON=29, 
		EQUALS=7, INT=23, NOT=15, MINUS=3, AND=13, OCURLY=32, LTE=9, PRINT=17, 
		LITERALSTRING=36, IF=19, COLON=28, WS=41, BOOLEAN=25, THEN=20, COMMA=34, 
		READ=18, IDENTIFIER=39, OR=14, RETURN=27, CONSTANT=16, LITERALNUMBER=38, 
		GT=10, CPAREN=31, PLUS=2, COMMENT=40, TIMES=4, DIVIDE=5, STRING=26;
	public static final String[] tokenNames = {
		"<INVALID>", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'<'", 
		"'<='", "'>'", "'>='", "'!='", "'&&'", "'||'", "'!'", "'constant'", "'print'", 
		"'read'", "'if'", "'then'", "'else'", "'while'", "'int'", "'char'", "'boolean'", 
		"'string'", "'return'", "':'", "';'", "'('", "')'", "'{'", "'}'", "','", 
		"LITERALBOOLEAN", "LITERALSTRING", "LITERALCHARACTER", "LITERALNUMBER", 
		"IDENTIFIER", "COMMENT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_return_expression = 2, RULE_expression = 3, 
		RULE_while_statement = 4, RULE_declaration = 5, RULE_read_expression = 6, 
		RULE_print_expression = 7, RULE_if_expression = 8, RULE_compound_expression = 9, 
		RULE_assignment_expression = 10, RULE_literal = 11, RULE_type = 12;
	public static final String[] ruleNames = {
		"program", "command", "return_expression", "expression", "while_statement", 
		"declaration", "read_expression", "print_expression", "if_expression", 
		"compound_expression", "assignment_expression", "literal", "type"
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << CONSTANT) | (1L << PRINT) | (1L << READ) | (1L << IF) | (1L << WHILE) | (1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << OPAREN) | (1L << OCURLY) | (1L << LITERALBOOLEAN) | (1L << LITERALSTRING) | (1L << LITERALCHARACTER) | (1L << LITERALNUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(26); command();
				}
				}
				setState(31);
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
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationCommandContext extends CommandContext {
		public TerminalNode SEMICOLON() { return getToken(slfParser.SEMICOLON, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterDeclarationCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitDeclarationCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitDeclarationCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionCommandContext extends CommandContext {
		public TerminalNode SEMICOLON() { return getToken(slfParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterExpressionCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitExpressionCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitExpressionCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementCommandContext extends CommandContext {
		public TerminalNode SEMICOLON() { return getToken(slfParser.SEMICOLON, 0); }
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public WhileStatementCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterWhileStatementCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitWhileStatementCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitWhileStatementCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(41);
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
				_localctx = new ExpressionCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32); expression(0);
				setState(33); match(SEMICOLON);
				}
				break;
			case WHILE:
				_localctx = new WhileStatementCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35); while_statement();
				setState(36); match(SEMICOLON);
				}
				break;
			case CONSTANT:
			case INT:
			case CHAR:
			case BOOLEAN:
			case STRING:
				_localctx = new DeclarationCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38); declaration();
				setState(39); match(SEMICOLON);
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

	public static class Return_expressionContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(slfParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(slfParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).enterReturn_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof slfListener ) ((slfListener)listener).exitReturn_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitReturn_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_expressionContext return_expression() throws RecognitionException {
		Return_expressionContext _localctx = new Return_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_return_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(RETURN);
			setState(44); expression(0);
			setState(45); match(SEMICOLON);
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
	public static class CompareExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTE() { return getToken(slfParser.GTE, 0); }
		public TerminalNode UNEQUALS() { return getToken(slfParser.UNEQUALS, 0); }
		public TerminalNode EQUALS() { return getToken(slfParser.EQUALS, 0); }
		public TerminalNode LT() { return getToken(slfParser.LT, 0); }
		public TerminalNode LTE() { return getToken(slfParser.LTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GT() { return getToken(slfParser.GT, 0); }
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
	public static class AdditionExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(slfParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode PLUS() { return getToken(slfParser.PLUS, 0); }
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
	public static class MultiplyExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(slfParser.TIMES, 0); }
		public TerminalNode MODULO() { return getToken(slfParser.MODULO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DIVIDE() { return getToken(slfParser.DIVIDE, 0); }
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
	public static class ClosedExpressionContext extends ExpressionContext {
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public TerminalNode OPAREN() { return getToken(slfParser.OPAREN, 0); }
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new NegativeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(48); match(MINUS);
				setState(49); expression(14);
				}
				break;
			case 2:
				{
				_localctx = new NegateExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50); match(NOT);
				setState(51); expression(13);
				}
				break;
			case 3:
				{
				_localctx = new ClosedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52); match(OPAREN);
				setState(53); expression(0);
				setState(54); match(CPAREN);
				}
				break;
			case 4:
				{
				_localctx = new ReadExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56); read_expression();
				}
				break;
			case 5:
				{
				_localctx = new PrintExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57); print_expression();
				}
				break;
			case 6:
				{
				_localctx = new IfExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58); if_expression();
				}
				break;
			case 7:
				{
				_localctx = new CompoundExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59); compound_expression();
				}
				break;
			case 8:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60); assignment_expression();
				}
				break;
			case 9:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61); literal();
				}
				break;
			case 10:
				{
				_localctx = new IDENTIFIERExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62); match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(80);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(66);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(67); expression(13);
						}
						break;
					case 2:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(69);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(70); expression(12);
						}
						break;
					case 3:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(72);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE) | (1L << UNEQUALS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(73); expression(11);
						}
						break;
					case 4:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(75); match(AND);
						setState(76); expression(10);
						}
						break;
					case 5:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(78); match(OR);
						setState(79); expression(9);
						}
						break;
					}
					} 
				}
				setState(84);
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
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public TerminalNode OCURLY() { return getToken(slfParser.OCURLY, 0); }
		public TerminalNode CCURLY() { return getToken(slfParser.CCURLY, 0); }
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public TerminalNode OPAREN() { return getToken(slfParser.OPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(WHILE);
			setState(86); match(OPAREN);
			setState(87); expression(0);
			setState(88); match(CPAREN);
			setState(89); match(OCURLY);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << CONSTANT) | (1L << PRINT) | (1L << READ) | (1L << IF) | (1L << WHILE) | (1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << OPAREN) | (1L << OCURLY) | (1L << LITERALBOOLEAN) | (1L << LITERALSTRING) | (1L << LITERALCHARACTER) | (1L << LITERALNUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(90); command();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96); match(CCURLY);
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
		public TerminalNode IDENTIFIER(int i) {
			return getToken(slfParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(slfParser.IDENTIFIER); }
		public List<TerminalNode> COMMA() { return getTokens(slfParser.COMMA); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BECOMES() { return getToken(slfParser.BECOMES, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(slfParser.COMMA, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof slfVisitor ) return ((slfVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); type();
				setState(99); match(IDENTIFIER);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100); match(COMMA);
					setState(101); match(IDENTIFIER);
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(107); match(CONSTANT);
					}
				}

				setState(110); type();
				setState(111); match(IDENTIFIER);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(112); match(COMMA);
					setState(113); match(IDENTIFIER);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119); match(BECOMES);
				setState(120); expression(0);
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
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public TerminalNode OPAREN() { return getToken(slfParser.OPAREN, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(slfParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(slfParser.IDENTIFIER); }
		public List<TerminalNode> COMMA() { return getTokens(slfParser.COMMA); }
		public TerminalNode READ() { return getToken(slfParser.READ, 0); }
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
		enterRule(_localctx, 12, RULE_read_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(READ);
			setState(125); match(OPAREN);
			setState(126); match(IDENTIFIER);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(127); match(COMMA);
				setState(128); match(IDENTIFIER);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134); match(CPAREN);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PRINT() { return getToken(slfParser.PRINT, 0); }
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public TerminalNode OPAREN() { return getToken(slfParser.OPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(slfParser.COMMA); }
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
		enterRule(_localctx, 14, RULE_print_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(PRINT);
			setState(137); match(OPAREN);
			setState(138); expression(0);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(139); match(COMMA);
				setState(140); expression(0);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146); match(CPAREN);
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
		public Compound_expressionContext compound_expression(int i) {
			return getRuleContext(Compound_expressionContext.class,i);
		}
		public List<Compound_expressionContext> compound_expression() {
			return getRuleContexts(Compound_expressionContext.class);
		}
		public TerminalNode THEN() { return getToken(slfParser.THEN, 0); }
		public TerminalNode IF() { return getToken(slfParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(slfParser.ELSE, 0); }
		public TerminalNode CPAREN() { return getToken(slfParser.CPAREN, 0); }
		public TerminalNode OPAREN() { return getToken(slfParser.OPAREN, 0); }
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
		enterRule(_localctx, 16, RULE_if_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(IF);
			setState(149); match(OPAREN);
			setState(150); expression(0);
			setState(151); match(CPAREN);
			setState(152); match(THEN);
			setState(153); compound_expression();
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(154); match(ELSE);
				setState(155); compound_expression();
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
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public TerminalNode OCURLY() { return getToken(slfParser.OCURLY, 0); }
		public TerminalNode CCURLY() { return getToken(slfParser.CCURLY, 0); }
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Return_expressionContext return_expression() {
			return getRuleContext(Return_expressionContext.class,0);
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
		enterRule(_localctx, 18, RULE_compound_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(OCURLY);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << CONSTANT) | (1L << PRINT) | (1L << READ) | (1L << IF) | (1L << WHILE) | (1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << STRING) | (1L << OPAREN) | (1L << OCURLY) | (1L << LITERALBOOLEAN) | (1L << LITERALSTRING) | (1L << LITERALCHARACTER) | (1L << LITERALNUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(159); command();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165); return_expression();
			setState(166); match(CCURLY);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BECOMES() { return getToken(slfParser.BECOMES, 0); }
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
		enterRule(_localctx, 20, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(IDENTIFIER);
			setState(169); match(BECOMES);
			setState(170); expression(0);
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

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal);
		try {
			setState(176);
			switch (_input.LA(1)) {
			case LITERALBOOLEAN:
				_localctx = new Literal_booleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172); match(LITERALBOOLEAN);
				}
				break;
			case LITERALSTRING:
				_localctx = new Literal_stringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173); match(LITERALSTRING);
				}
				break;
			case LITERALCHARACTER:
				_localctx = new Literal_characterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(174); match(LITERALCHARACTER);
				}
				break;
			case LITERALNUMBER:
				_localctx = new Literal_numberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(175); match(LITERALNUMBER);
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

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178); match(BOOLEAN);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179); match(STRING);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(180); match(CHAR);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(181); match(INT);
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
		case 3: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00bb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5S\n\5\f\5\16\5V\13\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\7\7i\n\7\f\7\16\7l\13\7\3\7\5\7o\n\7\3\7\3\7\3\7\3\7\7\7u\n\7\f\7\16"+
		"\7x\13\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u0084\n\b\f\b\16"+
		"\b\u0087\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u0090\n\t\f\t\16\t\u0093"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3\13\3\13"+
		"\7\13\u00a3\n\13\f\13\16\13\u00a6\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\5\r\u00b3\n\r\3\16\3\16\3\16\3\16\5\16\u00b9\n\16\3\16"+
		"\2\3\b\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2\6\b\3\2\4\5\3\2\t\16"+
		"\u00cd\2\37\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\bA\3\2\2\2\nW\3\2\2\2\f|\3\2"+
		"\2\2\16~\3\2\2\2\20\u008a\3\2\2\2\22\u0096\3\2\2\2\24\u00a0\3\2\2\2\26"+
		"\u00aa\3\2\2\2\30\u00b2\3\2\2\2\32\u00b8\3\2\2\2\34\36\5\4\3\2\35\34\3"+
		"\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\37\3\2\2\2\""+
		"#\5\b\5\2#$\7\37\2\2$,\3\2\2\2%&\5\n\6\2&\'\7\37\2\2\',\3\2\2\2()\5\f"+
		"\7\2)*\7\37\2\2*,\3\2\2\2+\"\3\2\2\2+%\3\2\2\2+(\3\2\2\2,\5\3\2\2\2-."+
		"\7\35\2\2./\5\b\5\2/\60\7\37\2\2\60\7\3\2\2\2\61\62\b\5\1\2\62\63\7\5"+
		"\2\2\63B\5\b\5\20\64\65\7\21\2\2\65B\5\b\5\17\66\67\7 \2\2\678\5\b\5\2"+
		"89\7!\2\29B\3\2\2\2:B\5\16\b\2;B\5\20\t\2<B\5\22\n\2=B\5\24\13\2>B\5\26"+
		"\f\2?B\5\30\r\2@B\7)\2\2A\61\3\2\2\2A\64\3\2\2\2A\66\3\2\2\2A:\3\2\2\2"+
		"A;\3\2\2\2A<\3\2\2\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2BT\3\2\2\2"+
		"CD\f\16\2\2DE\t\2\2\2ES\5\b\5\17FG\f\r\2\2GH\t\3\2\2HS\5\b\5\16IJ\f\f"+
		"\2\2JK\t\4\2\2KS\5\b\5\rLM\f\13\2\2MN\7\17\2\2NS\5\b\5\fOP\f\n\2\2PQ\7"+
		"\20\2\2QS\5\b\5\13RC\3\2\2\2RF\3\2\2\2RI\3\2\2\2RL\3\2\2\2RO\3\2\2\2S"+
		"V\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\t\3\2\2\2VT\3\2\2\2WX\7\30\2\2XY\7 \2\2"+
		"YZ\5\b\5\2Z[\7!\2\2[_\7\"\2\2\\^\5\4\3\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2"+
		"\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7#\2\2c\13\3\2\2\2de\5\32\16\2ej\7"+
		")\2\2fg\7$\2\2gi\7)\2\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k}\3\2"+
		"\2\2lj\3\2\2\2mo\7\22\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\5\32\16\2qv"+
		"\7)\2\2rs\7$\2\2su\7)\2\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3"+
		"\2\2\2xv\3\2\2\2yz\7\3\2\2z{\5\b\5\2{}\3\2\2\2|d\3\2\2\2|n\3\2\2\2}\r"+
		"\3\2\2\2~\177\7\24\2\2\177\u0080\7 \2\2\u0080\u0085\7)\2\2\u0081\u0082"+
		"\7$\2\2\u0082\u0084\7)\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\7!\2\2\u0089\17\3\2\2\2\u008a\u008b\7\23\2\2\u008b\u008c"+
		"\7 \2\2\u008c\u0091\5\b\5\2\u008d\u008e\7$\2\2\u008e\u0090\5\b\5\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7!\2\2\u0095"+
		"\21\3\2\2\2\u0096\u0097\7\25\2\2\u0097\u0098\7 \2\2\u0098\u0099\5\b\5"+
		"\2\u0099\u009a\7!\2\2\u009a\u009b\7\26\2\2\u009b\u009e\5\24\13\2\u009c"+
		"\u009d\7\27\2\2\u009d\u009f\5\24\13\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\23\3\2\2\2\u00a0\u00a4\7\"\2\2\u00a1\u00a3\5\4\3\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\5\6\4\2\u00a8"+
		"\u00a9\7#\2\2\u00a9\25\3\2\2\2\u00aa\u00ab\7)\2\2\u00ab\u00ac\7\3\2\2"+
		"\u00ac\u00ad\5\b\5\2\u00ad\27\3\2\2\2\u00ae\u00b3\7%\2\2\u00af\u00b3\7"+
		"&\2\2\u00b0\u00b3\7\'\2\2\u00b1\u00b3\7(\2\2\u00b2\u00ae\3\2\2\2\u00b2"+
		"\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\31\3\2\2"+
		"\2\u00b4\u00b9\7\33\2\2\u00b5\u00b9\7\34\2\2\u00b6\u00b9\7\32\2\2\u00b7"+
		"\u00b9\7\31\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3"+
		"\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\33\3\2\2\2\22\37+ART_jnv|\u0085\u0091"+
		"\u009e\u00a4\u00b2\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}