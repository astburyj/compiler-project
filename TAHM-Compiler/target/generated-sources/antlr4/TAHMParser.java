// Generated from TAHM.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TAHMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, QUIT=2, IS=3, NOT=4, DO=5, ODD=6, ASSIGN=7, COMMA=8, SEMIC=9, 
		DOT=10, VAR=11, IF=12, THEN=13, PRINT=14, ELSE=15, WHILE=16, EQUAL_TO=17, 
		GREATER_THAN=18, LESS_THAN=19, PROCEDURE=20, OPEN=21, CLOSE=22, PLUS=23, 
		MINUS=24, MULT=25, DIV=26, Ident=27, Number=28, ALPHA=29, DIGIT=30, WS=31;
	public static final String[] tokenNames = {
		"<INVALID>", "'turn_up'", "'bye_felicia'", "'=='", "'!'", "'work'", "'odd'", 
		"'call'", "','", "';'", "'.'", "'make'", "'when'", "'then'", "'spitfire'", 
		"'nah'", "'finna'", "'is'", "'mo'", "'turn_down'", "'go'", "'('", "')'", 
		"'+'", "'-'", "'*'", "'/'", "Ident", "Number", "ALPHA", "DIGIT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_vars = 2, RULE_procedure = 3, RULE_statement = 4, 
		RULE_condition = 5, RULE_expression = 6, RULE_opt_term = 7, RULE_term = 8, 
		RULE_opt_factor = 9, RULE_factor = 10;
	public static final String[] ruleNames = {
		"program", "block", "vars", "procedure", "statement", "condition", "expression", 
		"opt_term", "term", "opt_factor", "factor"
	};

	@Override
	public String getGrammarFileName() { return "TAHM.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TAHMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(TAHMParser.DOT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); block();
			setState(23); match(DOT);
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

	public static class BlockContext extends ParserRuleContext {
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(25); vars();
				}
			}

			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(28); procedure();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); statement();
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

	public static class VarsContext extends ParserRuleContext {
		public List<TerminalNode> Ident() { return getTokens(TAHMParser.Ident); }
		public TerminalNode VAR() { return getToken(TAHMParser.VAR, 0); }
		public TerminalNode SEMIC() { return getToken(TAHMParser.SEMIC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TAHMParser.COMMA); }
		public TerminalNode Ident(int i) {
			return getToken(TAHMParser.Ident, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(TAHMParser.COMMA, i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(VAR);
			setState(37); match(Ident);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(38); match(COMMA);
				setState(39); match(Ident);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45); match(SEMIC);
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(TAHMParser.Ident, 0); }
		public List<TerminalNode> SEMIC() { return getTokens(TAHMParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(TAHMParser.SEMIC, i);
		}
		public TerminalNode PROCEDURE() { return getToken(TAHMParser.PROCEDURE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(PROCEDURE);
			setState(48); match(Ident);
			setState(49); match(SEMIC);
			setState(50); block();
			setState(51); match(SEMIC);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BeginStatContext extends StatementContext {
		public List<TerminalNode> SEMIC() { return getTokens(TAHMParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(TAHMParser.SEMIC, i);
		}
		public TerminalNode QUIT() { return getToken(TAHMParser.QUIT, 0); }
		public TerminalNode START() { return getToken(TAHMParser.START, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BeginStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitBeginStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatContext extends StatementContext {
		public TerminalNode IF() { return getToken(TAHMParser.IF, 0); }
		public TerminalNode THEN() { return getToken(TAHMParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(TAHMParser.PRINT, 0); }
		public TerminalNode Ident() { return getToken(TAHMParser.Ident, 0); }
		public PrintStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitPrintStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotStatContext extends StatementContext {
		public TerminalNode NOT() { return getToken(TAHMParser.NOT, 0); }
		public TerminalNode Ident() { return getToken(TAHMParser.Ident, 0); }
		public NotStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitNotStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStatContext extends StatementContext {
		public TerminalNode ASSIGN() { return getToken(TAHMParser.ASSIGN, 0); }
		public TerminalNode Ident() { return getToken(TAHMParser.Ident, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatContext extends StatementContext {
		public TerminalNode DO() { return getToken(TAHMParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(TAHMParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhileStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(83);
			switch (_input.LA(1)) {
			case ASSIGN:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53); match(ASSIGN);
				setState(54); match(Ident);
				setState(55); expression();
				}
				break;
			case PRINT:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56); match(PRINT);
				setState(57); match(Ident);
				}
				break;
			case NOT:
				_localctx = new NotStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58); match(NOT);
				setState(59); match(Ident);
				}
				break;
			case START:
				_localctx = new BeginStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(60); match(START);
				setState(61); statement();
				setState(62); match(SEMIC);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START) | (1L << NOT) | (1L << ASSIGN) | (1L << IF) | (1L << PRINT) | (1L << WHILE))) != 0)) {
					{
					{
					setState(63); statement();
					setState(64); match(SEMIC);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71); match(QUIT);
				}
				break;
			case IF:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(73); match(IF);
				setState(74); condition();
				setState(75); match(THEN);
				setState(76); statement();
				}
				break;
			case WHILE:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(78); match(WHILE);
				setState(79); condition();
				setState(80); match(DO);
				setState(81); statement();
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

	public static class ConditionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode IS() { return getToken(TAHMParser.IS, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ODD() { return getToken(TAHMParser.ODD, 0); }
		public TerminalNode LESS_THAN() { return getToken(TAHMParser.LESS_THAN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GREATER_THAN() { return getToken(TAHMParser.GREATER_THAN, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		int _la;
		try {
			setState(91);
			switch (_input.LA(1)) {
			case ODD:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); match(ODD);
				setState(86); expression();
				}
				break;
			case OPEN:
			case PLUS:
			case MINUS:
			case Ident:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); expression();
				setState(88);
				((ConditionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IS) | (1L << GREATER_THAN) | (1L << LESS_THAN))) != 0)) ) {
					((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(89); expression();
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
		public Token opt_sign;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<Opt_termContext> opt_term() {
			return getRuleContexts(Opt_termContext.class);
		}
		public TerminalNode PLUS() { return getToken(TAHMParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TAHMParser.MINUS, 0); }
		public Opt_termContext opt_term(int i) {
			return getRuleContext(Opt_termContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(93);
				((ExpressionContext)_localctx).opt_sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpressionContext)_localctx).opt_sign = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(96); term();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(97); opt_term();
				}
				}
				setState(102);
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

	public static class Opt_termContext extends ParserRuleContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(TAHMParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TAHMParser.MINUS, 0); }
		public Opt_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitOpt_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_termContext opt_term() throws RecognitionException {
		Opt_termContext _localctx = new Opt_termContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_opt_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((Opt_termContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
				((Opt_termContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(104); term();
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Opt_factorContext opt_factor(int i) {
			return getRuleContext(Opt_factorContext.class,i);
		}
		public List<Opt_factorContext> opt_factor() {
			return getRuleContexts(Opt_factorContext.class);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); factor();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(107); opt_factor();
				}
				}
				setState(112);
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

	public static class Opt_factorContext extends ParserRuleContext {
		public Token op;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MULT() { return getToken(TAHMParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(TAHMParser.DIV, 0); }
		public Opt_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitOpt_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_factorContext opt_factor() throws RecognitionException {
		Opt_factorContext _localctx = new Opt_factorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_opt_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((Opt_factorContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
				((Opt_factorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(114); factor();
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberFactorContext extends FactorContext {
		public TerminalNode Number() { return getToken(TAHMParser.Number, 0); }
		public NumberFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitNumberFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExprContext extends FactorContext {
		public TerminalNode OPEN() { return getToken(TAHMParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(TAHMParser.CLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentFactorContext extends FactorContext {
		public TerminalNode Ident() { return getToken(TAHMParser.Ident, 0); }
		public IdentFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAHMVisitor ) return ((TAHMVisitor<? extends T>)visitor).visitIdentFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(122);
			switch (_input.LA(1)) {
			case Ident:
				_localctx = new IdentFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116); match(Ident);
				}
				break;
			case Number:
				_localctx = new NumberFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117); match(Number);
				}
				break;
			case OPEN:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118); match(OPEN);
				setState(119); expression();
				setState(120); match(CLOSE);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\177\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13"+
		"\4\f\t\f\3\2\3\2\3\2\3\3\5\3\35\n\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6E\n\6\f\6"+
		"\16\6H\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6V\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\b\5\ba\n\b\3\b\3\b\7\be\n\b\f\b\16\b"+
		"h\13\b\3\t\3\t\3\t\3\n\3\n\7\no\n\n\f\n\16\nr\13\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f}\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\5"+
		"\4\2\5\5\24\25\3\2\31\32\3\2\33\34\u0082\2\30\3\2\2\2\4\34\3\2\2\2\6&"+
		"\3\2\2\2\b\61\3\2\2\2\nU\3\2\2\2\f]\3\2\2\2\16`\3\2\2\2\20i\3\2\2\2\22"+
		"l\3\2\2\2\24s\3\2\2\2\26|\3\2\2\2\30\31\5\4\3\2\31\32\7\f\2\2\32\3\3\2"+
		"\2\2\33\35\5\6\4\2\34\33\3\2\2\2\34\35\3\2\2\2\35!\3\2\2\2\36 \5\b\5\2"+
		"\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$"+
		"%\5\n\6\2%\5\3\2\2\2&\'\7\r\2\2\',\7\35\2\2()\7\n\2\2)+\7\35\2\2*(\3\2"+
		"\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\13\2\2\60"+
		"\7\3\2\2\2\61\62\7\26\2\2\62\63\7\35\2\2\63\64\7\13\2\2\64\65\5\4\3\2"+
		"\65\66\7\13\2\2\66\t\3\2\2\2\678\7\t\2\289\7\35\2\29V\5\16\b\2:;\7\20"+
		"\2\2;V\7\35\2\2<=\7\6\2\2=V\7\35\2\2>?\7\3\2\2?@\5\n\6\2@F\7\13\2\2AB"+
		"\5\n\6\2BC\7\13\2\2CE\3\2\2\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2"+
		"GI\3\2\2\2HF\3\2\2\2IJ\7\4\2\2JV\3\2\2\2KL\7\16\2\2LM\5\f\7\2MN\7\17\2"+
		"\2NO\5\n\6\2OV\3\2\2\2PQ\7\22\2\2QR\5\f\7\2RS\7\7\2\2ST\5\n\6\2TV\3\2"+
		"\2\2U\67\3\2\2\2U:\3\2\2\2U<\3\2\2\2U>\3\2\2\2UK\3\2\2\2UP\3\2\2\2V\13"+
		"\3\2\2\2WX\7\b\2\2X^\5\16\b\2YZ\5\16\b\2Z[\t\2\2\2[\\\5\16\b\2\\^\3\2"+
		"\2\2]W\3\2\2\2]Y\3\2\2\2^\r\3\2\2\2_a\t\3\2\2`_\3\2\2\2`a\3\2\2\2ab\3"+
		"\2\2\2bf\5\22\n\2ce\5\20\t\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g"+
		"\17\3\2\2\2hf\3\2\2\2ij\t\3\2\2jk\5\22\n\2k\21\3\2\2\2lp\5\26\f\2mo\5"+
		"\24\13\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\23\3\2\2\2rp\3\2\2\2"+
		"st\t\4\2\2tu\5\26\f\2u\25\3\2\2\2v}\7\35\2\2w}\7\36\2\2xy\7\27\2\2yz\5"+
		"\16\b\2z{\7\30\2\2{}\3\2\2\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2}\27\3\2\2\2"+
		"\f\34!,FU]`fp|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}