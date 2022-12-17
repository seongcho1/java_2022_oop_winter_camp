package kr.ftseoul.avaj.simulator;

public class AircraftFactory {
  public Flyable newAircraft(String type, String name, int longitude, int latitude, int height) {

    // if (height > Coordinates.MAX_HEIGHT) {
    //   height = Coordinates.MAX_HEIGHT;
    // } else if (height < Coordinates.MIN_HEIGHT) {
    //   height = Coordinates.MIN_HEIGHT;
    // }

    if (longitude < Coordinates.MIN_LONGITUDE)
      throw new IncorrectNumberException(type + " " + name + ", longitude=" + longitude);
    if (latitude < Coordinates.MIN_LATITUDE)
      throw new IncorrectNumberException(type + " " + name + ", latitude=" + latitude);
    if (height < Coordinates.MIN_HEIGHT || height > Coordinates.MAX_HEIGHT )
      throw new IncorrectNumberException(type + " " + name + ", height=" + height);

    Coordinates coordinates = new Coordinates(longitude, latitude, height);

    if (type.equalsIgnoreCase(AircraftType.HELICOPTER.toString()))
      return new Helicopter(name, coordinates);
    else if (type.equalsIgnoreCase(AircraftType.JETPLANE.toString()))
      return new JetPlane(name, coordinates);
    else if (type.equalsIgnoreCase(AircraftType.BALOON.toString()))
      return new Baloon(name, coordinates);
    else
      throw new IncorrectAircraftTypeException("type=" + type);
  }
}
