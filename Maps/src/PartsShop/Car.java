package PartsShop;

public class Car {
    private String model;
    private String brand;
    private String productionYear;

    public Car(String model, String brand, String productionYear) {
        this.model = model;
        this.brand = brand;
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "<" + this.brand + "," + this.model + ","
                + this.productionYear + ">";
    }
}
