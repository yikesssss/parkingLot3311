package rando.booking;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        booking.CommandInvoker commandInvoker0 = new booking.CommandInvoker();
        commandInvoker0.executeCommand();
        booking.BookingReceiver bookingReceiver2 = new booking.BookingReceiver();
        java.lang.String str3 = bookingReceiver2.getAction();
        booking.UserType userType7 = null;
        booking.ExtendCommand extendCommand8 = new booking.ExtendCommand(bookingReceiver2, "hi!", "", 100, userType7);
        booking.UserType userType12 = booking.UserType.FACULTY;
        booking.BookCommand bookCommand13 = new booking.BookCommand(bookingReceiver2, "hi!", "hi!", 100, userType12);
        bookCommand13.doAction();
        bookCommand13.doAction();
        commandInvoker0.setCommand((booking.ICommand) bookCommand13);
        booking.BookingReceiver bookingReceiver17 = new booking.BookingReceiver();
        java.lang.String str18 = bookingReceiver17.getAction();
        booking.UserType userType22 = null;
        booking.ExtendCommand extendCommand23 = new booking.ExtendCommand(bookingReceiver17, "hi!", "", 100, userType22);
        booking.UserType userType27 = booking.UserType.FACULTY;
        booking.BookCommand bookCommand28 = new booking.BookCommand(bookingReceiver17, "hi!", "hi!", 100, userType27);
        booking.UserType userType32 = booking.UserType.FACULTY;
        booking.ExtendCommand extendCommand33 = new booking.ExtendCommand(bookingReceiver17, "", "", (int) (short) 1, userType32);
        commandInvoker0.setCommand((booking.ICommand) extendCommand33);
        booking.BookingReceiver bookingReceiver35 = new booking.BookingReceiver();
        java.lang.String str36 = bookingReceiver35.getAction();
        booking.UserType userType40 = null;
        booking.ExtendCommand extendCommand41 = new booking.ExtendCommand(bookingReceiver35, "hi!", "", 100, userType40);
        booking.UserType userType45 = booking.UserType.FACULTY;
        booking.BookCommand bookCommand46 = new booking.BookCommand(bookingReceiver35, "hi!", "hi!", 100, userType45);
        bookCommand46.doAction();
        bookCommand46.doAction();
        commandInvoker0.setCommand((booking.ICommand) bookCommand46);
        commandInvoker0.executeCommand();
        commandInvoker0.executeCommand();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + userType12 + "' != '" + booking.UserType.FACULTY + "'", userType12.equals(booking.UserType.FACULTY));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + userType27 + "' != '" + booking.UserType.FACULTY + "'", userType27.equals(booking.UserType.FACULTY));
        org.junit.Assert.assertTrue("'" + userType32 + "' != '" + booking.UserType.FACULTY + "'", userType32.equals(booking.UserType.FACULTY));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + userType45 + "' != '" + booking.UserType.FACULTY + "'", userType45.equals(booking.UserType.FACULTY));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        booking.ParkingSpot parkingSpot0 = new booking.ParkingSpot();
        parkingSpot0.freeSpot();
        boolean boolean2 = parkingSpot0.isOccupied();
        booking.ParkingSpot parkingSpot3 = new booking.ParkingSpot();
        parkingSpot3.occupySpot("hi!");
        booking.BookingSystem bookingSystem6 = new booking.BookingSystem((booking.Subject) parkingSpot3);
        booking.ParkingSpot parkingSpot7 = new booking.ParkingSpot();
        parkingSpot7.occupySpot("hi!");
        booking.BookingSystem bookingSystem10 = new booking.BookingSystem((booking.Subject) parkingSpot7);
        booking.ParkingSpot parkingSpot11 = new booking.ParkingSpot();
        parkingSpot11.occupySpot("hi!");
        bookingSystem10.update((booking.Subject) parkingSpot11);
        parkingSpot3.detach((booking.Observer) bookingSystem10);
        booking.ParkingSpot parkingSpot16 = new booking.ParkingSpot();
        parkingSpot16.occupySpot("hi!");
        booking.BookingSystem bookingSystem19 = new booking.BookingSystem((booking.Subject) parkingSpot16);
        booking.ParkingSpot parkingSpot20 = new booking.ParkingSpot();
        parkingSpot20.occupySpot("hi!");
        booking.BookingSystem bookingSystem23 = new booking.BookingSystem((booking.Subject) parkingSpot20);
        booking.ParkingSpot parkingSpot24 = new booking.ParkingSpot();
        parkingSpot24.occupySpot("hi!");
        bookingSystem23.update((booking.Subject) parkingSpot24);
        parkingSpot16.detach((booking.Observer) bookingSystem23);
        parkingSpot3.detach((booking.Observer) bookingSystem23);
        booking.ParkingSpot parkingSpot30 = new booking.ParkingSpot();
        parkingSpot30.occupySpot("hi!");
        booking.BookingSystem bookingSystem33 = new booking.BookingSystem((booking.Subject) parkingSpot30);
        booking.ParkingSpot parkingSpot34 = new booking.ParkingSpot();
        parkingSpot34.occupySpot("hi!");
        booking.BookingSystem bookingSystem37 = new booking.BookingSystem((booking.Subject) parkingSpot34);
        booking.ParkingSpot parkingSpot38 = new booking.ParkingSpot();
        parkingSpot38.occupySpot("hi!");
        bookingSystem37.update((booking.Subject) parkingSpot38);
        parkingSpot30.detach((booking.Observer) bookingSystem37);
        bookingSystem23.update((booking.Subject) parkingSpot30);
        booking.ParkingSensor parkingSensor44 = new booking.ParkingSensor((booking.Subject) parkingSpot30);
        booking.ParkingSpot parkingSpot45 = new booking.ParkingSpot();
        parkingSensor44.update((booking.Subject) parkingSpot45);
        parkingSpot0.detach((booking.Observer) parkingSensor44);
        booking.ParkingSpot parkingSpot48 = new booking.ParkingSpot();
        booking.ParkingSensor parkingSensor49 = new booking.ParkingSensor((booking.Subject) parkingSpot48);
        booking.ParkingSpot parkingSpot50 = new booking.ParkingSpot();
        parkingSpot50.occupySpot("hi!");
        booking.BookingSystem bookingSystem53 = new booking.BookingSystem((booking.Subject) parkingSpot50);
        booking.ParkingSpot parkingSpot54 = new booking.ParkingSpot();
        parkingSpot54.occupySpot("hi!");
        booking.BookingSystem bookingSystem57 = new booking.BookingSystem((booking.Subject) parkingSpot54);
        booking.ParkingSpot parkingSpot58 = new booking.ParkingSpot();
        parkingSpot58.occupySpot("hi!");
        bookingSystem57.update((booking.Subject) parkingSpot58);
        parkingSpot50.detach((booking.Observer) bookingSystem57);
        parkingSensor49.update((booking.Subject) parkingSpot50);
        booking.ParkingSpot parkingSpot64 = new booking.ParkingSpot();
        booking.ParkingSensor parkingSensor65 = new booking.ParkingSensor((booking.Subject) parkingSpot64);
        parkingSpot50.detach((booking.Observer) parkingSensor65);
        parkingSensor44.update((booking.Subject) parkingSpot50);
        boolean boolean68 = parkingSpot50.isOccupied();
        booking.BookingSystem bookingSystem69 = new booking.BookingSystem((booking.Subject) parkingSpot50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        booking.BookingReceiver bookingReceiver0 = new booking.BookingReceiver();
        java.lang.String str1 = bookingReceiver0.getAction();
        booking.UserType userType5 = null;
        booking.ExtendCommand extendCommand6 = new booking.ExtendCommand(bookingReceiver0, "hi!", "", 100, userType5);
        double double7 = bookingReceiver0.getDeposit();
        java.lang.String str8 = bookingReceiver0.getAction();
        booking.BookingReceiver bookingReceiver12 = new booking.BookingReceiver();
        java.lang.String str13 = bookingReceiver12.getAction();
        booking.UserType userType17 = null;
        booking.ExtendCommand extendCommand18 = new booking.ExtendCommand(bookingReceiver12, "hi!", "", 100, userType17);
        booking.BookingReceiver bookingReceiver22 = new booking.BookingReceiver();
        java.lang.String str23 = bookingReceiver22.getAction();
        booking.UserType userType27 = null;
        booking.ExtendCommand extendCommand28 = new booking.ExtendCommand(bookingReceiver22, "hi!", "", 100, userType27);
        booking.UserType userType32 = booking.UserType.FACULTY;
        booking.BookCommand bookCommand33 = new booking.BookCommand(bookingReceiver22, "hi!", "hi!", 100, userType32);
        booking.BookingReceiver bookingReceiver37 = new booking.BookingReceiver();
        booking.UserType userType41 = booking.UserType.FACULTY;
        bookingReceiver37.bookSpace("", "", 100, userType41);
        bookingReceiver22.extendBooking("", "", (int) 'a', userType41);
        booking.ExtendCommand extendCommand44 = new booking.ExtendCommand(bookingReceiver12, "", "", 0, userType41);
        booking.BookingReceiver bookingReceiver45 = new booking.BookingReceiver();
        java.lang.String str46 = bookingReceiver45.getAction();
        booking.UserType userType50 = null;
        booking.ExtendCommand extendCommand51 = new booking.ExtendCommand(bookingReceiver45, "hi!", "", 100, userType50);
        java.lang.String str52 = bookingReceiver45.getAction();
        booking.UserType userType56 = booking.UserType.NON_FACULTY;
        booking.ExtendCommand extendCommand57 = new booking.ExtendCommand(bookingReceiver45, "hi!", "hi!", (int) (byte) 0, userType56);
        double double58 = bookingReceiver12.getRate(userType56);
        bookingReceiver0.extendBooking("hi!", "", (int) (short) -1, userType56);
        booking.CancelCommand cancelCommand62 = new booking.CancelCommand(bookingReceiver0, "CANCEL", "CANCEL");
        booking.BookingReceiver bookingReceiver66 = new booking.BookingReceiver();
        bookingReceiver66.cancelBooking("hi!", "hi!");
        bookingReceiver66.cancelBooking("", "");
        booking.BookingReceiver bookingReceiver76 = new booking.BookingReceiver();
        java.lang.String str77 = bookingReceiver76.getAction();
        booking.UserType userType81 = null;
        booking.ExtendCommand extendCommand82 = new booking.ExtendCommand(bookingReceiver76, "hi!", "", 100, userType81);
        java.lang.String str83 = bookingReceiver76.getAction();
        booking.UserType userType87 = booking.UserType.NON_FACULTY;
        booking.ExtendCommand extendCommand88 = new booking.ExtendCommand(bookingReceiver76, "hi!", "hi!", (int) (byte) 0, userType87);
        booking.BookCommand bookCommand89 = new booking.BookCommand(bookingReceiver66, "EXTEND", "", (int) (short) 100, userType87);
        booking.BookCommand bookCommand90 = new booking.BookCommand(bookingReceiver0, "BOOK", "", (int) (short) -1, userType87);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + userType32 + "' != '" + booking.UserType.FACULTY + "'", userType32.equals(booking.UserType.FACULTY));
        org.junit.Assert.assertTrue("'" + userType41 + "' != '" + booking.UserType.FACULTY + "'", userType41.equals(booking.UserType.FACULTY));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + userType56 + "' != '" + booking.UserType.NON_FACULTY + "'", userType56.equals(booking.UserType.NON_FACULTY));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + userType87 + "' != '" + booking.UserType.NON_FACULTY + "'", userType87.equals(booking.UserType.NON_FACULTY));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        booking.ParkingSpot parkingSpot0 = new booking.ParkingSpot();
        booking.ParkingSensor parkingSensor1 = new booking.ParkingSensor((booking.Subject) parkingSpot0);
        booking.ParkingSpot parkingSpot2 = new booking.ParkingSpot();
        parkingSpot2.occupySpot("hi!");
        booking.BookingSystem bookingSystem5 = new booking.BookingSystem((booking.Subject) parkingSpot2);
        booking.ParkingSpot parkingSpot6 = new booking.ParkingSpot();
        parkingSpot6.occupySpot("hi!");
        booking.BookingSystem bookingSystem9 = new booking.BookingSystem((booking.Subject) parkingSpot6);
        booking.ParkingSpot parkingSpot10 = new booking.ParkingSpot();
        parkingSpot10.occupySpot("hi!");
        bookingSystem9.update((booking.Subject) parkingSpot10);
        parkingSpot2.detach((booking.Observer) bookingSystem9);
        booking.ParkingSpot parkingSpot15 = new booking.ParkingSpot();
        parkingSpot15.occupySpot("hi!");
        booking.BookingSystem bookingSystem18 = new booking.BookingSystem((booking.Subject) parkingSpot15);
        booking.ParkingSpot parkingSpot19 = new booking.ParkingSpot();
        parkingSpot19.occupySpot("hi!");
        booking.BookingSystem bookingSystem22 = new booking.BookingSystem((booking.Subject) parkingSpot19);
        booking.ParkingSpot parkingSpot23 = new booking.ParkingSpot();
        parkingSpot23.occupySpot("hi!");
        bookingSystem22.update((booking.Subject) parkingSpot23);
        parkingSpot15.detach((booking.Observer) bookingSystem22);
        parkingSpot2.detach((booking.Observer) bookingSystem22);
        parkingSpot2.occupySpot("CANCEL");
        parkingSensor1.update((booking.Subject) parkingSpot2);
        booking.ParkingSpot parkingSpot32 = new booking.ParkingSpot();
        parkingSpot32.occupySpot("hi!");
        booking.BookingSystem bookingSystem35 = new booking.BookingSystem((booking.Subject) parkingSpot32);
        booking.ParkingSpot parkingSpot36 = new booking.ParkingSpot();
        parkingSpot36.occupySpot("hi!");
        booking.BookingSystem bookingSystem39 = new booking.BookingSystem((booking.Subject) parkingSpot36);
        booking.ParkingSpot parkingSpot40 = new booking.ParkingSpot();
        parkingSpot40.occupySpot("hi!");
        bookingSystem39.update((booking.Subject) parkingSpot40);
        parkingSpot32.detach((booking.Observer) bookingSystem39);
        booking.ParkingSpot parkingSpot45 = new booking.ParkingSpot();
        parkingSpot45.occupySpot("hi!");
        booking.BookingSystem bookingSystem48 = new booking.BookingSystem((booking.Subject) parkingSpot45);
        booking.ParkingSpot parkingSpot49 = new booking.ParkingSpot();
        parkingSpot49.occupySpot("hi!");
        booking.BookingSystem bookingSystem52 = new booking.BookingSystem((booking.Subject) parkingSpot49);
        booking.ParkingSpot parkingSpot53 = new booking.ParkingSpot();
        parkingSpot53.occupySpot("hi!");
        bookingSystem52.update((booking.Subject) parkingSpot53);
        parkingSpot45.detach((booking.Observer) bookingSystem52);
        parkingSpot32.detach((booking.Observer) bookingSystem52);
        booking.ParkingSpot parkingSpot59 = new booking.ParkingSpot();
        parkingSpot59.occupySpot("hi!");
        booking.BookingSystem bookingSystem62 = new booking.BookingSystem((booking.Subject) parkingSpot59);
        booking.ParkingSpot parkingSpot63 = new booking.ParkingSpot();
        parkingSpot63.occupySpot("hi!");
        booking.BookingSystem bookingSystem66 = new booking.BookingSystem((booking.Subject) parkingSpot63);
        booking.ParkingSpot parkingSpot67 = new booking.ParkingSpot();
        parkingSpot67.occupySpot("hi!");
        bookingSystem66.update((booking.Subject) parkingSpot67);
        parkingSpot59.detach((booking.Observer) bookingSystem66);
        bookingSystem52.update((booking.Subject) parkingSpot59);
        parkingSpot2.attach((booking.Observer) bookingSystem52);
        parkingSpot2.occupySpot("EXTEND");
        booking.ParkingSensor parkingSensor76 = new booking.ParkingSensor((booking.Subject) parkingSpot2);
    }
}

