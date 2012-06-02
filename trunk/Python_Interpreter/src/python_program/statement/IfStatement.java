package python_program.statement;

import java.util.Iterator;
import java.util.List;

import python_program.expression.Expression;

public class IfStatement extends Statement{
	
	Expression expression;
	List<Statement> statementList;
	public IfStatement(Expression expression, List<Statement> statementList){
		this.expression = expression;
		this.statementList = statementList;
	}
	
	@Override
	public void print() {
		System.out.print("if ");
		this.expression.print();
		System.out.println(":");
		
		System.out.println("<<");
		Iterator<Statement> iterator = this.statementList.iterator();
		while(iterator.hasNext()){
			iterator.next().print();
			System.out.println();
		}
		System.out.print(">>");
	}

}
