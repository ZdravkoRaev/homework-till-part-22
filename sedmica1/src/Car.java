public class Car implements CarbonFootprint {

    enum fuelType{
        CNG,
        Diesel,
        LPG,
        MotorGasoline
    }


    fuelType fuel= fuelType.CNG;
    double distance;

    public Car() {
    }

    public Car(fuelType fuel, double distance) {
        this.fuel = fuel;
        this.distance = distance;
    }
    @Override
    public double getCarbonFootprint(){
        switch(fuel) {
            case CNG:
                return distance* 0.05444;

            case Diesel:
                return distance*10.21;

            case LPG:
                return distance*5.68;

            case MotorGasoline:
                return distance*8.78;


        }
        return 0;
    }
}


