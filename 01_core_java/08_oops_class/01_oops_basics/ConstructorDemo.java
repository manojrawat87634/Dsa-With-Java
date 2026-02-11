class Employee {
    String name;
    int id;

    // constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void show() {
        System.out.println(name + " - " + id);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 101);
        Employee e2 = new Employee("Neha", 102);

        e1.show();
        e2.show();
    }
}
