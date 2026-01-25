class Student {

    // fields
    String name;
    int age;
    String course;

    // constructor
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // method
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Manoj", 22, "Computer Science");
        Student s2 = new Student("Aman", 21, "IT");

        s1.showInfo();
        s2.showInfo();
    }
}
