package Decorate;

import Franchise.INonameBeans;
import Abstract.topping;
import Annotate.IsCoffee;

import java.io.ByteArrayInputStream;

@IsCoffee
final public class milk extends topping {
    public milk(INonameBeans foundation) {
        super(foundation);
        this.material = new ByteArrayInputStream(" Adding Milk".getBytes());
    }
}
