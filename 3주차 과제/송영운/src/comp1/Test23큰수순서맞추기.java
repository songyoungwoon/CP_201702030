package comp1;

import java.util.Scanner;

public class Test23ū���������߱� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		System.out.print("�ι��� ���� �Է��Ͻÿ� : ");
		int b = sc.nextInt();
		System.out.print("����° ���� �Է��Ͻÿ� : ");
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
