package python_program.statement;

import java.util.Iterator;
import java.util.List;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.LispObject;

import python_program.expression.Expression;

public class IfElseStatement extends Statement {
	
	Expression expression;
	List<Statement> ifStatementList;
	List<Statement> elseStatementList;
	
	public IfElseStatement(Expression expression, List<Statement> ifStatementList, List<Statement> elseStatementList){
		this.expression = expression;
		this.ifStatementList = ifStatementList;
		this.elseStatementList = elseStatementList;
	}
	
	@Override
	public void print() {
		System.out.print("if ");
		this.expression.print();
		System.out.println(":");
		
		System.out.println("<<");
		Iterator<Statement> iterator = this.ifStatementList.iterator();
		while(iterator.hasNext()){
			iterator.next().print();
			System.out.println();
		}
		System.out.println(">>");
		
		System.out.println("else:");
		System.out.println("<<");
		iterator = this.elseStatementList.iterator();
		while(iterator.hasNext()){
			iterator.next().print();
			System.out.println();
		}
		System.out.print(">>");
	}

	@Override
	public List<String> translate() {
		return null;
	}

}
