public class Telephone extends Product {
    private String operatingSystem;

    public Telephone(String description, String producer, double price, String operatingSystem) {
        super(description, producer, price);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

}
