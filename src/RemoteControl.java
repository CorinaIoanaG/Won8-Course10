public class RemoteControl extends Product {
    private String type;

    public RemoteControl(String description, String producer, double price, String type) {
        super(description, producer, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
