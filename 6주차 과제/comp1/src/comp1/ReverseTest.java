package comp1;

import java.util.Scanner;

public class ReverseTest {
	public static void main(String[] args) {
		Reverse re = new Reverse();
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하십시오 : ");
		String str = sc.nextLine();
		System.out.println("역순은 " + re.reverse(str) + "입니다.");

	}

}
