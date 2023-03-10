import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        double budget = 0;
        double expenses = 0;
        boolean running = true;
        while (running) {
       
            System.out.println("Enter a command (budget, expense, balance, quit):");
            String command = money.nextLine();

       
            switch (command) {
                case "budget":
                    System.out.println("Enter your budget:");
                    budget = money.nextDouble();
                    money.nextLine();
                    break;
                case "expense":
                    System.out.println("Enter an expense:");
                    double expense = money.nextDouble();
                    money.nextLine();
                    expenses += expense;
                    break;
                case "balance":
                    double balance = budget - expenses;
                    System.out.println("Budget:  " + budget);
                    System.out.println("Expenses:" + expenses);
                    System.out.println("Balance: " + balance);
                    break;
                case "quit":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
      
    }
}

