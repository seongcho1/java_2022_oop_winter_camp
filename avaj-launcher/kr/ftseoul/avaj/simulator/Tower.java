package kr.ftseoul.avaj.simulator;

import java.util.ArrayList;
import java.util.Iterator;


public class Tower {

  private ArrayList<Flyable> observers;
  private ArrayList<Flyable> removeList;
  public Tower() {
    //System.out.println("Tower constructor");
    observers = new ArrayList<Flyable>();
    removeList = new ArrayList<Flyable>();
  }
  public void register(Flyable flyable) {
    observers.add(flyable);
  }
  public void unregister(Flyable flyable) {
    //observers.remove(flyable);
    removeList.add(flyable);
  }
  protected void conditionsChanged() {
    if (observers.size() == 0) {
      //System.out.println("Tower says: ---no observers---");
      return;
    }

    Iterator<Flyable> iter = observers.iterator();
    while (iter.hasNext()) {
      Flyable flyable = iter.next();
      //System.out.println(flyable.getFullname() + " updateConditions");
      flyable.updateConditions();
    }

    Iterator<Flyable> iter2 = removeList.iterator();
    while (iter2.hasNext()) {
      Flyable flyable = iter2.next();
      observers.remove(flyable);
    }
    removeList.clear();

  }

  // protected int getIndex(Flyable flyable ) {
  //   return observers.indexOf(flyable);
  // }
}
