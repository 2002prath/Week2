package AssistedProblems.TransportSystem;

public class Car extends Vehicle{
   public int seats;
   public Car(double speed,String fuel,int seat_no)
   {
       super(speed,fuel);
       this.seats = seat_no;
   }
   public void car_extra()
   {
       System.out.println("Seats of a car :"+seats);
       System.out.println("================================");
   }
}
