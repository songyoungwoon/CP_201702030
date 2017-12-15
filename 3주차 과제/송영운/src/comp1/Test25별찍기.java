package comp1;

public class Test25º°Âï±â {
	public static void main(String[] args) {
		String star = "*";
		String space = "";

		for (int i = 1; i < 10; i++) {

			if (i < 5) {
				space = "";
				for (int j = i; j < 5; j++) {
					space += " ";
				}
				System.out.print(space);
				System.out.println(star);
				star += "**";
			}
            
            	
			if (5 <= i) {
				star = "*";
				for (int k = i; k < 9; k++) {
					star += "**";
				}

				System.out.println(star);
				System.out.print(space);
				space += " ";
			}
		}
	}
}