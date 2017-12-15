package comp1;


public class Reverse {
	
	private String 거꾸로문자="";

	public String reverse(String s) {
		for (int i = s.length()-1; i >= 0; i--) {
			거꾸로문자 += s.charAt(i);
		}
		return 거꾸로문자;
	}

}
