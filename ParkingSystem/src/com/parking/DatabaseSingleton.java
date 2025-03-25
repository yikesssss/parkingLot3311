package com.parking;

import java.io.*;
import java.util.*;

public class DatabaseSingleton {
    private static DatabaseSingleton instance;
    private static final String CSV_FILE_PATH = "parking_spots.csv";  // Path to the CSV file

    private DatabaseSingleton() {
        // No need to initialize DB connection, we are working with CSV files
        System.out.println("CSV file-based parking system initialized.");
    }

    public static DatabaseSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseSingleton();
        }
        return instance;
    }

    // Simulate saving a parking spot to the CSV file
    public void saveParkingSpot(ParkingSpot spot) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE_PATH, true))) {
            // Format: id, location, parking_lot
            String record = spot.getId() + "," + spot.getLocation() + "," + spot.getParkingLot();
            writer.write(record);
            writer.newLine();  // Add new line after each record
            System.out.println("Saved " + spot.getDetails() + " to the CSV file.");
        } catch (IOException e) {
            System.err.println("Error saving parking spot to CSV: " + e.getMessage());
        }
    }

    // Simulate retrieving a parking spot from the CSV file
    public ParkingSpot getParkingSpot(int spotId) {
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String location = data[1];
                String parkingLot = data[2];

                // If spot ID matches, return a new ParkingSpot
                if (id == spotId) {
                    System.out.println("Fetched parking spot: " + location + " - " + parkingLot);
                    return new ParkingSpot(id, location, parkingLot);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from CSV: " + e.getMessage());
        }
        return null;  // Return null if spot is not found
    }
}
