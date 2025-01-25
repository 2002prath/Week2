package AssistedProblems.EmployeeManagementSystem;

public class Management {
    public static void main(String[] args) {
       Manager raj = new Manager("Raj Agnihotri","Piramal-013",200000,7);

       Developer naveen = new Developer("Naveen Jha","XPQ-234",55000,"Java");

       Intern somu= new  Intern("Saumaya","XPQ-787",12000,"I am waiting");

       somu.display_details();
       naveen.display_details();
       naveen.lang();
       raj.display_details();
       raj.team_size();
    }
}
