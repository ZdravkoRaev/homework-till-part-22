package razdel17;

public class GeometricObject {
	boolean filled=true;
	public boolean isFilled() {
		return filled;
	}
	public double getArea() {
		return 0;
	}
	public double getPerimeter() {
		return 0;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public boolean getFilled() {
		return filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	String color;
	java.util.Date dateCreated;
}

