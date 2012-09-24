package python_program.expression;

import java.util.Iterator;
import java.util.List;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.LispObject;
import python_program.Types;

public class ListExpression extends Expression {
	
	List<Expression> list;
	
	public ListExpression(List<Expression> list) {
		this.list = list;
	}
	
	@Override
	public void print() {
		System.out.print("[ ");
		
		Iterator<Expression> iterator = this.list.iterator();
		if(iterator.hasNext()) {
			iterator.next().print();
		}		
		while(iterator.hasNext()) {
			System.out.print(", ");
			iterator.next().print();			
		}
	
		System.out.print(" ]");
	}

	@Override
	public Types getType() {
		return Types.list_type;
	}

	@Override
	public String translate() {
		
		Interpreter interpreter = Interpreter.getInstance();
		LispObject list;

		Iterator<Expression> iterator = this.list.iterator();
		if(iterator.hasNext()) {
			Expression next = iterator.next();
			//System.out.println("'(" + next.translate().princToString() + ")");
			//list = interpreter.eval("'(" + next.translate().princToString() + ")");
			list = interpreter.eval("'(1 2 3 4)");
			//interpreter.eval("");
			
			//LispObject result =  interpreter.eval ( " ' ( 1 2 4 5) " ) ;
			//while ( result != Symbol.NIL) {
			//doSomething ( result . car ( ) ) ;
			//result = result . cdr ( ) ;
			//g
			
		}
		else {
			list = interpreter.eval("'()");
		}/*
		while(iterator.hasNext()) {
			Expression next = iterator.next();
			System.out.println("(append " + list.princToString() + " '(" + next.translate().princToString() + "))");
			list = interpreter.eval("(append " + list.princToString() + " '(" + next.translate().princToString() + "))");			
		}*/
		
		//return list;
		
		return null;
	}

}
