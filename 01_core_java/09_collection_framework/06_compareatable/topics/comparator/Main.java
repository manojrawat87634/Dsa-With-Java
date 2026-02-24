package topics.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int marks;
    String name;

    Student(String _n, int _m) {
        this.name = _n;
        this.marks = _m;
    }
}

public class Main {
    public static void main(String[] args) {
        Comparator<Student> com = (s1, s2) -> s2.marks - s1.marks;
        Student s1 = new Student("Manoj", 100);
        Student s2 = new Student("Redima Sharma", 101);
        Student s3 = new Student("Munna", 1);
        Student s4 = new Student("Krishna ji", 2);
        List<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        Collections.sort(arr, com);
    }
}
