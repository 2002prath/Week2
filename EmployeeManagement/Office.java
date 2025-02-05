package EmployeeManagement;

public class Office {
    public static void main(String[] args) {
        FullTimeEmployee rohan = new FullTimeEmployee("XP120", "Rohan Chandani", 55000, 20000, 10000);
            rohan.assignDepartment("IT");
            rohan.displayDetails();

    }
}
