// Generated from BigCalcProg.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BigCalcProgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, DIGIT=2, VAR=3, OP_ASSIGN=4, OP_MUL=5, OP_DIV=6, OP_ADD=7, OP_SUB=8, 
		OP_POW=9, OP_MOD=10, END_OF_STAT=11, PAR_LEFT=12, PAR_RIGHT=13, ABS_SIGN=14, 
		WS=15, COMMENT=16, LINE_COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NUMBER", "DIGIT", "VAR", "OP_ASSIGN", "OP_MUL", "OP_DIV", "OP_ADD", "OP_SUB", 
		"OP_POW", "OP_MOD", "END_OF_STAT", "PAR_LEFT", "PAR_RIGHT", "ABS_SIGN", 
		"WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'='", "'*'", "'/'", "'+'", "'-'", "'^'", "'%'", 
		"';'", "'('", "')'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "DIGIT", "VAR", "OP_ASSIGN", "OP_MUL", "OP_DIV", "OP_ADD", 
		"OP_SUB", "OP_POW", "OP_MOD", "END_OF_STAT", "PAR_LEFT", "PAR_RIGHT", 
		"ABS_SIGN", "WS", "COMMENT", "LINE_COMMENT"
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


	public BigCalcProgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BigCalcProg.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23w\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\6\2.\n\2\r\2\16\2/\3\2\6\2\63\n"+
		"\2\r\2\16\2\64\5\2\67\n\2\3\3\3\3\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\6\20Y\n\20\r\20\16\20Z\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\7\21c\n\21\f\21\16\21f\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\7\22q\n\22\f\22\16\22t\13\22\3\22\3\22\3d\2\23\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23\3\2\6\3\2\62;\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2~\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3"+
		"\66\3\2\2\2\58\3\2\2\2\7:\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17"+
		"G\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27O\3\2\2\2\31Q\3\2\2\2"+
		"\33S\3\2\2\2\35U\3\2\2\2\37X\3\2\2\2!^\3\2\2\2#l\3\2\2\2%\'\5\5\3\2&%"+
		"\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+-\7\60\2\2"+
		",.\5\5\3\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\67\3\2\2\2\61"+
		"\63\5\5\3\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\67\3\2\2\2\66(\3\2\2\2\66\62\3\2\2\2\67\4\3\2\2\289\t\2\2\29\6\3\2\2"+
		"\2:>\t\3\2\2;=\t\2\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\b\3\2"+
		"\2\2@>\3\2\2\2AB\7?\2\2B\n\3\2\2\2CD\7,\2\2D\f\3\2\2\2EF\7\61\2\2F\16"+
		"\3\2\2\2GH\7-\2\2H\20\3\2\2\2IJ\7/\2\2J\22\3\2\2\2KL\7`\2\2L\24\3\2\2"+
		"\2MN\7\'\2\2N\26\3\2\2\2OP\7=\2\2P\30\3\2\2\2QR\7*\2\2R\32\3\2\2\2ST\7"+
		"+\2\2T\34\3\2\2\2UV\7~\2\2V\36\3\2\2\2WY\t\4\2\2XW\3\2\2\2YZ\3\2\2\2Z"+
		"X\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\20\2\2] \3\2\2\2^_\7\61\2\2_`\7,\2"+
		"\2`d\3\2\2\2ac\13\2\2\2ba\3\2\2\2cf\3\2\2\2de\3\2\2\2db\3\2\2\2eg\3\2"+
		"\2\2fd\3\2\2\2gh\7,\2\2hi\7\61\2\2ij\3\2\2\2jk\b\21\2\2k\"\3\2\2\2lm\7"+
		"\61\2\2mn\7\61\2\2nr\3\2\2\2oq\n\5\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2r"+
		"s\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\b\22\2\2v$\3\2\2\2\13\2(/\64\66>Zdr\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}