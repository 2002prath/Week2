package Access_modifier;

public class University {
    public String roll_no; 
    protected String name; 
    private double cgpa;  
    private int x=1;
    private double sum =0;  
    
    University(String roll,String name,double sgpa)
    { 
        this.roll_no = roll; 
        this.name = name; 
        this.cgpa = sgpa; 
    }
    
    public double calculate_cgpa()
    { 
       sum = (sum + cgpa)/x;
       x++;  
       return sum; 
    }
    protected void display()
    { 
        System.out.println("Name of a student "+name); 
        System.out.println("Enrollment number is :"+roll_no); 
        System.out.println("CGPA of a student is "+calculate_cgpa()); 
    }
    
    public static void main(String[] args) {
      University b2021 = new University("0111CS211113","Pratham Mishra",8.45); 
      b2021.display(); 
    }
}
