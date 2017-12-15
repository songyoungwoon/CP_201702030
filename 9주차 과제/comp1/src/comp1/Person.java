package comp1;

public class Person {
	protected String name;
	protected String address;
	protected String phone;

	public Person() {
		System.out.println("PersonClass »ý¼ºÀÚ");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
