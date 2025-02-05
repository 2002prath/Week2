package VehicleRentalSystem;

public class Road {
    public static void main(String[] args) {
        Car ferrari = new Car("MP04 sk 4258","Sports Car",4,10);
        ferrari.setRate(5000);
        ferrari.getInsurance(12000);
        ferrari.displayCarDetails();
    }
}
