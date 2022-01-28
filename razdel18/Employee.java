package razdel18;
import java.util.*;
public class Employee extends Person{
	@Override
	public String toString() {
		return "Employee [office=" + office + ", salary=" + salary + ", hired=" + hired + ", name=" + name
				+ ", address=" + address + ", phone=" + phone + ", mail=" + mail + "]";
	}
	String office;
	double salary;
	Date hired;
}
