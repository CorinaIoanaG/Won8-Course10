public class Chair extends Desk {
    private String colour;

    public Chair(String description, String producer, double price, String dimensions, String colour) {
        super(description, producer, price, dimensions);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public Object selectChair(String producer, String colour) {
        if (this.getProducer() == producer || this.colour == colour) {
            return this;
        }
        return null;
    }
}
