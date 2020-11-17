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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, INTROSPECTION=20, BOOLEAN=21, FLOAT=22, NULL=23, STRING=24, 
		QUERY=25, NUM=26, ID=27, WS=28, COMMENT=29;
	public static final int
		RULE_expr = 0, RULE_querydef = 1, RULE_fragmentDef = 2, RULE_table = 3, 
		RULE_condition = 4, RULE_factor = 5, RULE_assignment = 6, RULE_conditions = 7, 
		RULE_logop = 8, RULE_params = 9, RULE_param = 10, RULE_value = 11, RULE_variable = 12, 
		RULE_alias = 13, RULE_fragmentQ = 14, RULE_directive = 15, RULE_introspection = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "querydef", "fragmentDef", "table", "condition", "factor", "assignment", 
			"conditions", "logop", "params", "param", "value", "variable", "alias", 
			"fragmentQ", "directive", "introspection"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'fragment'", "'on'", "'='", "','", 
			"':'", "'_eq'", "'_gt'", "'_lt'", "'_gte'", "'_lte'", "'$'", "'...'", 
			"'@include'", "'if'", "'@skip'", null, null, null, "'null'", null, "'query'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "INTROSPECTION", "BOOLEAN", 
			"FLOAT", "NULL", "STRING", "QUERY", "NUM", "ID", "WS", "COMMENT"
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryexprContext extends ExprContext {
		public QuerydefContext querydef() {
			return getRuleContext(QuerydefContext.class,0);
		}
		public QueryexprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FragexprContext extends ExprContext {
		public FragmentDefContext fragmentDef() {
			return getRuleContext(FragmentDefContext.class,0);
		}
		public FragexprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUERY:
				_localctx = new QueryexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				querydef();
				}
				break;
			case T__4:
				_localctx = new FragexprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				fragmentDef();
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

	public static class QuerydefContext extends ParserRuleContext {
		public QuerydefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querydef; }
	 
		public QuerydefContext() { }
		public void copyFrom(QuerydefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefqueryContext extends QuerydefContext {
		public TerminalNode QUERY() { return getToken(GraphqlParser.QUERY, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public DefqueryContext(QuerydefContext ctx) { copyFrom(ctx); }
	}

	public final QuerydefContext querydef() throws RecognitionException {
		QuerydefContext _localctx = new QuerydefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_querydef);
		int _la;
		try {
			_localctx = new DefqueryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(QUERY);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(39);
				match(ID);
				}
			}

			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(42);
				match(T__0);
				setState(43);
				conditions();
				setState(44);
				match(T__1);
				}
			}

			setState(48);
			match(T__2);
			setState(49);
			table();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(50);
				match(T__0);
				setState(51);
				conditions();
				setState(52);
				match(T__1);
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(56);
				match(T__2);
				setState(57);
				params();
				setState(58);
				match(T__3);
				}
			}

			setState(62);
			match(T__3);
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

	public static class FragmentDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FragmentDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentDef; }
	}

	public final FragmentDefContext fragmentDef() throws RecognitionException {
		FragmentDefContext _localctx = new FragmentDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fragmentDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__4);
			setState(65);
			match(ID);
			setState(66);
			match(T__5);
			setState(67);
			table();
			setState(68);
			match(T__2);
			setState(69);
			params();
			setState(70);
			match(T__3);
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
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
	 
		public TableContext() { }
		public void copyFrom(TableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableDefContext extends TableContext {
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public TableDefContext(TableContext ctx) { copyFrom(ctx); }
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table);
		try {
			_localctx = new TableDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
	public static class IdOPvalContext extends ConditionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LogopContext logop() {
			return getRuleContext(LogopContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public IdOPvalContext(ConditionContext ctx) { copyFrom(ctx); }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			_localctx = new IdOPvalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			value();
			setState(75);
			logop();
			setState(76);
			factor();
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
	public static class FactorAssValueContext extends FactorContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FactorAssValueContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class FactorValueContext extends FactorContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FactorValueContext(FactorContext ctx) { copyFrom(ctx); }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factor);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new FactorValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				value();
				}
				break;
			case 2:
				_localctx = new FactorAssValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				value();
				setState(80);
				assignment();
				setState(81);
				value();
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
	public static class DefvarContext extends AssignmentContext {
		public DefvarContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			_localctx = new DefvarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__6);
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
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	 
		public ConditionsContext() { }
		public void copyFrom(ConditionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionconditionsContext extends ConditionsContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ConditionconditionsContext(ConditionsContext ctx) { copyFrom(ctx); }
	}
	public static class EmptyconditionContext extends ConditionsContext {
		public EmptyconditionContext(ConditionsContext ctx) { copyFrom(ctx); }
	}
	public static class SingleconditionContext extends ConditionsContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SingleconditionContext(ConditionsContext ctx) { copyFrom(ctx); }
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditions);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ConditionconditionsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				condition();
				setState(88);
				match(T__7);
				setState(89);
				conditions();
				}
				break;
			case 2:
				_localctx = new SingleconditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				condition();
				}
				break;
			case 3:
				_localctx = new EmptyconditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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
		public EqOPContext(LogopContext ctx) { copyFrom(ctx); }
	}
	public static class LteOPContext extends LogopContext {
		public LteOPContext(LogopContext ctx) { copyFrom(ctx); }
	}
	public static class GteOPContext extends LogopContext {
		public GteOPContext(LogopContext ctx) { copyFrom(ctx); }
	}
	public static class LtOPContext extends LogopContext {
		public LtOPContext(LogopContext ctx) { copyFrom(ctx); }
	}
	public static class GtOPContext extends LogopContext {
		public GtOPContext(LogopContext ctx) { copyFrom(ctx); }
	}

	public final LogopContext logop() throws RecognitionException {
		LogopContext _localctx = new LogopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logop);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new EqualOPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new EqOPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new GtOPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(T__10);
				}
				break;
			case T__11:
				_localctx = new LtOPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new GteOPContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new LteOPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				match(T__13);
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

	public static class ParamsContext extends ParserRuleContext {
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	 
		public ParamsContext() { }
		public void copyFrom(ParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyParamContext extends ParamsContext {
		public EmptyParamContext(ParamsContext ctx) { copyFrom(ctx); }
	}
	public static class ParamParamsContext extends ParamsContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamParamsContext(ParamsContext ctx) { copyFrom(ctx); }
	}
	public static class ParamBracketsContext extends ParamsContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamBracketsContext(ParamsContext ctx) { copyFrom(ctx); }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_params);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case INTROSPECTION:
			case QUERY:
			case ID:
				_localctx = new ParamParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				param();
				setState(104);
				params();
				}
				break;
			case T__2:
				_localctx = new ParamBracketsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(T__2);
				setState(107);
				param();
				setState(108);
				params();
				setState(109);
				match(T__3);
				}
				break;
			case T__3:
				_localctx = new EmptyParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
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
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamIDcondContext extends ParamContext {
		public List<TerminalNode> ID() { return getTokens(GraphqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphqlParser.ID, i);
		}
		public IntrospectionContext introspection() {
			return getRuleContext(IntrospectionContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public ParamIDcondContext(ParamContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParamContext extends ParamContext {
		public QuerydefContext querydef() {
			return getRuleContext(QuerydefContext.class,0);
		}
		public IntrospectionContext introspection() {
			return getRuleContext(IntrospectionContext.class,0);
		}
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public ExprParamContext(ParamContext ctx) { copyFrom(ctx); }
	}
	public static class FragmentParamContext extends ParamContext {
		public FragmentQContext fragmentQ() {
			return getRuleContext(FragmentQContext.class,0);
		}
		public IntrospectionContext introspection() {
			return getRuleContext(IntrospectionContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public FragmentParamContext(ParamContext ctx) { copyFrom(ctx); }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_param);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ParamIDcondContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTROSPECTION) {
					{
					setState(114);
					introspection();
					}
				}

				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(117);
					match(ID);
					setState(118);
					match(T__8);
					}
					break;
				}
				setState(121);
				match(ID);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(122);
					match(T__0);
					setState(123);
					conditions();
					setState(124);
					match(T__1);
					}
				}

				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16 || _la==T__18) {
					{
					setState(128);
					directive();
					}
				}

				}
				break;
			case 2:
				_localctx = new ExprParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTROSPECTION) {
					{
					setState(131);
					introspection();
					}
				}

				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(134);
					match(ID);
					setState(135);
					match(T__8);
					}
				}

				setState(138);
				querydef();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16 || _la==T__18) {
					{
					setState(139);
					directive();
					}
				}

				}
				break;
			case 3:
				_localctx = new FragmentParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTROSPECTION) {
					{
					setState(142);
					introspection();
					}
				}

				setState(145);
				fragmentQ();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16 || _la==T__18) {
					{
					setState(146);
					directive();
					}
				}

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

	public static class ValueContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(GraphqlParser.FLOAT, 0); }
		public TerminalNode NUM() { return getToken(GraphqlParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(GraphqlParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(GraphqlParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(GraphqlParser.NULL, 0); }
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				variable();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(FLOAT);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(NUM);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(STRING);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(BOOLEAN);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				match(NULL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				match(ID);
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariablesContext extends VariableContext {
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public VariablesContext(VariableContext ctx) { copyFrom(ctx); }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		try {
			_localctx = new VariablesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__14);
			setState(161);
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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

	public static class FragmentQContext extends ParserRuleContext {
		public FragmentQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentQ; }
	 
		public FragmentQContext() { }
		public void copyFrom(FragmentQContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FragmentIDContext extends FragmentQContext {
		public TerminalNode ID() { return getToken(GraphqlParser.ID, 0); }
		public FragmentIDContext(FragmentQContext ctx) { copyFrom(ctx); }
	}
	public static class InlinefragmentContext extends FragmentQContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public InlinefragmentContext(FragmentQContext ctx) { copyFrom(ctx); }
	}

	public final FragmentQContext fragmentQ() throws RecognitionException {
		FragmentQContext _localctx = new FragmentQContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fragmentQ);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new FragmentIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__15);
				setState(166);
				match(ID);
				}
				break;
			case 2:
				_localctx = new InlinefragmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__15);
				setState(168);
				match(T__5);
				setState(169);
				table();
				setState(170);
				match(T__2);
				setState(171);
				params();
				setState(172);
				match(T__3);
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

	public static class DirectiveContext extends ParserRuleContext {
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
	 
		public DirectiveContext() { }
		public void copyFrom(DirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncludedirectiveContext extends DirectiveContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IncludedirectiveContext(DirectiveContext ctx) { copyFrom(ctx); }
	}
	public static class SkipdirectiveContext extends DirectiveContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public SkipdirectiveContext(DirectiveContext ctx) { copyFrom(ctx); }
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_directive);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new IncludedirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(T__16);
				setState(177);
				match(T__0);
				setState(178);
				match(T__17);
				setState(179);
				match(T__8);
				setState(180);
				value();
				setState(181);
				match(T__1);
				}
				break;
			case T__18:
				_localctx = new SkipdirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__18);
				setState(184);
				match(T__0);
				setState(185);
				match(T__17);
				setState(186);
				match(T__8);
				setState(187);
				value();
				setState(188);
				match(T__1);
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

	public static class IntrospectionContext extends ParserRuleContext {
		public IntrospectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_introspection; }
	 
		public IntrospectionContext() { }
		public void copyFrom(IntrospectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnyintrospectionContext extends IntrospectionContext {
		public TerminalNode INTROSPECTION() { return getToken(GraphqlParser.INTROSPECTION, 0); }
		public AnyintrospectionContext(IntrospectionContext ctx) { copyFrom(ctx); }
	}

	public final IntrospectionContext introspection() throws RecognitionException {
		IntrospectionContext _localctx = new IntrospectionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_introspection);
		try {
			_localctx = new AnyintrospectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(INTROSPECTION);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00c5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\5\2\'\n\2\3\3\3\3\5\3+\n\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\39\n\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7V"+
		"\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\nh\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13s\n\13\3\f"+
		"\5\fv\n\f\3\f\3\f\5\fz\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0081\n\f\3\f\5\f\u0084"+
		"\n\f\3\f\5\f\u0087\n\f\3\f\3\f\5\f\u008b\n\f\3\f\3\f\5\f\u008f\n\f\3\f"+
		"\5\f\u0092\n\f\3\f\3\f\5\f\u0096\n\f\5\f\u0098\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00a1\n\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00b1\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c1\n\21\3\22\3\22\3\22"+
		"\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\u00d5\2&\3\2\2"+
		"\2\4(\3\2\2\2\6B\3\2\2\2\bJ\3\2\2\2\nL\3\2\2\2\fU\3\2\2\2\16W\3\2\2\2"+
		"\20_\3\2\2\2\22g\3\2\2\2\24r\3\2\2\2\26\u0097\3\2\2\2\30\u00a0\3\2\2\2"+
		"\32\u00a2\3\2\2\2\34\u00a5\3\2\2\2\36\u00b0\3\2\2\2 \u00c0\3\2\2\2\"\u00c2"+
		"\3\2\2\2$\'\5\4\3\2%\'\5\6\4\2&$\3\2\2\2&%\3\2\2\2\'\3\3\2\2\2(*\7\33"+
		"\2\2)+\7\35\2\2*)\3\2\2\2*+\3\2\2\2+\60\3\2\2\2,-\7\3\2\2-.\5\20\t\2."+
		"/\7\4\2\2/\61\3\2\2\2\60,\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7"+
		"\5\2\2\638\5\b\5\2\64\65\7\3\2\2\65\66\5\20\t\2\66\67\7\4\2\2\679\3\2"+
		"\2\28\64\3\2\2\289\3\2\2\29>\3\2\2\2:;\7\5\2\2;<\5\24\13\2<=\7\6\2\2="+
		"?\3\2\2\2>:\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\6\2\2A\5\3\2\2\2BC\7\7\2\2"+
		"CD\7\35\2\2DE\7\b\2\2EF\5\b\5\2FG\7\5\2\2GH\5\24\13\2HI\7\6\2\2I\7\3\2"+
		"\2\2JK\7\35\2\2K\t\3\2\2\2LM\5\30\r\2MN\5\22\n\2NO\5\f\7\2O\13\3\2\2\2"+
		"PV\5\30\r\2QR\5\30\r\2RS\5\16\b\2ST\5\30\r\2TV\3\2\2\2UP\3\2\2\2UQ\3\2"+
		"\2\2V\r\3\2\2\2WX\7\t\2\2X\17\3\2\2\2YZ\5\n\6\2Z[\7\n\2\2[\\\5\20\t\2"+
		"\\`\3\2\2\2]`\5\n\6\2^`\3\2\2\2_Y\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\21\3\2"+
		"\2\2ah\7\13\2\2bh\7\f\2\2ch\7\r\2\2dh\7\16\2\2eh\7\17\2\2fh\7\20\2\2g"+
		"a\3\2\2\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\23\3\2\2"+
		"\2ij\5\26\f\2jk\5\24\13\2ks\3\2\2\2lm\7\5\2\2mn\5\26\f\2no\5\24\13\2o"+
		"p\7\6\2\2ps\3\2\2\2qs\3\2\2\2ri\3\2\2\2rl\3\2\2\2rq\3\2\2\2s\25\3\2\2"+
		"\2tv\5\"\22\2ut\3\2\2\2uv\3\2\2\2vy\3\2\2\2wx\7\35\2\2xz\7\13\2\2yw\3"+
		"\2\2\2yz\3\2\2\2z{\3\2\2\2{\u0080\7\35\2\2|}\7\3\2\2}~\5\20\t\2~\177\7"+
		"\4\2\2\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0084\5 \21\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0098\3\2\2\2\u0085\u0087\5\"\22\2\u0086\u0085\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u008a\3\2\2\2\u0088\u0089\7\35\2\2\u0089\u008b\7\13\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\5\4"+
		"\3\2\u008d\u008f\5 \21\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0098\3\2\2\2\u0090\u0092\5\"\22\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\5\36\20\2\u0094\u0096\5 \21\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097u\3\2\2\2"+
		"\u0097\u0086\3\2\2\2\u0097\u0091\3\2\2\2\u0098\27\3\2\2\2\u0099\u00a1"+
		"\5\32\16\2\u009a\u00a1\7\30\2\2\u009b\u00a1\7\34\2\2\u009c\u00a1\7\32"+
		"\2\2\u009d\u00a1\7\27\2\2\u009e\u00a1\7\31\2\2\u009f\u00a1\7\35\2\2\u00a0"+
		"\u0099\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2"+
		"\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\31\3\2\2\2\u00a2\u00a3\7\21\2\2\u00a3\u00a4\7\35\2\2\u00a4\33\3\2\2\2"+
		"\u00a5\u00a6\7\35\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\7\22\2\2\u00a8\u00b1"+
		"\7\35\2\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\7\b\2\2\u00ab\u00ac\5\b\5\2"+
		"\u00ac\u00ad\7\5\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00af\7\6\2\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00a7\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b1\37\3\2\2\2\u00b2"+
		"\u00b3\7\23\2\2\u00b3\u00b4\7\3\2\2\u00b4\u00b5\7\24\2\2\u00b5\u00b6\7"+
		"\13\2\2\u00b6\u00b7\5\30\r\2\u00b7\u00b8\7\4\2\2\u00b8\u00c1\3\2\2\2\u00b9"+
		"\u00ba\7\25\2\2\u00ba\u00bb\7\3\2\2\u00bb\u00bc\7\24\2\2\u00bc\u00bd\7"+
		"\13\2\2\u00bd\u00be\5\30\r\2\u00be\u00bf\7\4\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00b2\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c1!\3\2\2\2\u00c2\u00c3\7\26\2\2"+
		"\u00c3#\3\2\2\2\30&*\608>U_gruy\u0080\u0083\u0086\u008a\u008e\u0091\u0095"+
		"\u0097\u00a0\u00b0\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}