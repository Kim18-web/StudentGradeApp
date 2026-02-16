import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    String brand;
    String model;
    int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass Car that inherits from Vehicle
class Car extends Vehicle {
    String fuelType;

    // Constructor
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Call Vehicle constructor
        this.fuelType = fuelType;
    }

    // Override displayDetails to include fuel type
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call Vehicle's displayDetails
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Public class Showroom with main method
public class Showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for car details
        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter year of manufacture: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        System.out.print("Enter fuel type: ");
        String fuelType = scanner.nextLine();

        // Create Car object
        Car myCar = new Car(brand, model, year, fuelType);

        // Display car details
        System.out.println("\n--- Car Information ---");
        myCar.displayDetails();

        scanner.close();
    }
}
