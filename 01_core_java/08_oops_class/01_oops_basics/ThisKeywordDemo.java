class Car {
    String brand;

    Car(String brand) {
        this.brand = brand; // resolves name conflict
    }

    void show() {
        System.out.println("Car brand: " + brand);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Car c1 = new Car("BMW");
        Car c2 = new Car("Audi");

        c1.show();
        c2.show();
    }
}
