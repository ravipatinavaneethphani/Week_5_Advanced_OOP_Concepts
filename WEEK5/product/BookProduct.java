package product;

public class BookProduct extends Product {

    public BookProduct(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05;
    }
}
