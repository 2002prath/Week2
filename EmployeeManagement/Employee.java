package EmployeeManagement;

abstract class Employee {
    private String id;
    private String name;
    private double baseSalary;

    public Employee(String EmployeeId,String EmployeeName,double EmployeeSalary)
    {
       this.id = EmployeeId;
       this.name = EmployeeName;
       this.baseSalary = EmployeeSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails()
    {
        System.out.println("Name of an employee :"+ name);
        System.out.println("ID of an employee :"+ id);
        System.out.println("Salary of an employee :"+ baseSalary);
    }

    public void setId(String id)
    {
        this.id= id;
    }

    public String getId() {
        return id;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
