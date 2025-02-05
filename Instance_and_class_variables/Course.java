package Instance_and_class_variables;

public class Course { 
    private String Course_Name; // instance variable, declared outside of main method and inside of class
    private int duration; //duration in hours
    private double fee;  // fee in rupees

    
    private static String Institute_name;//class variable , includes static keyword   

    

    Course(String Course,int time,double amount)
    {  
        this.Course_Name = Course; 
        this.duration = time; 
        this.fee = amount; 
    }
     
    public void display_CourseDetails()
    { 
        System.out.println("Name of a course :"+Course_Name); 
        System.out.println("Duration of a course :"+duration+"hrs"); 
        System.out.println("Name of a course :"+fee+"Rs"); 
    }
    public static void updateInstitute(String institute)
    {  Institute_name = institute; 
        System.out.println("Institute name is "+Institute_name);   
    }
    
    
    public static void main(String[] args) {
       Course cse = new Course("Sigma",200,5000); 
        cse.display_CourseDetails();  
        updateInstitute("Apna college"); 
    }
}
