package python_program;

public class FloatExpression extends Expression {

	float value;
	
	public FloatExpression(float value){
		this.value = value;
	}
	
	@Override
	public void print() {
		System.out.print(value);
	}

}
