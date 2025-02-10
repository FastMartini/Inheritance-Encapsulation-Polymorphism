/* Diego Martinez | 6401977
Dr. Xian Su
Homework #2
February 10, 2025
*/

class BankAccount {
    // Private fields for account number and balance to enforce encapsulation
    private String accountNumber;
    private double balance;

    // Constructor to initialize account number and starting balance
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber; // Assign the provided account number to the instance variable
        this.balance = initialBalance; // Assign the initial balance to the instance variable
    }

    // Getter method to retrieve the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method to retrieve the balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) { // Ensure the deposit amount is positive
            balance += amount; // Add the deposit amount to the balance
            System.out.println("Deposited: " + amount); // Print confirmation message
        } else {
            System.out.println("Invalid deposit amount."); // Print error message if amount is not valid
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { // Ensure withdrawal amount is positive and within available balance
            balance -= amount; // Subtract the withdrawal amount from the balance
            System.out.println("Withdrew: " + amount); // Print confirmation message
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds."); // Print error message if withdrawal is not possible
        }
    }
}

public class Private_Fields {
    public static void main(String[] args) {
        // Create a new bank account with an initial balance of 1000
        BankAccount myAccount = new BankAccount("12345678", 1000);

        // Deposit 500 into the account
        myAccount.deposit(500);

        // Attempt to withdraw 200 from the account
        myAccount.withdraw(200);

        // Attempt to withdraw an amount greater than the balance
        myAccount.withdraw(2000);

        // Print the final account balance
        System.out.println("Final Balance: " + myAccount.getBalance());
    }
}
