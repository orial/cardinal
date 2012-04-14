package python_program;

public class FalseExpression extends Expression {
	
	public FalseExpression(){
		
	}
	
	@Override
	public void print() {
		System.out.print("False");
	}

	@Override
	public Types getType() {
		return Types.boolean_type;
	}

}
