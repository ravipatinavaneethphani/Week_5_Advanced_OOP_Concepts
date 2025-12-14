package cart;

import java.util.ArrayList;
import product.Product;

public class ShoppingCart {

    private ArrayList<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println(product.getName() + " removed from cart.");
    }
    
    public void displayCart() {
        System.out.println("\n--- Shopping Cart Items ---");
        for (Product product : products) {
            product.displayProduct();
            System.out.println("Discount: ₹" + product.calculateDiscount());
            System.out.println("Final Price: ₹" + product.getFinalPrice());
            System.out.println("---------------------------");
        }
    }

    
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getFinalPrice();
        }
        return total;
    }
}
