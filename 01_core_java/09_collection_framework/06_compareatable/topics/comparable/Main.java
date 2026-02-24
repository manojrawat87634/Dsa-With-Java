package topics.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
  int marks;
  String name;
  Student(String _n, int _m){
    this.name = _n;
    this.marks = _m;
  }

  @Override
  public int compareTo(Student o) {
    return this.marks - o.marks;     
  }
}


public class Main{
  public static void main(String[] args) {
    Student s1 = new Student("Manoj", 100);
    Student s2 = new Student("Redima Sharma", 101);
    Student s3 = new Student("Munna", 1);
    Student s4 = new Student("Krishna ji", 2);
    List <Student> arr = new ArrayList<>();
    arr.add(s1);
    arr.add(s2);
    arr.add(s3);
    arr.add(s4);
    Collections.sort(arr);
    for (Student s : arr){
      System.out.print(s.name);
    }
  }
}