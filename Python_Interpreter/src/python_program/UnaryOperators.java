package python_program;

public enum UnaryOperators {
	add, sub;

	public void print() {
		switch(this){
			case add:
				System.out.print("+");
				break;
			case sub:
				System.out.print("-");
				break;
		}
	}
}
