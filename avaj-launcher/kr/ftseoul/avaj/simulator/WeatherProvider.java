//https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/
package kr.ftseoul.avaj.simulator;

public class WeatherProvider {
  private static long tickTimer = 0;
  private static WeatherProvider weatherProvider;
  //coordinates x num of simulation, 4 dimensions
  private static String[] weather;

  private WeatherProvider() {
    //private constructor
    weather = new String[3];
    weather[0] = "weather0";
    weather[1] = "weather1";
    weather[2] = "weather2";
  }

  //Lazy initialization method to return instance of class
  public static WeatherProvider getProvider()
  {
    if (weatherProvider == null)
    {
      // if instance is null, initialize
      weatherProvider = new WeatherProvider();
    }
    return weatherProvider;
  }

  public String getCurrentWeather(Coordinates coordinates) {
    //coordinates' getCurrentWeather of the tick
    return "Weather";
  }

  public void tick() {
    ++tickTimer;
  }

}

/*

//Java Code to create singleton class
// With Lazy initialization
public class GFG
{
  // private instance, so that it can be
  // accessed by only by getInstance() method
  private static GFG instance;

  private GFG()
  {
    // private constructor
  }

  //method to return instance of class
  public static GFG getInstance()
  {
    if (instance == null)
    {
      // if instance is null, initialize
      instance = new GFG();
    }
    return instance;
  }
}

*/


/*
class Node
{
  private int data;
  private Node nextNode; // reference to next linked node

  public Node( int data ) {
    // constructor body
  }
  public void setData( int data ) {
    //method body
  }
  public int getData() {
    // method body
  }
  public void setNext( Node next ) {
    // method body
  }
  public Node getNext() {
    // method body
  }
} // end class Node
*/
