package Concrete;

import Abstract.baseProduct;
import Annotate.IsCoffee;

@IsCoffee
public class todayAmericano extends baseProduct {
    public todayAmericano(String bean) { super(bean); }
}
