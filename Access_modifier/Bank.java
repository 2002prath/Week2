package Access_modifier;

public class Bank {
    public static void main(String[] args) {
        BankAccount pnb = new BankAccount("0898-77667-6676","Pratham Mishra",57000); 
        pnb.deposit(5000);  
        
        SavingsAccount sbi = new SavingsAccount("8989-3232-6763", "Tarun Mishra", 0, 3000);  
        sbi.display(); 
    }
}
class BankAccount
{ 
   public String AccountNumber1; 
   protected String AccountHolder1; 
   private double balance1; 
   private int amount1; 
   BankAccount()
   {
     System.out.println("Welcome to our Bank"); 
   }
   BankAccount(String AccountNumber,String AccountHolder,double balance)
   { 
    this.AccountNumber1 = AccountNumber; 
    this.balance1 =balance; 
    this.AccountHolder1= AccountHolder;  
    
   } 

   public double deposit(int amount)
   {  this.amount1 = amount; 
      balance1 = balance1 + amount1; 
       display();
      return balance1;  
   } 
   public double Withdraw(int amount)
   {  
       this.amount1 = amount; 
      balance1 = balance1 - amount1; 
      display();   
      return balance1;  
   } 
   public void display()
   { 
     System.out.println("Account Holder: "+AccountHolder1); 
     System.out.println("Your current balance is"+ balance1); 
   }
} 
class SavingsAccount extends BankAccount
{   protected double saved_money =0.0; 
    private double Total_saved_money =75000.0; 
    SavingsAccount(String AccountNumber,String AccountHolder,double balance,double saved)
    { 
        super(AccountNumber,AccountHolder, balance); 
        this.saved_money = saved;  
    }   
    
    public double calculate()
    { 
        Total_saved_money = Total_saved_money + saved_money;  
        return Total_saved_money; 
    }
    public void display()
    { 
        System.out.println("Total saved money :"+calculate()); 
    }
}
