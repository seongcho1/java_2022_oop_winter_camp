package kr.ftseoul.avaj.simulator;

//System.out.println(WeatherType.valueOf("SUN").ordinal());
//System.out.println(WeatherType.values()[1]);

public enum WeatherType {
  SUN {
    @Override
    public String toString() {
      return "Sun";
    }
  },
  FOG {
    @Override
    public String toString() {
      return "Fog";
    }
  },
  RAIN {
    @Override
    public String toString() {
      return "Rain";
    }
  },
  SNOW {
    @Override
    public String toString() {
      return "Snow";
    }
  },
}
