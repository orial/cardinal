package python_program;

public class InputExpression extends Expression {
	
	public InputExpression(){
		
	}
	
	@Override
	public void print() {
		System.out.print("input ()");
	}

	@Override
	public Types getType() {
		return Types.nondefined_type;
	}

}
