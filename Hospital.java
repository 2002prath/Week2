import java.util.*; 
public class Hospital {
    public static void main(String[] args) {
        Doctors arun = new Doctors("Arun kumar","AIIMS-012"); 
        Doctors sadhna  = new Doctors("Sadhna kashyap","US-09x92"); 


        Patient ram_prasad = new Patient("Ram prasad chaubey","0123-345-986"); 
        Patient shanti_devi = new Patient("Shanti devi","0976-974-345"); 

        arun.add_patient(shanti_devi);
        arun.add_patient(ram_prasad);  

        sadhna.add_patient(shanti_devi); 
        
        sadhna.consult_patient();
        arun.consult_patient();  


    }
}
class Doctors
{
    private String name; 
    private String id; 
    public ArrayList<Patient> patients = new ArrayList<>(); 

    public Doctors(String doctor_name,String doctor_id)
    { 
        this.name = doctor_name; 
        this.id = doctor_id; 
    }  
    public void add_patient(Patient mariz)
    { 
        patients.add(mariz); 
    }
    
    public void consult_patient()
    {  
       System.out.println("Patient visited by  Dr."+ name + "   Identity :"+id); 
        for(int i=0;i<patients.size();i++)
        { 
           Patient p1 = patients.get(i); 
           p1.getPatientName(); 
        }  
        System.out.println("Total number of patient visited by doctor are "+ patients.size());   
        System.out.println("\n ================= \n ");        
    }
     public String getDoctor_Name()
     { 
        return name; 
     }
} 
class Patient
{ 
   private String name;  
   private String Aadhar_id;  
   public ArrayList<Doctors> doctors = new ArrayList<>(); 

   public Patient(String patient_name,String aadhar_number)
   { 
     this.name = patient_name; 
     this.Aadhar_id = aadhar_number;   
   }  
   public void addDoctors(Doctors doc)
   { 
     doctors.add(doc); 
   } 
   public void getPatientName()
   { 
     System.out.println(name);  
   }
    public void visited_doctors()
    {   System.out.println("Name :"+name+"Identity card :"+Aadhar_id); 
        System.out.println("Total number of doctors"+doctors.size()+  " visited by patient "+name);  
        System.out.println("List of all doctors are "); 
        for(int i=0;i<doctors.size();i++)
        { 
            Doctors d1 = doctors.get(i); 
            d1.getDoctor_Name(); 
        }
    }

}
