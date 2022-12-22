package Factory;

import Abstract.Factory;
import Concret.ForwardIterator;
import Concret.BackwardIterator;
import Interface.Aggregate;
import Interface.Iterator;
import Enum.IteratorType;

final public class IteratorFactory extends Factory {
    public IteratorFactory() {}

    @Override
    protected Iterator createProduct(Aggregate list, IteratorType iteratorType) {
        switch (iteratorType) {
            case FORWARD:
                return new ForwardIterator(list);
            default:
                return new BackwardIterator(list);
        }
    }
}
