public class Item {
    public static void main(String[] mmg)
    { 
      Item_details i1 =new Item_details(); 
      i1.display("###jjjbhb34344fef","Papaya",50); 
      i1.total_cost(50,31); 
    }
}

class Item_details
{ 
  public String item_code; 
  public String item_name; 
  public double  price; 
  public  int quantity; 
  
   public void display(String item_code,String item_name,double  price)
   { 
     System.out.print("Item code of a product :"+ item_code +"\nItem name of a product :"+ item_name +"\nPrice of a product is "+price); 
   }
   public void total_cost(double price,int quantity)
   { 
      if(quantity > 1)
      System.out.println("\nTotal cost of item :"+ price*quantity);  
      else 
      System.out.print("Total cost of a item "+ price); 
   }
}