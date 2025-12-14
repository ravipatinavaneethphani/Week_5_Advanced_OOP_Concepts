package week5;

interface Flyable {
 void fly();
}

class Bird implements Flyable {
 @Override
 public void fly() {
     System.out.println("Bird is flying");
 }
}

class Airplane implements Flyable {
 @Override
 public void fly() {
     System.out.println("Airplane is flying");
 }
}

public class FlyableInterfaceDemo {
 public static void main(String[] args) {
     Flyable f1 = new Bird();
     Flyable f2 = new Airplane();

     f1.fly();
     f2.fly();
 }
}

