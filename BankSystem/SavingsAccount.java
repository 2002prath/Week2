package BankSystem;

public class SavingsAccount extends BankAccount implements Loneable{
     protected double interest;
     protected double rate;
     protected double time;
     private double principal;
     protected  boolean confirm;
    public SavingsAccount(String accountNumber,String holderName)
    {
        super(accountNumber,holderName);
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }
    public void askforloan(boolean ask)
    {
        this.confirm = ask;
    }
    public boolean applyforLoan()
    {
        if(confirm) {
            return true;
        }
         else
             return false;
    }

            public boolean calculateLoanEligibility()
            {
               if(getPrincipal()>12000)
                   return true;
               else
                  return  false;
            }
    public double calculateInterest()
     {
         interest = (getPrincipal()*getTime()*getRate())/100;
         return interest;
     }

     public void display()
     {
         super.display();
         System.out.println("Loan Eligibility "+ calculateLoanEligibility());
         System.out.println("Total interest for "+ getPrincipal()+ " rupees is "+ calculateInterest());

     }
}
