package week02.state;

public class AdvancedLevel extends PlayerLevel {

  public AdvancedLevel(Player player) {
    super(player);
  }

  @Override
  public void run() {
    System.out.println("빨리 달립니다.");
  }

  @Override
  public void jump() {
    System.out.println("높이 Jump 합니다.");
  }

  @Override
  public void turn() {
    System.out.println("Turn 할 줄 모르지롱.");
  }

  @Override
  public void showLevelMessage() {
    System.out.println(LevelType.ADVANCED + " 입니다.");
  }

  @Override
  public String toString() {
    return LevelType.ADVANCED.toString();
  }
}
