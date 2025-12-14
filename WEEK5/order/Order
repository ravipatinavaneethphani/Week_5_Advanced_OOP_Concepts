package order;

import customer.Customer;
import cart.ShoppingCart;

public class Order {

    private static int orderCounter = 1000; // static member

    private int orderId;
    private Customer customer;
    private ShoppingCart cart;
    private double totalAmount;

    public Order(Customer customer) {
        this.orderId = ++orderCounter;
        this.customer = customer;
        this.cart = customer.getCart();
        this.totalAmount = cart.calculateTotal();
    }
    public void displayOrderSummary() {
        System.out.println("\n========= ORDER SUMMARY =========");
        System.out.println("Order ID: " + orderId);

        customer.displayCustomer();
        cart.displayCart();

        System.out.println("Total Amount Payable: ₹" + totalAmount);
        System.out.println("=================================");
    }
}
