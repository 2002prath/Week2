import java.util.*; 
public class Corporate {
     public static void main(String[] args) {
          
       Company Google = new Company("Google");
       
       Department Ai = new Department("Artificial Intelligence"); 
       Department software = new Department("Software Engineer"); 
       Department peon = new Department("Peon");  
       
       Employee aman = new Employee("Aman Khan","XPF023","Senior Developer"); 
       Employee abhinash = new Employee("Abhinash Shukla","XPF026","Chat-bot Developer"); 
       Employee naveen = new Employee("Naveen Jha","SuF023","Sweeper"); 
       Employee ritika = new Employee("Ritika ","XPF023","SDE-2"); 
       Employee ankit=new Employee("Ankit raj","XXL309","Senior software Engineer"); 
       
       Google.add_department(Ai);
       Google.add_department(software);
       Google.add_department(peon); 

       Ai.add_employee(aman);
       Ai.add_employee(abhinash); 
       software.add_employee(ankit);   
       software.add_employee(ritika); 
       peon.add_employee(naveen);  

       Google.display_company(); 

       Google.terminate_company(); 
       
    }
}  
class Company
{  public String name;  
    public ArrayList<Department> dept = new ArrayList<>(); 
    
    public Company(String company_name)
    { 
        this.name = company_name; 
    }
    public void add_department(Department dept1)
    {  
      dept.add(dept1); 
    } 
    public void display_company()
    { 
        System.out.println("Company Name : "+name+"\n"+"\n It has following departments"); 
         for(int i=0;i<dept.size();i++)
         { 
            Department d1 = dept.get(i); 
            d1.display_dept();
         } 
    } 
    public void terminate_company()
    { 
        System.out.println("We are closing company because of irresponsibility of employee "); 
        dept.clear(); 
        System.out.println("Whole company is closed, please kisi aur company ko barbaad  kare"); 
    }
}
class Department
{  public String name; 
   public ArrayList<Employee> emp = new ArrayList<>();  

   public Department(String dept_name)
   { 
     this.name = dept_name; 
   } 
   public void add_employee(Employee employ)
   { 
     emp.add(employ); 
   } 
   public void display_dept()
   { 
     System.out.println(name+" department :"+"\n"); 
      for(int i=0;i<emp.size();i++)
      { 
         Employee e1 = emp.get(i); 
         e1.display(); 
      } 
   }

} 
class Employee
{ 
    private String name; 
    private String id; 
    private String role; 
     
    public Employee(String emp_name,String emp_id,String emp_role)
    { 
        this.name = emp_name; 
        this.id = emp_id; 
        this.role = emp_role;  
    } 
    // public String getName()
    // { 
    //     return name; 
    // } 
    // public String getid()
    // { 
    //     return id; 
    // } 
    // public String getrole()
    // { 
    //     return role; 
    // }
    public void display()
    { 
        System.out.println("Name of employee :=="+name); 
        System.out.println("Id of employee :=="+id);
        System.out.println("Role of an employee :=="+ role+"\n ===== \n");   
    }
}       
