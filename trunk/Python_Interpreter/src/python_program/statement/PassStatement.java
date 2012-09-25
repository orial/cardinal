package python_program.statement;

import java.util.List;

import org.armedbear.lisp.LispObject;

public class PassStatement extends Statement {
	
	public PassStatement(){}
	
	@Override
	public void print() {
		System.out.println("pass");
	}

	@Override
	public List<String> translate() {
		// TODO Auto-generated method stub
		return null;
	}

}
