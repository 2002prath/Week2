package EmployeeManagement;

 class PartTimeEmployee extends  Employee implements Department{
     public String departmentName;
    public PartTimeEmployee(String EmployeeId,String EmployeeName,double EmployeeSalary)
    {
        super(EmployeeId,EmployeeName,EmployeeSalary);

    }

    public double calculateSalary()
    {
        return getBaseSalary();
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
