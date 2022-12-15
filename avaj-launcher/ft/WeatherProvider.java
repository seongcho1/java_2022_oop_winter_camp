package ft;

public class WeatherProvider {
  private WeatherProvider weatherProvider;
  private String[] weather;

  public WeatherProvider() {
    weather = new String[3];
    weather[0] = "Weather0";
    weather[1] = "Weather1";
    weather[2] = "Weather2";
  }
  public WeatherProvider getProvider() {
    return weatherProvider;
  }
  public String getCurrentWeather(Coordinates coordinates) {
    return "Weather";
  }

}

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
