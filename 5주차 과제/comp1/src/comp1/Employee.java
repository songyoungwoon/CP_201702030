package comp1;

public class Employee {

	private String �̸�;
	private String ��ȭ��ȣ;
	private int ����;
	
	public String get�̸�(){
		return �̸�;
	}
	public void set�̸�(String a){
		�̸� = a;
	}
	public String get��ȭ��ȣ(){
		return ��ȭ��ȣ;
	}
	public void set��ȭ��ȣ(String b){
		��ȭ��ȣ = b;
	}
	public int get����(){
		return ����;
	}
	public void set����(int c){
		���� = c;
	}
	public void employee() {
		System.out.println("���� �̸��� "+�̸�+"�Դϴ�.");
		System.out.println("���� ��ȭ ��ȣ�� "+��ȭ��ȣ+"�Դϴ�.");
		System.out.println("���� ������ "+����+"���� �Դϴ�.");
	}
}
