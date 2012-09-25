package python_program.statement;

import java.util.List;

import org.armedbear.lisp.LispObject;

public abstract class Statement {

	public abstract void print();
	
	public abstract List<String> translate();

}
