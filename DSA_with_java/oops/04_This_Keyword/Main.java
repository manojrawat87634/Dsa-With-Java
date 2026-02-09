class Student {
    String name;
    int age;

    // constructor
    Student(String name, int age) {
        this.name = name;  // 'this.name' refers to the field, 'name' is the parameter
        this.age = age;
    }

    void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Manoj", 22);
        s1.showInfo();
    }
}
