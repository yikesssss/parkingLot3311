package rando.parking;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.Class<?> wildcardClass4 = parkingSpot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot1 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingLotManager0.addParkingSpot(parkingSpot1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parking.ParkingSpot.getId()\" because \"spot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotManager0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.Class<?> wildcardClass4 = parkingSpot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        parking.ParkingSpot parkingSpot0 = null;
        // The following exception was thrown during execution in test generation
        try {
            parking.CoveredParkingDecorator coveredParkingDecorator1 = new parking.CoveredParkingDecorator(parkingSpot0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parking.ParkingSpot.getId()\" because \"decoratedParkingSpot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        parking.ParkingSpot parkingSpot0 = null;
        // The following exception was thrown during execution in test generation
        try {
            parking.EVChargingDecorator eVChargingDecorator1 = new parking.EVChargingDecorator(parkingSpot0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parking.ParkingSpot.getId()\" because \"decoratedParkingSpot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.Class<?> wildcardClass6 = handicapAccessDecorator5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.Class<?> wildcardClass8 = eVChargingDecorator7.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.lang.Class<?> wildcardClass14 = parkingSpot11.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str8 = eVChargingDecorator7.getLocation();
        java.lang.Class<?> wildcardClass9 = eVChargingDecorator7.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(100, "Parking Spot ID: 1, Location: hi!, Lot: ", "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        java.lang.Class<?> wildcardClass4 = parkingSpot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str8 = eVChargingDecorator6.getDetails();
        java.lang.String str9 = eVChargingDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "Parking Spot ID: 1, Location: hi!, Lot: ", "");
        java.lang.Class<?> wildcardClass4 = parkingSpot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: 1, Location: hi!, Lot: ", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.Class<?> wildcardClass12 = handicapAccessDecorator11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.Class<?> wildcardClass12 = coveredParkingDecorator5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.Class<?> wildcardClass9 = coveredParkingDecorator8.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str18 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot17);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        java.lang.Class<?> wildcardClass23 = eVChargingDecorator21.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.Class<?> wildcardClass10 = coveredParkingDecorator9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        java.lang.String str5 = parkingSpot3.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.Class<?> wildcardClass7 = handicapAccessDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        java.lang.String str5 = parkingSpot3.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.Class<?> wildcardClass7 = handicapAccessDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str5, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList15 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager16 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot20 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str21 = parkingSpot20.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator22 = new parking.CoveredParkingDecorator(parkingSpot20);
        java.lang.String str23 = coveredParkingDecorator22.getDetails();
        parking.EVChargingDecorator eVChargingDecorator24 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator22);
        parkingLotManager16.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        java.lang.String str26 = eVChargingDecorator24.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        java.lang.Class<?> wildcardClass28 = eVChargingDecorator24.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
        org.junit.Assert.assertNotNull(parkingLotManager16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator9.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str8 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.Class<?> wildcardClass10 = coveredParkingDecorator9.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList15 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager16 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot20 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str21 = parkingSpot20.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator22 = new parking.CoveredParkingDecorator(parkingSpot20);
        java.lang.String str23 = coveredParkingDecorator22.getDetails();
        parking.EVChargingDecorator eVChargingDecorator24 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator22);
        parkingLotManager16.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        java.lang.String str26 = eVChargingDecorator24.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        java.lang.String str28 = eVChargingDecorator24.getDetails();
        java.lang.String str29 = eVChargingDecorator24.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
        org.junit.Assert.assertNotNull(parkingLotManager16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str28, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str29, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str8 = eVChargingDecorator6.getDetails();
        java.lang.Class<?> wildcardClass9 = eVChargingDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available", "hi!");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str9 = coveredParkingDecorator8.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        int int5 = parkingSpot3.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot16 = new parking.ParkingSpot((-1), "", "");
        parkingLotManager0.addParkingSpot(parkingSpot16);
        java.util.List<parking.ParkingSpot> parkingSpotList18 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingSpotList18);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str8 = eVChargingDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator9 = new parking.EVChargingDecorator(parkingSpot4);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator7);
        int int9 = handicapAccessDecorator8.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) '#', "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        int int5 = parkingSpot3.getId();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.Class<?> wildcardClass7 = coveredParkingDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str8 = eVChargingDecorator7.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        java.lang.String str11 = handicapAccessDecorator9.getDetails();
        java.lang.String str12 = handicapAccessDecorator9.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str14 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getParkingLot();
        java.lang.Class<?> wildcardClass8 = coveredParkingDecorator5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList15 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager16 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot20 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str21 = parkingSpot20.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator22 = new parking.CoveredParkingDecorator(parkingSpot20);
        java.lang.String str23 = coveredParkingDecorator22.getDetails();
        parking.EVChargingDecorator eVChargingDecorator24 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator22);
        parkingLotManager16.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        java.lang.String str26 = eVChargingDecorator24.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        java.lang.String str28 = eVChargingDecorator24.getDetails();
        java.lang.String str29 = eVChargingDecorator24.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
        org.junit.Assert.assertNotNull(parkingLotManager16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str28, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str29, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: 1, Location: hi!, Lot: hi!", "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        int int13 = parkingSpot9.getId();
        java.lang.String str14 = parkingSpot9.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator(parkingSpot9);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.Class<?> wildcardClass8 = eVChargingDecorator7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        java.lang.String str5 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str7 = eVChargingDecorator6.getParkingLot();
        java.lang.Class<?> wildcardClass8 = eVChargingDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str5, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot14 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingLotManager0.addParkingSpot(parkingSpot14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parking.ParkingSpot.getId()\" because \"spot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        java.util.List<parking.ParkingSpot> parkingSpotList22 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot26 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str27 = parkingSpot26.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator28 = new parking.HandicapAccessDecorator(parkingSpot26);
        parking.HandicapAccessDecorator handicapAccessDecorator29 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator28);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator29);
        parking.ParkingSpot parkingSpot34 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str35 = parkingSpot34.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator36 = new parking.CoveredParkingDecorator(parkingSpot34);
        java.lang.String str37 = coveredParkingDecorator36.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator38 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator36);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator36);
        java.lang.Class<?> wildcardClass40 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str37, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str11 = eVChargingDecorator10.getDetails();
        java.lang.String str12 = eVChargingDecorator10.getDetails();
        java.lang.Class<?> wildcardClass13 = eVChargingDecorator10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator9);
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator11);
        java.lang.Class<?> wildcardClass13 = handicapAccessDecorator12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str7 = handicapAccessDecorator6.getLocation();
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "", "");
        java.lang.Class<?> wildcardClass4 = parkingSpot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        java.lang.String str9 = handicapAccessDecorator6.getDetails();
        java.lang.Class<?> wildcardClass10 = handicapAccessDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList7 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList8 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager9 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot13 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager9.addParkingSpot(parkingSpot13);
        java.lang.String str15 = parkingSpot13.getDetails();
        parking.EVChargingDecorator eVChargingDecorator16 = new parking.EVChargingDecorator(parkingSpot13);
        parking.HandicapAccessDecorator handicapAccessDecorator17 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator16);
        java.lang.String str18 = eVChargingDecorator16.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator16);
        parking.ParkingSpot parkingSpot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingLotManager0.addParkingSpot(parkingSpot20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parking.ParkingSpot.getId()\" because \"spot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingSpotList7);
        org.junit.Assert.assertNotNull(parkingSpotList8);
        org.junit.Assert.assertNotNull(parkingLotManager9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str18, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getDetails();
        java.lang.String str7 = parkingSpot3.getParkingLot();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str6, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , EV Charging Available");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot15 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str16 = parkingSpot15.getDetails();
        java.lang.String str17 = parkingSpot15.getDetails();
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator(parkingSpot15);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator18);
        java.util.List<parking.ParkingSpot> parkingSpotList20 = parkingLotManager0.getParkingSpots();
        java.lang.Class<?> wildcardClass21 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingSpotList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        int int5 = eVChargingDecorator4.getId();
        int int6 = eVChargingDecorator4.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.Class<?> wildcardClass11 = handicapAccessDecorator10.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        java.lang.Class<?> wildcardClass4 = parkingSpot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        int int14 = parkingSpot11.getId();
        java.lang.Class<?> wildcardClass15 = parkingSpot11.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        int int7 = parkingSpot4.getId();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator(parkingSpot4);
        java.lang.String str10 = handicapAccessDecorator9.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) -1, "Parking Spot ID: -1, Location: , Lot: , Covered Parking", "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        java.lang.String str9 = coveredParkingDecorator5.getLocation();
        java.lang.String str10 = coveredParkingDecorator5.getLocation();
        java.lang.Class<?> wildcardClass11 = coveredParkingDecorator5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        java.lang.String str7 = parkingSpot4.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator(parkingSpot4);
        java.lang.String str9 = handicapAccessDecorator8.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getParkingLot();
        java.lang.String str13 = eVChargingDecorator8.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = handicapAccessDecorator7.getDetails();
        java.lang.String str9 = handicapAccessDecorator7.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.String str11 = coveredParkingDecorator8.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str9 = coveredParkingDecorator8.getDetails();
        java.lang.String str10 = coveredParkingDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        int int5 = parkingSpot3.getId();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.HandicapAccessDecorator handicapAccessDecorator14 = new parking.HandicapAccessDecorator(parkingSpot11);
        java.lang.String str15 = parkingSpot11.getLocation();
        java.lang.String str16 = parkingSpot11.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible", "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList8 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList9 = parkingLotManager0.getParkingSpots();
        java.lang.Class<?> wildcardClass10 = parkingSpotList9.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(parkingSpotList8);
        org.junit.Assert.assertNotNull(parkingSpotList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = handicapAccessDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator7);
        java.lang.Class<?> wildcardClass10 = handicapAccessDecorator7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str8 = eVChargingDecorator6.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.Class<?> wildcardClass10 = coveredParkingDecorator9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        int int9 = coveredParkingDecorator8.getId();
        java.lang.Class<?> wildcardClass10 = coveredParkingDecorator8.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot15 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str16 = parkingSpot15.getDetails();
        java.lang.String str17 = parkingSpot15.getDetails();
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator(parkingSpot15);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator18);
        java.util.List<parking.ParkingSpot> parkingSpotList20 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager21 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot25 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager21.addParkingSpot(parkingSpot25);
        parking.ParkingSpot parkingSpot30 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str31 = parkingSpot30.getLocation();
        parking.EVChargingDecorator eVChargingDecorator32 = new parking.EVChargingDecorator(parkingSpot30);
        parkingLotManager21.addParkingSpot(parkingSpot30);
        parking.EVChargingDecorator eVChargingDecorator34 = new parking.EVChargingDecorator(parkingSpot30);
        java.lang.String str35 = eVChargingDecorator34.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator34);
        parking.ParkingSpot parkingSpot37 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingLotManager0.addParkingSpot(parkingSpot37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parking.ParkingSpot.getId()\" because \"spot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingSpotList20);
        org.junit.Assert.assertNotNull(parkingLotManager21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str35, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        java.lang.String str5 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str7 = parkingSpot3.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str5, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.Class<?> wildcardClass9 = coveredParkingDecorator5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getLocation();
        java.lang.String str13 = eVChargingDecorator8.getDetails();
        java.lang.Class<?> wildcardClass14 = eVChargingDecorator8.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "Parking Spot ID: -1, Location: , Lot: , EV Charging Available, Covered Parking");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str7 = parkingSpot3.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str7, "Parking Spot ID: -1, Location: , Lot: ");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator(parkingSpot4);
        int int9 = parkingSpot4.getId();
        java.lang.Class<?> wildcardClass10 = parkingSpot4.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str11 = eVChargingDecorator10.getDetails();
        java.lang.String str12 = eVChargingDecorator10.getDetails();
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator13);
        int int15 = eVChargingDecorator13.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getDetails();
        java.lang.String str7 = parkingSpot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str6, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available", "Parking Spot ID: -1, Location: , Lot: ");
        java.lang.Class<?> wildcardClass4 = parkingSpot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot15 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str16 = parkingSpot15.getDetails();
        java.lang.String str17 = parkingSpot15.getDetails();
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator(parkingSpot15);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator18);
        parking.ParkingLotManager parkingLotManager20 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot24 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager20.addParkingSpot(parkingSpot24);
        java.lang.String str26 = parkingSpot24.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator27 = new parking.CoveredParkingDecorator(parkingSpot24);
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator27);
        java.lang.String str30 = coveredParkingDecorator27.getDetails();
        java.lang.String str31 = coveredParkingDecorator27.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingLotManager20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str30, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str31, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = handicapAccessDecorator11.getDetails();
        java.lang.String str13 = handicapAccessDecorator11.getDetails();
        java.lang.Class<?> wildcardClass14 = handicapAccessDecorator11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        parking.CoveredParkingDecorator coveredParkingDecorator4 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getLocation();
        java.lang.String str7 = parkingSpot3.getDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str7, "Parking Spot ID: -1, Location: , Lot: ");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        java.util.List<parking.ParkingSpot> parkingSpotList22 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot26 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str27 = parkingSpot26.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator28 = new parking.HandicapAccessDecorator(parkingSpot26);
        parking.HandicapAccessDecorator handicapAccessDecorator29 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator28);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator29);
        parking.ParkingSpot parkingSpot31 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingLotManager0.addParkingSpot(parkingSpot31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parking.ParkingSpot.getId()\" because \"spot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int12 = handicapAccessDecorator11.getId();
        java.lang.String str13 = handicapAccessDecorator11.getDetails();
        java.lang.Class<?> wildcardClass14 = handicapAccessDecorator11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 100, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator6.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.Class<?> wildcardClass11 = eVChargingDecorator10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) -1, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , EV Charging Available");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.lang.String str14 = parkingSpot11.getParkingLot();
        java.lang.String str15 = parkingSpot11.getParkingLot();
        java.lang.Class<?> wildcardClass16 = parkingSpot11.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingLotManager parkingLotManager14 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str19 = parkingSpot18.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot18);
        java.lang.String str21 = coveredParkingDecorator20.getDetails();
        parking.EVChargingDecorator eVChargingDecorator22 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        parkingLotManager14.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        java.util.List<parking.ParkingSpot> parkingSpotList25 = parkingLotManager0.getParkingSpots();
        java.lang.Class<?> wildcardClass26 = parkingSpotList25.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingLotManager14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str9 = coveredParkingDecorator8.getDetails();
        java.lang.Class<?> wildcardClass10 = coveredParkingDecorator8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator4);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator5);
        int int7 = coveredParkingDecorator6.getId();
        java.lang.String str8 = coveredParkingDecorator6.getLocation();
        java.lang.Class<?> wildcardClass9 = coveredParkingDecorator6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str8, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "", "");
        java.lang.String str4 = parkingSpot3.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: , Lot: " + "'", str4, "Parking Spot ID: 1, Location: , Lot: ");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "", "Parking Spot ID: -1, Location: , Lot: ");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str4, "Parking Spot ID: -1, Location: , Lot: ");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingLotManager parkingLotManager6 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot10 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager6.addParkingSpot(parkingSpot10);
        java.lang.String str12 = parkingSpot10.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator(parkingSpot10);
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator13);
        parking.ParkingSpot parkingSpot19 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str20 = parkingSpot19.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator21 = new parking.CoveredParkingDecorator(parkingSpot19);
        java.lang.String str22 = parkingSpot19.getDetails();
        java.lang.String str23 = parkingSpot19.getParkingLot();
        parking.EVChargingDecorator eVChargingDecorator24 = new parking.EVChargingDecorator(parkingSpot19);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingLotManager6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str22, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 100, "", "Parking Spot ID: 1, Location: hi!, Lot: hi!");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator(parkingSpot4);
        java.lang.String str8 = handicapAccessDecorator7.getDetails();
        int int9 = handicapAccessDecorator7.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        java.lang.String str5 = parkingSpot3.getParkingLot();
        java.lang.Class<?> wildcardClass6 = parkingSpot3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator4);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator5);
        int int7 = coveredParkingDecorator6.getId();
        java.lang.String str8 = coveredParkingDecorator6.getLocation();
        java.lang.String str9 = coveredParkingDecorator6.getDetails();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str8, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available, EV Charging Available, Covered Parking" + "'", str9, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available, EV Charging Available, Covered Parking");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.Class<?> wildcardClass7 = coveredParkingDecorator5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str8 = eVChargingDecorator7.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        java.lang.Class<?> wildcardClass11 = handicapAccessDecorator9.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        parking.ParkingSpot parkingSpot25 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str26 = parkingSpot25.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator27 = new parking.CoveredParkingDecorator(parkingSpot25);
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        parking.CoveredParkingDecorator coveredParkingDecorator29 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator28);
        parking.EVChargingDecorator eVChargingDecorator30 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator28);
        java.lang.String str31 = eVChargingDecorator28.getParkingLot();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator28);
        parking.HandicapAccessDecorator handicapAccessDecorator33 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator28);
        java.lang.String str34 = handicapAccessDecorator33.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible" + "'", str34, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str11 = eVChargingDecorator10.getDetails();
        java.lang.String str12 = eVChargingDecorator10.getDetails();
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator13);
        parking.EVChargingDecorator eVChargingDecorator15 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator14);
        java.lang.String str16 = eVChargingDecorator15.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking, EV Charging Available" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking, EV Charging Available");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getLocation();
        java.lang.String str7 = parkingSpot3.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator20 = new parking.HandicapAccessDecorator(parkingSpot17);
        java.lang.String str21 = handicapAccessDecorator20.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator20);
        java.lang.String str23 = handicapAccessDecorator20.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator24 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator20);
        java.lang.String str25 = handicapAccessDecorator20.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str21, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str23, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = coveredParkingDecorator5.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator14 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.Class<?> wildcardClass15 = coveredParkingDecorator5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str18 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot17);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        parking.ParkingLotManager parkingLotManager23 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot27 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager23.addParkingSpot(parkingSpot27);
        java.lang.String str29 = parkingSpot27.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator30 = new parking.HandicapAccessDecorator(parkingSpot27);
        parkingLotManager0.addParkingSpot(parkingSpot27);
        parking.EVChargingDecorator eVChargingDecorator32 = new parking.EVChargingDecorator(parkingSpot27);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingLotManager23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(97, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        java.lang.String str4 = parkingSpot3.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 97, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str4, "Parking Spot ID: 97, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot16 = new parking.ParkingSpot((-1), "", "");
        parkingLotManager0.addParkingSpot(parkingSpot16);
        parking.CoveredParkingDecorator coveredParkingDecorator18 = new parking.CoveredParkingDecorator(parkingSpot16);
        java.lang.Class<?> wildcardClass19 = parkingSpot16.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = coveredParkingDecorator8.getDetails();
        java.lang.String str10 = coveredParkingDecorator8.getDetails();
        java.lang.String str11 = coveredParkingDecorator8.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "Parking Spot ID: 1, Location: hi!, Lot: hi!", "hi!");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        int int7 = parkingSpot4.getId();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator(parkingSpot4);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        java.lang.String str11 = handicapAccessDecorator9.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        java.lang.String str10 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.Class<?> wildcardClass13 = coveredParkingDecorator7.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 100, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str5 = eVChargingDecorator4.getDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 100, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, EV Charging Available" + "'", str5, "Parking Spot ID: 100, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, EV Charging Available");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible", "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator4);
        java.lang.String str6 = eVChargingDecorator4.getDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available" + "'", str6, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        int int4 = parkingSpot3.getId();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.Class<?> wildcardClass6 = parkingSpot3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        int int4 = parkingSpot3.getId();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator5);
        java.lang.Class<?> wildcardClass7 = eVChargingDecorator5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = eVChargingDecorator6.getLocation();
        java.lang.String str8 = eVChargingDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((-1), "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: ");
        parkingLotManager0.addParkingSpot(parkingSpot18);
        java.lang.Class<?> wildcardClass20 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str6 = eVChargingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available" + "'", str6, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator4);
        java.lang.String str6 = eVChargingDecorator4.getParkingLot();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getLocation();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        java.lang.String str13 = eVChargingDecorator8.getDetails();
        int int14 = eVChargingDecorator8.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: 1, Location: hi!, Lot: ", "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        java.lang.Class<?> wildcardClass22 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(35, "hi!", "Parking Spot ID: -1, Location: , Lot: ");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.Class<?> wildcardClass5 = eVChargingDecorator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "", "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: ");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator4);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator5);
        java.lang.String str7 = eVChargingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available, EV Charging Available" + "'", str7, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator11);
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator12);
        parking.EVChargingDecorator eVChargingDecorator14 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        java.lang.Class<?> wildcardClass15 = coveredParkingDecorator13.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(35, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking", "Parking Spot ID: -1, Location: , Lot: , EV Charging Available, Covered Parking");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str6 = eVChargingDecorator5.getLocation();
        java.lang.String str7 = eVChargingDecorator5.getDetails();
        java.lang.String str8 = eVChargingDecorator5.getDetails();
        java.lang.String str9 = eVChargingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator9);
        java.lang.Class<?> wildcardClass12 = handicapAccessDecorator11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.Class<?> wildcardClass9 = coveredParkingDecorator5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator9);
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        parking.EVChargingDecorator eVChargingDecorator12 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 100, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.Class<?> wildcardClass8 = coveredParkingDecorator7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getLocation();
        java.lang.String str7 = parkingSpot3.getLocation();
        java.lang.String str8 = parkingSpot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator11);
        int int13 = handicapAccessDecorator11.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        parking.CoveredParkingDecorator coveredParkingDecorator4 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str5 = coveredParkingDecorator4.getDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str5, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str13 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 100, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(100, "Parking Spot ID: -1, Location: , Lot: ", "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str9 = eVChargingDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str11 = handicapAccessDecorator10.getDetails();
        java.lang.String str12 = handicapAccessDecorator10.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator13 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator10);
        java.lang.Class<?> wildcardClass14 = handicapAccessDecorator10.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot15 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str16 = parkingSpot15.getDetails();
        java.lang.String str17 = parkingSpot15.getDetails();
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator(parkingSpot15);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator18);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator18);
        java.lang.String str21 = eVChargingDecorator20.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = coveredParkingDecorator5.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str14 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.Class<?> wildcardClass16 = coveredParkingDecorator15.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str8 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator10 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator9);
        java.lang.String str11 = coveredParkingDecorator10.getDetails();
        java.lang.Class<?> wildcardClass12 = coveredParkingDecorator10.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator20 = new parking.HandicapAccessDecorator(parkingSpot17);
        java.lang.String str21 = handicapAccessDecorator20.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator20);
        parking.EVChargingDecorator eVChargingDecorator23 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator20);
        int int24 = handicapAccessDecorator20.getId();
        java.lang.String str25 = handicapAccessDecorator20.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str21, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str25, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str4 = parkingSpot3.getDetails();
        java.lang.String str5 = parkingSpot3.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        java.util.List<parking.ParkingSpot> parkingSpotList13 = parkingLotManager0.getParkingSpots();
        java.lang.Class<?> wildcardClass14 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingSpotList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot3);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        java.lang.String str4 = parkingSpot3.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str4, "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        java.lang.String str9 = coveredParkingDecorator5.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str5 = eVChargingDecorator4.getDetails();
        java.lang.String str6 = eVChargingDecorator4.getDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available" + "'", str5, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available" + "'", str6, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str9 = handicapAccessDecorator8.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) '4', "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible", "hi!");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 100, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available, EV Charging Available, Covered Parking");
        java.lang.String str4 = parkingSpot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str4, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        java.lang.String str9 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot15 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str16 = parkingSpot15.getDetails();
        java.lang.String str17 = parkingSpot15.getDetails();
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator(parkingSpot15);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator18);
        java.lang.Class<?> wildcardClass20 = eVChargingDecorator18.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getDetails();
        java.lang.String str7 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator(parkingSpot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str6, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingLotManager parkingLotManager14 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str19 = parkingSpot18.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot18);
        java.lang.String str21 = coveredParkingDecorator20.getDetails();
        parking.EVChargingDecorator eVChargingDecorator22 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        parkingLotManager14.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        java.lang.String str25 = eVChargingDecorator22.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator26 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator22);
        java.lang.Class<?> wildcardClass27 = eVChargingDecorator22.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingLotManager14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str25, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        java.lang.String str5 = parkingSpot3.getLocation();
        java.lang.String str6 = parkingSpot3.getParkingLot();
        int int7 = parkingSpot3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 0, "", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        parking.HandicapAccessDecorator handicapAccessDecorator4 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str6 = handicapAccessDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str6, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        int int7 = parkingSpot3.getId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((int) (short) 0, "", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        parking.HandicapAccessDecorator handicapAccessDecorator19 = new parking.HandicapAccessDecorator(parkingSpot18);
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator19);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        java.lang.Class<?> wildcardClass22 = coveredParkingDecorator20.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        java.lang.String str7 = parkingSpot4.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator(parkingSpot4);
        java.lang.String str9 = parkingSpot4.getDetails();
        java.lang.String str10 = parkingSpot4.getParkingLot();
        int int11 = parkingSpot4.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator9);
        java.lang.String str12 = handicapAccessDecorator9.getDetails();
        java.lang.String str13 = handicapAccessDecorator9.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager12 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot16 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager12.addParkingSpot(parkingSpot16);
        java.lang.String str18 = parkingSpot16.getDetails();
        parking.EVChargingDecorator eVChargingDecorator19 = new parking.EVChargingDecorator(parkingSpot16);
        java.lang.String str20 = eVChargingDecorator19.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator21 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator19);
        java.lang.String str22 = handicapAccessDecorator21.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator21);
        java.lang.String str24 = handicapAccessDecorator21.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(parkingLotManager12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str18, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str22, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        parking.HandicapAccessDecorator handicapAccessDecorator4 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str5 = handicapAccessDecorator4.getDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Lot: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Handicap Accessible" + "'", str5, "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Lot: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        java.lang.String str11 = handicapAccessDecorator9.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList15 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot19 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str20 = parkingSpot19.getParkingLot();
        java.lang.String str21 = parkingSpot19.getDetails();
        parkingLotManager0.addParkingSpot(parkingSpot19);
        parking.ParkingSpot parkingSpot26 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str27 = parkingSpot26.getDetails();
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator(parkingSpot26);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator28);
        parking.ParkingLotManager parkingLotManager30 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot34 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager30.addParkingSpot(parkingSpot34);
        parking.ParkingSpot parkingSpot39 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str40 = parkingSpot39.getLocation();
        java.lang.String str41 = parkingSpot39.getLocation();
        parkingLotManager30.addParkingSpot(parkingSpot39);
        parking.ParkingLotManager parkingLotManager43 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot47 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager43.addParkingSpot(parkingSpot47);
        java.lang.String str49 = parkingSpot47.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator50 = new parking.CoveredParkingDecorator(parkingSpot47);
        parkingLotManager30.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator50);
        parking.ParkingSpot parkingSpot55 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str56 = parkingSpot55.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator57 = new parking.CoveredParkingDecorator(parkingSpot55);
        parking.HandicapAccessDecorator handicapAccessDecorator58 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator57);
        int int59 = handicapAccessDecorator58.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator60 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator58);
        parkingLotManager30.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator58);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator58);
        java.lang.Class<?> wildcardClass63 = handicapAccessDecorator58.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str21, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingLotManager30);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(parkingLotManager43);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getLocation();
        int int11 = eVChargingDecorator8.getId();
        parking.EVChargingDecorator eVChargingDecorator12 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator12);
        java.lang.String str14 = eVChargingDecorator13.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.Class<?> wildcardClass7 = coveredParkingDecorator6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.Class<?> wildcardClass11 = handicapAccessDecorator10.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str9 = eVChargingDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str11 = handicapAccessDecorator10.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator10);
        java.lang.String str13 = handicapAccessDecorator10.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str13, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str8 = parkingSpot4.getDetails();
        java.lang.String str9 = parkingSpot4.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str8 = eVChargingDecorator7.getDetails();
        java.lang.String str9 = eVChargingDecorator7.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((-1), "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: ");
        parkingLotManager0.addParkingSpot(parkingSpot18);
        java.lang.String str20 = parkingSpot18.getDetails();
        int int21 = parkingSpot18.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: " + "'", str20, "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str9 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        java.lang.String str11 = coveredParkingDecorator5.getDetails();
        java.lang.String str12 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str14 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) -1, "Parking Spot ID: 97, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available", "");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = coveredParkingDecorator5.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str14 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator16 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str17 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str17, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator20 = new parking.HandicapAccessDecorator(parkingSpot17);
        java.lang.String str21 = handicapAccessDecorator20.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator20);
        parking.EVChargingDecorator eVChargingDecorator23 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator20);
        java.lang.Class<?> wildcardClass24 = eVChargingDecorator23.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str21, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str18 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot17);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        java.util.List<parking.ParkingSpot> parkingSpotList23 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot27 = new parking.ParkingSpot((int) (byte) 100, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available, EV Charging Available, Covered Parking");
        parkingLotManager0.addParkingSpot(parkingSpot27);
        java.lang.Class<?> wildcardClass29 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpotList23);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        parking.ParkingSpot parkingSpot25 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str26 = parkingSpot25.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator27 = new parking.CoveredParkingDecorator(parkingSpot25);
        parking.HandicapAccessDecorator handicapAccessDecorator28 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        int int29 = handicapAccessDecorator28.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator30 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator28);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator28);
        parking.HandicapAccessDecorator handicapAccessDecorator32 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator28);
        java.lang.String str33 = handicapAccessDecorator32.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList15 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot19 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str20 = parkingSpot19.getParkingLot();
        java.lang.String str21 = parkingSpot19.getDetails();
        parkingLotManager0.addParkingSpot(parkingSpot19);
        parking.ParkingSpot parkingSpot26 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str27 = parkingSpot26.getDetails();
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator(parkingSpot26);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator28);
        java.lang.Class<?> wildcardClass30 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str21, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingLotManager parkingLotManager14 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str19 = parkingSpot18.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot18);
        java.lang.String str21 = coveredParkingDecorator20.getDetails();
        parking.EVChargingDecorator eVChargingDecorator22 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        parkingLotManager14.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        parking.ParkingSpot parkingSpot28 = new parking.ParkingSpot(100, "Parking Spot ID: 1, Location: hi!, Lot: hi!", "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        parkingLotManager0.addParkingSpot(parkingSpot28);
        java.lang.String str30 = parkingSpot28.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingLotManager14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: 100, Location: Parking Spot ID: 1, Location: hi!, Lot: hi!, Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str30, "Parking Spot ID: 100, Location: Parking Spot ID: 1, Location: hi!, Lot: hi!, Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.Class<?> wildcardClass9 = handicapAccessDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        java.lang.String str10 = eVChargingDecorator8.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = coveredParkingDecorator5.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str14 = coveredParkingDecorator13.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        java.lang.String str7 = parkingSpot4.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator(parkingSpot4);
        java.lang.String str9 = parkingSpot4.getParkingLot();
        java.lang.Class<?> wildcardClass10 = parkingSpot4.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.lang.String str14 = parkingSpot11.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator15 = new parking.HandicapAccessDecorator(parkingSpot11);
        java.lang.String str16 = handicapAccessDecorator15.getParkingLot();
        int int17 = handicapAccessDecorator15.getId();
        java.lang.String str18 = handicapAccessDecorator15.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator5);
        java.lang.String str8 = eVChargingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator5);
        java.lang.String str10 = eVChargingDecorator5.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str8 = coveredParkingDecorator7.getParkingLot();
        int int9 = coveredParkingDecorator7.getId();
        java.lang.String str10 = coveredParkingDecorator7.getDetails();
        java.lang.String str11 = coveredParkingDecorator7.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str8 = eVChargingDecorator6.getDetails();
        java.lang.Class<?> wildcardClass9 = eVChargingDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str14 = coveredParkingDecorator13.getDetails();
        java.lang.String str15 = coveredParkingDecorator13.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getLocation();
        java.lang.String str7 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator(parkingSpot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(97, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator11);
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator12);
        parking.EVChargingDecorator eVChargingDecorator14 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        java.lang.String str15 = eVChargingDecorator14.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator16 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator14);
        java.lang.Class<?> wildcardClass17 = eVChargingDecorator14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, Covered Parking, EV Charging Available" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking, EV Charging Available");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(97, "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible", "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        java.lang.Class<?> wildcardClass4 = parkingSpot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        parking.CoveredParkingDecorator coveredParkingDecorator22 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        parking.CoveredParkingDecorator coveredParkingDecorator23 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        java.lang.Class<?> wildcardClass24 = coveredParkingDecorator20.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        java.lang.String str7 = handicapAccessDecorator5.getDetails();
        int int8 = handicapAccessDecorator5.getId();
        java.lang.Class<?> wildcardClass9 = handicapAccessDecorator5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) '#', "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: ", "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 100, "Parking Spot ID: -1, Location: , Lot: , EV Charging Available, Covered Parking", "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        parking.ParkingSpot parkingSpot13 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str14 = parkingSpot13.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator(parkingSpot13);
        parking.EVChargingDecorator eVChargingDecorator16 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator15);
        parking.EVChargingDecorator eVChargingDecorator17 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator16);
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator16);
        java.lang.String str19 = eVChargingDecorator16.getDetails();
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator16);
        java.lang.String str21 = eVChargingDecorator20.getDetails();
        java.lang.String str22 = eVChargingDecorator20.getDetails();
        parking.EVChargingDecorator eVChargingDecorator23 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parking.CoveredParkingDecorator coveredParkingDecorator24 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator23);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator24);
        java.lang.String str26 = coveredParkingDecorator24.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str19, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str22, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str9 = eVChargingDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.Class<?> wildcardClass11 = eVChargingDecorator7.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        java.lang.String str8 = coveredParkingDecorator5.getLocation();
        parking.EVChargingDecorator eVChargingDecorator9 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        java.util.List<parking.ParkingSpot> parkingSpotList1 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList2 = parkingLotManager0.getParkingSpots();
        java.lang.Class<?> wildcardClass3 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList1);
        org.junit.Assert.assertNotNull(parkingSpotList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getLocation();
        int int11 = eVChargingDecorator8.getId();
        parking.EVChargingDecorator eVChargingDecorator12 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str13 = eVChargingDecorator12.getDetails();
        java.lang.String str14 = eVChargingDecorator12.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str11 = eVChargingDecorator10.getDetails();
        java.lang.String str12 = eVChargingDecorator10.getDetails();
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator13);
        java.lang.String str15 = eVChargingDecorator13.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str9 = handicapAccessDecorator6.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str11 = handicapAccessDecorator10.getDetails();
        java.lang.String str12 = handicapAccessDecorator10.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator(parkingSpot4);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator7);
        java.lang.String str9 = handicapAccessDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getDetails();
        java.lang.Class<?> wildcardClass7 = parkingSpot3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str6, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) 'a', "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        java.lang.String str8 = coveredParkingDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str9 = parkingSpot4.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str12 = eVChargingDecorator11.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        java.lang.String str10 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.HandicapAccessDecorator handicapAccessDecorator13 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str14 = handicapAccessDecorator13.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str14, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        java.lang.String str8 = eVChargingDecorator7.getDetails();
        java.lang.String str9 = eVChargingDecorator7.getDetails();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking, EV Charging Available" + "'", str8, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.Class<?> wildcardClass9 = parkingSpot4.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        java.util.List<parking.ParkingSpot> parkingSpotList22 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot26 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str27 = parkingSpot26.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator28 = new parking.HandicapAccessDecorator(parkingSpot26);
        parking.HandicapAccessDecorator handicapAccessDecorator29 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator28);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator29);
        parking.ParkingLotManager parkingLotManager31 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot35 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager31.addParkingSpot(parkingSpot35);
        java.lang.String str37 = parkingSpot35.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator38 = new parking.CoveredParkingDecorator(parkingSpot35);
        java.lang.String str39 = coveredParkingDecorator38.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator38);
        java.lang.Class<?> wildcardClass41 = coveredParkingDecorator38.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingLotManager31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str39, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        java.lang.String str4 = parkingSpot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str4, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        java.lang.String str10 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str13 = coveredParkingDecorator12.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot15 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str16 = parkingSpot15.getDetails();
        java.lang.String str17 = parkingSpot15.getDetails();
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator(parkingSpot15);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator18);
        parking.ParkingLotManager parkingLotManager20 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot24 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager20.addParkingSpot(parkingSpot24);
        java.lang.String str26 = parkingSpot24.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator27 = new parking.CoveredParkingDecorator(parkingSpot24);
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator27);
        java.lang.String str30 = coveredParkingDecorator27.getDetails();
        int int31 = coveredParkingDecorator27.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator32 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingLotManager20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str30, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator(parkingSpot11);
        java.lang.String str14 = coveredParkingDecorator13.getDetails();
        parking.EVChargingDecorator eVChargingDecorator15 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        java.lang.String str16 = coveredParkingDecorator13.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator17 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        java.lang.String str18 = coveredParkingDecorator13.getDetails();
        parking.EVChargingDecorator eVChargingDecorator19 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator13);
        java.lang.String str21 = coveredParkingDecorator13.getDetails();
        java.lang.String str22 = coveredParkingDecorator13.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator23 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str18, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        java.lang.String str8 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str9 = coveredParkingDecorator5.getLocation();
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        java.lang.String str11 = coveredParkingDecorator5.getDetails();
        java.lang.String str12 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        java.lang.String str9 = coveredParkingDecorator5.getDetails();
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        java.lang.String str11 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str11 = eVChargingDecorator10.getDetails();
        java.lang.String str12 = eVChargingDecorator10.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str18 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot17);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        java.util.List<parking.ParkingSpot> parkingSpotList23 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot27 = new parking.ParkingSpot((int) (byte) 100, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available, EV Charging Available, Covered Parking");
        parkingLotManager0.addParkingSpot(parkingSpot27);
        java.util.List<parking.ParkingSpot> parkingSpotList29 = parkingLotManager0.getParkingSpots();
        java.lang.Class<?> wildcardClass30 = parkingSpotList29.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpotList23);
        org.junit.Assert.assertNotNull(parkingSpotList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator(parkingSpot4);
        java.lang.String str8 = handicapAccessDecorator7.getDetails();
        java.lang.String str9 = handicapAccessDecorator7.getParkingLot();
        java.lang.String str10 = handicapAccessDecorator7.getDetails();
        java.lang.String str11 = handicapAccessDecorator7.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator11);
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator12);
        parking.EVChargingDecorator eVChargingDecorator14 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        java.lang.String str15 = eVChargingDecorator14.getDetails();
        int int16 = eVChargingDecorator14.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, Covered Parking, EV Charging Available" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, Covered Parking, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        java.lang.String str11 = handicapAccessDecorator9.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str10 = eVChargingDecorator7.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator7);
        java.util.List<parking.ParkingSpot> parkingSpotList12 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList13 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(parkingSpotList12);
        org.junit.Assert.assertNotNull(parkingSpotList13);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getLocation();
        java.lang.Class<?> wildcardClass12 = eVChargingDecorator8.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 100, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        java.lang.String str4 = parkingSpot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str4, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str18 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot17);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        parking.CoveredParkingDecorator coveredParkingDecorator23 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator21);
        parking.CoveredParkingDecorator coveredParkingDecorator24 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator21);
        java.lang.String str25 = coveredParkingDecorator24.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Covered Parking" + "'", str25, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Covered Parking");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(35, "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: ");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        java.lang.String str11 = coveredParkingDecorator5.getLocation();
        int int12 = coveredParkingDecorator5.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str9 = handicapAccessDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getLocation();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        java.lang.String str13 = eVChargingDecorator8.getParkingLot();
        java.lang.String str14 = eVChargingDecorator8.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingLotManager parkingLotManager14 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str19 = parkingSpot18.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot18);
        java.lang.String str21 = coveredParkingDecorator20.getDetails();
        parking.EVChargingDecorator eVChargingDecorator22 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        parkingLotManager14.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        java.lang.String str25 = eVChargingDecorator22.getDetails();
        java.lang.String str26 = eVChargingDecorator22.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingLotManager14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str25, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = coveredParkingDecorator5.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str14 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int16 = coveredParkingDecorator15.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 0, "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: ", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: 100, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        java.lang.Class<?> wildcardClass4 = parkingSpot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = coveredParkingDecorator5.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str14 = coveredParkingDecorator5.getDetails();
        java.lang.String str15 = coveredParkingDecorator5.getDetails();
        java.lang.String str16 = coveredParkingDecorator5.getDetails();
        java.lang.String str17 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str17, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) -1, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Covered Parking", "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.Class<?> wildcardClass8 = handicapAccessDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str10 = handicapAccessDecorator6.getDetails();
        java.lang.String str11 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.String str10 = coveredParkingDecorator8.getDetails();
        java.lang.String str11 = coveredParkingDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str11 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str12 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList15 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager16 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot20 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str21 = parkingSpot20.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator22 = new parking.CoveredParkingDecorator(parkingSpot20);
        java.lang.String str23 = coveredParkingDecorator22.getDetails();
        parking.EVChargingDecorator eVChargingDecorator24 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator22);
        parkingLotManager16.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        java.lang.String str26 = eVChargingDecorator24.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        java.util.List<parking.ParkingSpot> parkingSpotList28 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList29 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList30 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
        org.junit.Assert.assertNotNull(parkingLotManager16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(parkingSpotList28);
        org.junit.Assert.assertNotNull(parkingSpotList29);
        org.junit.Assert.assertNotNull(parkingSpotList30);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = eVChargingDecorator6.getDetails();
        java.lang.String str8 = eVChargingDecorator6.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        java.lang.String str9 = handicapAccessDecorator6.getDetails();
        java.lang.Class<?> wildcardClass10 = handicapAccessDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.Class<?> wildcardClass10 = coveredParkingDecorator9.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str9 = coveredParkingDecorator8.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator10 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.String str12 = coveredParkingDecorator8.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList7 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator(parkingSpot11);
        java.lang.String str14 = coveredParkingDecorator13.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        parking.HandicapAccessDecorator handicapAccessDecorator16 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator13);
        java.lang.String str18 = coveredParkingDecorator13.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingSpotList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str18, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str8 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str9 = coveredParkingDecorator5.getParkingLot();
        int int10 = coveredParkingDecorator5.getId();
        java.lang.String str11 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        java.lang.String str5 = parkingSpot3.getParkingLot();
        java.lang.String str6 = parkingSpot3.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str8 = handicapAccessDecorator7.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList7 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList8 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager9 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot13 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager9.addParkingSpot(parkingSpot13);
        java.lang.String str15 = parkingSpot13.getDetails();
        parking.EVChargingDecorator eVChargingDecorator16 = new parking.EVChargingDecorator(parkingSpot13);
        parking.HandicapAccessDecorator handicapAccessDecorator17 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator16);
        java.lang.String str18 = eVChargingDecorator16.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator16);
        parking.ParkingSpot parkingSpot23 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str24 = parkingSpot23.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator25 = new parking.CoveredParkingDecorator(parkingSpot23);
        parking.EVChargingDecorator eVChargingDecorator26 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator25);
        parking.EVChargingDecorator eVChargingDecorator27 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator26);
        java.lang.String str28 = eVChargingDecorator26.getLocation();
        int int29 = eVChargingDecorator26.getId();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator26);
        parking.ParkingSpot parkingSpot34 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str35 = parkingSpot34.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator36 = new parking.CoveredParkingDecorator(parkingSpot34);
        parking.EVChargingDecorator eVChargingDecorator37 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator36);
        parking.EVChargingDecorator eVChargingDecorator38 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator37);
        java.lang.String str39 = eVChargingDecorator37.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator37);
        parking.EVChargingDecorator eVChargingDecorator41 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator37);
        java.lang.Class<?> wildcardClass42 = eVChargingDecorator41.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingSpotList7);
        org.junit.Assert.assertNotNull(parkingSpotList8);
        org.junit.Assert.assertNotNull(parkingLotManager9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str18, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str39, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = handicapAccessDecorator7.getParkingLot();
        java.lang.String str9 = handicapAccessDecorator7.getDetails();
        java.lang.String str10 = handicapAccessDecorator7.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot15 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str16 = parkingSpot15.getDetails();
        java.lang.String str17 = parkingSpot15.getDetails();
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator(parkingSpot15);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator18);
        parking.ParkingLotManager parkingLotManager20 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot24 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager20.addParkingSpot(parkingSpot24);
        java.lang.String str26 = parkingSpot24.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator27 = new parking.CoveredParkingDecorator(parkingSpot24);
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator27);
        java.lang.String str30 = coveredParkingDecorator27.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator31 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        java.lang.Class<?> wildcardClass32 = coveredParkingDecorator27.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingLotManager20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str30, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        int int6 = parkingSpot3.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str8 = handicapAccessDecorator7.getDetails();
        java.lang.Class<?> wildcardClass9 = handicapAccessDecorator7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        int int10 = eVChargingDecorator8.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 10, "", "Parking Spot ID: 97, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str8 = eVChargingDecorator7.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str10 = eVChargingDecorator7.getDetails();
        java.lang.String str11 = eVChargingDecorator7.getDetails();
        java.lang.String str12 = eVChargingDecorator7.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 100, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available, EV Charging Available, Covered Parking");
        parking.HandicapAccessDecorator handicapAccessDecorator4 = new parking.HandicapAccessDecorator(parkingSpot3);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot15 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str16 = parkingSpot15.getDetails();
        java.lang.String str17 = parkingSpot15.getDetails();
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator(parkingSpot15);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator18);
        parking.ParkingLotManager parkingLotManager20 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot24 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager20.addParkingSpot(parkingSpot24);
        java.lang.String str26 = parkingSpot24.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator27 = new parking.CoveredParkingDecorator(parkingSpot24);
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator27);
        java.lang.String str30 = coveredParkingDecorator27.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator31 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        java.lang.String str32 = handicapAccessDecorator31.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingLotManager20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str30, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str32, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        java.util.List<parking.ParkingSpot> parkingSpotList12 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot16 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str17 = parkingSpot16.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator18 = new parking.CoveredParkingDecorator(parkingSpot16);
        java.lang.String str19 = coveredParkingDecorator18.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator18);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        java.lang.String str22 = coveredParkingDecorator20.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(parkingSpotList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str19, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str22, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str19 = parkingSpot18.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot18);
        java.lang.String str21 = coveredParkingDecorator20.getDetails();
        parking.EVChargingDecorator eVChargingDecorator22 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        java.lang.String str23 = coveredParkingDecorator20.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator24 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        java.util.List<parking.ParkingSpot> parkingSpotList26 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot30 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator31 = new parking.EVChargingDecorator(parkingSpot30);
        parking.EVChargingDecorator eVChargingDecorator32 = new parking.EVChargingDecorator(parkingSpot30);
        parking.CoveredParkingDecorator coveredParkingDecorator33 = new parking.CoveredParkingDecorator(parkingSpot30);
        parkingLotManager0.addParkingSpot(parkingSpot30);
        parking.ParkingLotManager parkingLotManager35 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot39 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str40 = parkingSpot39.getLocation();
        java.lang.String str41 = parkingSpot39.getLocation();
        parkingLotManager35.addParkingSpot(parkingSpot39);
        parking.ParkingSpot parkingSpot46 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str47 = parkingSpot46.getLocation();
        parkingLotManager35.addParkingSpot(parkingSpot46);
        parking.ParkingLotManager parkingLotManager49 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot53 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str54 = parkingSpot53.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator55 = new parking.CoveredParkingDecorator(parkingSpot53);
        java.lang.String str56 = coveredParkingDecorator55.getDetails();
        parking.EVChargingDecorator eVChargingDecorator57 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator55);
        parkingLotManager49.addParkingSpot((parking.ParkingSpot) eVChargingDecorator57);
        parkingLotManager35.addParkingSpot((parking.ParkingSpot) eVChargingDecorator57);
        java.lang.String str60 = eVChargingDecorator57.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator57);
        java.lang.String str62 = eVChargingDecorator57.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList26);
        org.junit.Assert.assertNotNull(parkingLotManager35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(parkingLotManager49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str56, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str60, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str62, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str9 = eVChargingDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str11 = handicapAccessDecorator10.getDetails();
        java.lang.String str12 = handicapAccessDecorator10.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator13 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator10);
        java.lang.String str14 = handicapAccessDecorator13.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        java.lang.String str4 = parkingSpot3.getDetails();
        java.lang.String str5 = parkingSpot3.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str4, "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str5, "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str9 = eVChargingDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str11 = handicapAccessDecorator10.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator10);
        java.lang.String str13 = handicapAccessDecorator12.getLocation();
        java.lang.String str14 = handicapAccessDecorator12.getDetails();
        java.lang.String str15 = handicapAccessDecorator12.getLocation();
        java.lang.String str16 = handicapAccessDecorator12.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible" + "'", str14, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        java.lang.String str11 = coveredParkingDecorator5.getDetails();
        java.lang.String str12 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str14 = eVChargingDecorator13.getDetails();
        java.lang.Class<?> wildcardClass15 = eVChargingDecorator13.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        java.lang.String str11 = coveredParkingDecorator5.getDetails();
        java.lang.String str12 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str14 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator15 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator16 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str17 = coveredParkingDecorator16.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str8 = eVChargingDecorator6.getLocation();
        java.lang.String str9 = eVChargingDecorator6.getDetails();
        int int10 = eVChargingDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str12 = handicapAccessDecorator11.getDetails();
        java.lang.Class<?> wildcardClass13 = handicapAccessDecorator11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = coveredParkingDecorator5.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str14 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator16 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str17 = coveredParkingDecorator5.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator18 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str8 = parkingSpot4.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator(parkingSpot4);
        java.lang.String str10 = parkingSpot4.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager12 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot16 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager12.addParkingSpot(parkingSpot16);
        java.lang.String str18 = parkingSpot16.getDetails();
        parking.EVChargingDecorator eVChargingDecorator19 = new parking.EVChargingDecorator(parkingSpot16);
        java.lang.String str20 = eVChargingDecorator19.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator21 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator19);
        java.lang.String str22 = handicapAccessDecorator21.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator21);
        java.util.List<parking.ParkingSpot> parkingSpotList24 = parkingLotManager0.getParkingSpots();
        java.lang.Class<?> wildcardClass25 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(parkingLotManager12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str18, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str22, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertNotNull(parkingSpotList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator11);
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator12);
        java.lang.String str14 = coveredParkingDecorator13.getParkingLot();
        java.lang.String str15 = coveredParkingDecorator13.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str8 = eVChargingDecorator6.getLocation();
        java.lang.String str9 = eVChargingDecorator6.getDetails();
        java.lang.String str10 = eVChargingDecorator6.getDetails();
        java.lang.String str11 = eVChargingDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator12 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str13 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking", "Parking Spot ID: -1, Location: , Lot: ");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str4, "Parking Spot ID: -1, Location: , Lot: ");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        int int5 = parkingSpot3.getId();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        java.lang.String str9 = coveredParkingDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList15 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager16 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot20 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str21 = parkingSpot20.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator22 = new parking.CoveredParkingDecorator(parkingSpot20);
        java.lang.String str23 = coveredParkingDecorator22.getDetails();
        parking.EVChargingDecorator eVChargingDecorator24 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator22);
        parkingLotManager16.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        java.lang.String str26 = eVChargingDecorator24.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        parking.HandicapAccessDecorator handicapAccessDecorator28 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator24);
        int int29 = handicapAccessDecorator28.getId();
        java.lang.String str30 = handicapAccessDecorator28.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
        org.junit.Assert.assertNotNull(parkingLotManager16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str13 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getLocation();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        java.lang.String str13 = eVChargingDecorator8.getDetails();
        java.lang.Class<?> wildcardClass14 = eVChargingDecorator8.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = coveredParkingDecorator5.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.Class<?> wildcardClass14 = coveredParkingDecorator13.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        parking.ParkingSpot parkingSpot0 = null;
        // The following exception was thrown during execution in test generation
        try {
            parking.HandicapAccessDecorator handicapAccessDecorator1 = new parking.HandicapAccessDecorator(parkingSpot0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parking.ParkingSpot.getId()\" because \"decoratedParkingSpot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot10 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str11 = parkingSpot10.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator(parkingSpot10);
        java.lang.String str13 = coveredParkingDecorator12.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator12);
        java.lang.String str15 = coveredParkingDecorator14.getDetails();
        java.lang.String str16 = coveredParkingDecorator14.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator14);
        java.lang.Class<?> wildcardClass18 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList7 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList8 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager9 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot13 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager9.addParkingSpot(parkingSpot13);
        java.lang.String str15 = parkingSpot13.getDetails();
        parking.EVChargingDecorator eVChargingDecorator16 = new parking.EVChargingDecorator(parkingSpot13);
        parking.HandicapAccessDecorator handicapAccessDecorator17 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator16);
        java.lang.String str18 = eVChargingDecorator16.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator16);
        int int20 = eVChargingDecorator16.getId();
        java.lang.Class<?> wildcardClass21 = eVChargingDecorator16.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingSpotList7);
        org.junit.Assert.assertNotNull(parkingSpotList8);
        org.junit.Assert.assertNotNull(parkingLotManager9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str18, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList15 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot19 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str20 = parkingSpot19.getParkingLot();
        java.lang.String str21 = parkingSpot19.getDetails();
        parkingLotManager0.addParkingSpot(parkingSpot19);
        parking.ParkingSpot parkingSpot26 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str27 = parkingSpot26.getDetails();
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator(parkingSpot26);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator28);
        java.util.List<parking.ParkingSpot> parkingSpotList30 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList31 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str21, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingSpotList30);
        org.junit.Assert.assertNotNull(parkingSpotList31);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        java.util.List<parking.ParkingSpot> parkingSpotList22 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot26 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str27 = parkingSpot26.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator28 = new parking.HandicapAccessDecorator(parkingSpot26);
        parking.HandicapAccessDecorator handicapAccessDecorator29 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator28);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator29);
        parking.ParkingSpot parkingSpot34 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str35 = parkingSpot34.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator36 = new parking.CoveredParkingDecorator(parkingSpot34);
        java.lang.String str37 = coveredParkingDecorator36.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator38 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator36);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator36);
        parking.CoveredParkingDecorator coveredParkingDecorator40 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator36);
        int int41 = coveredParkingDecorator40.getId();
        int int42 = coveredParkingDecorator40.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str37, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str10 = coveredParkingDecorator7.getLocation();
        java.lang.String str11 = coveredParkingDecorator7.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getLocation();
        java.lang.String str11 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = coveredParkingDecorator8.getDetails();
        java.lang.String str10 = coveredParkingDecorator8.getParkingLot();
        java.lang.String str11 = coveredParkingDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 0, "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible", "");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        java.lang.String str7 = handicapAccessDecorator5.getDetails();
        int int8 = handicapAccessDecorator5.getId();
        parking.EVChargingDecorator eVChargingDecorator9 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        java.lang.Class<?> wildcardClass10 = eVChargingDecorator9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.Class<?> wildcardClass8 = handicapAccessDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str10 = eVChargingDecorator7.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator7);
        parking.ParkingSpot parkingSpot15 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str16 = parkingSpot15.getLocation();
        parking.EVChargingDecorator eVChargingDecorator17 = new parking.EVChargingDecorator(parkingSpot15);
        parking.HandicapAccessDecorator handicapAccessDecorator18 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator17);
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator17);
        java.lang.String str20 = eVChargingDecorator17.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator21 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator21);
        parking.ParkingSpot parkingSpot23 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingLotManager0.addParkingSpot(parkingSpot23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parking.ParkingSpot.getId()\" because \"spot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str20, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(35, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available, EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.lang.String str14 = parkingSpot11.getParkingLot();
        parking.EVChargingDecorator eVChargingDecorator15 = new parking.EVChargingDecorator(parkingSpot11);
        java.lang.String str16 = parkingSpot11.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator17 = new parking.CoveredParkingDecorator(parkingSpot11);
        java.lang.String str18 = parkingSpot11.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str16, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getLocation();
        java.lang.String str11 = eVChargingDecorator8.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str10 = eVChargingDecorator7.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator7);
        java.util.List<parking.ParkingSpot> parkingSpotList12 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot16 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str17 = parkingSpot16.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator18 = new parking.CoveredParkingDecorator(parkingSpot16);
        java.lang.String str19 = coveredParkingDecorator18.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator20 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator18);
        java.lang.String str21 = handicapAccessDecorator20.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator22 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator20);
        java.lang.String str23 = handicapAccessDecorator20.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator20);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(parkingSpotList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str19, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = eVChargingDecorator6.getDetails();
        java.lang.String str8 = eVChargingDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str9 = eVChargingDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str11 = handicapAccessDecorator10.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator10);
        int int13 = handicapAccessDecorator10.getId();
        java.lang.Class<?> wildcardClass14 = handicapAccessDecorator10.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str8 = eVChargingDecorator7.getDetails();
        int int9 = eVChargingDecorator7.getId();
        java.lang.Class<?> wildcardClass10 = eVChargingDecorator7.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList7 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList8 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager9 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot13 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager9.addParkingSpot(parkingSpot13);
        java.lang.String str15 = parkingSpot13.getDetails();
        parking.EVChargingDecorator eVChargingDecorator16 = new parking.EVChargingDecorator(parkingSpot13);
        parking.HandicapAccessDecorator handicapAccessDecorator17 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator16);
        java.lang.String str18 = eVChargingDecorator16.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator16);
        parking.ParkingSpot parkingSpot23 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str24 = parkingSpot23.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator25 = new parking.CoveredParkingDecorator(parkingSpot23);
        parking.EVChargingDecorator eVChargingDecorator26 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator25);
        parking.EVChargingDecorator eVChargingDecorator27 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator26);
        java.lang.String str28 = eVChargingDecorator26.getLocation();
        int int29 = eVChargingDecorator26.getId();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator26);
        parking.ParkingLotManager parkingLotManager31 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot35 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager31.addParkingSpot(parkingSpot35);
        parking.ParkingSpot parkingSpot40 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str41 = parkingSpot40.getParkingLot();
        parkingLotManager31.addParkingSpot(parkingSpot40);
        parking.ParkingSpot parkingSpot46 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str47 = parkingSpot46.getDetails();
        java.lang.String str48 = parkingSpot46.getDetails();
        parking.EVChargingDecorator eVChargingDecorator49 = new parking.EVChargingDecorator(parkingSpot46);
        parkingLotManager31.addParkingSpot((parking.ParkingSpot) eVChargingDecorator49);
        parking.ParkingLotManager parkingLotManager51 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot55 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager51.addParkingSpot(parkingSpot55);
        java.lang.String str57 = parkingSpot55.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator58 = new parking.CoveredParkingDecorator(parkingSpot55);
        parking.EVChargingDecorator eVChargingDecorator59 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator58);
        parkingLotManager31.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator58);
        java.lang.String str61 = coveredParkingDecorator58.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator62 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator58);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator62);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingSpotList7);
        org.junit.Assert.assertNotNull(parkingSpotList8);
        org.junit.Assert.assertNotNull(parkingLotManager9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str18, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(parkingLotManager31);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str47, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str48, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingLotManager51);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str61, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str8 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator10 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator9);
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator9);
        java.lang.Class<?> wildcardClass12 = handicapAccessDecorator11.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator9);
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator11);
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator12);
        parking.HandicapAccessDecorator handicapAccessDecorator14 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        java.lang.String str15 = coveredParkingDecorator13.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Handicap Accessible, Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Handicap Accessible, Covered Parking");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getDetails();
        java.lang.String str7 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str9 = eVChargingDecorator8.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str6, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str7, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        java.lang.String str10 = coveredParkingDecorator7.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        java.lang.String str8 = handicapAccessDecorator6.getParkingLot();
        java.lang.String str9 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.HandicapAccessDecorator handicapAccessDecorator4 = new parking.HandicapAccessDecorator(parkingSpot3);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        java.lang.String str5 = parkingSpot3.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(32, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        java.lang.Class<?> wildcardClass4 = parkingSpot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot16 = new parking.ParkingSpot((-1), "", "");
        parkingLotManager0.addParkingSpot(parkingSpot16);
        java.lang.String str18 = parkingSpot16.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator19 = new parking.HandicapAccessDecorator(parkingSpot16);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator19);
        java.lang.String str21 = eVChargingDecorator20.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, EV Charging Available" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, EV Charging Available");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager7 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager7.addParkingSpot(parkingSpot11);
        java.lang.String str13 = parkingSpot11.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator(parkingSpot11);
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator(parkingSpot11);
        parking.HandicapAccessDecorator handicapAccessDecorator16 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator15);
        java.lang.String str17 = handicapAccessDecorator16.getLocation();
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator16);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator16);
        java.util.List<parking.ParkingSpot> parkingSpotList20 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingLotManager7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList20);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        int int7 = parkingSpot4.getId();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getParkingLot();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: 100, Location: Parking Spot ID: 1, Location: hi!, Lot: hi!, Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.lang.String str14 = parkingSpot11.getParkingLot();
        parking.EVChargingDecorator eVChargingDecorator15 = new parking.EVChargingDecorator(parkingSpot11);
        java.lang.String str16 = parkingSpot11.getDetails();
        java.lang.Class<?> wildcardClass17 = parkingSpot11.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str16, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str9 = eVChargingDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str11 = handicapAccessDecorator10.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator10);
        java.lang.String str13 = handicapAccessDecorator12.getDetails();
        parking.EVChargingDecorator eVChargingDecorator14 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator12);
        java.lang.String str15 = eVChargingDecorator14.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible" + "'", str13, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator(parkingSpot4);
        java.lang.String str8 = handicapAccessDecorator7.getDetails();
        java.lang.String str9 = handicapAccessDecorator7.getParkingLot();
        java.lang.String str10 = handicapAccessDecorator7.getDetails();
        int int11 = handicapAccessDecorator7.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getLocation();
        java.lang.String str13 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        int int7 = parkingSpot4.getId();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        int int9 = parkingSpot4.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        int int8 = coveredParkingDecorator5.getId();
        java.lang.Class<?> wildcardClass9 = coveredParkingDecorator5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 10, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, EV Charging Available");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str9 = parkingSpot4.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str12 = eVChargingDecorator11.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot10 = new parking.ParkingSpot((int) (short) 0, "", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator(parkingSpot10);
        java.lang.String str12 = parkingSpot10.getDetails();
        parkingLotManager0.addParkingSpot(parkingSpot10);
        parking.ParkingLotManager parkingLotManager14 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager14.addParkingSpot(parkingSpot18);
        java.lang.String str20 = parkingSpot18.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator21 = new parking.CoveredParkingDecorator(parkingSpot18);
        parking.EVChargingDecorator eVChargingDecorator22 = new parking.EVChargingDecorator(parkingSpot18);
        parking.EVChargingDecorator eVChargingDecorator23 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator22);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        java.lang.String str25 = eVChargingDecorator22.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str12, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingLotManager14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str25, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        java.util.List<parking.ParkingSpot> parkingSpotList1 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList2 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot6 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str7 = parkingSpot6.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator(parkingSpot6);
        java.lang.String str9 = coveredParkingDecorator8.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator10 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.String str11 = coveredParkingDecorator10.getDetails();
        java.lang.String str12 = coveredParkingDecorator10.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator10);
        java.lang.String str14 = coveredParkingDecorator10.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList1);
        org.junit.Assert.assertNotNull(parkingSpotList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        int int7 = parkingSpot4.getId();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator(parkingSpot4);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str8 = parkingSpot4.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: ");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        java.lang.String str7 = handicapAccessDecorator5.getDetails();
        java.lang.String str8 = handicapAccessDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        java.lang.String str10 = handicapAccessDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        java.lang.String str8 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str9 = coveredParkingDecorator5.getLocation();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str11 = eVChargingDecorator10.getParkingLot();
        java.lang.Class<?> wildcardClass12 = eVChargingDecorator10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        java.util.List<parking.ParkingSpot> parkingSpotList22 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList23 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager24 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot28 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str29 = parkingSpot28.getLocation();
        java.lang.String str30 = parkingSpot28.getLocation();
        parkingLotManager24.addParkingSpot(parkingSpot28);
        parking.ParkingSpot parkingSpot35 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str36 = parkingSpot35.getLocation();
        parkingLotManager24.addParkingSpot(parkingSpot35);
        parking.ParkingSpot parkingSpot41 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str42 = parkingSpot41.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator43 = new parking.CoveredParkingDecorator(parkingSpot41);
        parking.EVChargingDecorator eVChargingDecorator44 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator43);
        parking.EVChargingDecorator eVChargingDecorator45 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator44);
        parkingLotManager24.addParkingSpot((parking.ParkingSpot) eVChargingDecorator45);
        parking.CoveredParkingDecorator coveredParkingDecorator47 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator45);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator45);
        parking.ParkingLotManager parkingLotManager49 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot53 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager49.addParkingSpot(parkingSpot53);
        java.lang.String str55 = parkingSpot53.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator56 = new parking.CoveredParkingDecorator(parkingSpot53);
        parking.CoveredParkingDecorator coveredParkingDecorator57 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator56);
        parking.CoveredParkingDecorator coveredParkingDecorator58 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator57);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator57);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList22);
        org.junit.Assert.assertNotNull(parkingSpotList23);
        org.junit.Assert.assertNotNull(parkingLotManager24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(parkingLotManager49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator(parkingSpot9);
        parkingLotManager0.addParkingSpot(parkingSpot9);
        java.util.List<parking.ParkingSpot> parkingSpotList13 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager14 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager14.addParkingSpot(parkingSpot18);
        java.lang.String str20 = parkingSpot18.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator21 = new parking.CoveredParkingDecorator(parkingSpot18);
        parking.HandicapAccessDecorator handicapAccessDecorator22 = new parking.HandicapAccessDecorator(parkingSpot18);
        parkingLotManager0.addParkingSpot(parkingSpot18);
        parking.ParkingSpot parkingSpot27 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str28 = parkingSpot27.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator29 = new parking.CoveredParkingDecorator(parkingSpot27);
        java.lang.String str30 = coveredParkingDecorator29.getDetails();
        parking.EVChargingDecorator eVChargingDecorator31 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator29);
        java.lang.String str32 = coveredParkingDecorator29.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator33 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator29);
        java.lang.String str34 = coveredParkingDecorator29.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator35 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator29);
        parking.CoveredParkingDecorator coveredParkingDecorator36 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator35);
        parking.CoveredParkingDecorator coveredParkingDecorator37 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator36);
        parking.EVChargingDecorator eVChargingDecorator38 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator37);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator37);
        java.util.List<parking.ParkingSpot> parkingSpotList40 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList41 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList13);
        org.junit.Assert.assertNotNull(parkingLotManager14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str30, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str32, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str34, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList40);
        org.junit.Assert.assertNotNull(parkingSpotList41);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str8 = coveredParkingDecorator7.getDetails();
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str11 = eVChargingDecorator10.getDetails();
        java.lang.String str12 = eVChargingDecorator10.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, EV Charging Available");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str8 = eVChargingDecorator6.getLocation();
        java.lang.String str9 = eVChargingDecorator6.getDetails();
        int int10 = eVChargingDecorator6.getId();
        java.lang.Class<?> wildcardClass11 = eVChargingDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str9 = handicapAccessDecorator6.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str11 = handicapAccessDecorator10.getDetails();
        int int12 = handicapAccessDecorator10.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        java.lang.String str9 = coveredParkingDecorator5.getLocation();
        java.lang.String str10 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str11 = coveredParkingDecorator5.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: -1, Location: , Lot: , EV Charging Available, Covered Parking, Covered Parking", "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, EV Charging Available");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        parking.HandicapAccessDecorator handicapAccessDecorator4 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.Class<?> wildcardClass6 = eVChargingDecorator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot10 = new parking.ParkingSpot((int) (short) 0, "", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator(parkingSpot10);
        java.lang.String str12 = parkingSpot10.getDetails();
        parkingLotManager0.addParkingSpot(parkingSpot10);
        parking.EVChargingDecorator eVChargingDecorator14 = new parking.EVChargingDecorator(parkingSpot10);
        java.lang.Class<?> wildcardClass15 = eVChargingDecorator14.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str12, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Covered Parking");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 0, "Parking Spot ID: 1, Location: hi!, Lot: ", "Parking Spot ID: -1, Location: , Lot: , EV Charging Available, Covered Parking, EV Charging Available");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        parking.CoveredParkingDecorator coveredParkingDecorator4 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str6 = handicapAccessDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.lang.String str14 = parkingSpot11.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator15 = new parking.HandicapAccessDecorator(parkingSpot11);
        java.lang.String str16 = handicapAccessDecorator15.getDetails();
        parking.EVChargingDecorator eVChargingDecorator17 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator15);
        java.lang.Class<?> wildcardClass18 = handicapAccessDecorator15.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList7 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList8 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot12 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str13 = parkingSpot12.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator14 = new parking.HandicapAccessDecorator(parkingSpot12);
        parking.HandicapAccessDecorator handicapAccessDecorator15 = new parking.HandicapAccessDecorator(parkingSpot12);
        parkingLotManager0.addParkingSpot(parkingSpot12);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingSpotList7);
        org.junit.Assert.assertNotNull(parkingSpotList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        int int10 = coveredParkingDecorator7.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(10, "", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        java.lang.String str5 = parkingSpot3.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.Class<?> wildcardClass8 = handicapAccessDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(100, "", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        java.lang.String str7 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str9 = parkingSpot4.getParkingLot();
        java.lang.String str10 = parkingSpot4.getParkingLot();
        java.lang.String str11 = parkingSpot4.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator9);
        java.lang.String str11 = eVChargingDecorator10.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = handicapAccessDecorator7.getLocation();
        java.lang.String str9 = handicapAccessDecorator7.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str9 = eVChargingDecorator7.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList15 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager16 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot20 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str21 = parkingSpot20.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator22 = new parking.CoveredParkingDecorator(parkingSpot20);
        java.lang.String str23 = coveredParkingDecorator22.getDetails();
        parking.EVChargingDecorator eVChargingDecorator24 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator22);
        parkingLotManager16.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        java.lang.String str26 = eVChargingDecorator24.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        parking.ParkingSpot parkingSpot31 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str32 = parkingSpot31.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot31);
        java.util.List<parking.ParkingSpot> parkingSpotList34 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList35 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot39 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str40 = parkingSpot39.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator41 = new parking.CoveredParkingDecorator(parkingSpot39);
        java.lang.String str42 = coveredParkingDecorator41.getDetails();
        parking.EVChargingDecorator eVChargingDecorator43 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator41);
        java.lang.String str44 = coveredParkingDecorator41.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator45 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator41);
        java.lang.String str46 = coveredParkingDecorator41.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator47 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator41);
        parking.CoveredParkingDecorator coveredParkingDecorator48 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator47);
        java.lang.String str49 = handicapAccessDecorator47.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator47);
        java.lang.String str51 = handicapAccessDecorator47.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
        org.junit.Assert.assertNotNull(parkingLotManager16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList34);
        org.junit.Assert.assertNotNull(parkingSpotList35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str42, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str44, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str46, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str49, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str51, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList15 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager16 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot20 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str21 = parkingSpot20.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator22 = new parking.CoveredParkingDecorator(parkingSpot20);
        java.lang.String str23 = coveredParkingDecorator22.getDetails();
        parking.EVChargingDecorator eVChargingDecorator24 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator22);
        parkingLotManager16.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        java.lang.String str26 = eVChargingDecorator24.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator24);
        parking.HandicapAccessDecorator handicapAccessDecorator28 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator24);
        java.lang.String str29 = handicapAccessDecorator28.getDetails();
        java.lang.String str30 = handicapAccessDecorator28.getDetails();
        java.lang.String str31 = handicapAccessDecorator28.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
        org.junit.Assert.assertNotNull(parkingLotManager16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible" + "'", str29, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible" + "'", str30, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible" + "'", str31, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingLotManager parkingLotManager14 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str19 = parkingSpot18.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot18);
        java.lang.String str21 = coveredParkingDecorator20.getDetails();
        parking.EVChargingDecorator eVChargingDecorator22 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        parkingLotManager14.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        parking.ParkingSpot parkingSpot28 = new parking.ParkingSpot(100, "Parking Spot ID: 1, Location: hi!, Lot: hi!", "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        parkingLotManager0.addParkingSpot(parkingSpot28);
        java.util.List<parking.ParkingSpot> parkingSpotList30 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList31 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot35 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parking.EVChargingDecorator eVChargingDecorator36 = new parking.EVChargingDecorator(parkingSpot35);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator36);
        parking.ParkingLotManager parkingLotManager38 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot42 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager38.addParkingSpot(parkingSpot42);
        java.lang.String str44 = parkingSpot42.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator45 = new parking.CoveredParkingDecorator(parkingSpot42);
        java.lang.String str46 = coveredParkingDecorator45.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator47 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator45);
        parking.CoveredParkingDecorator coveredParkingDecorator48 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator47);
        java.lang.String str49 = coveredParkingDecorator48.getDetails();
        int int50 = coveredParkingDecorator48.getId();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator48);
        java.lang.Class<?> wildcardClass52 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingLotManager14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList30);
        org.junit.Assert.assertNotNull(parkingSpotList31);
        org.junit.Assert.assertNotNull(parkingLotManager38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str46, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking" + "'", str49, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking");
        java.lang.String str4 = parkingSpot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(32, "Parking Spot ID: 100, Location: Parking Spot ID: 1, Location: hi!, Lot: hi!, Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!", "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        java.lang.Class<?> wildcardClass11 = handicapAccessDecorator9.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getDetails();
        java.lang.String str7 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot3);
        int int9 = parkingSpot3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str6, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str7, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getLocation();
        java.lang.String str13 = eVChargingDecorator8.getDetails();
        java.lang.String str14 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        java.lang.String str5 = parkingSpot3.getDetails();
        java.lang.Class<?> wildcardClass6 = parkingSpot3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str5, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        parking.HandicapAccessDecorator handicapAccessDecorator4 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str6 = eVChargingDecorator5.getParkingLot();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) -1, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking");
        java.lang.Class<?> wildcardClass4 = parkingSpot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList15 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot19 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator(parkingSpot19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator(parkingSpot19);
        parking.HandicapAccessDecorator handicapAccessDecorator22 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator21);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        parking.HandicapAccessDecorator handicapAccessDecorator24 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator21);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        java.lang.String str9 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str10 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str11 = coveredParkingDecorator5.getLocation();
        int int12 = coveredParkingDecorator5.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getLocation();
        int int11 = eVChargingDecorator8.getId();
        parking.EVChargingDecorator eVChargingDecorator12 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator12);
        int int14 = eVChargingDecorator13.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator(parkingSpot9);
        parkingLotManager0.addParkingSpot(parkingSpot9);
        java.util.List<parking.ParkingSpot> parkingSpotList13 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager14 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager14.addParkingSpot(parkingSpot18);
        java.lang.String str20 = parkingSpot18.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator21 = new parking.CoveredParkingDecorator(parkingSpot18);
        parking.HandicapAccessDecorator handicapAccessDecorator22 = new parking.HandicapAccessDecorator(parkingSpot18);
        parkingLotManager0.addParkingSpot(parkingSpot18);
        parking.ParkingSpot parkingSpot27 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str28 = parkingSpot27.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator29 = new parking.CoveredParkingDecorator(parkingSpot27);
        java.lang.String str30 = coveredParkingDecorator29.getDetails();
        parking.EVChargingDecorator eVChargingDecorator31 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator29);
        java.lang.String str32 = coveredParkingDecorator29.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator33 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator29);
        java.lang.String str34 = coveredParkingDecorator29.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator35 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator29);
        parking.CoveredParkingDecorator coveredParkingDecorator36 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator35);
        parking.CoveredParkingDecorator coveredParkingDecorator37 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator36);
        parking.EVChargingDecorator eVChargingDecorator38 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator37);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator37);
        parking.ParkingSpot parkingSpot43 = new parking.ParkingSpot((-1), "", "");
        int int44 = parkingSpot43.getId();
        parking.EVChargingDecorator eVChargingDecorator45 = new parking.EVChargingDecorator(parkingSpot43);
        parking.CoveredParkingDecorator coveredParkingDecorator46 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator45);
        java.lang.String str47 = coveredParkingDecorator46.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator48 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator46);
        java.lang.String str49 = coveredParkingDecorator48.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator48);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList13);
        org.junit.Assert.assertNotNull(parkingLotManager14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str30, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str32, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str34, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , EV Charging Available, Covered Parking" + "'", str47, "Parking Spot ID: -1, Location: , Lot: , EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , EV Charging Available, Covered Parking, Covered Parking" + "'", str49, "Parking Spot ID: -1, Location: , Lot: , EV Charging Available, Covered Parking, Covered Parking");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 100, "Parking Spot ID: 1, Location: hi!, Lot: ", "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        java.lang.String str4 = parkingSpot3.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 100, Location: Parking Spot ID: 1, Location: hi!, Lot: , Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str4, "Parking Spot ID: 100, Location: Parking Spot ID: 1, Location: hi!, Lot: , Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.String str8 = handicapAccessDecorator6.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str9 = coveredParkingDecorator8.getDetails();
        java.lang.String str10 = coveredParkingDecorator8.getDetails();
        java.lang.String str11 = coveredParkingDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList7 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator(parkingSpot11);
        java.lang.String str14 = coveredParkingDecorator13.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        parking.HandicapAccessDecorator handicapAccessDecorator16 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator13);
        java.util.List<parking.ParkingSpot> parkingSpotList18 = parkingLotManager0.getParkingSpots();
        java.lang.Class<?> wildcardClass19 = parkingSpotList18.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingSpotList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot10 = new parking.ParkingSpot((int) (short) 0, "", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator(parkingSpot10);
        java.lang.String str12 = parkingSpot10.getDetails();
        parkingLotManager0.addParkingSpot(parkingSpot10);
        parking.EVChargingDecorator eVChargingDecorator14 = new parking.EVChargingDecorator(parkingSpot10);
        int int15 = eVChargingDecorator14.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str12, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible", "Parking Spot ID: 100, Location: Parking Spot ID: 1, Location: hi!, Lot: hi!, Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, Covered Parking, EV Charging Available", "");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str11 = eVChargingDecorator10.getDetails();
        java.lang.String str12 = eVChargingDecorator10.getDetails();
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator13);
        java.lang.String str15 = coveredParkingDecorator14.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        java.lang.String str13 = eVChargingDecorator8.getDetails();
        java.lang.String str14 = eVChargingDecorator8.getDetails();
        java.lang.Class<?> wildcardClass15 = eVChargingDecorator8.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        java.lang.Class<?> wildcardClass9 = handicapAccessDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) 'a', "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        java.util.List<parking.ParkingSpot> parkingSpotList12 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot16 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str17 = parkingSpot16.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator18 = new parking.CoveredParkingDecorator(parkingSpot16);
        java.lang.String str19 = coveredParkingDecorator18.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator18);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        parking.HandicapAccessDecorator handicapAccessDecorator22 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(parkingSpotList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str19, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator9);
        java.lang.String str11 = handicapAccessDecorator9.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str18 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot17);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        java.lang.String str23 = eVChargingDecorator21.getLocation();
        int int24 = eVChargingDecorator21.getId();
        parking.CoveredParkingDecorator coveredParkingDecorator25 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator21);
        java.lang.String str26 = eVChargingDecorator21.getParkingLot();
        int int27 = eVChargingDecorator21.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str9 = handicapAccessDecorator6.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator10);
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str19 = parkingSpot18.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot18);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        parking.EVChargingDecorator eVChargingDecorator22 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator21);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        parking.ParkingSpot parkingSpot27 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str28 = parkingSpot27.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator29 = new parking.CoveredParkingDecorator(parkingSpot27);
        java.lang.String str30 = parkingSpot27.getDetails();
        java.lang.String str31 = parkingSpot27.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot27);
        java.util.List<parking.ParkingSpot> parkingSpotList33 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str30, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(parkingSpotList33);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, Covered Parking, EV Charging Available");
        java.lang.String str4 = parkingSpot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str18 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot17);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        parking.ParkingLotManager parkingLotManager23 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot27 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager23.addParkingSpot(parkingSpot27);
        java.lang.String str29 = parkingSpot27.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator30 = new parking.HandicapAccessDecorator(parkingSpot27);
        parkingLotManager0.addParkingSpot(parkingSpot27);
        java.lang.String str32 = parkingSpot27.getDetails();
        java.lang.String str33 = parkingSpot27.getLocation();
        java.lang.Class<?> wildcardClass34 = parkingSpot27.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingLotManager23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str32, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str9 = handicapAccessDecorator6.getParkingLot();
        java.lang.String str10 = handicapAccessDecorator6.getDetails();
        java.lang.String str11 = handicapAccessDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator12 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str13 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str9 = handicapAccessDecorator6.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        int int11 = handicapAccessDecorator6.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str10 = eVChargingDecorator7.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator7);
        parking.ParkingSpot parkingSpot15 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str16 = parkingSpot15.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator17 = new parking.CoveredParkingDecorator(parkingSpot15);
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator17);
        parking.EVChargingDecorator eVChargingDecorator19 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator18);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator18);
        java.lang.String str21 = eVChargingDecorator18.getDetails();
        parking.EVChargingDecorator eVChargingDecorator22 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator18);
        java.lang.String str23 = eVChargingDecorator18.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator18);
        java.util.List<parking.ParkingSpot> parkingSpotList25 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(parkingSpotList25);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        java.lang.String str5 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str7 = eVChargingDecorator6.getDetails();
        java.lang.String str8 = eVChargingDecorator6.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str5, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        java.util.List<parking.ParkingSpot> parkingSpotList1 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot5 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str6 = parkingSpot5.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot5);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.EVChargingDecorator eVChargingDecorator9 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        parking.EVChargingDecorator eVChargingDecorator12 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(parkingSpotList14);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = coveredParkingDecorator8.getDetails();
        java.lang.String str10 = coveredParkingDecorator8.getParkingLot();
        java.lang.Class<?> wildcardClass11 = coveredParkingDecorator8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(32, "", "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: ");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        java.lang.Class<?> wildcardClass5 = parkingSpot3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.lang.String str14 = parkingSpot11.getParkingLot();
        parking.EVChargingDecorator eVChargingDecorator15 = new parking.EVChargingDecorator(parkingSpot11);
        java.lang.Class<?> wildcardClass16 = eVChargingDecorator15.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        java.lang.String str9 = handicapAccessDecorator6.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator10 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str11 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str8 = coveredParkingDecorator5.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 0, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible", "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str4, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str19 = parkingSpot18.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot18);
        java.lang.String str21 = coveredParkingDecorator20.getDetails();
        parking.EVChargingDecorator eVChargingDecorator22 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        java.lang.String str23 = coveredParkingDecorator20.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator24 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        java.util.List<parking.ParkingSpot> parkingSpotList26 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot30 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator31 = new parking.EVChargingDecorator(parkingSpot30);
        parking.EVChargingDecorator eVChargingDecorator32 = new parking.EVChargingDecorator(parkingSpot30);
        parking.CoveredParkingDecorator coveredParkingDecorator33 = new parking.CoveredParkingDecorator(parkingSpot30);
        parkingLotManager0.addParkingSpot(parkingSpot30);
        parking.ParkingLotManager parkingLotManager35 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot39 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str40 = parkingSpot39.getLocation();
        java.lang.String str41 = parkingSpot39.getLocation();
        parkingLotManager35.addParkingSpot(parkingSpot39);
        parking.ParkingSpot parkingSpot46 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str47 = parkingSpot46.getLocation();
        parkingLotManager35.addParkingSpot(parkingSpot46);
        parking.ParkingLotManager parkingLotManager49 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot53 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str54 = parkingSpot53.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator55 = new parking.CoveredParkingDecorator(parkingSpot53);
        java.lang.String str56 = coveredParkingDecorator55.getDetails();
        parking.EVChargingDecorator eVChargingDecorator57 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator55);
        parkingLotManager49.addParkingSpot((parking.ParkingSpot) eVChargingDecorator57);
        parkingLotManager35.addParkingSpot((parking.ParkingSpot) eVChargingDecorator57);
        java.lang.String str60 = eVChargingDecorator57.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator57);
        java.util.List<parking.ParkingSpot> parkingSpotList62 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList26);
        org.junit.Assert.assertNotNull(parkingLotManager35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(parkingLotManager49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str56, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str60, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(parkingSpotList62);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager7 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager7.addParkingSpot(parkingSpot11);
        java.lang.String str13 = parkingSpot11.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator(parkingSpot11);
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator(parkingSpot11);
        parking.HandicapAccessDecorator handicapAccessDecorator16 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator15);
        java.lang.String str17 = handicapAccessDecorator16.getLocation();
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator16);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator16);
        java.lang.Class<?> wildcardClass20 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingLotManager7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        java.lang.String str11 = coveredParkingDecorator5.getDetails();
        java.lang.String str12 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str14 = coveredParkingDecorator5.getDetails();
        java.lang.String str15 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot15 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str16 = parkingSpot15.getDetails();
        java.lang.String str17 = parkingSpot15.getDetails();
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator(parkingSpot15);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator18);
        parking.ParkingSpot parkingSpot23 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str24 = parkingSpot23.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator25 = new parking.CoveredParkingDecorator(parkingSpot23);
        java.lang.String str26 = coveredParkingDecorator25.getDetails();
        java.lang.String str27 = coveredParkingDecorator25.getParkingLot();
        java.lang.String str28 = coveredParkingDecorator25.getParkingLot();
        java.lang.String str29 = coveredParkingDecorator25.getParkingLot();
        int int30 = coveredParkingDecorator25.getId();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator25);
        int int32 = coveredParkingDecorator25.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str9 = parkingSpot4.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator(parkingSpot4);
        java.lang.String str11 = handicapAccessDecorator10.getDetails();
        java.lang.String str12 = handicapAccessDecorator10.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        java.lang.String str5 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.Class<?> wildcardClass7 = parkingSpot3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str5, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str14 = coveredParkingDecorator13.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str18 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot17);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        parking.CoveredParkingDecorator coveredParkingDecorator23 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator21);
        java.lang.String str24 = eVChargingDecorator21.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator25 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator21);
        parking.CoveredParkingDecorator coveredParkingDecorator26 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator21);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str24, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.Class<?> wildcardClass11 = eVChargingDecorator8.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot(0, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, Covered Parking, EV Charging Available");
        parkingLotManager0.addParkingSpot(parkingSpot17);
        java.lang.Class<?> wildcardClass19 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot16 = new parking.ParkingSpot((-1), "", "");
        parkingLotManager0.addParkingSpot(parkingSpot16);
        java.lang.String str18 = parkingSpot16.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator19 = new parking.HandicapAccessDecorator(parkingSpot16);
        parking.HandicapAccessDecorator handicapAccessDecorator20 = new parking.HandicapAccessDecorator(parkingSpot16);
        java.lang.Class<?> wildcardClass21 = handicapAccessDecorator20.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        parking.CoveredParkingDecorator coveredParkingDecorator4 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator4);
        java.lang.String str6 = coveredParkingDecorator4.getDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 10, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible, Covered Parking" + "'", str6, "Parking Spot ID: 10, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible, Covered Parking");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        int int7 = parkingSpot4.getId();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        java.lang.Class<?> wildcardClass11 = handicapAccessDecorator9.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str9 = parkingSpot4.getParkingLot();
        java.lang.String str10 = parkingSpot4.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: ");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str18 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot17);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        java.util.List<parking.ParkingSpot> parkingSpotList23 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList24 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager25 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot29 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager25.addParkingSpot(parkingSpot29);
        java.lang.String str31 = parkingSpot29.getDetails();
        parking.EVChargingDecorator eVChargingDecorator32 = new parking.EVChargingDecorator(parkingSpot29);
        parking.EVChargingDecorator eVChargingDecorator33 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator32);
        int int34 = eVChargingDecorator32.getId();
        int int35 = eVChargingDecorator32.getId();
        java.lang.String str36 = eVChargingDecorator32.getDetails();
        java.lang.String str37 = eVChargingDecorator32.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator32);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpotList23);
        org.junit.Assert.assertNotNull(parkingSpotList24);
        org.junit.Assert.assertNotNull(parkingLotManager25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str31, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str36, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str37, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str4, "Parking Spot ID: 32, Location: Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str9 = handicapAccessDecorator6.getParkingLot();
        java.lang.String str10 = handicapAccessDecorator6.getDetails();
        java.lang.String str11 = handicapAccessDecorator6.getDetails();
        java.lang.Class<?> wildcardClass12 = handicapAccessDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) -1, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available", "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        int int4 = parkingSpot3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        java.lang.String str11 = coveredParkingDecorator5.getDetails();
        java.lang.String str12 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str14 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator15 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str16 = coveredParkingDecorator5.getDetails();
        java.lang.String str17 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str17, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        java.lang.String str10 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.HandicapAccessDecorator handicapAccessDecorator13 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.Class<?> wildcardClass14 = handicapAccessDecorator13.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator(parkingSpot9);
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator(parkingSpot9);
        java.lang.String str14 = eVChargingDecorator13.getDetails();
        java.lang.String str15 = eVChargingDecorator13.getDetails();
        java.lang.String str16 = eVChargingDecorator13.getDetails();
        parking.EVChargingDecorator eVChargingDecorator17 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator13);
        java.lang.String str18 = eVChargingDecorator13.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str14, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str18, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList15 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot19 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator(parkingSpot19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator(parkingSpot19);
        parking.HandicapAccessDecorator handicapAccessDecorator22 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator21);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        java.util.List<parking.ParkingSpot> parkingSpotList24 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
        org.junit.Assert.assertNotNull(parkingSpotList24);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot(0, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, Covered Parking, EV Charging Available");
        parkingLotManager0.addParkingSpot(parkingSpot17);
        parking.ParkingLotManager parkingLotManager19 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot23 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager19.addParkingSpot(parkingSpot23);
        java.lang.String str25 = parkingSpot23.getDetails();
        parking.EVChargingDecorator eVChargingDecorator26 = new parking.EVChargingDecorator(parkingSpot23);
        parking.HandicapAccessDecorator handicapAccessDecorator27 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator26);
        java.lang.String str28 = eVChargingDecorator26.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator29 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator26);
        java.lang.String str30 = handicapAccessDecorator29.getDetails();
        java.lang.String str31 = handicapAccessDecorator29.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator32 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator29);
        parking.EVChargingDecorator eVChargingDecorator33 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator32);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator32);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingLotManager19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str25, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str28, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str30, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str31, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str15 = coveredParkingDecorator14.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator16 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator14);
        parking.HandicapAccessDecorator handicapAccessDecorator17 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator16);
        int int18 = handicapAccessDecorator16.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str18 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot17);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        java.lang.String str23 = eVChargingDecorator21.getLocation();
        int int24 = eVChargingDecorator21.getId();
        parking.CoveredParkingDecorator coveredParkingDecorator25 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator21);
        java.lang.String str26 = eVChargingDecorator21.getParkingLot();
        parking.EVChargingDecorator eVChargingDecorator27 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator21);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        parking.ParkingSpot parkingSpot25 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str26 = parkingSpot25.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator27 = new parking.CoveredParkingDecorator(parkingSpot25);
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        parking.CoveredParkingDecorator coveredParkingDecorator29 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator28);
        parking.EVChargingDecorator eVChargingDecorator30 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator28);
        java.lang.String str31 = eVChargingDecorator28.getParkingLot();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator28);
        parking.HandicapAccessDecorator handicapAccessDecorator33 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator28);
        int int34 = eVChargingDecorator28.getId();
        java.lang.String str35 = eVChargingDecorator28.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator36 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator28);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str35, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str18 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot17);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        parking.ParkingLotManager parkingLotManager23 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot27 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager23.addParkingSpot(parkingSpot27);
        java.lang.String str29 = parkingSpot27.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator30 = new parking.HandicapAccessDecorator(parkingSpot27);
        parkingLotManager0.addParkingSpot(parkingSpot27);
        parking.ParkingLotManager parkingLotManager32 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot36 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str37 = parkingSpot36.getLocation();
        java.lang.String str38 = parkingSpot36.getLocation();
        parkingLotManager32.addParkingSpot(parkingSpot36);
        parking.ParkingSpot parkingSpot43 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str44 = parkingSpot43.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator45 = new parking.CoveredParkingDecorator(parkingSpot43);
        java.lang.String str46 = coveredParkingDecorator45.getDetails();
        parking.EVChargingDecorator eVChargingDecorator47 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator45);
        java.lang.String str48 = coveredParkingDecorator45.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator49 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator45);
        java.lang.String str50 = coveredParkingDecorator45.getDetails();
        parking.EVChargingDecorator eVChargingDecorator51 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator45);
        parkingLotManager32.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator45);
        int int53 = coveredParkingDecorator45.getId();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator45);
        java.lang.String str55 = coveredParkingDecorator45.getDetails();
        int int56 = coveredParkingDecorator45.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingLotManager23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(parkingLotManager32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str46, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str48, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str50, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str55, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getDetails();
        java.lang.String str7 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator8);
        int int11 = eVChargingDecorator8.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str6, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str7, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , EV Charging Available");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        int int9 = handicapAccessDecorator6.getId();
        java.lang.String str10 = handicapAccessDecorator6.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 10, "Parking Spot ID: 1, Location: hi!, Lot: hi!", "Parking Spot ID: -1, Location: , Lot: ");
        parking.CoveredParkingDecorator coveredParkingDecorator4 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.Class<?> wildcardClass5 = coveredParkingDecorator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        java.lang.String str5 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.Class<?> wildcardClass7 = eVChargingDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str5, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 0, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible", "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        java.lang.String str5 = parkingSpot3.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str8 = eVChargingDecorator7.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str5, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator9);
        java.lang.String str11 = eVChargingDecorator10.getDetails();
        java.lang.String str12 = eVChargingDecorator10.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        java.lang.String str8 = handicapAccessDecorator6.getParkingLot();
        java.lang.String str9 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str18 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot17);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        parking.EVChargingDecorator eVChargingDecorator21 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator21);
        java.util.List<parking.ParkingSpot> parkingSpotList23 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot27 = new parking.ParkingSpot((int) (byte) 100, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available, EV Charging Available, Covered Parking");
        parkingLotManager0.addParkingSpot(parkingSpot27);
        java.util.List<parking.ParkingSpot> parkingSpotList29 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager30 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot34 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str35 = parkingSpot34.getLocation();
        java.lang.String str36 = parkingSpot34.getLocation();
        parkingLotManager30.addParkingSpot(parkingSpot34);
        parking.ParkingSpot parkingSpot41 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str42 = parkingSpot41.getLocation();
        parkingLotManager30.addParkingSpot(parkingSpot41);
        parking.ParkingLotManager parkingLotManager44 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot48 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str49 = parkingSpot48.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator50 = new parking.CoveredParkingDecorator(parkingSpot48);
        java.lang.String str51 = coveredParkingDecorator50.getDetails();
        parking.EVChargingDecorator eVChargingDecorator52 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator50);
        parkingLotManager44.addParkingSpot((parking.ParkingSpot) eVChargingDecorator52);
        parkingLotManager30.addParkingSpot((parking.ParkingSpot) eVChargingDecorator52);
        parking.ParkingSpot parkingSpot58 = new parking.ParkingSpot(100, "Parking Spot ID: 1, Location: hi!, Lot: hi!", "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        parkingLotManager30.addParkingSpot(parkingSpot58);
        java.util.List<parking.ParkingSpot> parkingSpotList60 = parkingLotManager30.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList61 = parkingLotManager30.getParkingSpots();
        parking.ParkingSpot parkingSpot65 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parking.EVChargingDecorator eVChargingDecorator66 = new parking.EVChargingDecorator(parkingSpot65);
        parkingLotManager30.addParkingSpot((parking.ParkingSpot) eVChargingDecorator66);
        parking.ParkingLotManager parkingLotManager68 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot72 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager68.addParkingSpot(parkingSpot72);
        java.lang.String str74 = parkingSpot72.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator75 = new parking.CoveredParkingDecorator(parkingSpot72);
        java.lang.String str76 = coveredParkingDecorator75.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator77 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator75);
        parking.CoveredParkingDecorator coveredParkingDecorator78 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator77);
        java.lang.String str79 = coveredParkingDecorator78.getDetails();
        int int80 = coveredParkingDecorator78.getId();
        parkingLotManager30.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator78);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator78);
        java.lang.Class<?> wildcardClass83 = coveredParkingDecorator78.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpotList23);
        org.junit.Assert.assertNotNull(parkingSpotList29);
        org.junit.Assert.assertNotNull(parkingLotManager30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(parkingLotManager44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str51, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList60);
        org.junit.Assert.assertNotNull(parkingSpotList61);
        org.junit.Assert.assertNotNull(parkingLotManager68);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str76, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking" + "'", str79, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        parking.ParkingSpot parkingSpot25 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str26 = parkingSpot25.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator27 = new parking.CoveredParkingDecorator(parkingSpot25);
        java.lang.String str28 = coveredParkingDecorator27.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator29 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        java.lang.String str30 = coveredParkingDecorator27.getDetails();
        java.lang.String str31 = coveredParkingDecorator27.getParkingLot();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator27);
        parking.CoveredParkingDecorator coveredParkingDecorator33 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str28, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str30, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str8 = eVChargingDecorator6.getLocation();
        java.lang.String str9 = eVChargingDecorator6.getDetails();
        java.lang.String str10 = eVChargingDecorator6.getDetails();
        java.lang.String str11 = eVChargingDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        java.lang.String str9 = coveredParkingDecorator5.getLocation();
        java.lang.String str10 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str11 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator8.getLocation();
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        java.lang.String str9 = handicapAccessDecorator6.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator10 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        int int11 = handicapAccessDecorator6.getId();
        java.lang.String str12 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) -1, "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Lot: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Handicap Accessible", "Parking Spot ID: -1, Location: , Lot: , EV Charging Available");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        java.lang.String str5 = parkingSpot3.getParkingLot();
        java.lang.String str6 = parkingSpot3.getDetails();
        java.lang.String str7 = parkingSpot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str6, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.String str10 = handicapAccessDecorator9.getLocation();
        java.lang.String str11 = handicapAccessDecorator9.getDetails();
        java.lang.String str12 = handicapAccessDecorator9.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str9 = handicapAccessDecorator6.getParkingLot();
        java.lang.String str10 = handicapAccessDecorator6.getDetails();
        java.lang.String str11 = handicapAccessDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator12 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str13 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingSpot parkingSpot16 = new parking.ParkingSpot((-1), "", "");
        parkingLotManager0.addParkingSpot(parkingSpot16);
        java.lang.String str18 = parkingSpot16.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator19 = new parking.HandicapAccessDecorator(parkingSpot16);
        parking.HandicapAccessDecorator handicapAccessDecorator20 = new parking.HandicapAccessDecorator(parkingSpot16);
        java.lang.String str21 = parkingSpot16.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , EV Charging Available, Covered Parking, Covered Parking");
        java.lang.String str4 = parkingSpot3.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: -1, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Lot: Parking Spot ID: -1, Location: , Lot: , EV Charging Available, Covered Parking, Covered Parking" + "'", str4, "Parking Spot ID: -1, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Lot: Parking Spot ID: -1, Location: , Lot: , EV Charging Available, Covered Parking, Covered Parking");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = coveredParkingDecorator5.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str14 = coveredParkingDecorator5.getDetails();
        java.lang.String str15 = coveredParkingDecorator5.getDetails();
        java.lang.String str16 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator17 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.Class<?> wildcardClass18 = coveredParkingDecorator17.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 0, "", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.Class<?> wildcardClass5 = parkingSpot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 0, "Parking Spot ID: 1, Location: , Lot: ", "Parking Spot ID: 100, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, EV Charging Available");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = handicapAccessDecorator7.getLocation();
        java.lang.String str9 = handicapAccessDecorator7.getDetails();
        java.lang.String str10 = handicapAccessDecorator7.getDetails();
        java.lang.String str11 = handicapAccessDecorator7.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: ");
        int int4 = parkingSpot3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        java.lang.String str5 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str7 = eVChargingDecorator6.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str5, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str8 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str9 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator10 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int11 = coveredParkingDecorator5.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str9 = coveredParkingDecorator8.getDetails();
        java.lang.String str10 = coveredParkingDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(32, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking", "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, Covered Parking");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str7 = handicapAccessDecorator6.getLocation();
        java.lang.Class<?> wildcardClass8 = handicapAccessDecorator6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str9 = handicapAccessDecorator6.getDetails();
        java.lang.String str10 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        java.lang.String str6 = parkingSpot4.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        parking.ParkingLotManager parkingLotManager14 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str19 = parkingSpot18.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot18);
        java.lang.String str21 = coveredParkingDecorator20.getDetails();
        parking.EVChargingDecorator eVChargingDecorator22 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        parkingLotManager14.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        parking.ParkingSpot parkingSpot28 = new parking.ParkingSpot(100, "Parking Spot ID: 1, Location: hi!, Lot: hi!", "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        parkingLotManager0.addParkingSpot(parkingSpot28);
        java.util.List<parking.ParkingSpot> parkingSpotList30 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager31 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot35 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager31.addParkingSpot(parkingSpot35);
        java.lang.String str37 = parkingSpot35.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator38 = new parking.CoveredParkingDecorator(parkingSpot35);
        parking.CoveredParkingDecorator coveredParkingDecorator39 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator38);
        java.lang.String str40 = coveredParkingDecorator38.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator41 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator38);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator38);
        parking.ParkingSpot parkingSpot46 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str47 = parkingSpot46.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator48 = new parking.CoveredParkingDecorator(parkingSpot46);
        java.lang.String str49 = coveredParkingDecorator48.getDetails();
        parking.EVChargingDecorator eVChargingDecorator50 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator48);
        java.lang.String str51 = coveredParkingDecorator48.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator52 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator48);
        java.lang.String str53 = coveredParkingDecorator48.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator54 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator48);
        java.lang.String str55 = handicapAccessDecorator54.getDetails();
        java.lang.String str56 = handicapAccessDecorator54.getDetails();
        parking.EVChargingDecorator eVChargingDecorator57 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator54);
        java.lang.String str58 = handicapAccessDecorator54.getParkingLot();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator54);
        java.util.List<parking.ParkingSpot> parkingSpotList60 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingLotManager14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList30);
        org.junit.Assert.assertNotNull(parkingLotManager31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str40, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str49, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str51, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str53, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str55, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str56, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(parkingSpotList60);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        java.util.List<parking.ParkingSpot> parkingSpotList22 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot26 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str27 = parkingSpot26.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator28 = new parking.HandicapAccessDecorator(parkingSpot26);
        parking.HandicapAccessDecorator handicapAccessDecorator29 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator28);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator29);
        parking.ParkingSpot parkingSpot34 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str35 = parkingSpot34.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator36 = new parking.CoveredParkingDecorator(parkingSpot34);
        java.lang.String str37 = coveredParkingDecorator36.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator38 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator36);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator36);
        parking.CoveredParkingDecorator coveredParkingDecorator40 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator36);
        parking.EVChargingDecorator eVChargingDecorator41 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator36);
        java.lang.String str42 = eVChargingDecorator41.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str37, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str42, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = handicapAccessDecorator7.getLocation();
        java.lang.Class<?> wildcardClass9 = handicapAccessDecorator7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.String str10 = coveredParkingDecorator8.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager13 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager13.addParkingSpot(parkingSpot17);
        java.lang.String str19 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator(parkingSpot17);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        java.util.List<parking.ParkingSpot> parkingSpotList22 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot26 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str27 = parkingSpot26.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator28 = new parking.HandicapAccessDecorator(parkingSpot26);
        parking.HandicapAccessDecorator handicapAccessDecorator29 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator28);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator29);
        parking.ParkingLotManager parkingLotManager31 = parking.ParkingLotManager.getInstance();
        java.util.List<parking.ParkingSpot> parkingSpotList32 = parkingLotManager31.getParkingSpots();
        parking.ParkingSpot parkingSpot36 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str37 = parkingSpot36.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator38 = new parking.CoveredParkingDecorator(parkingSpot36);
        parking.EVChargingDecorator eVChargingDecorator39 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator38);
        parking.EVChargingDecorator eVChargingDecorator40 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator39);
        parking.EVChargingDecorator eVChargingDecorator41 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator39);
        java.lang.String str42 = eVChargingDecorator39.getDetails();
        parking.EVChargingDecorator eVChargingDecorator43 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator39);
        parkingLotManager31.addParkingSpot((parking.ParkingSpot) eVChargingDecorator39);
        java.lang.String str45 = eVChargingDecorator39.getDetails();
        java.lang.String str46 = eVChargingDecorator39.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator39);
        int int48 = eVChargingDecorator39.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingLotManager31);
        org.junit.Assert.assertNotNull(parkingSpotList32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str42, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str45, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str46, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        java.lang.String str11 = handicapAccessDecorator9.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Handicap Accessible");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str8 = eVChargingDecorator7.getDetails();
        int int9 = eVChargingDecorator7.getId();
        java.lang.String str10 = eVChargingDecorator7.getDetails();
        java.lang.String str11 = eVChargingDecorator7.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getDetails();
        java.lang.String str12 = eVChargingDecorator8.getLocation();
        java.lang.String str13 = eVChargingDecorator8.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) '4', "hi!", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Covered Parking");
    }
}

