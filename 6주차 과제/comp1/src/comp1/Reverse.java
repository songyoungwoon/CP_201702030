package comp1;


public class Reverse {
	
	private String �Ųٷι���="";

	public String reverse(String s) {
		for (int i = s.length()-1; i >= 0; i--) {
			�Ųٷι��� += s.charAt(i);
		}
		return �Ųٷι���;
	}

}
