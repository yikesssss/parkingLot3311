package booking;

public class BookingSystem implements Observer{
	
	private Subject subject;

    public BookingSystem(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    public void update(Subject changedSubject) {
        if (changedSubject.equals(this.subject)) {
            ParkingSpot spot = (ParkingSpot) subject;
            if (spot.isOccupied()) {
                System.out.println("[BookingSystem] --> Occupied by " + spot.getLicensePlate());
               
            } else {
                System.out.println("[BookingSystem] --> SPOT IS AVAILABLE");
               
            }
        }
    }

}
