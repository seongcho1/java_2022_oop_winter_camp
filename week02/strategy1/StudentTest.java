package week02.strategy1;

public class StudentTest {
  public static void main(String[] args) {

    try {
      Student studentLee = new Student(1001, "Lee");
      studentLee.addSubject("국어", 100, false);
      studentLee.addSubject("수학", 100, true);

      Student studentKim = new Student(1002, "Kim");
      studentKim.addSubject("국어", 55, true);
      studentKim.addSubject("수학", 55, false);
      studentKim.addSubject("영어", 100, false);

      studentLee.showGradeInfo();
      System.out.println("======================================");
      studentKim.showGradeInfo();
    } catch(Exception e) {
      System.err.println("Exception occured: " + e);
    }

  }
}
