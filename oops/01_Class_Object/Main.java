class Person {
    String name;
    int age;

    void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();   // object creation

        p1.name = "Manoj";
        p1.age = 22;

        p1.greet();
    }
}
