package Class29;

/*import java.io.*;
import java.util.*;

// Base class
abstract class BankAccount {
    private final String accountId;
    private double balance;

    public BankAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount) throws InvalidAmountException;

    public abstract void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;
}

// SavingsAccount class
class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountId, double balance, double interestRate) {
        super(accountId, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > getBalance()) {
            throw new InsufficientFundsException("Insufficient funds for this transaction.");
        }
        setBalance(getBalance() - amount);
    }

    public void applyInterest() {
        setBalance(getBalance() + (getBalance() * interestRate));
    }
}

// CheckingAccount class
class CheckingAccount extends BankAccount {
    double overdraftLimit;

    public CheckingAccount(String accountId, double balance, double overdraftLimit) {
        super(accountId, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > getBalance() + overdraftLimit) {
            throw new InsufficientFundsException("Insufficient funds for this transaction.");
        }
        setBalance(getBalance() - amount);
    }
}

// Custom Exceptions
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// Main Application
public class BankAccountManagementSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        String inputFilePath = "C:\\GIT\\JavaClassIDB\\src\\Class29\\accounts.csv";
        String outputFilePath = "C:\\Users\\Java Student PC-11\\Desktop\\Java\\updated_accounts.csv";



        // Reading accounts from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length != 4) {
                    System.err.println("Skipping malformed line: " + line);
                    continue; // Skip this malformed line
                }

                try {
                    String id = data[0];
                    String type = data[1];
                    double balance = Double.parseDouble(data[2]);
                    double extra = Double.parseDouble(data[3]);

                    if (type.equalsIgnoreCase("Savings")) {
                        accounts.add(new SavingsAccount(id, balance, extra));
                    } else if (type.equalsIgnoreCase("Checking")) {
                        accounts.add(new CheckingAccount(id, balance, extra));
                    } else {
                        System.err.println("Unknown account type: " + type + " for account " + id);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Skipping invalid number format in line: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading accounts file: " + e.getMessage());
        }

        // Sample Transactions
        try {
            for (BankAccount account : accounts) {
                // Deposit 500
                account.deposit(500);
                // Withdraw 200
                account.withdraw(200);

                // Apply interest for savings accounts
                if (account instanceof SavingsAccount) {
                    ((SavingsAccount) account).applyInterest();
                }
            }
        } catch (Exception e) {
            System.err.println("Transaction error: " + e.getMessage());
        }

        // Writing updated accounts to a file
        String outputFilePath = "";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (BankAccount account : accounts) {
                String type = (account instanceof SavingsAccount) ? "Savings" : "Checking";
                double extra = (account instanceof SavingsAccount)
                        ? ((SavingsAccount) account).interestRate
                        : ((CheckingAccount) account).overdraftLimit;

                writer.write(account.getAccountId() + "," + type + "," + account.getBalance() + "," + extra + "\n");

                System.out.print((account.getAccountId() + "," + type + "," + account.getBalance() + "," + extra + "\n"));

            }
        } catch (IOException e) {
            System.err.println("Error writing accounts file: " + e.getMessage());
        }
    }
}*/