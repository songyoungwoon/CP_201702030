package comp1;

import java.util.Scanner;

public class Test8����պ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ� : ");
		double r = sc.nextDouble();
		System.out.print("������� ���̸� �Է��Ͻÿ� : ");
		double h = sc.nextDouble();
		double v = 3.141592 * r * r * h;
		System.out.println("������� ���Ǵ� " + v + "�Դϴ�.");
	}

}
