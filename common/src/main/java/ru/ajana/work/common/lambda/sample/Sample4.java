package ru.ajana.work.common.lambda.sample;

import java.util.List;
import java.util.function.Consumer;

class Student {

  private String name;
  private int marks;

  public Student(String name, int marks) {
    this.name = name;
    this.marks = marks;
  }

  public void addMarks(int m) {
    this.marks += m;
  }

  public void debug() {
    System.out.println(name + ":" + marks);
  }
}

public class Sample4 {

  public static void main(String[] args) {
    List<Student> slist = List
        .of(new Student("S1", 40),
            new Student("S2", 35),
            new Student("S3", 30));
    Consumer<Student> increaseMarks = s -> s.addMarks(10);
    slist.forEach(increaseMarks);
    slist.forEach(Student::debug);
  }
}


