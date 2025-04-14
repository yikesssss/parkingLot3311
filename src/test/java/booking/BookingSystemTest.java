package booking;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookingSystemTest {

    private ParkingSpot spot;
    private BookingSystem booking;

    
 // Booking system is also attached as observer
    @Before
    public void setUp() {
        spot = new ParkingSpot();
        booking = new BookingSystem(spot);
    }

 // Test if booking system notices when spot is taken
    @Test
    public void testBookingSystemUpdatesOnOccupy1() {
        spot.occupySpot("BOOKING1");
        assertTrue(spot.isOccupied());
        assertEquals("BOOKING1", spot.getLicensePlate()); 
    }
    
    @Test
    public void testBookingSystemUpdatesOnOccupy2() {
        spot.occupySpot("BOOKING2");
        assertTrue(spot.isOccupied());
        assertEquals("BOOKING2", spot.getLicensePlate());
    }
    
    @Test
    public void testBookingSystemUpdatesOnOccupy3() {
        spot.occupySpot("BOOKING3");
        assertTrue(spot.isOccupied());
        assertEquals("BOOKING3", spot.getLicensePlate()); 
    }
    
 // Test if booking system notices when spot is freed

    @Test
    public void testBookingSystemUpdatesOnFree1() {
        spot.occupySpot("BOOKING4");
        spot.freeSpot();
        assertFalse(spot.isOccupied());
        assertEquals("", spot.getLicensePlate());
    }
    
    @Test
    public void testBookingSystemUpdatesOnFree2() {
        spot.occupySpot("BOOKING4");
        spot.freeSpot();
        assertFalse(spot.isOccupied());
        assertEquals("", spot.getLicensePlate());
    }
    
    @Test
    public void testBookingSystemUpdatesOnFree3() {
        spot.occupySpot("BOOKING6");
        spot.freeSpot();
        assertFalse(spot.isOccupied());
        assertEquals("", spot.getLicensePlate());
    }
    
    // Occupy, free, and then occupy again should work properly
    @Test
    public void testReoccupySpotAfterFree1() {
        spot.occupySpot("BOOKING7");
        spot.freeSpot();
        spot.occupySpot("BOOKING8");
        assertTrue(spot.isOccupied());
        assertEquals("BOOKING8", spot.getLicensePlate());
    }
    
    @Test
    public void testReoccupySpotAfterFree2() {
        spot.occupySpot("BOOKING9");
        spot.freeSpot();
        spot.occupySpot("BOOKING10");
        assertTrue(spot.isOccupied());
        assertEquals("BOOKING10", spot.getLicensePlate());
    }
    //occupy, free, occupy, then free again
    @Test
    public void testOccupyFreeOccupyFreeAgain1() {
        spot.occupySpot("BOOKING9");
        assertTrue(spot.isOccupied());
        assertEquals("BOOKING9", spot.getLicensePlate());
        spot.freeSpot();
        spot.occupySpot("BOOKING10");
        assertTrue(spot.isOccupied());
        assertEquals("BOOKING10", spot.getLicensePlate());
        spot.freeSpot();
        assertFalse(spot.isOccupied());
        assertEquals("", spot.getLicensePlate());
        
    }
    
    @Test
    public void testOccupyFreeOccupyFreeAgain2() {
        spot.occupySpot("BOOKING11");
        assertTrue(spot.isOccupied());
        assertEquals("BOOKING11", spot.getLicensePlate());
        spot.freeSpot();
        spot.occupySpot("BOOKING12");
        assertTrue(spot.isOccupied());
        assertEquals("BOOKING12", spot.getLicensePlate());
        spot.freeSpot();
        assertFalse(spot.isOccupied());
        assertEquals("", spot.getLicensePlate());
        
    }
    
 
    
}
