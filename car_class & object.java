 import java.util.Scanner;

class LuxuriousCar {
    private String name;
    private int price;
    private int quantity;

    public LuxuriousCar(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Showroom {
    private LuxuriousCar[] inventory;

    public Showroom() {
        inventory = new LuxuriousCar[2];
        inventory[0] = new LuxuriousCar("McLaren GT", 210000, 5);
        inventory[1] = new LuxuriousCar("Aston Martin DB11", 205000, 3);
    }

    public void printInventory() {
        System.out.println("Here are the available cars:");
        for (LuxuriousCar car : inventory) {
            System.out.println("- " + car.getName() + " (Price: $" + car.getPrice() + ") - " + car.getQuantity() + " in stock");
        }
    }

    public LuxuriousCar findCarByName(String name) {
        for (LuxuriousCar car : inventory) {
            if (car.getName().equalsIgnoreCase(name)) {
                return car;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner car = new Scanner(System.in);

        // Create a Showroom object and print the inventory
        Showroom showroom = new Showroom();
        showroom.printInventory();

        // Asking the user which car they want to purchase
        System.out.print("Which car would you like to purchase? Enter the name: ");
        String carName = car.nextLine();

        //  print the purchase confirmation or error message
        LuxuriousCar chosenCar = showroom.findCarByName(carName);
        if (chosenCar != null) {
            if (chosenCar.getQuantity() > 0) {
                System.out.println("Congratulations! You have purchased a " + chosenCar.getName() + " for $" + chosenCar.getPrice() + ".");
                chosenCar.setQuantity(chosenCar.getQuantity() - 1);
         
        } else {
            System.out.println("Sorry, we don't have that car in stock.");
        }

    }
}
}


