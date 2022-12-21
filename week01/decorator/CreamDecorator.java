public class CreamDecorator extends Decorator {
    public CreamDecorator(Espresso espresso) {
        super(espresso);
        //productName = espresso.productName + " Adding WhippedCream";
        productName += " Adding WhippedCream";
    }

    @Override
    public String toString() {
        return '['+espresso.toString() + " + Adding WhippedCream]";
    }
}