public class Document {
    private String name;
    private String application;
    private double dimension;

    public Document(String name, String application, double dimension) {
        this.name = name;
        this.application = application;
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public String getApplication() {
        return application;
    }

    public double getDimension() {
        return dimension;
    }
}
