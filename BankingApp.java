
import java.util.Scanner; // Import the Scanner to read user input

public class BankingApp {

    public static void main(String[] args) {
        // Create a Scanner object to get input from the console
        Scanner scanner = new Scanner(System.in);
        
        // 1. Create a new bank account
        // We'll hard-code the details for now to keep it simple
        System.out.println("Welcome to the Simple Bank!");
        System.out.print("Please enter your name to create an account: ");
        String name = scanner.nextLine();
        
        // Create an 'instance' of the Account class
        Account myAccount = new Account("123456789", name); 
        System.out.println("Account created for " + myAccount.getAccountHolder() + "!");

        // 2. Create the main application loop
        boolean exit = false; // We use this to control the while loop
        
        while (!exit) {
            // 3. Show the menu
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice (1-4): ");

            // 4. Get the user's choice
            int choice = scanner.nextInt();

            // 5. Handle the choice using a 'switch' statement
            switch (choice) {
                case 1:
                    // Check Balance
                    System.out.println("Your current balance is: $" + myAccount.getBalance());
                    break;
                
                case 2:
                    // Deposit
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount); // Call the method from our Account object
                    break;

                case 3:
                    // Withdraw
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmount); // Call the method from our Account object
                    break;

                case 4:
                    // Exit
                    exit = true; // This will make the 'while' loop stop
                    System.out.println("Thank you for banking with us. Goodbye!");
                    break;

                default:
                    // Handle invalid input
                    System.out.println("Invalid choice. Please try again (1-4).");
                    break;
            }
        }
        
        // Close the scanner to prevent resource leaks
        scanner.close(); 
    }
}