package comp1;

public class ID {
	String 사용자아이디;
	String 사용자비밀번호;
	private boolean id확인;
	private boolean pw확인;

	public String setID(String a) {
		사용자아이디 = a;
		return 사용자아이디;
	}

	public String setPW(String b) {
		사용자비밀번호 = b;
		return 사용자비밀번호;
	}

	public boolean id확인(String c) {
		if (사용자아이디.equals(c))
			id확인 = true;
		else
			id확인 = false;

		return id확인;
	}

	public boolean pw확인(String d) {
		if (사용자비밀번호.equals(d))
			pw확인 = true;
		else
			pw확인 = false;

		return pw확인;
	}

	public void print() {
		if ((id확인 == true) && (pw확인 == true))
			System.out.println("로그인되었습니다.");
		else
			System.out.println("로그인에 실패하였습니다.");
	}
}
