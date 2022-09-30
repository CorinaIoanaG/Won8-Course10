public class Classroom extends School {
    private String description;
    private String dimensions;

    public Classroom(String adress, String classes, String description, String dimensions) {
        super(adress, classes);
        this.description = description;
        this.dimensions = dimensions;
    }

    public String getDescription() {
        return description;
    }

    public String getDimensions() {
        return dimensions;
    }
}
