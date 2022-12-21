package week02.state;

public abstract class PlayerLevel {
  protected Player player;

  public PlayerLevel(Player player) {
    this.player = player;
  }
  public abstract void run();
  public abstract void jump();
  public abstract void turn();
  public abstract void showLevelMessage();

  public void go(int time) {
    run();
    for(int i =0; i<time; i++) {
      jump();
    }
    turn();
  }
}
