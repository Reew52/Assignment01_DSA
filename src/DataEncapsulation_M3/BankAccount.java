package DataEncapsulation_M3;

public class BankAccount {
    private String accountNumber; // only accessible within this class
    private double balance; // only accessible within this class

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
    
    // This method is only accessible within this class and package
    void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    // This method is not accessible from outside this class
    private void setBalance(double balance) {
        this.balance = balance;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Account balance: " + account.getBalance());
        
        // The following code will produce a compilation error because setBalance() method is private
        // account.setBalance(500.0);
        
        // The following code will work because setAccountNumber() method is accessible within the package
        account.setAccountNumber("987654321");
    }
}

