public class Main {
    public static void main(String[] args) {

        // 1. Simple assignment
        int a = 10;
        System.out.println("a = " + a);

        // 2. Compound assignment operators
        a += 5;   // a = a + 5
        System.out.println("a += 5 -> " + a);

        a -= 3;   // a = a - 3
        System.out.println("a -= 3 -> " + a);

        a *= 2;   // a = a * 2
        System.out.println("a *= 2 -> " + a);

        a /= 4;   // a = a / 4
        System.out.println("a /= 4 -> " + a);

        a %= 3;   // a = a % 3
        System.out.println("a %= 3 -> " + a);

        // 3. Assignment with different data types
        byte b = 10;
        b += 5;   // implicit casting happens here
        System.out.println("b += 5 -> " + b);

        // 4. Multiple assignment
        int x, y, z;
        x = y = z = 100;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);

       
    }
}
