public class Mobile_phone {
    public static void main(String[] amg)
    { 
      Phone_display d1  = new Phone_display(); 
      d1.display("Realme","Note 13 5G",20000); 
    }
}
class Phone_display
{
   public  String brand; 
   public  String model; 
   public  int price;
   
   public void display(String brand,String model,int price)
   { 
      System.out.print("Brand name :"+brand +"\nModel name of phone: "+ model+"\nPrice of a mobile "+price); 
   }
}