package AssistedProblems.TransportSystem;

public class Vehicle {
  public double max_speed;
  public String fuel_type;

  public Vehicle(double speed,String fuel)
  {
    this.max_speed = speed;
    this.fuel_type = fuel;
  }

  public void display_info()
  {
      System.out.println("Max speed of a vehicle "+max_speed);
      System.out.println("Fuel type of a vehicle "+fuel_type+"\n");
  }


}
