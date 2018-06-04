// Generated from D:\Compiladores\lab02\provided\skeleton\src/decaf/DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_class=1, LCURLY=2, RCURLY=3, VIRGULA=4, PONTVIRGULA=5, ECOLC=6, DCOLC=7, 
		EPAR=8, DPAR=9, ATRIB=10, OP_ARITH=11, MAIS=12, MENOS=13, EXCAMACAO=14, 
		OP_RELACIO=15, OP_EQUID=16, OP_COND=17, BREAK=18, CALLOUT=19, CONTINUE=20, 
		RETURN=21, TIPO=22, VOID=23, BOOLEAN=24, IF=25, FOR=26, ELSE=27, ID=28, 
		INTLITERAL=29, CHAR=30, STRING=31, WS_=32, SL_COMMENT=33;
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_method_decl = 2, RULE_parametroMeth_decl = 3, 
		RULE_block = 4, RULE_var_decl = 5, RULE_statement = 6, RULE_assing_op = 7, 
		RULE_method_call = 8, RULE_location = 9, RULE_expr = 10;
	public static final String[] ruleNames = {
		"program", "field_decl", "method_decl", "parametroMeth_decl", "block", 
		"var_decl", "statement", "assing_op", "method_call", "location", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class Program'", "'{'", "'}'", "','", "';'", "'['", "']'", "'('", 
		"')'", "'='", null, "'+'", "'-'", "'!'", null, null, null, "'break'", 
		"'callout'", "'continue'", "'return'", null, "'void'", null, "'if'", "'for'", 
		"'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "LCURLY", "RCURLY", "VIRGULA", "PONTVIRGULA", "ECOLC", 
		"DCOLC", "EPAR", "DPAR", "ATRIB", "OP_ARITH", "MAIS", "MENOS", "EXCAMACAO", 
		"OP_RELACIO", "OP_EQUID", "OP_COND", "BREAK", "CALLOUT", "CONTINUE", "RETURN", 
		"TIPO", "VOID", "BOOLEAN", "IF", "FOR", "ELSE", "ID", "INTLITERAL", "CHAR", 
		"STRING", "WS_", "SL_COMMENT"
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
	public String getGrammarFileName() { return "DecafParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode TK_class() { return getToken(DecafParser.TK_class, 0); }
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public TerminalNode EOF() { return getToken(DecafParser.EOF, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(TK_class);
			setState(23);
			match(LCURLY);
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(24);
					field_decl();
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO || _la==VOID) {
				{
				{
				setState(30);
				method_decl();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(RCURLY);
			setState(37);
			match(EOF);
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

	public static class Field_declContext extends ParserRuleContext {
		public List<TerminalNode> TIPO() { return getTokens(DecafParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(DecafParser.TIPO, i);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode PONTVIRGULA() { return getToken(DecafParser.PONTVIRGULA, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public List<TerminalNode> ECOLC() { return getTokens(DecafParser.ECOLC); }
		public TerminalNode ECOLC(int i) {
			return getToken(DecafParser.ECOLC, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(DecafParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(DecafParser.INTLITERAL, i);
		}
		public List<TerminalNode> DCOLC() { return getTokens(DecafParser.DCOLC); }
		public TerminalNode DCOLC(int i) {
			return getToken(DecafParser.DCOLC, i);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		int _la;
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(TIPO);
				setState(40);
				match(ID);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(41);
					match(VIRGULA);
					setState(42);
					match(TIPO);
					setState(43);
					match(ID);
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49);
				match(PONTVIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(TIPO);
				setState(51);
				match(ID);
				setState(52);
				match(ECOLC);
				setState(53);
				match(INTLITERAL);
				setState(54);
				match(DCOLC);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(55);
					match(VIRGULA);
					setState(56);
					match(TIPO);
					setState(57);
					match(ID);
					setState(58);
					match(ECOLC);
					setState(59);
					match(INTLITERAL);
					setState(60);
					match(DCOLC);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(PONTVIRGULA);
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

	public static class Method_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode EPAR() { return getToken(DecafParser.EPAR, 0); }
		public TerminalNode DPAR() { return getToken(DecafParser.DPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(DecafParser.TIPO, 0); }
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public ParametroMeth_declContext parametroMeth_decl() {
			return getRuleContext(ParametroMeth_declContext.class,0);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==TIPO || _la==VOID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(70);
			match(ID);
			setState(71);
			match(EPAR);
			setState(73);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(72);
				parametroMeth_decl();
				}
			}

			setState(75);
			match(DPAR);
			setState(76);
			block();
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

	public static class ParametroMeth_declContext extends ParserRuleContext {
		public List<TerminalNode> TIPO() { return getTokens(DecafParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(DecafParser.TIPO, i);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public ParametroMeth_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroMeth_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterParametroMeth_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitParametroMeth_decl(this);
		}
	}

	public final ParametroMeth_declContext parametroMeth_decl() throws RecognitionException {
		ParametroMeth_declContext _localctx = new ParametroMeth_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametroMeth_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(TIPO);
			setState(79);
			match(ID);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(80);
				match(VIRGULA);
				setState(81);
				match(TIPO);
				setState(82);
				match(ID);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(LCURLY);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(89);
				var_decl();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(95);
				statement();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(RCURLY);
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

	public static class Var_declContext extends ParserRuleContext {
		public List<TerminalNode> TIPO() { return getTokens(DecafParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(DecafParser.TIPO, i);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode PONTVIRGULA() { return getToken(DecafParser.PONTVIRGULA, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(TIPO);
			setState(104);
			match(ID);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(105);
				match(VIRGULA);
				setState(106);
				_la = _input.LA(1);
				if ( !(_la==TIPO || _la==ID) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(PONTVIRGULA);
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
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Assing_opContext assing_op() {
			return getRuleContext(Assing_opContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PONTVIRGULA() { return getToken(DecafParser.PONTVIRGULA, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public TerminalNode EPAR() { return getToken(DecafParser.EPAR, 0); }
		public TerminalNode DPAR() { return getToken(DecafParser.DPAR, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(DecafParser.ATRIB, 0); }
		public TerminalNode VIRGULA() { return getToken(DecafParser.VIRGULA, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				location();
				setState(115);
				assing_op();
				setState(116);
				expr(0);
				setState(117);
				match(PONTVIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				method_call();
				setState(120);
				match(PONTVIRGULA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(IF);
				setState(123);
				match(EPAR);
				setState(124);
				expr(0);
				setState(125);
				match(DPAR);
				setState(126);
				block();
				setState(129);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(127);
					match(ELSE);
					setState(128);
					block();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(FOR);
				setState(132);
				match(ID);
				setState(133);
				match(ATRIB);
				setState(134);
				expr(0);
				setState(135);
				match(VIRGULA);
				setState(136);
				expr(0);
				setState(137);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(RETURN);
				setState(141);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EPAR) | (1L << MENOS) | (1L << EXCAMACAO) | (1L << CALLOUT) | (1L << BOOLEAN) | (1L << ID) | (1L << INTLITERAL) | (1L << CHAR))) != 0)) {
					{
					setState(140);
					expr(0);
					}
				}

				setState(143);
				match(PONTVIRGULA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				match(BREAK);
				setState(145);
				match(PONTVIRGULA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				match(CONTINUE);
				setState(147);
				match(PONTVIRGULA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(148);
				block();
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

	public static class Assing_opContext extends ParserRuleContext {
		public TerminalNode ATRIB() { return getToken(DecafParser.ATRIB, 0); }
		public TerminalNode MAIS() { return getToken(DecafParser.MAIS, 0); }
		public TerminalNode MENOS() { return getToken(DecafParser.MENOS, 0); }
		public Assing_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assing_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAssing_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAssing_op(this);
		}
	}

	public final Assing_opContext assing_op() throws RecognitionException {
		Assing_opContext _localctx = new Assing_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assing_op);
		try {
			setState(156);
			switch (_input.LA(1)) {
			case ATRIB:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(ATRIB);
				}
				break;
			case MAIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(MAIS);
				setState(153);
				match(ATRIB);
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(MENOS);
				setState(155);
				match(ATRIB);
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

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode EPAR() { return getToken(DecafParser.EPAR, 0); }
		public TerminalNode DPAR() { return getToken(DecafParser.DPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public List<TerminalNode> STRING() { return getTokens(DecafParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DecafParser.STRING, i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_call);
		int _la;
		try {
			setState(187);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(ID);
				setState(159);
				match(EPAR);
				setState(168);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EPAR) | (1L << MENOS) | (1L << EXCAMACAO) | (1L << CALLOUT) | (1L << BOOLEAN) | (1L << ID) | (1L << INTLITERAL) | (1L << CHAR))) != 0)) {
					{
					setState(160);
					expr(0);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(161);
						match(VIRGULA);
						setState(162);
						expr(0);
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(170);
				match(DPAR);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(CALLOUT);
				setState(172);
				match(EPAR);
				setState(173);
				match(STRING);
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(174);
						match(VIRGULA);
						setState(177);
						switch (_input.LA(1)) {
						case EPAR:
						case MENOS:
						case EXCAMACAO:
						case CALLOUT:
						case BOOLEAN:
						case ID:
						case INTLITERAL:
						case CHAR:
							{
							setState(175);
							expr(0);
							}
							break;
						case STRING:
							{
							setState(176);
							match(STRING);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(183);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(186);
				match(DPAR);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode ECOLC() { return getToken(DecafParser.ECOLC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DCOLC() { return getToken(DecafParser.DCOLC, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_location);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(ID);
				setState(191);
				match(ECOLC);
				setState(192);
				expr(0);
				setState(193);
				match(DCOLC);
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

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode INTLITERAL() { return getToken(DecafParser.INTLITERAL, 0); }
		public TerminalNode CHAR() { return getToken(DecafParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(DecafParser.BOOLEAN, 0); }
		public TerminalNode MENOS() { return getToken(DecafParser.MENOS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EXCAMACAO() { return getToken(DecafParser.EXCAMACAO, 0); }
		public TerminalNode EPAR() { return getToken(DecafParser.EPAR, 0); }
		public TerminalNode DPAR() { return getToken(DecafParser.DPAR, 0); }
		public TerminalNode OP_ARITH() { return getToken(DecafParser.OP_ARITH, 0); }
		public TerminalNode OP_RELACIO() { return getToken(DecafParser.OP_RELACIO, 0); }
		public TerminalNode OP_EQUID() { return getToken(DecafParser.OP_EQUID, 0); }
		public TerminalNode OP_COND() { return getToken(DecafParser.OP_COND, 0); }
		public TerminalNode MAIS() { return getToken(DecafParser.MAIS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(198);
				location();
				}
				break;
			case 2:
				{
				setState(199);
				method_call();
				}
				break;
			case 3:
				{
				setState(200);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTLITERAL) | (1L << CHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 4:
				{
				setState(201);
				match(MENOS);
				setState(202);
				expr(3);
				}
				break;
			case 5:
				{
				setState(203);
				match(EXCAMACAO);
				setState(204);
				expr(2);
				}
				break;
			case 6:
				{
				setState(205);
				match(EPAR);
				setState(206);
				expr(0);
				setState(207);
				match(DPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(211);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(212);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ARITH) | (1L << MAIS) | (1L << MENOS) | (1L << OP_RELACIO) | (1L << OP_EQUID) | (1L << OP_COND))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(213);
					expr(5);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3\16\3C\13"+
		"\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\5\4L\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\7\5V\n\5\f\5\16\5Y\13\5\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\6\7\6c\n"+
		"\6\f\6\16\6f\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7n\n\7\f\7\16\7q\13\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0084"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0090\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0098\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u009f\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u00a6\n\n\f\n\16\n\u00a9\13\n\5\n\u00ab\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u00b4\n\n\7\n\u00b6\n\n\f\n\16\n\u00b9\13\n\5\n\u00bb"+
		"\n\n\3\n\5\n\u00be\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c6\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d4\n\f\3\f\3\f\3"+
		"\f\7\f\u00d9\n\f\f\f\16\f\u00dc\13\f\3\f\2\3\26\r\2\4\6\b\n\f\16\20\22"+
		"\24\26\2\6\3\2\30\31\4\2\30\30\36\36\4\2\32\32\37 \4\2\r\17\21\23\u00f4"+
		"\2\30\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bP\3\2\2\2\nZ\3\2\2\2\fi\3\2\2\2\16"+
		"\u0097\3\2\2\2\20\u009e\3\2\2\2\22\u00bd\3\2\2\2\24\u00c5\3\2\2\2\26\u00d3"+
		"\3\2\2\2\30\31\7\3\2\2\31\35\7\4\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37"+
		"\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36#\3\2\2\2\37\35\3\2\2\2 \"\5\6"+
		"\4\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7"+
		"\5\2\2\'(\7\2\2\3(\3\3\2\2\2)*\7\30\2\2*\60\7\36\2\2+,\7\6\2\2,-\7\30"+
		"\2\2-/\7\36\2\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63"+
		"\3\2\2\2\62\60\3\2\2\2\63F\7\7\2\2\64\65\7\30\2\2\65\66\7\36\2\2\66\67"+
		"\7\b\2\2\678\7\37\2\28A\7\t\2\29:\7\6\2\2:;\7\30\2\2;<\7\36\2\2<=\7\b"+
		"\2\2=>\7\37\2\2>@\7\t\2\2?9\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3"+
		"\2\2\2CA\3\2\2\2DF\7\7\2\2E)\3\2\2\2E\64\3\2\2\2F\5\3\2\2\2GH\t\2\2\2"+
		"HI\7\36\2\2IK\7\n\2\2JL\5\b\5\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\13\2"+
		"\2NO\5\n\6\2O\7\3\2\2\2PQ\7\30\2\2QW\7\36\2\2RS\7\6\2\2ST\7\30\2\2TV\7"+
		"\36\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\t\3\2\2\2YW\3\2\2\2Z"+
		"^\7\4\2\2[]\5\f\7\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_d\3\2\2"+
		"\2`^\3\2\2\2ac\5\16\b\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2"+
		"\2\2fd\3\2\2\2gh\7\5\2\2h\13\3\2\2\2ij\7\30\2\2jo\7\36\2\2kl\7\6\2\2l"+
		"n\t\3\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2"+
		"rs\7\7\2\2s\r\3\2\2\2tu\5\24\13\2uv\5\20\t\2vw\5\26\f\2wx\7\7\2\2x\u0098"+
		"\3\2\2\2yz\5\22\n\2z{\7\7\2\2{\u0098\3\2\2\2|}\7\33\2\2}~\7\n\2\2~\177"+
		"\5\26\f\2\177\u0080\7\13\2\2\u0080\u0083\5\n\6\2\u0081\u0082\7\35\2\2"+
		"\u0082\u0084\5\n\6\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0098"+
		"\3\2\2\2\u0085\u0086\7\34\2\2\u0086\u0087\7\36\2\2\u0087\u0088\7\f\2\2"+
		"\u0088\u0089\5\26\f\2\u0089\u008a\7\6\2\2\u008a\u008b\5\26\f\2\u008b\u008c"+
		"\5\n\6\2\u008c\u0098\3\2\2\2\u008d\u008f\7\27\2\2\u008e\u0090\5\26\f\2"+
		"\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0098"+
		"\7\7\2\2\u0092\u0093\7\24\2\2\u0093\u0098\7\7\2\2\u0094\u0095\7\26\2\2"+
		"\u0095\u0098\7\7\2\2\u0096\u0098\5\n\6\2\u0097t\3\2\2\2\u0097y\3\2\2\2"+
		"\u0097|\3\2\2\2\u0097\u0085\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u0092\3"+
		"\2\2\2\u0097\u0094\3\2\2\2\u0097\u0096\3\2\2\2\u0098\17\3\2\2\2\u0099"+
		"\u009f\7\f\2\2\u009a\u009b\7\16\2\2\u009b\u009f\7\f\2\2\u009c\u009d\7"+
		"\17\2\2\u009d\u009f\7\f\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\21\3\2\2\2\u00a0\u00a1\7\36\2\2\u00a1\u00aa\7\n\2"+
		"\2\u00a2\u00a7\5\26\f\2\u00a3\u00a4\7\6\2\2\u00a4\u00a6\5\26\f\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00be\7\13\2\2\u00ad\u00ae\7"+
		"\25\2\2\u00ae\u00af\7\n\2\2\u00af\u00ba\7!\2\2\u00b0\u00b3\7\6\2\2\u00b1"+
		"\u00b4\5\26\f\2\u00b2\u00b4\7!\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2"+
		"\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\7\13\2\2\u00bd\u00a0\3\2\2\2\u00bd\u00ad\3\2\2\2\u00be\23\3\2\2"+
		"\2\u00bf\u00c6\7\36\2\2\u00c0\u00c1\7\36\2\2\u00c1\u00c2\7\b\2\2\u00c2"+
		"\u00c3\5\26\f\2\u00c3\u00c4\7\t\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00bf\3"+
		"\2\2\2\u00c5\u00c0\3\2\2\2\u00c6\25\3\2\2\2\u00c7\u00c8\b\f\1\2\u00c8"+
		"\u00d4\5\24\13\2\u00c9\u00d4\5\22\n\2\u00ca\u00d4\t\4\2\2\u00cb\u00cc"+
		"\7\17\2\2\u00cc\u00d4\5\26\f\5\u00cd\u00ce\7\20\2\2\u00ce\u00d4\5\26\f"+
		"\4\u00cf\u00d0\7\n\2\2\u00d0\u00d1\5\26\f\2\u00d1\u00d2\7\13\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00c7\3\2\2\2\u00d3\u00c9\3\2\2\2\u00d3\u00ca\3\2"+
		"\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4"+
		"\u00da\3\2\2\2\u00d5\u00d6\f\6\2\2\u00d6\u00d7\t\5\2\2\u00d7\u00d9\5\26"+
		"\f\7\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\27\3\2\2\2\u00dc\u00da\3\2\2\2\31\35#\60AEKW^do\u0083"+
		"\u008f\u0097\u009e\u00a7\u00aa\u00b3\u00b7\u00ba\u00bd\u00c5\u00d3\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}