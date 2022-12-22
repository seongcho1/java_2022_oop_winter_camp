package Strategy;

import Interface.GradeStrategy;

public class BasicSubjectStrategy implements GradeStrategy {
    @Override
    public String calculateGrade(int score) {
        if (89 < score) return "A";
        if (79 < score) return "B";
        if (69 < score) return "C";
        if (54 < score) return "D";
        return "F";
    }
}
