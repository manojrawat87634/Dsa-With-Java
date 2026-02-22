import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        return this.marks - s.marks;  // ascending
    }
}

public class Main {
    public static void main(String[] args) {
          List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(80));
        studentList.add(new Student(50));
        studentList.add(new Student(90));
        studentList.add(new Student(60));

        Collections.sort(studentList);  // Uses compareTo()

        for (Student s : studentList) {
            System.out.print(s.marks + " ");
        }
    }
}