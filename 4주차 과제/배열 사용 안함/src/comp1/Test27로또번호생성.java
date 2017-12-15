package comp1;

import java.util.Random;
import java.util.Scanner;

public class Test27로또번호생성 {
	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());

		System.out.println("<로또 생성 프로그램>");
		outer_loop: while (true) {
			int num0 = rand.nextInt(45) + 1;
			int num1 = rand.nextInt(45) + 1;
			int num2 = rand.nextInt(45) + 1;
			int num3 = rand.nextInt(45) + 1;
			int num4 = rand.nextInt(45) + 1;
			int num5 = rand.nextInt(45) + 1;

			if ((num0 != num1) && (num0 != num2) && (num0 != num3) && (num0 != num4)
					&& (num0 != num5))
				if ((num1 != num2) && (num1 != num3) && (num1 != num4) && (num1 != num5))
					if ((num2 != num3) && num2 != num4 && (num2 != num5))
						if ((num3 != num4) && (num3 != num5))
							if ((num4 != num5)) {

								System.out.print(num0 +" ");
								System.out.print(num1 +" ");
								System.out.print(num2 +" ");
								System.out.print(num3 +" ");
								System.out.print(num4 +" ");
								System.out.print(num5 +" ");
								break outer_loop;
							}
		}

	}
}
