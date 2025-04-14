package booking;
import org.junit.Before;


import org.junit.Test;
import static org.junit.Assert.*;

public class BookCommandTest {

	private BookingReceiver receiver;
    private CommandInvoker  invoker;

    @Before public void setUp() {
        receiver = new BookingReceiver();
        invoker  = new CommandInvoker();
    }

    // helper to execute a booking via the invoker 
    private void book(int hrs, UserType userType) {
        invoker.setCommand(new BookCommand(receiver, "ID2124", "PLTU 121", hrs, userType));
        invoker.executeCommand();
    }

   //book tests
    @Test public void studentBook1() {
        book(1, UserType.STUDENT);
        assertEquals(5.0, receiver.getAmount(), 0.01);
    }
    
    @Test public void studentBook2() {
        book(3, UserType.STUDENT);
        assertEquals(15.0, receiver.getAmount(), 0.01);
    }

    @Test public void facultyBook1() {
        book(1, UserType.FACULTY);             
        assertEquals(8.0, receiver.getAmount(), 0.01);
    }
    @Test public void facultyBook2() {
        book(3, UserType.FACULTY);             
        assertEquals(24.0, receiver.getAmount(), 0.01);
    }

    @Test public void nonFacultyBook1() {
        book(3, UserType.NON_FACULTY);         
        assertEquals(30.0, receiver.getAmount(), 0.01);
    }
    
    @Test public void nonFacultyBook2() {
        book(5, UserType.NON_FACULTY);         
        assertEquals(50.0, receiver.getAmount(), 0.01);
    }

    @Test public void visitorBook1() {
        book(3, UserType.VISITOR);            
        assertEquals(45.0, receiver.getAmount(), 0.01);
    }
    
    @Test public void visitorBook2() {
        book(10, UserType.VISITOR);            
        assertEquals(150.0, receiver.getAmount(), 0.01);
    }

    @Test public void updateActionFlagAfterValidBooking() {
        book(2, UserType.STUDENT);
        assertEquals("BOOK", receiver.getAction());
    }
    
    
   

}