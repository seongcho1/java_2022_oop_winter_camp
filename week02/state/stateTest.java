package week02.state;

public class stateTest {
  public static void main(String[] args) {
    try {
      Player player = new Player();
      player.play();

      player.upgradeLevel(Player.ADVANCED_LEVEL);
      player.play();

      player.upgradeLevel(Player.SUPER_LEVEL);
      player.play();
    } catch(Exception e) {
      System.err.println("Exception occured: " + e);
    }

  }
}
