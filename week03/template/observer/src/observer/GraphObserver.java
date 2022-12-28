package observer;

public class GraphObserver implements Observer {

  @Override
  public void update(NumberGenerator generator) {
    int num = generator.getNumber();
    for (int i = 0; i < num; i++)
      System.out.print("*");
    System.out.println();
  }

}
