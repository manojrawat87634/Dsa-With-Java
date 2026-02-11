import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Natural ordering: by id
    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "C"));
        students.add(new Student(1, "A"));
        students.add(new Student(2, "B"));

        Collections.sort(students); // uses compareTo()

        System.out.println("Sorted by ID (Comparable):");
        System.out.println(students);
    }
}
