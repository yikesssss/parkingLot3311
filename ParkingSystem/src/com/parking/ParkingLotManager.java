package com.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotManager {
    private static ParkingLotManager instance;
    private List<ParkingSpot> parkingSpots;

    private ParkingLotManager() {
        parkingSpots = new ArrayList<>();
    }

    public static ParkingLotManager getInstance() {
        if (instance == null) {
            instance = new ParkingLotManager();
        }
        return instance;
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
        DatabaseSingleton.getInstance().saveParkingSpot(spot); // Save spot to database
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}

