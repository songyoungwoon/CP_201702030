package comp1;

import java.util.Scanner;

public class ReverseTest {
	public static void main(String[] args) {
		Reverse re = new Reverse();
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ��� �Է��Ͻʽÿ� : ");
		String str = sc.nextLine();
		System.out.println("������ " + re.reverse(str) + "�Դϴ�.");

	}

}
