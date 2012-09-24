package python_program.expression;

import org.armedbear.lisp.LispObject;

import python_program.Types;

public class IsExpression extends Expression {
	
	Expression expr1;
	Expression expr2;
	
	public IsExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	@Override
	public void print() {
		this.expr1.print();
		System.out.print(" is ");
		this.expr2.print();
	}

	@Override
	public Types getType() {
		return Types.boolean_type;
	}

	@Override
	public String translate() {
		// TODO Auto-generated method stub
		return null;
	}

}
