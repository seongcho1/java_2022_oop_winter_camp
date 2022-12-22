package week02.iterator;

// public enum IteratorType {
//   FORWARD,
//   REVERSE,
// }


public enum IteratorType {
  FORWARD(1), REVERSE(-1);
  private final int value;

  private IteratorType(int value) {
      this.value = value;
  }

  public int getValue() {
      return value;
  }
}
