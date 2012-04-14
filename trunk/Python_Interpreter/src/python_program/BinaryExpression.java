package python_program;

public class BinaryExpression extends Expression {
	
	Expression expression1;
	BinaryOperators operator;
	Expression expression2;
	
	public BinaryExpression(Expression expression1, BinaryOperators operator, Expression expression2){
		this.expression1 = expression1;
		this.operator = operator;
		this.expression2 = expression2;
	}
	
	@Override
	public void print() {
		expression1.print();
		operator.print();
		expression2.print();
	}

}
