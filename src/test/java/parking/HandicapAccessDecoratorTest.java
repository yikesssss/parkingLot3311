package parking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HandicapAccessDecoratorTest {

	@Test
	void handiCapTest() {
		int id = 33213;
		String location = "B9";
		String parkinglot = "P1";
		ParkingSpot ps = new ParkingSpot(id, location, parkinglot);
		
		HandicapAccessDecorator psd = new HandicapAccessDecorator(ps);
		
		String expected = "Parking Spot ID: " + id + ", Location: " + location + ", Lot: " + parkinglot + ", Handicap Accessible";
		
		assertEquals(expected, psd.getDetails(), "details are incorrect");
	}

}
