package antlr;
// Generated from FactorioScript.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FactorioScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMPILERSIGN=1, STANDARD=2, ALIAS=3, ALIASASSIGN=4, IF=5, ELSEIF=6, ELSE=7, 
		BRACKET_OPEN=8, BRACKET_CLOSE=9, BRACE_OPEN=10, BRACE_CLOSE=11, ASTERISK=12, 
		SLASH=13, PLUS=14, MINUS=15, POWER=16, MODULO=17, EQUAL=18, NOTEQUAL=19, 
		GREATER=20, LOWER=21, GREATEREQUAL=22, LOWEREQUAL=23, ASSIGN=24, NUMBER=25, 
		VAR=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMPILERSIGN", "STANDARD", "ALIAS", "ALIASASSIGN", "IF", "ELSEIF", "ELSE", 
		"BRACKET_OPEN", "BRACKET_CLOSE", "BRACE_OPEN", "BRACE_CLOSE", "ASTERISK", 
		"SLASH", "PLUS", "MINUS", "POWER", "MODULO", "EQUAL", "NOTEQUAL", "GREATER", 
		"LOWER", "GREATEREQUAL", "LOWEREQUAL", "ASSIGN", "NUMBER", "VAR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", null, null, "'=>'", null, null, null, "'('", "')'", "'{'", 
		"'}'", "'*'", "'/'", "'+'", "'-'", "'^'", "'%'", "'=='", "'!='", "'>'", 
		"'<'", "'>='", "'<='", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMPILERSIGN", "STANDARD", "ALIAS", "ALIASASSIGN", "IF", "ELSEIF", 
		"ELSE", "BRACKET_OPEN", "BRACKET_CLOSE", "BRACE_OPEN", "BRACE_CLOSE", 
		"ASTERISK", "SLASH", "PLUS", "MINUS", "POWER", "MODULO", "EQUAL", "NOTEQUAL", 
		"GREATER", "LOWER", "GREATEREQUAL", "LOWEREQUAL", "ASSIGN", "NUMBER", 
		"VAR", "WS"
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


	public FactorioScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FactorioScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6a\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\by\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\6\32\u00a2\n\32\r\32\16\32\u00a3\3\33\3\33\7\33\u00a8\n\33\f\33\16\33"+
		"\u00ab\13\33\3\34\6\34\u00ae\n\34\r\34\16\34\u00af\3\34\3\34\2\2\35\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\6\3\2"+
		"\62;\3\2c|\6\2//\62;C\\c|\5\2\13\f\17\17\"\"\2\u00ba\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5K\3\2\2\2\7W\3\2\2\2\t"+
		"Y\3\2\2\2\13`\3\2\2\2\rn\3\2\2\2\17x\3\2\2\2\21z\3\2\2\2\23|\3\2\2\2\25"+
		"~\3\2\2\2\27\u0080\3\2\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0086"+
		"\3\2\2\2\37\u0088\3\2\2\2!\u008a\3\2\2\2#\u008c\3\2\2\2%\u008e\3\2\2\2"+
		"\'\u0091\3\2\2\2)\u0094\3\2\2\2+\u0096\3\2\2\2-\u0098\3\2\2\2/\u009b\3"+
		"\2\2\2\61\u009e\3\2\2\2\63\u00a1\3\2\2\2\65\u00a5\3\2\2\2\67\u00ad\3\2"+
		"\2\29:\7%\2\2:\4\3\2\2\2;<\7u\2\2<=\7v\2\2=>\7c\2\2>?\7p\2\2?@\7f\2\2"+
		"@A\7c\2\2AB\7t\2\2BL\7f\2\2CD\7U\2\2DE\7V\2\2EF\7C\2\2FG\7P\2\2GH\7F\2"+
		"\2HI\7C\2\2IJ\7T\2\2JL\7F\2\2K;\3\2\2\2KC\3\2\2\2L\6\3\2\2\2MN\7c\2\2"+
		"NO\7n\2\2OP\7k\2\2PQ\7c\2\2QX\7u\2\2RS\7C\2\2ST\7N\2\2TU\7K\2\2UV\7C\2"+
		"\2VX\7U\2\2WM\3\2\2\2WR\3\2\2\2X\b\3\2\2\2YZ\7?\2\2Z[\7@\2\2[\n\3\2\2"+
		"\2\\]\7k\2\2]a\7h\2\2^_\7K\2\2_a\7H\2\2`\\\3\2\2\2`^\3\2\2\2a\f\3\2\2"+
		"\2bc\7g\2\2cd\7n\2\2de\7u\2\2ef\7g\2\2fg\7k\2\2go\7h\2\2hi\7G\2\2ij\7"+
		"N\2\2jk\7U\2\2kl\7G\2\2lm\7K\2\2mo\7H\2\2nb\3\2\2\2nh\3\2\2\2o\16\3\2"+
		"\2\2pq\7g\2\2qr\7n\2\2rs\7u\2\2sy\7g\2\2tu\7G\2\2uv\7N\2\2vw\7U\2\2wy"+
		"\7G\2\2xp\3\2\2\2xt\3\2\2\2y\20\3\2\2\2z{\7*\2\2{\22\3\2\2\2|}\7+\2\2"+
		"}\24\3\2\2\2~\177\7}\2\2\177\26\3\2\2\2\u0080\u0081\7\177\2\2\u0081\30"+
		"\3\2\2\2\u0082\u0083\7,\2\2\u0083\32\3\2\2\2\u0084\u0085\7\61\2\2\u0085"+
		"\34\3\2\2\2\u0086\u0087\7-\2\2\u0087\36\3\2\2\2\u0088\u0089\7/\2\2\u0089"+
		" \3\2\2\2\u008a\u008b\7`\2\2\u008b\"\3\2\2\2\u008c\u008d\7\'\2\2\u008d"+
		"$\3\2\2\2\u008e\u008f\7?\2\2\u008f\u0090\7?\2\2\u0090&\3\2\2\2\u0091\u0092"+
		"\7#\2\2\u0092\u0093\7?\2\2\u0093(\3\2\2\2\u0094\u0095\7@\2\2\u0095*\3"+
		"\2\2\2\u0096\u0097\7>\2\2\u0097,\3\2\2\2\u0098\u0099\7@\2\2\u0099\u009a"+
		"\7?\2\2\u009a.\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7?\2\2\u009d\60"+
		"\3\2\2\2\u009e\u009f\7?\2\2\u009f\62\3\2\2\2\u00a0\u00a2\t\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\64\3\2\2\2\u00a5\u00a9\t\3\2\2\u00a6\u00a8\t\4\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\66\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\t\5\2\2\u00ad\u00ac\3\2\2"+
		"\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b2\b\34\2\2\u00b28\3\2\2\2\13\2KW`nx\u00a3\u00a9\u00af"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}