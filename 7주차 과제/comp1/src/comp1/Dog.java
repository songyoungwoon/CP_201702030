package comp1;

public class Dog {
	private String name;
	private static String breed;
	private int age;

	public Dog(String name, int age) {
		setDog(name, breed, age);
	}

	public Dog(String name, String breed, int age) {
		setDog(name, breed, age);
	}

	public void setDog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public void print() {
		System.out.println("������ ����");
		System.out.println("�̸� : " + name + ", " + "���� : " + breed + ", " + "���� : " + age);

	}
}
