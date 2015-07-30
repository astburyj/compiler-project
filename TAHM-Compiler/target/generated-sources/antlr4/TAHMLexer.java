// Generated from TAHM.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TAHMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, QUIT=2, IS=3, NOT=4, DO=5, ODD=6, ASSIGN=7, COMMA=8, SEMIC=9, 
		DOT=10, VAR=11, IF=12, THEN=13, PRINT=14, ELSE=15, WHILE=16, EQUAL_TO=17, 
		GREATER_THAN=18, LESS_THAN=19, PROCEDURE=20, OPEN=21, CLOSE=22, PLUS=23, 
		MINUS=24, MULT=25, DIV=26, Ident=27, Number=28, ALPHA=29, DIGIT=30, WS=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'"
	};
	public static final String[] ruleNames = {
		"START", "QUIT", "IS", "NOT", "DO", "ODD", "ASSIGN", "COMMA", "SEMIC", 
		"DOT", "VAR", "IF", "THEN", "PRINT", "ELSE", "WHILE", "EQUAL_TO", "GREATER_THAN", 
		"LESS_THAN", "PROCEDURE", "OPEN", "CLOSE", "PLUS", "MINUS", "MULT", "DIV", 
		"Ident", "Number", "ALPHA", "DIGIT", "WS"
	};


	public TAHMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TAHM.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00c7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\34\7\34\u00b3\n\34\f\34\16\34\u00b6\13\34\3\35\6\35\u00b9"+
		"\n\35\r\35\16\35\u00ba\3\36\3\36\3\37\3\37\3 \6 \u00c2\n \r \16 \u00c3"+
		"\3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\u00ca\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\3A\3\2\2\2\5I\3\2\2\2\7U\3\2\2\2\tX\3\2\2\2\13Z\3\2\2\2"+
		"\r_\3\2\2\2\17c\3\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25l\3\2\2\2\27n\3\2\2"+
		"\2\31s\3\2\2\2\33x\3\2\2\2\35}\3\2\2\2\37\u0086\3\2\2\2!\u008a\3\2\2\2"+
		"#\u0090\3\2\2\2%\u0093\3\2\2\2\'\u0096\3\2\2\2)\u00a0\3\2\2\2+\u00a3\3"+
		"\2\2\2-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61\u00a9\3\2\2\2\63\u00ab\3\2\2\2"+
		"\65\u00ad\3\2\2\2\67\u00af\3\2\2\29\u00b8\3\2\2\2;\u00bc\3\2\2\2=\u00be"+
		"\3\2\2\2?\u00c1\3\2\2\2AB\7v\2\2BC\7w\2\2CD\7t\2\2DE\7p\2\2EF\7a\2\2F"+
		"G\7w\2\2GH\7r\2\2H\4\3\2\2\2IJ\7d\2\2JK\7{\2\2KL\7g\2\2LM\7a\2\2MN\7h"+
		"\2\2NO\7g\2\2OP\7n\2\2PQ\7k\2\2QR\7e\2\2RS\7k\2\2ST\7c\2\2T\6\3\2\2\2"+
		"UV\7?\2\2VW\7?\2\2W\b\3\2\2\2XY\7#\2\2Y\n\3\2\2\2Z[\7y\2\2[\\\7q\2\2\\"+
		"]\7t\2\2]^\7m\2\2^\f\3\2\2\2_`\7q\2\2`a\7f\2\2ab\7f\2\2b\16\3\2\2\2cd"+
		"\7e\2\2de\7c\2\2ef\7n\2\2fg\7n\2\2g\20\3\2\2\2hi\7.\2\2i\22\3\2\2\2jk"+
		"\7=\2\2k\24\3\2\2\2lm\7\60\2\2m\26\3\2\2\2no\7o\2\2op\7c\2\2pq\7m\2\2"+
		"qr\7g\2\2r\30\3\2\2\2st\7y\2\2tu\7j\2\2uv\7g\2\2vw\7p\2\2w\32\3\2\2\2"+
		"xy\7v\2\2yz\7j\2\2z{\7g\2\2{|\7p\2\2|\34\3\2\2\2}~\7u\2\2~\177\7r\2\2"+
		"\177\u0080\7k\2\2\u0080\u0081\7v\2\2\u0081\u0082\7h\2\2\u0082\u0083\7"+
		"k\2\2\u0083\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085\36\3\2\2\2\u0086\u0087"+
		"\7p\2\2\u0087\u0088\7c\2\2\u0088\u0089\7j\2\2\u0089 \3\2\2\2\u008a\u008b"+
		"\7h\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7p\2\2\u008e"+
		"\u008f\7c\2\2\u008f\"\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7u\2\2\u0092"+
		"$\3\2\2\2\u0093\u0094\7o\2\2\u0094\u0095\7q\2\2\u0095&\3\2\2\2\u0096\u0097"+
		"\7v\2\2\u0097\u0098\7w\2\2\u0098\u0099\7t\2\2\u0099\u009a\7p\2\2\u009a"+
		"\u009b\7a\2\2\u009b\u009c\7f\2\2\u009c\u009d\7q\2\2\u009d\u009e\7y\2\2"+
		"\u009e\u009f\7p\2\2\u009f(\3\2\2\2\u00a0\u00a1\7i\2\2\u00a1\u00a2\7q\2"+
		"\2\u00a2*\3\2\2\2\u00a3\u00a4\7*\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7+\2\2"+
		"\u00a6.\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8\60\3\2\2\2\u00a9\u00aa\7/\2\2"+
		"\u00aa\62\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7\61"+
		"\2\2\u00ae\66\3\2\2\2\u00af\u00b4\5;\36\2\u00b0\u00b3\5;\36\2\u00b1\u00b3"+
		"\5=\37\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b58\3\2\2\2\u00b6\u00b4\3\2\2\2"+
		"\u00b7\u00b9\5=\37\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb:\3\2\2\2\u00bc\u00bd\t\2\2\2\u00bd"+
		"<\3\2\2\2\u00be\u00bf\4\62;\2\u00bf>\3\2\2\2\u00c0\u00c2\t\3\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b \2\2\u00c6@\3\2\2\2\7\2\u00b2\u00b4"+
		"\u00ba\u00c3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}