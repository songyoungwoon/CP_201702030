package comp1;

import java.util.Scanner;

public class Test24표준체중 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하시오(cm) : ");
		float toll = sc.nextFloat();
		float 표준체중 = (toll - 100) * 9 / 10;
		System.out.println("표준체중은 " + 표준체중 + "kg입니다.");
		System.out.print("체중을 입력하시오(kg) : ");
		float weight = sc.nextFloat();

		if (weight < (표준체중 + 표준체중 / 10))
			if ((표준체중 - 표준체중 / 10) < weight)
				System.out.println("정상입니다.");
			else
				System.out.println("저체중입니다.");
		else
			System.out.println("과체중입니다.");
	}

}
