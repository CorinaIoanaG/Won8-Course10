public class Window extends Desk {
    private String frameType;

    public Window(String description, String producer, double price, String dimensions, String frameType) {
        super(description, producer, price, dimensions);
        this.frameType = frameType;
    }

    public String getFrameType() {
        return frameType;
    }

}
