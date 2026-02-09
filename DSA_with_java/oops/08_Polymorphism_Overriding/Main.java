class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    void bark() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // upcasting
        a.sound();           // Dog barks (runtime decides)
        // a.bark();         // ❌ cannot call, reference type is Animal
    }
}
