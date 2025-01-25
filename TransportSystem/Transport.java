package AssistedProblems.TransportSystem;

public class Transport {
    public static void main(String[] args) {
        Truck mahindra = new Truck(110,"Diesel",400000);
        mahindra.display_info();
        mahindra.truck_extra();
        Car safari = new Car(200,"Petrol",5);
         safari.display_info();
         safari.car_extra();
         Bike kawasaki = new Bike(280,"Petrol",55);
         kawasaki.display_info();
         kawasaki.Bike_extra();
    }
}
