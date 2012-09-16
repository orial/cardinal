package python_program.statement;

import python_program.expression.Expression;

public class ReturnStatement extends Statement {
	
	Expression expr;

	public ReturnStatement(Expression expr) {
		this.expr = expr;
	}

	@Override
	public void print() {
		System.out.print("return ");
		expr.print();
	}

}
