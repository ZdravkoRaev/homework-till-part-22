import java.lang.Math;
public class Triangle {


    int pointOneX;
    int pointOneY;

    public Triangle(int pointOneX, int pointOneY, int pointTwoX, int pointTwoY, int pointThreeX, int pointThreeY) {
        this.pointOneX = pointOneX;
        this.pointOneY = pointOneY;
        this.pointTwoX = pointTwoX;
        this.pointTwoY = pointTwoY;
        this.pointThreeX = pointThreeX;
        this.pointThreeY = pointThreeY;
    }

    int pointTwoX;
    int pointTwoY;
    int pointThreeX;
    int pointThreeY;
    Triangle(){

    }
    double getSideA(){
        double a=(pointOneX-pointTwoX)*(pointOneX-pointTwoX)+(pointOneY-pointTwoY)*(pointOneY-pointTwoY);
        return Math.sqrt(a);
    }
    double getSideB(){
        double b=(pointThreeX-pointTwoX)*(pointThreeX-pointTwoX)+(pointThreeY-pointTwoY)*(pointThreeY-pointTwoY);
        return Math.sqrt(b);
    }
    double getSideC(){
        double c=(pointThreeX-pointOneX)*(pointThreeX-pointOneX)+(pointThreeY-pointOneY)*(pointThreeY-pointOneY);
        return Math.sqrt(c);
    }
    double getPerimeter(){
        return getSideA()+getSideB()+getSideC();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointOneX=" + pointOneX +
                ", pointOneY=" + pointOneY +
                ", pointTwoX=" + pointTwoX +
                ", pointTwoY=" + pointTwoY +
                ", pointThreeX=" + pointThreeX +
                ", pointThreeY=" + pointThreeY +
                '}';
    }

    double getArea(){
        double p=getPerimeter()/2;
        double a=getSideA();
        double b=getSideB();
        double c=getSideC();

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }

    public int getPointOneX() {
        return pointOneX;
    }

    public void setPointOneX(int pointOneX) {
        this.pointOneX = pointOneX;
    }

    public int getPointThreeY() {
        return pointThreeY;
    }

    public void setPointThreeY(int pointThreeY) {
        this.pointThreeY = pointThreeY;
    }

    public int getPointTwoY() {
        return pointTwoY;
    }

    public void setPointTwoY(int pointTwoY) {
        this.pointTwoY = pointTwoY;
    }

    public int getPointOneY() {
        return pointOneY;
    }

    public void setPointOneY(int pointOneY) {
        this.pointOneY = pointOneY;
    }

    public int getPointThreeX() {
        return pointThreeX;
    }

    public void setPointThreeX(int pointThreeX) {
        this.pointThreeX = pointThreeX;
    }

    public int getPointTwoX() {
        return pointTwoX;
    }

    public void setPointTwoX(int pointTwoX) {
        this.pointTwoX = pointTwoX;
    }
}
