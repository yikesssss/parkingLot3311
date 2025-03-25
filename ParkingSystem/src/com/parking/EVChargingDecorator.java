package com.parking;

public class EVChargingDecorator extends ParkingSpotDecorator {
    public EVChargingDecorator(ParkingSpot decoratedParkingSpot) {
        super(decoratedParkingSpot);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", EV Charging Available";
    }
}
