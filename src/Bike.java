public class Bike extends Product{

    private String bikeType;

    public Bike(String description, String producer, double price, String bikeType) {
        super(description, producer, price);
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }

    public Object bykeOfType(String bikeType) {
        if (this.bikeType == bikeType) {
            return this;
        }
        return null;
    }

}
