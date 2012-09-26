package python_program.statement;

import java.util.Iterator;
import java.util.List;

import python_program.expression.Expression;

public class ClassStatement extends Statement {
	
	String identifier;
	List<Expression> expressionList;
	List<Statement> statementList;
	
	public ClassStatement(String identifier, List<Expression> expressionList, List<Statement> statementList) {
		this.identifier = identifier;
		this.expressionList = expressionList;
		this.statementList = statementList;
	}

	@Override
	public void print() {
		System.out.print("class ");
		System.out.print(this.identifier);
		
		if(expressionList.size() > 0) {
			System.out.print("(");
			Iterator<Expression> expressionIterator = expressionList.iterator();
			expressionIterator.next().print();
			while(expressionIterator.hasNext()) {
				System.out.print(", ");
				expressionIterator.next();
			}
			System.out.print(")");
		}
		System.out.println(":");
		
		Iterator<Statement> statementIterator = statementList.iterator();
		System.out.println("<<");
		while(statementIterator.hasNext()) {
			statementIterator.next().print();
			System.out.println();
		}
		System.out.println(">>");
	}

	@Override
	public List<String> translate() {
		// TODO Auto-generated method stub
		return null;
	}

}
