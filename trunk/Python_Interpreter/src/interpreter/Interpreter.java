package interpreter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java_cup.runtime.Symbol;

import parser.LekserLex;
import parser.ParserCup;
import parser.sym;

public class Interpreter {

	public static void main(String args[])
	{
		if(args.length == 0)		//Uruchamia interpreter
		{
			
		}
		else if(args.length == 1){	//Wczytuje z lini poleceñ nazwê pliku i go interpretuje
			try {
				//ParserCup parser = new ParserCup(new LekserLex(new FileReader(args[0])));
				//parser.debug_parse();
				LekserLex lekser = new LekserLex(new FileReader(args[0]));
				
				Symbol tmp = lekser.next_token();
				while(tmp.sym != sym.EOF){
					System.out.println(tmp);
					tmp = lekser.next_token();
				}
			} catch (FileNotFoundException e) {
				System.out.println("Error: Can't open file " + args[0]);
				System.exit(-1);
			} catch(IOException e){
				System.out.println("Koniec wczytywania");
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
