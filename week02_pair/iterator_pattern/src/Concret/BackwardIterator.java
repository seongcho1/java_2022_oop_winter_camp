package Concret;

import Interface.Aggregate;
import Interface.ReverseIterator;

final public class BackwardIterator implements ReverseIterator {
    final private Aggregate aggregate;
    private int index;

    public BackwardIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
        this.index = aggregate.getLength() - 1;
    }

    @Override
    public boolean hasNext() { return 0 <= index; }

    @Override
    public boolean isDone() { return !hasNext(); }

    @Override
    public Object Next() { return aggregate.at(index--); }

    @Override
    public Object First() { return aggregate.at(aggregate.getLength() - 1); }

    @Override
    public Object CurrentItem() {
        try { return aggregate.at(index + 1); }
        catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
