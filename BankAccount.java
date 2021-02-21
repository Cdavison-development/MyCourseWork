package Week_2;

public class BankAccount {



        // sets the balance as a float and to $100
        private float balance = 0;
        //sets the account number to the integer 10000
        private int accountNumber = 0;
        //sets the sort code to the string 00-00-00
        private String Sortcode = "";


        //allows the user to deposit money to their balance
    public void deposit(float amount) {
        this.balance = +amount;
    }

    //allows the user to withdraw money from their balance
    public void withdraw(float amount) {
        this.balance = -amount;
    }
    //returns balance, sortcode and account number
    public String summarise() {
        return "ACC.Num: " + accountNumber + "Sort: " + Sortcode + "Balance: " + balance;
    }

    // allows the user to set their balance to an exact amount
    public void setBalance(float b) {
        this.balance = b;
    }
    // allows the user to set their account number
    public void setAccountNumber(int n) {
        this.accountNumber = n;
    }
    // allows the user to set their sort code
    public void setSortcode(String s) {
        this.Sortcode = s;
    }
    // returns the user the balance float
    public float getBalance(){
        return balance;
    }
    // returns the user the AccountNumber int
    public int getAccountNumber() {
        return accountNumber;
    }
    // returns the user the Sortcode String
    public String getSortcode() {
        return Sortcode;
    }
}

