package AssistedProblems.TransportSystem;

public class Truck extends Vehicle{
    protected double capacity;

    public Truck(double speed,String fuel,double load_capacity)
    {
       super(speed,fuel);
       this.capacity= load_capacity;
    }
    public void truck_extra()
    {
        System.out.println("Load capacity of a truck is :"+capacity);
        System.out.println("===============================");
    }

}
