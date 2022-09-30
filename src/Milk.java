public class Milk extends Product {
    private String fatProcent;

    public Milk(String description, String producer, double price, String fatProcent) {
        super(description, producer, price);
        this.fatProcent = fatProcent;
    }

    public String getFatProcent() {
        return fatProcent;
    }
}
