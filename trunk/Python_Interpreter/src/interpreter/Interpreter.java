package interpreter;

import java.io.FileNotFoundException;
import java.io.FileReader;

import parser.LekserLex;
import parser.ParserCup;

public class Interpreter {

	public static void main(String args[])
	{
		if(args.length == 0)		//Uruchamia interpreter
		{
			
		}
		else if(args.length == 1){	//Wczytuje z lini poleceñ nazwê pliku i go interpretuje
			try {
				ParserCup parser = new ParserCup(new LekserLex(new FileReader(args[0])));
				parser.debug_parse();
			} catch (FileNotFoundException e) {
				System.out.println("Error: Can't open file " + args[0]);
				System.exit(-1);
			} catch (Exception e) {
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
