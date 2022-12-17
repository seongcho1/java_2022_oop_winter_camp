package kr.ftseoul.avaj.simulator;

public class Baloon extends Aircraft implements Flyable {
  private WeatherTower weatherTower;

  public Baloon(String name, Coordinates coordinates) {
    super(name, coordinates);
  }

  public void updateConditions() {
    String weatherString = weatherTower.getWeather(coordinates);

    //SUN - Longitude increases with 2, Height increases with 4
    if (weatherString.equalsIgnoreCase(WeatherType.SUN.toString())) {
      //Baloon#B1(1): Let's enjoy the good weather and take some pics.
      System.out.println(getFullname() + ": Let's enjoy the good weather and take some pics. " + coordinates.toString());
      coordinates.setLongitude(coordinates.getLongitude() + 2);
      coordinates.setHeight(coordinates.getHeight() + 2);
    }
    //RAIN - Height decreases with 5
    else if (weatherString.equalsIgnoreCase(WeatherType.RAIN.toString())) {
      //Baloon#B1(1): Damn you rain! You messed up my baloon.
      System.out.println(getFullname() + ": Damn you rain! You messed up my baloon. " + coordinates.toString());
      coordinates.setHeight(coordinates.getHeight() - 5);
    }
    //FOG - Height decreases with 3
    else if (weatherString.equalsIgnoreCase(WeatherType.FOG.toString())) {
      //Baloon#B1(1): Can't see anything. It can be dangerous.
      System.out.println(getFullname() + ": Can't see anything. It can be dangerous. " + coordinates.toString());
      coordinates.setHeight(coordinates.getHeight() - 3);
    }
    //SNOW - Height decreases with 15
    else if (weatherString.equalsIgnoreCase(WeatherType.SNOW.toString())) {
      //Baloon#B1(1): It's snowing. We're gonna crash.
      System.out.println(getFullname() + ": It's snowing. We're gonna crash. " + coordinates.toString());
      coordinates.setHeight(coordinates.getHeight() - 15);
    }

    if (coordinates.getHeight() == Coordinates.MIN_HEIGHT) {
      landOn();
    }

  }
  public void registerTower(WeatherTower weatherTower) {
    this.weatherTower = weatherTower;
    this.weatherTower.register(this);
  }
  public void landOn() {
    weatherTower.unregister(this);
  }

  public String getFullname() {
    //Baloon#B1(1)
    return "Baloon#" + name + "(" + id + ")";
  }
}
