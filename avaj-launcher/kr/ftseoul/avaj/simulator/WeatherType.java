package kr.ftseoul.avaj.simulator;

public enum WeatherType {
  SUN {
    @Override
    public String toString() {
      return "Sun";
    }
  },
  RAIN {
    @Override
    public String toString() {
      return "Rain";
    }
  },
  FOG {
    @Override
    public String toString() {
      return "Fog";
    }
  },
  SNOW {
    @Override
    public String toString() {
      return "Snow";
    }
  },
}
