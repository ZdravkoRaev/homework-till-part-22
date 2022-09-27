public class Building implements CarbonFootprint {


    double еlectricity;
    double lpg;
    double waste;
    double water;

    public Building() {

    }

    public Building(double еlectricity, double lpg, double waste, double water) {
        this.еlectricity = еlectricity;
        this.lpg = lpg;
        this.waste = waste;
        this.water = water;
    }
    public double getCarbonFootprint(){
        double EF=0.4374;
        return еlectricity * EF + lpg * EF + waste * 365 * EF + water * 52 * EF;
    }
}
