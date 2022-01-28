package razdel18;

public class Person {

	String name="Bob";
	String address="homeless";
	String phone="none";
	String mail="nah";
	Person(){
		
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phone=" + phone + ", mail=" + mail + "]";
	}
}
