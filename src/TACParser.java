// Generated from C:/Users/A01207573/IdeaProjects/Compiladores2/src\TAC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TACParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NUM=16, ID=17, 
		WS=18;
	public static final int
		RULE_program = 0, RULE_stmnts = 1, RULE_stmnt = 2, RULE_op = 3, RULE_factor = 4, 
		RULE_acc = 5, RULE_assignment = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmnts", "stmnt", "op", "factor", "acc", "assignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'print'", "'('", "')'", "'goto'", "'ifTrue'", "'ifFalse'", 
			"'*'", "'/'", "'+'", "'-'", "'<'", "'['", "']'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NUM", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "TAC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TACParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StmntsContext stmnts() {
			return getRuleContext(StmntsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			stmnts(0);
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

	public static class StmntsContext extends ParserRuleContext {
		public StmntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmnts; }
	 
		public StmntsContext() { }
		public void copyFrom(StmntsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyStmntContext extends StmntsContext {
		public EmptyStmntContext(StmntsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterEmptyStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitEmptyStmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitEmptyStmnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmntsStmntContext extends StmntsContext {
		public StmntsContext stmnts() {
			return getRuleContext(StmntsContext.class,0);
		}
		public StmntContext stmnt() {
			return getRuleContext(StmntContext.class,0);
		}
		public StmntsStmntContext(StmntsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterStmntsStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitStmntsStmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitStmntsStmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmntsContext stmnts() throws RecognitionException {
		return stmnts(0);
	}

	private StmntsContext stmnts(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmntsContext _localctx = new StmntsContext(_ctx, _parentState);
		StmntsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_stmnts, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EmptyStmntContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
			setState(21);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmntsStmntContext(new StmntsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_stmnts);
					setState(17);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(18);
					stmnt();
					}
					} 
				}
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class StmntContext extends ParserRuleContext {
		public StmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmnt; }
	 
		public StmntContext() { }
		public void copyFrom(StmntContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfTrueStmntContext extends StmntContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public IfTrueStmntContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterIfTrueStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitIfTrueStmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitIfTrueStmnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStmntContext extends StmntContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public PrintStmntContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterPrintStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitPrintStmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitPrintStmnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfFalseStmntContext extends StmntContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public IfFalseStmntContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterIfFalseStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitIfFalseStmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitIfFalseStmnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotoStmntContext extends StmntContext {
		public List<TerminalNode> ID() { return getTokens(TACParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TACParser.ID, i);
		}
		public GotoStmntContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterGotoStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitGotoStmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitGotoStmnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssStmntContext extends StmntContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public AssStmntContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterAssStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitAssStmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitAssStmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmntContext stmnt() throws RecognitionException {
		StmntContext _localctx = new StmntContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmnt);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new PrintStmntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(24);
					match(ID);
					setState(25);
					match(T__0);
					}
				}

				setState(28);
				match(T__1);
				setState(29);
				match(T__2);
				setState(30);
				factor();
				setState(31);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new GotoStmntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(33);
					match(ID);
					setState(34);
					match(T__0);
					}
				}

				setState(37);
				match(T__4);
				setState(38);
				match(ID);
				}
				break;
			case 3:
				_localctx = new AssStmntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(39);
					match(ID);
					setState(40);
					match(T__0);
					}
					break;
				}
				setState(43);
				assignment();
				}
				break;
			case 4:
				_localctx = new IfTrueStmntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(T__5);
				setState(45);
				factor();
				setState(46);
				match(T__4);
				setState(47);
				match(ID);
				}
				break;
			case 5:
				_localctx = new IfFalseStmntContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(T__6);
				setState(50);
				factor();
				setState(51);
				match(T__4);
				setState(52);
				match(ID);
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	 
		public OpContext() { }
		public void copyFrom(OpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalOperatorContext extends OpContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public RelationalOperatorContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitRelationalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultOperatorContext extends OpContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public MultOperatorContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterMultOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitMultOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitMultOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusOperatorContext extends OpContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public MinusOperatorContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterMinusOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitMinusOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitMinusOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivOperatorContext extends OpContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public DivOperatorContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterDivOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitDivOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitDivOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusOperatorContext extends OpContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public PlusOperatorContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterPlusOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitPlusOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitPlusOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_op);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new MultOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				factor();
				setState(57);
				match(T__7);
				setState(58);
				factor();
				}
				break;
			case 2:
				_localctx = new DivOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				factor();
				setState(61);
				match(T__8);
				setState(62);
				factor();
				}
				break;
			case 3:
				_localctx = new PlusOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				factor();
				setState(65);
				match(T__9);
				setState(66);
				factor();
				}
				break;
			case 4:
				_localctx = new MinusOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				factor();
				setState(69);
				match(T__10);
				setState(70);
				factor();
				}
				break;
			case 5:
				_localctx = new RelationalOperatorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				factor();
				setState(73);
				match(T__11);
				setState(74);
				factor();
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
	public static class IdFactContext extends FactorContext {
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public IdFactContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterIdFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitIdFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitIdFact(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumFactContext extends FactorContext {
		public TerminalNode NUM() { return getToken(TACParser.NUM, 0); }
		public NumFactContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterNumFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitNumFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitNumFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factor);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdFactContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(ID);
				}
				break;
			case NUM:
				_localctx = new NumFactContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(NUM);
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

	public static class AccContext extends ParserRuleContext {
		public AccContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acc; }
	 
		public AccContext() { }
		public void copyFrom(AccContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IDAccContext extends AccContext {
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public IDAccContext(AccContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterIDAcc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitIDAcc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitIDAcc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAccContext extends AccContext {
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExprAccContext(AccContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterExprAcc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitExprAcc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitExprAcc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccContext acc() throws RecognitionException {
		AccContext _localctx = new AccContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_acc);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IDAccContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ExprAccContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(ID);
				setState(84);
				match(T__12);
				setState(85);
				factor();
				setState(86);
				match(T__13);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentFactContext extends AssignmentContext {
		public AccContext acc() {
			return getRuleContext(AccContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AssignmentFactContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterAssignmentFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitAssignmentFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitAssignmentFact(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentOpContext extends AssignmentContext {
		public AccContext acc() {
			return getRuleContext(AccContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public AssignmentOpContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterAssignmentOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitAssignmentOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitAssignmentOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new AssignmentOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				acc();
				setState(91);
				match(T__14);
				setState(92);
				op();
				}
				break;
			case 2:
				_localctx = new AssignmentFactContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				acc();
				setState(95);
				match(T__14);
				setState(96);
				factor();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return stmnts_sempred((StmntsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stmnts_sempred(StmntsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\4\3\4\5\4\35\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4&\n\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\5\6S\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\be\n\b\3\b\2\3\4\t\2"+
		"\4\6\b\n\f\16\2\2\2n\2\20\3\2\2\2\4\22\3\2\2\2\68\3\2\2\2\bN\3\2\2\2\n"+
		"R\3\2\2\2\fZ\3\2\2\2\16d\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\27\b\3"+
		"\1\2\23\24\f\4\2\2\24\26\5\6\4\2\25\23\3\2\2\2\26\31\3\2\2\2\27\25\3\2"+
		"\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\27\3\2\2\2\32\33\7\23\2\2\33\35\7\3"+
		"\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\7\4\2\2\37 \7\5\2"+
		"\2 !\5\n\6\2!\"\7\6\2\2\"9\3\2\2\2#$\7\23\2\2$&\7\3\2\2%#\3\2\2\2%&\3"+
		"\2\2\2&\'\3\2\2\2\'(\7\7\2\2(9\7\23\2\2)*\7\23\2\2*,\7\3\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,-\3\2\2\2-9\5\16\b\2./\7\b\2\2/\60\5\n\6\2\60\61\7\7\2\2\61"+
		"\62\7\23\2\2\629\3\2\2\2\63\64\7\t\2\2\64\65\5\n\6\2\65\66\7\7\2\2\66"+
		"\67\7\23\2\2\679\3\2\2\28\34\3\2\2\28%\3\2\2\28+\3\2\2\28.\3\2\2\28\63"+
		"\3\2\2\29\7\3\2\2\2:;\5\n\6\2;<\7\n\2\2<=\5\n\6\2=O\3\2\2\2>?\5\n\6\2"+
		"?@\7\13\2\2@A\5\n\6\2AO\3\2\2\2BC\5\n\6\2CD\7\f\2\2DE\5\n\6\2EO\3\2\2"+
		"\2FG\5\n\6\2GH\7\r\2\2HI\5\n\6\2IO\3\2\2\2JK\5\n\6\2KL\7\16\2\2LM\5\n"+
		"\6\2MO\3\2\2\2N:\3\2\2\2N>\3\2\2\2NB\3\2\2\2NF\3\2\2\2NJ\3\2\2\2O\t\3"+
		"\2\2\2PS\7\23\2\2QS\7\22\2\2RP\3\2\2\2RQ\3\2\2\2S\13\3\2\2\2T[\7\23\2"+
		"\2UV\7\23\2\2VW\7\17\2\2WX\5\n\6\2XY\7\20\2\2Y[\3\2\2\2ZT\3\2\2\2ZU\3"+
		"\2\2\2[\r\3\2\2\2\\]\5\f\7\2]^\7\21\2\2^_\5\b\5\2_e\3\2\2\2`a\5\f\7\2"+
		"ab\7\21\2\2bc\5\n\6\2ce\3\2\2\2d\\\3\2\2\2d`\3\2\2\2e\17\3\2\2\2\13\27"+
		"\34%+8NRZd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}