package comp1;

public class Triangle extends Shape {
	private int extent;

	public Triangle(int width, int height) {
		super(width, height);
	}

	public int area() {
		extent = (int) (width * height / 2);
		return extent;

	}

}
