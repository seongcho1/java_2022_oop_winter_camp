package Decorate;

import Franchise.INonameBeans;
import Abstract.topping;
import Annotate.IsCoffee;

import java.io.ByteArrayInputStream;

@IsCoffee
final public class mochaSyrup extends topping {
    public mochaSyrup(INonameBeans foundation) {
        super(foundation);
        this.material = new ByteArrayInputStream(" Adding Mocha Syrup".getBytes());
    }
}
