package parking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CoveredParkingDecoratorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void coveredTest() {
		int id = 33213;
		String location = "B9";
		String parkinglot = "P1";
		ParkingSpot ps = new ParkingSpot(id, location, parkinglot);
		
		CoveredParkingDecorator psd = new CoveredParkingDecorator(ps);
		
		String expected = "Parking Spot ID: " + id + ", Location: " + location + ", Lot: " + parkinglot + ", Covered Parking";
		
		assertEquals(expected, psd.getDetails(), "details are incorrect");
	}
	
	@Test
	void evTest() {
		int id = 33213;
		String location = "B9";
		String parkinglot = "P1";
		ParkingSpot ps = new ParkingSpot(id, location, parkinglot);
		
		EVChargingDecorator psd = new EVChargingDecorator(ps);
		
		String expected = "Parking Spot ID: " + id + ", Location: " + location + ", Lot: " + parkinglot + ", EV Charging Available";
		
		assertEquals(expected, psd.getDetails(), "details are incorrect");
	}
	
	

}
