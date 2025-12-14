package week5;

abstract class Payment {
 abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
 @Override
 void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using Credit Card");
 }
}

class UPIPayment extends Payment {
 @Override
 void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using UPI");
 }
}

public class PaymentAbstractDemo {
 public static void main(String[] args) {
     Payment p1 = new CreditCardPayment();
     Payment p2 = new UPIPayment();

     p1.pay(1000);
     p2.pay(500);
 }
}

