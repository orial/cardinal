package python_program.expression;

import org.armedbear.lisp.LispObject;

import python_program.Types;

public abstract class Expression {

	public abstract void print();
	public abstract Types getType();
	public abstract LispObject translate();

}
