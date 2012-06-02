package python_program;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import python_program.statement.Statement;

public class Program {
	List<Statement> statements;
	
	public Program(List<Statement> statements){
		this.statements = statements;
	}
	
	public void print(){
		Iterator<Statement> iterator = statements.iterator();
		while(iterator.hasNext()){ 
			iterator.next().print();
			System.out.println();
		}
	}
}
