package comp1;

public class Employee {

	private String 이름;
	private String 전화번호;
	private int 연봉;
	
	public String get이름(){
		return 이름;
	}
	public void set이름(String a){
		이름 = a;
	}
	public String get전화번호(){
		return 전화번호;
	}
	public void set전화번호(String b){
		전화번호 = b;
	}
	public int get연봉(){
		return 연봉;
	}
	public void set연봉(int c){
		연봉 = c;
	}
	public void employee() {
		System.out.println("직원 이름은 "+이름+"입니다.");
		System.out.println("직원 전화 번호는 "+전화번호+"입니다.");
		System.out.println("직원 연봉은 "+연봉+"만원 입니다.");
	}
}
