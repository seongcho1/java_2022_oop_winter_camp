package PlayerState;

import PlayerState.State.AdvancedLevel;
import PlayerState.State.BeginnerLevel;
import PlayerState.State.SuperLevel;
import Enum.LevelStatus;

public abstract class PlayerLevel {

    public PlayerLevel() { }
    protected abstract void run();
    protected abstract void jump();
    protected abstract void turn();
    public abstract void showLevelMessage();

    final public PlayerLevel go(int level) {
        final var advanced_level = LevelStatus.ADVANCED_LEVEL.getValue();
        final var super_level = LevelStatus.SUPER_LEVEL.getValue();

        if (level == advanced_level) return new AdvancedLevel();
        if (level == super_level) return new SuperLevel();
        return new BeginnerLevel();
    }
}
