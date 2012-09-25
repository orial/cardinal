package python_program.statement;

import java.util.Iterator;
import java.util.List;

import org.armedbear.lisp.LispObject;

import python_program.expression.Expression;

public class PrintStatement extends Statement {
	
	List<Expression> expressions;
	
	public PrintStatement(List<Expression> expressions){
		this.expressions = expressions;
	}
	
	@Override
	public void print() {
		System.out.print("print ");
		
		Iterator<Expression> iterator = expressions.iterator();
		if(iterator.hasNext()) {
			iterator.next().print();
		}
		while(iterator.hasNext()){
			System.out.print(", ");
			iterator.next().print();
		}
	}

	@Override
	public LispObject translate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
