package AssistedProblems.TransportSystem;

public class Bike extends Vehicle{
    protected double mileage;

    public Bike(double speed,String fuel,double miles)
    {
        super(speed,fuel);
        this.mileage = miles;
    }
    public void Bike_extra()
    {
       System.out.println("Mileage of a bike is "+mileage);
        System.out.println("=============================");
    }
}
