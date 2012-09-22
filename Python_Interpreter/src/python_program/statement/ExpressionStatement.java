package python_program.statement;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.LispObject;

import python_program.expression.Expression;

public class ExpressionStatement extends Statement {

	Expression expr;
	
	public ExpressionStatement(Expression expr) {
		this.expr = expr;
		
		translate();
	}

	@Override
	public void print() {
		expr.print();
	}

	public LispObject translate() {
		LispObject obj = expr.translate();
		if(obj.integerp() == true) {
			System.out.println(obj.intValue());
		}
		else if(obj.floatp() == true) {
			System.out.println(obj.floatValue());
		}
		else if(obj.stringp() == true) {
			System.out.println(obj.toString());
		}
		else {
			System.out.println(obj.getBooleanValue());
		}
		return obj;
	}

}
