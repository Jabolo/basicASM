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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, DIGIT=12, PLUS=13, MINUS=14, MUL=15, DIV=16, WHITESPACE=17, 
		NEWLINE=18, ANY=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "DIGIT", "PLUS", "MINUS", "MUL", "DIV", "WHITESPACE", 
			"NEWLINE", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mov'", "','", "'push'", "'int 0x80'", "'xor'", "'%eax'", "'%ebx'", 
			"'%ecx'", "'%edx'", "'('", "')'", null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"DIGIT", "PLUS", "MINUS", "MUL", "DIV", "WHITESPACE", "NEWLINE", "ANY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25r\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\5\23i\n\23\3\23\3\23\6\23m\n\23\r\23\16\23n\3\24\3\24\2\2\25"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25\3\2\4\3\2\62;\4\2\13\13\"\"\2t\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\3)\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\64\3\2\2\2\13=\3\2\2\2\r"+
		"A\3\2\2\2\17F\3\2\2\2\21K\3\2\2\2\23P\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2"+
		"\31Y\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!a\3\2\2\2#c\3\2\2\2%"+
		"l\3\2\2\2\'p\3\2\2\2)*\7o\2\2*+\7q\2\2+,\7x\2\2,\4\3\2\2\2-.\7.\2\2.\6"+
		"\3\2\2\2/\60\7r\2\2\60\61\7w\2\2\61\62\7u\2\2\62\63\7j\2\2\63\b\3\2\2"+
		"\2\64\65\7k\2\2\65\66\7p\2\2\66\67\7v\2\2\678\7\"\2\289\7\62\2\29:\7z"+
		"\2\2:;\7:\2\2;<\7\62\2\2<\n\3\2\2\2=>\7z\2\2>?\7q\2\2?@\7t\2\2@\f\3\2"+
		"\2\2AB\7\'\2\2BC\7g\2\2CD\7c\2\2DE\7z\2\2E\16\3\2\2\2FG\7\'\2\2GH\7g\2"+
		"\2HI\7d\2\2IJ\7z\2\2J\20\3\2\2\2KL\7\'\2\2LM\7g\2\2MN\7e\2\2NO\7z\2\2"+
		"O\22\3\2\2\2PQ\7\'\2\2QR\7g\2\2RS\7f\2\2ST\7z\2\2T\24\3\2\2\2UV\7*\2\2"+
		"V\26\3\2\2\2WX\7+\2\2X\30\3\2\2\2YZ\t\2\2\2Z\32\3\2\2\2[\\\7-\2\2\\\34"+
		"\3\2\2\2]^\7/\2\2^\36\3\2\2\2_`\7,\2\2` \3\2\2\2ab\7\61\2\2b\"\3\2\2\2"+
		"cd\t\3\2\2de\3\2\2\2ef\b\22\2\2f$\3\2\2\2gi\7\17\2\2hg\3\2\2\2hi\3\2\2"+
		"\2ij\3\2\2\2jm\7\f\2\2km\7\17\2\2lh\3\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2"+
		"\2\2no\3\2\2\2o&\3\2\2\2pq\13\2\2\2q(\3\2\2\2\6\2hln\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}