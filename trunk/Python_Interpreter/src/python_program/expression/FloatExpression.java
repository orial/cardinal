package python_program.expression;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.LispObject;

import python_program.Types;

public class FloatExpression extends Expression {

	String value;
	
	public FloatExpression(String value){
		this.value = value;
	}
	
	@Override
	public void print() {
		System.out.print(value);
	}

	@Override
	public Types getType() {
		return Types.float_type;
	}

	@Override
	public String translate() {
		return value;
	}
	
}
