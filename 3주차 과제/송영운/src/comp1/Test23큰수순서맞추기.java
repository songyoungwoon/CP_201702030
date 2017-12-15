package comp1;

import java.util.Scanner;

public class Test23큰수순서맞추기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하시오 : ");
		int a = sc.nextInt();
		System.out.print("두번재 수를 입력하시오 : ");
		int b = sc.nextInt();
		System.out.print("세번째 수를 입력하시오 : ");
		int c = sc.nextInt();

		if (a < b) {
			if (b < c)
				System.out.println(c + " " + b + " " + a);
			else if (c < b)
				if (a < c)
					System.out.println(b + " " + c + " " + a);
				else
					System.out.println(b + " " + a + " " + c);
		} else if (b < a) {
			if (a < c)
				System.out.println(c + " " + a + " " + b);
			else if (c < a)
				if (c < b)
					System.out.println(a + " " + b + " " + c);
				else
					System.out.println(a + " " + c + " " + b);

		}

	}

}
