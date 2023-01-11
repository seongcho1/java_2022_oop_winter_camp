package visitor;

public class Directory extends Entry {
  private String name;


  public Directory() {
  }

  @Override
  public void accept(Visitor v) {
    // TODO Auto-generated method stub

  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    // TODO Auto-generated method stub
    return 0;
  }

}
