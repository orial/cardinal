package python_program.statement;

import java.util.Iterator;
import java.util.List;

import python_program.expression.Expression;

public class WhileStatement extends Statement {
	
	Expression expression;
	List<Statement> statementList;
	
	public WhileStatement(Expression expression, List<Statement> statementList){
		this.expression = expression;
		this.statementList = statementList;
	}
	
	@Override
	public void print() {
		System.out.print("while ");
		this.expression.print();
		System.out.println(":");
		System.out.print("<<");
		Iterator<Statement> iterator = this.statementList.iterator();
		while(iterator.hasNext()){
			iterator.next().print();
		}
		System.out.print(">>");
	}

}
