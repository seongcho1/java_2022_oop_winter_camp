package kr.ftseoul.avaj.simulator;

public enum AircraftType {
  HELICOPTER {
    @Override
    public String toString() {
      return "Helicopter";
    }
  },
  JETPLANE {
    @Override
    public String toString() {
      return "JetPlane";
    }
  },
  BALOON {
    @Override
    public String toString() {
      return "Baloon";
    }
  },
}
