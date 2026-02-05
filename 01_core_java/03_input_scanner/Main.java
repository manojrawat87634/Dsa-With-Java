import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter byte value: ");
        byte b = sc.nextByte();

        System.out.print("Enter short value: ");
        short s = sc.nextShort();

        System.out.print("Enter int value: ");
        int i = sc.nextInt();

        System.out.print("Enter long value: ");
        long l = sc.nextLong();

        System.out.print("Enter float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter double value: ");
        double d = sc.nextDouble();

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        System.out.print("Enter boolean value (true/false): ");
        boolean flag = sc.nextBoolean();

        System.out.print("Enter a string: ");
        String str = sc.next();

        // Printing input values
        System.out.println("\n--- You Entered ---");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);
        System.out.println("String: " + str);

        sc.close();
    }
}
