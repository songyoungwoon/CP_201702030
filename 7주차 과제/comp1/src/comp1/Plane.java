package comp1;

public class Plane {
	private int production;
	private int model;
	private int maximum;
	private static int planes;

	public int getProduction() {
		return production;
	}

	public void setProduction(int production) {
		this.production = production;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public Plane(int production, int model, int maximum) {
		setProduction(production);
		setModel(model);
		setMaximum(maximum);
		planes++;
	}

	public Plane(int maximum) {
		setProduction(10);
		setModel(15);
		setMaximum(maximum);
		planes++;
	}

	public Plane() {
		setProduction(20);
		setModel(10);
		setMaximum(40);
		planes++;
	}

	public void print() {
		System.out.println("비행기 테스트");
		System.out.println("제작사 수 : " + production + ", " + "모델 수 : " + model + ", " + "최대 승객 수 : " + maximum);
	}

	public static int getPlanes() {
		return planes;
	}

}
