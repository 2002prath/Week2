import java.util.*; 
public class AccountHolders {
    public static void main(String[] args) { 
        Bank bank = new Bank("City Bank"); 

      Customer c1 = new Customer("XPF230pq","Rohan Chandani"); 
      Customer c2 = new Customer("XPF0923xyz","Meera Chandani"); 
      
        bank.openAccount(c1); 
        bank.openAccount(c2); 
 
        c1.deposit(600); 
        c1.withdraw(300); 
        c1.viewBalance(); 

        bank.displayCustomers();

    }
}
class Bank
{   
  public String name; 
  public ArrayList<Customer> customers = new ArrayList<>(); 
  //Customer c1 = new Customer("ijijj","rohan"); 
  public Bank(String bank_name)
  { 
    this.name = bank_name; 
    
  }
   public void openAccount(Customer customer)
   { 
     customers.add(customer); 
     System.out.println("Account Opened for "+customer.getCustomer_name() ); 
   }
   
   public void displayCustomers() {
    System.out.println("Customers of " + name + " Bank:");
    for (Customer customer : customers) {
        System.out.println("- " + customer.getCustomer_name() + " (ID: " + customer.getCustomer_id() + ")");
    }
}
}
class Customer
{ 
  private String customer_id; 
  private String customer_name; 
  private double  balance=0.0; 
  public double amount; 
   
  public Customer(String id,String name) 
  { 
     this.customer_id = id; 
     this.customer_name = name; 
  } 
   public void setBalance(double balance) {
       this.balance = balance;
   } 
   public double deposit(double money)
   {  this.amount = money; 
      balance = balance + amount; 
      return balance; 
   } 
   public double withdraw(double money)
   {    this.amount = money; 
        if(amount>balance)
         System.out.println("Insufficient balance"); 
         else 
         { 
            balance = balance - amount; 
         }  
         return balance; 
   }
   public void viewBalance() {
        System.out.println("Name  :"+customer_name+"\n balance :"+ balance);
   } 
   public String getCustomer_name() {
       return customer_name;
   }
    public String getCustomer_id() {
        return customer_id;
    }
   
}
