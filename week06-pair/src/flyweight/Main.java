package flyweight;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BigString bs = new BigString("123abc123");
    bs.print();
  }
}
