package week02.strategy1;

public class MinorGradeStrategy implements GradeStrategy {

  @Override
  public String get(int scorePoint) {
    String grade;

    if (scorePoint >= 90 && scorePoint <= 100) grade = "A";
    else if (scorePoint >= 80 && scorePoint <= 89) grade = "B";
    else if (scorePoint >= 70 && scorePoint <= 79) grade = "C";
    else if (scorePoint >= 55 && scorePoint <= 69) grade = "D";
    else if (scorePoint >= 0 && scorePoint < 55) grade = "F";
    else throw new IncorrectScoreException("scorePoint=" + scorePoint);

    return grade;
  }
}
