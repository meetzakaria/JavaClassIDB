package Class29;

import java.io.*;
import java.util.*;

public class BankAccountManagement {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        try {
            accounts = readAccountsFromFile("C:\\GIT\\JavaClassIDB\\src\\Class29\\accounts.csv");

            accounts.get(0).deposit(500);
            accounts.get(1).withdraw(1000);

            writeAccountsToFile("C:\\GIT\\JavaClassIDB\\src\\Class29\\updated_accounts.csv", accounts);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static List<BankAccount> readAccountsFromFile(String fileName) throws IOException {
        List<BankAccount> accounts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String type = parts[1];
                double balance = Double.parseDouble(parts[2]);
                double interestRate = Double.parseDouble(parts[3]);

                if (type.equalsIgnoreCase("Savings")) {
                    accounts.add(new SavingsAccount(id, balance, interestRate));
                } else if (type.equalsIgnoreCase("Checking")) {
                    accounts.add(new CurrentAccount(id, balance));
                }
            }
        }
        return accounts;
    }

    public static void writeAccountsToFile(String fileName, List<BankAccount> accounts) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (BankAccount account : accounts) {
                bw.write(account.getAccountNumber() + "," +
                        (account instanceof SavingsAccount ? "Savings" : "Checking") + "," +
                        account.getBalance() + "," +
                        (account instanceof SavingsAccount ? ((SavingsAccount) account).calculateInterest() : 0));
                bw.newLine();
            }
        }
    }
}
