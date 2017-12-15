package comp1;

public class PersonTest {
	public static void main(String[] args) {
		Person per = new Person();
		Customer cus = new Customer();

		per.setName("송영운");
		per.setAddress("관저동");
		per.setPhone("010-4039-4098");

		cus.setName("송영운");
		cus.setAddress("관저동");
		cus.setPhone("010-4039-4098");
		cus.setNumber(1);
		cus.setMileage(10000);

		System.out.println("person 정보");
		System.out.println("이름    주소    전화 번호");
		System.out.println(per.getName() + " " + per.getAddress() + " " + per.getPhone());

		System.out.println("customer 정보");
		System.out.println("이름    주소    전화 번호             고객 번호    마일리지    ");
		System.out.println(cus.getName() + " " + cus.getAddress() + " " + cus.getPhone() + "   " + cus.getNumber()
				+ "      " + cus.getMileage());
	}
}
