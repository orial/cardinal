package python_program.expression;

import org.armedbear.lisp.LispObject;

import python_program.Types;

public class KeyDatumExpression extends Expression {
	
	Expression expr1;
	Expression expr2;
	
	public KeyDatumExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public void print() {
		expr1.print();
		System.out.print(":");
		expr2.print();
	}

	@Override
	public Types getType() {
		return Types.none_type;
	}

	@Override
	public LispObject translate() {
		// TODO Auto-generated method stub
		return null;
	}

}
