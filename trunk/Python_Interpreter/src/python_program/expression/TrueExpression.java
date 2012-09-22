package python_program.expression;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.LispObject;

import python_program.Types;

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

	@Override
	public LispObject translate() {
		return Interpreter.getInstance().eval("T");
	}

}
