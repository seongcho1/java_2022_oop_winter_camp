package Decorate;

import Franchise.INonameBeans;
import Abstract.topping;
import Annotate.IsCake;
import Annotate.IsCoffee;

import java.io.ByteArrayInputStream;

@IsCoffee
@IsCake
final public class whippedCream extends topping {
    public whippedCream(INonameBeans foundation) {
        super(foundation);
        this.material = new ByteArrayInputStream(" Adding Whipped Cream".getBytes());
    }
}
