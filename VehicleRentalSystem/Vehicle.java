package VehicleRentalSystem;

public abstract class Vehicle {
    private String Number;
    private String type;
    private double rate;

    public Vehicle(String VehicleNumber,String VehicleType)
    {
        this.Number = VehicleNumber;
        this.type =  VehicleType;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    abstract double calculateRentalCost();

    public void display()
    {
        System.out.println("Vehicle Number :"+ Number);
        System.out.println("Vehicle Type :"+ type);
    }
}
