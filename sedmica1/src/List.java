import java.util.ArrayList;
import java.util.Objects;

public class List {
    public static void main(String[] args) {


        Building a = new Building(1, 2, 3, 4);
        Bicycle b = new Bicycle("hahaha", "cool guy");
        Car c = new Car(Car.fuelType.Diesel, 2);
        ArrayList<CarbonFootprint> Stuff = new ArrayList<CarbonFootprint>();
        Stuff.add(a);
        Stuff.add(b);
        Stuff.add(c);
        for (int i = 0; i < Stuff.size(); i++) {
            System.out.println(Stuff.get(i).getCarbonFootprint());
        }


    }
}