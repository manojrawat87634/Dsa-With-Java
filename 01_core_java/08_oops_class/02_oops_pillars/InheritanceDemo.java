class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();   // inherited method
        car.drive();  // own method
    }
}
