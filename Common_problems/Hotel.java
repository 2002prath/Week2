//import java.util.*; 
public class Hotel 
{   private String name; 
    private String room; 
    private int nights; 

    Hotel()
    { 
        System.out.println("Welcome to our hotel"); 
    }
    Hotel(String guest_name,String room_type,int nights)
    { 
        this.name = guest_name; 
        this.room = room_type; 
        this.nights= nights; 
    }
     void display()
     { 
       System.out.println("Guest name :"+ name);  
       System.out.println("Room type is :"+ room); 
       System.out.println("Number of days guest will stay :"+ nights); 
     }
  public static void main(String[] args) {
      Hotel h1  = new Hotel("Cristiano Ronaldo","Luxury double bed",3); 
      h1.display(); 
  }
}