package Concret;

import Interface.GradeStrategy;
import Interface.GetGradeInfo;

final public class Subject implements GetGradeInfo {
    final public String name;
    final private int scorePoint;
    final private GradeStrategy gradeStrategy;

    public Subject(final String name, final int scorePoint, final GradeStrategy gradeStrategy) {
        this.name = name;
        this.scorePoint = scorePoint;
        this.gradeStrategy = gradeStrategy;
    }

    public String getName() { return this.name; }

    public int getScore() { return this.scorePoint; }

    @Override
    public String getGradeInfo() { return this.gradeStrategy.calculateGrade(this.scorePoint); }
}
