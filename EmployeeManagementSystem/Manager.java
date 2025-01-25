package AssistedProblems.EmployeeManagementSystem;

public class Manager extends Employee{
    protected int team_size;

    public Manager(String name,String id,double salary,int team)
    {
        super(name,id,salary);
        this.team_size= team;
    }
    public void team_size()
    {
        System.out.println("Team size of manager "+ name +" is "+ team_size);
    }
}
