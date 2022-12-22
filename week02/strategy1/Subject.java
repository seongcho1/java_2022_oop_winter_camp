package week02.strategy1;

public class Subject {
  private String name; private int scorePoint; private boolean majorCode;
  public String getName() { return name;
  }
  public void setName(String name) {
  this.name = name; }
  public int getScorePoint() {
    return scorePoint;
  }
  public void setScorePoint(int scorePoint) {
    this.scorePoint = scorePoint;
  }
  public boolean isMajorCode() {
    return majorCode;
  }
  public void setMajorCode(boolean majorCode) {
    this.majorCode = majorCode;
  }

  public String getGrade() {

    GradeStrategy strategy;

    if (majorCode) strategy = new MajorGradeStrategy();
    else strategy = new MinorGradeStrategy();

    return strategy.get(scorePoint);
  }

}
