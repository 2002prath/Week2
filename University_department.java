import java.util.*; 
public class University_department {
    public static void main(String[] args) { 
   
         University un1 = new University("IIT kanpur","1976");   
         
         Department it = new Department("IT","001");
         Department ec = new Department("Electronic Communication","002");
         Department me = new Department("Mechanical Engineering ","003");
         Department civil = new Department("Civil Engineering ","004");
         Department cse = new Department("Computer Science Engineering","005"); 

         un1.add_department(cse);
         un1.add_department(ec);
         un1.add_department(me); 

         Faculty f1 = new Faculty("H C Verma","M.tech",42); 
         Faculty f2 = new Faculty("M K dwidi","PHD",10);  

         me.add_faculty(f1); 
         cse.add_faculty(f2); 

         un1.display();  
           

         //this will show independent entity
         f1.display_faculty(); 
    }
}
class University 
{ 
  public String name; 
  public String foundation_year;  
  public ArrayList<Department> department = new ArrayList<>();  

  public University(String university_name,String university_year)
  { 
     this.name = university_name; 
     this.foundation_year = university_year; 
  }  

  public void add_department(Department dept)
  { 
     department.add(dept); 
  }
  public void display()
  { 
    System.out.println("University Name :"+ name); 
    System.out.println("Foundation year :"+ foundation_year); 
    System.out.println("List of all departments "); 
    for(int i=0;i<department.size();i++) 
    { 
      Department d1  = department.get(i); 
      d1.display_Department_Name(); 
    }  
    System.out.println("\n ============  \n"); 
  }
      
} 
class Department
{  
    private String name; 
    private String id; 
    
    public ArrayList<Faculty> faculty = new ArrayList<>();  

    public Department(String department_name,String department_id)
    { 
        this.name = department_name; 
        this.id = department_id;  
    } 

    public void add_faculty(Faculty f1)
    { 
        faculty.add(f1); 
    } 
    public void  display_Department_Name()
    {   System.out.println("Department :"+name +"\n Department Id :"+id);  
        System.out.println("Total number of faculties :"+faculty.size() ); 
        System.out.println("List of all faculties");
        for(int i=0;i<faculty.size();i++)
        { 
          Faculty f1 = faculty.get(i); 
           f1.display_faculty();  
        }
    } 


} 
class Faculty
{ 
   private String name; 
   private String qualification; 
   private double experience; 

   public Faculty(String faculty_name,String degree,double expertise)
   { 
     this.name = faculty_name; 
     this.qualification = degree; 
     this.experience= expertise;  
   } 
   public void display_faculty()
   {
     System.out.println("Name :"+name); 
     System.out.println("Highest Qualification :"+qualification); 
     System.out.println("Years of experience "+ experience); 

     System.out.println("\n =========================== \n"); 
   }
}