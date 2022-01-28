package razdel17;

public class Square extends GeometricObject
implements Colorable{
	double side=1;
	public void howToColor() {
		System.out.print("Оцветете и четирите страни");
		
		
	}
	Square(){
		
	}
	Square(double side){
	this.side=side;
		
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
}
