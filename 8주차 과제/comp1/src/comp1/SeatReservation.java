package comp1;

import java.util.Scanner;

public class SeatReservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		for (int i = 0; i < 10; i++) {
			num[i] = 0;
			if ((i == 5) || (i == 6) || (i == 7))
				num[i] = 1;
		}
		outer_loop: while (true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�?(�� : 1 �Ǵ� �ƴϿ� : 0) ");
			int a = sc.nextInt();

			if (a == 1) {
				System.out.println("������ ���� ���´� ������ �����ϴ�.(���� �� �¼� : 1, ������� ���� �¼� : 0)");
				System.out.println("-----------------------------");
				System.out.println("1 2 3 4 5 6 7 8 9 10 (�¼� ��ȣ)");
				System.out.println("-----------------------------");
				for (int i = 0; i < 10; i++)
					System.out.print(num[i] + " ");

				inner_loop: while (true) {
					System.out.print("\n" + "���° �¼��� �����Ͻðڽ��ϱ�? ");
					int b = sc.nextInt();
					if (num[b - 1] == 0) {
						System.out.println("����Ǿ����ϴ�.");
						num[b - 1] = 1;
						break inner_loop;
					} else if (num[b - 1] == 1) {
						System.out.print("�̹� ����� �¼��Դϴ�.");
						continue inner_loop;
					}
				}
			} else if (a == 0)
				break outer_loop;
		}
		System.out.println("�¼� ���� ���α׷��� �����մϴ�.");
	}
}
