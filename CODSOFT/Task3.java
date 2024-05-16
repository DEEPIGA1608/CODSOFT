import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount +" is deposited successfully and the updated balance is : " + balance);
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return false;
        } else {
            balance -= amount;
            System.out.println(amount +" is Withdrawn successfully and the updated balance is : " + balance);
            return true;
        }
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Exiting. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

public class Task3 {
    public static void main(String[] args) {
        // Creating a bank account with initial balance
        BankAccount userAccount = new BankAccount(1000);

        ATM atm = new ATM(userAccount);

        atm.run();
    }
}
