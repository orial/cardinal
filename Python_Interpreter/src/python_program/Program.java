package python_program;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import python_program.statement.SimpleStatement;

public class Program {
	List<SimpleStatement> statements;
	
	public Program(List<SimpleStatement> statements){
		this.statements = statements;
	}
	
	public void print(){
		Iterator<SimpleStatement> iterator = statements.iterator();
		while(iterator.hasNext()){ 
			iterator.next().print();
			System.out.println();
		}
	}
}
