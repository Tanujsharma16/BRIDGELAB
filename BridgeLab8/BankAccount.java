class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Bob", 12345, 1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.displayBalance();
    }
}
