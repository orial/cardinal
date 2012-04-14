package python_program;

public class ParenthesesExpression extends Expression{
	
	Expression expression;
	
	public ParenthesesExpression(Expression expression){
		this.expression=expression;
	}

	@Override
	public void print() {
		System.out.print("(");
		expression.print();
		System.out.print(")");
	}
}
