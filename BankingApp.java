
import java.util.Scanner; 
public class BankingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Simple Bank!");
        System.out.print("Please enter your name to create an account: ");
        String name = scanner.nextLine();
        
        Account myAccount = new Account("123456789", name); 
        System.out.println("Account created for " + myAccount.getAccountHolder() + "!");  
        boolean exit = false; 
        
        while (!exit) {
            
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    
                    System.out.println("Your current balance is: $" + myAccount.getBalance());
                    break;
                
                case 2:        
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount); 
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmount); 
                    break;

                case 4:
                    exit = true; 
                    System.out.println("Thank you for banking with us. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again (1-4).");
                    break;
            }
        }
        
        // Close the scanner to prevent resource leaks
        scanner.close(); 
    }

}
