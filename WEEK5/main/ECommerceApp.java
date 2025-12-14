package main;

import product.ElectronicsProduct;
import product.ClothingProduct;
import product.BookProduct;

import customer.Customer;
import order.Order;
import payment.Payment;
import payment.UPIPayment;

public class ECommerceApp {

    public static void main(String[] args) {

        ElectronicsProduct laptop =
                new ElectronicsProduct(1, "Laptop", 60000);

        ClothingProduct tshirt =
                new ClothingProduct(2, "T-Shirt", 1500);

        BookProduct javaBook =
                new BookProduct(3, "Java Programming Book", 800);

        Customer customer =
                new Customer(101, "Navaneeth", "navaneethphani@gmail.com");

        customer.getCart().addProduct(laptop);
        customer.getCart().addProduct(tshirt);
        customer.getCart().addProduct(javaBook);

        Order order = new Order(customer);
        order.displayOrderSummary();
        
        double amountToPay = customer.getCart().calculateTotal();
        Payment payment = new UPIPayment(amountToPay);
        payment.makePayment();
    }
}
