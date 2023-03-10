import java.util.ArrayList;
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner acc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<Account>();

        boolean exit = false;
        while (!exit) {
            System.out.println("Select an option:");
            System.out.println("1. Create an account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Display account details");
            System.out.println("5. Exit");
            int choice = acc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = acc.next();
                    System.out.print("Enter your initial deposit: ");
                    double initialDeposit = acc.nextDouble();
                    Account account = new Account(name, initialDeposit);
                    accounts.add(account);
                    System.out.println("Account created with account number: " + account.getAccountNumber());
                    break;
                case 2:
                    System.out.print("Enter your account number: ");
                    int accountNumber = acc.nextInt();
                    account = findAccount(accounts, accountNumber);
                    if (account != null) {
                        System.out.print("Enter the deposit amount: ");
                        double amount = acc.nextDouble();
                        account.deposit(amount);
                        System.out.println("Deposit successful. Current balance: " + account.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter your account number: ");
                    accountNumber = acc.nextInt();
                    account = findAccount(accounts, accountNumber);
                    if (account != null) {
                        System.out.print("Enter the withdrawal amount: ");
                        double amount = acc.nextDouble();
                        if (account.withdraw(amount)) {
                            System.out.println("Withdrawal successful. Current balance: " + account.getBalance());
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter your account number: ");
                    accountNumber = acc.nextInt();
                    account = findAccount(accounts, accountNumber);
                    if (account != null) {
                        System.out.println(account);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static Account findAccount(ArrayList<Account> accounts, int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}

class Account {
    private static int nextAccountNumber = 1;
    private int accountNumber;
    private String name;
    private double balance;

    public Account(String name, double initialDeposit) {
        this.accountNumber = nextAccountNumber++;
        this.name = name;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

