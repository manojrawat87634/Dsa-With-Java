class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a = new Dog();  // parent reference, child object
        a.sound();             // runtime decision
    }
}
