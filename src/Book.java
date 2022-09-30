public class Book extends Product{
    private String category;

    public Book(String description, String producer, double price, String category) {
        super(description, producer, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
