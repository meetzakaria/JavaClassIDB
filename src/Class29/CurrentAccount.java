package Class29;

class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 500.0;

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount > getBalance() + OVERDRAFT_LIMIT) {
            throw new InsufficientFundsException("Withdrawal exceeds overdraft limit.");
        }
        super.withdraw(amount);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}