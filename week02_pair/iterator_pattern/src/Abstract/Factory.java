package Abstract;

import Interface.Iterator;
import Interface.Aggregate;
import Enum.IteratorType;

public abstract class Factory {
    public final Iterator create(Aggregate list, IteratorType iteratorType) {
        return createProduct(list, iteratorType);
    }
    protected abstract Iterator createProduct(Aggregate list, IteratorType type);
}