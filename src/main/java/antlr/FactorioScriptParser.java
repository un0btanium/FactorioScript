package antlr;
// Generated from FactorioScript.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FactorioScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMPILERSIGN=1, STANDARD=2, ALIAS=3, ALIASASSIGN=4, IF=5, ELSEIF=6, ELSE=7, 
		BRACKET_OPEN=8, BRACKET_CLOSE=9, BRACE_OPEN=10, BRACE_CLOSE=11, ASTERISK=12, 
		SLASH=13, MODULO=14, PLUS=15, MINUS=16, BIT_LEFT=17, BIT_RIGHT=18, BIT_AND=19, 
		BIT_OR=20, BIT_XOR=21, POWER=22, EQUAL=23, NOTEQUAL=24, GREATER=25, LOWER=26, 
		GREATEREQUAL=27, LOWEREQUAL=28, ASSIGN=29, NUMBER=30, VAR=31, WS=32;
	public static final int
		RULE_statementList = 0, RULE_statement = 1, RULE_statementCompiler = 2, 
		RULE_statementAssign = 3, RULE_statementIf = 4, RULE_expression = 5, RULE_condition = 6;
	public static final String[] ruleNames = {
		"statementList", "statement", "statementCompiler", "statementAssign", 
		"statementIf", "expression", "condition"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", null, null, "'=>'", null, null, null, "'('", "')'", "'{'", 
		"'}'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'AND'", "'OR'", 
		"'XOR'", "'^'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMPILERSIGN", "STANDARD", "ALIAS", "ALIASASSIGN", "IF", "ELSEIF", 
		"ELSE", "BRACKET_OPEN", "BRACKET_CLOSE", "BRACE_OPEN", "BRACE_CLOSE", 
		"ASTERISK", "SLASH", "MODULO", "PLUS", "MINUS", "BIT_LEFT", "BIT_RIGHT", 
		"BIT_AND", "BIT_OR", "BIT_XOR", "POWER", "EQUAL", "NOTEQUAL", "GREATER", 
		"LOWER", "GREATEREQUAL", "LOWEREQUAL", "ASSIGN", "NUMBER", "VAR", "WS"
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
	public String getGrammarFileName() { return "FactorioScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FactorioScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementListContext extends ParserRuleContext {
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	 
		public StatementListContext() { }
		public void copyFrom(StatementListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleStatementListContext extends StatementListContext {
		public StatementContext s;
		public StatementListContext sl;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public MultipleStatementListContext(StatementListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterMultipleStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitMultipleStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitMultipleStatementList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleStatementListContext extends StatementListContext {
		public StatementContext s;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleStatementListContext(StatementListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterSingleStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitSingleStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitSingleStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statementList);
		try {
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new MultipleStatementListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				((MultipleStatementListContext)_localctx).s = statement();
				setState(15);
				((MultipleStatementListContext)_localctx).sl = statementList();
				}
				break;
			case 2:
				_localctx = new SingleStatementListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				((SingleStatementListContext)_localctx).s = statement();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementCompilerContext statementCompiler() {
			return getRuleContext(StatementCompilerContext.class,0);
		}
		public StatementAssignContext statementAssign() {
			return getRuleContext(StatementAssignContext.class,0);
		}
		public StatementIfContext statementIf() {
			return getRuleContext(StatementIfContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMPILERSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				statementCompiler();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				statementAssign();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				statementIf();
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

	public static class StatementCompilerContext extends ParserRuleContext {
		public StatementCompilerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementCompiler; }
	 
		public StatementCompilerContext() { }
		public void copyFrom(StatementCompilerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompilerAliasContext extends StatementCompilerContext {
		public Token varOld;
		public Token varAlias;
		public TerminalNode COMPILERSIGN() { return getToken(FactorioScriptParser.COMPILERSIGN, 0); }
		public TerminalNode ALIAS() { return getToken(FactorioScriptParser.ALIAS, 0); }
		public TerminalNode ALIASASSIGN() { return getToken(FactorioScriptParser.ALIASASSIGN, 0); }
		public List<TerminalNode> VAR() { return getTokens(FactorioScriptParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(FactorioScriptParser.VAR, i);
		}
		public CompilerAliasContext(StatementCompilerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterCompilerAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitCompilerAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitCompilerAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompilerStandardContext extends StatementCompilerContext {
		public Token varLeft;
		public Token varRight;
		public TerminalNode COMPILERSIGN() { return getToken(FactorioScriptParser.COMPILERSIGN, 0); }
		public TerminalNode STANDARD() { return getToken(FactorioScriptParser.STANDARD, 0); }
		public TerminalNode ALIASASSIGN() { return getToken(FactorioScriptParser.ALIASASSIGN, 0); }
		public List<TerminalNode> VAR() { return getTokens(FactorioScriptParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(FactorioScriptParser.VAR, i);
		}
		public CompilerStandardContext(StatementCompilerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterCompilerStandard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitCompilerStandard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitCompilerStandard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementCompilerContext statementCompiler() throws RecognitionException {
		StatementCompilerContext _localctx = new StatementCompilerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statementCompiler);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new CompilerStandardContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(COMPILERSIGN);
				setState(26);
				match(STANDARD);
				setState(27);
				match(ALIASASSIGN);
				setState(28);
				((CompilerStandardContext)_localctx).varLeft = match(VAR);
				setState(29);
				((CompilerStandardContext)_localctx).varRight = match(VAR);
				}
				break;
			case 2:
				_localctx = new CompilerAliasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(COMPILERSIGN);
				setState(31);
				match(ALIAS);
				setState(32);
				((CompilerAliasContext)_localctx).varOld = match(VAR);
				setState(33);
				match(ALIASASSIGN);
				setState(34);
				((CompilerAliasContext)_localctx).varAlias = match(VAR);
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

	public static class StatementAssignContext extends ParserRuleContext {
		public StatementAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssign; }
	 
		public StatementAssignContext() { }
		public void copyFrom(StatementAssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddStatementAssignContext extends StatementAssignContext {
		public Token var;
		public ExpressionContext expr;
		public TerminalNode PLUS() { return getToken(FactorioScriptParser.PLUS, 0); }
		public TerminalNode ASSIGN() { return getToken(FactorioScriptParser.ASSIGN, 0); }
		public TerminalNode VAR() { return getToken(FactorioScriptParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AddStatementAssignContext(StatementAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterAddStatementAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitAddStatementAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitAddStatementAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubStatementAssignContext extends StatementAssignContext {
		public Token var;
		public ExpressionContext expr;
		public TerminalNode MINUS() { return getToken(FactorioScriptParser.MINUS, 0); }
		public TerminalNode ASSIGN() { return getToken(FactorioScriptParser.ASSIGN, 0); }
		public TerminalNode VAR() { return getToken(FactorioScriptParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubStatementAssignContext(StatementAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterSubStatementAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitSubStatementAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitSubStatementAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverwriteStatementAssignContext extends StatementAssignContext {
		public Token var;
		public ExpressionContext expr;
		public TerminalNode ASSIGN() { return getToken(FactorioScriptParser.ASSIGN, 0); }
		public TerminalNode VAR() { return getToken(FactorioScriptParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OverwriteStatementAssignContext(StatementAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterOverwriteStatementAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitOverwriteStatementAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitOverwriteStatementAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignContext statementAssign() throws RecognitionException {
		StatementAssignContext _localctx = new StatementAssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statementAssign);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new OverwriteStatementAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((OverwriteStatementAssignContext)_localctx).var = match(VAR);
				setState(38);
				match(ASSIGN);
				setState(39);
				((OverwriteStatementAssignContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				_localctx = new AddStatementAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				((AddStatementAssignContext)_localctx).var = match(VAR);
				setState(41);
				match(PLUS);
				setState(42);
				match(ASSIGN);
				setState(43);
				((AddStatementAssignContext)_localctx).expr = expression(0);
				}
				break;
			case 3:
				_localctx = new SubStatementAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				((SubStatementAssignContext)_localctx).var = match(VAR);
				setState(45);
				match(MINUS);
				setState(46);
				match(ASSIGN);
				setState(47);
				((SubStatementAssignContext)_localctx).expr = expression(0);
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

	public static class StatementIfContext extends ParserRuleContext {
		public StatementIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementIf; }
	 
		public StatementIfContext() { }
		public void copyFrom(StatementIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfElseStatementContext extends StatementIfContext {
		public TerminalNode IF() { return getToken(FactorioScriptParser.IF, 0); }
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(FactorioScriptParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(FactorioScriptParser.BRACKET_OPEN, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(FactorioScriptParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(FactorioScriptParser.BRACKET_CLOSE, i);
		}
		public List<TerminalNode> BRACE_OPEN() { return getTokens(FactorioScriptParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(FactorioScriptParser.BRACE_OPEN, i);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(FactorioScriptParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(FactorioScriptParser.BRACE_CLOSE, i);
		}
		public TerminalNode ELSE() { return getToken(FactorioScriptParser.ELSE, 0); }
		public IfElseStatementContext(StatementIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementIfContext {
		public TerminalNode IF() { return getToken(FactorioScriptParser.IF, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(FactorioScriptParser.BRACKET_OPEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(FactorioScriptParser.BRACKET_CLOSE, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(FactorioScriptParser.BRACE_OPEN, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(FactorioScriptParser.BRACE_CLOSE, 0); }
		public IfStatementContext(StatementIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseIfElseStatementContext extends StatementIfContext {
		public TerminalNode IF() { return getToken(FactorioScriptParser.IF, 0); }
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(FactorioScriptParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(FactorioScriptParser.BRACKET_OPEN, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(FactorioScriptParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(FactorioScriptParser.BRACKET_CLOSE, i);
		}
		public List<TerminalNode> BRACE_OPEN() { return getTokens(FactorioScriptParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(FactorioScriptParser.BRACE_OPEN, i);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(FactorioScriptParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(FactorioScriptParser.BRACE_CLOSE, i);
		}
		public TerminalNode ELSEIF() { return getToken(FactorioScriptParser.ELSEIF, 0); }
		public TerminalNode ELSE() { return getToken(FactorioScriptParser.ELSE, 0); }
		public IfElseIfElseStatementContext(StatementIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterIfElseIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitIfElseIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitIfElseIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementIfContext statementIf() throws RecognitionException {
		StatementIfContext _localctx = new StatementIfContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementIf);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IfElseIfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(IF);
				setState(51);
				match(BRACKET_OPEN);
				setState(52);
				condition();
				setState(53);
				match(BRACKET_CLOSE);
				setState(54);
				match(BRACE_OPEN);
				setState(55);
				statementList();
				setState(56);
				match(BRACE_CLOSE);
				setState(57);
				match(ELSEIF);
				setState(58);
				match(BRACKET_OPEN);
				setState(59);
				condition();
				setState(60);
				match(BRACKET_CLOSE);
				setState(61);
				match(BRACE_OPEN);
				setState(62);
				statementList();
				setState(63);
				match(BRACE_CLOSE);
				setState(64);
				match(ELSE);
				setState(65);
				match(BRACKET_OPEN);
				setState(66);
				condition();
				setState(67);
				match(BRACKET_CLOSE);
				setState(68);
				match(BRACE_OPEN);
				setState(69);
				statementList();
				setState(70);
				match(BRACE_CLOSE);
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(IF);
				setState(73);
				match(BRACKET_OPEN);
				setState(74);
				condition();
				setState(75);
				match(BRACKET_CLOSE);
				setState(76);
				match(BRACE_OPEN);
				setState(77);
				statementList();
				setState(78);
				match(BRACE_CLOSE);
				setState(79);
				match(ELSE);
				setState(80);
				match(BRACKET_OPEN);
				setState(81);
				condition();
				setState(82);
				match(BRACKET_CLOSE);
				setState(83);
				match(BRACE_OPEN);
				setState(84);
				statementList();
				setState(85);
				match(BRACE_CLOSE);
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(IF);
				setState(88);
				match(BRACKET_OPEN);
				setState(89);
				condition();
				setState(90);
				match(BRACKET_CLOSE);
				setState(91);
				match(BRACE_OPEN);
				setState(92);
				statementList();
				setState(93);
				match(BRACE_CLOSE);
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
	public static class VarExpContext extends ExpressionContext {
		public Token variable;
		public TerminalNode VAR() { return getToken(FactorioScriptParser.VAR, 0); }
		public VarExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterVarExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitVarExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitVarExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivModExpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operand;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(FactorioScriptParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(FactorioScriptParser.SLASH, 0); }
		public TerminalNode MODULO() { return getToken(FactorioScriptParser.MODULO, 0); }
		public MulDivModExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterMulDivModExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitMulDivModExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitMulDivModExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExpContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode POWER() { return getToken(FactorioScriptParser.POWER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PowExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterPowExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitPowExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitPowExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitExpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operand;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BIT_LEFT() { return getToken(FactorioScriptParser.BIT_LEFT, 0); }
		public TerminalNode BIT_RIGHT() { return getToken(FactorioScriptParser.BIT_RIGHT, 0); }
		public TerminalNode BIT_AND() { return getToken(FactorioScriptParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(FactorioScriptParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(FactorioScriptParser.BIT_XOR, 0); }
		public BitExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterBitExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitBitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitBitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriorityExpContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode BRACKET_OPEN() { return getToken(FactorioScriptParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(FactorioScriptParser.BRACKET_CLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PriorityExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterPriorityExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitPriorityExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitPriorityExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operand;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(FactorioScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FactorioScriptParser.MINUS, 0); }
		public AddSubExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterAddSubExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitAddSubExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitAddSubExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExpContext extends ExpressionContext {
		public Token number;
		public TerminalNode NUMBER() { return getToken(FactorioScriptParser.NUMBER, 0); }
		public NumExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterNumExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitNumExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitNumExp(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACKET_OPEN:
				{
				_localctx = new PriorityExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(98);
				match(BRACKET_OPEN);
				setState(99);
				((PriorityExpContext)_localctx).expr = expression(0);
				setState(100);
				match(BRACKET_CLOSE);
				}
				break;
			case VAR:
				{
				_localctx = new VarExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				((VarExpContext)_localctx).variable = match(VAR);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				((NumExpContext)_localctx).number = match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModExpContext(new ExpressionContext(_parentctx, _parentState));
						((MulDivModExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(107);
						((MulDivModExpContext)_localctx).operand = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASTERISK) | (1L << SLASH) | (1L << MODULO))) != 0)) ) {
							((MulDivModExpContext)_localctx).operand = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						((MulDivModExpContext)_localctx).right = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpContext(new ExpressionContext(_parentctx, _parentState));
						((AddSubExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(110);
						((AddSubExpContext)_localctx).operand = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddSubExpContext)_localctx).operand = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(111);
						((AddSubExpContext)_localctx).right = expression(6);
						}
						break;
					case 3:
						{
						_localctx = new BitExpContext(new ExpressionContext(_parentctx, _parentState));
						((BitExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(113);
						((BitExpContext)_localctx).operand = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIT_LEFT) | (1L << BIT_RIGHT) | (1L << BIT_AND) | (1L << BIT_OR) | (1L << BIT_XOR))) != 0)) ) {
							((BitExpContext)_localctx).operand = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(114);
						((BitExpContext)_localctx).right = expression(5);
						}
						break;
					case 4:
						{
						_localctx = new PowExpContext(new ExpressionContext(_parentctx, _parentState));
						((PowExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(116);
						match(POWER);
						setState(117);
						((PowExpContext)_localctx).right = expression(3);
						}
						break;
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(FactorioScriptParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(FactorioScriptParser.NOTEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(FactorioScriptParser.GREATER, 0); }
		public TerminalNode LOWER() { return getToken(FactorioScriptParser.LOWER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(FactorioScriptParser.GREATEREQUAL, 0); }
		public TerminalNode LOWEREQUAL() { return getToken(FactorioScriptParser.LOWEREQUAL, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FactorioScriptListener ) ((FactorioScriptListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FactorioScriptVisitor ) return ((FactorioScriptVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			expression(0);
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << GREATER) | (1L << LOWER) | (1L << GREATEREQUAL) | (1L << LOWEREQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(125);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0082\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\5\2\25"+
		"\n\2\3\3\3\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4&\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7k\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7y\n\7\f\7"+
		"\16\7|\13\7\3\b\3\b\3\b\3\b\3\b\2\3\f\t\2\4\6\b\n\f\16\2\6\3\2\16\20\3"+
		"\2\21\22\3\2\23\27\3\2\31\36\2\u0088\2\24\3\2\2\2\4\31\3\2\2\2\6%\3\2"+
		"\2\2\b\62\3\2\2\2\na\3\2\2\2\fj\3\2\2\2\16}\3\2\2\2\20\21\5\4\3\2\21\22"+
		"\5\2\2\2\22\25\3\2\2\2\23\25\5\4\3\2\24\20\3\2\2\2\24\23\3\2\2\2\25\3"+
		"\3\2\2\2\26\32\5\6\4\2\27\32\5\b\5\2\30\32\5\n\6\2\31\26\3\2\2\2\31\27"+
		"\3\2\2\2\31\30\3\2\2\2\32\5\3\2\2\2\33\34\7\3\2\2\34\35\7\4\2\2\35\36"+
		"\7\6\2\2\36\37\7!\2\2\37&\7!\2\2 !\7\3\2\2!\"\7\5\2\2\"#\7!\2\2#$\7\6"+
		"\2\2$&\7!\2\2%\33\3\2\2\2% \3\2\2\2&\7\3\2\2\2\'(\7!\2\2()\7\37\2\2)\63"+
		"\5\f\7\2*+\7!\2\2+,\7\21\2\2,-\7\37\2\2-\63\5\f\7\2./\7!\2\2/\60\7\22"+
		"\2\2\60\61\7\37\2\2\61\63\5\f\7\2\62\'\3\2\2\2\62*\3\2\2\2\62.\3\2\2\2"+
		"\63\t\3\2\2\2\64\65\7\7\2\2\65\66\7\n\2\2\66\67\5\16\b\2\678\7\13\2\2"+
		"89\7\f\2\29:\5\2\2\2:;\7\r\2\2;<\7\b\2\2<=\7\n\2\2=>\5\16\b\2>?\7\13\2"+
		"\2?@\7\f\2\2@A\5\2\2\2AB\7\r\2\2BC\7\t\2\2CD\7\n\2\2DE\5\16\b\2EF\7\13"+
		"\2\2FG\7\f\2\2GH\5\2\2\2HI\7\r\2\2Ib\3\2\2\2JK\7\7\2\2KL\7\n\2\2LM\5\16"+
		"\b\2MN\7\13\2\2NO\7\f\2\2OP\5\2\2\2PQ\7\r\2\2QR\7\t\2\2RS\7\n\2\2ST\5"+
		"\16\b\2TU\7\13\2\2UV\7\f\2\2VW\5\2\2\2WX\7\r\2\2Xb\3\2\2\2YZ\7\7\2\2Z"+
		"[\7\n\2\2[\\\5\16\b\2\\]\7\13\2\2]^\7\f\2\2^_\5\2\2\2_`\7\r\2\2`b\3\2"+
		"\2\2a\64\3\2\2\2aJ\3\2\2\2aY\3\2\2\2b\13\3\2\2\2cd\b\7\1\2de\7\n\2\2e"+
		"f\5\f\7\2fg\7\13\2\2gk\3\2\2\2hk\7!\2\2ik\7 \2\2jc\3\2\2\2jh\3\2\2\2j"+
		"i\3\2\2\2kz\3\2\2\2lm\f\b\2\2mn\t\2\2\2ny\5\f\7\top\f\7\2\2pq\t\3\2\2"+
		"qy\5\f\7\brs\f\6\2\2st\t\4\2\2ty\5\f\7\7uv\f\5\2\2vw\7\30\2\2wy\5\f\7"+
		"\5xl\3\2\2\2xo\3\2\2\2xr\3\2\2\2xu\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2"+
		"\2{\r\3\2\2\2|z\3\2\2\2}~\5\f\7\2~\177\t\5\2\2\177\u0080\5\f\7\2\u0080"+
		"\17\3\2\2\2\n\24\31%\62ajxz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}