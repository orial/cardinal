package python_program;

public class TrueExpression extends Expression {
	
	public TrueExpression(){
		
	}
	
	@Override
	public void print() {
		System.out.print("True");
	}

	@Override
	public Types getType() {
		return Types.boolean_type;
	}

}