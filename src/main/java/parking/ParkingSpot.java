package parking;

public class ParkingSpot {
	private int id;
    private String location;
    private String parkingLot;

    public ParkingSpot(int id, String location, String parkingLot) {
        this.id = id;
        this.location = location;
        this.parkingLot = parkingLot;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getParkingLot() {
        return parkingLot;
    }

    public String getDetails() {
        return "Parking Spot ID: " + id + ", Location: " + location + ", Lot: " + parkingLot;
    }
}
