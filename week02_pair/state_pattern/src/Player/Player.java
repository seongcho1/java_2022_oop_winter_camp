package Player;

import PlayerState.PlayerLevel;
import PlayerState.State.BeginnerLevel;

final public class Player {
    private PlayerLevel level;
    public Player() { this.level = new BeginnerLevel(); }
    public PlayerLevel getLevel() { return this.level; }
    public void upgradeLevel(PlayerLevel playerLevel) { this.level = playerLevel; }
    public void play() { this.level.showLevelMessage(); }
}
