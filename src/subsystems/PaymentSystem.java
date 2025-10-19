package subsystems;

public class PaymentSystem {
    public void processPayment(String buyer, double amount) {
        String paymentMsg = "Payment of $" + amount + " received from " + buyer;
        System.out.println(paymentMsg);
    }
}
