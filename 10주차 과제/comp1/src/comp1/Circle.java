package comp1;

public class Circle extends Shape {
	private int extent;
	private int radius = width / 2;

	public Circle(int width, int height) {
		super(width, height);
	}

	public int area() {
		extent = (int) (3.14 * radius * radius);
		return extent;
	}
}
