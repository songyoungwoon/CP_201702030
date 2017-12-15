package comp1;

public class Rectangle extends Shape {
	private int extent;

	public Rectangle(int width, int height) {
		super(width, height);
	}

	public int area() {
		extent = width * height;
		return extent;
	}

}
