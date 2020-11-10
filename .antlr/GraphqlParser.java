// Generated from /home/yannsdebian/Documents/TEC/semestre7/compilers/proyecto/CompiladoresFinal/Graphql.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, NUM=12;
	public static final int
		RULE_expr = 0, RULE_table = 1, RULE_conditions = 2, RULE_condition = 3, 
		RULE_logop = 4, RULE_params = 5, RULE_param = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "table", "conditions", "condition", "logop", "params", "param"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "':'", "'_eq'", "'_gt'", "'_lt'", "'_gte'", 
			"'_lte'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"NUM"
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
	public String getGrammarFileName() { return "Graphql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraphqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			table();
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(15);
				match(T__0);
				setState(16);
				conditions();
				setState(17);
				match(T__1);
				}
			}

			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(21);
				match(T__2);
				setState(22);
				params();
				setState(23);
				match(T__3);
				}
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

	public static class TableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(ID);
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

	public static class ConditionsContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conditions);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				condition();
				setState(30);
				conditions();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdOPidContext extends ConditionContext {
		public List<TerminalNode> ID() { return getTokens(GraphqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphqlParser.ID, i);
		}
		public LogopContext logop() {
			return getRuleContext(LogopContext.class,0);
		}
		public IdOPidContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	public static class IdOPnumContext extends ConditionContext {
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public LogopContext logop() {
			return getRuleContext(LogopContext.class,0);
		}
		public TerminalNode NUM() { return getToken(GraphqlParser.NUM, 0); }
		public IdOPnumContext(ConditionContext ctx) { copyFrom(ctx); }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new IdOPidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(ID);
				setState(36);
				logop();
				setState(37);
				match(ID);
				}
				break;
			case 2:
				_localctx = new IdOPnumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(ID);
				setState(40);
				logop();
				setState(41);
				match(NUM);
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

	public static class LogopContext extends ParserRuleContext {
		public LogopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logop; }
	 
		public LogopContext() { }
		public void copyFrom(LogopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualOPContext extends LogopContext {
		public EqualOPContext(LogopContext ctx) { copyFrom(ctx); }
	}
	public static class EqOPContext extends LogopContext {
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public EqOPContext(LogopContext ctx) { copyFrom(ctx); }
	}
	public static class LteOPContext extends LogopContext {
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public LteOPContext(LogopContext ctx) { copyFrom(ctx); }
	}
	public static class GteOPContext extends LogopContext {
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public GteOPContext(LogopContext ctx) { copyFrom(ctx); }
	}
	public static class LtOPContext extends LogopContext {
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public LtOPContext(LogopContext ctx) { copyFrom(ctx); }
	}
	public static class GtOPContext extends LogopContext {
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public GtOPContext(LogopContext ctx) { copyFrom(ctx); }
	}

	public final LogopContext logop() throws RecognitionException {
		LogopContext _localctx = new LogopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logop);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new EqualOPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new EqOPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(ID);
				setState(47);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new GtOPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(ID);
				setState(49);
				match(T__6);
				}
				break;
			case 4:
				_localctx = new LtOPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(ID);
				setState(51);
				match(T__7);
				}
				break;
			case 5:
				_localctx = new GteOPContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(ID);
				setState(53);
				match(T__8);
				}
				break;
			case 6:
				_localctx = new LteOPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				match(ID);
				setState(55);
				match(T__9);
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

	public static class ParamsContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				param();
				setState(59);
				params();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(ID);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(65);
					match(T__0);
					setState(66);
					conditions();
					setState(67);
					match(T__1);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				expr();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\5\2\26"+
		"\n\2\3\2\3\2\3\2\3\2\5\2\34\n\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4$\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5.\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3\b\3\b\3\b\5\bH"+
		"\n\b\3\b\5\bK\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2Q\2\20\3\2\2\2\4\35\3"+
		"\2\2\2\6#\3\2\2\2\b-\3\2\2\2\n:\3\2\2\2\f@\3\2\2\2\16J\3\2\2\2\20\25\5"+
		"\4\3\2\21\22\7\3\2\2\22\23\5\6\4\2\23\24\7\4\2\2\24\26\3\2\2\2\25\21\3"+
		"\2\2\2\25\26\3\2\2\2\26\33\3\2\2\2\27\30\7\5\2\2\30\31\5\f\7\2\31\32\7"+
		"\6\2\2\32\34\3\2\2\2\33\27\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\36\7"+
		"\r\2\2\36\5\3\2\2\2\37 \5\b\5\2 !\5\6\4\2!$\3\2\2\2\"$\3\2\2\2#\37\3\2"+
		"\2\2#\"\3\2\2\2$\7\3\2\2\2%&\7\r\2\2&\'\5\n\6\2\'(\7\r\2\2(.\3\2\2\2)"+
		"*\7\r\2\2*+\5\n\6\2+,\7\16\2\2,.\3\2\2\2-%\3\2\2\2-)\3\2\2\2.\t\3\2\2"+
		"\2/;\7\7\2\2\60\61\7\r\2\2\61;\7\b\2\2\62\63\7\r\2\2\63;\7\t\2\2\64\65"+
		"\7\r\2\2\65;\7\n\2\2\66\67\7\r\2\2\67;\7\13\2\289\7\r\2\29;\7\f\2\2:/"+
		"\3\2\2\2:\60\3\2\2\2:\62\3\2\2\2:\64\3\2\2\2:\66\3\2\2\2:8\3\2\2\2;\13"+
		"\3\2\2\2<=\5\16\b\2=>\5\f\7\2>A\3\2\2\2?A\3\2\2\2@<\3\2\2\2@?\3\2\2\2"+
		"A\r\3\2\2\2BG\7\r\2\2CD\7\3\2\2DE\5\6\4\2EF\7\4\2\2FH\3\2\2\2GC\3\2\2"+
		"\2GH\3\2\2\2HK\3\2\2\2IK\5\2\2\2JB\3\2\2\2JI\3\2\2\2K\17\3\2\2\2\n\25"+
		"\33#-:@GJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}