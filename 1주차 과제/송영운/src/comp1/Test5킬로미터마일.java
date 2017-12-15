package comp1;

import java.util.Scanner;

public class Test5킬로미터마일 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("마일을 입력하시오 : ");
		double mile = sc.nextDouble();
		double killometer = mile * 1.609;
		System.out.println(mile + "마일은" + killometer + "킬로미터 입니다.");

	}

}
