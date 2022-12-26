package Enum;

public enum LevelStatus {
    BEGINNER_LEVEL(1),
    ADVANCED_LEVEL(2),
    SUPER_LEVEL(3);

    LevelStatus(int value) { this.value = value; }

    final private int value;
    final public int getValue() { return this.value; }
}
