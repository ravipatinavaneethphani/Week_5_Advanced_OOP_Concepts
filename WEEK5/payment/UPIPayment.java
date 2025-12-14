package payment;

// 09_UPI_Payment

public class UPIPayment extends Payment {

    public UPIPayment(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Payment of ₹" + amount + " successful via UPI.");
    }
}
