public class PaymentAdapter implements PaymentProcessor {
    private PaymentGateway gateway;
    public PaymentAdapter(PaymentGateway gateway) { this.gateway = gateway; }

    @Override
    public void processPayment(double paymentAmount) {
        System.out.println("Processing your payment:");
        gateway.printUserInfo();
        System.out.println("Amount: " + paymentAmount);
        System.out.println("Thank you for using " + gateway.getClass().getSimpleName() + "!\n");
    }
}