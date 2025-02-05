package EmployeeManagement;

public class FullTimeEmployee extends Employee implements Department {
    public double HouseAllowance;
    public double perks;
    public String departmentName;
    public FullTimeEmployee(String EmployeeId,String EmployeeName,double EmployeeSalary,double HRA,double Benefits)
    {
        super(EmployeeId,EmployeeName,EmployeeSalary);
        this.HouseAllowance = HRA;
        this.perks = Benefits;
    }
    public double calculateSalary()
    {
       return getBaseSalary() + HouseAllowance + perks;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Total salary of an employee :"+ calculateSalary());
        System.out.println("Department Name :"+ getDepartment());
    }


    public void assignDepartment(String Department) {
        this.departmentName = Department;
    }
    public String getDepartment()
    {
        return departmentName;
    }

}
