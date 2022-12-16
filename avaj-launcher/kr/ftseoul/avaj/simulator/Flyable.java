package kr.ftseoul.avaj.simulator;

public interface Flyable {
  public void updateConditions();
  public void registerTower(WeatherTower weatherTower);
}
