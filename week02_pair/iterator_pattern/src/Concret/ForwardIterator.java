package Concret;

import Interface.Aggregate;
import Interface.Iterator;

final public class ForwardIterator implements Iterator {
    final private Aggregate aggregate;
    private int index;

    public ForwardIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() { return index < aggregate.getLength(); }

    @Override
    public boolean isDone() {
        return !hasNext();
    }

    @Override
    public Object Next() { return aggregate.at(index++); }

    @Override
    public Object First() { return aggregate.at(0); }

    @Override
    public Object CurrentItem() {
        try { return aggregate.at(index - 1); }
        catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
