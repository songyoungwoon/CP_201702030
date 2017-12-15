package comp1;

public class Customer extends Person {
	private int number;
	private int mileage;

	public Customer() {
		System.out.println("CustomerClass »ı¼ºÀÚ");
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

}
