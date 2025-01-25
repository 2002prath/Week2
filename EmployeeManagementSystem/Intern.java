package AssistedProblems.EmployeeManagementSystem;

public class Intern extends Employee {
    public String disclaimer;

    public Intern(String name,String id,double salary,String message)
    {
        super(name,id,salary);
        this.disclaimer = message;

    }
    public void message()
    {
        System.out.println("Temporary employee, waiting for PPO");
    }
}
