public class ToothBrush extends Product {
    private String type;

    public ToothBrush(String description, String producer, double price, String type) {
        super(description, producer, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
