public class Cargo {
    private final Dimensions dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final String registrationNumber;
    private final boolean isReversible;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions,
                 int weight,
                 String deliveryAddress,
                 String registrationNumber,
                 boolean isReversible,
                 boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.registrationNumber = registrationNumber;
        this.isReversible = isReversible;
        this.isFragile = isFragile;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, deliveryAddress, registrationNumber, isReversible, isFragile);
    }

    public Cargo setWeight(int weight) {
        return new Cargo(dimensions, weight, deliveryAddress, registrationNumber, isReversible, isFragile);
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress, registrationNumber, isReversible, isFragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isReversible() {
        return isReversible;
    }

    public boolean isFragile() {
        return isFragile;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "dimensions=" + dimensions +
                ", weight=" + weight +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", isReversible=" + isReversible +
                ", isFragile=" + isFragile +
                '}';
    }
}
