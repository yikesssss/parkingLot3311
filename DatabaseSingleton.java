package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DatabaseSingleton {
    private static DatabaseSingleton instance;
    private static final String CSV_FILE_PATH = "parking_spots.csv";  // Path to the CSV file

    private DatabaseSingleton() {
        System.out.println("CSV file-based parking system initialized.");
    }

    public static DatabaseSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseSingleton();
        }
        return instance;
    }

   
    public void saveParkingSpot(ParkingSpot spot) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE_PATH, true))) {
            String record = spot.getId() + "," + spot.getLocation() + "," + spot.getParkingLot();
            writer.write(record);
            writer.newLine();  
			System.out.println("Saved " + spot.toString() + " to the CSV file.");
        } catch (IOException e) {
            System.err.println("Error saving parking spot to CSV: " + e.getMessage());
        }
    }

    public ParkingSpot getParkingSpot(int spotId) {
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String location = data[1];
                String parkingLot = data[2];

                if (id == spotId) {
                    System.out.println("Fetched parking spot: " + location + " - " + parkingLot);
                    return new ParkingSpot(id, location, parkingLot);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from CSV: " + e.getMessage());
        }
        return null; 
    }
}
