import java.util.ServiceConfigurationError;

public class Rectangle extends Figure {

    int sideOne=1;
    int sideTwo=1;
    int topLeftX;
    int topLeftY;
    Rectangle(){
        sideOne=1;
        sideOne=1;
        topLeftX=0;
        topLeftY=0;

    }

    Rectangle(int a, int b, int c, int d) {
        sideOne=a;
        sideOne=b;
        topLeftX=c;
        topLeftY=d;

    }
    public int getArea(){
        return sideOne*sideTwo;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideOne=" + sideOne +
                ", sideTwo=" + sideTwo +
                ", topLeftX=" + topLeftX +
                ", topLeftY=" + topLeftY +
                '}';
    }

    public int getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(int topLeftY) {
        this.topLeftY = topLeftY;
    }

    public int getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(int topLeftX) {
        this.topLeftX = topLeftX;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public int getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getPerimeter(){
        return (sideOne+sideTwo)*2;
    }
}
