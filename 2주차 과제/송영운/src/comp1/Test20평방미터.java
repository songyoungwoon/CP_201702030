package comp1;
import java.util.Scanner;
public class Test20평방미터 {public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	
	System.out.print("평수를 입력하시오 : ");
	float 평 = sc.nextFloat();
	
	double 평방미터 = 평 * 3.3058;
	
	System.out.println("평방미터는 " + 평방미터 + "m^2입니다.");
}
}
