public class CarRental {
    private String customer_name; 
    private String model_name; 
    private int rental_days; 
    private long total_cost; 
    CarRental(String name,String model,int days)
    { 
       this.customer_name = name; 
       this.model_name = model; 
       this.rental_days = days; 
    } 
    private long total_cost()
    { 
        total_cost = rental_days* 5000;
        return total_cost;  
    } 
    private void display()
    { 
         System.out.println("Owner name of a car :"+customer_name); 
         System.out.println("Model name of a car :"+model_name ); 
         System.out.println("Total cost of a car :"+total_cost()); 
        
    }
    public static void main(String[] args) {
        CarRental r1 = new CarRental("Pratham mishra","e-Class",100000); 
        r1.display(); 
    }
}
