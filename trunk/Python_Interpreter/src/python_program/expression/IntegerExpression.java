package python_program.expression;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.LispObject;

import python_program.Types;

public class IntegerExpression extends Expression {
	
	String value;
	
	public IntegerExpression(String value){
		this.value = value;
	}
	
	@Override
	public void print() {
		System.out.print(value);
	}

	@Override
	public Types getType() {
		return Types.int_type;
	}

	@Override
	public LispObject translate() {
		return Interpreter.getInstance().eval(value);
	}
	
}
