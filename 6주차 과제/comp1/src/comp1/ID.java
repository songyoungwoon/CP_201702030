package comp1;

public class ID {
	String ����ھ��̵�;
	String ����ں�й�ȣ;
	private boolean idȮ��;
	private boolean pwȮ��;

	public String setID(String a) {
		����ھ��̵� = a;
		return ����ھ��̵�;
	}

	public String setPW(String b) {
		����ں�й�ȣ = b;
		return ����ں�й�ȣ;
	}

	public boolean idȮ��(String c) {
		if (����ھ��̵�.equals(c))
			idȮ�� = true;
		else
			idȮ�� = false;

		return idȮ��;
	}

	public boolean pwȮ��(String d) {
		if (����ں�й�ȣ.equals(d))
			pwȮ�� = true;
		else
			pwȮ�� = false;

		return pwȮ��;
	}

	public void print() {
		if ((idȮ�� == true) && (pwȮ�� == true))
			System.out.println("�α��εǾ����ϴ�.");
		else
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
	}
}
