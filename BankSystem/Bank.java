package BankSystem;

public class Bank {
    public static void main(String[] args) {
        SavingsAccount sbi = new SavingsAccount("920-920-330","Tarun Mishra");
        sbi.setBalance(55000);
        sbi.setPrincipal(25000);
        sbi.setRate(15);
        sbi.setTime(3);
        sbi.askforloan(true);
        sbi.calculateInterest();
        sbi.display();
        System.out.println("************************************");
        System.out.println("Hello");
    }
}
