package AssistedProblems.EmployeeManagementSystem;

public class Employee {
    protected String name;
    protected String id;
    protected double salary;

    public Employee(String employee_name,String employee_id,double employee_salary) {
      this.name = employee_name;
      this.id = employee_id;
      this.salary = employee_salary;
    }

        public void display_details() {
        System.out.println("Name of employee " + name);
        System.out.println("ID of an employee" + id);
        System.out.println("Salary of an employee" + salary+"\n");


    }
}
