package comp1;

public class BoxTest {
	public static void main(String[] args) {
		Box box = new Box();

		box.set가로(10);
		box.set세로(20);
		box.set높이(50);
		box.getVolume();
		box.print();
	}

}
