package python_program.expression;

import java.util.Iterator;
import java.util.List;

import python_program.Types;

public class LambdaExpression extends Expression {
	
	List<String> identifierList;
	Expression expr;
	
	public LambdaExpression(List<String> identifierList, Expression expr) {
		this.identifierList = identifierList;
		this.expr = expr;
	}

	@Override
	public void print() {
		System.out.print("lambda ");
		
		Iterator<String> iterator = identifierList.iterator();
		if(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		while(iterator.hasNext()) {
			System.out.print(", ");
			System.out.print(iterator.next());
		}
		
		System.out.print(" : ");
		expr.print();
	}

	@Override
	public Types getType() {
		return Types.function_type;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
