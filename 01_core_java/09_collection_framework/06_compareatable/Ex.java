import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int id;
    String name;

    Student(int p_id, String p_name) {
        this.id = p_id;
        this.name = p_name;
    }
}

public class Ex {
    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();
        st.add(new Student(101, "manoj"));
        st.add(new Student(102, "raj"));
        st.add(new Student(103, "redima sharma"));
        st.add(new Student(104, "munna"));
        st.add(new Student(1, "manoj rawat"));
        st.add(new Student(2, "ohm"));
        st.add(new Student(3, "Aham Brahm Ashmi"));
        Comparator <Student> c = new Comparator<>() {
            @Override 
            public int compare(Student o1, Student o2) {
                return o1.id - o2.id;
            }; 
        };
        Collections.sort(st, c);
        for (Student s : st){
        // System.out.print(" : ");
        System.out.print(s.id);
        System.out.print(" : ");
        System.out.println(s.name);
        }
    }
}