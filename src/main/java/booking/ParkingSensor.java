package booking;

public class ParkingSensor implements Observer{
	private Subject subject;

    public ParkingSensor(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }
    
    @Override
    public void update(Subject changedSubject) {
        if (changedSubject.equals(this.subject)) {
            ParkingSpot spot = (ParkingSpot) subject;
            if (spot.isOccupied()) {
                System.out.println("[SENSOR]        --> DETECTED CAR WITH LICENSE PLATE: " + spot.getLicensePlate());
            } else {
                System.out.println("[SENSOR]        --> SPOT IS FREE.");
            }
        }
    }
}
