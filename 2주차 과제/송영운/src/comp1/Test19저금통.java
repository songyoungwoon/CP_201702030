package comp1;

import java.util.Scanner;

public class Test19������ {
	public static void main(String[] args) {
		int n500;
		int n100;
		int n50;
		int n10;
		Scanner sc = new Scanner(System.in);
		System.out.print("500���� ������ �Է��Ͻÿ� : ");
		n500 = sc.nextInt();
		System.out.print("100���� ������ �Է��Ͻÿ� : ");
		n100 = sc.nextInt();
		System.out.print("50���� ������ �Է��Ͻÿ� : ");
		n50 = sc.nextInt();
		System.out.print("10���� ������ �Է��Ͻÿ� : ");
		n10 = sc.nextInt();

		int s500 = 500 * n500;
		int s100 = 100 * n100;
		int s50 = 50 * n50;
		int s10 = 10 * n10;

		int sum = s500 + s100 + s50 + s10;

		System.out.println("������ �ݾ� : " + sum);

	}

}
