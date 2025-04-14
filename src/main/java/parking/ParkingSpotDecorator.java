package parking;

public abstract class ParkingSpotDecorator extends ParkingSpot{
	protected ParkingSpot decoratedParkingSpot;

    public ParkingSpotDecorator(ParkingSpot decoratedParkingSpot) {
        super(decoratedParkingSpot.getId(), decoratedParkingSpot.getLocation(), decoratedParkingSpot.getParkingLot());
        this.decoratedParkingSpot = decoratedParkingSpot;
    }

    @Override
    public String getDetails() {
        return decoratedParkingSpot.getDetails();
    }

}
