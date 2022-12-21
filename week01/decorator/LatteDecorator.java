public class LatteDecorator extends Decorator {
    public LatteDecorator(Espresso espresso) {
        super(espresso);
        //productName = espresso.productName + " Adding Milk";
        productName += " Adding Milk";
    }
    
    @Override
    public String toString() {
        return '[' + espresso.toString() + " + Adding Milk]";
    }
}