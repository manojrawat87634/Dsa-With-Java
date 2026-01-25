// Interface
interface Animal {
    void eat();    // abstract method
    void sleep();  // abstract method
}

// Implementing class
class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps in kennel");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.bark();

        // Interface reference
        Animal a = new Dog();  // polymorphism
        a.eat();
        a.sleep();
        // a.bark(); // ❌ cannot call, reference type is Animal
    }
}
