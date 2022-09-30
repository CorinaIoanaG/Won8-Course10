public class Door extends Desk {
    private String colour;
    private String closingSide;

    public Door(String description, String producer, double price, String dimensions, String colour, String closingSide) {
        super(description, producer, price, dimensions);
        this.colour = colour;
        this.closingSide = closingSide;
    }

    public String getColour() {
        return colour;
    }

    public String getClosingSide() {
        return closingSide;
    }

    public Object selectDoor(String colour, String closingSide) {
        if (this.colour == colour || this.closingSide == closingSide) {
            return this;
        }
        return null;
    }

}
