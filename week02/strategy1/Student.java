package week02.strategy1;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
  int studentID;
  String studentName;
  ArrayList<Subject> subjectList;

  public static final int BASIC = 0;
  public static final int MAJOR = 1;

  public Student(int studentID, String studentName){
    this.studentID = studentID;
    this.studentName = studentName;
    subjectList = new ArrayList<Subject>();
  }
  public void addSubject(String name, int score, boolean majorCode){
    Subject subject = new Subject();
    subject.setName(name);
    subject.setScorePoint(score);
    subject.setMajorCode(majorCode);
    subjectList.add(subject);
  }

  public void showGradeInfo() {

    Iterator<Subject> iter = subjectList.iterator();
    while (iter.hasNext()) {
      Subject subject = iter.next();
      System.out.println("학생 " + studentName + "의 " + subject.getName() + " 과목 성적은 " + subject.getScorePoint() + "점 이고, 학점은 " + subject.getGrade() + " 입니다.");

    }


  }
}
