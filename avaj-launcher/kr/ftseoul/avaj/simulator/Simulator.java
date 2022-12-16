package kr.ftseoul.avaj.simulator;

public class Simulator {
  public static void main(String[] args) {

    doSimulationWithoutFile();

  }

  public static void doSimulationWithoutFile() {
    WeatherTower tower = new WeatherTower();
    //System.out.println(tower);

    AircraftFactory factory = new AircraftFactory();

    Flyable b1 = factory.newAircraft("Baloon", "B1", 2, 3, 20);
    b1.registerTower(tower);
    Flyable b2 = factory.newAircraft("Baloon", "B2", 1, 8, 66);
    b2.registerTower(tower);

    Flyable j1 = factory.newAircraft("JetPlane", "J1", 23, 44, 32);
    j1.registerTower(tower);

    Helicopter h1 = new Helicopter("H1", new Coordinates(654, 33, 20));
    h1.registerTower(tower);
    Helicopter h2 = new Helicopter("H2", new Coordinates(22, 33, 44));
    h2.registerTower(tower);
    Helicopter h3 = new Helicopter("H3", new Coordinates(98, 68, 99));
    h3.registerTower(tower);

    Flyable b3 = factory.newAircraft("Baloon", "B3", 102, 22, 34);
    b3.registerTower(tower);

    Flyable j2 = factory.newAircraft("JetPlane", "J2", 11, 99, 768);
    j2.registerTower(tower);

    Helicopter h4 = new Helicopter("H4", new Coordinates(223, 23, 54));
    h4.registerTower(tower);

    for (int i = 0; i < 25; i++) {
      tower.conditionsChanged();
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
