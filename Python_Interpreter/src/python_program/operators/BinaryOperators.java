package python_program.operators;

public enum BinaryOperators {
	add, sub, mult, div, mod, pow,
	less, greater, lessorequal, greaterorequal, equal, notequal,
	or, and;

	public void print() {
		switch(this){
			case add: 
				System.out.print("+");
				break;
			case sub:
				System.out.print("-");
				break;
			case mult:
				System.out.print("*");
				break;
			case div:
				System.out.print("/");
				break;
			case mod:
				System.out.print("%");
				break;
			case pow:
				System.out.print("**");
				break;
			case less:
				System.out.print("<");
				break;
			case greater:
				System.out.print(">");
				break;
			case greaterorequal:
				System.out.print(">=");
				break;
			case lessorequal:
				System.out.print("<=");
				break;
			case equal:
				System.out.print("==");
				break;
			case notequal:
				System.out.print("!=");
				break;
			case and:
				System.out.print("and");
				break;
			case or:
				System.out.print("or");
				break;
		} 
	}
}
