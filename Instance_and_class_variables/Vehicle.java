package Instance_and_class_variables;

public class Vehicle {
    private String owner_name; 
    private String vehicle_type; 
    private static int time = 0; 
    private static double RegistrationFee=0; 

     private Vehicle(String name,String vehicle_category)
    { 
      this.owner_name = name; 
      this.vehicle_type= vehicle_category;  
    } 
     private void display_VehicleDetails()
     { 
       System.out.println("Name of owner :"+owner_name); 
       System.out.println("Vehicle type is "+vehicle_type);
     }
     private static void  updateRegistrationFee()
     { 
        RegistrationFee = 15000; 
        if(RegistrationFee>2000)
         { 
             time = time + 15;  
         }
          if(time>1)
           System.out.println("YOu can use your vehicle"); 
           else 
           System.out.println("Renew is pending "); 
     }
    
     
     public static void main(String[] args) {
        Vehicle car = new Vehicle("Tata","LMV"); 
        car.display_VehicleDetails();
        updateRegistrationFee(); 
     }
}
