package product;


public class ElectronicsProduct extends Product {

    public ElectronicsProduct(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10; // 10% discount
    }
}
