package visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
  private String name;
  private ArrayList<Entry> items;

  public Directory(String name) {
    items = new ArrayList<>();
    this.name = name;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    int size = 0;

    Iterator it = items.iterator();
    while(it.hasNext()) {
      Entry entry = (Entry) it.next();
      size += entry.getSize();
    }
    return size;
  }

  @Override
  public Entry add(Entry entry) throws FileTreatmentException {
    items.add(entry);
    return this;
  }

  @Override
  public Iterator iterator() throws FileTreatmentException {
    return items.iterator();
  }

}
