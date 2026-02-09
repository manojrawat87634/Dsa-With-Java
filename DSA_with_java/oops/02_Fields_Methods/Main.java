class Car {

    // fields (data / properties)
    String brand;
    String model;
    int year;

    // method (behavior)
    void start() {
        System.out.println(brand + " " + model + " is starting");
    }

    // method
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();   // object

        car1.brand = "Tesla";
        car1.model = "Model 3";
        car1.year = 2024;

        car1.start();
        car1.showDetails();
    }
}
