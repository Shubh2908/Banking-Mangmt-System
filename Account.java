public class Account {
    
    private String accountNumber;
    private String accountHolder;
    private double balance;

   
    public Account(String accNumber, String accHolder) {
        this.accountNumber = accNumber;
        this.accountHolder = accHolder;
        this.balance = 0.0; 
    }
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Cannot deposit a non-positive amount.");
        }
    }  
    public void withdraw(double amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance = this.balance - amount;
                System.out.println("Successfully withdrew: $" + amount);
            } else {
                System.out.println("Insufficient funds. Your balance is: $" + this.balance);
            }
        } else {
            System.out.println("Cannot withdraw a non-positive amount.");
        }
    }   
    public double getBalance() {
        return this.balance;
    }
    public String getAccountHolder() {
        return this.accountHolder;
    }
}
