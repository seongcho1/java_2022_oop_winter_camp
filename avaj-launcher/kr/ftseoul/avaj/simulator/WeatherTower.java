package kr.ftseoul.avaj.simulator;

public class WeatherTower extends Tower {

  private WeatherProvider weatherProvider;

  public WeatherTower() {
    super();
    weatherProvider = WeatherProvider.getProvider();
  }

  public void unregister(Flyable flyable) {
    //Baloon#B1(1) landing.
    //Tower says: Baloon#B1(1) unregistered from weather tower.
    System.out.println(flyable.getFullname() + " landing.");
    System.out.println("Tower says: " + flyable.getFullname() + " unregistered from weather tower.");
    super.unregister(flyable);
  }


  protected void conditionsChanged() {
    changeWeather();
    super.conditionsChanged();
  }

  public String getWeather(Coordinates coordinates) {
    String weatherString = weatherProvider.getCurrentWeather(coordinates);
    System.out.println(weatherString);
    return weatherString;
  }

  private void changeWeather() {
    weatherProvider.tick();
  }

}
