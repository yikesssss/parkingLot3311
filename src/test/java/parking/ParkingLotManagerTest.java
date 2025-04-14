package parking;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParkingLotManagerTest {

//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//	}
	
//	ask it to create many it will return only one
	@Test		
	void testGetInstance() {
		
		ParkingLotManager plm = ParkingLotManager.getInstance();
		
		ParkingLotManager plm2 = ParkingLotManager.getInstance();
		
		assertSame(plm, plm2);

	}
	
	@Test
	void testAddPk() {
		
		ParkingLotManager manager = ParkingLotManager.getInstance();
		ParkingSpot ps = new ParkingSpot(3290, "B2", "P1");
		
		manager.addParkingSpot(ps);
		
		List<ParkingSpot> expectedSpot = manager.getParkingSpots();
		
		assertTrue(expectedSpot.contains(ps));
		
	}
	
	@Test
	void testReturnPklist() {
		
	}
}
