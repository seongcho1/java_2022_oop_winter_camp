package template;

public abstract class Car {
  //This method is handled by this class
  public final void startCar() {
    System.out.println("시동을 켭니다.");
  }

  //This method needs to be supplied by a subclass
  public abstract void drive();

  //This method needs to be supplied by a subclass
  public abstract void stop();

  //This method is handled by this class
  public final void turnOff() {
    System.out.println("시동을 끕니다.");
  }

  //templateMethod
  //defines the skeleton (template) of an algorithm in a method, deferring some steps to subclasses
  //Each step is implemented as a separate method.
  public final void run() {
    startCar();
    drive();
    stop();
    turnOff();
    //superclass controls when and how
    //The Hollywood Principle
    //Don't call us, we'll call you!
    if (isAutoUpdateMode()) {
      startUpdate();
    }
  }

  //Hooks are methods that do nothing or default behavior
  //in the abstract class, but may be overridden in the subclasses.
  //A subclass can override the hook method if it wishes
  public boolean isAutoUpdateMode() {
    return false;
  }
  public abstract void startUpdate();
}
