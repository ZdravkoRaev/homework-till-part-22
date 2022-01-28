package razdel17;
import java.lang.Math;
public class Triangle extends GeometricObject {
	double side1=1;
	double side2=1;
	double side3=1;
	
Triangle(){
	
}
Triangle(double side1,double side2,double side3){
	this.side1=side1;
	this.side2=side2;
	this.side3=side3;
}
@Override
public double getPerimeter(){
	return side1+side2+side3;
}
@Override
public double getArea(){
	double area;
	double perimeter2=(side1+side2+side3)/2;
	area=perimeter2*(perimeter2-side1)*(perimeter2-side2)*(perimeter2-side3);
	return Math.sqrt(area);
}
void printTriangle(){
	System.out.println("Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3);
}
}
	
