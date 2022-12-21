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

  public void play(int time) {
    level.go(time);
  }
}
