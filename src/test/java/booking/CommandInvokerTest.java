
package booking;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommandInvokerTest {

    private CommandInvoker invoker;
    private BookingReceiver receiver;

    @Before
    public void setUp() {
        invoker = new CommandInvoker();
        receiver = new BookingReceiver();
    }
    
    
    @Test public void executeWithoutCommandDoesNothing() {
        invoker.executeCommand();                         // command is null
        assertEquals("", receiver.getAction());       // nothing
    }

    @Test
    public void testBookCommandExecution() {
    	invoker.setCommand(new BookCommand(receiver, "ID1643", "JKMN 789", 1, UserType.STUDENT));
        invoker.executeCommand();
        assertEquals("BOOK", receiver.getAction());
        assertEquals(5.0,    receiver.getAmount(), 0.01);
    }

    @Test
    public void testCancelCommandExecution() {
    	invoker.setCommand(new CancelCommand(receiver, "ID1643", "JKMN 789"));
        invoker.executeCommand();
        assertEquals("CANCEL", receiver.getAction());
    } 

    @Test
    public void testExtendCommandExecution() {
    	invoker.setCommand(new ExtendCommand(receiver, "ID1643", "JKMN 789", 1, UserType.STUDENT));
        invoker.executeCommand();
        assertEquals("EXTEND", receiver.getAction());
        assertEquals(5.0,    receiver.getAmount(), 0.01);
    }

    //SETTING AND EXECUTING MULTIPLE COMMANDS, CHECK IF THE LAST COMMAND IS CORRECT
    @Test public void multipleCommandsSequence() {
        //command 1
    	invoker.setCommand(new BookCommand(receiver, "ID45367","IOLK 678", 1, UserType.STUDENT));  
        invoker.executeCommand();
        assertEquals("BOOK", receiver.getAction());
        assertEquals(5.0,    receiver.getAmount(), 0.01);
      //command 2
        invoker.setCommand(new ExtendCommand(receiver, "ID45367","IOLK 678", 1, UserType.STUDENT)); 
        invoker.executeCommand();
        assertEquals("EXTEND", receiver.getAction());
        assertEquals(5.0,    receiver.getAmount(), 0.01);
      //command 3
        invoker.setCommand(new CancelCommand(receiver, "ID45367","IOLK 678"));                      
        invoker.executeCommand();
        assertEquals("CANCEL", receiver.getAction());
    }
    
    //set command twice before executing 
    @Test public void setCommandTwiceBeforeExecute1() {
        invoker.setCommand(new BookCommand(receiver, "ID1643", "JKMN 789", 1, UserType.STUDENT));
        invoker.setCommand(new ExtendCommand(receiver, "ID1643", "JKMN 789", 1, UserType.STUDENT));
        invoker.executeCommand();                       // only the second command runs
        assertEquals("EXTEND", receiver.getAction());
    }
    
  
    @Test public void setCommandTwiceBeforeExecute2() {
        invoker.setCommand(new CancelCommand(receiver, "ID1643", "JKMN 789"));
        invoker.setCommand(new ExtendCommand(receiver, "ID1643", "JKMN 789", 1, UserType.STUDENT));
        invoker.executeCommand();                       // only the second command runs
        assertEquals("EXTEND", receiver.getAction());
    }
    
    @Test public void setCommandTwiceBeforeExecute3() {
        invoker.setCommand(new ExtendCommand(receiver, "ID1643", "JKMN 789", 1, UserType.STUDENT));
        invoker.setCommand(new CancelCommand(receiver, "ID1643", "JKMN 789"));
        invoker.executeCommand();                       // only the second command runs
        assertEquals("CANCEL", receiver.getAction());
    }
    
  //set command thrice before executing 
    @Test public void setCommandThriceBeforeExecute() {
        invoker.setCommand(new BookCommand(receiver, "ID1643", "JKMN 789", 1, UserType.STUDENT));
        invoker.setCommand(new ExtendCommand(receiver, "ID1643", "JKMN 789", 1, UserType.STUDENT));
        invoker.setCommand(new CancelCommand(receiver, "ID1643", "JKMN 789"));
     
        invoker.executeCommand();                       // only the third command runs
        assertEquals("CANCEL", receiver.getAction());
    }
    
    //TEST OVERWRITING SAME INSTANCE
    @Test public void overwriteWithSameInstance() {
        ICommand cmd = new CancelCommand(receiver, "ID2124", "PLTU 121");
        invoker.setCommand(cmd);
        invoker.setCommand(cmd);                        // same reference
        invoker.executeCommand();
        assertEquals("CANCEL", receiver.getAction());
    }

   
    
}
