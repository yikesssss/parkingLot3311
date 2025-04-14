package rando.parking;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getLocation();
        int int11 = eVChargingDecorator8.getId();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        java.lang.String str13 = eVChargingDecorator8.getParkingLot();
        java.lang.Class<?> wildcardClass14 = eVChargingDecorator8.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(100, "Parking Spot ID: 1, Location: hi!, Lot: hi!", "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        parking.HandicapAccessDecorator handicapAccessDecorator4 = new parking.HandicapAccessDecorator(parkingSpot3);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        parking.CoveredParkingDecorator coveredParkingDecorator4 = new parking.CoveredParkingDecorator(parkingSpot3);
        int int5 = coveredParkingDecorator4.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        parking.ParkingLotManager parkingLotManager21 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot25 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager21.addParkingSpot(parkingSpot25);
        java.lang.String str27 = parkingSpot25.getDetails();
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator(parkingSpot25);
        java.lang.String str29 = parkingSpot25.getLocation();
        parking.EVChargingDecorator eVChargingDecorator30 = new parking.EVChargingDecorator(parkingSpot25);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator30);
        java.util.List<parking.ParkingSpot> parkingSpotList32 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList33 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList34 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList35 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager36 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot40 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str41 = parkingSpot40.getLocation();
        java.lang.String str42 = parkingSpot40.getLocation();
        parkingLotManager36.addParkingSpot(parkingSpot40);
        parking.ParkingSpot parkingSpot47 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str48 = parkingSpot47.getLocation();
        parkingLotManager36.addParkingSpot(parkingSpot47);
        java.util.List<parking.ParkingSpot> parkingSpotList50 = parkingLotManager36.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList51 = parkingLotManager36.getParkingSpots();
        parking.ParkingSpot parkingSpot55 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str56 = parkingSpot55.getParkingLot();
        java.lang.String str57 = parkingSpot55.getDetails();
        parkingLotManager36.addParkingSpot(parkingSpot55);
        parking.ParkingSpot parkingSpot62 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str63 = parkingSpot62.getDetails();
        parking.EVChargingDecorator eVChargingDecorator64 = new parking.EVChargingDecorator(parkingSpot62);
        parkingLotManager36.addParkingSpot((parking.ParkingSpot) eVChargingDecorator64);
        parking.EVChargingDecorator eVChargingDecorator66 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator64);
        java.lang.String str67 = eVChargingDecorator66.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator66);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str18, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingLotManager21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList32);
        org.junit.Assert.assertNotNull(parkingSpotList33);
        org.junit.Assert.assertNotNull(parkingSpotList34);
        org.junit.Assert.assertNotNull(parkingSpotList35);
        org.junit.Assert.assertNotNull(parkingLotManager36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(parkingSpotList50);
        org.junit.Assert.assertNotNull(parkingSpotList51);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str57, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str63, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available, EV Charging Available" + "'", str67, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str10 = handicapAccessDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str12 = eVChargingDecorator11.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator13 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        java.lang.String str26 = eVChargingDecorator21.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator27 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator21);
        parking.CoveredParkingDecorator coveredParkingDecorator28 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator21);
        int int29 = eVChargingDecorator21.getId();
        java.lang.String str30 = eVChargingDecorator21.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str30, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 100, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        java.lang.String str7 = handicapAccessDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 100, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Handicap Accessible" + "'", str7, "Parking Spot ID: 100, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        int int6 = parkingSpot3.getId();
        int int7 = parkingSpot3.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        java.lang.String str13 = coveredParkingDecorator12.getDetails();
        parking.EVChargingDecorator eVChargingDecorator14 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        java.util.List<parking.ParkingSpot> parkingSpotList40 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager41 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot45 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str46 = parkingSpot45.getLocation();
        java.lang.String str47 = parkingSpot45.getLocation();
        parkingLotManager41.addParkingSpot(parkingSpot45);
        parking.ParkingSpot parkingSpot52 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str53 = parkingSpot52.getLocation();
        parkingLotManager41.addParkingSpot(parkingSpot52);
        parking.ParkingSpot parkingSpot58 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str59 = parkingSpot58.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator60 = new parking.CoveredParkingDecorator(parkingSpot58);
        parking.EVChargingDecorator eVChargingDecorator61 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator60);
        parking.EVChargingDecorator eVChargingDecorator62 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator61);
        parkingLotManager41.addParkingSpot((parking.ParkingSpot) eVChargingDecorator62);
        parking.ParkingLotManager parkingLotManager64 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot68 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager64.addParkingSpot(parkingSpot68);
        java.lang.String str70 = parkingSpot68.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator71 = new parking.HandicapAccessDecorator(parkingSpot68);
        parkingLotManager41.addParkingSpot(parkingSpot68);
        java.lang.String str73 = parkingSpot68.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator74 = new parking.HandicapAccessDecorator(parkingSpot68);
        int int75 = parkingSpot68.getId();
        parkingLotManager0.addParkingSpot(parkingSpot68);
        java.util.List<parking.ParkingSpot> parkingSpotList77 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str37, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList40);
        org.junit.Assert.assertNotNull(parkingLotManager41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(parkingLotManager64);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str73, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(parkingSpotList77);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        java.lang.String str17 = handicapAccessDecorator15.getDetails();
        java.lang.String str18 = handicapAccessDecorator15.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str17, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        java.lang.String str8 = handicapAccessDecorator6.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str10 = handicapAccessDecorator6.getDetails();
        int int11 = handicapAccessDecorator6.getId();
        int int12 = handicapAccessDecorator6.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        java.lang.String str7 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator(parkingSpot4);
        int int9 = coveredParkingDecorator8.getId();
        java.lang.Class<?> wildcardClass10 = coveredParkingDecorator8.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        java.util.List<parking.ParkingSpot> parkingSpotList26 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList27 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot31 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str32 = parkingSpot31.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator33 = new parking.CoveredParkingDecorator(parkingSpot31);
        parking.EVChargingDecorator eVChargingDecorator34 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator33);
        parking.EVChargingDecorator eVChargingDecorator35 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator34);
        parking.EVChargingDecorator eVChargingDecorator36 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator34);
        parking.HandicapAccessDecorator handicapAccessDecorator37 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator36);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator36);
        java.util.List<parking.ParkingSpot> parkingSpotList39 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList40 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingLotManager14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList25);
        org.junit.Assert.assertNotNull(parkingSpotList26);
        org.junit.Assert.assertNotNull(parkingSpotList27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(parkingSpotList39);
        org.junit.Assert.assertNotNull(parkingSpotList40);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = handicapAccessDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator7);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        java.lang.String str11 = handicapAccessDecorator9.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator9);
        java.lang.String str13 = handicapAccessDecorator9.getDetails();
        parking.EVChargingDecorator eVChargingDecorator14 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator9);
        java.lang.String str15 = eVChargingDecorator14.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, EV Charging Available" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, EV Charging Available");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        parking.ParkingSpot parkingSpot28 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str29 = parkingSpot28.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator30 = new parking.CoveredParkingDecorator(parkingSpot28);
        parking.EVChargingDecorator eVChargingDecorator31 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator30);
        java.lang.String str32 = coveredParkingDecorator30.getDetails();
        java.lang.String str33 = coveredParkingDecorator30.getParkingLot();
        java.lang.String str34 = coveredParkingDecorator30.getLocation();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator30);
        java.lang.String str36 = coveredParkingDecorator30.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(parkingLotManager12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str18, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str22, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertNotNull(parkingSpotList24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str32, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str36, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) 'a', "Parking Spot ID: 1, Location: hi!, Lot: ", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        parking.CoveredParkingDecorator coveredParkingDecorator4 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator(parkingSpot3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        parking.EVChargingDecorator eVChargingDecorator15 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        int int16 = eVChargingDecorator15.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        parking.HandicapAccessDecorator handicapAccessDecorator31 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator26);
        int int32 = eVChargingDecorator26.getId();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        java.lang.String str18 = parkingSpot11.getParkingLot();
        java.lang.String str19 = parkingSpot11.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str16, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str19, "Parking Spot ID: -1, Location: , Lot: ");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        parking.ParkingSpot parkingSpot27 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str28 = parkingSpot27.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator29 = new parking.CoveredParkingDecorator(parkingSpot27);
        java.lang.String str30 = coveredParkingDecorator29.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator31 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator29);
        java.lang.String str32 = handicapAccessDecorator31.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator33 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator31);
        java.lang.String str34 = handicapAccessDecorator31.getDetails();
        java.lang.String str35 = handicapAccessDecorator31.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator36 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator31);
        java.lang.String str37 = handicapAccessDecorator36.getDetails();
        java.lang.String str38 = handicapAccessDecorator36.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator36);
        parking.ParkingLotManager parkingLotManager40 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot44 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager40.addParkingSpot(parkingSpot44);
        parking.ParkingSpot parkingSpot49 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str50 = parkingSpot49.getLocation();
        java.lang.String str51 = parkingSpot49.getLocation();
        parkingLotManager40.addParkingSpot(parkingSpot49);
        parking.ParkingLotManager parkingLotManager53 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot57 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager53.addParkingSpot(parkingSpot57);
        java.lang.String str59 = parkingSpot57.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator60 = new parking.CoveredParkingDecorator(parkingSpot57);
        parkingLotManager40.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator60);
        java.util.List<parking.ParkingSpot> parkingSpotList62 = parkingLotManager40.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList63 = parkingLotManager40.getParkingSpots();
        parking.ParkingLotManager parkingLotManager64 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot68 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager64.addParkingSpot(parkingSpot68);
        parking.ParkingSpot parkingSpot73 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str74 = parkingSpot73.getLocation();
        java.lang.String str75 = parkingSpot73.getLocation();
        parkingLotManager64.addParkingSpot(parkingSpot73);
        int int77 = parkingSpot73.getId();
        java.lang.String str78 = parkingSpot73.getLocation();
        parkingLotManager40.addParkingSpot(parkingSpot73);
        java.util.List<parking.ParkingSpot> parkingSpotList80 = parkingLotManager40.getParkingSpots();
        parking.ParkingSpot parkingSpot84 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str85 = parkingSpot84.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator86 = new parking.CoveredParkingDecorator(parkingSpot84);
        parking.HandicapAccessDecorator handicapAccessDecorator87 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator86);
        java.lang.String str88 = handicapAccessDecorator87.getDetails();
        java.lang.String str89 = handicapAccessDecorator87.getDetails();
        java.lang.String str90 = handicapAccessDecorator87.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator91 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator87);
        int int92 = handicapAccessDecorator87.getId();
        parkingLotManager40.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator87);
        java.lang.String str94 = handicapAccessDecorator87.getLocation();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator87);
        int int96 = handicapAccessDecorator87.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parkingSpotList23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str30, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str32, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str34, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible" + "'", str37, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible" + "'", str38, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertNotNull(parkingLotManager40);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(parkingLotManager53);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList62);
        org.junit.Assert.assertNotNull(parkingSpotList63);
        org.junit.Assert.assertNotNull(parkingLotManager64);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(parkingSpotList80);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str88, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str89, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        parking.ParkingSpot parkingSpot30 = new parking.ParkingSpot((int) (short) 0, "", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        parking.EVChargingDecorator eVChargingDecorator31 = new parking.EVChargingDecorator(parkingSpot30);
        parkingLotManager0.addParkingSpot(parkingSpot30);
        parking.ParkingSpot parkingSpot36 = new parking.ParkingSpot((int) (byte) 0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        parkingLotManager0.addParkingSpot(parkingSpot36);
        parking.ParkingLotManager parkingLotManager38 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot42 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager38.addParkingSpot(parkingSpot42);
        parking.ParkingSpot parkingSpot47 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str48 = parkingSpot47.getLocation();
        java.lang.String str49 = parkingSpot47.getLocation();
        parkingLotManager38.addParkingSpot(parkingSpot47);
        parking.ParkingLotManager parkingLotManager51 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot55 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager51.addParkingSpot(parkingSpot55);
        java.lang.String str57 = parkingSpot55.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator58 = new parking.CoveredParkingDecorator(parkingSpot55);
        parkingLotManager38.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator58);
        parking.CoveredParkingDecorator coveredParkingDecorator60 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator58);
        parking.CoveredParkingDecorator coveredParkingDecorator61 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator58);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator61);
        java.lang.String str63 = coveredParkingDecorator61.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList26);
        org.junit.Assert.assertNotNull(parkingLotManager38);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(parkingLotManager51);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str14 = eVChargingDecorator8.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        int int16 = eVChargingDecorator8.getId();
        parking.CoveredParkingDecorator coveredParkingDecorator17 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) '#', "Parking Spot ID: 0, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Lot: Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Lot: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, Covered Parking");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        parking.CoveredParkingDecorator coveredParkingDecorator22 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        java.lang.String str23 = coveredParkingDecorator20.getDetails();
        java.lang.Class<?> wildcardClass24 = coveredParkingDecorator20.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, Covered Parking" + "'", str23, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str9 = coveredParkingDecorator5.getDetails();
        java.lang.String str10 = coveredParkingDecorator5.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        java.lang.String str18 = eVChargingDecorator17.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        parking.CoveredParkingDecorator coveredParkingDecorator4 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str6 = parkingSpot3.getDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 10, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str6, "Parking Spot ID: 10, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        parking.ParkingSpot parkingSpot58 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str59 = parkingSpot58.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator60 = new parking.HandicapAccessDecorator(parkingSpot58);
        parking.HandicapAccessDecorator handicapAccessDecorator61 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator60);
        java.lang.String str62 = handicapAccessDecorator60.getDetails();
        java.lang.String str63 = handicapAccessDecorator60.getParkingLot();
        java.lang.String str64 = handicapAccessDecorator60.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator60);
        java.util.List<parking.ParkingSpot> parkingSpotList66 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot70 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str71 = parkingSpot70.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator72 = new parking.CoveredParkingDecorator(parkingSpot70);
        parking.HandicapAccessDecorator handicapAccessDecorator73 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator72);
        int int74 = handicapAccessDecorator73.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator75 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator73);
        int int76 = handicapAccessDecorator73.getId();
        java.lang.String str77 = handicapAccessDecorator73.getDetails();
        java.lang.String str78 = handicapAccessDecorator73.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator79 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator73);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator79);
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
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str59, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible" + "'", str62, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible" + "'", str64, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible");
        org.junit.Assert.assertNotNull(parkingSpotList66);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str77, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str78, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator9 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        parking.ParkingLotManager parkingLotManager20 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot24 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str25 = parkingSpot24.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator26 = new parking.CoveredParkingDecorator(parkingSpot24);
        java.lang.String str27 = coveredParkingDecorator26.getDetails();
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator26);
        parkingLotManager20.addParkingSpot((parking.ParkingSpot) eVChargingDecorator28);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator28);
        java.lang.String str31 = eVChargingDecorator28.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingLotManager20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str27, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str31, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        java.lang.String str7 = parkingSpot4.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator(parkingSpot4);
        java.lang.String str10 = handicapAccessDecorator9.getLocation();
        java.lang.String str11 = handicapAccessDecorator9.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        parking.HandicapAccessDecorator handicapAccessDecorator49 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator45);
        java.lang.String str50 = handicapAccessDecorator49.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator51 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator49);
        int int52 = coveredParkingDecorator51.getId();
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Handicap Accessible" + "'", str50, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "Parking Spot ID: -1, Location: , Lot: , Covered Parking", "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        java.lang.String str4 = parkingSpot3.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Lot: Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str4, "Parking Spot ID: 1, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Lot: Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible", "");
        parking.HandicapAccessDecorator handicapAccessDecorator4 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator5);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        parking.ParkingLotManager parkingLotManager18 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot22 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager18.addParkingSpot(parkingSpot22);
        java.lang.String str24 = parkingSpot22.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator25 = new parking.HandicapAccessDecorator(parkingSpot22);
        java.lang.String str26 = handicapAccessDecorator25.getDetails();
        java.lang.String str27 = handicapAccessDecorator25.getParkingLot();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator25);
        java.util.List<parking.ParkingSpot> parkingSpotList29 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList30 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList31 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager32 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot36 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager32.addParkingSpot(parkingSpot36);
        parking.ParkingSpot parkingSpot41 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str42 = parkingSpot41.getLocation();
        java.lang.String str43 = parkingSpot41.getLocation();
        parkingLotManager32.addParkingSpot(parkingSpot41);
        parking.ParkingLotManager parkingLotManager45 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot49 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager45.addParkingSpot(parkingSpot49);
        java.lang.String str51 = parkingSpot49.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator52 = new parking.HandicapAccessDecorator(parkingSpot49);
        java.lang.String str53 = handicapAccessDecorator52.getDetails();
        parkingLotManager32.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator52);
        java.lang.String str55 = handicapAccessDecorator52.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator56 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator52);
        parking.HandicapAccessDecorator handicapAccessDecorator57 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator56);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator56);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertNotNull(parkingLotManager18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str26, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(parkingSpotList29);
        org.junit.Assert.assertNotNull(parkingSpotList30);
        org.junit.Assert.assertNotNull(parkingSpotList31);
        org.junit.Assert.assertNotNull(parkingLotManager32);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(parkingLotManager45);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str53, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str55, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str11 = eVChargingDecorator10.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator10);
        int int13 = eVChargingDecorator10.getId();
        java.lang.String str14 = eVChargingDecorator10.getLocation();
        int int15 = eVChargingDecorator10.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str9 = coveredParkingDecorator8.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator10 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.String str11 = coveredParkingDecorator10.getDetails();
        java.lang.String str12 = coveredParkingDecorator10.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = handicapAccessDecorator7.getLocation();
        java.lang.String str9 = handicapAccessDecorator7.getDetails();
        java.lang.String str10 = handicapAccessDecorator7.getDetails();
        java.lang.String str11 = handicapAccessDecorator7.getDetails();
        java.lang.String str12 = handicapAccessDecorator7.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        java.util.List<parking.ParkingSpot> parkingSpotList26 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList27 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList28 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList29 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingLotManager14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList25);
        org.junit.Assert.assertNotNull(parkingSpotList26);
        org.junit.Assert.assertNotNull(parkingSpotList27);
        org.junit.Assert.assertNotNull(parkingSpotList28);
        org.junit.Assert.assertNotNull(parkingSpotList29);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str8 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator10 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator9);
        java.lang.String str11 = coveredParkingDecorator10.getDetails();
        int int12 = coveredParkingDecorator10.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator13 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator10);
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator10);
        parking.EVChargingDecorator eVChargingDecorator15 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator14);
        java.lang.String str16 = coveredParkingDecorator14.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking, Covered Parking" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking, Covered Parking");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        java.lang.String str7 = handicapAccessDecorator5.getDetails();
        java.lang.String str8 = handicapAccessDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        int int10 = handicapAccessDecorator5.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        java.lang.String str12 = handicapAccessDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        java.lang.Class<?> wildcardClass11 = handicapAccessDecorator9.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Handicap Accessible");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "", "Parking Spot ID: 32, Location: Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str18 = parkingSpot17.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator19 = new parking.HandicapAccessDecorator(parkingSpot17);
        parking.HandicapAccessDecorator handicapAccessDecorator20 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator19);
        java.lang.String str21 = handicapAccessDecorator20.getDetails();
        java.lang.String str22 = handicapAccessDecorator20.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator23 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator20);
        java.lang.String str24 = handicapAccessDecorator20.getDetails();
        java.lang.String str25 = handicapAccessDecorator20.getLocation();
        java.lang.String str26 = handicapAccessDecorator20.getDetails();
        java.lang.String str27 = handicapAccessDecorator20.getDetails();
        java.lang.String str28 = handicapAccessDecorator20.getDetails();
        parking.EVChargingDecorator eVChargingDecorator29 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator20);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str18, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str21, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str22, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str24, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str26, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str28, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        java.util.List<parking.ParkingSpot> parkingSpotList30 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList31 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList32 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager33 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot37 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager33.addParkingSpot(parkingSpot37);
        java.util.List<parking.ParkingSpot> parkingSpotList39 = parkingLotManager33.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList40 = parkingLotManager33.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList41 = parkingLotManager33.getParkingSpots();
        parking.ParkingLotManager parkingLotManager42 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot46 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager42.addParkingSpot(parkingSpot46);
        java.lang.String str48 = parkingSpot46.getDetails();
        parking.EVChargingDecorator eVChargingDecorator49 = new parking.EVChargingDecorator(parkingSpot46);
        parking.HandicapAccessDecorator handicapAccessDecorator50 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator49);
        java.lang.String str51 = eVChargingDecorator49.getDetails();
        parkingLotManager33.addParkingSpot((parking.ParkingSpot) eVChargingDecorator49);
        java.lang.String str53 = eVChargingDecorator49.getDetails();
        java.lang.String str54 = eVChargingDecorator49.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator49);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingLotManager20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList30);
        org.junit.Assert.assertNotNull(parkingSpotList31);
        org.junit.Assert.assertNotNull(parkingSpotList32);
        org.junit.Assert.assertNotNull(parkingLotManager33);
        org.junit.Assert.assertNotNull(parkingSpotList39);
        org.junit.Assert.assertNotNull(parkingSpotList40);
        org.junit.Assert.assertNotNull(parkingSpotList41);
        org.junit.Assert.assertNotNull(parkingLotManager42);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str48, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str51, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str53, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str54, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        int int7 = parkingSpot4.getId();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator10 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str11 = parkingSpot4.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator(parkingSpot4);
        int int13 = handicapAccessDecorator12.getId();
        java.lang.String str14 = handicapAccessDecorator12.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str14, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        parking.CoveredParkingDecorator coveredParkingDecorator41 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator40);
        java.lang.String str42 = coveredParkingDecorator41.getParkingLot();
        int int43 = coveredParkingDecorator41.getId();
        java.lang.String str44 = coveredParkingDecorator41.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str37, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Covered Parking" + "'", str44, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Covered Parking");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str9 = coveredParkingDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot10 = new parking.ParkingSpot((int) (short) 0, "", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator(parkingSpot10);
        java.lang.String str12 = parkingSpot10.getDetails();
        parkingLotManager0.addParkingSpot(parkingSpot10);
        parking.EVChargingDecorator eVChargingDecorator14 = new parking.EVChargingDecorator(parkingSpot10);
        int int15 = parkingSpot10.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator16 = new parking.HandicapAccessDecorator(parkingSpot10);
        java.lang.String str17 = handicapAccessDecorator16.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str12, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available, Handicap Accessible" + "'", str7, "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        java.lang.String str22 = coveredParkingDecorator20.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator23 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        java.lang.String str24 = coveredParkingDecorator20.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator25 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str22, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str24, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(97, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible", "");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str9 = eVChargingDecorator8.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        parking.EVChargingDecorator eVChargingDecorator15 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str16 = eVChargingDecorator8.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator17 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator8);
        parking.CoveredParkingDecorator coveredParkingDecorator18 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator17);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        java.lang.Class<?> wildcardClass36 = parkingSpotList35.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        parking.EVChargingDecorator eVChargingDecorator24 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator21);
        parking.HandicapAccessDecorator handicapAccessDecorator25 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator24);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator6.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        parking.CoveredParkingDecorator coveredParkingDecorator17 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator15);
        parking.HandicapAccessDecorator handicapAccessDecorator18 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator17);
        java.lang.String str19 = handicapAccessDecorator18.getDetails();
        java.lang.String str20 = handicapAccessDecorator18.getDetails();
        java.lang.String str21 = handicapAccessDecorator18.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator22 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator18);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Covered Parking, Handicap Accessible" + "'", str19, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Covered Parking, Handicap Accessible" + "'", str20, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Covered Parking, Handicap Accessible" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.Class<?> wildcardClass10 = coveredParkingDecorator9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        java.lang.String str25 = eVChargingDecorator21.getDetails();
        java.lang.String str26 = eVChargingDecorator21.getDetails();
        java.lang.String str27 = eVChargingDecorator21.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str24, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str25, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        java.lang.String str10 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str12 = coveredParkingDecorator7.getDetails();
        java.lang.String str13 = coveredParkingDecorator7.getDetails();
        int int14 = coveredParkingDecorator7.getId();
        java.lang.String str15 = coveredParkingDecorator7.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str13, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        java.util.List<parking.ParkingSpot> parkingSpotList37 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList38 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingSpotList20);
        org.junit.Assert.assertNotNull(parkingLotManager21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str35, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertNotNull(parkingSpotList37);
        org.junit.Assert.assertNotNull(parkingSpotList38);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str9 = coveredParkingDecorator5.getDetails();
        java.lang.String str10 = coveredParkingDecorator5.getParkingLot();
        java.lang.Class<?> wildcardClass11 = coveredParkingDecorator5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        int int23 = coveredParkingDecorator13.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str18, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: 52, Location: hi!, Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, Covered Parking");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str9 = coveredParkingDecorator5.getDetails();
        java.lang.String str10 = coveredParkingDecorator5.getLocation();
        java.lang.String str11 = coveredParkingDecorator5.getDetails();
        java.lang.String str12 = coveredParkingDecorator5.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(32, "Parking Spot ID: 35, Location: , Lot: Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available, Handicap Accessible, Handicap Accessible", "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, EV Charging Available");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        int int5 = parkingSpot3.getId();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str8 = parkingSpot3.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(10, "Parking Spot ID: 1, Location: hi!, Lot: hi!", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 10, Location: Parking Spot ID: 1, Location: hi!, Lot: hi!, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available" + "'", str4, "Parking Spot ID: 10, Location: Parking Spot ID: 1, Location: hi!, Lot: hi!, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        parking.ParkingSpot parkingSpot33 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str34 = parkingSpot33.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator35 = new parking.CoveredParkingDecorator(parkingSpot33);
        parking.EVChargingDecorator eVChargingDecorator36 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator35);
        java.lang.String str37 = coveredParkingDecorator35.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator35);
        parking.ParkingLotManager parkingLotManager39 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot43 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager39.addParkingSpot(parkingSpot43);
        java.util.List<parking.ParkingSpot> parkingSpotList45 = parkingLotManager39.getParkingSpots();
        parking.ParkingLotManager parkingLotManager46 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot50 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager46.addParkingSpot(parkingSpot50);
        java.lang.String str52 = parkingSpot50.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator53 = new parking.CoveredParkingDecorator(parkingSpot50);
        parking.CoveredParkingDecorator coveredParkingDecorator54 = new parking.CoveredParkingDecorator(parkingSpot50);
        parking.HandicapAccessDecorator handicapAccessDecorator55 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator54);
        java.lang.String str56 = handicapAccessDecorator55.getLocation();
        parking.EVChargingDecorator eVChargingDecorator57 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator55);
        parkingLotManager39.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator55);
        parking.ParkingSpot parkingSpot62 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str63 = parkingSpot62.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator64 = new parking.CoveredParkingDecorator(parkingSpot62);
        java.lang.String str65 = coveredParkingDecorator64.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator66 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator64);
        java.lang.String str67 = handicapAccessDecorator66.getLocation();
        parking.EVChargingDecorator eVChargingDecorator68 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator66);
        java.lang.String str69 = eVChargingDecorator68.getDetails();
        parkingLotManager39.addParkingSpot((parking.ParkingSpot) eVChargingDecorator68);
        java.lang.String str71 = eVChargingDecorator68.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator68);
        parking.ParkingLotManager parkingLotManager73 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot77 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str78 = parkingSpot77.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator79 = new parking.CoveredParkingDecorator(parkingSpot77);
        java.lang.String str80 = coveredParkingDecorator79.getDetails();
        parking.EVChargingDecorator eVChargingDecorator81 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator79);
        parkingLotManager73.addParkingSpot((parking.ParkingSpot) eVChargingDecorator81);
        java.lang.String str83 = eVChargingDecorator81.getDetails();
        java.lang.String str84 = eVChargingDecorator81.getDetails();
        java.lang.String str85 = eVChargingDecorator81.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator86 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator81);
        parking.CoveredParkingDecorator coveredParkingDecorator87 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator81);
        java.lang.String str88 = coveredParkingDecorator87.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator89 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator87);
        parking.CoveredParkingDecorator coveredParkingDecorator90 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator89);
        parking.HandicapAccessDecorator handicapAccessDecorator91 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator89);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator89);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str37, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingLotManager39);
        org.junit.Assert.assertNotNull(parkingSpotList45);
        org.junit.Assert.assertNotNull(parkingLotManager46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str65, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, EV Charging Available" + "'", str69, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, EV Charging Available" + "'", str71, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, EV Charging Available");
        org.junit.Assert.assertNotNull(parkingLotManager73);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str80, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str83, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str84, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str85, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str88, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        java.lang.String str13 = eVChargingDecorator12.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator12);
        java.lang.String str15 = coveredParkingDecorator14.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingLotManager20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str30, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        int int16 = coveredParkingDecorator14.getId();
        java.lang.String str17 = coveredParkingDecorator14.getDetails();
        java.lang.String str18 = coveredParkingDecorator14.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking" + "'", str17, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking" + "'", str18, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator9);
        java.lang.String str11 = coveredParkingDecorator9.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Covered Parking");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        java.lang.String str12 = eVChargingDecorator10.getLocation();
        java.lang.String str13 = eVChargingDecorator10.getDetails();
        java.lang.String str14 = eVChargingDecorator10.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available" + "'", str13, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available" + "'", str14, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        java.lang.String str10 = coveredParkingDecorator7.getParkingLot();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator11);
        java.lang.String str13 = handicapAccessDecorator12.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator14 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator12);
        java.lang.String str15 = handicapAccessDecorator12.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available, Handicap Accessible" + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 1, "Parking Spot ID: 32, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Covered Parking", "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, EV Charging Available");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str9 = coveredParkingDecorator5.getDetails();
        int int10 = coveredParkingDecorator5.getId();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        int int7 = parkingSpot4.getId();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        java.lang.String str11 = handicapAccessDecorator9.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        java.lang.String str25 = coveredParkingDecorator24.getLocation();
        java.lang.String str26 = coveredParkingDecorator24.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str21, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str23, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible, Covered Parking" + "'", str26, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible, Covered Parking");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        java.lang.String str13 = eVChargingDecorator12.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator14 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator12);
        java.lang.String str15 = handicapAccessDecorator14.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str10 = coveredParkingDecorator7.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        int int5 = parkingSpot3.getId();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        java.lang.String str8 = coveredParkingDecorator6.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getLocation();
        java.lang.String str11 = parkingSpot9.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        java.util.List<parking.ParkingSpot> parkingSpotList13 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList14 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager15 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot19 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str20 = parkingSpot19.getLocation();
        java.lang.String str21 = parkingSpot19.getLocation();
        parkingLotManager15.addParkingSpot(parkingSpot19);
        parking.ParkingSpot parkingSpot26 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str27 = parkingSpot26.getLocation();
        parkingLotManager15.addParkingSpot(parkingSpot26);
        java.util.List<parking.ParkingSpot> parkingSpotList29 = parkingLotManager15.getParkingSpots();
        parking.ParkingSpot parkingSpot33 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str34 = parkingSpot33.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator35 = new parking.CoveredParkingDecorator(parkingSpot33);
        java.lang.String str36 = coveredParkingDecorator35.getDetails();
        parking.EVChargingDecorator eVChargingDecorator37 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator35);
        java.lang.String str38 = coveredParkingDecorator35.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator39 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator35);
        parkingLotManager15.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator35);
        java.util.List<parking.ParkingSpot> parkingSpotList41 = parkingLotManager15.getParkingSpots();
        parking.ParkingSpot parkingSpot45 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator46 = new parking.EVChargingDecorator(parkingSpot45);
        parking.EVChargingDecorator eVChargingDecorator47 = new parking.EVChargingDecorator(parkingSpot45);
        parking.CoveredParkingDecorator coveredParkingDecorator48 = new parking.CoveredParkingDecorator(parkingSpot45);
        parkingLotManager15.addParkingSpot(parkingSpot45);
        parkingLotManager0.addParkingSpot(parkingSpot45);
        parking.ParkingLotManager parkingLotManager51 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot55 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager51.addParkingSpot(parkingSpot55);
        java.lang.String str57 = parkingSpot55.getDetails();
        parking.EVChargingDecorator eVChargingDecorator58 = new parking.EVChargingDecorator(parkingSpot55);
        parking.EVChargingDecorator eVChargingDecorator59 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator58);
        int int60 = eVChargingDecorator58.getId();
        int int61 = eVChargingDecorator58.getId();
        parking.CoveredParkingDecorator coveredParkingDecorator62 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator58);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator62);
        java.util.List<parking.ParkingSpot> parkingSpotList64 = parkingLotManager0.getParkingSpots();
        java.lang.Class<?> wildcardClass65 = parkingSpotList64.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingSpotList13);
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingLotManager15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(parkingSpotList29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str36, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str38, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList41);
        org.junit.Assert.assertNotNull(parkingLotManager51);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str57, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(parkingSpotList64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        int int7 = parkingSpot4.getId();
        java.lang.Class<?> wildcardClass8 = parkingSpot4.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str9 = handicapAccessDecorator6.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator10);
        java.lang.String str12 = coveredParkingDecorator11.getDetails();
        java.lang.String str13 = coveredParkingDecorator11.getParkingLot();
        java.lang.String str14 = coveredParkingDecorator11.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Covered Parking");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Covered Parking");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Handicap Accessible, Covered Parking", "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available, Lot: Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, EV Charging Available");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        java.lang.String str10 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        int int12 = coveredParkingDecorator11.getId();
        java.lang.String str13 = coveredParkingDecorator11.getDetails();
        java.lang.String str14 = coveredParkingDecorator11.getDetails();
        java.lang.String str15 = coveredParkingDecorator11.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking" + "'", str13, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking" + "'", str14, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking" + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        parking.CoveredParkingDecorator coveredParkingDecorator17 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator15);
        parking.HandicapAccessDecorator handicapAccessDecorator18 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator17);
        java.lang.String str19 = handicapAccessDecorator18.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator7.getDetails();
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        java.lang.String str10 = coveredParkingDecorator7.getDetails();
        java.lang.String str11 = coveredParkingDecorator7.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator7.getDetails();
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str11 = coveredParkingDecorator7.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) -1, "hi!", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        int int7 = parkingSpot4.getId();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getParkingLot();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str13 = eVChargingDecorator8.getDetails();
        parking.EVChargingDecorator eVChargingDecorator14 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str13, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(32, "Parking Spot ID: 0, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Lot: Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Lot: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, EV Charging Available", "Parking Spot ID: 10, Location: Parking Spot ID: 1, Location: hi!, Lot: hi!, Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        parking.HandicapAccessDecorator handicapAccessDecorator4 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator4);
        java.lang.String str6 = handicapAccessDecorator4.getDetails();
        java.lang.String str7 = handicapAccessDecorator4.getDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 10, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible, Handicap Accessible" + "'", str6, "Parking Spot ID: 10, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 10, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible, Handicap Accessible" + "'", str7, "Parking Spot ID: 10, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(35, "Parking Spot ID: 0, Location: Parking Spot ID: 100, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, EV Charging Available, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(100, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible", "");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        java.lang.String str16 = coveredParkingDecorator14.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        java.lang.String str10 = coveredParkingDecorator7.getParkingLot();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str12 = coveredParkingDecorator7.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.EVChargingDecorator eVChargingDecorator14 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = coveredParkingDecorator8.getDetails();
        java.lang.String str10 = coveredParkingDecorator8.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.String str12 = coveredParkingDecorator11.getDetails();
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator11);
        int int14 = eVChargingDecorator13.getId();
        java.lang.Class<?> wildcardClass15 = eVChargingDecorator13.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Covered Parking");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str9 = coveredParkingDecorator5.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator10 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.Class<?> wildcardClass11 = coveredParkingDecorator10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        parking.ParkingSpot parkingSpot26 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str27 = parkingSpot26.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator28 = new parking.CoveredParkingDecorator(parkingSpot26);
        java.lang.String str29 = coveredParkingDecorator28.getDetails();
        parking.EVChargingDecorator eVChargingDecorator30 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator28);
        java.lang.String str31 = coveredParkingDecorator28.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator32 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator28);
        java.lang.String str33 = coveredParkingDecorator28.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator34 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator28);
        parking.EVChargingDecorator eVChargingDecorator35 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator28);
        java.lang.String str36 = eVChargingDecorator35.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator35);
        parking.HandicapAccessDecorator handicapAccessDecorator38 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator35);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str21, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str29, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str31, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str33, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str36, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        java.lang.String str5 = parkingSpot3.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        java.lang.String str9 = handicapAccessDecorator6.getDetails();
        java.lang.String str10 = handicapAccessDecorator6.getLocation();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager7 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str12 = parkingSpot11.getLocation();
        java.lang.String str13 = parkingSpot11.getLocation();
        parkingLotManager7.addParkingSpot(parkingSpot11);
        parking.ParkingSpot parkingSpot18 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str19 = parkingSpot18.getLocation();
        parkingLotManager7.addParkingSpot(parkingSpot18);
        java.util.List<parking.ParkingSpot> parkingSpotList21 = parkingLotManager7.getParkingSpots();
        parking.ParkingSpot parkingSpot25 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str26 = parkingSpot25.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator27 = new parking.CoveredParkingDecorator(parkingSpot25);
        java.lang.String str28 = coveredParkingDecorator27.getDetails();
        parking.EVChargingDecorator eVChargingDecorator29 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        java.lang.String str30 = coveredParkingDecorator27.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator31 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        parkingLotManager7.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator27);
        java.util.List<parking.ParkingSpot> parkingSpotList33 = parkingLotManager7.getParkingSpots();
        parking.ParkingSpot parkingSpot37 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator38 = new parking.EVChargingDecorator(parkingSpot37);
        parking.EVChargingDecorator eVChargingDecorator39 = new parking.EVChargingDecorator(parkingSpot37);
        parking.CoveredParkingDecorator coveredParkingDecorator40 = new parking.CoveredParkingDecorator(parkingSpot37);
        parkingLotManager7.addParkingSpot(parkingSpot37);
        parkingLotManager0.addParkingSpot(parkingSpot37);
        parking.ParkingLotManager parkingLotManager43 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot47 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager43.addParkingSpot(parkingSpot47);
        java.lang.String str49 = parkingSpot47.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator50 = new parking.CoveredParkingDecorator(parkingSpot47);
        parking.CoveredParkingDecorator coveredParkingDecorator51 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator50);
        java.lang.String str52 = coveredParkingDecorator50.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator50);
        java.util.List<parking.ParkingSpot> parkingSpotList54 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingLotManager7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(parkingSpotList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str28, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str30, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList33);
        org.junit.Assert.assertNotNull(parkingLotManager43);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str52, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList54);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 10, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available", "");
        parking.CoveredParkingDecorator coveredParkingDecorator4 = new parking.CoveredParkingDecorator(parkingSpot3);
        int int5 = parkingSpot3.getId();
        java.lang.String str6 = parkingSpot3.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 10, Location: Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available, Lot: " + "'", str6, "Parking Spot ID: 10, Location: Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , EV Charging Available, Lot: ");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        int int4 = parkingSpot3.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(100, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Covered Parking, EV Charging Available", "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: ");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        java.lang.String str11 = handicapAccessDecorator9.getDetails();
        java.lang.String str12 = handicapAccessDecorator9.getDetails();
        java.lang.String str13 = handicapAccessDecorator9.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator9);
        parking.EVChargingDecorator eVChargingDecorator15 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator9);
        java.lang.String str16 = eVChargingDecorator15.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, EV Charging Available" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, EV Charging Available");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        java.lang.Class<?> wildcardClass11 = coveredParkingDecorator5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        parking.HandicapAccessDecorator handicapAccessDecorator4 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str5 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str5, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(97, "", "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: ");
        java.lang.String str4 = parkingSpot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        int int11 = eVChargingDecorator8.getId();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        java.lang.String str13 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = coveredParkingDecorator5.getDetails();
        java.lang.String str13 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (byte) 1, "Parking Spot ID: -1, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Covered Parking");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str6 = eVChargingDecorator5.getLocation();
        java.lang.String str7 = eVChargingDecorator5.getDetails();
        java.lang.String str8 = eVChargingDecorator5.getDetails();
        java.lang.String str9 = eVChargingDecorator5.getLocation();
        java.lang.String str10 = eVChargingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator5);
        int int12 = eVChargingDecorator5.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        java.lang.String str16 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        java.lang.String str13 = eVChargingDecorator8.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator14 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        parking.EVChargingDecorator eVChargingDecorator15 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator14);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        java.lang.String str5 = parkingSpot3.getParkingLot();
        java.lang.String str6 = parkingSpot3.getLocation();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str8 = parkingSpot3.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str8, "Parking Spot ID: -1, Location: , Lot: ");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList7 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot11 = new parking.ParkingSpot((int) (byte) 10, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible");
        int int12 = parkingSpot11.getId();
        parkingLotManager0.addParkingSpot(parkingSpot11);
        java.lang.String str14 = parkingSpot11.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingSpotList7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: 10, Location: Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking, EV Charging Available, Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible" + "'", str14, "Parking Spot ID: 10, Location: Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking, EV Charging Available, Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        parking.HandicapAccessDecorator handicapAccessDecorator13 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = eVChargingDecorator6.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = handicapAccessDecorator8.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        int int9 = eVChargingDecorator6.getId();
        java.lang.String str10 = eVChargingDecorator6.getDetails();
        java.lang.String str11 = eVChargingDecorator6.getDetails();
        java.lang.String str12 = eVChargingDecorator6.getDetails();
        java.lang.String str13 = eVChargingDecorator6.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        java.lang.String str19 = coveredParkingDecorator13.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingSpotList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str18, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str19, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str10 = handicapAccessDecorator6.getLocation();
        java.lang.String str11 = handicapAccessDecorator6.getParkingLot();
        java.lang.String str12 = handicapAccessDecorator6.getDetails();
        java.lang.String str13 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        parking.ParkingLotManager parkingLotManager29 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot33 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str34 = parkingSpot33.getLocation();
        java.lang.String str35 = parkingSpot33.getLocation();
        parkingLotManager29.addParkingSpot(parkingSpot33);
        parking.ParkingSpot parkingSpot40 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str41 = parkingSpot40.getLocation();
        parkingLotManager29.addParkingSpot(parkingSpot40);
        java.util.List<parking.ParkingSpot> parkingSpotList43 = parkingLotManager29.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList44 = parkingLotManager29.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList45 = parkingLotManager29.getParkingSpots();
        parking.ParkingSpot parkingSpot49 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str50 = parkingSpot49.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator51 = new parking.CoveredParkingDecorator(parkingSpot49);
        parking.EVChargingDecorator eVChargingDecorator52 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator51);
        parking.EVChargingDecorator eVChargingDecorator53 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator52);
        parking.EVChargingDecorator eVChargingDecorator54 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator52);
        java.lang.String str55 = eVChargingDecorator52.getDetails();
        parking.EVChargingDecorator eVChargingDecorator56 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator52);
        java.lang.String str57 = eVChargingDecorator56.getDetails();
        parkingLotManager29.addParkingSpot((parking.ParkingSpot) eVChargingDecorator56);
        java.lang.String str59 = eVChargingDecorator56.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator56);
        int int61 = eVChargingDecorator56.getId();
        java.lang.String str62 = eVChargingDecorator56.getDetails();
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
        org.junit.Assert.assertNotNull(parkingLotManager29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(parkingSpotList43);
        org.junit.Assert.assertNotNull(parkingSpotList44);
        org.junit.Assert.assertNotNull(parkingSpotList45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str55, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str57, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str59, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str62, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str14 = eVChargingDecorator13.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        parking.CoveredParkingDecorator coveredParkingDecorator17 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator15);
        parking.HandicapAccessDecorator handicapAccessDecorator18 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator17);
        java.lang.String str19 = handicapAccessDecorator18.getDetails();
        java.lang.String str20 = handicapAccessDecorator18.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Covered Parking, Handicap Accessible" + "'", str19, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Covered Parking, Handicap Accessible" + "'", str20, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        java.lang.String str8 = coveredParkingDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Covered Parking" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Covered Parking");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        parking.ParkingLotManager parkingLotManager21 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot25 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager21.addParkingSpot(parkingSpot25);
        java.lang.String str27 = parkingSpot25.getDetails();
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator(parkingSpot25);
        java.lang.String str29 = parkingSpot25.getLocation();
        parking.EVChargingDecorator eVChargingDecorator30 = new parking.EVChargingDecorator(parkingSpot25);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator30);
        java.util.List<parking.ParkingSpot> parkingSpotList32 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList33 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList34 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList35 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot39 = new parking.ParkingSpot((int) (byte) 0, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        parking.HandicapAccessDecorator handicapAccessDecorator40 = new parking.HandicapAccessDecorator(parkingSpot39);
        java.lang.String str41 = handicapAccessDecorator40.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator40);
        parking.ParkingSpot parkingSpot46 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str47 = parkingSpot46.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator48 = new parking.CoveredParkingDecorator(parkingSpot46);
        parking.EVChargingDecorator eVChargingDecorator49 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator48);
        parking.EVChargingDecorator eVChargingDecorator50 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator49);
        parking.CoveredParkingDecorator coveredParkingDecorator51 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator49);
        int int52 = eVChargingDecorator49.getId();
        java.lang.String str53 = eVChargingDecorator49.getLocation();
        java.lang.String str54 = eVChargingDecorator49.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator49);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str18, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingLotManager21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList32);
        org.junit.Assert.assertNotNull(parkingSpotList33);
        org.junit.Assert.assertNotNull(parkingSpotList34);
        org.junit.Assert.assertNotNull(parkingSpotList35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible" + "'", str41, "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str54, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) '#', "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Covered Parking", "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        java.lang.String str4 = parkingSpot3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Covered Parking" + "'", str4, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Covered Parking");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator9);
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        java.lang.String str12 = coveredParkingDecorator11.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Covered Parking, EV Charging Available, Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Covered Parking, EV Charging Available, Covered Parking");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        java.lang.Class<?> wildcardClass14 = coveredParkingDecorator10.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList1);
        org.junit.Assert.assertNotNull(parkingSpotList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        int int11 = handicapAccessDecorator9.getId();
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator9);
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking, EV Charging Available");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        java.lang.Class<?> wildcardClass13 = handicapAccessDecorator12.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        int int17 = eVChargingDecorator13.getId();
        int int18 = eVChargingDecorator13.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str14, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator9);
        java.lang.String str11 = eVChargingDecorator10.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Covered Parking, EV Charging Available");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        java.lang.String str12 = coveredParkingDecorator11.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator13 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator11);
        java.lang.String str14 = coveredParkingDecorator11.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator15 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator11);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        parking.EVChargingDecorator eVChargingDecorator9 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.Class<?> wildcardClass10 = eVChargingDecorator9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        parking.ParkingLotManager parkingLotManager21 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot25 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager21.addParkingSpot(parkingSpot25);
        java.lang.String str27 = parkingSpot25.getDetails();
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator(parkingSpot25);
        java.lang.String str29 = parkingSpot25.getLocation();
        parking.EVChargingDecorator eVChargingDecorator30 = new parking.EVChargingDecorator(parkingSpot25);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator30);
        java.util.List<parking.ParkingSpot> parkingSpotList32 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList33 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList34 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList35 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot39 = new parking.ParkingSpot((int) (byte) 0, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        parking.HandicapAccessDecorator handicapAccessDecorator40 = new parking.HandicapAccessDecorator(parkingSpot39);
        java.lang.String str41 = handicapAccessDecorator40.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator40);
        java.util.List<parking.ParkingSpot> parkingSpotList43 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList44 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str18, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingLotManager21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList32);
        org.junit.Assert.assertNotNull(parkingSpotList33);
        org.junit.Assert.assertNotNull(parkingSpotList34);
        org.junit.Assert.assertNotNull(parkingSpotList35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible" + "'", str41, "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertNotNull(parkingSpotList43);
        org.junit.Assert.assertNotNull(parkingSpotList44);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        java.util.List<parking.ParkingSpot> parkingSpotList1 = parkingLotManager0.getParkingSpots();
        parking.ParkingLotManager parkingLotManager2 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot6 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager2.addParkingSpot(parkingSpot6);
        java.lang.String str8 = parkingSpot6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator9 = new parking.EVChargingDecorator(parkingSpot6);
        parking.HandicapAccessDecorator handicapAccessDecorator10 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator9);
        java.lang.String str11 = eVChargingDecorator9.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator9);
        java.lang.String str13 = handicapAccessDecorator12.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator14 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator12);
        java.lang.String str15 = handicapAccessDecorator14.getDetails();
        java.lang.String str16 = handicapAccessDecorator14.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator17 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator14);
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator14);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator14);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList1);
        org.junit.Assert.assertNotNull(parkingLotManager2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str13, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible" + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        parking.HandicapAccessDecorator handicapAccessDecorator49 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator45);
        java.lang.String str50 = handicapAccessDecorator49.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator51 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator49);
        java.lang.String str52 = coveredParkingDecorator51.getDetails();
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Handicap Accessible" + "'", str50, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Handicap Accessible, Covered Parking" + "'", str52, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Handicap Accessible, Covered Parking");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        parking.HandicapAccessDecorator handicapAccessDecorator15 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator14);
        java.lang.String str16 = eVChargingDecorator14.getDetails();
        java.lang.String str17 = eVChargingDecorator14.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, Covered Parking, EV Charging Available" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        java.lang.String str5 = parkingSpot3.getLocation();
        java.lang.String str6 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot3);
        int int8 = coveredParkingDecorator7.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        parking.ParkingSpot parkingSpot28 = new parking.ParkingSpot((int) (short) 100, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        parking.EVChargingDecorator eVChargingDecorator29 = new parking.EVChargingDecorator(parkingSpot28);
        parking.HandicapAccessDecorator handicapAccessDecorator30 = new parking.HandicapAccessDecorator(parkingSpot28);
        java.lang.String str31 = handicapAccessDecorator30.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator30);
        parking.ParkingSpot parkingSpot33 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingLotManager0.addParkingSpot(parkingSpot33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Parking Spot ID: 100, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Handicap Accessible" + "'", str31, "Parking Spot ID: 100, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Lot: Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str8 = eVChargingDecorator7.getDetails();
        java.lang.String str9 = eVChargingDecorator7.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator10 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        parking.EVChargingDecorator eVChargingDecorator32 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        parking.EVChargingDecorator eVChargingDecorator33 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator32);
        int int34 = eVChargingDecorator32.getId();
        java.lang.String str35 = eVChargingDecorator32.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingLotManager20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str30, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available" + "'", str35, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        parking.ParkingLotManager parkingLotManager37 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot41 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager37.addParkingSpot(parkingSpot41);
        java.lang.String str43 = parkingSpot41.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator44 = new parking.CoveredParkingDecorator(parkingSpot41);
        parking.CoveredParkingDecorator coveredParkingDecorator45 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator44);
        java.lang.String str46 = coveredParkingDecorator44.getDetails();
        java.lang.String str47 = coveredParkingDecorator44.getParkingLot();
        parking.EVChargingDecorator eVChargingDecorator48 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator44);
        java.lang.String str49 = coveredParkingDecorator44.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator44);
        java.lang.Class<?> wildcardClass51 = parkingLotManager0.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingSpotList20);
        org.junit.Assert.assertNotNull(parkingLotManager21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str35, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertNotNull(parkingLotManager37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str46, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str49, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator12);
        parking.HandicapAccessDecorator handicapAccessDecorator14 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(35, "", "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        int int4 = parkingSpot3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        java.util.List<parking.ParkingSpot> parkingSpotList39 = parkingLotManager0.getParkingSpots();
        java.lang.Class<?> wildcardClass40 = parkingSpotList39.getClass();
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
        org.junit.Assert.assertNotNull(parkingSpotList39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = coveredParkingDecorator8.getDetails();
        java.lang.String str10 = coveredParkingDecorator8.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator8);
        java.lang.String str12 = coveredParkingDecorator11.getDetails();
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator11);
        java.lang.String str14 = eVChargingDecorator13.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Covered Parking, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Covered Parking, EV Charging Available");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator6);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        parking.EVChargingDecorator eVChargingDecorator12 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        java.lang.String str13 = eVChargingDecorator12.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        parking.HandicapAccessDecorator handicapAccessDecorator16 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str17 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str17, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        parking.ParkingLotManager parkingLotManager21 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot25 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager21.addParkingSpot(parkingSpot25);
        java.lang.String str27 = parkingSpot25.getDetails();
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator(parkingSpot25);
        java.lang.String str29 = parkingSpot25.getLocation();
        parking.EVChargingDecorator eVChargingDecorator30 = new parking.EVChargingDecorator(parkingSpot25);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator30);
        java.lang.String str32 = eVChargingDecorator30.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str18, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingLotManager21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str32, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str14 = eVChargingDecorator8.getDetails();
        java.lang.String str15 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        java.util.List<parking.ParkingSpot> parkingSpotList23 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList24 = parkingLotManager0.getParkingSpots();
        java.lang.Class<?> wildcardClass25 = parkingSpotList24.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str21, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertNotNull(parkingSpotList23);
        org.junit.Assert.assertNotNull(parkingSpotList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator9);
        java.lang.String str11 = handicapAccessDecorator9.getDetails();
        java.lang.String str12 = handicapAccessDecorator9.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot10 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str11 = parkingSpot10.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator12 = new parking.CoveredParkingDecorator(parkingSpot10);
        java.lang.String str13 = coveredParkingDecorator12.getDetails();
        parking.EVChargingDecorator eVChargingDecorator14 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator12);
        java.lang.String str15 = coveredParkingDecorator12.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator16 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator12);
        java.lang.String str17 = handicapAccessDecorator16.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator18 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator16);
        parking.HandicapAccessDecorator handicapAccessDecorator19 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator18);
        parking.CoveredParkingDecorator coveredParkingDecorator20 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator19);
        parking.HandicapAccessDecorator handicapAccessDecorator21 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator20);
        java.lang.String str23 = coveredParkingDecorator20.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str17, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Handicap Accessible, Covered Parking" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Handicap Accessible, Covered Parking");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator8);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        int int5 = eVChargingDecorator4.getId();
        java.lang.String str6 = eVChargingDecorator4.getParkingLot();
        int int7 = eVChargingDecorator4.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available", "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        int int6 = parkingSpot3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str4, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        java.lang.String str20 = handicapAccessDecorator16.getDetails();
        java.lang.String str21 = handicapAccessDecorator16.getDetails();
        java.lang.String str22 = handicapAccessDecorator16.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingLotManager7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str20, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str21, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str22, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        parking.ParkingSpot parkingSpot25 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str26 = parkingSpot25.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator27 = new parking.CoveredParkingDecorator(parkingSpot25);
        java.lang.String str28 = coveredParkingDecorator27.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator29 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        java.lang.String str30 = coveredParkingDecorator27.getDetails();
        java.lang.String str31 = coveredParkingDecorator27.getParkingLot();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator27);
        java.util.List<parking.ParkingSpot> parkingSpotList33 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot37 = new parking.ParkingSpot((int) (short) 0, "", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        parking.HandicapAccessDecorator handicapAccessDecorator38 = new parking.HandicapAccessDecorator(parkingSpot37);
        parkingLotManager0.addParkingSpot(parkingSpot37);
        java.util.List<parking.ParkingSpot> parkingSpotList40 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot44 = new parking.ParkingSpot(0, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking");
        parkingLotManager0.addParkingSpot(parkingSpot44);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str28, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str30, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(parkingSpotList33);
        org.junit.Assert.assertNotNull(parkingSpotList40);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator12);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible" + "'", str14, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot10 = new parking.ParkingSpot((int) (short) 0, "", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator(parkingSpot10);
        java.lang.String str12 = parkingSpot10.getDetails();
        parkingLotManager0.addParkingSpot(parkingSpot10);
        parking.ParkingSpot parkingSpot17 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str18 = parkingSpot17.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot17);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        parking.CoveredParkingDecorator coveredParkingDecorator21 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parking.EVChargingDecorator eVChargingDecorator22 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        java.lang.String str23 = eVChargingDecorator22.getDetails();
        java.lang.String str24 = eVChargingDecorator22.getDetails();
        parking.EVChargingDecorator eVChargingDecorator25 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator22);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator22);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str12, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str24, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator(parkingSpot4);
        java.lang.String str9 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator(parkingSpot4);
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator10);
        parking.EVChargingDecorator eVChargingDecorator12 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        java.lang.Class<?> wildcardClass13 = eVChargingDecorator10.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getLocation();
        int int11 = eVChargingDecorator8.getId();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        parking.EVChargingDecorator eVChargingDecorator13 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str14 = eVChargingDecorator8.getDetails();
        int int15 = eVChargingDecorator8.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        java.lang.String str10 = eVChargingDecorator7.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator7);
        parking.ParkingLotManager parkingLotManager12 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot16 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager12.addParkingSpot(parkingSpot16);
        java.lang.String str18 = parkingSpot16.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator19 = new parking.CoveredParkingDecorator(parkingSpot16);
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator19);
        java.lang.String str21 = eVChargingDecorator20.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator20);
        int int23 = eVChargingDecorator20.getId();
        parking.EVChargingDecorator eVChargingDecorator24 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        java.lang.String str25 = eVChargingDecorator24.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(parkingLotManager12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available" + "'", str21, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str25, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        parking.HandicapAccessDecorator handicapAccessDecorator35 = new parking.HandicapAccessDecorator(parkingSpot30);
        java.lang.String str36 = handicapAccessDecorator35.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator37 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator35);
        parking.HandicapAccessDecorator handicapAccessDecorator38 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator37);
        int int39 = coveredParkingDecorator37.getId();
        parking.EVChargingDecorator eVChargingDecorator40 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator37);
        java.lang.String str41 = coveredParkingDecorator37.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Handicap Accessible" + "'", str36, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Handicap Accessible, Covered Parking" + "'", str41, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Handicap Accessible, Covered Parking");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        parking.EVChargingDecorator eVChargingDecorator14 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str9 = handicapAccessDecorator8.getDetails();
        java.lang.String str10 = handicapAccessDecorator8.getDetails();
        int int11 = handicapAccessDecorator8.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        parking.ParkingSpot parkingSpot9 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str10 = parkingSpot9.getParkingLot();
        parkingLotManager0.addParkingSpot(parkingSpot9);
        parking.ParkingLotManager parkingLotManager12 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot16 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str17 = parkingSpot16.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator18 = new parking.CoveredParkingDecorator(parkingSpot16);
        java.lang.String str19 = coveredParkingDecorator18.getDetails();
        parking.EVChargingDecorator eVChargingDecorator20 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator18);
        parkingLotManager12.addParkingSpot((parking.ParkingSpot) eVChargingDecorator20);
        java.lang.String str22 = eVChargingDecorator20.getDetails();
        java.lang.String str23 = eVChargingDecorator20.getDetails();
        java.lang.String str24 = eVChargingDecorator20.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator25 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        java.lang.String str26 = eVChargingDecorator20.getLocation();
        java.lang.String str27 = eVChargingDecorator20.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator28 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator20);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator20);
        parking.ParkingLotManager parkingLotManager30 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot34 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str35 = parkingSpot34.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator36 = new parking.CoveredParkingDecorator(parkingSpot34);
        java.lang.String str37 = coveredParkingDecorator36.getDetails();
        parking.EVChargingDecorator eVChargingDecorator38 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator36);
        parkingLotManager30.addParkingSpot((parking.ParkingSpot) eVChargingDecorator38);
        java.lang.String str40 = eVChargingDecorator38.getDetails();
        java.lang.String str41 = eVChargingDecorator38.getLocation();
        java.lang.String str42 = eVChargingDecorator38.getLocation();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator38);
        java.lang.String str44 = eVChargingDecorator38.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(parkingLotManager12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str19, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str22, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str24, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str27, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertNotNull(parkingLotManager30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str37, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str40, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str44, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator5);
        java.lang.String str7 = eVChargingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator9 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        java.lang.String str11 = eVChargingDecorator8.getParkingLot();
        java.lang.String str12 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        int int21 = coveredParkingDecorator13.getId();
        java.lang.String str22 = coveredParkingDecorator13.getDetails();
        java.lang.Class<?> wildcardClass23 = coveredParkingDecorator13.getClass();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str18, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str22, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible" + "'", str4, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: -1, Location: , Lot: , EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        parking.HandicapAccessDecorator handicapAccessDecorator4 = new parking.HandicapAccessDecorator(parkingSpot3);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator11 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str12 = handicapAccessDecorator11.getLocation();
        java.lang.String str13 = handicapAccessDecorator11.getDetails();
        java.lang.String str14 = handicapAccessDecorator11.getDetails();
        java.lang.String str15 = handicapAccessDecorator11.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        parking.ParkingSpot parkingSpot30 = new parking.ParkingSpot((int) (short) 0, "", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        parking.EVChargingDecorator eVChargingDecorator31 = new parking.EVChargingDecorator(parkingSpot30);
        parkingLotManager0.addParkingSpot(parkingSpot30);
        parking.ParkingSpot parkingSpot36 = new parking.ParkingSpot((int) (byte) 0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available");
        parkingLotManager0.addParkingSpot(parkingSpot36);
        parking.ParkingLotManager parkingLotManager38 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot42 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager38.addParkingSpot(parkingSpot42);
        parking.ParkingSpot parkingSpot47 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str48 = parkingSpot47.getLocation();
        java.lang.String str49 = parkingSpot47.getLocation();
        parkingLotManager38.addParkingSpot(parkingSpot47);
        parking.ParkingLotManager parkingLotManager51 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot55 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager51.addParkingSpot(parkingSpot55);
        java.lang.String str57 = parkingSpot55.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator58 = new parking.CoveredParkingDecorator(parkingSpot55);
        parkingLotManager38.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator58);
        parking.CoveredParkingDecorator coveredParkingDecorator60 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator58);
        parking.CoveredParkingDecorator coveredParkingDecorator61 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator58);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator61);
        java.lang.String str63 = coveredParkingDecorator61.getDetails();
        int int64 = coveredParkingDecorator61.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str21, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str23, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingSpotList26);
        org.junit.Assert.assertNotNull(parkingLotManager38);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(parkingLotManager51);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking" + "'", str63, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        java.lang.String str11 = handicapAccessDecorator9.getDetails();
        int int12 = handicapAccessDecorator9.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        java.lang.String str15 = coveredParkingDecorator13.getLocation();
        java.lang.String str16 = coveredParkingDecorator13.getDetails();
        java.lang.String str17 = coveredParkingDecorator13.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator18 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str17, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int8 = coveredParkingDecorator7.getId();
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.EVChargingDecorator eVChargingDecorator12 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator11);
        parking.HandicapAccessDecorator handicapAccessDecorator13 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        java.lang.String str12 = coveredParkingDecorator11.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator11);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        parking.EVChargingDecorator eVChargingDecorator18 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator17);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str14, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(35, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available, EV Charging Available", "Parking Spot ID: -1, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, Lot: Parking Spot ID: -1, Location: , Lot: , EV Charging Available, Covered Parking, Covered Parking");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str5 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator8);
        parking.ParkingSpot parkingSpot13 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str14 = parkingSpot13.getParkingLot();
        java.lang.String str15 = parkingSpot13.getParkingLot();
        java.lang.String str16 = parkingSpot13.getDetails();
        parkingLotManager0.addParkingSpot(parkingSpot13);
        java.lang.String str18 = parkingSpot13.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str16, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.util.List<parking.ParkingSpot> parkingSpotList6 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot10 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator(parkingSpot10);
        parking.EVChargingDecorator eVChargingDecorator12 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator11);
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator12);
        java.lang.String str14 = eVChargingDecorator12.getLocation();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator12);
        parking.ParkingSpot parkingSpot19 = new parking.ParkingSpot((int) (short) 100, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Handicap Accessible, Covered Parking", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Handicap Accessible");
        parkingLotManager0.addParkingSpot(parkingSpot19);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str14, "Parking Spot ID: -1, Location: , Lot: ");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = handicapAccessDecorator7.getLocation();
        java.lang.String str9 = handicapAccessDecorator7.getDetails();
        java.lang.String str10 = handicapAccessDecorator7.getDetails();
        java.lang.String str11 = handicapAccessDecorator7.getDetails();
        java.lang.String str12 = handicapAccessDecorator7.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str9, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        java.lang.String str10 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str12 = coveredParkingDecorator11.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator13 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator11);
        parking.HandicapAccessDecorator handicapAccessDecorator14 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator11);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        java.lang.String str10 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str12 = coveredParkingDecorator11.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator13 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator11);
        int int14 = coveredParkingDecorator11.getId();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        java.lang.String str8 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str9 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str10 = coveredParkingDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) ' ', "Parking Spot ID: -1, Location: , Lot: ", "");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str7 = coveredParkingDecorator6.getDetails();
        java.lang.String str8 = coveredParkingDecorator6.getLocation();
        java.lang.String str9 = coveredParkingDecorator6.getDetails();
        java.lang.String str10 = coveredParkingDecorator6.getDetails();
        parking.EVChargingDecorator eVChargingDecorator11 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: " + "'", str8, "Parking Spot ID: -1, Location: , Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: 32, Location: Parking Spot ID: -1, Location: , Lot: , Lot: , Covered Parking");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        parking.CoveredParkingDecorator coveredParkingDecorator13 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str14 = eVChargingDecorator8.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator8);
        java.lang.String str16 = coveredParkingDecorator15.getDetails();
        int int17 = coveredParkingDecorator15.getId();
        java.lang.String str18 = coveredParkingDecorator15.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        java.util.List<parking.ParkingSpot> parkingSpotList16 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot20 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str21 = parkingSpot20.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator22 = new parking.CoveredParkingDecorator(parkingSpot20);
        parking.EVChargingDecorator eVChargingDecorator23 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator22);
        parking.EVChargingDecorator eVChargingDecorator24 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator23);
        parking.EVChargingDecorator eVChargingDecorator25 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator23);
        java.lang.String str26 = eVChargingDecorator23.getDetails();
        parking.EVChargingDecorator eVChargingDecorator27 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator23);
        java.lang.String str28 = eVChargingDecorator27.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator27);
        parking.EVChargingDecorator eVChargingDecorator30 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator27);
        java.lang.String str31 = eVChargingDecorator30.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertNotNull(parkingSpotList15);
        org.junit.Assert.assertNotNull(parkingSpotList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str28, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available" + "'", str31, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str8 = coveredParkingDecorator7.getParkingLot();
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        java.lang.String str8 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        parking.CoveredParkingDecorator coveredParkingDecorator10 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator9);
        java.lang.String str11 = coveredParkingDecorator10.getDetails();
        java.lang.String str12 = coveredParkingDecorator10.getLocation();
        java.lang.String str13 = coveredParkingDecorator10.getDetails();
        java.lang.String str14 = coveredParkingDecorator10.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking" + "'", str13, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking" + "'", str14, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Covered Parking, Covered Parking");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        java.lang.String str25 = eVChargingDecorator21.getDetails();
        java.lang.String str26 = eVChargingDecorator21.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str24, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str25, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        parking.ParkingSpot parkingSpot26 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str27 = parkingSpot26.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator28 = new parking.HandicapAccessDecorator(parkingSpot26);
        parking.HandicapAccessDecorator handicapAccessDecorator29 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator28);
        java.lang.String str30 = handicapAccessDecorator29.getDetails();
        java.lang.String str31 = handicapAccessDecorator29.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator32 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator29);
        java.lang.String str33 = handicapAccessDecorator29.getDetails();
        java.lang.String str34 = handicapAccessDecorator29.getLocation();
        java.lang.String str35 = handicapAccessDecorator29.getDetails();
        java.lang.String str36 = handicapAccessDecorator29.getDetails();
        java.lang.String str37 = handicapAccessDecorator29.getDetails();
        java.lang.String str38 = handicapAccessDecorator29.getLocation();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator29);
        java.util.List<parking.ParkingSpot> parkingSpotList40 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str21, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str30, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str31, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str33, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str35, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str36, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str37, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList40);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        parking.CoveredParkingDecorator coveredParkingDecorator17 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator13);
        java.lang.String str18 = eVChargingDecorator13.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator19 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator13);
        java.lang.String str20 = eVChargingDecorator13.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str14, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str18, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str20, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        parking.CoveredParkingDecorator coveredParkingDecorator17 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator16);
        parking.HandicapAccessDecorator handicapAccessDecorator18 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator16);
        java.lang.String str19 = handicapAccessDecorator16.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Handicap Accessible" + "'", str19, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        java.lang.String str7 = handicapAccessDecorator5.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator5);
        java.lang.String str9 = handicapAccessDecorator5.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        java.lang.String str14 = handicapAccessDecorator12.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator15 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator12);
        java.lang.String str16 = handicapAccessDecorator12.getLocation();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible" + "'", str13, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = coveredParkingDecorator5.getDetails();
        java.lang.String str8 = coveredParkingDecorator5.getParkingLot();
        java.lang.String str9 = coveredParkingDecorator5.getLocation();
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str11 = eVChargingDecorator10.getParkingLot();
        parking.EVChargingDecorator eVChargingDecorator12 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator10);
        java.lang.String str13 = eVChargingDecorator12.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str13, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        java.lang.String str26 = eVChargingDecorator21.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator27 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator21);
        parking.CoveredParkingDecorator coveredParkingDecorator28 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator27);
        parking.EVChargingDecorator eVChargingDecorator29 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator28);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str26, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator8 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str9 = handicapAccessDecorator6.getParkingLot();
        java.lang.String str10 = handicapAccessDecorator6.getDetails();
        java.lang.String str11 = handicapAccessDecorator6.getDetails();
        int int12 = handicapAccessDecorator6.getId();
        java.lang.String str13 = handicapAccessDecorator6.getParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 10, "Parking Spot ID: 1, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible, Lot: Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Lot: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, EV Charging Available", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        parking.ParkingLotManager parkingLotManager25 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot29 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager25.addParkingSpot(parkingSpot29);
        java.lang.String str31 = parkingSpot29.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator32 = new parking.CoveredParkingDecorator(parkingSpot29);
        parking.CoveredParkingDecorator coveredParkingDecorator33 = new parking.CoveredParkingDecorator(parkingSpot29);
        parking.HandicapAccessDecorator handicapAccessDecorator34 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator33);
        parking.EVChargingDecorator eVChargingDecorator35 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator33);
        parking.HandicapAccessDecorator handicapAccessDecorator36 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator33);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator36);
        parking.ParkingSpot parkingSpot41 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str42 = parkingSpot41.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator43 = new parking.CoveredParkingDecorator(parkingSpot41);
        parking.EVChargingDecorator eVChargingDecorator44 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator43);
        parking.EVChargingDecorator eVChargingDecorator45 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator44);
        parking.CoveredParkingDecorator coveredParkingDecorator46 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator44);
        java.lang.String str47 = coveredParkingDecorator46.getDetails();
        java.lang.String str48 = coveredParkingDecorator46.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator49 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator46);
        java.lang.String str50 = coveredParkingDecorator49.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator51 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator49);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator49);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str12, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingLotManager14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(parkingLotManager25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str47, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str48, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Covered Parking" + "'", str50, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Covered Parking");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        parking.ParkingSpot parkingSpot25 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str26 = parkingSpot25.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator27 = new parking.CoveredParkingDecorator(parkingSpot25);
        java.lang.String str28 = coveredParkingDecorator27.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator29 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator27);
        java.lang.String str30 = coveredParkingDecorator27.getDetails();
        java.lang.String str31 = coveredParkingDecorator27.getParkingLot();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) coveredParkingDecorator27);
        parking.ParkingLotManager parkingLotManager33 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot37 = new parking.ParkingSpot((int) (byte) -1, "Parking Spot ID: -1, Location: , Lot: ", "");
        parkingLotManager33.addParkingSpot(parkingSpot37);
        java.util.List<parking.ParkingSpot> parkingSpotList39 = parkingLotManager33.getParkingSpots();
        parking.ParkingLotManager parkingLotManager40 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot44 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager40.addParkingSpot(parkingSpot44);
        java.lang.String str46 = parkingSpot44.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator47 = new parking.CoveredParkingDecorator(parkingSpot44);
        parking.CoveredParkingDecorator coveredParkingDecorator48 = new parking.CoveredParkingDecorator(parkingSpot44);
        parking.HandicapAccessDecorator handicapAccessDecorator49 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator48);
        java.lang.String str50 = handicapAccessDecorator49.getLocation();
        parking.EVChargingDecorator eVChargingDecorator51 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator49);
        parkingLotManager33.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator49);
        java.lang.String str53 = handicapAccessDecorator49.getLocation();
        java.lang.String str54 = handicapAccessDecorator49.getLocation();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator49);
        parking.ParkingSpot parkingSpot59 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str60 = parkingSpot59.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator61 = new parking.CoveredParkingDecorator(parkingSpot59);
        parking.HandicapAccessDecorator handicapAccessDecorator62 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator61);
        int int63 = handicapAccessDecorator62.getId();
        java.lang.String str64 = handicapAccessDecorator62.getParkingLot();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator62);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str28, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str30, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(parkingLotManager33);
        org.junit.Assert.assertNotNull(parkingSpotList39);
        org.junit.Assert.assertNotNull(parkingLotManager40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        java.lang.String str15 = coveredParkingDecorator13.getLocation();
        java.lang.String str16 = coveredParkingDecorator13.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator17 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator13);
        java.lang.String str18 = coveredParkingDecorator13.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking" + "'", str18, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) '#', "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking, EV Charging Available", "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        parking.CoveredParkingDecorator coveredParkingDecorator4 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str5 = coveredParkingDecorator4.getParkingLot();
        java.lang.String str6 = coveredParkingDecorator4.getParkingLot();
        java.lang.String str7 = coveredParkingDecorator4.getDetails();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str5, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible" + "'", str6, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 35, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking, EV Charging Available, Lot: Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, Covered Parking" + "'", str7, "Parking Spot ID: 35, Location: Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available, EV Charging Available, Covered Parking, EV Charging Available, Lot: Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, Covered Parking");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        java.lang.String str41 = coveredParkingDecorator38.getParkingLot();
        java.lang.String str42 = coveredParkingDecorator38.getDetails();
        java.lang.String str43 = coveredParkingDecorator38.getDetails();
        java.lang.String str44 = coveredParkingDecorator38.getDetails();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str42, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str43, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str44, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(32, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Handicap Accessible, Covered Parking, Handicap Accessible, Handicap Accessible", "Parking Spot ID: 10, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) '#', "", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Covered Parking, Covered Parking, EV Charging Available");
        int int4 = parkingSpot3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        java.lang.String str14 = eVChargingDecorator12.getDetails();
        java.lang.String str15 = eVChargingDecorator12.getDetails();
        java.lang.String str16 = eVChargingDecorator12.getParkingLot();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        java.lang.String str20 = eVChargingDecorator16.getDetails();
        java.lang.String str21 = eVChargingDecorator16.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertNotNull(parkingSpotList6);
        org.junit.Assert.assertNotNull(parkingSpotList7);
        org.junit.Assert.assertNotNull(parkingSpotList8);
        org.junit.Assert.assertNotNull(parkingLotManager9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str18, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str20, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str21, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        parking.ParkingSpot parkingSpot26 = new parking.ParkingSpot((-1), "", "");
        parking.CoveredParkingDecorator coveredParkingDecorator27 = new parking.CoveredParkingDecorator(parkingSpot26);
        parking.HandicapAccessDecorator handicapAccessDecorator28 = new parking.HandicapAccessDecorator(parkingSpot26);
        java.lang.String str29 = parkingSpot26.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot26);
        java.util.List<parking.ParkingSpot> parkingSpotList31 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList32 = parkingLotManager0.getParkingSpots();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible" + "'", str21, "Parking Spot ID: 1, Location: hi!, Lot: , Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(parkingSpotList31);
        org.junit.Assert.assertNotNull(parkingSpotList32);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(10, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available, Handicap Accessible, Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking, Handicap Accessible, Covered Parking");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        java.lang.String str30 = coveredParkingDecorator27.getParkingLot();
        java.lang.String str31 = coveredParkingDecorator27.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str16, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str17, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertNotNull(parkingLotManager20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str31, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        parking.CoveredParkingDecorator coveredParkingDecorator21 = new parking.CoveredParkingDecorator(parkingSpot18);
        parking.CoveredParkingDecorator coveredParkingDecorator22 = new parking.CoveredParkingDecorator(parkingSpot18);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(parkingSpotList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: " + "'", str20, "Parking Spot ID: -1, Location: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: ");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getDetails();
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator(parkingSpot4);
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        int int9 = eVChargingDecorator7.getId();
        int int10 = eVChargingDecorator7.getId();
        java.lang.String str11 = eVChargingDecorator7.getDetails();
        java.lang.String str12 = eVChargingDecorator7.getDetails();
        int int13 = eVChargingDecorator7.getId();
        java.lang.String str14 = eVChargingDecorator7.getDetails();
        java.lang.String str15 = eVChargingDecorator7.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str6, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str11, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str14, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str15, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        java.lang.String str6 = coveredParkingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator7 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str8 = handicapAccessDecorator7.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator7);
        java.lang.String str10 = handicapAccessDecorator7.getDetails();
        java.lang.String str11 = handicapAccessDecorator7.getParkingLot();
        parking.HandicapAccessDecorator handicapAccessDecorator12 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator7);
        int int13 = handicapAccessDecorator7.getId();
        java.lang.String str14 = handicapAccessDecorator7.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        parking.ParkingSpot parkingSpot28 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager24.addParkingSpot(parkingSpot28);
        parking.ParkingSpot parkingSpot33 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str34 = parkingSpot33.getLocation();
        java.lang.String str35 = parkingSpot33.getLocation();
        parkingLotManager24.addParkingSpot(parkingSpot33);
        int int37 = parkingSpot33.getId();
        java.lang.String str38 = parkingSpot33.getLocation();
        parkingLotManager0.addParkingSpot(parkingSpot33);
        java.util.List<parking.ParkingSpot> parkingSpotList40 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot44 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str45 = parkingSpot44.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator46 = new parking.CoveredParkingDecorator(parkingSpot44);
        parking.HandicapAccessDecorator handicapAccessDecorator47 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator46);
        java.lang.String str48 = handicapAccessDecorator47.getDetails();
        java.lang.String str49 = handicapAccessDecorator47.getDetails();
        java.lang.String str50 = handicapAccessDecorator47.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator51 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator47);
        int int52 = handicapAccessDecorator47.getId();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator47);
        parking.CoveredParkingDecorator coveredParkingDecorator54 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator47);
        parking.HandicapAccessDecorator handicapAccessDecorator55 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator54);
        java.lang.String str56 = coveredParkingDecorator54.getDetails();
        java.lang.String str57 = coveredParkingDecorator54.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator58 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator54);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList22);
        org.junit.Assert.assertNotNull(parkingSpotList23);
        org.junit.Assert.assertNotNull(parkingLotManager24);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(parkingSpotList40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str48, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str49, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking" + "'", str56, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str4 = parkingSpot3.getDetails();
        java.lang.String str5 = parkingSpot3.getDetails();
        parking.EVChargingDecorator eVChargingDecorator6 = new parking.EVChargingDecorator(parkingSpot3);
        java.lang.String str7 = eVChargingDecorator6.getDetails();
        java.lang.String str8 = eVChargingDecorator6.getLocation();
        java.lang.String str9 = eVChargingDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str4, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str5, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available" + "'", str7, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        java.lang.String str7 = handicapAccessDecorator6.getDetails();
        java.lang.String str8 = handicapAccessDecorator6.getDetails();
        java.lang.String str9 = handicapAccessDecorator6.getLocation();
        java.lang.String str10 = handicapAccessDecorator6.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str7, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        java.lang.String str13 = handicapAccessDecorator12.getLocation();
        java.lang.String str14 = handicapAccessDecorator12.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Handicap Accessible" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator(parkingSpot4);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str9 = coveredParkingDecorator7.getDetails();
        java.lang.String str10 = coveredParkingDecorator7.getDetails();
        parking.CoveredParkingDecorator coveredParkingDecorator11 = new parking.CoveredParkingDecorator((parking.ParkingSpot) coveredParkingDecorator7);
        java.lang.String str12 = coveredParkingDecorator7.getDetails();
        java.lang.String str13 = coveredParkingDecorator7.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str12, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking" + "'", str13, "Parking Spot ID: 1, Location: hi!, Lot: , Covered Parking");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available", "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible");
        parking.HandicapAccessDecorator handicapAccessDecorator4 = new parking.HandicapAccessDecorator(parkingSpot3);
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        java.lang.String str8 = handicapAccessDecorator6.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        int int4 = parkingSpot3.getId();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.CoveredParkingDecorator coveredParkingDecorator6 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator5);
        parking.EVChargingDecorator eVChargingDecorator7 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator6);
        parking.CoveredParkingDecorator coveredParkingDecorator8 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator7);
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        java.lang.String str4 = parkingSpot3.getLocation();
        parking.EVChargingDecorator eVChargingDecorator5 = new parking.EVChargingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator5);
        parking.CoveredParkingDecorator coveredParkingDecorator7 = new parking.CoveredParkingDecorator((parking.ParkingSpot) eVChargingDecorator5);
        java.lang.String str8 = eVChargingDecorator5.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator9 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator5);
        java.lang.String str10 = handicapAccessDecorator9.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str8, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str4 = parkingSpot3.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator5 = new parking.CoveredParkingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator6 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator5);
        int int7 = handicapAccessDecorator6.getId();
        java.lang.String str8 = handicapAccessDecorator6.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator9 = new parking.CoveredParkingDecorator((parking.ParkingSpot) handicapAccessDecorator6);
        parking.EVChargingDecorator eVChargingDecorator10 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator9);
        java.lang.String str11 = eVChargingDecorator10.getDetails();
        java.lang.String str12 = eVChargingDecorator10.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, EV Charging Available" + "'", str11, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, EV Charging Available");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, EV Charging Available" + "'", str12, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking, EV Charging Available");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        parking.ParkingLotManager parkingLotManager21 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot25 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager21.addParkingSpot(parkingSpot25);
        java.lang.String str27 = parkingSpot25.getDetails();
        parking.EVChargingDecorator eVChargingDecorator28 = new parking.EVChargingDecorator(parkingSpot25);
        java.lang.String str29 = parkingSpot25.getLocation();
        parking.EVChargingDecorator eVChargingDecorator30 = new parking.EVChargingDecorator(parkingSpot25);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator30);
        java.util.List<parking.ParkingSpot> parkingSpotList32 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList33 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList34 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList35 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot39 = new parking.ParkingSpot((int) (byte) 0, "Parking Spot ID: -1, Location: , Lot: , Handicap Accessible", "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible");
        parking.HandicapAccessDecorator handicapAccessDecorator40 = new parking.HandicapAccessDecorator(parkingSpot39);
        java.lang.String str41 = handicapAccessDecorator40.getDetails();
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator40);
        parking.ParkingSpot parkingSpot46 = new parking.ParkingSpot(1, "hi!", "hi!");
        java.lang.String str47 = parkingSpot46.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator48 = new parking.HandicapAccessDecorator(parkingSpot46);
        parking.HandicapAccessDecorator handicapAccessDecorator49 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator48);
        java.lang.String str50 = handicapAccessDecorator49.getDetails();
        java.lang.String str51 = handicapAccessDecorator49.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator52 = new parking.HandicapAccessDecorator((parking.ParkingSpot) handicapAccessDecorator49);
        java.lang.String str53 = handicapAccessDecorator49.getDetails();
        java.lang.String str54 = handicapAccessDecorator49.getLocation();
        java.lang.String str55 = handicapAccessDecorator49.getDetails();
        java.lang.String str56 = handicapAccessDecorator49.getDetails();
        java.lang.String str57 = handicapAccessDecorator49.getDetails();
        parking.EVChargingDecorator eVChargingDecorator58 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator49);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) eVChargingDecorator58);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str16, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str18, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertNotNull(parkingLotManager21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: " + "'", str27, "Parking Spot ID: 1, Location: hi!, Lot: ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(parkingSpotList32);
        org.junit.Assert.assertNotNull(parkingSpotList33);
        org.junit.Assert.assertNotNull(parkingSpotList34);
        org.junit.Assert.assertNotNull(parkingSpotList35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible" + "'", str41, "Parking Spot ID: 0, Location: Parking Spot ID: -1, Location: , Lot: , Handicap Accessible, Lot: Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!" + "'", str47, "Parking Spot ID: 1, Location: hi!, Lot: hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str50, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str51, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str53, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str55, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str56, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible" + "'", str57, "Parking Spot ID: 1, Location: hi!, Lot: hi!, Handicap Accessible, Handicap Accessible");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        java.lang.String str14 = coveredParkingDecorator12.getDetails();
        java.lang.String str15 = coveredParkingDecorator12.getDetails();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str6, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str8, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str10, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking" + "'", str14, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking" + "'", str15, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Covered Parking");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        java.util.List<parking.ParkingSpot> parkingSpotList33 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList34 = parkingLotManager0.getParkingSpots();
        java.util.List<parking.ParkingSpot> parkingSpotList35 = parkingLotManager0.getParkingSpots();
        parking.ParkingSpot parkingSpot39 = new parking.ParkingSpot((-1), "", "");
        java.lang.String str40 = parkingSpot39.getParkingLot();
        parking.CoveredParkingDecorator coveredParkingDecorator41 = new parking.CoveredParkingDecorator(parkingSpot39);
        java.lang.String str42 = coveredParkingDecorator41.getDetails();
        parking.HandicapAccessDecorator handicapAccessDecorator43 = new parking.HandicapAccessDecorator((parking.ParkingSpot) coveredParkingDecorator41);
        parking.EVChargingDecorator eVChargingDecorator44 = new parking.EVChargingDecorator((parking.ParkingSpot) coveredParkingDecorator41);
        parking.HandicapAccessDecorator handicapAccessDecorator45 = new parking.HandicapAccessDecorator((parking.ParkingSpot) eVChargingDecorator44);
        java.lang.String str46 = handicapAccessDecorator45.getDetails();
        parking.EVChargingDecorator eVChargingDecorator47 = new parking.EVChargingDecorator((parking.ParkingSpot) handicapAccessDecorator45);
        parkingLotManager0.addParkingSpot((parking.ParkingSpot) handicapAccessDecorator45);
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parkingLotManager13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(parkingSpotList33);
        org.junit.Assert.assertNotNull(parkingSpotList34);
        org.junit.Assert.assertNotNull(parkingSpotList35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking" + "'", str42, "Parking Spot ID: -1, Location: , Lot: , Covered Parking");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible" + "'", str46, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, EV Charging Available, Handicap Accessible");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot((int) (short) 100, "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Handicap Accessible, Handicap Accessible", "Parking Spot ID: -1, Location: , Lot: , Covered Parking, Covered Parking");
        parking.EVChargingDecorator eVChargingDecorator4 = new parking.EVChargingDecorator(parkingSpot3);
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.Class<?> wildcardClass6 = parkingSpot3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        parking.ParkingLotManager parkingLotManager0 = parking.ParkingLotManager.getInstance();
        parking.ParkingSpot parkingSpot4 = new parking.ParkingSpot((int) (short) 1, "hi!", "");
        parkingLotManager0.addParkingSpot(parkingSpot4);
        java.lang.String str6 = parkingSpot4.getLocation();
        int int7 = parkingSpot4.getId();
        parking.EVChargingDecorator eVChargingDecorator8 = new parking.EVChargingDecorator(parkingSpot4);
        java.lang.String str9 = eVChargingDecorator8.getDetails();
        java.lang.String str10 = eVChargingDecorator8.getDetails();
        org.junit.Assert.assertNotNull(parkingLotManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str9, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available" + "'", str10, "Parking Spot ID: 1, Location: hi!, Lot: , EV Charging Available");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        parking.ParkingSpot parkingSpot3 = new parking.ParkingSpot(0, "", "Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available");
        int int4 = parkingSpot3.getId();
        parking.HandicapAccessDecorator handicapAccessDecorator5 = new parking.HandicapAccessDecorator(parkingSpot3);
        java.lang.String str6 = handicapAccessDecorator5.getDetails();
        java.lang.String str7 = handicapAccessDecorator5.getDetails();
        java.lang.String str8 = handicapAccessDecorator5.getDetails();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available, Handicap Accessible" + "'", str6, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available, Handicap Accessible" + "'", str7, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available, Handicap Accessible");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available, Handicap Accessible" + "'", str8, "Parking Spot ID: 0, Location: , Lot: Parking Spot ID: 1, Location: hi!, Lot: hi!, EV Charging Available, Handicap Accessible");
    }
}

