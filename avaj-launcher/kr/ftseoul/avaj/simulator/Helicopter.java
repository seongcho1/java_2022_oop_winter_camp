package kr.ftseoul.avaj.simulator;

public class Helicopter extends Aircraft implements Flyable {
  private WeatherTower weatherTower;

  public Helicopter(String name, Coordinates coordinates) {
    super(name, coordinates);
  }

  public void updateConditions() {
    String weatherString = weatherTower.getWeather(coordinates);

    //SUN - Longitude increases with 10, Height increases with 2
    if (weatherString.equalsIgnoreCase(WeatherType.SUN.toString())) {
      //Helicopter#H1(3): This is hot.
      System.out.println(getFullname() + ": This is hot.");
      coordinates.setLongitude(coordinates.getLongitude() + 10);
      coordinates.setHeight(coordinates.getHeight() + 2);
    }
    //RAIN - Longitude increases with 5
    else if (weatherString.equalsIgnoreCase(WeatherType.RAIN.toString())) {
      //Helicopter#H1(3): Damn you rain! .
      System.out.println(getFullname() + ": Damn you rain! Get away from my helicopter.");
      coordinates.setLongitude(coordinates.getLongitude() + 5);
    }
    //FOG - Longitude increases with 1
    else if (weatherString.equalsIgnoreCase(WeatherType.FOG.toString())) {
      //Helicopter#H1(3): Can't see anything. It can be dangerous.
      System.out.println(getFullname() + ": Can't see anything. It can be dangerous.");
      coordinates.setLongitude(coordinates.getLongitude() + 1);
    }
    //SNOW - Height decreases with 12
    else if (weatherString.equalsIgnoreCase(WeatherType.SNOW.toString())) {
      //Helicopter#H4(4): My rotor is going to freeze!
      System.out.println(getFullname() + ": My rotor is going to freeze!");
      coordinates.setHeight(coordinates.getHeight() - 12);
    }
    if (coordinates.getHeight() == Coordinates.MIN_HEIGHT) {
      landOn();
    }
  }
  public void registerTower(WeatherTower weatherTower) {
    this.weatherTower = weatherTower;
  }
  public void landOn() {
    weatherTower.unregister(this);
  }
  public String getFullname() {
    //Helicopter#H1(3)
    return "Helicopter#" + name + "(" + id + ")";
  }
}
