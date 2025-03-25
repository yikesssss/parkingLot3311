package com.parking;


import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a basic parking spot
        ParkingSpot spot = new ParkingSpot(101, "Zone A", "Lot 5");

        System.out.println("You selected: " + spot.getDetails());
        System.out.println("Would you like to add extra features?");
        System.out.println("1. EV Charging");
        System.out.println("2. Handicap Access");
        System.out.println("3. Covered Parking");
        System.out.println("4. No additional features");

        // User selects features
        boolean addingFeatures = true;
        while (addingFeatures) {
            System.out.print("Select an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    spot = new EVChargingDecorator(spot);
                    System.out.println("EV Charging added.");
                    break;
                case 2:
                    spot = new HandicapAccessDecorator(spot);
                    System.out.println("Handicap Access added.");
                    break;
                case 3:
                    spot = new CoveredParkingDecorator(spot);
                    System.out.println("Covered Parking added.");
                    break;
                case 4:
                    addingFeatures = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        System.out.println("Final Parking Spot Details: " + spot.getDetails());
        scanner.close();
    }
}
