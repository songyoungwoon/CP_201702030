package comp1;

import java.util.Scanner;

public class IDTest {
	public static void main(String[] args) {
		ID ���� = new ID();
		Scanner sc = new Scanner(System.in);
		System.out.println("<��������>");
		System.out.print("���̵� �Է��Ͻÿ� : ");
		String id = sc.nextLine();
		����.setID(id);
		System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		String pass = sc.nextLine();
		����.setPW(pass);

		System.out.println("");

		System.out.println("<�α���>");
		System.out.print("ID : ");
		String logID = sc.nextLine();
		����.idȮ��(logID);
		System.out.print("PW : ");
		String logPW = sc.nextLine();
		����.pwȮ��(logPW);

		����.print();

	}

}
