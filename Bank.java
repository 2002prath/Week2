package Access_modifier;

public class Bank {
    public static void main(String[] args) {
        BankAccount pnb3 = new BankAccount("0898-77667-6676","Pratham Mishra",57000); 
        pnb3.deposit(5000);  
        
        BankAccount pnb1 = new BankAccount("0898-77667-6676","Pratham Mishra",57000); 
        pnb1.deposit(5000);   

        BankAccount pnb2 = new BankAccount("0898-77667-6676","Pratham Mishra",57000); 
        pnb2.deposit(5000);   

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
    public static String Bank_name;  
    private static int TotalAccount=0; 
    
   BankAccount()
   {
     System.out.println("Welcome to our Bank"); 
     TotalAccount++; 
   }
   BankAccount(String AccountNumber,String AccountHolder,double balance)
   { 
       this.AccountNumber1 = AccountNumber; 
       this.balance1 =balance; 
       this.AccountHolder1= AccountHolder;  
    }   
    
    
    public static int getTotalAccount()
    { 
        return TotalAccount; 
    }
    
      public double deposit(int amount)
    {  this.amount1 = amount; 
        balance1 = balance1 + amount1; 
        display();
        return balance1;  
    } 
    //System.out.println("Total number of bank accounts we have "+ getTotalAccount()); 
   public double Withdraw(int amount)
   {  
       this.amount1 = amount; 
      balance1 = balance1 - amount1; 
      display();   
      return balance1;  
   }  
   
   public void display()
   { 
     System.out.println("Account Holder: "+AccountHolder1+"\n");  
     System.out.println("Your current balance is"+ balance1+"\n"); 
   }
public String getAccountNumber1() {
    return AccountNumber1;
}
public void setAccountNumber1(String accountNumber1) {
    AccountNumber1 = accountNumber1;
}
public String getAccountHolder1() {
    return AccountHolder1;
}
public void setAccountHolder1(String accountHolder1) {
    AccountHolder1 = accountHolder1;
}
public double getBalance1() {
    return balance1;
}
public void setBalance1(double balance1) {
    this.balance1 = balance1;
}
public int getAmount1() {
    return amount1;
}
public void setAmount1(int amount1) {
    this.amount1 = amount1;
}
public static String getBank_name() {
    return Bank_name;
}
public static void setBank_name(String bank_name) {
    Bank_name = bank_name;
}
public static void setTotalAccount(int totalAccount) {
    TotalAccount = totalAccount;
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
