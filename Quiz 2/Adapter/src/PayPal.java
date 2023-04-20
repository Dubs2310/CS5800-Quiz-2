public class PayPal implements PaymentGateway {
    private String userEmail;
    public PayPal(String userEmail) { this.userEmail = userEmail; }

    @Override
    public void printUserInfo() {
        System.out.println("Email: " + this.userEmail);
    }
}