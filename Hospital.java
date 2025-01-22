import java.util.Scanner;
public class Hospital { 
    public static String hopital_name; 
    
    
      public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter hospital name"); 
        hopital_name = sc.nextLine(); 
        System.out.println("Welcome to "+ hopital_name +" hosptial"); 

      Patient p_01 = new Patient("0788ckf787","Mohan prasad",46,"Heart disease"); 
      
      p_01.display(); 
      System.out.println("Total number of patient in a hospital are "+ Patient.getPatient_count()); 

       sc.close(); 
    }   
} 
class Patient 
{ 
    protected String name; 
    protected int age; 
    protected String ailment; 
    private static int patient_count;   
    protected final String id; 

    public static void setPatient_count(int patient_count) {
        Patient.patient_count = patient_count;
    } 
    public static int getPatient_count() {
        return patient_count;
    }


  Patient(String patient_id,String patient_name,int patient_age,String disease)
  { 
    this.id = patient_id; 
    this.name = patient_name; 
    this.age = patient_age; 
    this.ailment = disease;  
    patient_count++;  
  } 

   public void display()
   {  
    if(this instanceof Patient)
      {
        System.out.println("this is an instance of Patient class");
    
     System.out.println("Patient id "+id);  
     System.out.println("Patient name "+name); 
     System.out.println("Patient age "+age); 
     System.out.println("Patient disease "+ailment); 
      } 
    }
 
}