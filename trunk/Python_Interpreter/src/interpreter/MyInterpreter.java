package interpreter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.LispObject;

import parser.LekserLex;
import parser.ParserCup;
import python_program.Program;

public class MyInterpreter {

	public static void main(String args[])
	{
		Interpreter interpreter = Interpreter.createInstance();
		 
		if(args.length == 1){	//Wczytuje z lini polecen nazwe pliku i go interpretuje
			try {
				ParserCup parser = new ParserCup(new LekserLex(new FileReader(args[0])));
				Program program = (Program)parser.debug_parse().value;
				program.print();
				program.translate(interpreter);
				
			} catch (FileNotFoundException e) {
				System.err.println("Error: Can't open file " + args[0]);
				System.exit(-1);
			}catch (Exception e) {
				e.printStackTrace();
				System.exit(-1);
			}
		}
		else if(args.length > 1){
			System.out.println("Error: Too many arguments");
			System.exit(-1);
		}
		else {
			System.out.println("Error: Missin");
			System.exit(-1);
		}
	}
}
