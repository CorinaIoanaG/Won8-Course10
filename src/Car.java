public class Car {
    private String description;
    private String producer;

    private int price;

    public Car(String description, String producer, int price) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }
}
