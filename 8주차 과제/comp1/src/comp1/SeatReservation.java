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
			System.out.print("좌석을 예약하시겠습니까?(예 : 1 또는 아니오 : 0) ");
			int a = sc.nextInt();

			if (a == 1) {
				System.out.println("현재의 예약 상태는 다음과 같습니다.(예약 된 좌석 : 1, 예약되지 않은 좌석 : 0)");
				System.out.println("-----------------------------");
				System.out.println("1 2 3 4 5 6 7 8 9 10 (좌석 번호)");
				System.out.println("-----------------------------");
				for (int i = 0; i < 10; i++)
					System.out.print(num[i] + " ");

				inner_loop: while (true) {
					System.out.print("\n" + "몇번째 좌석을 예약하시겠습니까? ");
					int b = sc.nextInt();
					if (num[b - 1] == 0) {
						System.out.println("예약되었습니다.");
						num[b - 1] = 1;
						break inner_loop;
					} else if (num[b - 1] == 1) {
						System.out.print("이미 예약된 좌석입니다.");
						continue inner_loop;
					}
				}
			} else if (a == 0)
				break outer_loop;
		}
		System.out.println("좌석 예약 프로그램을 종료합니다.");
	}
}
