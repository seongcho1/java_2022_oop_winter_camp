package observer;

public class DigitObserver implements Observer {

  @Override
  public void update(NumberGenerator generator) {
    int num = generator.getNumber();
    System.out.println(num);
  }

}
