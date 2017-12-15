package comp1;

import java.util.Scanner;

public class Test7cm피트인치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하시오 : ");
		double cm = sc.nextDouble();
		double inch = cm / 2.54;
		double feet = inch / 12;
		System.out.println(cm + "cm는" + feet + "피트" + inch + "인치입니다.");
	}

}
