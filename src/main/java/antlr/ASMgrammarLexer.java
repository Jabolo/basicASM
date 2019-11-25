// Generated from C:/Users/michal/IdeaProjects/projectASM/src/main\ASMgrammar.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ASMgrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NUMBER=8, REGISTER=9, 
		PLUS=10, MINUS=11, MUL=12, DIV=13, WHITESPACE=14, NEWLINE=15, ANY=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NUMBER", "REGISTER", 
			"PLUS", "MINUS", "MUL", "DIV", "WHITESPACE", "NEWLINE", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mov'", "','", "'push'", "'int 0x80'", "'xor'", "'('", "')'", 
			null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "NUMBER", "REGISTER", 
			"PLUS", "MINUS", "MUL", "DIV", "WHITESPACE", "NEWLINE", "ANY"
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


	public ASMgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ASMgrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\5\tA\n\t\3\t\6\tD\n\t\r\t\16\tE\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nX\n"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\5\20g"+
		"\n\20\3\20\3\20\6\20k\n\20\r\20\16\20l\3\21\3\21\2\2\22\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2"+
		"\4\3\2\62;\4\2\13\13\"\"\2w\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t.\3\2\2\2\13\67"+
		"\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21@\3\2\2\2\23W\3\2\2\2\25Y\3\2\2\2\27"+
		"[\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2\35a\3\2\2\2\37j\3\2\2\2!n\3\2\2\2#$"+
		"\7o\2\2$%\7q\2\2%&\7x\2\2&\4\3\2\2\2\'(\7.\2\2(\6\3\2\2\2)*\7r\2\2*+\7"+
		"w\2\2+,\7u\2\2,-\7j\2\2-\b\3\2\2\2./\7k\2\2/\60\7p\2\2\60\61\7v\2\2\61"+
		"\62\7\"\2\2\62\63\7\62\2\2\63\64\7z\2\2\64\65\7:\2\2\65\66\7\62\2\2\66"+
		"\n\3\2\2\2\678\7z\2\289\7q\2\29:\7t\2\2:\f\3\2\2\2;<\7*\2\2<\16\3\2\2"+
		"\2=>\7+\2\2>\20\3\2\2\2?A\5\27\f\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\t\2"+
		"\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\22\3\2\2\2GH\7\'\2\2HI\7"+
		"g\2\2IJ\7c\2\2JX\7z\2\2KL\7\'\2\2LM\7g\2\2MN\7d\2\2NX\7z\2\2OP\7\'\2\2"+
		"PQ\7g\2\2QR\7e\2\2RX\7z\2\2ST\7\'\2\2TU\7g\2\2UV\7f\2\2VX\7z\2\2WG\3\2"+
		"\2\2WK\3\2\2\2WO\3\2\2\2WS\3\2\2\2X\24\3\2\2\2YZ\7-\2\2Z\26\3\2\2\2[\\"+
		"\7/\2\2\\\30\3\2\2\2]^\7,\2\2^\32\3\2\2\2_`\7\61\2\2`\34\3\2\2\2ab\t\3"+
		"\2\2bc\3\2\2\2cd\b\17\2\2d\36\3\2\2\2eg\7\17\2\2fe\3\2\2\2fg\3\2\2\2g"+
		"h\3\2\2\2hk\7\f\2\2ik\7\17\2\2jf\3\2\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2"+
		"lm\3\2\2\2m \3\2\2\2no\13\2\2\2o\"\3\2\2\2\t\2@EWfjl\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}