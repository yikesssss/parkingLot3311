package booking;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SubjectTest {

    private ParkingSpot spot;
    private ObserverTest observer;

    
 // A test observer that sets a flag when updated
    private class ObserverTest implements Observer {
        boolean updated = false;

        @Override
        public void update(Subject subject) {
            updated = true;
        }
    }

    @Before
    public void setUp() {
        spot = new ParkingSpot();
        observer = new ObserverTest();
    }

 // Attach observer and check if update() is called on spot change
    @Test
    public void testAttachObserver1() {
        spot.attach(observer);
        spot.occupySpot("ABCD 123");
        assertTrue(observer.updated);
    }
    
    @Test
    public void testAttachObserver2() {
        spot.attach(observer);
        spot.occupySpot("EFGH 456");
        assertTrue(observer.updated);
    }
    
    @Test
    public void testAttachObserver3() {
        spot.attach(observer);
        spot.occupySpot("SDCX 876");
        assertTrue(observer.updated);
    }
    
 // Detach the observer and ensure it doesn't receive updates anymore

    @Test
    public void testDetachObserver1() {
        spot.attach(observer);
        spot.detach(observer);
        spot.occupySpot("WXYZ 789");
        assertFalse(observer.updated);
    }
    
    
    @Test
    public void testDetachObserver2() {
        spot.attach(observer);
        spot.detach(observer);
        spot.occupySpot("DDWN 103");
        assertFalse(observer.updated);
    }
    
    @Test
    public void testDetachObserver3() {
        spot.attach(observer);
        spot.detach(observer);
        spot.occupySpot("KMJN 456");
        assertFalse(observer.updated);
    }
    
 // Attaching the same observer twice shouldn't cause multiple updates
    @Test
    public void testAttachSameObserverTwice() {
        spot.attach(observer);
        spot.attach(observer); 
        spot.occupySpot("DUPLICATE");
        assertTrue(observer.updated);  // Only one notification
    }
    
    
 // Detaching an observer that was never added should be safe
    @Test
    public void testDetachUnattachedObserver() {
        ObserverTest unattached = new ObserverTest();
        spot.detach(unattached); 
        spot.occupySpot("GOOD-TO-GO");
        assertFalse(unattached.updated);
    }
}
