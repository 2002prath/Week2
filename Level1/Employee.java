class Office
{
    public String name;
    public int id;
    private int salary;


    public void display(String name,int id,int salary)
    {
        System.out.println("Name of a employee :" + name );
        System.out.println("Id of an employee :"+ id);
        System.out.println("Salary of an employee "+salary );
    }
}
public class Employee
{
   public static void main(String[] mmg)
   {
       Office e1 = new Office();
       e1.display("Joe",113,800000);

      
   }
}
