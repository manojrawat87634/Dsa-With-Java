// Superclass (Parent)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Subclass (Child)
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.name = "Buddy";

        d.eat();   // inherited from Animal
        d.bark();  // own method
    }
}
