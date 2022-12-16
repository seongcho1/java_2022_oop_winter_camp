package ft;

public class Simulator {
  public static void main(String[] args) {
    Tower tower = new WeatherTower();
    System.out.println(tower);

    WeatherProvider weatherProvider = WeatherProvider.getProvider();
    System.out.println(weatherProvider);

    // WeatherProvider provider2 = WeatherProvider.getProvider();
    // WeatherProvider provider3 = WeatherProvider.getProvider();
    // System.out.println(provider2);
    // System.out.println(provider3);

  }
}
