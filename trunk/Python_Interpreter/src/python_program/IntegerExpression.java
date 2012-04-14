package python_program;

public class IntegerExpression extends Expression {
	
	String value;
	
	public IntegerExpression(String value){
		this.value = value;
	}
	
	@Override
	public void print() {
		System.out.print(value);
	}

}
