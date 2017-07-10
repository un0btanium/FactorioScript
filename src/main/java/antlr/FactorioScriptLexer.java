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
		SLASH=13, MODULO=14, PLUS=15, MINUS=16, BIT_LEFT=17, BIT_RIGHT=18, BIT_AND=19, 
		BIT_OR=20, BIT_XOR=21, POWER=22, EQUAL=23, NOTEQUAL=24, GREATER=25, LOWER=26, 
		GREATEREQUAL=27, LOWEREQUAL=28, ASSIGN=29, NUMBER=30, VAR=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMPILERSIGN", "STANDARD", "ALIAS", "ALIASASSIGN", "IF", "ELSEIF", "ELSE", 
		"BRACKET_OPEN", "BRACKET_CLOSE", "BRACE_OPEN", "BRACE_CLOSE", "ASTERISK", 
		"SLASH", "MODULO", "PLUS", "MINUS", "BIT_LEFT", "BIT_RIGHT", "BIT_AND", 
		"BIT_OR", "BIT_XOR", "POWER", "EQUAL", "NOTEQUAL", "GREATER", "LOWER", 
		"GREATEREQUAL", "LOWEREQUAL", "ASSIGN", "NUMBER", "VAR", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00ce\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3V\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4b\n\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0083\n\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\6\37\u00bd"+
		"\n\37\r\37\16\37\u00be\3 \3 \7 \u00c3\n \f \16 \u00c6\13 \3!\6!\u00c9"+
		"\n!\r!\16!\u00ca\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\6\3\2\62;\3\2c|\6\2//\62;C\\"+
		"c|\5\2\13\f\17\17\"\"\2\u00d5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3"+
		"C\3\2\2\2\5U\3\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13j\3\2\2\2\rx\3\2\2\2\17\u0082"+
		"\3\2\2\2\21\u0084\3\2\2\2\23\u0086\3\2\2\2\25\u0088\3\2\2\2\27\u008a\3"+
		"\2\2\2\31\u008c\3\2\2\2\33\u008e\3\2\2\2\35\u0090\3\2\2\2\37\u0092\3\2"+
		"\2\2!\u0094\3\2\2\2#\u0096\3\2\2\2%\u0099\3\2\2\2\'\u009c\3\2\2\2)\u00a0"+
		"\3\2\2\2+\u00a3\3\2\2\2-\u00a7\3\2\2\2/\u00a9\3\2\2\2\61\u00ac\3\2\2\2"+
		"\63\u00af\3\2\2\2\65\u00b1\3\2\2\2\67\u00b3\3\2\2\29\u00b6\3\2\2\2;\u00b9"+
		"\3\2\2\2=\u00bc\3\2\2\2?\u00c0\3\2\2\2A\u00c8\3\2\2\2CD\7%\2\2D\4\3\2"+
		"\2\2EF\7u\2\2FG\7v\2\2GH\7c\2\2HI\7p\2\2IJ\7f\2\2JK\7c\2\2KL\7t\2\2LV"+
		"\7f\2\2MN\7U\2\2NO\7V\2\2OP\7C\2\2PQ\7P\2\2QR\7F\2\2RS\7C\2\2ST\7T\2\2"+
		"TV\7F\2\2UE\3\2\2\2UM\3\2\2\2V\6\3\2\2\2WX\7c\2\2XY\7n\2\2YZ\7k\2\2Z["+
		"\7c\2\2[b\7u\2\2\\]\7C\2\2]^\7N\2\2^_\7K\2\2_`\7C\2\2`b\7U\2\2aW\3\2\2"+
		"\2a\\\3\2\2\2b\b\3\2\2\2cd\7?\2\2de\7@\2\2e\n\3\2\2\2fg\7k\2\2gk\7h\2"+
		"\2hi\7K\2\2ik\7H\2\2jf\3\2\2\2jh\3\2\2\2k\f\3\2\2\2lm\7g\2\2mn\7n\2\2"+
		"no\7u\2\2op\7g\2\2pq\7k\2\2qy\7h\2\2rs\7G\2\2st\7N\2\2tu\7U\2\2uv\7G\2"+
		"\2vw\7K\2\2wy\7H\2\2xl\3\2\2\2xr\3\2\2\2y\16\3\2\2\2z{\7g\2\2{|\7n\2\2"+
		"|}\7u\2\2}\u0083\7g\2\2~\177\7G\2\2\177\u0080\7N\2\2\u0080\u0081\7U\2"+
		"\2\u0081\u0083\7G\2\2\u0082z\3\2\2\2\u0082~\3\2\2\2\u0083\20\3\2\2\2\u0084"+
		"\u0085\7*\2\2\u0085\22\3\2\2\2\u0086\u0087\7+\2\2\u0087\24\3\2\2\2\u0088"+
		"\u0089\7}\2\2\u0089\26\3\2\2\2\u008a\u008b\7\177\2\2\u008b\30\3\2\2\2"+
		"\u008c\u008d\7,\2\2\u008d\32\3\2\2\2\u008e\u008f\7\61\2\2\u008f\34\3\2"+
		"\2\2\u0090\u0091\7\'\2\2\u0091\36\3\2\2\2\u0092\u0093\7-\2\2\u0093 \3"+
		"\2\2\2\u0094\u0095\7/\2\2\u0095\"\3\2\2\2\u0096\u0097\7>\2\2\u0097\u0098"+
		"\7>\2\2\u0098$\3\2\2\2\u0099\u009a\7@\2\2\u009a\u009b\7@\2\2\u009b&\3"+
		"\2\2\2\u009c\u009d\7C\2\2\u009d\u009e\7P\2\2\u009e\u009f\7F\2\2\u009f"+
		"(\3\2\2\2\u00a0\u00a1\7Q\2\2\u00a1\u00a2\7T\2\2\u00a2*\3\2\2\2\u00a3\u00a4"+
		"\7Z\2\2\u00a4\u00a5\7Q\2\2\u00a5\u00a6\7T\2\2\u00a6,\3\2\2\2\u00a7\u00a8"+
		"\7`\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa\u00ab\7?\2\2\u00ab\60"+
		"\3\2\2\2\u00ac\u00ad\7#\2\2\u00ad\u00ae\7?\2\2\u00ae\62\3\2\2\2\u00af"+
		"\u00b0\7@\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\66\3\2\2\2\u00b3"+
		"\u00b4\7@\2\2\u00b4\u00b5\7?\2\2\u00b58\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7"+
		"\u00b8\7?\2\2\u00b8:\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba<\3\2\2\2\u00bb\u00bd"+
		"\t\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf>\3\2\2\2\u00c0\u00c4\t\3\2\2\u00c1\u00c3\t\4\2\2"+
		"\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5@\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\t\5\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b!\2\2\u00cdB\3\2\2\2\13\2Uajx\u0082"+
		"\u00be\u00c4\u00ca\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}