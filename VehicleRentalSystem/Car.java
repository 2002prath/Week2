package VehicleRentalSystem;

public class Car extends Vehicle implements Insurance {
  protected int tyre;
  protected double cost;
  protected int rentaldays;
  protected double insuranceAmount;
  protected double totalprice;
    public Car(String VehicleNumber,String VehicleType,int tyre,int days)
    {
        super(VehicleNumber,VehicleType);
        this.tyre = tyre;
        this.rentaldays = days;
    }

    public double calculateRentalCost()
    {
        cost = getRate() * rentaldays;
        return cost;
    }
    public void getInsurance(double insurancePrice)
    {
        this.insuranceAmount = insurancePrice;
    }
    public double calculateInsurance()
    {

        return  insuranceAmount;
    }
    public double totalprice()
    {
        totalprice = insuranceAmount + calculateRentalCost();
        return totalprice;
    }
    public void displayCarDetails()
    {
        super.display();
        System.out.println("Total rental cost :" + calculateRentalCost());
        System.out.println("Total price of a car" + totalprice());
    }
}
