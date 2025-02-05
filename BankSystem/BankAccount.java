package BankSystem;

public abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    private double depositMoney;

    public BankAccount(String accountNumber,String holderName)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    abstract double calculateInterest();

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public double deposit(double amount)
    {
        this.depositMoney = amount;
        balance = balance + depositMoney;
        return balance;
    }
    public double withdrawal(double amount)
    {
        this.depositMoney = amount;
        balance = balance - depositMoney;
        return balance;
    }
    public void display()
    {
        System.out.println("Account Number :"+ accountNumber);
        System.out.println("Holder Name :"+ holderName);

    }

}
