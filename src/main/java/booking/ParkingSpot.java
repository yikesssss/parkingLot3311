package booking;

public class ParkingSpot extends Subject {
    private boolean occupied = false;
    private String licensePlate = "";

    public void occupySpot(String licensePlate) {
        if (this.occupied) {
            System.out.println("Error: Spot is already occupied.");
            return;
        }
        
        if (licensePlate.trim().isEmpty()) {
            throw new IllegalArgumentException("License plate must not be null or empty.");
        }
        
        this.occupied = true;
        this.licensePlate = licensePlate;
        notifyObservers(); 
    }


    public void freeSpot() {
        this.occupied = false;
        this.licensePlate = "";
        notifyObservers();
    }

    public boolean isOccupied() {
        return occupied;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}