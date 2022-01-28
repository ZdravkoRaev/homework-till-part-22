package razdel18;

public class Faculty extends Employee{
 String officeHours;
 String rank;
@Override
public String toString() {
	return "Faculty [officeHours=" + officeHours + ", rank=" + rank + ", office=" + office + ", salary=" + salary
			+ ", hired=" + hired + ", name=" + name + ", address=" + address + ", phone=" + phone + ", mail=" + mail
			+ "]";
}
 
}
