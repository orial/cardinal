package python_program.statement;

import org.armedbear.lisp.LispObject;

public abstract class Statement {

	public abstract void print();
	
	public abstract LispObject translate();
}
