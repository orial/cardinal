
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Apr 14 12:16:11 CEST 2012
//----------------------------------------------------

package parser;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Apr 14 12:16:11 CEST 2012
  */
public class ParserCup extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserCup() {super();}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\042\000\002\002\003\000\002\002\004\000\002\003" +
    "\004\000\002\005\004\000\002\005\002\000\002\004\005" +
    "\000\002\007\005\000\002\007\002\000\002\010\003\000" +
    "\002\010\003\000\002\010\003\000\002\011\003\000\002" +
    "\011\003\000\002\011\003\000\002\011\003\000\002\011" +
    "\003\000\002\011\003\000\002\011\003\000\002\011\003" +
    "\000\002\011\003\000\002\011\003\000\002\011\003\000" +
    "\002\011\003\000\002\011\003\000\002\011\003\000\002" +
    "\006\003\000\002\006\004\000\002\006\005\000\002\006" +
    "\005\000\002\006\005\000\002\006\003\000\002\006\003" +
    "\000\002\006\003\000\002\006\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\004\004\005\001\002\000\004\002\060\001" +
    "\002\000\026\005\020\006\014\014\025\016\017\017\015" +
    "\021\024\032\016\033\021\036\026\040\023\001\002\000" +
    "\004\002\001\001\002\000\006\002\ufffd\004\005\001\002" +
    "\000\006\002\ufffd\004\005\001\002\000\004\002\uffff\001" +
    "\002\000\004\002\ufffe\001\002\000\026\005\020\006\014" +
    "\014\025\016\017\017\015\021\024\032\016\033\021\036" +
    "\026\040\023\001\002\000\026\005\ufff8\006\ufff8\014\ufff8" +
    "\016\ufff8\017\ufff8\021\ufff8\032\ufff8\033\ufff8\036\ufff8\040" +
    "\ufff8\001\002\000\046\002\uffe8\004\uffe8\005\uffe8\006\uffe8" +
    "\010\uffe8\011\uffe8\012\uffe8\013\uffe8\015\uffe8\020\uffe8\022" +
    "\uffe8\023\uffe8\024\uffe8\025\uffe8\026\uffe8\027\uffe8\030\uffe8" +
    "\031\uffe8\001\002\000\046\002\uffe2\004\uffe2\005\uffe2\006" +
    "\uffe2\010\uffe2\011\uffe2\012\uffe2\013\uffe2\015\uffe2\020\uffe2" +
    "\022\uffe2\023\uffe2\024\uffe2\025\uffe2\026\uffe2\027\uffe2\030" +
    "\uffe2\031\uffe2\001\002\000\004\014\055\001\002\000\026" +
    "\005\ufff9\006\ufff9\014\ufff9\016\ufff9\017\ufff9\021\ufff9\032" +
    "\ufff9\033\ufff9\036\ufff9\040\ufff9\001\002\000\046\002\uffe1" +
    "\004\uffe1\005\uffe1\006\uffe1\010\uffe1\011\uffe1\012\uffe1\013" +
    "\uffe1\015\uffe1\020\uffe1\022\uffe1\023\uffe1\024\uffe1\025\uffe1" +
    "\026\uffe1\027\uffe1\030\uffe1\031\uffe1\001\002\000\044\002" +
    "\ufffa\004\ufffa\005\040\006\030\010\035\011\042\012\033" +
    "\013\034\020\052\022\045\023\036\024\037\025\044\026" +
    "\046\027\032\030\047\031\031\001\002\000\046\002\uffe0" +
    "\004\uffe0\005\uffe0\006\uffe0\010\uffe0\011\uffe0\012\uffe0\013" +
    "\uffe0\015\uffe0\020\uffe0\022\uffe0\023\uffe0\024\uffe0\025\uffe0" +
    "\026\uffe0\027\uffe0\030\uffe0\031\uffe0\001\002\000\026\005" +
    "\ufff7\006\ufff7\014\ufff7\016\ufff7\017\ufff7\021\ufff7\032\ufff7" +
    "\033\ufff7\036\ufff7\040\ufff7\001\002\000\026\005\020\006" +
    "\014\014\025\016\017\017\015\021\024\032\016\033\021" +
    "\036\026\040\023\001\002\000\046\002\uffe3\004\uffe3\005" +
    "\uffe3\006\uffe3\010\uffe3\011\uffe3\012\uffe3\013\uffe3\015\uffe3" +
    "\020\uffe3\022\uffe3\023\uffe3\024\uffe3\025\uffe3\026\uffe3\027" +
    "\uffe3\030\uffe3\031\uffe3\001\002\000\040\005\040\006\030" +
    "\010\035\011\042\012\033\013\034\015\043\022\045\023" +
    "\036\024\037\025\044\026\046\027\032\030\047\031\031" +
    "\001\002\000\026\005\ufff5\006\ufff5\014\ufff5\016\ufff5\017" +
    "\ufff5\021\ufff5\032\ufff5\033\ufff5\036\ufff5\040\ufff5\001\002" +
    "\000\026\005\uffe9\006\uffe9\014\uffe9\016\uffe9\017\uffe9\021" +
    "\uffe9\032\uffe9\033\uffe9\036\uffe9\040\uffe9\001\002\000\026" +
    "\005\uffeb\006\uffeb\014\uffeb\016\uffeb\017\uffeb\021\uffeb\032" +
    "\uffeb\033\uffeb\036\uffeb\040\uffeb\001\002\000\026\005\ufff1" +
    "\006\ufff1\014\ufff1\016\ufff1\017\ufff1\021\ufff1\032\ufff1\033" +
    "\ufff1\036\ufff1\040\ufff1\001\002\000\026\005\ufff2\006\ufff2" +
    "\014\ufff2\016\ufff2\017\ufff2\021\ufff2\032\ufff2\033\ufff2\036" +
    "\ufff2\040\ufff2\001\002\000\026\005\ufff4\006\ufff4\014\ufff4" +
    "\016\ufff4\017\ufff4\021\ufff4\032\ufff4\033\ufff4\036\ufff4\040" +
    "\ufff4\001\002\000\026\005\uffef\006\uffef\014\uffef\016\uffef" +
    "\017\uffef\021\uffef\032\uffef\033\uffef\036\uffef\040\uffef\001" +
    "\002\000\026\005\uffee\006\uffee\014\uffee\016\uffee\017\uffee" +
    "\021\uffee\032\uffee\033\uffee\036\uffee\040\uffee\001\002\000" +
    "\026\005\ufff6\006\ufff6\014\ufff6\016\ufff6\017\ufff6\021\ufff6" +
    "\032\ufff6\033\ufff6\036\ufff6\040\ufff6\001\002\000\026\005" +
    "\020\006\014\014\025\016\017\017\015\021\024\032\016" +
    "\033\021\036\026\040\023\001\002\000\026\005\ufff3\006" +
    "\ufff3\014\ufff3\016\ufff3\017\ufff3\021\ufff3\032\ufff3\033\ufff3" +
    "\036\ufff3\040\ufff3\001\002\000\046\002\uffe5\004\uffe5\005" +
    "\uffe5\006\uffe5\010\uffe5\011\uffe5\012\uffe5\013\uffe5\015\uffe5" +
    "\020\uffe5\022\uffe5\023\uffe5\024\uffe5\025\uffe5\026\uffe5\027" +
    "\uffe5\030\uffe5\031\uffe5\001\002\000\026\005\uffed\006\uffed" +
    "\014\uffed\016\uffed\017\uffed\021\uffed\032\uffed\033\uffed\036" +
    "\uffed\040\uffed\001\002\000\026\005\ufff0\006\ufff0\014\ufff0" +
    "\016\ufff0\017\ufff0\021\ufff0\032\ufff0\033\ufff0\036\ufff0\040" +
    "\ufff0\001\002\000\026\005\uffec\006\uffec\014\uffec\016\uffec" +
    "\017\uffec\021\uffec\032\uffec\033\uffec\036\uffec\040\uffec\001" +
    "\002\000\026\005\uffea\006\uffea\014\uffea\016\uffea\017\uffea" +
    "\021\uffea\032\uffea\033\uffea\036\uffea\040\uffea\001\002\000" +
    "\046\002\uffe6\004\uffe6\005\040\006\030\010\035\011\042" +
    "\012\033\013\034\015\uffe6\020\uffe6\022\045\023\036\024" +
    "\037\025\044\026\046\027\032\030\047\031\031\001\002" +
    "\000\006\002\ufffc\004\ufffc\001\002\000\026\005\020\006" +
    "\014\014\025\016\017\017\015\021\024\032\016\033\021" +
    "\036\026\040\023\001\002\000\044\002\ufffa\004\ufffa\005" +
    "\040\006\030\010\035\011\042\012\033\013\034\020\052" +
    "\022\045\023\036\024\037\025\044\026\046\027\032\030" +
    "\047\031\031\001\002\000\006\002\ufffb\004\ufffb\001\002" +
    "\000\004\015\056\001\002\000\046\002\uffe4\004\uffe4\005" +
    "\uffe4\006\uffe4\010\uffe4\011\uffe4\012\uffe4\013\uffe4\015\uffe4" +
    "\020\uffe4\022\uffe4\023\uffe4\024\uffe4\025\uffe4\026\uffe4\027" +
    "\uffe4\030\uffe4\031\uffe4\001\002\000\046\002\uffe7\004\uffe7" +
    "\005\uffe7\006\uffe7\010\uffe7\011\uffe7\012\033\013\uffe7\015" +
    "\uffe7\020\uffe7\022\uffe7\023\uffe7\024\uffe7\025\uffe7\026\uffe7" +
    "\027\uffe7\030\uffe7\031\uffe7\001\002\000\004\002\000\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\010\002\003\003\005\004\006\001\001\000" +
    "\002\001\001\000\006\006\021\010\012\001\001\000\002" +
    "\001\001\000\006\004\007\005\010\001\001\000\006\004" +
    "\007\005\011\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\006\056\010\012\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\007\050\011\040\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\006\026" +
    "\010\012\001\001\000\002\001\001\000\004\011\040\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\006\047\010\012\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\011\040\001\001\000\002\001" +
    "\001\000\006\006\052\010\012\001\001\000\006\007\053" +
    "\011\040\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\011\040\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCup$actions(this);
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
    return action_obj.CUP$ParserCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserCup$actions {



  private final ParserCup parser;

  /** Constructor */
  CUP$ParserCup$actions(ParserCup parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCup$result;

      /* select the action based on the action number */
      switch (CUP$ParserCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // expression ::= IDENTIFIER 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // expression ::= FALSE 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // expression ::= TRUE 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // expression ::= FLOAT 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // expression ::= INPUT LEFTPARENTHESE RIGHTPARENTHESE 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // expression ::= LEFTPARENTHESE expression RIGHTPARENTHESE 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // expression ::= expression binary_op expression 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expression ::= unary_op expression 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expression ::= INTEGER 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // binary_op ::= AND 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // binary_op ::= OR 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // binary_op ::= NOTEQUAL 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // binary_op ::= LESSOREQUAL 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // binary_op ::= GREATEROREQUAL 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // binary_op ::= EQUAL 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // binary_op ::= GREATER 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // binary_op ::= LESS 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // binary_op ::= POW 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // binary_op ::= MOD 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // binary_op ::= DIV 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // binary_op ::= MULT 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // binary_op ::= MINUS 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // binary_op ::= PLUS 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("binary_op",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // unary_op ::= NOT 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("unary_op",6, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // unary_op ::= MINUS 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("unary_op",6, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // unary_op ::= PLUS 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("unary_op",6, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expression_comma_list ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression_comma_list",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expression_comma_list ::= COMMA expression expression_comma_list 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression_comma_list",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // simple_statement ::= PRINT expression expression_comma_list 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("simple_statement",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // simple_statement_list ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("simple_statement_list",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // simple_statement_list ::= simple_statement simple_statement_list 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("simple_statement_list",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // module ::= simple_statement simple_statement_list 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("module",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		RESULT = start_val;
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCup$parser.done_parsing();
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= module 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
