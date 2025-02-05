import java.util.Scanner; 
public class Circle
{ 
    public static void main(String[] mmg)
    { 
       Scanner sc = new Scanner(System.in); 
       
       System.out.println("Enter radius of a circle"); 
       double radius = sc.nextDouble(); 

      Display area = new Display(radius); 
      area.display();       
      sc.close(); 
    }
}
class Display{
  protected double radii;  

      Display(double radius)
      { 
        this.radii = radius; 
      } 

      public double calculate()
      { 
          return Math.PI*radii*radii; 
      }

       protected void display()
       { 
          System.out.println("Area of a circle is "+ calculate()); 
       } 
}