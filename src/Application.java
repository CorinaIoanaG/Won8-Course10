public class Application extends OperatingSystem {
    private String operatingSystem;

    public Application(String name, String version, String operatingSystem) {
        super(name, version);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}
