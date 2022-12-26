package Strategy;

import Interface.GradeStrategy;

public class MajorSubjectStrategy implements GradeStrategy {
    @Override
    public String calculateGrade(int score) {
        if (94 < score) return "S";
        if (89 < score) return "A";
        if (79 < score) return "B";
        if (69 < score) return "C";
        if (59 < score) return "D";
        return "F";
    }
}
