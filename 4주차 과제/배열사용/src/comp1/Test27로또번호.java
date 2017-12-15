package comp1;

import java.util.Random;

public class Test27로또번호 {
	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());

		int[] num = new int[6];

		System.out.println("<로또 생성 프로그램>");
		outer_loop: while (true) {
			for (int i = 0; i < 6; i++) {
				num[i] = rand.nextInt(45) + 1;
			}
			for (int j = 0; j < 6; j++) {
				for (int k = 1; k < 6 - j; k++) {
					if (num[j] == num[j + k])
						continue outer_loop;
				}
			}
			for (int t = 0; t < 6; t++)
				System.out.print(num[t] + " ");
			break outer_loop;
		}
	}
}