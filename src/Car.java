public class Car extends Product{

    private String fueltype;

    public Car(String description, String producer, double price, String fueltype) {
        super(description, producer, price);
        this.fueltype = fueltype;
    }

    public String getFueltype() {
        return fueltype;
    }

    public Object carFuelType(String fueltype) {
        if (this.fueltype == fueltype) {
            return this;
        }
        return null;
    }
}
