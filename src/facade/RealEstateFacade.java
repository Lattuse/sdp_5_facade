package facade;

import subsystems.AgentService;
import subsystems.PaymentSystem;
import subsystems.PropertyListing;

public class RealEstateFacade {
    private final PropertyListing listing;
    private final PaymentSystem payment;
    private final AgentService agent;

    public RealEstateFacade() {
        this.listing = new PropertyListing();
        this.payment = new PaymentSystem();
        this.agent = new AgentService();
    }

    public void buyProperty(String buyer, String propertyName, double amount) {
        listing.listProperty(propertyName);
        agent.assignAgent(buyer);
        payment.processPayment(buyer, amount);
        String transactionMsg = "Transaction completed successfully for " + buyer;
        System.out.println(transactionMsg);
    }
}

