package comp1;

import java.util.Scanner;

public class Test7cm��Ʈ��ġ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		double cm = sc.nextDouble();
		double inch = cm / 2.54;
		double feet = inch / 12;
		System.out.println(cm + "cm��" + feet + "��Ʈ" + inch + "��ġ�Դϴ�.");
	}

}
