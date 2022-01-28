package razdel18;

public class Student extends Person{
 String status="senior";

@Override
public String toString() {
	return "Student [status=" + status + ", name=" + name + ", address=" + address + ", phone=" + phone + ", mail="
			+ mail + "]";
}
}
