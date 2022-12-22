package week02.state;

public class BiginnerLevel extends PlayerLevel {

  public BiginnerLevel(Player player) {
    super(player);
  }

  @Override
  public void run() {
    System.out.println("천천히 달립니다.");
  }

  @Override
  public void jump() {
    System.out.println("Jump 할 줄 모르지롱.");
  }

  @Override
  public void turn() {
    System.out.println("Turn 할 줄 모르지롱.");
  }

  @Override
  public void showLevelMessage() {
    System.out.println(LevelType.BEGINNER + " 입니다.");
  }

  @Override
  public String toString() {
    return LevelType.BEGINNER.toString();
  }
}
