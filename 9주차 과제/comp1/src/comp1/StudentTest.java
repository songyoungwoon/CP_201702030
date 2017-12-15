package comp1;

public class StudentTest {
	public static void main(String[] args) {
		Student학부생 st = new Student학부생();
		Student대학원생 st2 = new Student대학원생();
		
		st.setName("송영운");
		st.setNumber(201702030);
		st.setMajor("컴퓨터 공학과");
		st.setGrade(1);
		st.setCredit(19);
		st.setClup("grow");
		
		st2.setName("송영운");
		st2.setNumber(201702030);
		st2.setMajor("컴퓨터 공학과");
		st2.setGrade(2);
		st2.setCredit(24);
		st2.set조교유형("연구 조교");
		st2.set장학금비율(0.8);
		
		System.out.println("학부생 정보");
		System.out.println("이름 : "+st.getName()+", 학번 : "+st.getNumber()+", 학과 : "+st.getMajor());
		System.out.println("학년 : "+st.getGrade()+", 이수학점 : "+st.getCredit()+", 동아리 명 : "+st.getClup());
		
		System.out.println("\n"+"대학원생 정보");
		System.out.println("이름 : "+st2.getName()+", 학번 : "+st2.getNumber()+", 학과 : "+st2.getMajor());
		System.out.println("학년 : "+st2.getGrade()+", 이수학점 : "+st2.getCredit()+", 조교유형 :  "+st2.get조교유형());
		System.out.println("장학금 비율 : "+st2.get장학금비율());
	}
}
