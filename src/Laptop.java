public class Laptop extends Telephone {
    private String diagonal;

    public Laptop(String description, String producer, double price, String operatingSystem, String diagonal) {
        super(description, producer, price, operatingSystem);
        this.diagonal = diagonal;
    }

    public String getDiagonal() {
        return diagonal;
    }

}
