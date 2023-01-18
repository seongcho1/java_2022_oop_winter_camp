package flyweight;

public class BigCharFactory {

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



}
