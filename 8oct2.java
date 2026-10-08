package mentallll;

import java.util.Scanner;

public class sep06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int accountBalance = 70;
        int withdrawalAmount = 25;
        int choice;

        System.out.println("=== WELCOME TO THE ALL-IN-ONE ATM ===");

        do {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. View Current Balance");
            System.out.println("2. Perform Bulk Withdrawals (while loop)");
            System.out.println("3. Exit ATM");
            System.out.print("Enter your choice (1-3): ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + accountBalance);
                    break;

                case 2:
                    System.out.println("\n[Starting automated withdrawals of $" + withdrawalAmount + " each...]");
                    
                    
                    while (accountBalance >= withdrawalAmount) {
                        accountBalance -= withdrawalAmount;
                        System.out.println("Successfully withdrew $" + withdrawalAmount + ". Balance remaining: $" + accountBalance);
                    }
                    
                    System.out.println("Transaction complete. Insufficient funds for another $" + withdrawalAmount + " withdrawal.");
                    break;

                case 3:
                    System.out.println("Thank you for choosing our bank. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid selection! Please enter a number between 1 and 3.");
            }

        } while (choice != 3); 

        scanner.close();
    }
}