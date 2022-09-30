public class TV extends Product {
    private String diagonal;

    public TV(String description, String producer, double price, String diagonal) {
        super(description, producer, price);
        this.diagonal = diagonal;
    }

    public String getDiagonal() {
        return diagonal;
    }
}
