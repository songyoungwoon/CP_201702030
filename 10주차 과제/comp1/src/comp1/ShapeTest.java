package comp1;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.print("���̸� �Է��ϼ��� : ");
		int b = sc.nextInt();

		Shape shape[] = new Shape[3];

		shape[0] = new Rectangle(a, b);
		shape[1] = new Triangle(a, b);
		shape[2] = new Circle(a, b);

		for (int i = 0; i < shape.length; i++) {
			if (i == 0)
				System.out.print("�簢�� ���� : ");
			else if (i == 1)
				System.out.print("�ﰢ�� ���� : ");
			else if (i == 2)
				System.out.print("���� ���� : ");
			System.out.println(shape[i].area());

		}

	}

}
