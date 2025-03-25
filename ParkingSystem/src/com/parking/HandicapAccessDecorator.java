package com.parking;


	public class HandicapAccessDecorator extends ParkingSpotDecorator {
	    public HandicapAccessDecorator(ParkingSpot decoratedParkingSpot) {
	        super(decoratedParkingSpot);
	    }

	    @Override
	    public String getDetails() {
	        return super.getDetails() + ", Handicap Accessible";
	    }
	}


	
