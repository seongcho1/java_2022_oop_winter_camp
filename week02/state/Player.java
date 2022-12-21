package week02.state;
public class Player {

  public static final int BEGINNER_LEVEL = 1;
  public static final int ADVANCED_LEVEL = 2;
  public static final int SUPER_LEVEL = 3;

  private PlayerLevel level;

  public Player() {
    level = new BiginnerLevel(this);
  }

  public PlayerLevel getLevel() {
    return level;
  }

  public void upgradeLevel(int lv) {

    switch(lv) {
      case 2: level = new AdvancedLevel(this);
              break;
      case 3: level = new SuperLevel(this);
              break;
      default: throw new IncorrectLevelException("level=" + lv);
    }
  }

  public void play() {

    int times = 0;

    if (level.toString().equalsIgnoreCase(LevelType.BEGINNER.toString())) times = BEGINNER_LEVEL;
    else if (level.toString().equalsIgnoreCase(LevelType.ADVANCED.toString())) times = ADVANCED_LEVEL;
    else if (level.toString().equalsIgnoreCase(LevelType.SUPER.toString())) times = SUPER_LEVEL;
    else throw new IncorrectLevelException("times=" + times);
    level.go(times);
  }
}
