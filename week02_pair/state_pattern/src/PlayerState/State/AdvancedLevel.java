package PlayerState.State;

import PlayerState.PlayerLevel;

public class AdvancedLevel extends PlayerLevel {
    public AdvancedLevel() { super(); }
    @Override
    final protected void run() { System.out.println("빨리 달립니다."); }
    @Override
    final protected void jump() {
        System.out.println("높이 jump 합니다.");
    }
    @Override
    final protected void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }
    @Override
    final public void showLevelMessage() {
        this.run();
        for (var loop = 0; loop < 2; ++loop) this.jump();
        this.turn();
    }
}
