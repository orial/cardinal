package python_program.operators;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.LispObject;

public enum BinaryOperators {
	add, sub, mult, div, mod, pow,
	less, greater, lessorequal, greaterorequal, equal, notequal,
	or, and;

	public void print() {
		switch(this){
			case add: 
				System.out.print("+");
				break;
			case sub:
				System.out.print("-");
				break;
			case mult:
				System.out.print("*");
				break;
			case div:
				System.out.print("/");
				break;
			case mod:
				System.out.print("%");
				break;
			case pow:
				System.out.print("**");
				break;
			case less:
				System.out.print("<");
				break;
			case greater:
				System.out.print(">");
				break;
			case greaterorequal:
				System.out.print(">=");
				break;
			case lessorequal:
				System.out.print("<=");
				break;
			case equal:
				System.out.print("==");
				break;
			case notequal:
				System.out.print("!=");
				break;
			case and:
				System.out.print("and");
				break;
			case or:
				System.out.print("or");
				break;
		} 
	}
	
	public LispObject translate(LispObject obj1, LispObject obj2) {
		switch(this){
			case add: 
				return obj1.add(obj2);
			case sub:
				return obj1.subtract(obj2);
			case mult:
				return obj1.multiplyBy(obj2);
			case div:
				return obj1.divideBy(obj2);
			case mod:
				return obj1.MOD(obj2);
			case pow:
				return Interpreter.getInstance().eval("(expt " + obj1.princToString() + " " + obj2.princToString() + " )");
			case less:
				return obj1.IS_LT(obj2);
			case greater:
				return obj1.IS_GT(obj2);
			case greaterorequal:
				return obj1.IS_GE(obj2);
			case lessorequal:
				return obj1.IS_LE(obj2);
			case equal:
				return obj1.IS_E(obj2);
			case notequal:
				return obj1.IS_NE(obj2);
			case and:
				boolean b1 = obj1.getBooleanValue();
				boolean b2 = obj2.getBooleanValue();
				if(b1 && b2) {
					return Interpreter.getInstance().eval("T");
				}
				else {
					return Interpreter.getInstance().eval("NIL");
				}
			case or:
				boolean b3 = obj1.getBooleanValue();
				boolean b4 = obj2.getBooleanValue();
				if(b3 || b4) {
					return Interpreter.getInstance().eval("T");
				}
				else {
					return Interpreter.getInstance().eval("NIL");
				}
		}
		return null;
	}
}
