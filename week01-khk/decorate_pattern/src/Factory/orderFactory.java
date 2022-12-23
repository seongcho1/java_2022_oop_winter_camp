package Factory;

import Franchise.INonameBeans;
import Concrete.*;

public class orderFactory {

    private orderFactory() {}

    private static class orderFactoryHolder {
        private static orderFactory instance = new orderFactory();
    }

    public static orderFactory getInstance() { return orderFactoryHolder.instance; }

    final public INonameBeans orderCoffee(final String bean) {
        switch (bean) {
            case "Kenya Americano": return new kenyaAmericano(bean);
            case "Ethiopia Americano": return new ethiopiaAmericano(bean);
            case "Diet Americano": return new dietAmericano(bean);
            default: return new todayAmericano("Today Americano");
        }
    }

    final public INonameBeans orderCake(final String cake) {
        switch (cake) {
            case "Fresh Fruit Cake": return new freshFruitCake(cake);
            default: return new freshCreamCake("Fresh Cream Cake");
        }
    }
}
