// googling: bill pugh singleton multithreading java
// https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/
// Java code for Bill Pugh Singleton Implementation
public class Singleton
{
 
  private Singleton()
  {
    // private constructor
    System.out.println("default constructor");
    
  }
 
  // Inner class to provide instance of class
  private static class BillPughSingleton
  {
    private static final Singleton INSTANCE = new Singleton();
  }
 
  public static Singleton getInstance()
  {
    return BillPughSingleton.INSTANCE;
  }
}