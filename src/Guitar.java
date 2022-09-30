public class Guitar extends Product{

    private String soundType;

    public Guitar(String description, String producer, double price, String soundType) {
        super(description, producer, price);
        this.soundType = soundType;
    }

    public String getSoundType() {
        return soundType;
    }

    public Object producerOrSoundType(String producer, String soundType) {
        if (this.getProducer() == producer || this.soundType == soundType) {
            return this;
        }
        return null;
    }

}
