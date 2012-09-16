package python_program.statement;

import python_program.expression.Expression;

public class ExpressionStatement extends Statement {

	Expression expr;
	
	public ExpressionStatement(Expression expr) {
		this.expr = expr;
	}

	@Override
	public void print() {
		expr.print();
	}

}
