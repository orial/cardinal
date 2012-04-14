package interpreter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java_cup.runtime.Symbol;

import parser.LekserLex;
import parser.ParserCup;
import parser.sym;
import python_program.Program;

public class Interpreter {

	public static void main(String args[])
	{
		if(args.length == 0)		//Uruchamia interpreter
		{
			
		}
		else if(args.length == 1){	//Wczytuje z lini poleceñ nazwê pliku i go interpretuje
			try {
				ParserCup parser = new ParserCup(new LekserLex(new FileReader(args[0])));
				Program program = (Program)parser.parse().value;
				program.print();
				/*LekserLex lekser = new LekserLex(new FileReader(args[0]));
				
				Symbol tmp = lekser.next_token();
				while(tmp.sym != sym.EOF){
					System.out.print(tmp + "\t");
					
					if(tmp.value != null){
						System.out.print(tmp.value);
					}
					
					tmp = lekser.next_token();
					System.out.println();
				}*/
				
			} catch (FileNotFoundException e) {
				System.err.println("Error: Can't open file " + args[0]);
				System.exit(-1);
			}catch (Exception e) {
				e.printStackTrace();
				System.exit(-1);
			}
		}
		else{
			System.out.println("Error: Too many arguments");
			System.exit(-1);
		}
	}
}
