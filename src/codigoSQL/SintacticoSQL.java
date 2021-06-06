
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat May 29 04:47:38 CST 2021
//----------------------------------------------------

package codigoSQL;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat May 29 04:47:38 CST 2021
  */
public class SintacticoSQL extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public SintacticoSQL() {super();}

  /** Constructor which sets the default scanner. */
  public SintacticoSQL(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public SintacticoSQL(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\041\000\002\002\004\000\002\002\010\000\002\002" +
    "\006\000\002\002\015\000\002\002\015\000\002\003\004" +
    "\000\002\003\003\000\002\003\004\000\002\003\003\000" +
    "\002\003\004\000\002\003\003\000\002\003\004\000\002" +
    "\003\003\000\002\003\004\000\002\003\003\000\002\003" +
    "\003\000\002\003\003\000\002\003\003\000\002\003\003" +
    "\000\002\004\005\000\002\004\007\000\002\004\007\000" +
    "\002\004\006\000\002\004\006\000\002\006\011\000\002" +
    "\012\003\000\002\012\005\000\002\012\005\000\002\012" +
    "\005\000\002\012\006\000\002\012\007\000\002\007\015" +
    "\000\002\010\011" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\117\000\006\065\006\077\004\001\002\000\004\030" +
    "\025\001\002\000\004\002\024\001\002\000\004\071\007" +
    "\001\002\000\004\141\010\001\002\000\004\137\011\001" +
    "\002\000\006\002\uffff\045\012\001\002\000\004\141\013" +
    "\001\002\000\004\117\014\001\002\000\004\033\015\001" +
    "\002\000\006\141\017\142\016\001\002\000\004\033\022" +
    "\001\002\000\004\033\020\001\002\000\004\137\021\001" +
    "\002\000\004\002\ufffe\001\002\000\004\137\023\001\002" +
    "\000\004\002\ufffd\001\002\000\004\002\001\001\002\000" +
    "\004\141\026\001\002\000\004\131\027\001\002\000\010" +
    "\042\034\055\033\063\031\001\002\000\014\042\ufff5\055" +
    "\ufff5\063\ufff5\132\ufff5\134\ufff5\001\002\000\004\131\114" +
    "\001\002\000\014\042\ufff3\055\ufff3\063\ufff3\132\ufff3\134" +
    "\ufff3\001\002\000\004\131\070\001\002\000\006\127\053" +
    "\141\054\001\002\000\014\042\ufff0\055\ufff0\063\ufff0\132" +
    "\ufff0\134\ufff0\001\002\000\014\042\ufffb\055\ufffb\063\ufffb" +
    "\132\ufffb\134\ufffb\001\002\000\014\042\ufff2\055\ufff2\063" +
    "\ufff2\132\ufff2\134\ufff2\001\002\000\014\042\ufff7\055\ufff7" +
    "\063\ufff7\132\ufff7\134\ufff7\001\002\000\014\042\ufff9\055" +
    "\ufff9\063\ufff9\132\ufff9\134\ufff9\001\002\000\012\042\034" +
    "\055\033\063\031\132\052\001\002\000\014\042\ufff1\055" +
    "\ufff1\063\ufff1\132\ufff1\134\ufff1\001\002\000\014\042\uffef" +
    "\055\uffef\063\uffef\132\uffef\134\uffef\001\002\000\014\042" +
    "\ufff6\055\ufff6\063\ufff6\132\ufff6\134\ufff6\001\002\000\014" +
    "\042\ufff4\055\ufff4\063\ufff4\132\ufff4\134\ufff4\001\002\000" +
    "\014\042\ufffc\055\ufffc\063\ufffc\132\ufffc\134\ufffc\001\002" +
    "\000\014\042\ufff8\055\ufff8\063\ufff8\132\ufff8\134\ufff8\001" +
    "\002\000\014\042\ufffa\055\ufffa\063\ufffa\132\ufffa\134\ufffa" +
    "\001\002\000\004\002\000\001\002\000\004\141\066\001" +
    "\002\000\012\117\057\126\060\127\056\137\055\001\002" +
    "\000\014\042\uffee\055\uffee\063\uffee\132\uffee\134\uffee\001" +
    "\002\000\004\137\065\001\002\000\004\142\063\001\002" +
    "\000\004\142\061\001\002\000\004\137\062\001\002\000" +
    "\014\042\uffed\055\uffed\063\uffed\132\uffed\134\uffed\001\002" +
    "\000\004\137\064\001\002\000\014\042\uffec\055\uffec\063" +
    "\uffec\132\uffec\134\uffec\001\002\000\014\042\uffeb\055\uffeb" +
    "\063\uffeb\132\uffeb\134\uffeb\001\002\000\004\137\067\001" +
    "\002\000\014\042\uffea\055\uffea\063\uffea\132\uffea\134\uffea" +
    "\001\002\000\006\130\072\141\073\001\002\000\004\132" +
    "\104\001\002\000\004\132\uffe8\001\002\000\004\125\074" +
    "\001\002\000\012\033\076\130\077\141\100\142\075\001" +
    "\002\000\004\132\uffe6\001\002\000\006\033\101\141\102" +
    "\001\002\000\004\132\uffe7\001\002\000\004\132\uffe5\001" +
    "\002\000\004\132\uffe4\001\002\000\004\033\103\001\002" +
    "\000\004\132\uffe3\001\002\000\004\133\105\001\002\000" +
    "\010\042\034\055\033\063\031\001\002\000\012\042\034" +
    "\055\033\063\031\134\107\001\002\000\016\042\uffe9\055" +
    "\uffe9\056\110\063\uffe9\132\uffe9\134\uffe9\001\002\000\004" +
    "\133\111\001\002\000\010\042\034\055\033\063\031\001" +
    "\002\000\012\042\034\055\033\063\031\134\113\001\002" +
    "\000\014\042\uffe2\055\uffe2\063\uffe2\132\uffe2\134\uffe2\001" +
    "\002\000\006\130\072\141\073\001\002\000\004\132\116" +
    "\001\002\000\004\133\117\001\002\000\010\042\034\055" +
    "\033\063\031\001\002\000\012\042\034\055\033\063\031" +
    "\134\121\001\002\000\014\042\uffe1\055\uffe1\063\uffe1\132" +
    "\uffe1\134\uffe1\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\117\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\026\003\041\004\035\006" +
    "\040\007\037\010\027\011\031\015\034\016\043\017\036" +
    "\020\042\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\014\004\046\006\050\007\047" +
    "\010\044\011\045\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\012\070\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\026\003\105\004\035\006\040\007\037\010\027" +
    "\011\031\015\034\016\043\017\036\020\042\001\001\000" +
    "\014\004\046\006\050\007\047\010\044\011\045\001\001" +
    "\000\002\001\001\000\002\001\001\000\026\003\111\004" +
    "\035\006\040\007\037\010\027\011\031\015\034\016\043" +
    "\017\036\020\042\001\001\000\014\004\046\006\050\007" +
    "\047\010\044\011\045\001\001\000\002\001\001\000\004" +
    "\012\114\001\001\000\002\001\001\000\002\001\001\000" +
    "\026\003\117\004\035\006\040\007\037\010\027\011\031" +
    "\015\034\016\043\017\036\020\042\001\001\000\014\004" +
    "\046\006\050\007\047\010\044\011\045\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$SintacticoSQL$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$SintacticoSQL$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$SintacticoSQL$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$SintacticoSQL$actions {
  private final SintacticoSQL parser;

  /** Constructor */
  CUP$SintacticoSQL$actions(SintacticoSQL parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$SintacticoSQL$do_action(
    int                        CUP$SintacticoSQL$act_num,
    java_cup.runtime.lr_parser CUP$SintacticoSQL$parser,
    java.util.Stack            CUP$SintacticoSQL$stack,
    int                        CUP$SintacticoSQL$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$SintacticoSQL$result;

      /* select the action based on the action number */
      switch (CUP$SintacticoSQL$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // WHILE ::= While Parentesis_Izq SENTENCIA_BOOLEANA Parentesis_Der Llave_Izq SENTENCIA Llave_Der 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("WHILE",6, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-6)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // IF_ELSE ::= If Parentesis_Izq SENTENCIA_BOOLEANA Parentesis_Der Llave_Izq SENTENCIA Llave_Der Else Llave_Izq SENTENCIA Llave_Der 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("IF_ELSE",5, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-10)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SENTENCIA_BOOLEANA ::= Identificador Op_Relacional Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",8, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-4)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SENTENCIA_BOOLEANA ::= Identificador Op_Relacional Comillas Comillas 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",8, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-3)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // SENTENCIA_BOOLEANA ::= Identificador Op_Relacional Identificador 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",8, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-2)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // SENTENCIA_BOOLEANA ::= Identificador Op_Relacional Numero 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",8, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-2)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // SENTENCIA_BOOLEANA ::= Identificador Op_Relacional Op_Booleano 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",8, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-2)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // SENTENCIA_BOOLEANA ::= Op_Booleano 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",8, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // IF ::= If Parentesis_Izq SENTENCIA_BOOLEANA Parentesis_Der Llave_Izq SENTENCIA Llave_Der 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("IF",4, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-6)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // DECLARACION ::= Integer Op_Incremento Identificador P_Coma 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-3)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DECLARACION ::= Integer Identificador Op_Incremento P_Coma 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-3)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACION ::= Integer Identificador Op_Igual Numero P_Coma 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-4)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACION ::= Integer Identificador Op_Atribucion Numero P_Coma 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-4)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DECLARACION ::= Integer Identificador P_Coma 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-2)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // SENTENCIA ::= RESTA 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // SENTENCIA ::= SUMA 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // SENTENCIA ::= DIVISION 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // SENTENCIA ::= MULTIPLICACION 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SENTENCIA ::= FOR 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCIA ::= SENTENCIA FOR 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-1)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA ::= WHILE 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= SENTENCIA WHILE 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-1)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= IF_ELSE 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= SENTENCIA IF_ELSE 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-1)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= IF 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= SENTENCIA IF 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-1)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= SENTENCIA DECLARACION 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-1)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INICIO ::= Select From Identificador P_Coma Where Identificador Op_Igual Comillas Numero Comillas P_Coma 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-10)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= Select From Identificador P_Coma Where Identificador Op_Igual Comillas Identificador Comillas P_Coma 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-10)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= Select From Identificador P_Coma 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-3)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Create Table Identificador Parentesis_Izq SENTENCIA Parentesis_Der 
            {
              Object RESULT =null;

              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-5)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          return CUP$SintacticoSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-1)).value;
		RESULT = start_val;
              CUP$SintacticoSQL$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.elementAt(CUP$SintacticoSQL$top-1)), ((java_cup.runtime.Symbol)CUP$SintacticoSQL$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$SintacticoSQL$parser.done_parsing();
          return CUP$SintacticoSQL$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
