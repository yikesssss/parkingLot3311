package parking;

public class CoveredParkingDecorator extends ParkingSpotDecorator {
	public CoveredParkingDecorator(ParkingSpot decoratedParkingSpot) {
        super(decoratedParkingSpot);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Covered Parking";
    }

}
