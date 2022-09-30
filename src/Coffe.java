public class Coffe extends Product{
    private String type;

    public Coffe(String description, String producer, double price, String type) {
        super(description, producer, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
