import Factory.orderFactory;
import Decorate.*;

import java.lang.annotation.AnnotationTypeMismatchException;

public class Main {
    public static void main(String[] args) throws AnnotationTypeMismatchException {
        var franchise = orderFactory.getInstance();
        var debug = new Debug();

        debug.PrintString(new mochaSyrup(new milk(franchise.orderCoffee("Ethiopia Americano"))));
        debug.PrintString(new milk(new whippedCream(franchise.orderCoffee("Today Americano"))));
        debug.PrintString(new whippedCream(new whippedCream(new whippedCream(franchise.orderCoffee("Diet Americano")))));
        debug.PrintString(new mangoSlice(franchise.orderCoffee("Diet Americano"))); // wrong topping;
        debug.PrintString(new whippedCream(new mangoSlice(franchise.orderCake("Fresh Fruit Cake"))));
    }
}
