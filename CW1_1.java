package Week_2;

import Week_2.BankAccount;

/**
 * This is the coursework helper file. Do not,
 *
 * i) rename the file.
 * ii) edit the file.
 *
 * @author Dr. Robert Lyon
 *
 */
public class CW1_1
{
    /**
     * Main entry point to the application.
     *
     * @param args unused command line arguments.
     */
    public static void main(String[] args)
    {
        // Create the account.
        BankAccount b = new BankAccount();

        // Populate it's class variables.
        b.setAccountNumber(200001);
        b.setSortcode("10-10-10");
        b.setBalance(0.0f);

        b.deposit(1000.0f);
        System.out.println(b.summarise()); // Print account update.
        b.withdraw(100.0f);
        System.out.println(b.summarise()); // Print account update.
        b.deposit(1000.0f);
        System.out.println(b.summarise()); // Print account update.

        System.out.println("\nChecking getter mnethods...");
        System.out.println("Account num: " + b.getAccountNumber());
        System.out.println("Sortcode: " + b.getSortcode());
        System.out.println("Balance: " + b.getBalance());
    }
}