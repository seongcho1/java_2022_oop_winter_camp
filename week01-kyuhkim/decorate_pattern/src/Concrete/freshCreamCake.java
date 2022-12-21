package Concrete;

import Abstract.baseProduct;
import Annotate.IsCake;

@IsCake
public class freshCreamCake extends baseProduct {
    public freshCreamCake(String cake) { super(cake); }
}
