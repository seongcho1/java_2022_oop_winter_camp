package Abstract;

public abstract class Car {
    final String productName;

    protected Car(String productName) { this.productName = productName; }

    final public String toString() { return productName; }

    final public String toUpper() { return productName.toUpperCase(); }
}
