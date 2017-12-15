package comp1;

public class Box {

	private int 가로;
	private int 세로;
	private int 높이;
	private int volume;

	public int get가로() {
		return 가로;
	}

	public void set가로(int a) {
		가로 = a;
	}

	public int get세로() {
		return 세로;
	}

	public void set세로(int b) {
		세로 = b;
	}

	public int get높이() {
		return 높이;
	}

	public void set높이(int c) {
		높이 = c;
	}

	public int getVolume() {
		volume = 가로 * 세로 * 높이;
		return volume;

	}

	public void print() {
		System.out.println("박스의 가로 길이는 " + 가로);
		System.out.println("박스의 세로 길이는 " + 세로);
		System.out.println("박스의 높이는 " + 높이);
		System.out.println("박스의 부피는 " + volume + "입니다.");
	}

}
