package PlayerState.State;

import PlayerState.PlayerLevel;

public class BeginnerLevel extends PlayerLevel {
    public BeginnerLevel() { super(); }
    @Override
    final protected void run() { System.out.println("천천히 달립니다."); }
    @Override
    final protected void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }
    @Override
    final protected void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }
    @Override
    final public void showLevelMessage() {
        this.run();
        for (var loop = 0; loop < 1; ++loop) this.jump();
        this.turn();
    }
}
