package python_program;

import java.util.Iterator;
import java.util.List;

public class Program {
	List<SimpleStatement> statements;
	
	public Program(List<SimpleStatement> statements){
		this.statements = statements;
	}
	
	public void print(){
		Iterator<SimpleStatement> iterator = statements.iterator();
		while(iterator.hasNext()){
			iterator.next().print();
		}
	}
}
