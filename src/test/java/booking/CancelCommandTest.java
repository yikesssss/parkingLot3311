package booking;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CancelCommandTest {

    private BookingReceiver receiver;
    private CommandInvoker  invoker;

    @Before
    public void setUp() {
    	 receiver = new BookingReceiver();
         invoker  = new CommandInvoker();
    }
 
    @Test
    public void testStandardCancel1() {
        invoker.setCommand(new CancelCommand(receiver, "ID45272", "ABCD 123"));
        invoker.executeCommand();
    }
    
    @Test
    public void testStandardCancel2() {
        invoker.setCommand(new CancelCommand(receiver, "ID3273", "QWRE 909"));
        invoker.executeCommand();
    }
    @Test
    public void testStandardCancel3() {
        invoker.setCommand(new CancelCommand(receiver, "ID3273", "ZAWE 345"));
        invoker.executeCommand();
    }
    @Test
    public void testStandardCancel4() {
        invoker.setCommand(new CancelCommand(receiver, "ID76895", "HKMN 148"));
        invoker.executeCommand();
    }
    
    
    
    @Test public void cancelSetsFlag1() { 
    	invoker.setCommand(new CancelCommand(receiver, "ID4576", "PIJM 236"));
        invoker.executeCommand();
    	assertEquals("CANCEL", receiver.getAction()); 
    }
    
    @Test public void cancelSetsFlag2() { 
    	invoker.setCommand(new CancelCommand(receiver, "ID32453", "MKLP 281"));
        invoker.executeCommand();
    	assertEquals("CANCEL", receiver.getAction()); 
    }
    
    //book then cancel test
    @Test public void cancelAfterBooking() {
        receiver.bookSpace("ID6784","ASEW 345",2,UserType.STUDENT);        
        invoker.setCommand(new CancelCommand(receiver,"ID6784","ASEW 345"));
        invoker.executeCommand();
        assertEquals(0.0, receiver.getAmount(), 0.01);
    }
    
    
    
    //BOOK, CANCEL, BOOK again
    
    @Test public void bookCancelBookAgain1() {
        invoker.setCommand(new BookCommand(receiver,"ID4566","VBNG 378",1,UserType.STUDENT));
        invoker.executeCommand();                 // BOOK
        invoker.setCommand(new CancelCommand(receiver,"ID4566","VBNG 378"));
        invoker.executeCommand();                 // CANCEL
        invoker.setCommand(new BookCommand(receiver,"ID4566","VBNG 378",1,UserType.STUDENT));
        invoker.executeCommand();                 // BOOK again
        assertEquals("BOOK", receiver.getAction());
    }
    
    @Test public void bookCancelBookAgain2() {
        invoker.setCommand(new BookCommand(receiver,"ID68893","XCDF 719",1,UserType.STUDENT));
        invoker.executeCommand();                 // BOOK
        invoker.setCommand(new CancelCommand(receiver,"ID68893","XCDF 719"));
        invoker.executeCommand();                 // CANCEL
        invoker.setCommand(new BookCommand(receiver,"ID68893","XCDF 719",1,UserType.STUDENT));
        invoker.executeCommand();                 // BOOK again
        assertEquals("BOOK", receiver.getAction());
    }
    
    
    //cancel twice should be fine
    @Test public void cancelTwice() {
        invoker.setCommand(new CancelCommand(receiver,"U","PLT"));
        invoker.executeCommand();
        invoker.executeCommand();                 // same command again
        assertEquals("CANCEL", receiver.getAction());
    }

   

    

   
}
