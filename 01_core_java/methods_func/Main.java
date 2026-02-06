public class Main {

    // ===== Static Methods =====

    // 1. Void method (no return)
    static void normalFunc() {
        System.out.println("This is a void function (normalFunc)");
    }

    // 2. Non-void method returning int
    static int sum_num(int a, int b) {
        return a + b;
    }

    // 3. Method with multiple parameters returning String
    static String user_info(String name, String email, String city) {
        return "User name: " + name + ", Email: " + email + ", City: " + city;
    }

    // 4. Method overloading (same name, different parameters)
    static int sum_num(int a, int b, int c) {
        return a + b + c;
    }

    // 5. Pass-by-value example (primitive)
    static void changeValue(int x) {
        x = x + 10;
        System.out.println("Inside changeValue: " + x);
    }

    // 6. Pass-by-reference example (object)
    static void changeName(User u) {
        u.name = "Ravi";
    }

    // ===== Non-Static Methods =====

    void nonStaticMethod() {
        System.out.println("This is a non-static method");
    }

    // ===== Variable Scope Example =====
    static int staticCount = 0; // static variable (class-level)
    int instanceCount = 0;      // instance variable (object-level)

    void demoScope() {
        int localVar = 100; // local variable (method-level)
        System.out.println("Local variable: " + localVar);
        System.out.println("Instance variable: " + instanceCount);
        System.out.println("Static variable: " + staticCount);
    }

    // ===== Main Method =====
    public static void main(String[] args) {

        System.out.println("==== Static Methods ====");
        normalFunc();

        int res1 = sum_num(4, 6);
        int res2 = sum_num(1, 2, 3); // overloaded method
        System.out.println("sum_num(4,6): " + res1);
        System.out.println("sum_num(1,2,3): " + res2);

        System.out.println(user_info("Manoj", "manoj@gmail.com", "Delhi"));

        System.out.println("\n==== Pass-by-Value ====");
        int num = 50;
        System.out.println("Before changeValue: " + num);
        changeValue(num);
        System.out.println("After changeValue: " + num);

        System.out.println("\n==== Pass-by-Reference ====");
        User user1 = new User();
        user1.name = "Manoj";
        System.out.println("Before changeName: " + user1.name);
        changeName(user1);
        System.out.println("After changeName: " + user1.name);

        System.out.println("\n==== Non-Static Method ====");
        Main obj = new Main(); // create object to call non-static
        obj.nonStaticMethod();

        System.out.println("\n==== Variable Scope ====");
        obj.instanceCount = 5;
        Main.staticCount = 10;
        obj.demoScope();
    }
}

// ===== Supporting Class for Pass-by-Reference Example =====
class User {
    String name;
}
