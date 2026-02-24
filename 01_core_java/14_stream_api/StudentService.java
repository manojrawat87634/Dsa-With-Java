import java.util.List;
import java.util.stream.Collectors;

public class StudentService {

    // 1. Filter students with marks > 80
    public List<Student> getTopStudents(List<Student> students) {
        return students.stream()
                .filter(s -> s.getMarks() > 80)
                .collect(Collectors.toList());
    }

    // 2. Get names of all students
    public List<String> getStudentNames(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    // 3. Get average marks
    public double getAverageMarks(List<Student> students) {
        return students.stream()
                .mapToInt(Student::getMarks)
                .average()
                .orElse(0.0);
    }

    // 4. Sort students by marks descending
    public List<Student> sortByMarksDesc(List<Student> students) {
        return students.stream()
                .sorted((a, b) -> Integer.compare(b.getMarks(), a.getMarks()))
                .collect(Collectors.toList());
    }
}