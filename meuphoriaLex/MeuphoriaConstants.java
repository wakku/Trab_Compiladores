/* Generated By:JavaCC: Do not edit this line. MeuphoriaConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface MeuphoriaConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int COMENTARIO_LINHA = 5;
  /** RegularExpression Id. */
  int COMENTARIO_INICIAL = 8;
  /** RegularExpression Id. */
  int CASE = 9;
  /** RegularExpression Id. */
  int DO = 10;
  /** RegularExpression Id. */
  int END = 11;
  /** RegularExpression Id. */
  int EXPORT = 12;
  /** RegularExpression Id. */
  int GLOBAL = 13;
  /** RegularExpression Id. */
  int INCLUDE = 14;
  /** RegularExpression Id. */
  int PUBLIC = 15;
  /** RegularExpression Id. */
  int SWITCH = 16;
  /** RegularExpression Id. */
  int UNTIL = 17;
  /** RegularExpression Id. */
  int AS = 18;
  /** RegularExpression Id. */
  int CONSTANT = 19;
  /** RegularExpression Id. */
  int ELSE = 20;
  /** RegularExpression Id. */
  int ENTRY = 21;
  /** RegularExpression Id. */
  int FALLTHRU = 22;
  /** RegularExpression Id. */
  int GOTO = 23;
  /** RegularExpression Id. */
  int LABEL = 24;
  /** RegularExpression Id. */
  int RETRY = 25;
  /** RegularExpression Id. */
  int THEN = 26;
  /** RegularExpression Id. */
  int WHILE = 27;
  /** RegularExpression Id. */
  int BREAK = 28;
  /** RegularExpression Id. */
  int CONTINUE = 29;
  /** RegularExpression Id. */
  int ELSEDEF = 30;
  /** RegularExpression Id. */
  int ENUM = 31;
  /** RegularExpression Id. */
  int IF = 32;
  /** RegularExpression Id. */
  int LOOP = 33;
  /** RegularExpression Id. */
  int OVERRIDE = 34;
  /** RegularExpression Id. */
  int RETURN = 35;
  /** RegularExpression Id. */
  int TO = 36;
  /** RegularExpression Id. */
  int WITH = 37;
  /** RegularExpression Id. */
  int BY = 38;
  /** RegularExpression Id. */
  int DEPRECATE = 39;
  /** RegularExpression Id. */
  int ELSIF = 40;
  /** RegularExpression Id. */
  int EXIT = 41;
  /** RegularExpression Id. */
  int FUNCTION = 42;
  /** RegularExpression Id. */
  int IFDEF = 43;
  /** RegularExpression Id. */
  int NAMESPACE = 44;
  /** RegularExpression Id. */
  int PROCEDURE = 45;
  /** RegularExpression Id. */
  int ROUTINE = 46;
  /** RegularExpression Id. */
  int TYPE = 47;
  /** RegularExpression Id. */
  int WITHOUT = 48;
  /** RegularExpression Id. */
  int PROFILE = 49;
  /** RegularExpression Id. */
  int PROFILE_TIME = 50;
  /** RegularExpression Id. */
  int TRACE = 51;
  /** RegularExpression Id. */
  int BATCH = 52;
  /** RegularExpression Id. */
  int TYPE_CHECK = 53;
  /** RegularExpression Id. */
  int INDIRECT_INCLUDES = 54;
  /** RegularExpression Id. */
  int INLINE = 55;
  /** RegularExpression Id. */
  int WARNING = 56;
  /** RegularExpression Id. */
  int SAVE = 57;
  /** RegularExpression Id. */
  int RESTORE = 58;
  /** RegularExpression Id. */
  int STRICT = 59;
  /** RegularExpression Id. */
  int ELSEIFDEF = 60;
  /** RegularExpression Id. */
  int FOR = 61;
  /** RegularExpression Id. */
  int LPAREN = 62;
  /** RegularExpression Id. */
  int RPAREN = 63;
  /** RegularExpression Id. */
  int LBRACE = 64;
  /** RegularExpression Id. */
  int RBRACE = 65;
  /** RegularExpression Id. */
  int LBRACKET = 66;
  /** RegularExpression Id. */
  int RBRACKET = 67;
  /** RegularExpression Id. */
  int SEMICOLON = 68;
  /** RegularExpression Id. */
  int COMMA = 69;
  /** RegularExpression Id. */
  int DOT = 70;
  /** RegularExpression Id. */
  int SINGLE_QUOTE = 71;
  /** RegularExpression Id. */
  int SLICE = 72;
  /** RegularExpression Id. */
  int QUOTE = 73;
  /** RegularExpression Id. */
  int TRIPLE_QUOTE = 74;
  /** RegularExpression Id. */
  int COLON = 75;
  /** RegularExpression Id. */
  int NOT_OP = 76;
  /** RegularExpression Id. */
  int PLUS = 77;
  /** RegularExpression Id. */
  int MINUS = 78;
  /** RegularExpression Id. */
  int STAR = 79;
  /** RegularExpression Id. */
  int SLASH = 80;
  /** RegularExpression Id. */
  int CONCAT = 81;
  /** RegularExpression Id. */
  int GT = 82;
  /** RegularExpression Id. */
  int LT = 83;
  /** RegularExpression Id. */
  int LE = 84;
  /** RegularExpression Id. */
  int GE = 85;
  /** RegularExpression Id. */
  int EQUAL = 86;
  /** RegularExpression Id. */
  int NE = 87;
  /** RegularExpression Id. */
  int SC_OR = 88;
  /** RegularExpression Id. */
  int SC_AND = 89;
  /** RegularExpression Id. */
  int XOR_OP = 90;
  /** RegularExpression Id. */
  int ID = 91;
  /** RegularExpression Id. */
  int INT = 92;
  /** RegularExpression Id. */
  int FLOAT = 93;
  /** RegularExpression Id. */
  int REAL = 94;
  /** RegularExpression Id. */
  int BIN_NUMBER = 95;
  /** RegularExpression Id. */
  int OCT_NUMBER = 96;
  /** RegularExpression Id. */
  int HEX_NUMBER = 97;
  /** RegularExpression Id. */
  int BINARY = 98;
  /** RegularExpression Id. */
  int OCTAL = 99;
  /** RegularExpression Id. */
  int DECIMAL = 100;
  /** RegularExpression Id. */
  int HEXADECIMAL = 101;
  /** RegularExpression Id. */
  int HEXA = 102;
  /** RegularExpression Id. */
  int STR = 103;
  /** RegularExpression Id. */
  int EOL = 104;
  /** RegularExpression Id. */
  int DATATYPE = 105;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int WithinComment = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "\"/*\"",
    "<COMENTARIO_LINHA>",
    "\"*/\"",
    "<token of kind 7>",
    "<COMENTARIO_INICIAL>",
    "\"case\"",
    "\"do\"",
    "\"end\"",
    "\"export\"",
    "\"global\"",
    "\"include\"",
    "\"public\"",
    "\"switch\"",
    "\"until\"",
    "\"as\"",
    "\"constant\"",
    "\"else\"",
    "\"entry\"",
    "\"fallthru\"",
    "\"goto\"",
    "\"label\"",
    "\"retry\"",
    "\"then\"",
    "\"while\"",
    "\"break\"",
    "\"continue\"",
    "\"elsedef\"",
    "\"enum\"",
    "\"if\"",
    "\"loop\"",
    "\"override\"",
    "\"return\"",
    "\"to\"",
    "\"with\"",
    "\"by\"",
    "\"deprecate\"",
    "\"elsif\"",
    "\"exit\"",
    "\"function\"",
    "\"ifdef\"",
    "\"namespace\"",
    "\"procedure\"",
    "\"routine\"",
    "\"type\"",
    "\"without\"",
    "\"profile\"",
    "\"profile_time\"",
    "\"trace\"",
    "\"batch\"",
    "\"type_check\"",
    "\"indirect_includes\"",
    "\"inline\"",
    "\"warning\"",
    "\"save\"",
    "\"restore\"",
    "\"strict\"",
    "\"elsifdef\"",
    "\"for\"",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\";\"",
    "\",\"",
    "\".\"",
    "\"\\\'\"",
    "\"..\"",
    "\"\\\"\"",
    "\"\\\"\\\"\\\"\"",
    "\":\"",
    "\"not\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"&\"",
    "\">\"",
    "\"<\"",
    "\"<=\"",
    "\">=\"",
    "\"=\"",
    "\"!=\"",
    "\"or\"",
    "\"and\"",
    "\"xor\"",
    "<ID>",
    "<INT>",
    "<FLOAT>",
    "<REAL>",
    "<BIN_NUMBER>",
    "<OCT_NUMBER>",
    "<HEX_NUMBER>",
    "<BINARY>",
    "<OCTAL>",
    "<DECIMAL>",
    "<HEXADECIMAL>",
    "<HEXA>",
    "<STR>",
    "\"\\n\"",
    "<DATATYPE>",
  };

}
