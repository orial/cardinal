package python_program.operators;

public enum UnaryOperators {
	add, sub, not;

	public void print() {
		switch(this){
			case add:
				System.out.print("+");
				break;
			case sub:
				System.out.print("-");
				break;
			case not:
				System.out.print("not ");
				break;
		}
	}
}
