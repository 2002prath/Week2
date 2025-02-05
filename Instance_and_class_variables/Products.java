package Instance_and_class_variables;

public class Products {
    private String Product_name1; 
    private double price1; 
    
    private static double total_product; 
      
     private Products(String Product_name,double price)
     { 
         this.price1 =  price; 
         this.Product_name1 = Product_name;  
         total_product++; 
     } 

    private void display_product()
    { 
      System.out.println("Product name :"+Product_name1); 
      System.out.println("Price of a Product  :"+price1);  
      //display_totalproducts(); 
    } 
    private static void display_totalproducts()
    { 
        System.out.println("Total number of products  :"+total_product); 
    } 
    public static void main(String[] args) {
       
        Products p1 = new Products("pappya",40); 
        Products p2 = new Products("Coconut Water",50); 
       p1.display_product();  
       p2.display_product();  
       display_totalproducts();
    }
}
