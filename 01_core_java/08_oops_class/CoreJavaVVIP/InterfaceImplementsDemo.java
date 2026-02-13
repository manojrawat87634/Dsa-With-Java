// Interface
interface Payment {
    void pay(double amount);
}

// CreditCard class implementing Payment interface
class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

// PayPal class implementing Payment interface
class PayPalPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

public class InterfaceImplementsDemo {
    public static void main(String[] args) {

        // Using Credit Card Payment
        Payment payment1 = new CreditCardPayment();
        payment1.pay(150.75);

        // Using PayPal Payment
        Payment payment2 = new PayPalPayment();
        payment2.pay(320.40);

        // Polymorphism example (same reference, different objects)
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(500);

        payment = new PayPalPayment();
        payment.pay(999.99);
    }
}
