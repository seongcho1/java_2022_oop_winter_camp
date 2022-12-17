//https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/
package kr.ftseoul.avaj.simulator;

import java.util.concurrent.ThreadLocalRandom;

public class WeatherProvider {
  private static int tickTimer;
  private static WeatherProvider weatherProvider;
  //coordinates x num of simulation, 4 dimensions
  private static String[] weather;

  private WeatherProvider() {
    //private constructor
    // System.out.println("numOfSimulations=" + Simulator.numOfSimulations);
    // weather = new String[3];
    // weather[0] = "weather0";
    // weather[1] = "weather1";
    // weather[2] = "weather2";

    if (Simulator.numOfSimulations < 1)
      throw new IncorrectNumberException("numOfSimulations=" + Simulator.numOfSimulations);

    createWeather(Simulator.numOfSimulations);
  }

  private void createWeather(int t) {
    int xSize = 10; //10x30 = 300
    int ySize = 10; //10x30 = 300
    int zSize = 10; //10x10 = 100
    int totalSize = t * xSize * ySize * zSize;

    weather = new String[totalSize];
    for (int a = 0; a < t; a++) {
      for (int i = 0; i < xSize; i++) {
        for (int j = 0; j < ySize; j++) {
          for (int k = 0; k < zSize; k++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 5 + 1);
            int v;
            switch (randomNum) {
              case 0:
              case 1:
              case 2: v = 0;  //SUN
                break;
              case 3: v = 1;  //FOG
                break;
              case 4: v = 2;  //RAIN
                break;
              case 5: v = 3;  //SNOW
                break;
              default: v = 0;
                break;
            }
            weather[a * 1000 + i * 100 + j * 10 + k] = String.valueOf(v);//0 to 3
          }
        }
      }
    }

  }

  //Lazy initialization method to return instance of class
  public static WeatherProvider getProvider()
  {
    if (weatherProvider == null) {
      // if instance is null, initialize
      weatherProvider = new WeatherProvider();
      tickTimer = -1;
    }
    return weatherProvider;
  }

  public String getCurrentWeather(Coordinates coordinates) {
    //coordinates' getCurrentWeather of the tick
    //if (tickTimer == 0)
    //return "Sun";
    int a, i, j, k, v;
    a = WeatherProvider.tickTimer;
    i = coordinates.getLongitude() / 30;
    j = coordinates.getLatitude() / 30;
    k = coordinates.getHeight() / 10;

    //out of 300 x 300 x 100
    if (i >= 10 || j >= 10 || k >= 10 ) {
      return WeatherType.SNOW.toString();
    }

    v = Integer.parseInt(weather[a*1000 + i*100 + j *10 + k]);
    return WeatherType.values()[v].toString();
  }

  public void tick() {
    tickTimer = tickTimer + 1;
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
