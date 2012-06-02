package python_program.statement;

public class PassStatement extends SimpleStatement {
	
	public PassStatement(){}
	
	@Override
	public void print() {
		System.out.println("pass");
	}

}
