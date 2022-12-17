package kr.ftseoul.avaj.simulator;

public class Coordinates {
  public static final int MIN_LONGITUDE = 0;
  public static final int MIN_LATITUDE = 0;
  public static final int MIN_HEIGHT = 0;
  public static final int MAX_HEIGHT = 100;

  private int longitude;
  private int latitude;
  private int height;

  public Coordinates(int longitude, int latitude, int height) {
    this.longitude = longitude;
    this.latitude = latitude;
    this.height = height;
  }

  public int getLongitude() {
    return longitude;
  }

  public int getLatitude() {
    return latitude;
  }

  public int getHeight() {
    return height;
  }

  public void setLongitude(int longitude) {
    if (longitude < MIN_LONGITUDE) {
      longitude = MIN_LATITUDE;
    }
    this.longitude = longitude;
  }

  public void setLatitude(int latitude) {
    if (latitude < MIN_LATITUDE) {
      latitude = MIN_LATITUDE;
    }
    this.latitude = latitude;
  }

  public void setHeight(int height) {
    if (height > MAX_HEIGHT) {
      height = MAX_HEIGHT;
    } else if (height < MIN_HEIGHT) {
      height = MIN_HEIGHT;
    }
    this.height = height;
  }

  public String toString() {
    return "(" + String.valueOf(longitude) + ", " + String.valueOf(latitude) + ", " + String.valueOf(height) + ")";
  }

}
