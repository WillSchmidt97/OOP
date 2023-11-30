import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Map<String, Account> accounts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create an account");
            System.out.println("2. Withdraw");
            System.out.println("3. Update savings account with interest");
            System.out.println("4. Deposit");
            System.out.println("5. Show balance");
            System.out.println("0. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    createAccount(accounts, scanner);
                    break;
                case 2:
                    performWithdrawal(accounts, scanner);
                    break;
                case 3:
                    updateSavingsAccount(accounts, scanner);
                    break;
                case 4:
                    performDeposit(accounts, scanner);
                    break;
                case 5:
                    showBalance(accounts, scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void createAccount(Map<String, Account> accounts, Scanner scanner) {
        System.out.println("Enter the client's name:");
        String client = scanner.nextLine();

        System.out.println("Enter the account number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter the account type (1 for Savings, 2 for Checking):");
        int accountType = scanner.nextInt();
        scanner.nextLine();

        if (accountType == 1) {
            System.out.println("Enter the interest day for the savings account:");
            int interestDay = scanner.nextInt();
            scanner.nextLine();

            accounts.put(accountNumber, new SavingsAccount(client, accountNumber, BigDecimal.ZERO, interestDay));
        } else if (accountType == 2) {
            System.out.println("Enter the overdraft limit for the checking account:");
            BigDecimal overdraftLimit = scanner.nextBigDecimal();
            scanner.nextLine();

            accounts.put(accountNumber, new CheckingAccount(client, accountNumber, BigDecimal.ZERO, overdraftLimit));
        } else {
            System.out.println("Invalid account type.");
        }
    }

    private static void performWithdrawal(Map<String, Account> accounts, Scanner scanner) {
        System.out.println("Enter the account number:");
        String accountNumber = scanner.nextLine();

        if (accounts.containsKey(accountNumber)) {
            System.out.println("Enter the amount to withdraw:");
            BigDecimal amount = scanner.nextBigDecimal();
            scanner.nextLine();

            accounts.get(accountNumber).withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void updateSavingsAccount(Map<String, Account> accounts, Scanner scanner) {
        System.out.println("Enter the savings account number:");
        String accountNumber = scanner.nextLine();

        if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) instanceof SavingsAccount savingsAccount) {

            System.out.println("Enter the interest rate:");
            BigDecimal interestRate = scanner.nextBigDecimal();
            scanner.nextLine();

            savingsAccount.calculateNewBalance(interestRate);
        } else {
            System.out.println("Savings account not found.");
        }
    }

    private static void performDeposit(Map<String, Account> accounts, Scanner scanner) {
        System.out.println("Enter the account number:");
        String accountNumber = scanner.nextLine();

        if (accounts.containsKey(accountNumber)) {
            System.out.println("Enter the amount to deposit:");
            BigDecimal amount = scanner.nextBigDecimal();
            scanner.nextLine();

            accounts.get(accountNumber).deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void showBalance(Map<String, Account> accounts, Scanner scanner) {
        System.out.println("Enter the account number:");
        String accountNumber = scanner.nextLine();

        if (accounts.containsKey(accountNumber)) {
            BigDecimal balance = accounts.get(accountNumber).getBalance();
            System.out.println("Account balance: " + balance);
        } else {
            System.out.println("Account not found.");
        }
    }
}