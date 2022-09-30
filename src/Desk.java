public class Desk extends Product{
    private String dimensions;

    public Desk(String description, String producer, double price, String dimensions) {
        super(description, producer, price);
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public Object deskOfDimension(String dimensions) {
        if (this.dimensions == dimensions) {
            return this;
        }
        return null;
    }

}
