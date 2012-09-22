package python_program.expression;

import java.util.Iterator;
import java.util.List;

import org.armedbear.lisp.LispObject;

import python_program.Types;

public class DictExpression extends Expression {
	
	List<KeyDatumExpression> list;
	
	public DictExpression(List<KeyDatumExpression> list) {
		this.list = list;
	}
	
	@Override
	public void print() {
		System.out.print("{ ");
		
		Iterator<KeyDatumExpression> iterator = this.list.iterator();
		if(iterator.hasNext()) {
			iterator.next().print();
		}		
		while(iterator.hasNext()) {
			System.out.print(", ");
			iterator.next().print();			
		}
	
		System.out.print(" }");
	}

	@Override
	public Types getType() {
		return Types.dict_type;
	}

	@Override
	public LispObject translate() {
		// TODO Auto-generated method stub
		return null;
	}

}
