import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Manoj", 100, "Delhi"),
                new Student("Krishna", 95, "Mumbai"),
                new Student("Munna", 60, "Delhi"),
                new Student("Redima Sharma", 85, "Kolkata")
        );

        StudentService service = new StudentService();

        System.out.println("Top Students:");
        service.getTopStudents(students).forEach(System.out::println);

        System.out.println("\nStudent Names:");
        service.getStudentNames(students).forEach(System.out::println);

        System.out.println("\nAverage Marks:");
        System.out.println(service.getAverageMarks(students));

        System.out.println("\nSorted by Marks Desc:");
        service.sortByMarksDesc(students).forEach(System.out::println);
    }
}