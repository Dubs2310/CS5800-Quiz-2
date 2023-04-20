/* 
 * Explanation:
 * There are 3 payment gateways (PayPal, Stripe, Square)
 * Each have their unique fields when it comes to payment processing
 * Only the payment amount is common among all gateways
 * The PaymentGateway interface is responsible for printing user input for the respective gateways
 * The PaymentProcessor, on the other hand, is responsible for processing the payment amount for the respective gateway
 * To avoid having to change the payment processing logic for each gateway that is implemented, we have a PaymentAdapter
 * The PaymentAdapter allows the PaymentGateway to connect with the PaymentProcessor, so it can pass user input along
*/

public class Main {
    public static void main(String[] args) {
        double paymentAmount = 1100.25;

        PaymentGateway payPal = new PayPal("abdullahi@cpp.com");
        PaymentProcessor payPalProcessor = new PaymentAdapter(payPal);
        payPalProcessor.processPayment(paymentAmount);

        PaymentGateway stripe = new Stripe("Abdullah Irfan Siddiqui", "1200-4369-2783-1176", "04/24");
        PaymentProcessor stripeProcessor = new PaymentAdapter(stripe);
        stripeProcessor.processPayment(paymentAmount);
        
        PaymentGateway square = new Square("Location@2310");
        PaymentProcessor squareProcessor = new PaymentAdapter(square);
        squareProcessor.processPayment(paymentAmount);
    }
}