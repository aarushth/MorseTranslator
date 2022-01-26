public class Letter {
	private char letter;
	private String code;
	
	public Letter(char l, String c) {
		letter = l;
		code = c;
	}
	
	public char getLetter() {
		return letter;
	}
	
	public char compare(String s) {
		boolean check = false;
		if(code.length() != s.length()) {
			return '?';
		}
		for(int i = 0; i < code.length() && i < s.length(); i++) {
			if(s.charAt(i) == code.charAt(i)){
				check = true;
			}else {
				check = false;
				return '?';
			}
		}
		if(check) {
			return letter;
		}else {
			return '?';
		}
	}
}
