package week02.state;

public enum LevelType {
  BEGINNER {
    @Override
    public String toString() {
      return "BeginnerLevel";
    }
  },
  ADVANCED {
    @Override
    public String toString() {
      return "AdvancedLevel";
    }
  },
  SUPER {
    @Override
    public String toString() {
      return "SuperLevel";
    }
  },
}
