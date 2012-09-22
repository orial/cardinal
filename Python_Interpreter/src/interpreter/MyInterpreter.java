package interpreter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispInteger;
import org.armedbear.lisp.LispObject;

import parser.LekserLex;
import parser.ParserCup;
import python_program.Program;

public class MyInterpreter {

	public static void main(String args[])
	{
		 Interpreter interpreter = Interpreter.createInstance();
		 //System.out.println(interpreter.eval("(+ 4 5)").toString());
		
		 LispObject result = interpreter.eval("(+ 4 5)");
		 LispObject obj = new LispObject();
		 LispObject obj2 = interpreter.eval("4");
		 obj2 = obj2.add(5);
		 obj2 = obj2.add(obj2);
		 
		 //LispObject obj3 = interpreter.eval("abc");
		 //System.out.println(obj3.toString());
		 
		 //obj2.aset(0, 10);
		 System.out.println(obj2.intValue());
		 //System.out.println(interpreter.eval());
		 System.out.println(result.intValue());
		 
		if(args.length == 0)		//Uruchamia interpreter
		{
			try {
				ParserCup parser = new ParserCup(new LekserLex(new InputStreamReader(System.in)));
				Program program = (Program)parser.debug_parse().value;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(args.length == 1){	//Wczytuje z lini polecen nazwe pliku i go interpretuje
			try {
				ParserCup parser = new ParserCup(new LekserLex(new FileReader(args[0])));
				Program program = (Program)parser.debug_parse().value;
				program.print();
				
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
