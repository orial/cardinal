package python_program;

import java.util.Iterator;
import java.util.List;

public class PrintStatement extends SimpleStatement {
	
	List<Expression> expressions;
	
	public PrintStatement(List<Expression> expressions){
		this.expressions = expressions;
	}
	
	@Override
	public void print() {
		System.out.print("print ");
		Iterator<Expression> iterator = expressions.iterator();
		while(iterator.hasNext()){
			iterator.next().print();
		}
	}

}
