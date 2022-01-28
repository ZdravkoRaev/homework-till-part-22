package razdel17;

public class Zad1 {

	public static void main(String[] args) {
		Triangle a = new Triangle(3,4,5);
		a.setColor("white");
		System.out.println(a.getArea());
		System.out.println(a.getColor());
		System.out.println(a.getPerimeter());
		System.out.println(a.getFilled());
	}

}
