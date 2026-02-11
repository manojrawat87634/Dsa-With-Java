class Laptop {
    String model;

    Laptop(String model) {
        this.model = model;
        System.out.println(model + " created");
    }

    void use() {
        System.out.println(model + " is in use");
    }

    @Override
    protected void finalize() {
        System.out.println(model + " destroyed");
    }
}

public class ObjectLifecycleDemo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell");
        l1.use();

        l1 = null;        // object eligible for GC
        System.gc();      // request garbage collection
    }
}
