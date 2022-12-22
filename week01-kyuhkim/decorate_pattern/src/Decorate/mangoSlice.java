package Decorate;

import Franchise.INonameBeans;
import Abstract.topping;
import Annotate.IsCake;

import java.io.ByteArrayInputStream;

@IsCake
final public class mangoSlice extends topping {
    public mangoSlice(INonameBeans foundation) {
        super(foundation);
        this.material = new ByteArrayInputStream(" Adding Mango Slice".getBytes());
    }
}
