public class Product {
    private String description;
    private String producer;
    private double price;

    public Product(String description, String producer, double price) {
        this.description = description;
        this.producer = producer;
        if (price > 0) {
            this.price = price;
        }
    }

    public String getDescription() {
        return description;
    }

    public String getProducer() {
        return producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }
}
