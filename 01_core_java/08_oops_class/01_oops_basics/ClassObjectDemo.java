class Student {
    String name;
    int age;
    void display() {
        System.out.println(name + " - " + age);
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();   // object creation
        s1.name = "Rahul";
        s1.age = 20;
        s1.display();
    }
}
