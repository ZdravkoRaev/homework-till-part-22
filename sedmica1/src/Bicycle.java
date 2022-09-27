public class Bicycle implements CarbonFootprint {
    String owner;
    String brand;

    public Bicycle() {
    }

    public Bicycle(String owner, String brand) {
        this.owner = owner;
        this.brand = brand;
    }
    public double getCarbonFootprint(){
        return 0;
    }
}
