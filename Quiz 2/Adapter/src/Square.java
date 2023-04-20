public class Square implements PaymentGateway {
    private String locationID;
    public Square(String locationID) { this.locationID = locationID; }

    @Override
    public void printUserInfo() {
        System.out.println("Location ID: " + this.locationID);
    }
}