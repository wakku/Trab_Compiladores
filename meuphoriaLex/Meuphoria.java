/* Meuphoria.java */
/* Generated By:JavaCC: Do not edit this line. Meuphoria.java */
/* MeuPhoria Parser */
class Meuphoria implements MeuphoriaConstants {

  // Processa o código e gera a tabela de tokens
  public void processa() throws ParseException, TokenMgrError{
    Token t;
    do {
      //try {
      // Pega o próximo token gerado pelo Léxico.
        t = getNextToken();
        if(t.kind == ID) {
                  // Se tamanho for maior que 30, váriavel é invalida. Gera um erro.
            if(t.image.length() > 30)
                throw new TokenMgrError(TokenMgrError.IDENT_ERROR);
        }
        // Pega o proximo token do tipo t.kind
        String nomeToken = tokenImage[t.kind];
        // Seta a localização do token
        String location = "@(" + t.beginLine + ", " + t.beginColumn + ")";
        // Imprime as informações do token. Se for EOF não imprime image, pois ela não existe.
        if(t.kind == EOL)
          System.out.println(String.format("%-15s %-20s <EOL>", location, nomeToken));
        else
          System.out.println(String.format("%-15s %-20s %s", location, nomeToken, t.image));
    } while (nomeToken.equals("<EOF>")); // Termina o loop se EOF
  }

  /** Main entry point. */
  public static void main(String args[]) {
    try
    {
      Meuphoria analisadorlexico = new Meuphoria(System.in);
      analisadorlexico.processa();
      System.out.println("Analisado com sucesso!");

      //analisadorlexico.javacc_input();
      //System.out.println("input... ");

    }
    catch(ParseException e)
    {
      System.out.println(e.getMessage());
        System.out.println("Ocorreu uma excecao!");
    }
    catch(TokenMgrError e)
    {
        System.out.println(e.getMessage());
        System.out.println("Existem erros no codigo! Por favor, verifica-los.");
    }
  }

/*******************************************************
          MEUPHORIA GRAMMAR
*******************************************************/
  final public 
void javacc_input() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case COMENTARIO_INICIAL:{
      jj_consume_token(COMENTARIO_INICIAL);
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      ;
    }
  }

  /** Generated Token Manager. */
  public MeuphoriaTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[1];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static private int[] jj_la1_3;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
      jj_la1_init_3();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x100,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x0,};
   }
   private static void jj_la1_init_3() {
      jj_la1_3 = new int[] {0x0,};
   }

  /** Constructor with InputStream. */
  public Meuphoria(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Meuphoria(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new MeuphoriaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Meuphoria(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new MeuphoriaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Meuphoria(MeuphoriaTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(MeuphoriaTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
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

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[108];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 1; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
          if ((jj_la1_3[i] & (1<<j)) != 0) {
            la1tokens[96+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 108; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
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

}
