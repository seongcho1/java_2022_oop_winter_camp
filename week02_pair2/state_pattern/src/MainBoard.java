import Player.Player;
import Enum.LevelStatus;

public class MainBoard {
    public static void main(String[] args) {
        final Player player = new Player();

        player.play();
        player.upgradeLevel(player.getLevel().go(LevelStatus.ADVANCED_LEVEL.getValue()));
        player.play();
        player.upgradeLevel(player.getLevel().go(LevelStatus.SUPER_LEVEL.getValue()));
        player.play();
    }
}
