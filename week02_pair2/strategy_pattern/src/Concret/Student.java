package Concret;

import Interface.GradeStrategy;
import Interface.ShowGradeInfo;

import java.util.ArrayList;

final public class Student implements ShowGradeInfo {
    final int studentID;
    final String studentName;
    final ArrayList<Subject> subjectList = new ArrayList<>();

    public Student(final int studentID, final String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void addSubject(final String name, final int score, final GradeStrategy gradeStrategy) {
        var subject = new Subject(name, score, gradeStrategy);
        subjectList.add(subject);
    }

    @Override
    public void showGradeInfo() {
        for (var subject : subjectList) {
            var grade = subject.getGradeInfo();
            System.out.println(
                    String.format("학생 %s의 %s 과목 성적은 %d점 이고, 학점은 %s 입니다",
                            this.studentName,
                            subject.getName(),
                            subject.getScore(),
                            grade)
            );
        }
    }
}
