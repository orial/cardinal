package python_program;

public class IntegerExpression extends Expression {
	
	int value;
	
	public IntegerExpression(int value){
		this.value = value;
	}
	
	@Override
	public void print() {
		System.out.print(value);
	}

}
