package python_program.statement;

import org.armedbear.lisp.LispObject;

import python_program.expression.Expression;

public class TargetAssignStatement extends Statement {
	
	Expression expr1;
	Expression expr2;
	
	public TargetAssignStatement(Expression expr1, Expression expr2) {
		this.expr1= expr1;
		this.expr2 = expr2;
	}

	@Override
	public void print() {
		this.expr1.print();
		System.out.print(" = ");
		this.expr2.print();
	}

	@Override
	public LispObject translate() {
		// TODO Auto-generated method stub
		return null;
	}

}
