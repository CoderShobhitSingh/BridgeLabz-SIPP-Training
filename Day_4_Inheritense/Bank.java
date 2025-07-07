package Day_4_Inheritense;

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int depositTermMonths;

    FixedDepositAccount(String accountNumber, double balance, int depositTermMonths) {
        super(accountNumber, balance);
        this.depositTermMonths = depositTermMonths;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Deposit Term: " + depositTermMonths + " months");
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount generalAccount = new BankAccount("123456789", 5000);
        generalAccount.displayDetails();
        generalAccount.displayAccountType();
        System.out.println();

        SavingsAccount savingsAccount = new SavingsAccount("987654321", 10000, 4.5);
        savingsAccount.displayDetails();
        savingsAccount.displayAccountType();
        System.out.println();

        CheckingAccount checkingAccount = new CheckingAccount("456789123", 20000, 15000);
        checkingAccount.displayDetails();
        checkingAccount.displayAccountType();
        System.out.println();

        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("321654987", 30000, 12);
        fixedDepositAccount.displayDetails();
        fixedDepositAccount.displayAccountType();
    }
}
