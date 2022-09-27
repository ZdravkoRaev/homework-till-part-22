class Square extends Rectangle {


    Square(){

    }

    @Override
    public String toString() {
        return "Square{" +
                "sideOne=" + sideOne +
                ", sideTwo=" + sideTwo +
                ", topLeftX=" + topLeftX +
                ", topLeftY=" + topLeftY +
                '}';
    }

    Square(int a, int b, int c){
        sideOne=a;
        sideTwo=a;
        topLeftX=b;
        topLeftY=c;

    }



}
