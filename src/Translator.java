import java.util.ArrayList;

public class Translator {
	
	ArrayList<Letter> letters;
	
	public Translator(ArrayList<Letter> l) {
		letters = l;
	}
	
	public String morseToEnglish(StringBuffer input) {
		StringBuilder finalAns = new StringBuilder();
		while(input.length() > 0) {
			for(int i = 0; i < input.length()-1; i++) {
				StringBuffer temp = new StringBuffer("");
				if(input.charAt(i) == ' ' && input.charAt(i+1) == ' ' && input.charAt(i+2) == ' ') {
					for(int j = 0; j < i; j ++) {
						temp.append(input.charAt(j));
					}
					input.delete(0, i);
					i = 0;
					char ans = ' ';
					for(int j = 0; j < letters.size(); j ++) {
						if(letters.get(j).compare(temp.toString()) != '?') {
							ans = letters.get(j).compare(temp.toString());
							break;
						}
					}
					finalAns.append(ans);
					
				}
				if(input.charAt(i) == ' ' && input.charAt(i+1) == ' ' && input.charAt(i+2) == ' '){
					input.deleteCharAt(0);
					input.deleteCharAt(0);	
					input.deleteCharAt(0);
					i = 0;
				}
			}
		}
		return finalAns.toString();
	}
}
