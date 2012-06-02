package python_program.statement;

public class PassStatement extends Statement {
	
	public PassStatement(){}
	
	@Override
	public void print() {
		System.out.println("pass");
	}

}
