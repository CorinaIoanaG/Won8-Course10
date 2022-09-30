public class Desk {
    private String description;
    private int price;
    private String dimensions;

    public Desk(String description, int price, String dimensions) {
        this.description = description;
        if (price > 0) {
            this.price = price;
        }
        this.dimensions = dimensions;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String getDimensions() {
        return dimensions;
    }

    public String deskOfDimension(String dimensions) {
        if (this.dimensions == dimensions) {
            return this.getDescription() + " " + this.getPrice();
        }
        return null;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }
}
