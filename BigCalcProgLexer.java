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
		OP_POW=9, END_OF_STAT=10, PAR_LEFT=11, PAR_RIGHT=12, ABS_SIGN=13, ARR_OPEN=14, 
		ARR_CLOSE=15, WS=16, COMMENT=17, LINE_COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NUMBER", "DIGIT", "VAR", "OP_ASSIGN", "OP_MUL", "OP_DIV", "OP_ADD", "OP_SUB", 
		"OP_POW", "END_OF_STAT", "PAR_LEFT", "PAR_RIGHT", "ABS_SIGN", "ARR_OPEN", 
		"ARR_CLOSE", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'='", "'*'", "'/'", "'+'", "'-'", "'^'", "';'", 
		"'('", "')'", "'|'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "DIGIT", "VAR", "OP_ASSIGN", "OP_MUL", "OP_DIV", "OP_ADD", 
		"OP_SUB", "OP_POW", "END_OF_STAT", "PAR_LEFT", "PAR_RIGHT", "ABS_SIGN", 
		"ARR_OPEN", "ARR_CLOSE", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\6\2\60\n\2\r\2\16\2\61"+
		"\3\2\6\2\65\n\2\r\2\16\2\66\5\29\n\2\3\3\3\3\3\4\3\4\7\4?\n\4\f\4\16\4"+
		"B\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21]\n\21\r\21\16\21^\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\7\22g\n\22\f\22\16\22j\13\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23u\n\23\f\23\16\23x\13\23\3\23\3"+
		"\23\3h\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\3\2\6\3\2\62;\4\2C\\c|\5\2\13\f\16\17\"\""+
		"\4\2\f\f\17\17\2\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\38\3\2\2\2\5:\3\2\2\2\7<\3\2\2\2"+
		"\tC\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2"+
		"\25O\3\2\2\2\27Q\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35W\3\2\2\2\37Y\3\2\2"+
		"\2!\\\3\2\2\2#b\3\2\2\2%p\3\2\2\2\')\5\5\3\2(\'\3\2\2\2),\3\2\2\2*(\3"+
		"\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-/\7\60\2\2.\60\5\5\3\2/.\3\2\2\2"+
		"\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\629\3\2\2\2\63\65\5\5\3\2\64"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28*\3"+
		"\2\2\28\64\3\2\2\29\4\3\2\2\2:;\t\2\2\2;\6\3\2\2\2<@\t\3\2\2=?\t\2\2\2"+
		">=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\b\3\2\2\2B@\3\2\2\2CD\7?\2\2"+
		"D\n\3\2\2\2EF\7,\2\2F\f\3\2\2\2GH\7\61\2\2H\16\3\2\2\2IJ\7-\2\2J\20\3"+
		"\2\2\2KL\7/\2\2L\22\3\2\2\2MN\7`\2\2N\24\3\2\2\2OP\7=\2\2P\26\3\2\2\2"+
		"QR\7*\2\2R\30\3\2\2\2ST\7+\2\2T\32\3\2\2\2UV\7~\2\2V\34\3\2\2\2WX\7]\2"+
		"\2X\36\3\2\2\2YZ\7_\2\2Z \3\2\2\2[]\t\4\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3"+
		"\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\21\2\2a\"\3\2\2\2bc\7\61\2\2cd\7,\2\2d"+
		"h\3\2\2\2eg\13\2\2\2fe\3\2\2\2gj\3\2\2\2hi\3\2\2\2hf\3\2\2\2ik\3\2\2\2"+
		"jh\3\2\2\2kl\7,\2\2lm\7\61\2\2mn\3\2\2\2no\b\22\2\2o$\3\2\2\2pq\7\61\2"+
		"\2qr\7\61\2\2rv\3\2\2\2su\n\5\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2wy\3\2\2\2xv\3\2\2\2yz\b\23\2\2z&\3\2\2\2\13\2*\61\668@^hv\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}