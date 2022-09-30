public class Bike {
    private String name;
    private String type;
    private double price;

    public Bike(String name, String type, double price) {
        this.name = name;
        this.type = type;
        if (price > 0) {
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
}
