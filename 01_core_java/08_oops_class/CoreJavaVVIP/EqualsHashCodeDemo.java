import java.util.HashSet;
import java.util.Objects;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // Override equals()
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student student = (Student) obj;

        return id == student.id &&
               Objects.equals(name, student.name);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class EqualsHashCodeDemo {

    public static void main(String[] args) {

        Student s1 = new Student(1, "John");
        Student s2 = new Student(1, "John");

        System.out.println("s1 equals s2: " + s1.equals(s2));

        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.toString());

        System.out.println("HashSet size: " + set.size());
    }
}
