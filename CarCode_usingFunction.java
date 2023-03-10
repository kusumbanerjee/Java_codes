public class Thar {
    public static void main(String[] args) {
        // Call the function to display Mahindra Thar details
        MahindraThar();
    }

    public static void MahindraThar() {
        // Declare and initialize variables with Mahindra Thar details
        String modelName = "Mahindra Thar";
        String fuelType = "Diesel";
        String engineCapacity = "2.2 L";
        int maxPower = 130;
        int maxTorque = 300;
        int seatingCapacity = 4;
        String transmissionType = "6-speed manual or 6-speed automatic";
        double fuelTankCapacity = 57.0;
        double mileage = 15.2;

        // Display the Mahindra Thar details to the console
        System.out.println("Mahindra Thar Details:");
        System.out.println(" ");
        System.out.println("Model Name: " + modelName);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Engine Capacity: " + engineCapacity);
        System.out.println("Maximum Power: " + maxPower + " bhp");
        System.out.println("Maximum Torque: " + maxTorque + " Nm");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
        System.out.println("Mileage: " + mileage + " km/l");
    }
}


