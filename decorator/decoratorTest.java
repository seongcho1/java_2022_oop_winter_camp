public class decoratorTest {
    public static void main(String[] args) {
        
        Espresso coffee1 = new Americano("kenya");
        coffee1.print();
        
        Espresso coffee2 = new LatteDecorator(coffee1);
        coffee2.print();

        Espresso coffee3 = new MochaDecorator(coffee2);
        coffee3.print();

        Espresso coffee4 = new CreamDecorator(
                              new MochaDecorator(
                                new LatteDecorator(
                                    new Americano("etiopia")
                            )));
        coffee4.print();

    }
}