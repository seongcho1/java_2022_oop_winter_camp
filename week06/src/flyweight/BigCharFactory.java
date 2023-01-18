package flyweight;

public class BigCharFactory {
    private BigChar[] pool = new BigChar[] {
      null, null, null, null, null, null, null, null, null, null, null //-, 0, 9
    };

    private BigCharFactory()
    {
      // private constructor
      System.out.println("default constructor");
    }


    // Inner class to provide instance of class
    private static class BillPughSingleton
    {
      private static final BigCharFactory INSTANCE = new BigCharFactory();
    }

    public static BigCharFactory getInstance()
    {
      return BillPughSingleton.INSTANCE;
    }

    private int getIndex(char c) {
      int i = -1; //0~10
      if (c == '-')
        i = 10;
      else {
        i = Character.getNumericValue(c);
        if (i < 0 || i > 9)
          i = -1;
      }
      return i;
    }


    public BigChar getBigChar(char charAt) {
      int i;

      i = getIndex(charAt);
      if (i >=0 && i <= 10 && pool[i] != null)
        return pool[i];
      else {
        BigChar bigChar =  new BigChar(charAt);
        if (i >=0 && i <= 10)
          pool[i] = bigChar;
        return bigChar;
      }

    }



}
