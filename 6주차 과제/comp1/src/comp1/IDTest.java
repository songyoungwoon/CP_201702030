package comp1;

import java.util.Scanner;

public class IDTest {
	public static void main(String[] args) {
		ID 생성 = new ID();
		Scanner sc = new Scanner(System.in);
		System.out.println("<계정생성>");
		System.out.print("아이디를 입력하시오 : ");
		String id = sc.nextLine();
		생성.setID(id);
		System.out.print("비밀번호를 입력하시오 : ");
		String pass = sc.nextLine();
		생성.setPW(pass);

		System.out.println("");

		System.out.println("<로그인>");
		System.out.print("ID : ");
		String logID = sc.nextLine();
		생성.id확인(logID);
		System.out.print("PW : ");
		String logPW = sc.nextLine();
		생성.pw확인(logPW);

		생성.print();

	}

}
