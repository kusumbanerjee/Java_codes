import java.util.Scanner;

public class coupe {
3  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // list of available luxurious coupe cars

        System.out.println("Available luxurious coupe cars:");
        System.out.println("    ");
        System.out.println("1. McLaren GT");
        System.out.println("2. Aston Martin DB11");
        System.out.println("3. Mercedes-Benz S-Class Coupe");
        System.out.println("4. BMW 8 Series Coupe");
        System.out.println("5. Audi A7");
        System.out.println("6. Lexus LC 500");

        // choosing a car from the list

        System.out.print("Choose a car by entering a number (1-6): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // the details of the chosen car

        if (choice == 1) {
            System.out.println("Make: McLaren");
            System.out.println("Model: GT");
            System.out.println("Body style: Coupe");
            System.out.println("Luxury level: High");
            System.out.println("Year: 2022");
            System.out.println("Price: $210,000");
        } else if (choice == 2) {
            System.out.println("Make: Aston Martin");
            System.out.println("Model: DB11");
            System.out.println("Body style: Coupe");
            System.out.println("Luxury level: High");
            System.out.println("Year: 2022");
            System.out.println("Price: $205,000");
        } else if (choice == 3) {
            System.out.println("Make: Mercedes-Benz");
            System.out.println("Model: S-Class Coupe");
            System.out.println("Body style: Coupe");
            System.out.println("Luxury level: High");
            System.out.println("Year: 2022");
            System.out.println("Price: $130,150");
        } else if (choice == 4) {
            System.out.println("Make: BMW");
            System.out.println("Model: 8 Series Coupe");
            System.out.println("Body style: Coupe");
            System.out.println("Luxury level: High");
            System.out.println("Year: 2023");
            System.out.println("Price: $87,900");
        } else if (choice == 5) {
            System.out.println("Make: Audi");
            System.out.println("Model: A7");
            System.out.println("Body style: Coupe");
            System.out.println("Luxury level: Medium");
            System.out.println("Year: 2022");
            System.out.println("Price: $70,400");
        } else if (choice == 6) {
            System.out.println("Make: Lexus");
            System.out.println("Model: LC 500");
            System.out.println("Body style: Coupe");
            System.out.println("Luxury level: High");
            System.out.println("Year: 2021");
            System.out.println("Price: $92,950");
        } else {
            System.out.println("Invalid choice. Please choose a number between 1 and 6.");
        }

        scanner.close();
    }
}



