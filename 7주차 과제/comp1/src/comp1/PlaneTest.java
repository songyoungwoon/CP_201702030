package comp1;

public class PlaneTest {
	public static void main(String[] args) {
		Plane p1 = new Plane(20, 5, 30);
		Plane p2 = new Plane(30);
		Plane p3 = new Plane();
		p1.print();
		p2.print();
		p3.print();
		System.out.println("\n"+"생성된 비행기 수는 " + Plane.getPlanes() + "대입니다.");
	}

}
