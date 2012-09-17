package python_program.expression;

import python_program.Types;

public class FullstopExpression extends Expression {
	
	Expression expr1;
	String identifier;
	
	public FullstopExpression(Expression expr1, String identifier) {
		this.expr1 = expr1;
		this.identifier = identifier;
	}

	@Override
	public void print() {
		expr1.print();
		System.out.print(".");
		System.out.print(this.identifier);
	}

	@Override
	public Types getType() {
		return Types.nondefined_type;
	}

}
