import java.util.Scanner; 
public class ATM {
    public static void main(String[] mmg)
    { 
        int amount =0; 
        Scanner sc = new Scanner(System.in); 
      
      System.out.println("Welcome to HCBC Bank \nYour choice , our responsibility");
      
      System.out.println("Enter your account number"); 
      String account_number = sc.next(); 
      
       Bank customer = new Bank(account_number,amount);   
       System.out.println(); 
       
       System.out.println("choose service: \n 1. Deposit amount \n2. Withdrawal amount \n3. Check balance"); 
       String service =sc.nextLine(); 
         if(service.equals("Deposit amount")) 
         {
             System.out.println("Enter amount"); 
               amount = sc.nextInt(); 
             customer.Deposit(); 
         }
         else if(service.equals("Withdraw"))
         {  System.out.println("Enter amount"); 
             amount = sc.nextInt();  
            customer.Withdraw(); 
         }   
          else 
          customer.Balance(); 
        
         customer.Display(); 
       System.out.println("Thank you for choosing our services, we hope you like it");  
       System.out.println("IF you don't like , I don't care"); 
       sc.close(); 
    }
}
class Bank 
{ 
   private String account_number; 
   //private String account_holder; 
   private int balance_amount =10000; 
   private int amount; 
 
     Bank(String account_number,int amount )
    {  
        this.account_number = account_number; 
        this.amount = amount; 
    }

   public void Deposit()
   { 
      balance_amount = balance_amount + amount ;
      Balance();  
   }
   
   public void Withdraw()
   { 
      if(amount<= balance_amount)
         balance_amount = balance_amount - amount; 
      else 
         System.out.println("Insufficient balance");
         
         Balance(); 
   }
   
   public void Balance()
    { 
      System.out.println(" Your Current Balance is "+ balance_amount); 
    }
     public void Display()
     { 
        System.out.println("Account number :"+account_number);  
        System.out.println("Your current balance is"+ balance_amount); 
     }   

}
