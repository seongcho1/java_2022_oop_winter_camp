public class MochaDecorator extends Decorator {
    public MochaDecorator(Espresso espresso) {
        super(espresso);
        //productName = espresso.productName + " Adding Mocha Syrup";
        productName += " Adding Mocha Syrup";
    }
    
    @Override
    public String toString() {
        return '['+espresso.toString() + " + Adding Mocha Syrup]";
    }
}