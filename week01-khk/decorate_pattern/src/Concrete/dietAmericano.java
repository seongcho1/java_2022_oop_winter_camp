package Concrete;

import Abstract.baseProduct;
import Annotate.IsCoffee;

@IsCoffee
public class dietAmericano extends baseProduct {
    public dietAmericano(String bean) { super(bean); }
}
