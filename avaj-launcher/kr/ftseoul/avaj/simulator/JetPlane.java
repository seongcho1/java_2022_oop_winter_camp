package kr.ftseoul.avaj.simulator;

public class JetPlane extends Aircraft implements Flyable {
  private WeatherTower weatherTower;

  public JetPlane(String name, Coordinates coordinates) {
    super(name, coordinates);
  }

  public void updateConditions() {
    String weatherString = weatherTower.getWeather(coordinates);

    //SUN - Latitude increases with 10, Height increases with 2
    if (weatherString.equalsIgnoreCase(WeatherType.SUN.toString())) {
      //JetPlane#J1(2): What a beautiful view!
      System.out.println(getFullname() + ": What a beautiful view!");
      coordinates.setLatitude(coordinates.getLatitude() + 10);
      coordinates.setHeight(coordinates.getHeight() + 2);
    }
    //RAIN - Latitude increases with 5
    else if (weatherString.equalsIgnoreCase(WeatherType.RAIN.toString())) {
      //JetPlane#J1(2): It's raining. Better watch out for lightings.
      System.out.println(getFullname() + ": It's raining. Better watch out for lightings.");
      coordinates.setLatitude(coordinates.getLatitude() + 5);
    }
    //FOG - Latitude increases with 1
    else if (weatherString.equalsIgnoreCase(WeatherType.FOG.toString())) {
      //JetPlane#J1(2): Can't see anything. It can be dangerous.
      System.out.println(getFullname() + ": Can't see anything. It can be dangerous.");
      coordinates.setLatitude(coordinates.getLatitude() + 1);
    }
    //SNOW - Height decreases with 7
    else if (weatherString.equalsIgnoreCase(WeatherType.SNOW.toString())) {
      //JetPlane#J1(2): OMG! Winter is coming!
      System.out.println(getFullname() + ": OMG! Winter is coming!");
      coordinates.setHeight(coordinates.getHeight() - 7);
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
    //JetPlane#J1(2)
    return "JetPlane#" + name + "(" + id + ")";
  }
}
