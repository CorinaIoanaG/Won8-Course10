public class Pool extends Desk {
    private String poolType;

    public Pool(String description, String producer, double price, String dimensions, String poolType) {
        super(description, producer, price, dimensions);
        this.poolType = poolType;
    }

    public String getPoolType() {
        return poolType;
    }
}
