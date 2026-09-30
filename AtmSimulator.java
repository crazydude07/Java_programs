import java.util.Scanner;   
public class AtmSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double balance = 10000.00;
        int pin = 1234, enteredPin, attempts = 0;
        do {
            System.out.print("Enter your PIN: ");
            enteredPin = sc.nextInt();
            attempts++;
            if (enteredPin == pin) {
                do {
                    System.out.println("ATM Menu:");
                    System.out.println("1. Check Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = sc.nextDouble();
                            if (depositAmount > 0) {
                                balance += depositAmount;
                                System.out.println("Deposit successful.");
                            } else {
                                System.out.println("Invalid deposit amount.");
                            }
                            break;
                        case 2:
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = sc.nextDouble();
                            if (withdrawAmount > 0 && withdrawAmount <= balance) {
                                balance -= withdrawAmount;
                                System.out.println("Withdrawn successfully.");
                            } else {
                                System.out.println("Insufficient balance or invalid amount.");
                            }
                            break;
                        case 3:
                            System.out.println("Current balance: " + balance);
                            break;
                        case 4:
                            System.out.println("Thank you for using the ATM simulator. Goodbye!");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } while (choice != 4);
            } else {
                System.out.println("Incorrect PIN. Attempts left: " + (3 - attempts));
            }
        } while (attempts < 3);
        if (attempts == 3 && enteredPin != pin) {
            System.out.println("Too many incorrect attempts. Card blocked.");
        }
        sc.close();
    }
}
