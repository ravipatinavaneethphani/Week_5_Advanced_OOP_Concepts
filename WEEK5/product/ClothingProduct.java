package product;


public class ClothingProduct extends Product {

    public ClothingProduct(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20; 
    }
}
