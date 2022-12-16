package kr.ftseoul.avaj.simulator;

import java.util.ArrayList;
import java.util.Iterator;


public class Tower {

  private ArrayList<Flyable> observers;
  public Tower() {
    System.out.println("Tower constructor");
    observers = new ArrayList<Flyable>();
  }
  public void register(Flyable flyable) {
    observers.add(flyable);
  }
  public void unregister(Flyable flyable) {
    observers.remove(flyable);
  }
  protected void conditionsChanged() {

    Iterator<Flyable> iter = observers.iterator();
    while (iter.hasNext()) {
      Flyable flyable = iter.next();
      System.out.println(flyable + " updateConditions");
      flyable.updateConditions();
    }
  }
  protected int getIndex(Flyable flyable ) {
    return observers.indexOf(flyable);
  }
}
