package comp1;

import java.util.Scanner;

public class Test24ǥ��ü�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ�(cm) : ");
		float toll = sc.nextFloat();
		float ǥ��ü�� = (toll - 100) * 9 / 10;
		System.out.println("ǥ��ü���� " + ǥ��ü�� + "kg�Դϴ�.");
		System.out.print("ü���� �Է��Ͻÿ�(kg) : ");
		float weight = sc.nextFloat();

		if (weight < (ǥ��ü�� + ǥ��ü�� / 10))
			if ((ǥ��ü�� - ǥ��ü�� / 10) < weight)
				System.out.println("�����Դϴ�.");
			else
				System.out.println("��ü���Դϴ�.");
		else
			System.out.println("��ü���Դϴ�.");
	}

}
