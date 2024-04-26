import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Credit Limit Calculator");
        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            System.out.printf("Customer %d:%n", i);
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();

            System.out.print("Enter balance at the beginning of the month: ");
            int beginningBalance = scanner.nextInt();

            System.out.print("Enter total of all items charged this month: ");
            int totalCharges = scanner.nextInt();

            System.out.print("Enter total of all credits applied this month: ");
            int totalCredits = scanner.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = scanner.nextInt();

            int newBalance = beginningBalance + totalCharges - totalCredits;
            System.out.printf("New balance for account %d: %d%n", accountNumber, newBalance);

            if (newBalance > creditLimit) {
                System.out.printf("Credit limit exceeded for account %d%n", accountNumber);
            }
        }

        scanner.close();
    }
}
