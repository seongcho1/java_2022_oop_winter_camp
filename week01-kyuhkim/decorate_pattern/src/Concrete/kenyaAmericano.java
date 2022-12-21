package Concrete;

import Abstract.baseProduct;
import Annotate.IsCoffee;

@IsCoffee
public class kenyaAmericano extends baseProduct {
    public kenyaAmericano(String bean) { super(bean); }
}
