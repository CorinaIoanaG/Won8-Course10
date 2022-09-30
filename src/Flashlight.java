public class Flashlight extends Product {
    private String chargeType;

    public Flashlight(String description, String producer, double price, String chargeType) {
        super(description, producer, price);
        this.chargeType = chargeType;
    }

    public String getChargeType() {
        return chargeType;
    }
}
