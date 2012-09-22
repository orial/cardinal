package python_program.statement;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.LispObject;

import python_program.expression.Expression;
import python_program.expression.IdentifierExpression;

public class AssignStatement extends Statement {
	
	IdentifierExpression identifier;
	Expression expression;
	
	public AssignStatement(IdentifierExpression identifier, Expression expression){
		this.identifier = identifier;
		this.expression = expression;
		
		System.out.println(translate().princToString());
	}
	
	@Override
	public void print() {
		this.identifier.print();
		System.out.print(" = ");
		this.expression.print();
	}

	@Override
	public LispObject translate() {
		Interpreter interpreter = Interpreter.getInstance();
		return interpreter.eval("(defvar " + this.identifier.getIdentifier() + " " + this.expression.translate().princToString() + ")\n");
	}

}
