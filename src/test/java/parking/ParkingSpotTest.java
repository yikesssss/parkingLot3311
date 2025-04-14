package parking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParkingSpotTest {

	@Test
	void idTest() {
		int id = 33213;
		String location = "B9";
		String parkinglot = "P1";
		ParkingSpot ps = new ParkingSpot(id, location, parkinglot);
		assertEquals(id, ps.getId(), "getId() should return the correct id");
	}
	
	@Test
	void locationTest() {
		int id = 33213;
		String location = "B9";
		String parkinglot = "P1";
		ParkingSpot ps = new ParkingSpot(id, location, parkinglot);
		assertEquals(location, ps.getLocation(), "getLocation() should return the correct id");
	}
	
	@Test
	void parkingTest() {
		int id = 33213;
		String location = "B9";
		String parkinglot = "P1";
		ParkingSpot ps = new ParkingSpot(id, location, parkinglot);
		assertEquals(parkinglot, ps.getParkingLot(), "getParkingLot() should return the correct id");
	}
	
	@Test
	void parkingDetails() {
		int id = 33213;
		String location = "B9";
		String parkinglot = "P1";
		ParkingSpot ps = new ParkingSpot(id, location, parkinglot);
		assertEquals("Parking Spot ID: " + id + ", Location: " + location + ", Lot: " + parkinglot, ps.getDetails(), "incorrect details");
	}
	

}
