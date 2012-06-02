package python_program.statement;

import python_program.expression.Expression;
import python_program.expression.IdentifierExpression;

public class AssignStatement extends Statement {
	
	IdentifierExpression identifier;
	Expression expression;
	
	public AssignStatement(IdentifierExpression identifier, Expression expression){
		this.identifier = identifier;
		this.expression = expression;
	}
	
	@Override
	public void print() {
		this.identifier.print();
		System.out.print(" = ");
		this.expression.print();
	}

}
