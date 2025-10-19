import facade.RealEstateFacade;

public class Main {
    public static void main(String[] args) {
        RealEstateFacade facade = new RealEstateFacade();
        String buyerName = "Iosiph Stalin";
        String propertyName = "Luxury Dacha";
        double amount = 250000;
        facade.buyProperty(buyerName, propertyName, amount);
    }
}

