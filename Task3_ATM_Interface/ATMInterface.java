import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount(20000.0);

        int option;

        do {
            System.out.println("\n=== WELCOME TO ATM ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println(" Your current Balance: ₹" + account.checkBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    account.deposit(input.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter amount to withdrawal: ₹");
                    account.withdraw(input.nextDouble());
                    break;

                case 4:
                    System.out.println("Exiting... Thank you for banking with us!.");
                    break;

                default:
                    System.out.println("Invalid selection. Try again.");
            }

        } while (option != 4);

        input.close();
    }
}
 class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double checkBalance() {
        return balance;
    }
}
