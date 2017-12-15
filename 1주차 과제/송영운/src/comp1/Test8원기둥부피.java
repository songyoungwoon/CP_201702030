package comp1;

import java.util.Scanner;

public class Test8원기둥부피 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원기둥 밑면의 반지름을 입력하시오 : ");
		double r = sc.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오 : ");
		double h = sc.nextDouble();
		double v = 3.141592 * r * r * h;
		System.out.println("원기둥의 부피는 " + v + "입니다.");
	}

}
