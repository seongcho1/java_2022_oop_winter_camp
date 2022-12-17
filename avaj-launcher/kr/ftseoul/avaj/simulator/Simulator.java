package kr.ftseoul.avaj.simulator;

public class Simulator {
  public static int numOfSimulations;
  public static void main(String[] args) {
    try {
      doSimulationWithoutFile();

    } catch(Exception ex) {
      System.out.println("Exception occured: " + ex);
    }
  }

  public static void doSimulationWithoutFile() {

    Simulator.numOfSimulations = 25;

    WeatherTower weatherTower = new WeatherTower();
    //System.out.println(tower);

    AircraftFactory factory = new AircraftFactory();

    Flyable b1 = factory.newAircraft("Baloon", "B1", 2, 3, 20);
    b1.registerTower(weatherTower);
    Flyable b2 = factory.newAircraft("Baloon", "B2", 1, 8, 66);
    b2.registerTower(weatherTower);

    Flyable j1 = factory.newAircraft("JetPlane", "J1", 23, 44, 32);
    j1.registerTower(weatherTower);

    Helicopter h1 = new Helicopter("H1", new Coordinates(654, 33, 20));
    h1.registerTower(weatherTower);
    Helicopter h2 = new Helicopter("H2", new Coordinates(22, 33, 44));
    h2.registerTower(weatherTower);
    Helicopter h3 = new Helicopter("H3", new Coordinates(98, 68, 99));
    h3.registerTower(weatherTower);

    Flyable b3 = factory.newAircraft("Baloon", "B3", 102, 22, 34);
    b3.registerTower(weatherTower);

    Flyable j2 = factory.newAircraft("JetPlane", "J2", 11, 99, 768);
    j2.registerTower(weatherTower);

    Helicopter h4 = new Helicopter("H4", new Coordinates(223, 23, 54));
    h4.registerTower(weatherTower);

    for (int i = 0; i < Simulator.numOfSimulations; i++) {
      weatherTower.conditionsChanged();
    }

    //WeatherProvider weatherProvider = WeatherProvider.getProvider();
    //System.out.println(weatherProvider);

    // WeatherProvider provider2 = WeatherProvider.getProvider();
    // WeatherProvider provider3 = WeatherProvider.getProvider();
    // System.out.println(provider2);
    // System.out.println(provider3);

    //System.out.println(WeatherType.valueOf("SUN").ordinal());
    //System.out.println(WeatherType.values()[1]);

  }
}
