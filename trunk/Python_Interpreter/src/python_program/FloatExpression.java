package python_program;

public class FloatExpression extends Expression {

	String value;
	
	public FloatExpression(String value){
		this.value = value;
	}
	
	@Override
	public void print() {
		System.out.print(value);
	}

}
