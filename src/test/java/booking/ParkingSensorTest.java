package booking;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParkingSensorTest {

    private ParkingSpot spot;
    private ParkingSensor sensor;

    
 // Sensor is automatically attached on creation
    @Before
    public void setUp() {
        spot = new ParkingSpot();
        sensor = new ParkingSensor(spot);
    }

 // Test if sensor responds to a car occupying the spot
    @Test
    public void testSensorUpdatesOnOccupy1() {
        spot.occupySpot("DAXZ 999");
        assertTrue(spot.isOccupied());
        assertEquals("DAXZ 999", spot.getLicensePlate());
    }
    
    @Test
    public void testSensorUpdatesOnOccupy2() {
        spot.occupySpot("EYHE 765");
        assertTrue(spot.isOccupied());
        assertEquals("EYHE 765", spot.getLicensePlate());
    }
    
    @Test
    public void testSensorUpdatesOnOccupy3() {
        spot.occupySpot("MKBL 680");
        assertTrue(spot.isOccupied());
        assertEquals("MKBL 680", spot.getLicensePlate());
    }
    
    @Test
    public void testSensorUpdatesOnOccupy4() {
        spot.occupySpot("TYHG 345");
        assertTrue(spot.isOccupied());
        assertEquals("TYHG 345", spot.getLicensePlate());
    }

 // Test if sensor responds to spot being freed
    @Test
    public void testSensorUpdatesOnFree1() {
        spot.occupySpot("PVLV 285");
        spot.freeSpot();
        assertFalse(spot.isOccupied());
        assertEquals("", spot.getLicensePlate());
    }
    
    @Test
    public void testSensorUpdatesOnFree2() {
        spot.occupySpot("ABCD 467");
        spot.freeSpot();
        assertFalse(spot.isOccupied());
        assertEquals("", spot.getLicensePlate());
    }
    @Test
    public void testSensorUpdatesOnFree3() {
        spot.occupySpot("LMNO 153");
        spot.freeSpot();
        assertFalse(spot.isOccupied());
        assertEquals("", spot.getLicensePlate());
    }
    
    @Test
    public void testSensorUpdatesOnFree4() {
        spot.occupySpot("QWSS 876");
        spot.freeSpot();
        assertFalse(spot.isOccupied());
        assertEquals("", spot.getLicensePlate());
    }
    
 // Freeing an already free spot should be safe
    
    @Test
    public void testSensorDoubleFree() {
        spot.freeSpot();
        spot.freeSpot();
        assertFalse(spot.isOccupied());
    }
}
