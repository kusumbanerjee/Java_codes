import java.util.Scanner;

public class billingSystem {
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);

        System.out.print("Enter the customer name: ");
        String customerName = bill.next();

        System.out.print("Enter the previous month reading: ");
        int previousReading = bill.nextInt();

        System.out.print("Enter the current month reading: ");
        int currentReading = bill.nextInt();

        int units = currentReading - previousReading;
        double amount = calculateAmount(units);

        System.out.println("Customer name: " + customerName);
        System.out.println("Units consumed: " + units);
        System.out.println("Amount due: $" + amount);
    }

    private static double calculateAmount(int units) {
        double amount = 0;
        if (units <= 100) {
            amount = units * 0.5;
        } else if (units <= 200) {
            amount = 100 * 0.5 + (units - 100) * 0.75;
        } else if (units <= 300) {
            amount = 100 * 0.5 + 100 * 0.75 + (units - 200) * 1.20;
        } else if (units > 300) {
            amount = 100 * 0.5 + 100 * 0.75 + 100 * 1.20 + (units - 300) * 1.50;
        }
        return amount;
    }
}
