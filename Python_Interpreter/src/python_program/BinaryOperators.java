package python_program;

public enum BinaryOperators {
	add, sub, mult, div, mod, pow;

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
		} 
	}
}
