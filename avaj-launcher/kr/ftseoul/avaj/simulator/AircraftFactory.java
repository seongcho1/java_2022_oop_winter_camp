package kr.ftseoul.avaj.simulator;

public class AircraftFactory {
  public Flyable newAircraft(String type, String name, int longitude, int latitude, int height) {
    Coordinates coordinates = new Coordinates(longitude, latitude, height);

    if (type.equalsIgnoreCase(AircraftType.HELICOPTER.toString()))
      return new Baloon(name, coordinates);
    else if (type.equalsIgnoreCase(AircraftType.JETPLANE.toString()))
      return new Baloon(name, coordinates);
    else if (type.equalsIgnoreCase(AircraftType.BALOON.toString()))
      return new Baloon(name, coordinates);
    else
      return null;

  }
}
