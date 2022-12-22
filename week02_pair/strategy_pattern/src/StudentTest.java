import Concret.Student;
import Strategy.BasicSubjectStrategy;
import Strategy.MajorSubjectStrategy;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");

        studentLee.addSubject("국어", 100, new BasicSubjectStrategy());
        studentLee.addSubject("수학", 100, new MajorSubjectStrategy());

        Student studentKim = new Student(1002, "Kim");

        studentKim.addSubject("국어", 55, new MajorSubjectStrategy());
        studentKim.addSubject("수학", 55, new BasicSubjectStrategy());
        studentKim.addSubject("영어", 100, new BasicSubjectStrategy());

        studentLee.showGradeInfo();
        System.out.println("======================================");
        studentKim.showGradeInfo();
    }
}
