package booking;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class ExtendCommandTest {

    private BookingReceiver receiver; 
    private CommandInvoker  invoker;

    @Before
    public void setUp() {
        receiver = new BookingReceiver();
        invoker  = new CommandInvoker();
    }

   

    @Test
    public void testStandardExtend1() {
    	invoker.setCommand(new ExtendCommand(receiver, "id1294", "EXTT 001", 2, UserType.STUDENT));
    	invoker.executeCommand();
    	assertEquals("EXTEND", receiver.getAction());
        assertEquals(10.0, receiver.getAmount(), 0.01);
    }
    
    @Test
    public void testStandardExtend2() {
    	invoker.setCommand(new ExtendCommand(receiver, "id3456", "VGHN 641", 2, UserType.FACULTY));
    	invoker.executeCommand();
    	assertEquals("EXTEND", receiver.getAction());
        assertEquals(16.0, receiver.getAmount(), 0.01);
    }
    
    @Test
    public void testStandardExtend3() {
    	invoker.setCommand(new ExtendCommand(receiver, "id19864", "LMAZ 789", 2, UserType.NON_FACULTY));
    	invoker.executeCommand();
    	assertEquals("EXTEND", receiver.getAction());
        assertEquals(20.0, receiver.getAmount(), 0.01);
    }
    @Test
    public void testStandardExtend4() {
    	invoker.setCommand(new ExtendCommand(receiver, "id1294", "EXTT 001", 2, UserType.VISITOR));
    	invoker.executeCommand();
    	assertEquals("EXTEND", receiver.getAction());
        assertEquals(30.0, receiver.getAmount(), 0.01);
    }
   
    
    @Test public void actionFlagUpdtaedToExtend() {
        invoker.setCommand(new ExtendCommand(receiver,"ID2345","PFGB 638",4,UserType.STUDENT));
        invoker.executeCommand();
        assertEquals("EXTEND", receiver.getAction());
    }
    
    //BOOK THEN EXTEND
    @Test public void bookThenExtend() {
        // First, book one hour for faculty
        invoker.setCommand(new BookCommand(receiver,"ID2345","TYHG 784",1,UserType.FACULTY));
        invoker.executeCommand();
        // Now extend two more hours for faculty 
        invoker.setCommand(new ExtendCommand(receiver,"ID2345","TYHG 784",2,UserType.FACULTY));
        invoker.executeCommand();
        assertEquals("EXTEND", receiver.getAction());
        assertEquals(16.0, receiver.getAmount(), 0.01);
    }
    
    //BOOK THEN EXTEND THEN EXTEND
    @Test public void bookThenExtend2() {
        // First, book one hour for faculty
        invoker.setCommand(new BookCommand(receiver,"ID2345","TYHG 784",1,UserType.FACULTY));
        invoker.executeCommand();
        // Now extend two more hours for faculty 
        invoker.setCommand(new ExtendCommand(receiver,"ID2345","TYHG 784",2,UserType.FACULTY));
        invoker.executeCommand();
        assertEquals("EXTEND", receiver.getAction());
        assertEquals(16.0, receiver.getAmount(), 0.01);
        //THEN EXTEND AGAIN
        invoker.setCommand(new ExtendCommand(receiver,"ID2345","TYHG 784",1,UserType.FACULTY));
        invoker.executeCommand();
        assertEquals("EXTEND", receiver.getAction());
        assertEquals(8.0, receiver.getAmount(), 0.01);
        
    }
    
   //EXTEND THEN EXTEND
    @Test public void extendTwice() {
        invoker.setCommand(new ExtendCommand(receiver,"ID2345","TYHG 784",1,UserType.STUDENT));   // 5
        invoker.executeCommand();
        assertEquals(5.0, receiver.getAmount(), 0.01);
        invoker.setCommand(new ExtendCommand(receiver,"ID2345","TYHG 784",1,UserType.STUDENT));   
        invoker.executeCommand();
        assertEquals(5.0, receiver.getAmount(), 0.01);
    }
    
    
  //EXTEND THEN EXTEND, then extend
    @Test public void extendThrice() {
        invoker.setCommand(new ExtendCommand(receiver,"ID2345","TYHG 784",1,UserType.STUDENT));   // 5
        invoker.executeCommand();
        assertEquals(5.0, receiver.getAmount(), 0.01);
        invoker.setCommand(new ExtendCommand(receiver,"ID2345","TYHG 784",1,UserType.STUDENT));   
        invoker.executeCommand();
        assertEquals(5.0, receiver.getAmount(), 0.01);
        invoker.setCommand(new ExtendCommand(receiver,"ID2345","TYHG 784",1,UserType.STUDENT));   
        invoker.executeCommand();
        assertEquals(5.0, receiver.getAmount(), 0.01);
    }
   


 }
