package flyweight;

import java.util.HashMap;

public class BigCharFactory {
  static BigCharFactory factory = new BigCharFactory();
  private HashMap<Character, BigChar> pool = new HashMap<>();

  public BigCharFactory() {}

  public static BigCharFactory getInstance() {
    return factory;
  }

  public BigChar getBigChar(char charAt) {

    if (pool.containsKey(charAt)) {
      return pool.get(charAt);
    }
    else {
      BigChar b = new BigChar(charAt);
      pool.put(charAt, b);
      return b;
    }
  }
}
