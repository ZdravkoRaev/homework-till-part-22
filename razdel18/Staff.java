package razdel18;

public class Staff extends Employee{
	String title;

	@Override
	public String toString() {
		return "Staff [title=" + title + ", office=" + office + ", salary=" + salary + ", hired=" + hired + ", name="
				+ name + ", address=" + address + ", phone=" + phone + ", mail=" + mail + "]";
	}
	

}
