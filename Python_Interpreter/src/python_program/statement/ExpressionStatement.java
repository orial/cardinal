package python_program.statement;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.LispObject;

import python_program.expression.Expression;

public class ExpressionStatement extends Statement {

	Expression expr;
	
	public ExpressionStatement(Expression expr) {
		this.expr = expr;
		
		System.out.println(translate().princToString());
	}

	@Override
	public void print() {
		expr.print();
	}

	public LispObject translate() {
		//System.out.println(expr.translate());
		return Interpreter.getInstance().eval(expr.translate());
	}

}
