public class Stripe implements PaymentGateway {
    private String cardholderName;
    private String cardNumber;
    private String expirationDate;
    
    public Stripe(String cardholderName, String cardNumber, String expirationDate) { 
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public void printUserInfo() {
        System.out.println("Name on Card: " + this.cardholderName);
        System.out.println("Card Number: " + this.cardNumber);
        System.out.println("Card Expiration: " + this.expirationDate);
    }
}