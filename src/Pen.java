public class Pen extends Product{

    private String writeColor;

    public Pen(String description, String producer, double price, String writeColor) {
        super(description, producer, price);
        this.writeColor = writeColor;
    }

    public String getWriteColor() {
        return writeColor;
    }

    public Pen penOfSpecificColor(String writeColor) {
        if (this.writeColor == writeColor) {
            return this;
        }
        return null;
    }

}

