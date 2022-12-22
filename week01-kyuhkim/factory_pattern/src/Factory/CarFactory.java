package Factory;

import Abstract.Car;
import Concrete.*;

public class CarFactory {
    final public Car Order(final String productName) throws Exception {

        String converted = convertString(productName);

        switch (converted) {
            case "Sonata":
                return new Sonata(converted);
            case "Grandeur":
                return new Grandeur(converted);
            case "Genesis":
                return new Genesis(converted);
            default:
                return new Reject("Out Of Range");
        }
    }

    private String convertString(final String source) throws Exception {
        if (source.length() == 0) throw new Exception("string can not be null");
        return source.substring(0, 1).toUpperCase() + source.substring(1).toLowerCase();
    }
}
