package python_program.statement;

import java.util.Iterator;
import java.util.List;

import org.armedbear.lisp.LispObject;

public class FunctionDefinitionStatement extends Statement {
	
	String identifier;
	List<String> identifierList;
	List<Statement> statementList;
	
	public FunctionDefinitionStatement(String identifier, List<String> identifierList, List<Statement> statementList) {
		this.identifier = identifier;
		this.identifierList = identifierList;
		this.statementList = statementList;
	}
	
	@Override
	public void print() {
		System.out.print("def ");
		System.out.print(this.identifier);
		System.out.print(" (");
		Iterator<String> identifierIterator = identifierList.iterator();
		if(identifierIterator.hasNext()) {
			System.out.print(identifierIterator.next());
		}
		while(identifierIterator.hasNext()) {
			System.out.print(", ");
			System.out.print(identifierIterator.next());
		}
		System.out.println("):");
		
		System.out.println("<<");
		Iterator<Statement> statementIterator = this.statementList.iterator();
		while(statementIterator.hasNext()){
			statementIterator.next().print();
			System.out.println();
		}
		System.out.print(">>");
	}

	@Override
	public LispObject translate() {
		// TODO Auto-generated method stub
		return null;
	}

}
