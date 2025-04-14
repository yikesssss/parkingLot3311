package booking;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BookingReceiverTest { 

	private BookingReceiver receiver;
	   

    @Before
    public void setUp() {
        receiver = new BookingReceiver();
        
    }
    
    @Test public void rateStudent(){ 
    	assertEquals( 5.0, receiver.getRate(UserType.STUDENT)    , 0.01); 
    }
   
    @Test public void rateFaculty(){ 
    	assertEquals( 8.0, receiver.getRate(UserType.FACULTY)    , 0.01); 
    }
  
    @Test public void rateNonFaculty(){ 
    	assertEquals(10.0, receiver.getRate(UserType.NON_FACULTY), 0.01); 
    }
   
    @Test public void rateVisitor(){ 
    	assertEquals(15.0, receiver.getRate(UserType.VISITOR)    , 0.01); 
    }
    
    //TEST BOOKING
    @Test public void bookStudent() {
        receiver.bookSpace("ID23456","XMJN 680",2,UserType.STUDENT);          
        assertEquals("BOOK", receiver.getAction());
        assertEquals(10.0,   receiver.getAmount(), 0.01);
    }
    
    @Test public void bookFaculty() {
        receiver.bookSpace("ID89735","CWZB 093",2,UserType.FACULTY);         
        assertEquals("BOOK", receiver.getAction());
        assertEquals(16.0,   receiver.getAmount(), 0.01);
    }
    
    @Test public void bookVisitor() {            // 
        receiver.bookSpace("ID98577","ZHWW 171",2,UserType.VISITOR);
        assertEquals("BOOK", receiver.getAction());
        assertEquals(30.0, receiver.getAmount(), 0.01);
    }
    
    //TEST EXTENDING
    @Test public void extendNonFaculty() {         
        receiver.extendBooking("ID835264","KFRY 129",3,UserType.NON_FACULTY);
        assertEquals("EXTEND", receiver.getAction());
        assertEquals(30.0,     receiver.getAmount(), 0.01);
    }
    
    //TEST CANCELLING 
    @Test public void cancelClearsAmount() {
        receiver.bookSpace("ID318945","LNHT 233",1,UserType.STUDENT);
        receiver.cancelBooking("U","P");
        assertEquals("CANCEL", receiver.getAction());
        assertEquals(0.0,      receiver.getAmount(), 0.01);
    }

// TEST BOOK THEN EXTEND 
    @Test public void bookThenExtendAccumulatesCorrectly() {
        receiver.bookSpace("ID489637","PVLV 285",1,UserType.NON_FACULTY); 
        assertEquals(10.0, receiver.getAmount(), 0.01);
        receiver.extendBooking("ID489637","PVLV 285",2,UserType.NON_FACULTY);  
        assertEquals("EXTEND", receiver.getAction());
        assertEquals(20.0,     receiver.getAmount(), 0.01);
    }
    
    //test deposit
    
    @Test public void depositIsFirstHourCost() {
        receiver.bookSpace("ID75849","KZDS 218",4,UserType.FACULTY);   // rate = 8
        assertEquals("BOOK", receiver.getAction());
        assertEquals(8.0 , receiver.getDeposit(), 0.01);
    }



}
