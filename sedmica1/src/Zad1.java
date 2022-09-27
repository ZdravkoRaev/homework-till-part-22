import java.lang.Math;
public class Zad1 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Triangle a= new Triangle(0, 0, 0 , 4, 3, 0);
        System.out.println(a.getSideA());
        System.out.println(a.getSideB());
        System.out.println(a.getSideC());
        Square b= new Square(3,0,0);
        System.out.println(a.getPerimeter());
        System.out.println(a.getArea());
    Square d=new Square(1,0,0);
        Square e=new Square(2,0,0);
        ComparableSquare compare= new ComparableSquare();
        compare.compareTo(d,e);
        }
    }

