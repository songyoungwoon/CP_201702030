package comp1;

import java.util.Scanner;

public class Test19저금통 {
	public static void main(String[] args) {
		int n500;
		int n100;
		int n50;
		int n10;
		Scanner sc = new Scanner(System.in);
		System.out.print("500원의 개수를 입력하시오 : ");
		n500 = sc.nextInt();
		System.out.print("100원의 개수를 입력하시오 : ");
		n100 = sc.nextInt();
		System.out.print("50원의 개수를 입력하시오 : ");
		n50 = sc.nextInt();
		System.out.print("10원의 개수를 입력하시오 : ");
		n10 = sc.nextInt();

		int s500 = 500 * n500;
		int s100 = 100 * n100;
		int s50 = 50 * n50;
		int s10 = 10 * n10;

		int sum = s500 + s100 + s50 + s10;

		System.out.println("저축한 금액 : " + sum);

	}

}
