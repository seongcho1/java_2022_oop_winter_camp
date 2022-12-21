public class Americano extends Espresso {

    public static final String KENYA = "Kenya";
    public static final String ETIOPIA = "Etiopia";

    public Americano() {
        productName = "Americano";
    }
    public Americano(String BeanType) {

        if (BeanType.equalsIgnoreCase(KENYA)) {
            productName = KENYA + "Americano";
        }
        else if (BeanType.equalsIgnoreCase(ETIOPIA)) {
            productName = ETIOPIA + "Americano";
        } else {
            productName = "Americano";
        }
    }
}
