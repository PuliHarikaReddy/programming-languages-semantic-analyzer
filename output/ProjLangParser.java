/* ProjLangParser.java */
/* Generated By:JavaCC: Do not edit this line. ProjLangParser.java */
public class ProjLangParser implements ProjLangParserConstants {

  final public void input() throws ParseException {
    expr();
    jj_consume_token(SEMICOL);
    jj_consume_token(0);
  }

  final public void expr() throws ParseException {
    if (jj_2_1(2)) {
      if_exp();
    } else if (jj_2_2(2)) {
      letval_exp();
    } else if (jj_2_3(2)) {
      letfunc_exp();
    } else if (jj_2_4(2)) {
      while_exp();
    } else if (jj_2_5(2)) {
      seq_exp();
    } else if (jj_2_6(2)) {
      assign_exp();
    } else if (jj_2_7(2)) {
      notequals_exp();
    } else if (jj_2_8(2)) {
      rel_exp();
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void if_exp() throws ParseException {
    jj_consume_token(IF);
    expr();
    jj_consume_token(THEN);
    expr();
    jj_consume_token(ELSE);
    expr();
  }

  final public void letval_exp() throws ParseException {
    jj_consume_token(LET);
    jj_consume_token(VAL);
    jj_consume_token(ID);
    jj_consume_token(EQUAL);
    expr();
    jj_consume_token(IN);
    expr();
    jj_consume_token(END);
  }

  final public void letfunc_exp() throws ParseException {
    jj_consume_token(LET);
    jj_consume_token(FUNC);
    jj_consume_token(ID);
    jj_consume_token(LPAREN);
    jj_consume_token(ID);
    jj_consume_token(RPAREN);
    jj_consume_token(EQUAL);
    expr();
    jj_consume_token(IN);
    expr();
    jj_consume_token(END);
  }

  final public void while_exp() throws ParseException {
    jj_consume_token(WHILE);
    expr();
    jj_consume_token(DO);
    expr();
  }

  final public void seq_exp() throws ParseException {
    jj_consume_token(LBRACES);
    expr();
    label_1:
    while (true) {
      if (jj_2_9(2)) {
        ;
      } else {
        break label_1;
      }
      jj_consume_token(SEMICOL);
      expr();
    }
    jj_consume_token(RBRACES);
  }

  final public void notequals_exp() throws ParseException {
    jj_consume_token(NOTEQUALS);
    expr();
  }

  final public void assign_exp() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASSIGN);
    expr();
  }

  final public void rel_exp() throws ParseException {
    arith_exp();
    if (jj_2_12(2)) {
      if (jj_2_10(2)) {
        jj_consume_token(RELOP);
      } else if (jj_2_11(2)) {
        jj_consume_token(EQUAL);
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
      arith_exp();
    } else {
      ;
    }
  }

  final public void arith_exp() throws ParseException {
    term();
    label_2:
    while (true) {
      if (jj_2_13(2)) {
        ;
      } else {
        break label_2;
      }
      jj_consume_token(ADDOP);
      term();
    }
  }

  final public void term() throws ParseException {
    factor();
    label_3:
    while (true) {
      if (jj_2_14(2)) {
        ;
      } else {
        break label_3;
      }
      jj_consume_token(MULOP);
      factor();
    }
  }

  final public void factor() throws ParseException {
    if (jj_2_15(2)) {
      jj_consume_token(NUM);
    } else if (jj_2_16(2)) {
      jj_consume_token(TRUE);
    } else if (jj_2_17(2)) {
      jj_consume_token(FALSE);
    } else if (jj_2_18(2)) {
      jj_consume_token(ID);
      jj_consume_token(LPAREN);
      expr();
      jj_consume_token(RPAREN);
    } else if (jj_2_19(2)) {
      jj_consume_token(ID);
    } else if (jj_2_20(2)) {
      jj_consume_token(LPAREN);
      expr();
      jj_consume_token(RPAREN);
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_2_5(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  private boolean jj_2_6(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  private boolean jj_2_7(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  private boolean jj_2_8(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_8(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(7, xla); }
  }

  private boolean jj_2_9(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_9(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(8, xla); }
  }

  private boolean jj_2_10(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_10(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(9, xla); }
  }

  private boolean jj_2_11(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_11(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(10, xla); }
  }

  private boolean jj_2_12(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_12(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(11, xla); }
  }

  private boolean jj_2_13(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_13(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(12, xla); }
  }

  private boolean jj_2_14(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_14(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(13, xla); }
  }

  private boolean jj_2_15(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_15(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(14, xla); }
  }

  private boolean jj_2_16(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_16(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(15, xla); }
  }

  private boolean jj_2_17(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_17(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(16, xla); }
  }

  private boolean jj_2_18(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_18(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(17, xla); }
  }

  private boolean jj_2_19(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_19(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(18, xla); }
  }

  private boolean jj_2_20(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_20(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(19, xla); }
  }

  private boolean jj_3_4()
 {
    if (jj_3R_7()) return true;
    return false;
  }

  private boolean jj_3_11()
 {
    if (jj_scan_token(EQUAL)) return true;
    return false;
  }

  private boolean jj_3_7()
 {
    if (jj_3R_10()) return true;
    return false;
  }

  private boolean jj_3_10()
 {
    if (jj_scan_token(RELOP)) return true;
    return false;
  }

  private boolean jj_3_12()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_10()) {
    jj_scanpos = xsp;
    if (jj_3_11()) return true;
    }
    if (jj_3R_13()) return true;
    return false;
  }

  private boolean jj_3_13()
 {
    if (jj_scan_token(ADDOP)) return true;
    if (jj_3R_14()) return true;
    return false;
  }

  private boolean jj_3_9()
 {
    if (jj_scan_token(SEMICOL)) return true;
    if (jj_3R_12()) return true;
    return false;
  }

  private boolean jj_3_14()
 {
    if (jj_scan_token(MULOP)) return true;
    if (jj_3R_15()) return true;
    return false;
  }

  private boolean jj_3_3()
 {
    if (jj_3R_6()) return true;
    return false;
  }

  private boolean jj_3R_13()
 {
    if (jj_3R_14()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_13()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3_6()
 {
    if (jj_3R_9()) return true;
    return false;
  }

  private boolean jj_3R_10()
 {
    if (jj_scan_token(NOTEQUALS)) return true;
    if (jj_3R_12()) return true;
    return false;
  }

  private boolean jj_3R_14()
 {
    if (jj_3R_15()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_14()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3R_9()
 {
    if (jj_scan_token(ID)) return true;
    if (jj_scan_token(ASSIGN)) return true;
    return false;
  }

  private boolean jj_3R_11()
 {
    if (jj_3R_13()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_12()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_7()
 {
    if (jj_scan_token(WHILE)) return true;
    if (jj_3R_12()) return true;
    return false;
  }

  private boolean jj_3_20()
 {
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_12()) return true;
    return false;
  }

  private boolean jj_3R_8()
 {
    if (jj_scan_token(LBRACES)) return true;
    if (jj_3R_12()) return true;
    return false;
  }

  private boolean jj_3R_6()
 {
    if (jj_scan_token(LET)) return true;
    if (jj_scan_token(FUNC)) return true;
    return false;
  }

  private boolean jj_3_19()
 {
    if (jj_scan_token(ID)) return true;
    return false;
  }

  private boolean jj_3_2()
 {
    if (jj_3R_5()) return true;
    return false;
  }

  private boolean jj_3_18()
 {
    if (jj_scan_token(ID)) return true;
    if (jj_scan_token(LPAREN)) return true;
    return false;
  }

  private boolean jj_3R_5()
 {
    if (jj_scan_token(LET)) return true;
    if (jj_scan_token(VAL)) return true;
    return false;
  }

  private boolean jj_3_17()
 {
    if (jj_scan_token(FALSE)) return true;
    return false;
  }

  private boolean jj_3_5()
 {
    if (jj_3R_8()) return true;
    return false;
  }

  private boolean jj_3_16()
 {
    if (jj_scan_token(TRUE)) return true;
    return false;
  }

  private boolean jj_3R_15()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_15()) {
    jj_scanpos = xsp;
    if (jj_3_16()) {
    jj_scanpos = xsp;
    if (jj_3_17()) {
    jj_scanpos = xsp;
    if (jj_3_18()) {
    jj_scanpos = xsp;
    if (jj_3_19()) {
    jj_scanpos = xsp;
    if (jj_3_20()) return true;
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_15()
 {
    if (jj_scan_token(NUM)) return true;
    return false;
  }

  private boolean jj_3_8()
 {
    if (jj_3R_11()) return true;
    return false;
  }

  private boolean jj_3R_4()
 {
    if (jj_scan_token(IF)) return true;
    if (jj_3R_12()) return true;
    return false;
  }

  private boolean jj_3R_12()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_1()) {
    jj_scanpos = xsp;
    if (jj_3_2()) {
    jj_scanpos = xsp;
    if (jj_3_3()) {
    jj_scanpos = xsp;
    if (jj_3_4()) {
    jj_scanpos = xsp;
    if (jj_3_5()) {
    jj_scanpos = xsp;
    if (jj_3_6()) {
    jj_scanpos = xsp;
    if (jj_3_7()) {
    jj_scanpos = xsp;
    if (jj_3_8()) return true;
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_1()
 {
    if (jj_3R_4()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public ProjLangParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[0];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[20];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public ProjLangParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ProjLangParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ProjLangParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public ProjLangParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ProjLangParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public ProjLangParser(ProjLangParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(ProjLangParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) {
       return;
    }

    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];

      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }

      for (int[] oldentry : jj_expentries) {
        if (oldentry.length == jj_expentry.length) {
          boolean isMatched = true;

          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              isMatched = false;
              break;
            }

          }
          if (isMatched) {
            jj_expentries.add(jj_expentry);
            break;
          }
        }
      }

      if (pos != 0) {
        jj_lasttokens[(jj_endpos = pos) - 1] = kind;
      }
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[30];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 0; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 30; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 20; i++) {
      try {
        JJCalls p = jj_2_rtns[i];

        do {
          if (p.gen > jj_gen) {
            jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
            switch (i) {
              case 0: jj_3_1(); break;
              case 1: jj_3_2(); break;
              case 2: jj_3_3(); break;
              case 3: jj_3_4(); break;
              case 4: jj_3_5(); break;
              case 5: jj_3_6(); break;
              case 6: jj_3_7(); break;
              case 7: jj_3_8(); break;
              case 8: jj_3_9(); break;
              case 9: jj_3_10(); break;
              case 10: jj_3_11(); break;
              case 11: jj_3_12(); break;
              case 12: jj_3_13(); break;
              case 13: jj_3_14(); break;
              case 14: jj_3_15(); break;
              case 15: jj_3_16(); break;
              case 16: jj_3_17(); break;
              case 17: jj_3_18(); break;
              case 18: jj_3_19(); break;
              case 19: jj_3_20(); break;
            }
          }
          p = p.next;
        } while (p != null);

        } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }

    p.gen = jj_gen + xla - jj_la; 
    p.first = token;
    p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

      // Do not add anything here.
      // Generated parser code gets inserted here.
}