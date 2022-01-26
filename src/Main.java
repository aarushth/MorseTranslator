import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		ArrayList<String> code = new ArrayList<String>();
		code.add(". -"); //A
		code.add("- . . ."); //B
		code.add("- . - ."); //C
		code.add("- . ."); //D
		code.add("."); //E
		code.add(". . - ."); //F
		code.add("- - ."); //G
		code.add(". . . ."); //H
		code.add(". ."); //I
		code.add(". - - -"); //J
		code.add("- . -"); //K
		code.add(". - . ."); //L
		code.add("- - "); //M
		code.add("- ."); //N
		code.add("- - -"); //O
		code.add(". - - ."); //P
		code.add("- - . -"); //Q
		code.add(". - ."); //R
		code.add(". . ."); //S
		code.add("-"); //T
		code.add(". . -"); //U
		code.add(". . . -"); //V
		code.add(". - -"); //W
		code.add("- . . -"); //X
		code.add("- . - -"); //Y
		code.add("- - . ."); //Z
		code.add("/"); //<Space>
		ArrayList<Letter> letters = new ArrayList<Letter>();
		for(int i = 0; i < code.size() - 1; i++) {
			letters.add(new Letter((char) (i+65), code.get(i)));
		}
		letters.add(new Letter(' ', code.get(26)));
		
		Scanner s = new Scanner(System.in);
		StringBuffer input = new StringBuffer(s.nextLine());

		
		Translator translator = new Translator(letters);
		System.out.println(translator.morseToEnglish(input));
		
		
	}
} 