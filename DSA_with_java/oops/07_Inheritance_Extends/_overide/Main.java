class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    // overriding
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Cat c = new Cat();
        c.sound();  // overridden method
    }
}
