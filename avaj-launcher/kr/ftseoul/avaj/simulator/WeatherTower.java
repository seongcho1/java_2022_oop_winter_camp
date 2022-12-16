package kr.ftseoul.avaj.simulator;

public class WeatherTower extends Tower {

  private WeatherProvider weatherProvider;

  public WeatherTower() {
    super();
    weatherProvider = WeatherProvider.getProvider();
  }


  public String getWeather(Coordinates coordinates) {
    String weatherString = weatherProvider.getCurrentWeather(coordinates);
    System.out.println(weatherString);
    return weatherString;
  }
  private void changeWeather() {

  }
}
