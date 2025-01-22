package Access_modifier;

public class Office {
 public static void main(String[] args) {
      Employee ritika = new Employee("01119uh-2e7g","Development",44000);
      ritika.display();       

      Manager kushagra = new Manager("7865-66565","Development",50000);
      kushagra.display1(); 
 }    
} 
class Employee
{ 
  public String employee_id; 
  protected String department; 
  private double salary; 
  private double previous_salary; 
  Employee(String id,String dept,double income)
    { 
     this.salary = income; 
     this.employee_id = id; 
     this.department= dept; 
    } 
    public double modify()
    { 
      salary = previous_salary + salary; 
      return salary;  
    } 
    public void display()
    { 
       System.out.println("Total salary of a person is "+modify()+ "Rs"); 
    }
} 
class Manager extends Employee
{ 
    Manager(String id,String dept,double salary)
    { 
        super(id,dept,salary);  
    } 
    void display1()
    { 
        System.out.println("I have a access of your id----"+employee_id+" and your department --"+department); 
    }
}

