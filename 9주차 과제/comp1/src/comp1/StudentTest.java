package comp1;

public class StudentTest {
	public static void main(String[] args) {
		Student�кλ� st = new Student�кλ�();
		Student���п��� st2 = new Student���п���();
		
		st.setName("�ۿ���");
		st.setNumber(201702030);
		st.setMajor("��ǻ�� ���а�");
		st.setGrade(1);
		st.setCredit(19);
		st.setClup("grow");
		
		st2.setName("�ۿ���");
		st2.setNumber(201702030);
		st2.setMajor("��ǻ�� ���а�");
		st2.setGrade(2);
		st2.setCredit(24);
		st2.set��������("���� ����");
		st2.set���бݺ���(0.8);
		
		System.out.println("�кλ� ����");
		System.out.println("�̸� : "+st.getName()+", �й� : "+st.getNumber()+", �а� : "+st.getMajor());
		System.out.println("�г� : "+st.getGrade()+", �̼����� : "+st.getCredit()+", ���Ƹ� �� : "+st.getClup());
		
		System.out.println("\n"+"���п��� ����");
		System.out.println("�̸� : "+st2.getName()+", �й� : "+st2.getNumber()+", �а� : "+st2.getMajor());
		System.out.println("�г� : "+st2.getGrade()+", �̼����� : "+st2.getCredit()+", �������� :  "+st2.get��������());
		System.out.println("���б� ���� : "+st2.get���бݺ���());
	}
}
