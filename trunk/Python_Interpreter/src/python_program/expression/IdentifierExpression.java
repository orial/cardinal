package python_program.expression;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.LispObject;

import python_program.Types;

public class IdentifierExpression extends Expression {
	
	String identifier;
	
	public IdentifierExpression(String identifier){
		this.identifier = identifier;
	}
	
	@Override
	public void print() {
		System.out.print(this.identifier);
	}

	@Override
	public Types getType() {
		return Types.nondefined_type;
	}
	
	public String getIdentifier() {
		return this.identifier;
	}

	@Override
	public LispObject translate() {
		return Interpreter.getInstance().eval(identifier);
	}
	
	@Override
	public String toString() {
		return this.identifier;
	}
}
