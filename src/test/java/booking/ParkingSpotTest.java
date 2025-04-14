package booking;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParkingSpotTest {

    private ParkingSpot spot;

    @Before
    public void setUp() {
        spot = new ParkingSpot();
    }

    
 // Test if occupying a spot sets the state and plate correctly
    @Test
    public void testOccupySpot1() {
        spot.occupySpot("QWCW 123");
        assertTrue(spot.isOccupied());
        assertEquals("QWCW 123", spot.getLicensePlate());
    }
    
    @Test
    public void testOccupySpot2() {
        spot.occupySpot("DGTR 123");
        assertTrue(spot.isOccupied());
        assertEquals("DGTR 123", spot.getLicensePlate());
    }

 // Test if freeing a spot resets the state and plate
    @Test
    public void testFreeSpot1() {
        spot.occupySpot("WXYZ 123");
        spot.freeSpot();
        assertFalse(spot.isOccupied());
        assertEquals("", spot.getLicensePlate());
    }
    
    @Test
    public void testFreeSpot2() {
        spot.occupySpot("WXYZ 123");
        spot.freeSpot();
        assertFalse(spot.isOccupied());
        assertEquals("", spot.getLicensePlate());
    }

    
    // Can't Occupying a spot that's already occupied
    @Test
    public void testOccupyAlreadyOccupiedSpot1() {
        spot.occupySpot("FIRSTCAR");
        spot.occupySpot("SECONDCAR");  // Should NOT overwrite
        assertEquals("FIRSTCAR", spot.getLicensePlate());  // Assert it's still the first car
        assertTrue(spot.isOccupied());  // Confirm spot is still occupied
    }
    
    @Test
    public void testOccupyAlreadyOccupiedSpot2() {
        spot.occupySpot("CDDR 401");
        spot.occupySpot("BRWY 441");  // Should NOT overwrite
        assertEquals("CDDR 401", spot.getLicensePlate());  // Assert it's still the first car
        assertTrue(spot.isOccupied());  // Confirm spot is still occupied
    }
    
    //A null license plate should be rejected, leaving the spot un‑occupied
    @Test(expected = IllegalArgumentException.class)
    public void testOccupyWithEmptyPlate() {
        spot.occupySpot("   ");         // should throw
    }
    
    
    
    
 // Freeing a spot that’s already free should not crash
    @Test
    public void testFreeAlreadyFreeSpot1() {
        spot.freeSpot();
        assertFalse(spot.isOccupied());
    }
    
    @Test
    public void testFreeAlreadyFreeSpot2() {
        spot.freeSpot();
        assertFalse(spot.isOccupied());
    }
    
    
    //checks that when a ParkingSpot changes state, all attached observers really receive the update notification
    @Test
    public void testNotifyObserversTriggersUpdate() {
        final boolean[] called = {false};
        spot.attach(new Observer() {
            @Override
            public void update(Subject subject) {
                called[0] = true;
            }
        });
        spot.occupySpot("PLATE");
        assertTrue(called[0]);
    }
}
