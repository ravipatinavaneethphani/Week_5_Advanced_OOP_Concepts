package customer;

import cart.ShoppingCart;

public class Customer {

    private int customerId;
    private String name;
    private String email;
    private ShoppingCart cart;

    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.cart = new ShoppingCart(); // each customer gets a cart
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void displayCustomer() {
        System.out.println("\n--- Customer Details ---");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
