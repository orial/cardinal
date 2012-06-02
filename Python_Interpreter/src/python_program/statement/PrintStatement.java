package python_program.statement;

import java.util.Iterator;
import java.util.List;

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
		iterator.next().print();
		while(iterator.hasNext()){
			System.out.print(", ");
			iterator.next().print();
		}
	}

}
