package PlayerState.State;

import PlayerState.PlayerLevel;

public class SuperLevel extends PlayerLevel {
    public SuperLevel() {
        super();
    }
    @Override
    final protected void run() { System.out.println("엄청 빨리 달립니다."); }
    @Override
    final protected void jump() { System.out.println("아주 높이 jump 합니다."); }
    @Override
    final protected void turn() {
        System.out.println("한 바퀴 돕니다.");
    }
    @Override
    final public void showLevelMessage() {
        this.run();
        for (var loop = 0; loop < 3; ++loop) this.jump();
        this.turn();
    }
}
