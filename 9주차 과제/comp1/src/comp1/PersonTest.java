package comp1;

public class PersonTest {
	public static void main(String[] args) {
		Person per = new Person();
		Customer cus = new Customer();

		per.setName("�ۿ���");
		per.setAddress("������");
		per.setPhone("010-4039-4098");

		cus.setName("�ۿ���");
		cus.setAddress("������");
		cus.setPhone("010-4039-4098");
		cus.setNumber(1);
		cus.setMileage(10000);

		System.out.println("person ����");
		System.out.println("�̸�    �ּ�    ��ȭ ��ȣ");
		System.out.println(per.getName() + " " + per.getAddress() + " " + per.getPhone());

		System.out.println("customer ����");
		System.out.println("�̸�    �ּ�    ��ȭ ��ȣ             �� ��ȣ    ���ϸ���    ");
		System.out.println(cus.getName() + " " + cus.getAddress() + " " + cus.getPhone() + "   " + cus.getNumber()
				+ "      " + cus.getMileage());
	}
}
