public abstract class Decorator extends Espresso {
    protected Espresso espresso;
    
    public Decorator(Espresso espresso) {
        this.espresso = espresso;
        productName = this.espresso.productName;
    }
    
}