package week02.strategy1;

public class MajorGradeStrategy implements GradeStrategy {

  @Override
  public String get(int scorePoint) {
    String grade;

    if (scorePoint >= 95 && scorePoint <= 100) grade = "S";
    else if (scorePoint >= 90 && scorePoint <= 94) grade = "A";
    else if (scorePoint >= 80 && scorePoint <= 89) grade = "B";
    else if (scorePoint >= 70 && scorePoint <= 79) grade = "C";
    else if (scorePoint >= 60 && scorePoint <= 69) grade = "D";
    else if (scorePoint >= 0 && scorePoint < 60) grade = "F";
    else throw new IncorrectScoreException("scorePoint=" + scorePoint);

    return grade;
  }
}
