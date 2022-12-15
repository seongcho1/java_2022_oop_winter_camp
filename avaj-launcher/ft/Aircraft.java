package ft;

public class Aircraft {
  protected long id;
  protected String name;
  protected Coordinates coordinates;
  private static long idCounter = 0;

  public Aircraft(String name, Coordinates coordinates) {
    this.id = nextId();
    this.name = name;
    this.coordinates = coordinates;
  }

  public static long nextId() {
    return ++idCounter;
  }
}