// This is the blueprint for an account

public class Account {
    // 1. --- Fields (The Data) ---
    // We use 'private' to protect the data (this is called Encapsulation)
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // 2. --- Constructor (How to create an Account object) ---
    // This method is called when we create a new Account
    public Account(String accNumber, String accHolder) {
        this.accountNumber = accNumber;
        this.accountHolder = accHolder;
        this.balance = 0.0; // Start with a zero balance
    }

    // 3. --- Methods (The Actions) ---

    /**
     * Deposits money into the account.
     * @param amount The amount to deposit (must be positive).
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Cannot deposit a non-positive amount.");
        }
    }

    /**
     * Withdraws money from the account.
     * @param amount The amount to withdraw (must be positive and less than balance).
     */
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

    /**
     * Gets the current account balance.
     * @return The current balance.
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Gets the account holder's name.
     * @return The account holder's name.
     */
    public String getAccountHolder() {
        return this.accountHolder;
    }
}