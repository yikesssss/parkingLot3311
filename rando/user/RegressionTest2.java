package rando.user;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean5 = superManager0.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        user.ManagementTeamMember managementTeamMember6 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember6.enableParkingSpace();
        user.SuperManager superManager8 = user.SuperManager.getInstance();
        superManager8.enableParkingSpace();
        superManager8.enableParkingSpace();
        java.lang.String str11 = superManager8.getPassword();
        superManager8.disableParkingLot();
        user.ManagementTeamMember managementTeamMember16 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember16.processManualInput("");
        java.lang.String str19 = managementTeamMember16.getPassword();
        managementTeamMember16.disableParkingLot();
        managementTeamMember16.enableParkingLot();
        boolean boolean22 = managementTeamMember16.validateEmail();
        java.lang.String str23 = managementTeamMember16.getPassword();
        superManager8.rejectUser((user.User) managementTeamMember16);
        managementTeamMember16.receiveError("Management Team");
        managementTeamMember6.approveUser((user.User) managementTeamMember16);
        superManager0.approveUser((user.User) managementTeamMember6);
        user.Faculty faculty32 = new user.Faculty("", "SuperManager", "SuperManager");
        superManager0.rejectUser((user.User) faculty32);
        user.ManagementTeamMember managementTeamMember37 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember37.disableParkingLot();
        boolean boolean41 = managementTeamMember37.login("", "");
        managementTeamMember37.processManualInput("");
        superManager0.rejectUser((user.User) managementTeamMember37);
        user.ManagementTeamMember managementTeamMember48 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember48.verifyLicencePlate();
        managementTeamMember48.enableParkingSpace();
        superManager0.rejectUser((user.User) managementTeamMember48);
        superManager0.enableParkingLot();
        java.lang.Class<?> wildcardClass53 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
// flaky "1) test1002(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        user.ManagementTeamMember managementTeamMember9 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember9.processManualInput("");
        java.lang.String str12 = managementTeamMember9.getPassword();
        managementTeamMember9.disableParkingLot();
        managementTeamMember9.enableParkingLot();
        boolean boolean15 = managementTeamMember9.validateEmail();
        java.lang.String str16 = managementTeamMember9.getPassword();
        managementTeamMember9.processManualInput("hi!");
        managementTeamMember3.approveUser((user.User) managementTeamMember9);
        managementTeamMember9.disableParkingSpace();
        java.lang.String str21 = managementTeamMember9.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "SuperManager", "Student", "adminPass");
        boolean boolean7 = userConcrete4.login("hi!", "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.disableParkingLot();
        java.lang.String str6 = managementTeamMember3.getEmail();
        managementTeamMember3.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "Management Team", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("Management Team", "", "Faculty", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        boolean boolean9 = managementTeamMember3.validatePassword();
        managementTeamMember3.enableParkingSpace();
        boolean boolean11 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Management Team" + "'", str6, "Management Team");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "", "");
        user.User user15 = managementUserFactory0.createUser("Management Team", "adminPass", "Student", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = managementUserFactory0.createUser("", "hi!", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "Student", "Visitor");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str8 = managementTeamMember7.getUsername();
        managementTeamMember7.receiveError("");
        managementTeamMember7.receiveError("SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        managementTeamMember3.disableParkingSpace();
        java.lang.String str15 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Visitor" + "'", str15, "Visitor");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Visitor", "Management Team", "Student");
        boolean boolean6 = managementTeamMember3.login("adminPass", "Student");
        managementTeamMember3.register();
// flaky "2) test1011(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.generateManagementAccount("adminPass", "hi!", "adminPass");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        user.Visitor visitor3 = new user.Visitor("SuperManager", "adminPass", "");
        visitor3.register();
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Faculty", "Faculty", "adminPass", "");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.addParkingLot();
        boolean boolean10 = managementTeamMember3.login("Management Team", "Management Team");
        boolean boolean13 = managementTeamMember3.login("adminPass", "adminPass");
        managementTeamMember3.receiveError("Management Team");
        managementTeamMember3.processManualInput("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "Management Team", "", "");
        user.User user10 = clientUserFactory0.createUser("Visitor", "SuperManager", "Management Team", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = clientUserFactory0.createUser("adminPass", "SuperManager", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        boolean boolean4 = managementTeamMember3.validateEmail();
        boolean boolean5 = managementTeamMember3.validatePassword();
        boolean boolean8 = managementTeamMember3.login("adminPass", "adminPass");
        managementTeamMember3.processManualInput("Student");
        boolean boolean13 = managementTeamMember3.login("Faculty", "Management Team");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "adminPass", "Student");
        boolean boolean4 = managementTeamMember3.validatePassword();
        java.lang.String str5 = managementTeamMember3.getEmail();
        java.lang.String str6 = managementTeamMember3.getUsername();
        java.lang.String str7 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SuperManager" + "'", str5, "SuperManager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "adminPass" + "'", str6, "adminPass");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SuperManager" + "'", str7, "SuperManager");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "hi!", "");
        managementTeamMember3.disableParkingSpace();
        user.Student student8 = new user.Student("", "adminPass", "adminPass");
        boolean boolean11 = student8.login("Student", "hi!");
        java.lang.String str12 = student8.getUserType();
        managementTeamMember3.rejectUser((user.User) student8);
        managementTeamMember3.receiveError("");
// flaky "3) test1019(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        user.ManagementTeamMember managementTeamMember18 = new user.ManagementTeamMember("", "Student", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember18);
        java.lang.String str20 = managementTeamMember18.getEmail();
        java.lang.String str21 = managementTeamMember18.getEmail();
        managementTeamMember18.processManualInput("adminPass");
        boolean boolean24 = managementTeamMember18.validateEmail();
// flaky "4) test1020(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        user.SuperManager superManager5 = user.SuperManager.getInstance();
        superManager5.enableParkingSpace();
        superManager5.enableParkingSpace();
        java.lang.String str8 = superManager5.getPassword();
        superManager5.disableParkingLot();
        user.ManagementTeamMember managementTeamMember13 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember13.processManualInput("");
        java.lang.String str16 = managementTeamMember13.getPassword();
        managementTeamMember13.disableParkingLot();
        managementTeamMember13.enableParkingLot();
        boolean boolean19 = managementTeamMember13.validateEmail();
        java.lang.String str20 = managementTeamMember13.getPassword();
        superManager5.rejectUser((user.User) managementTeamMember13);
        managementTeamMember13.receiveError("Management Team");
        managementTeamMember3.approveUser((user.User) managementTeamMember13);
        user.ManagementTeamMember managementTeamMember28 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember28.processManualInput("");
        managementTeamMember28.enableParkingLot();
        user.Visitor visitor35 = new user.Visitor("", "hi!", "");
        managementTeamMember28.approveUser((user.User) visitor35);
        boolean boolean37 = managementTeamMember28.validateEmail();
        boolean boolean38 = managementTeamMember28.validatePassword();
        user.ManagementTeamMember managementTeamMember42 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember42.disableParkingLot();
        user.ManagementTeamMember managementTeamMember47 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember47.processManualInput("");
        managementTeamMember47.addParkingLot();
        managementTeamMember42.approveUser((user.User) managementTeamMember47);
        managementTeamMember47.processManualInput("Management Team");
        user.ManagementTeamMember managementTeamMember57 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str58 = managementTeamMember57.getUsername();
        managementTeamMember57.receiveError("");
        managementTeamMember57.receiveError("SuperManager");
        managementTeamMember47.rejectUser((user.User) managementTeamMember57);
        managementTeamMember47.processManualInput("Faculty");
        managementTeamMember28.rejectUser((user.User) managementTeamMember47);
        managementTeamMember47.register();
        managementTeamMember3.rejectUser((user.User) managementTeamMember47);
        boolean boolean69 = managementTeamMember47.validatePassword();
        managementTeamMember47.enableParkingLot();
        managementTeamMember47.disableParkingSpace();
        org.junit.Assert.assertNotNull(superManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "adminPass" + "'", str8, "adminPass");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        boolean boolean12 = managementTeamMember8.validatePassword();
        java.lang.String str13 = managementTeamMember8.getUserType();
        superManager0.rejectUser((user.User) managementTeamMember8);
        user.ManagementTeamMember managementTeamMember18 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember18.processManualInput("");
        java.lang.String str21 = managementTeamMember18.getPassword();
        managementTeamMember18.disableParkingLot();
        managementTeamMember18.enableParkingLot();
        boolean boolean24 = managementTeamMember18.validateEmail();
        java.lang.String str25 = managementTeamMember18.getPassword();
        user.ManagementTeamMember managementTeamMember29 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember29.disableParkingLot();
        boolean boolean33 = managementTeamMember29.login("", "");
        managementTeamMember18.approveUser((user.User) managementTeamMember29);
        user.SuperManager superManager35 = user.SuperManager.getInstance();
        superManager35.register();
        superManager35.enableParkingSpace();
        java.lang.String str38 = superManager35.getUsername();
        boolean boolean39 = superManager35.validatePassword();
        managementTeamMember18.approveUser((user.User) superManager35);
        managementTeamMember8.rejectUser((user.User) managementTeamMember18);
        user.SuperManager superManager42 = user.SuperManager.getInstance();
        superManager42.enableParkingSpace();
        superManager42.enableParkingSpace();
        boolean boolean45 = superManager42.validatePassword();
        managementTeamMember18.approveUser((user.User) superManager42);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky "5) test1022(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(superManager35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "SuperManager" + "'", str38, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(superManager42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        user.User user10 = clientUserFactory0.createUser("Student", "Faculty", "hi!", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "Visitor", "Management Team", "adminPass");
        user.User user20 = clientUserFactory0.createUser("Student", "Visitor", "adminPass", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user25 = clientUserFactory0.createUser("adminPass", "hi!", "Faculty", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        user.UserConcrete userConcrete4 = new user.UserConcrete("SuperManager", "Visitor", "SuperManager", "SuperManager");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        managementTeamMember3.receiveError("adminPass");
        managementTeamMember3.disableParkingSpace();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.disableParkingLot();
        boolean boolean16 = managementTeamMember14.validatePassword();
        java.lang.String str17 = managementTeamMember14.getUsername();
        managementTeamMember14.enableParkingSpace();
        managementTeamMember3.approveUser((user.User) managementTeamMember14);
        java.lang.String str20 = managementTeamMember14.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("Management Team", "Visitor", "SuperManager", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingSpace();
        user.ManagementTeamMember managementTeamMember11 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember11.processManualInput("");
        java.lang.String str14 = managementTeamMember11.getPassword();
        managementTeamMember11.disableParkingLot();
        managementTeamMember11.enableParkingLot();
        boolean boolean17 = managementTeamMember11.validateEmail();
        java.lang.String str18 = managementTeamMember11.getPassword();
        user.ManagementTeamMember managementTeamMember22 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember22.disableParkingLot();
        boolean boolean26 = managementTeamMember22.login("", "");
        managementTeamMember11.approveUser((user.User) managementTeamMember22);
        managementTeamMember11.receiveError("Visitor");
        managementTeamMember11.enableParkingSpace();
        managementTeamMember3.rejectUser((user.User) managementTeamMember11);
        managementTeamMember11.receiveError("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky "6) test1027(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.enableParkingLot();
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        user.Student student3 = new user.Student("SuperManager", "", "Visitor");
        student3.register();
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        user.User user10 = managementUserFactory0.createUser("Management Team", "hi!", "Faculty", "Management Team");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        superManager0.generateManagementAccount("hi!", "Student", "");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        user.Faculty faculty3 = new user.Faculty("Faculty", "SuperManager", "");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "adminPass", "Management Team", "Management Team");
        boolean boolean5 = userConcrete4.validatePassword();
        boolean boolean8 = userConcrete4.login("", "SuperManager");
        boolean boolean9 = userConcrete4.validatePassword();
        java.lang.Class<?> wildcardClass10 = userConcrete4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "7) test1033(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.receiveError("SuperManager");
        boolean boolean11 = managementTeamMember3.login("hi!", "");
        boolean boolean12 = managementTeamMember3.validateEmail();
        java.lang.String str13 = managementTeamMember3.getEmail();
        boolean boolean14 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getEmail();
        managementTeamMember3.receiveError("hi!");
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.register();
        java.lang.String str11 = managementTeamMember3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        user.Faculty faculty9 = new user.Faculty("hi!", "", "");
        managementTeamMember3.approveUser((user.User) faculty9);
        managementTeamMember3.enableParkingLot();
        boolean boolean12 = managementTeamMember3.validatePassword();
        java.lang.String str13 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        boolean boolean6 = managementTeamMember3.login("SuperManager", "Student");
        boolean boolean7 = managementTeamMember3.validatePassword();
        boolean boolean8 = managementTeamMember3.validatePassword();
        user.Visitor visitor12 = new user.Visitor("adminPass", "adminPass", "SuperManager");
        boolean boolean13 = visitor12.validateEmail();
        visitor12.register();
        managementTeamMember3.rejectUser((user.User) visitor12);
        boolean boolean18 = managementTeamMember3.login("Student", "Faculty");
        boolean boolean19 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        user.UserConcrete userConcrete4 = new user.UserConcrete("hi!", "Student", "Visitor", "Visitor");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingSpace();
        user.ManagementTeamMember managementTeamMember11 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember11.processManualInput("");
        java.lang.String str14 = managementTeamMember11.getPassword();
        managementTeamMember11.disableParkingLot();
        managementTeamMember11.enableParkingLot();
        boolean boolean17 = managementTeamMember11.validateEmail();
        java.lang.String str18 = managementTeamMember11.getPassword();
        user.ManagementTeamMember managementTeamMember22 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember22.disableParkingLot();
        boolean boolean26 = managementTeamMember22.login("", "");
        managementTeamMember11.approveUser((user.User) managementTeamMember22);
        managementTeamMember11.receiveError("Visitor");
        managementTeamMember11.enableParkingSpace();
        managementTeamMember3.rejectUser((user.User) managementTeamMember11);
        boolean boolean32 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky "8) test1039(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        user.Student student3 = new user.Student("adminPass", "Management Team", "");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "hi!", "");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.generateManagementAccount("adminPass", "SuperManager", "adminPass");
        boolean boolean8 = superManager0.validateEmail();
        java.lang.String str9 = superManager0.getUsername();
        superManager0.enableParkingLot();
        superManager0.processManualInput("Visitor");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SuperManager" + "'", str9, "SuperManager");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        user.ManagementTeamMember managementTeamMember6 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember6.enableParkingSpace();
        user.SuperManager superManager8 = user.SuperManager.getInstance();
        superManager8.enableParkingSpace();
        superManager8.enableParkingSpace();
        java.lang.String str11 = superManager8.getPassword();
        superManager8.disableParkingLot();
        user.ManagementTeamMember managementTeamMember16 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember16.processManualInput("");
        java.lang.String str19 = managementTeamMember16.getPassword();
        managementTeamMember16.disableParkingLot();
        managementTeamMember16.enableParkingLot();
        boolean boolean22 = managementTeamMember16.validateEmail();
        java.lang.String str23 = managementTeamMember16.getPassword();
        superManager8.rejectUser((user.User) managementTeamMember16);
        managementTeamMember16.receiveError("Management Team");
        managementTeamMember6.approveUser((user.User) managementTeamMember16);
        superManager0.approveUser((user.User) managementTeamMember6);
        user.Faculty faculty32 = new user.Faculty("", "SuperManager", "SuperManager");
        superManager0.rejectUser((user.User) faculty32);
        java.lang.String str34 = faculty32.getEmail();
        java.lang.String str35 = faculty32.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "SuperManager" + "'", str35, "SuperManager");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        user.Visitor visitor3 = new user.Visitor("Student", "SuperManager", "");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.generateManagementAccount("hi!", "hi!", "adminPass");
        boolean boolean5 = superManager0.validatePassword();
        java.lang.String str6 = superManager0.getUsername();
        boolean boolean7 = superManager0.validatePassword();
        superManager0.addParkingLot();
        superManager0.disableParkingLot();
        superManager0.generateManagementAccount("adminPass", "Management Team", "hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SuperManager" + "'", str6, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        user.ManagementTeamMember managementTeamMember6 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember6.enableParkingSpace();
        user.SuperManager superManager8 = user.SuperManager.getInstance();
        superManager8.enableParkingSpace();
        superManager8.enableParkingSpace();
        java.lang.String str11 = superManager8.getPassword();
        superManager8.disableParkingLot();
        user.ManagementTeamMember managementTeamMember16 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember16.processManualInput("");
        java.lang.String str19 = managementTeamMember16.getPassword();
        managementTeamMember16.disableParkingLot();
        managementTeamMember16.enableParkingLot();
        boolean boolean22 = managementTeamMember16.validateEmail();
        java.lang.String str23 = managementTeamMember16.getPassword();
        superManager8.rejectUser((user.User) managementTeamMember16);
        managementTeamMember16.receiveError("Management Team");
        managementTeamMember6.approveUser((user.User) managementTeamMember16);
        superManager0.approveUser((user.User) managementTeamMember6);
        user.Faculty faculty32 = new user.Faculty("", "SuperManager", "SuperManager");
        superManager0.rejectUser((user.User) faculty32);
        user.ManagementTeamMember managementTeamMember37 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember37.disableParkingLot();
        boolean boolean41 = managementTeamMember37.login("", "");
        managementTeamMember37.processManualInput("");
        superManager0.rejectUser((user.User) managementTeamMember37);
        user.ManagementTeamMember managementTeamMember48 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember48.verifyLicencePlate();
        managementTeamMember48.enableParkingSpace();
        superManager0.rejectUser((user.User) managementTeamMember48);
        superManager0.register();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
// flaky "9) test1047(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        java.lang.String str5 = managementTeamMember3.getPassword();
        java.lang.String str6 = managementTeamMember3.getEmail();
        java.lang.String str7 = managementTeamMember3.getUserType();
        managementTeamMember3.receiveError("");
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Management Team" + "'", str7, "Management Team");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Student", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember7.disableParkingLot();
        boolean boolean9 = managementTeamMember7.validatePassword();
        java.lang.String str10 = managementTeamMember7.getEmail();
        managementTeamMember7.addParkingLot();
        managementTeamMember3.rejectUser((user.User) managementTeamMember7);
        managementTeamMember7.disableParkingLot();
        managementTeamMember7.disableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "Visitor", "Visitor");
        java.lang.String str4 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SuperManager" + "'", str4, "SuperManager");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        java.lang.String str3 = superManager0.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.disableParkingLot();
        boolean boolean18 = managementTeamMember14.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember14);
        java.lang.String str20 = managementTeamMember14.getEmail();
        managementTeamMember14.register();
        managementTeamMember14.verifyLicencePlate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "10) test1052(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Management Team", "", "", "Management Team");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        user.Faculty faculty3 = new user.Faculty("adminPass", "Management Team", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        java.lang.String str6 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Faculty", "Visitor", "Faculty", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "hi!", "", "Visitor");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("", "SuperManager", "Management Team", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Student", "Visitor", "Student", "Student");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        user.Student student3 = new user.Student("", "Faculty", "SuperManager");
        java.lang.String str4 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.receiveError("SuperManager");
        boolean boolean9 = managementTeamMember3.validateEmail();
        managementTeamMember3.receiveError("adminPass");
        managementTeamMember3.receiveError("Visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Faculty", "Visitor", "SuperManager");
        user.ManagementUserFactory managementUserFactory4 = new user.ManagementUserFactory();
        user.User user9 = managementUserFactory4.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user14 = managementUserFactory4.createUser("Management Team", "Visitor", "", "");
        boolean boolean17 = user14.login("", "");
        managementTeamMember3.rejectUser(user14);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(user14);
// flaky "11) test1060(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        java.lang.String str16 = managementTeamMember10.getEmail();
        managementTeamMember10.receiveError("");
        managementTeamMember10.disableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "12) test1061(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "Student", "");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Management Team", "", "", "adminPass");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        boolean boolean8 = managementTeamMember3.login("Management Team", "Student");
        java.lang.String str9 = managementTeamMember3.getUserType();
        java.lang.String str10 = managementTeamMember3.getUserType();
        java.lang.Class<?> wildcardClass11 = managementTeamMember3.getClass();
// flaky "13) test1064(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Management Team" + "'", str9, "Management Team");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Management Team" + "'", str10, "Management Team");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("Student", "Management Team", "Management Team");
        superManager0.enableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.generateManagementAccount("", "", "");
        boolean boolean6 = superManager0.validatePassword();
        user.SuperManager superManager7 = user.SuperManager.getInstance();
        superManager7.enableParkingSpace();
        superManager7.enableParkingSpace();
        java.lang.String str10 = superManager7.getPassword();
        superManager7.disableParkingLot();
        user.ManagementTeamMember managementTeamMember15 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember15.processManualInput("");
        managementTeamMember15.addParkingLot();
        boolean boolean19 = managementTeamMember15.validatePassword();
        java.lang.String str20 = managementTeamMember15.getUserType();
        superManager7.rejectUser((user.User) managementTeamMember15);
        superManager7.register();
        boolean boolean23 = superManager7.validateEmail();
        superManager0.rejectUser((user.User) superManager7);
        user.SuperManager superManager25 = user.SuperManager.getInstance();
        superManager25.register();
        superManager25.enableParkingSpace();
        superManager25.generateManagementAccount("Student", "Management Team", "Management Team");
        superManager7.approveUser((user.User) superManager25);
        user.Student student36 = new user.Student("Student", "adminPass", "Student");
        superManager25.rejectUser((user.User) student36);
        java.lang.String str38 = superManager25.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "adminPass" + "'", str10, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Management Team" + "'", str20, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(superManager25);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        superManager0.generateManagementAccount("", "hi!", "Student");
        java.lang.String str10 = superManager0.getUsername();
        boolean boolean11 = superManager0.validatePassword();
        superManager0.disableParkingSpace();
        superManager0.disableParkingLot();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SuperManager" + "'", str10, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("Management Team", "adminPass", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        user.Visitor visitor3 = new user.Visitor("", "Management Team", "hi!");
        java.lang.String str4 = visitor3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        user.Faculty faculty3 = new user.Faculty("Visitor", "Student", "Faculty");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        boolean boolean12 = managementTeamMember8.validatePassword();
        java.lang.String str13 = managementTeamMember8.getUserType();
        superManager0.rejectUser((user.User) managementTeamMember8);
        user.ManagementTeamMember managementTeamMember18 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember18.processManualInput("");
        java.lang.String str21 = managementTeamMember18.getPassword();
        managementTeamMember18.disableParkingLot();
        managementTeamMember18.enableParkingLot();
        boolean boolean24 = managementTeamMember18.validateEmail();
        java.lang.String str25 = managementTeamMember18.getPassword();
        user.ManagementTeamMember managementTeamMember29 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember29.disableParkingLot();
        boolean boolean33 = managementTeamMember29.login("", "");
        managementTeamMember18.approveUser((user.User) managementTeamMember29);
        user.SuperManager superManager35 = user.SuperManager.getInstance();
        superManager35.register();
        superManager35.enableParkingSpace();
        java.lang.String str38 = superManager35.getUsername();
        boolean boolean39 = superManager35.validatePassword();
        managementTeamMember18.approveUser((user.User) superManager35);
        managementTeamMember8.rejectUser((user.User) managementTeamMember18);
        managementTeamMember18.enableParkingSpace();
        boolean boolean43 = managementTeamMember18.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(superManager35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "SuperManager" + "'", str38, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        user.UserConcrete userConcrete4 = new user.UserConcrete("hi!", "SuperManager", "Student", "SuperManager");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        user.Student student3 = new user.Student("Student", "SuperManager", "Student");
        boolean boolean6 = student3.login("", "Visitor");
        boolean boolean9 = student3.login("Management Team", "Management Team");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "Student", "Visitor");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str8 = managementTeamMember7.getUsername();
        managementTeamMember7.receiveError("");
        managementTeamMember7.receiveError("SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        managementTeamMember7.processManualInput("adminPass");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean4 = faculty3.validateEmail();
        boolean boolean5 = faculty3.validatePassword();
        java.lang.String str6 = faculty3.getEmail();
        boolean boolean9 = faculty3.login("Student", "adminPass");
        boolean boolean10 = faculty3.validatePassword();
        boolean boolean11 = faculty3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "14) test1075(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "Management Team", "hi!");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        user.UserConcrete userConcrete4 = new user.UserConcrete("SuperManager", "Management Team", "Visitor", "SuperManager");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        boolean boolean6 = managementTeamMember3.login("SuperManager", "Student");
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean4 = faculty3.validateEmail();
        boolean boolean5 = faculty3.validatePassword();
        java.lang.String str6 = faculty3.getEmail();
        boolean boolean9 = faculty3.login("Student", "adminPass");
        java.lang.String str10 = faculty3.getUserType();
        java.lang.String str11 = faculty3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "15) test1079(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        user.Visitor visitor3 = new user.Visitor("", "", "hi!");
        boolean boolean4 = visitor3.validateEmail();
        boolean boolean5 = visitor3.validatePassword();
        java.lang.String str6 = visitor3.getPassword();
        visitor3.register();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.enableParkingSpace();
        java.lang.String str6 = managementTeamMember3.getEmail();
        managementTeamMember3.addParkingLot();
        java.lang.String str8 = managementTeamMember3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.enableParkingLot();
        superManager0.generateManagementAccount("Management Team", "", "Visitor");
        superManager0.verifyLicencePlate();
        boolean boolean9 = superManager0.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.enableParkingLot();
        java.lang.String str8 = managementTeamMember3.getPassword();
        managementTeamMember3.processManualInput("Management Team");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        java.lang.String str4 = managementTeamMember3.getUserType();
        managementTeamMember3.receiveError("adminPass");
        managementTeamMember3.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Management Team" + "'", str4, "Management Team");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        boolean boolean6 = managementTeamMember3.login("SuperManager", "Student");
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getPassword();
        boolean boolean9 = managementTeamMember3.validateEmail();
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.verifyLicencePlate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Student", "SuperManager", "adminPass", "");
        user.User user15 = clientUserFactory0.createUser("Student", "adminPass", "SuperManager", "");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        boolean boolean18 = managementTeamMember3.login("Student", "SuperManager");
        managementTeamMember3.processManualInput("Visitor");
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "16) test1087(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Student", "");
        user.Faculty faculty7 = new user.Faculty("", "adminPass", "Management Team");
        faculty7.register();
        managementTeamMember3.rejectUser((user.User) faculty7);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        boolean boolean6 = managementTeamMember3.login("SuperManager", "Student");
        java.lang.String str7 = managementTeamMember3.getUsername();
        java.lang.String str8 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Faculty", "Visitor", "Faculty", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "hi!", "", "Visitor");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        java.lang.String str9 = managementTeamMember3.getPassword();
        user.ManagementTeamMember managementTeamMember13 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember13.disableParkingLot();
        boolean boolean15 = managementTeamMember13.validatePassword();
        user.Faculty faculty19 = new user.Faculty("hi!", "", "");
        managementTeamMember13.approveUser((user.User) faculty19);
        managementTeamMember3.rejectUser((user.User) faculty19);
        user.ManagementTeamMember managementTeamMember25 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str26 = managementTeamMember25.getUsername();
        managementTeamMember25.receiveError("");
        managementTeamMember25.processManualInput("hi!");
        managementTeamMember25.disableParkingSpace();
        managementTeamMember3.rejectUser((user.User) managementTeamMember25);
        managementTeamMember25.enableParkingSpace();
        managementTeamMember25.addParkingLot();
        boolean boolean37 = managementTeamMember25.login("Visitor", "Visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("Management Team", "adminPass");
        managementTeamMember3.enableParkingLot();
        user.ManagementTeamMember managementTeamMember13 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember13.disableParkingLot();
        boolean boolean17 = managementTeamMember13.login("", "");
        boolean boolean20 = managementTeamMember13.login("Student", "");
        managementTeamMember13.receiveError("Student");
        managementTeamMember13.receiveError("Visitor");
        managementTeamMember3.rejectUser((user.User) managementTeamMember13);
        java.lang.String str26 = managementTeamMember13.getUsername();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "17) test1092(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "1) test1092(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "Student", "adminPass", "Student");
        user.User user11 = userAbstractFactory1.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user16 = userAbstractFactory1.createUser("Visitor", "", "SuperManager", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        managementTeamMember10.verifyLicencePlate();
        java.lang.String str17 = managementTeamMember10.getPassword();
        java.lang.String str18 = managementTeamMember10.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        user.Student student3 = new user.Student("hi!", "hi!", "hi!");
        java.lang.String str4 = student3.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "SuperManager", "SuperManager", "SuperManager");
        boolean boolean5 = userConcrete4.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        boolean boolean6 = managementTeamMember3.login("adminPass", "Student");
        boolean boolean7 = managementTeamMember3.validateEmail();
// flaky "18) test1097(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("Student", "Management Team", "adminPass", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        user.Student student3 = new user.Student("Management Team", "Student", "Visitor");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("adminPass", "hi!", "");
        superManager0.enableParkingSpace();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        boolean boolean12 = managementTeamMember3.validateEmail();
        boolean boolean13 = managementTeamMember3.validatePassword();
        user.ManagementTeamMember managementTeamMember17 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember17.disableParkingLot();
        user.ManagementTeamMember managementTeamMember22 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember22.processManualInput("");
        managementTeamMember22.addParkingLot();
        managementTeamMember17.approveUser((user.User) managementTeamMember22);
        managementTeamMember22.processManualInput("Management Team");
        user.ManagementTeamMember managementTeamMember32 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str33 = managementTeamMember32.getUsername();
        managementTeamMember32.receiveError("");
        managementTeamMember32.receiveError("SuperManager");
        managementTeamMember22.rejectUser((user.User) managementTeamMember32);
        managementTeamMember22.processManualInput("Faculty");
        managementTeamMember3.rejectUser((user.User) managementTeamMember22);
        managementTeamMember22.register();
        boolean boolean43 = managementTeamMember22.validateEmail();
        boolean boolean44 = managementTeamMember22.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        user.Student student3 = new user.Student("hi!", "", "Student");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Student", "adminPass", "Visitor", "Management Team");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "hi!");
        managementTeamMember3.disableParkingSpace();
        java.lang.String str5 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.verifyLicencePlate();
        java.lang.String str8 = managementTeamMember3.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        java.lang.String str11 = managementTeamMember8.getPassword();
        managementTeamMember8.disableParkingLot();
        managementTeamMember8.enableParkingLot();
        boolean boolean14 = managementTeamMember8.validateEmail();
        java.lang.String str15 = managementTeamMember8.getPassword();
        superManager0.rejectUser((user.User) managementTeamMember8);
        managementTeamMember8.disableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        user.Faculty faculty3 = new user.Faculty("Faculty", "hi!", "SuperManager");
        boolean boolean6 = faculty3.login("Management Team", "Visitor");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Student", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember7.disableParkingLot();
        boolean boolean9 = managementTeamMember7.validatePassword();
        java.lang.String str10 = managementTeamMember7.getEmail();
        managementTeamMember7.addParkingLot();
        managementTeamMember3.rejectUser((user.User) managementTeamMember7);
        boolean boolean13 = managementTeamMember7.validatePassword();
        managementTeamMember7.receiveError("Student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "adminPass", "Student");
        boolean boolean4 = managementTeamMember3.validatePassword();
        managementTeamMember3.verifyLicencePlate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        superManager0.addParkingLot();
        superManager0.disableParkingSpace();
        superManager0.register();
        user.SuperManager superManager6 = user.SuperManager.getInstance();
        superManager6.enableParkingSpace();
        superManager6.enableParkingSpace();
        java.lang.String str9 = superManager6.getPassword();
        superManager6.disableParkingLot();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.processManualInput("");
        java.lang.String str17 = managementTeamMember14.getPassword();
        managementTeamMember14.disableParkingLot();
        managementTeamMember14.enableParkingLot();
        boolean boolean20 = managementTeamMember14.validateEmail();
        java.lang.String str21 = managementTeamMember14.getPassword();
        superManager6.rejectUser((user.User) managementTeamMember14);
        managementTeamMember14.receiveError("Management Team");
        user.SuperManager superManager25 = user.SuperManager.getInstance();
        superManager25.enableParkingSpace();
        superManager25.enableParkingSpace();
        boolean boolean28 = superManager25.validateEmail();
        boolean boolean29 = superManager25.validatePassword();
        superManager25.disableParkingLot();
        superManager25.generateManagementAccount("Student", "SuperManager", "Student");
        superManager25.addParkingLot();
        managementTeamMember14.approveUser((user.User) superManager25);
        superManager0.approveUser((user.User) managementTeamMember14);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "adminPass" + "'", str9, "adminPass");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.addParkingLot();
        superManager0.disableParkingSpace();
        java.lang.String str4 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        boolean boolean8 = managementTeamMember3.login("Management Team", "Student");
        java.lang.String str9 = managementTeamMember3.getUserType();
        boolean boolean12 = managementTeamMember3.login("Student", "Faculty");
// flaky "19) test1111(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Management Team" + "'", str9, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        user.Faculty faculty12 = new user.Faculty("hi!", "", "");
        boolean boolean13 = faculty12.validateEmail();
        boolean boolean14 = faculty12.validatePassword();
        java.lang.String str15 = faculty12.getEmail();
        boolean boolean18 = faculty12.login("Student", "adminPass");
        java.lang.String str19 = faculty12.getUsername();
        boolean boolean20 = faculty12.validatePassword();
        managementTeamMember3.rejectUser((user.User) faculty12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
// flaky "20) test1112(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.disableParkingLot();
        boolean boolean18 = managementTeamMember14.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember14);
        user.SuperManager superManager20 = user.SuperManager.getInstance();
        superManager20.register();
        superManager20.enableParkingSpace();
        java.lang.String str23 = superManager20.getUsername();
        boolean boolean24 = superManager20.validatePassword();
        managementTeamMember3.approveUser((user.User) superManager20);
        superManager20.processManualInput("");
        superManager20.addParkingLot();
        superManager20.generateManagementAccount("Visitor", "SuperManager", "adminPass");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingLot();
        java.lang.String str5 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        user.UserConcrete userConcrete4 = new user.UserConcrete("SuperManager", "Faculty", "Faculty", "Student");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        boolean boolean2 = superManager0.validatePassword();
        java.lang.String str3 = superManager0.getUserType();
        superManager0.generateManagementAccount("hi!", "SuperManager", "Visitor");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Management Team" + "'", str3, "Management Team");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        user.Faculty faculty3 = new user.Faculty("adminPass", "Faculty", "");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.disableParkingLot();
        boolean boolean18 = managementTeamMember14.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember14);
        managementTeamMember3.receiveError("Visitor");
        managementTeamMember3.register();
        boolean boolean23 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        boolean boolean12 = managementTeamMember8.validatePassword();
        java.lang.String str13 = managementTeamMember8.getUserType();
        superManager0.rejectUser((user.User) managementTeamMember8);
        user.ManagementTeamMember managementTeamMember18 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember18.processManualInput("");
        java.lang.String str21 = managementTeamMember18.getPassword();
        managementTeamMember18.disableParkingLot();
        managementTeamMember18.enableParkingLot();
        boolean boolean24 = managementTeamMember18.validateEmail();
        java.lang.String str25 = managementTeamMember18.getPassword();
        user.ManagementTeamMember managementTeamMember29 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember29.disableParkingLot();
        boolean boolean33 = managementTeamMember29.login("", "");
        managementTeamMember18.approveUser((user.User) managementTeamMember29);
        user.SuperManager superManager35 = user.SuperManager.getInstance();
        superManager35.register();
        superManager35.enableParkingSpace();
        java.lang.String str38 = superManager35.getUsername();
        boolean boolean39 = superManager35.validatePassword();
        managementTeamMember18.approveUser((user.User) superManager35);
        managementTeamMember8.rejectUser((user.User) managementTeamMember18);
        managementTeamMember18.processManualInput("SuperManager");
        java.lang.Class<?> wildcardClass44 = managementTeamMember18.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(superManager35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "SuperManager" + "'", str38, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        managementTeamMember3.register();
        boolean boolean12 = managementTeamMember3.validateEmail();
        user.SuperManager superManager13 = user.SuperManager.getInstance();
        superManager13.enableParkingSpace();
        superManager13.enableParkingSpace();
        superManager13.addParkingLot();
        managementTeamMember3.rejectUser((user.User) superManager13);
        managementTeamMember3.receiveError("Management Team");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(superManager13);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.verifyLicencePlate();
        superManager0.register();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        user.Faculty faculty3 = new user.Faculty("", "", "Student");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        user.Faculty faculty3 = new user.Faculty("adminPass", "adminPass", "");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        boolean boolean10 = managementTeamMember3.login("hi!", "Management Team");
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.enableParkingSpace();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        boolean boolean12 = managementTeamMember3.validateEmail();
        boolean boolean13 = managementTeamMember3.validatePassword();
        user.ManagementTeamMember managementTeamMember17 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember17.disableParkingLot();
        user.ManagementTeamMember managementTeamMember22 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember22.processManualInput("");
        managementTeamMember22.addParkingLot();
        managementTeamMember17.approveUser((user.User) managementTeamMember22);
        managementTeamMember22.processManualInput("Management Team");
        user.ManagementTeamMember managementTeamMember32 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str33 = managementTeamMember32.getUsername();
        managementTeamMember32.receiveError("");
        managementTeamMember32.receiveError("SuperManager");
        managementTeamMember22.rejectUser((user.User) managementTeamMember32);
        managementTeamMember22.processManualInput("Faculty");
        managementTeamMember3.rejectUser((user.User) managementTeamMember22);
        user.SuperManager superManager42 = user.SuperManager.getInstance();
        superManager42.enableParkingSpace();
        superManager42.generateManagementAccount("hi!", "hi!", "");
        superManager42.generateManagementAccount("", "hi!", "Student");
        managementTeamMember22.rejectUser((user.User) superManager42);
        user.Visitor visitor56 = new user.Visitor("", "hi!", "");
        boolean boolean59 = visitor56.login("adminPass", "SuperManager");
        superManager42.approveUser((user.User) visitor56);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(superManager42);
// flaky "21) test1125(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        user.Visitor visitor3 = new user.Visitor("adminPass", "adminPass", "Management Team");
        boolean boolean6 = visitor3.login("SuperManager", "Visitor");
// flaky "22) test1126(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.generateManagementAccount("", "", "");
        superManager0.generateManagementAccount("Student", "Management Team", "adminPass");
        superManager0.enableParkingSpace();
        superManager0.disableParkingLot();
        user.ManagementTeamMember managementTeamMember15 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember15.processManualInput("");
        managementTeamMember15.addParkingLot();
        boolean boolean19 = managementTeamMember15.validatePassword();
        managementTeamMember15.receiveError("adminPass");
        managementTeamMember15.enableParkingLot();
        superManager0.approveUser((user.User) managementTeamMember15);
        managementTeamMember15.receiveError("hi!");
        boolean boolean28 = managementTeamMember15.login("Management Team", "");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        user.Visitor visitor3 = new user.Visitor("Management Team", "Visitor", "Faculty");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        boolean boolean6 = managementTeamMember3.validateEmail();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str11 = managementTeamMember10.getUsername();
        user.ManagementTeamMember managementTeamMember15 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember15.processManualInput("");
        java.lang.String str18 = managementTeamMember15.getPassword();
        managementTeamMember10.approveUser((user.User) managementTeamMember15);
        managementTeamMember3.rejectUser((user.User) managementTeamMember15);
        managementTeamMember3.addParkingLot();
        managementTeamMember3.verifyLicencePlate();
        java.lang.String str23 = managementTeamMember3.getUsername();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        user.Student student3 = new user.Student("Management Team", "Student", "hi!");
        student3.register();
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        user.Faculty faculty3 = new user.Faculty("Student", "", "");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.enableParkingLot();
        superManager0.enableParkingLot();
        superManager0.enableParkingSpace();
        java.lang.String str6 = superManager0.getUsername();
        superManager0.register();
        superManager0.disableParkingSpace();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SuperManager" + "'", str6, "SuperManager");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Management Team", "Student");
        java.lang.String str4 = managementTeamMember3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        user.Visitor visitor3 = new user.Visitor("adminPass", "adminPass", "adminPass");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        superManager0.generateManagementAccount("adminPass", "Management Team", "adminPass");
        user.SuperManager superManager7 = user.SuperManager.getInstance();
        superManager7.enableParkingSpace();
        superManager7.verifyLicencePlate();
        superManager7.verifyLicencePlate();
        java.lang.String str11 = superManager7.getEmail();
        java.lang.String str12 = superManager7.getUsername();
        superManager7.disableParkingSpace();
        superManager0.rejectUser((user.User) superManager7);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SuperManager" + "'", str12, "SuperManager");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        user.ManagementTeamMember managementTeamMember6 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember6.enableParkingSpace();
        user.SuperManager superManager8 = user.SuperManager.getInstance();
        superManager8.enableParkingSpace();
        superManager8.enableParkingSpace();
        java.lang.String str11 = superManager8.getPassword();
        superManager8.disableParkingLot();
        user.ManagementTeamMember managementTeamMember16 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember16.processManualInput("");
        java.lang.String str19 = managementTeamMember16.getPassword();
        managementTeamMember16.disableParkingLot();
        managementTeamMember16.enableParkingLot();
        boolean boolean22 = managementTeamMember16.validateEmail();
        java.lang.String str23 = managementTeamMember16.getPassword();
        superManager8.rejectUser((user.User) managementTeamMember16);
        managementTeamMember16.receiveError("Management Team");
        managementTeamMember6.approveUser((user.User) managementTeamMember16);
        superManager0.approveUser((user.User) managementTeamMember6);
        user.Faculty faculty32 = new user.Faculty("", "SuperManager", "SuperManager");
        superManager0.rejectUser((user.User) faculty32);
        superManager0.processManualInput("SuperManager");
        user.ManagementTeamMember managementTeamMember39 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember39.disableParkingLot();
        boolean boolean41 = managementTeamMember39.validatePassword();
        user.Faculty faculty45 = new user.Faculty("hi!", "", "");
        managementTeamMember39.approveUser((user.User) faculty45);
        java.lang.String str47 = managementTeamMember39.getUsername();
        managementTeamMember39.addParkingLot();
        superManager0.rejectUser((user.User) managementTeamMember39);
        java.lang.String str50 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "adminPass" + "'", str50, "adminPass");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean10 = managementTeamMember3.login("Student", "");
        managementTeamMember3.receiveError("Student");
        managementTeamMember3.register();
        boolean boolean14 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "23) test1137(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        java.lang.String str5 = managementTeamMember3.getPassword();
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.enableParkingSpace();
        java.lang.String str8 = managementTeamMember3.getUsername();
        managementTeamMember3.register();
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.processManualInput("Faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "Student", "Management Team", "Faculty");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getEmail();
        java.lang.String str5 = managementTeamMember3.getEmail();
        managementTeamMember3.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "Management Team", "adminPass");
        managementTeamMember3.enableParkingSpace();
        java.lang.String str5 = managementTeamMember3.getEmail();
        managementTeamMember3.register();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        user.Visitor visitor12 = new user.Visitor("hi!", "adminPass", "Student");
        managementTeamMember7.rejectUser((user.User) visitor12);
        managementTeamMember7.register();
        managementTeamMember7.processManualInput("Faculty");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        user.ManagementTeamMember managementTeamMember19 = new user.ManagementTeamMember("SuperManager", "Visitor", "hi!");
        managementTeamMember19.disableParkingSpace();
        managementTeamMember10.rejectUser((user.User) managementTeamMember19);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(true);
        user.User user6 = userAbstractFactory1.createUser("Faculty", "Management Team", "Visitor", "");
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.disableParkingLot();
        boolean boolean18 = managementTeamMember14.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember14);
        user.SuperManager superManager20 = user.SuperManager.getInstance();
        superManager20.register();
        superManager20.enableParkingSpace();
        java.lang.String str23 = superManager20.getUsername();
        boolean boolean24 = superManager20.validatePassword();
        managementTeamMember3.approveUser((user.User) superManager20);
        java.lang.String str26 = managementTeamMember3.getEmail();
        managementTeamMember3.register();
        user.ManagementTeamMember managementTeamMember31 = new user.ManagementTeamMember("", "Student", "adminPass");
        managementTeamMember31.verifyLicencePlate();
        user.ManagementTeamMember managementTeamMember36 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember36.disableParkingLot();
        boolean boolean38 = managementTeamMember36.validatePassword();
        managementTeamMember31.rejectUser((user.User) managementTeamMember36);
        managementTeamMember3.approveUser((user.User) managementTeamMember36);
        managementTeamMember3.register();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.generateManagementAccount("", "", "");
        superManager0.generateManagementAccount("Student", "Management Team", "adminPass");
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("Student", "Management Team", "Visitor");
        boolean boolean15 = superManager0.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        user.Student student3 = new user.Student("adminPass", "", "");
        student3.register();
        java.lang.String str5 = student3.getUserType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.generateManagementAccount("adminPass", "SuperManager", "adminPass");
        boolean boolean8 = superManager0.validateEmail();
        user.ManagementTeamMember managementTeamMember12 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str13 = managementTeamMember12.getUsername();
        managementTeamMember12.receiveError("");
        managementTeamMember12.addParkingLot();
        managementTeamMember12.processManualInput("Student");
        managementTeamMember12.enableParkingLot();
        superManager0.rejectUser((user.User) managementTeamMember12);
        superManager0.generateManagementAccount("hi!", "", "hi!");
        superManager0.disableParkingLot();
        superManager0.receiveError("SuperManager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        user.ManagementTeamMember managementTeamMember18 = new user.ManagementTeamMember("", "Student", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember18);
        java.lang.String str20 = managementTeamMember18.getUserType();
        boolean boolean21 = managementTeamMember18.validatePassword();
// flaky "24) test1149(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Management Team" + "'", str20, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean10 = managementTeamMember3.login("Student", "");
        managementTeamMember3.receiveError("Student");
        managementTeamMember3.register();
        java.lang.String str14 = managementTeamMember3.getEmail();
        java.lang.String str15 = managementTeamMember3.getUsername();
        managementTeamMember3.register();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "25) test1150(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        boolean boolean18 = managementTeamMember3.login("Student", "SuperManager");
        java.lang.String str19 = managementTeamMember3.getPassword();
        java.lang.String str20 = managementTeamMember3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "26) test1151(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Management Team" + "'", str20, "Management Team");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        java.lang.String str6 = superManager0.getUsername();
        boolean boolean7 = superManager0.validatePassword();
        superManager0.generateManagementAccount("adminPass", "hi!", "hi!");
        java.lang.String str12 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SuperManager" + "'", str6, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Management Team" + "'", str12, "Management Team");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Student", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember7.disableParkingLot();
        boolean boolean9 = managementTeamMember7.validatePassword();
        java.lang.String str10 = managementTeamMember7.getEmail();
        managementTeamMember7.addParkingLot();
        managementTeamMember3.rejectUser((user.User) managementTeamMember7);
        boolean boolean13 = managementTeamMember7.validateEmail();
        java.lang.String str14 = managementTeamMember7.getUsername();
        managementTeamMember7.addParkingLot();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        user.ManagementTeamMember managementTeamMember6 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember6.enableParkingSpace();
        user.SuperManager superManager8 = user.SuperManager.getInstance();
        superManager8.enableParkingSpace();
        superManager8.enableParkingSpace();
        java.lang.String str11 = superManager8.getPassword();
        superManager8.disableParkingLot();
        user.ManagementTeamMember managementTeamMember16 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember16.processManualInput("");
        java.lang.String str19 = managementTeamMember16.getPassword();
        managementTeamMember16.disableParkingLot();
        managementTeamMember16.enableParkingLot();
        boolean boolean22 = managementTeamMember16.validateEmail();
        java.lang.String str23 = managementTeamMember16.getPassword();
        superManager8.rejectUser((user.User) managementTeamMember16);
        managementTeamMember16.receiveError("Management Team");
        managementTeamMember6.approveUser((user.User) managementTeamMember16);
        superManager0.approveUser((user.User) managementTeamMember6);
        user.Faculty faculty32 = new user.Faculty("", "SuperManager", "SuperManager");
        superManager0.rejectUser((user.User) faculty32);
        superManager0.processManualInput("SuperManager");
        boolean boolean38 = superManager0.login("", "SuperManager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
// flaky "27) test1154(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        user.Student student3 = new user.Student("Management Team", "", "SuperManager");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Visitor", "Faculty", "hi!", "");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("adminPass", "", "");
        java.lang.String str4 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Management Team", "Faculty");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "SuperManager", "Visitor", "Student");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean6 = faculty3.login("hi!", "hi!");
        faculty3.register();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("Faculty", "Visitor", "adminPass", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "Management Team", "hi!");
        managementTeamMember3.verifyLicencePlate();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.enableParkingSpace();
        managementTeamMember8.disableParkingSpace();
        boolean boolean13 = managementTeamMember8.login("Management Team", "Student");
        java.lang.String str14 = managementTeamMember8.getUserType();
        user.ManagementTeamMember managementTeamMember18 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember18.enableParkingSpace();
        managementTeamMember18.disableParkingSpace();
        boolean boolean21 = managementTeamMember18.validateEmail();
        managementTeamMember8.approveUser((user.User) managementTeamMember18);
        managementTeamMember18.receiveError("SuperManager");
        managementTeamMember18.disableParkingLot();
        managementTeamMember3.rejectUser((user.User) managementTeamMember18);
// flaky "28) test1162(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Management Team" + "'", str14, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.disableParkingLot();
        boolean boolean18 = managementTeamMember14.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember14);
        java.lang.String str20 = managementTeamMember14.getEmail();
        managementTeamMember14.register();
        user.ManagementTeamMember managementTeamMember25 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember25.disableParkingLot();
        boolean boolean27 = managementTeamMember25.validatePassword();
        java.lang.String str28 = managementTeamMember25.getUsername();
        managementTeamMember14.approveUser((user.User) managementTeamMember25);
        managementTeamMember14.addParkingLot();
        managementTeamMember14.verifyLicencePlate();
        managementTeamMember14.verifyLicencePlate();
        managementTeamMember14.enableParkingSpace();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        managementTeamMember3.register();
        boolean boolean12 = managementTeamMember3.validateEmail();
        boolean boolean13 = managementTeamMember3.validatePassword();
        boolean boolean14 = managementTeamMember3.validateEmail();
        user.ManagementTeamMember managementTeamMember18 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember18.disableParkingLot();
        user.ManagementTeamMember managementTeamMember23 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember23.processManualInput("");
        managementTeamMember23.addParkingLot();
        managementTeamMember18.approveUser((user.User) managementTeamMember23);
        managementTeamMember23.processManualInput("Management Team");
        user.ManagementTeamMember managementTeamMember33 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str34 = managementTeamMember33.getUsername();
        managementTeamMember33.receiveError("");
        managementTeamMember33.receiveError("SuperManager");
        managementTeamMember23.rejectUser((user.User) managementTeamMember33);
        managementTeamMember3.rejectUser((user.User) managementTeamMember23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        user.User user10 = clientUserFactory0.createUser("Student", "Faculty", "hi!", "Student");
        user.User user15 = clientUserFactory0.createUser("Visitor", "SuperManager", "SuperManager", "Faculty");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("", "hi!", "hi!", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "", "adminPass", "");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.processManualInput("Student");
        java.lang.String str10 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        user.ManagementTeamMember managementTeamMember18 = new user.ManagementTeamMember("", "Student", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember18);
        java.lang.String str20 = managementTeamMember18.getEmail();
        managementTeamMember18.addParkingLot();
        managementTeamMember18.verifyLicencePlate();
// flaky "29) test1168(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "", "adminPass");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.register();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("SuperManager", "", "adminPass");
        java.lang.String str11 = managementTeamMember10.getUsername();
        java.lang.String str12 = managementTeamMember10.getEmail();
        user.Faculty faculty16 = new user.Faculty("hi!", "", "");
        managementTeamMember10.approveUser((user.User) faculty16);
        managementTeamMember3.rejectUser((user.User) faculty16);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SuperManager" + "'", str12, "SuperManager");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Faculty", "Student", "Faculty");
        boolean boolean4 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("Student", "adminPass", "Visitor");
        java.lang.String str9 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Management Team" + "'", str9, "Management Team");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.disableParkingLot();
        boolean boolean18 = managementTeamMember14.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember14);
        user.SuperManager superManager20 = user.SuperManager.getInstance();
        superManager20.register();
        superManager20.enableParkingSpace();
        java.lang.String str23 = superManager20.getUsername();
        boolean boolean24 = superManager20.validatePassword();
        managementTeamMember3.approveUser((user.User) superManager20);
        java.lang.String str26 = superManager20.getUsername();
        superManager20.register();
        superManager20.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "SuperManager" + "'", str26, "SuperManager");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "Visitor", "");
        managementTeamMember3.register();
        java.lang.String str5 = managementTeamMember3.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor" + "'", str5, "Visitor");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("hi!", "hi!", "Student", "adminPass");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.generateManagementAccount("", "", "");
        boolean boolean6 = superManager0.validatePassword();
        user.SuperManager superManager7 = user.SuperManager.getInstance();
        superManager7.enableParkingSpace();
        superManager7.enableParkingSpace();
        java.lang.String str10 = superManager7.getPassword();
        superManager7.disableParkingLot();
        user.ManagementTeamMember managementTeamMember15 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember15.processManualInput("");
        managementTeamMember15.addParkingLot();
        boolean boolean19 = managementTeamMember15.validatePassword();
        java.lang.String str20 = managementTeamMember15.getUserType();
        superManager7.rejectUser((user.User) managementTeamMember15);
        superManager7.register();
        boolean boolean23 = superManager7.validateEmail();
        superManager0.rejectUser((user.User) superManager7);
        user.SuperManager superManager25 = user.SuperManager.getInstance();
        superManager25.register();
        superManager25.enableParkingSpace();
        superManager25.generateManagementAccount("Student", "Management Team", "Management Team");
        superManager7.approveUser((user.User) superManager25);
        superManager25.addParkingLot();
        superManager25.generateManagementAccount("Faculty", "Student", "");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "adminPass" + "'", str10, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Management Team" + "'", str20, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(superManager25);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.register();
        java.lang.String str11 = managementTeamMember3.getPassword();
        boolean boolean12 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.generateManagementAccount("adminPass", "SuperManager", "adminPass");
        superManager0.generateManagementAccount("SuperManager", "hi!", "");
        superManager0.disableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        user.Student student3 = new user.Student("hi!", "hi!", "hi!");
        java.lang.String str4 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean4 = faculty3.validateEmail();
        boolean boolean5 = faculty3.validatePassword();
        boolean boolean8 = faculty3.login("SuperManager", "adminPass");
        boolean boolean11 = faculty3.login("", "Student");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "30) test1179(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "Management Team", "", "");
        user.User user10 = clientUserFactory0.createUser("Visitor", "Student", "hi!", "adminPass");
        user.User user15 = clientUserFactory0.createUser("Student", "Visitor", "Student", "Visitor");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        managementTeamMember3.receiveError("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Management Team", "Management Team", "Management Team", "Visitor");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        user.User user12 = null;
        managementTeamMember3.approveUser(user12);
        user.ManagementTeamMember managementTeamMember17 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember17.processManualInput("");
        managementTeamMember17.addParkingLot();
        managementTeamMember3.rejectUser((user.User) managementTeamMember17);
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.enableParkingLot();
        java.lang.String str24 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        boolean boolean12 = managementTeamMember8.validatePassword();
        java.lang.String str13 = managementTeamMember8.getUserType();
        superManager0.rejectUser((user.User) managementTeamMember8);
        user.ManagementTeamMember managementTeamMember18 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember18.processManualInput("");
        java.lang.String str21 = managementTeamMember18.getPassword();
        managementTeamMember18.disableParkingLot();
        managementTeamMember18.enableParkingLot();
        boolean boolean24 = managementTeamMember18.validateEmail();
        java.lang.String str25 = managementTeamMember18.getPassword();
        user.ManagementTeamMember managementTeamMember29 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember29.disableParkingLot();
        boolean boolean33 = managementTeamMember29.login("", "");
        managementTeamMember18.approveUser((user.User) managementTeamMember29);
        user.SuperManager superManager35 = user.SuperManager.getInstance();
        superManager35.register();
        superManager35.enableParkingSpace();
        java.lang.String str38 = superManager35.getUsername();
        boolean boolean39 = superManager35.validatePassword();
        managementTeamMember18.approveUser((user.User) superManager35);
        managementTeamMember8.rejectUser((user.User) managementTeamMember18);
        managementTeamMember18.processManualInput("SuperManager");
        managementTeamMember18.disableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(superManager35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "SuperManager" + "'", str38, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        java.lang.String str4 = managementTeamMember3.getUserType();
        managementTeamMember3.register();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Management Team" + "'", str4, "Management Team");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        boolean boolean12 = managementTeamMember3.validateEmail();
        boolean boolean13 = managementTeamMember3.validatePassword();
        managementTeamMember3.enableParkingSpace();
        boolean boolean17 = managementTeamMember3.login("Student", "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        boolean boolean12 = managementTeamMember3.validateEmail();
        boolean boolean13 = managementTeamMember3.validatePassword();
        user.ManagementTeamMember managementTeamMember17 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember17.disableParkingLot();
        user.ManagementTeamMember managementTeamMember22 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember22.processManualInput("");
        managementTeamMember22.addParkingLot();
        managementTeamMember17.approveUser((user.User) managementTeamMember22);
        managementTeamMember22.processManualInput("Management Team");
        user.ManagementTeamMember managementTeamMember32 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str33 = managementTeamMember32.getUsername();
        managementTeamMember32.receiveError("");
        managementTeamMember32.receiveError("SuperManager");
        managementTeamMember22.rejectUser((user.User) managementTeamMember32);
        managementTeamMember22.processManualInput("Faculty");
        managementTeamMember3.rejectUser((user.User) managementTeamMember22);
        managementTeamMember3.register();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        java.lang.String str6 = managementTeamMember3.getUsername();
        boolean boolean7 = managementTeamMember3.validatePassword();
        managementTeamMember3.disableParkingLot();
        boolean boolean11 = managementTeamMember3.login("adminPass", "hi!");
        managementTeamMember3.register();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getEmail();
        managementTeamMember3.receiveError("hi!");
        managementTeamMember3.addParkingLot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.generateManagementAccount("adminPass", "SuperManager", "adminPass");
        boolean boolean8 = superManager0.validateEmail();
        superManager0.enableParkingLot();
        user.Faculty faculty13 = new user.Faculty("adminPass", "Management Team", "");
        java.lang.String str14 = faculty13.getEmail();
        boolean boolean17 = faculty13.login("hi!", "hi!");
        superManager0.rejectUser((user.User) faculty13);
        java.lang.Class<?> wildcardClass19 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "adminPass" + "'", str14, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "Management Team", "adminPass", "hi!");
        boolean boolean7 = userConcrete4.login("Visitor", "Visitor");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "Faculty", "hi!");
        boolean boolean4 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.processManualInput("hi!");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.register();
        managementTeamMember3.disableParkingLot();
        boolean boolean12 = managementTeamMember3.validateEmail();
        managementTeamMember3.disableParkingSpace();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        user.Student student3 = new user.Student("hi!", "hi!", "Student");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        java.lang.String str6 = superManager0.getUsername();
        superManager0.verifyLicencePlate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SuperManager" + "'", str6, "SuperManager");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        java.lang.String str6 = managementTeamMember3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        boolean boolean9 = managementTeamMember3.validateEmail();
        boolean boolean10 = managementTeamMember3.validatePassword();
        java.lang.String str11 = managementTeamMember3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Faculty", "Visitor", "Faculty", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "hi!", "", "Visitor");
        user.User user20 = clientUserFactory0.createUser("Faculty", "Faculty", "Faculty", "Student");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.generateManagementAccount("hi!", "hi!", "adminPass");
        superManager0.generateManagementAccount("adminPass", "Student", "");
        java.lang.String str9 = superManager0.getEmail();
        superManager0.receiveError("");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        user.Visitor visitor3 = new user.Visitor("Visitor", "hi!", "adminPass");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        java.lang.String str11 = managementTeamMember8.getPassword();
        managementTeamMember8.disableParkingLot();
        managementTeamMember8.enableParkingLot();
        boolean boolean14 = managementTeamMember8.validateEmail();
        java.lang.String str15 = managementTeamMember8.getPassword();
        superManager0.rejectUser((user.User) managementTeamMember8);
        managementTeamMember8.receiveError("Management Team");
        user.ManagementTeamMember managementTeamMember22 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember22.verifyLicencePlate();
        boolean boolean24 = managementTeamMember22.validateEmail();
        boolean boolean27 = managementTeamMember22.login("Management Team", "adminPass");
        java.lang.String str28 = managementTeamMember22.getPassword();
        managementTeamMember22.verifyLicencePlate();
        managementTeamMember8.rejectUser((user.User) managementTeamMember22);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "31) test1201(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.generateManagementAccount("", "", "");
        superManager0.generateManagementAccount("Student", "Management Team", "adminPass");
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("", "Management Team", "SuperManager");
        superManager0.disableParkingLot();
        superManager0.addParkingLot();
        user.ManagementTeamMember managementTeamMember20 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str21 = managementTeamMember20.getUsername();
        user.ManagementTeamMember managementTeamMember25 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember25.processManualInput("");
        java.lang.String str28 = managementTeamMember25.getPassword();
        managementTeamMember20.approveUser((user.User) managementTeamMember25);
        managementTeamMember20.register();
        managementTeamMember20.verifyLicencePlate();
        java.lang.String str32 = managementTeamMember20.getEmail();
        superManager0.approveUser((user.User) managementTeamMember20);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "SuperManager", "", "adminPass");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("Faculty", "", "Student", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.generateManagementAccount("adminPass", "SuperManager", "adminPass");
        boolean boolean8 = superManager0.validateEmail();
        user.ManagementTeamMember managementTeamMember12 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str13 = managementTeamMember12.getUsername();
        managementTeamMember12.receiveError("");
        managementTeamMember12.addParkingLot();
        managementTeamMember12.processManualInput("Student");
        managementTeamMember12.enableParkingLot();
        superManager0.rejectUser((user.User) managementTeamMember12);
        superManager0.generateManagementAccount("hi!", "", "hi!");
        superManager0.verifyLicencePlate();
        boolean boolean28 = superManager0.login("SuperManager", "hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "32) test1204(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "Faculty");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "hi!");
        java.lang.String str4 = managementTeamMember3.getEmail();
        managementTeamMember3.receiveError("Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Management Team", "Student");
        managementTeamMember3.receiveError("");
        managementTeamMember3.processManualInput("Student");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("Visitor", "Management Team", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean10 = managementTeamMember3.login("Student", "");
        managementTeamMember3.receiveError("Student");
        managementTeamMember3.register();
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.addParkingLot();
        boolean boolean16 = managementTeamMember3.validatePassword();
        boolean boolean19 = managementTeamMember3.login("Visitor", "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "33) test1209(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "2) test1209(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        user.User user12 = null;
        managementTeamMember3.approveUser(user12);
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        boolean boolean8 = managementTeamMember3.login("Management Team", "Student");
        java.lang.String str9 = managementTeamMember3.getUserType();
        user.ManagementTeamMember managementTeamMember13 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember13.enableParkingSpace();
        managementTeamMember13.disableParkingSpace();
        boolean boolean16 = managementTeamMember13.validateEmail();
        managementTeamMember3.approveUser((user.User) managementTeamMember13);
        boolean boolean18 = managementTeamMember13.validatePassword();
        managementTeamMember13.disableParkingSpace();
// flaky "34) test1211(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Management Team" + "'", str9, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "", "");
        java.lang.String str4 = managementTeamMember3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SuperManager" + "'", str4, "SuperManager");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        boolean boolean12 = managementTeamMember8.validatePassword();
        java.lang.String str13 = managementTeamMember8.getUserType();
        superManager0.rejectUser((user.User) managementTeamMember8);
        java.lang.String str15 = superManager0.getUserType();
        superManager0.enableParkingSpace();
        superManager0.disableParkingSpace();
        user.SuperManager superManager18 = user.SuperManager.getInstance();
        superManager18.generateManagementAccount("hi!", "hi!", "adminPass");
        boolean boolean23 = superManager18.validatePassword();
        superManager0.rejectUser((user.User) superManager18);
        java.lang.String str25 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Management Team" + "'", str15, "Management Team");
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Management Team" + "'", str25, "Management Team");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(true);
        user.User user6 = userAbstractFactory1.createUser("Student", "", "adminPass", "");
        user.User user11 = userAbstractFactory1.createUser("Visitor", "Management Team", "Faculty", "adminPass");
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        user.Faculty faculty3 = new user.Faculty("", "hi!", "hi!");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        user.Student student3 = new user.Student("Management Team", "SuperManager", "SuperManager");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        superManager0.generateManagementAccount("Student", "SuperManager", "Student");
        superManager0.disableParkingSpace();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        boolean boolean12 = managementTeamMember3.validateEmail();
        boolean boolean13 = managementTeamMember3.validatePassword();
        user.ManagementTeamMember managementTeamMember17 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember17.disableParkingLot();
        user.ManagementTeamMember managementTeamMember22 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember22.processManualInput("");
        managementTeamMember22.addParkingLot();
        managementTeamMember17.approveUser((user.User) managementTeamMember22);
        managementTeamMember22.processManualInput("Management Team");
        user.ManagementTeamMember managementTeamMember32 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str33 = managementTeamMember32.getUsername();
        managementTeamMember32.receiveError("");
        managementTeamMember32.receiveError("SuperManager");
        managementTeamMember22.rejectUser((user.User) managementTeamMember32);
        managementTeamMember22.processManualInput("Faculty");
        managementTeamMember3.rejectUser((user.User) managementTeamMember22);
        managementTeamMember22.disableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        user.Visitor visitor3 = new user.Visitor("", "hi!", "");
        boolean boolean4 = visitor3.validateEmail();
        java.lang.String str5 = visitor3.getEmail();
        java.lang.String str6 = visitor3.getUserType();
        java.lang.String str7 = visitor3.getPassword();
        boolean boolean8 = visitor3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Visitor" + "'", str6, "Visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        boolean boolean9 = managementTeamMember3.validatePassword();
        managementTeamMember3.enableParkingSpace();
        java.lang.String str11 = managementTeamMember3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Management Team" + "'", str11, "Management Team");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        user.Faculty faculty9 = new user.Faculty("hi!", "", "");
        managementTeamMember3.approveUser((user.User) faculty9);
        java.lang.String str11 = faculty9.getUserType();
        java.lang.String str12 = faculty9.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("adminPass", "", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        boolean boolean5 = managementTeamMember3.validatePassword();
        managementTeamMember3.enableParkingSpace();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "", "Student", "SuperManager");
        userConcrete4.register();
        userConcrete4.register();
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean10 = managementTeamMember3.login("Student", "");
        managementTeamMember3.receiveError("Student");
        managementTeamMember3.register();
        user.ManagementTeamMember managementTeamMember17 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember17.enableParkingSpace();
        managementTeamMember17.disableParkingSpace();
        boolean boolean20 = managementTeamMember17.validateEmail();
        user.ManagementTeamMember managementTeamMember24 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str25 = managementTeamMember24.getUsername();
        user.ManagementTeamMember managementTeamMember29 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember29.processManualInput("");
        java.lang.String str32 = managementTeamMember29.getPassword();
        managementTeamMember24.approveUser((user.User) managementTeamMember29);
        managementTeamMember17.rejectUser((user.User) managementTeamMember29);
        managementTeamMember29.addParkingLot();
        managementTeamMember29.addParkingLot();
        java.lang.String str37 = managementTeamMember29.getPassword();
        user.SuperManager superManager38 = user.SuperManager.getInstance();
        superManager38.enableParkingSpace();
        superManager38.generateManagementAccount("hi!", "hi!", "");
        superManager38.generateManagementAccount("", "hi!", "Student");
        java.lang.String str48 = superManager38.getPassword();
        managementTeamMember29.approveUser((user.User) superManager38);
        managementTeamMember3.rejectUser((user.User) managementTeamMember29);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "35) test1224(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(superManager38);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "adminPass" + "'", str48, "adminPass");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        managementTeamMember3.register();
        user.SuperManager superManager12 = user.SuperManager.getInstance();
        superManager12.generateManagementAccount("hi!", "hi!", "adminPass");
        boolean boolean17 = superManager12.validatePassword();
        java.lang.String str18 = superManager12.getUsername();
        boolean boolean19 = superManager12.validatePassword();
        superManager12.addParkingLot();
        java.lang.String str21 = superManager12.getEmail();
        managementTeamMember3.approveUser((user.User) superManager12);
        superManager12.generateManagementAccount("", "hi!", "Visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(superManager12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SuperManager" + "'", str18, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.verifyLicencePlate();
        superManager0.verifyLicencePlate();
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean5 = superManager0.validatePassword();
        superManager0.receiveError("Student");
        superManager0.generateManagementAccount("SuperManager", "adminPass", "adminPass");
        java.lang.String str12 = superManager0.getEmail();
        java.lang.String str13 = superManager0.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SuperManager" + "'", str13, "SuperManager");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean6 = managementTeamMember3.validatePassword();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        user.Visitor visitor3 = new user.Visitor("Student", "", "SuperManager");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("", "SuperManager", "hi!", "adminPass");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Management Team", "SuperManager", "Faculty", "adminPass");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        user.Student student3 = new user.Student("Student", "Visitor", "Management Team");
        boolean boolean4 = student3.validateEmail();
        boolean boolean5 = student3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "SuperManager", "hi!");
        managementTeamMember3.addParkingLot();
        boolean boolean5 = managementTeamMember3.validateEmail();
        user.ManagementTeamMember managementTeamMember9 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str10 = managementTeamMember9.getUsername();
        java.lang.String str11 = managementTeamMember9.getPassword();
        java.lang.String str12 = managementTeamMember9.getPassword();
        managementTeamMember3.approveUser((user.User) managementTeamMember9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        boolean boolean10 = managementTeamMember3.login("hi!", "Management Team");
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.receiveError("Management Team");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("Student", "Management Team", "Management Team");
        user.UserConcrete userConcrete11 = new user.UserConcrete("Student", "Management Team", "hi!", "");
        superManager0.rejectUser((user.User) userConcrete11);
        boolean boolean13 = superManager0.validatePassword();
        superManager0.generateManagementAccount("hi!", "adminPass", "");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "SuperManager", "", "adminPass");
        java.lang.Class<?> wildcardClass11 = user10.getClass();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "SuperManager", "", "adminPass");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("Visitor", "hi!", "adminPass", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "SuperManager", "Faculty");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        superManager0.generateManagementAccount("", "hi!", "Student");
        java.lang.String str10 = superManager0.getUsername();
        boolean boolean11 = superManager0.validatePassword();
        superManager0.disableParkingSpace();
        java.lang.String str13 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SuperManager" + "'", str10, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        boolean boolean5 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        superManager0.addParkingLot();
        user.Faculty faculty11 = new user.Faculty("adminPass", "", "Management Team");
        superManager0.rejectUser((user.User) faculty11);
        superManager0.generateManagementAccount("Student", "adminPass", "Student");
        superManager0.generateManagementAccount("SuperManager", "adminPass", "Management Team");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.disableParkingLot();
        boolean boolean18 = managementTeamMember14.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember14);
        user.SuperManager superManager20 = user.SuperManager.getInstance();
        superManager20.register();
        superManager20.enableParkingSpace();
        java.lang.String str23 = superManager20.getUsername();
        boolean boolean24 = superManager20.validatePassword();
        managementTeamMember3.approveUser((user.User) superManager20);
        superManager20.processManualInput("");
        superManager20.addParkingLot();
        java.lang.String str29 = superManager20.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "adminPass" + "'", str29, "adminPass");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.generateManagementAccount("adminPass", "SuperManager", "adminPass");
        user.ManagementTeamMember managementTeamMember11 = new user.ManagementTeamMember("Student", "Management Team", "hi!");
        user.Visitor visitor15 = new user.Visitor("Student", "adminPass", "hi!");
        visitor15.register();
        managementTeamMember11.rejectUser((user.User) visitor15);
        superManager0.rejectUser((user.User) managementTeamMember11);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingSpace();
        java.lang.String str6 = managementTeamMember3.getEmail();
        managementTeamMember3.verifyLicencePlate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        managementTeamMember3.receiveError("adminPass");
        managementTeamMember3.disableParkingSpace();
        java.lang.String str11 = managementTeamMember3.getEmail();
        user.ManagementTeamMember managementTeamMember15 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember15.enableParkingSpace();
        managementTeamMember15.disableParkingSpace();
        boolean boolean20 = managementTeamMember15.login("Management Team", "Student");
        managementTeamMember3.rejectUser((user.User) managementTeamMember15);
        managementTeamMember15.enableParkingLot();
        managementTeamMember15.enableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "36) test1244(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        boolean boolean6 = managementTeamMember3.login("SuperManager", "Student");
        boolean boolean7 = managementTeamMember3.validatePassword();
        boolean boolean8 = managementTeamMember3.validatePassword();
        managementTeamMember3.verifyLicencePlate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.disableParkingLot();
        boolean boolean18 = managementTeamMember14.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember14);
        user.SuperManager superManager20 = user.SuperManager.getInstance();
        superManager20.register();
        superManager20.enableParkingSpace();
        java.lang.String str23 = superManager20.getUsername();
        boolean boolean24 = superManager20.validatePassword();
        managementTeamMember3.approveUser((user.User) superManager20);
        superManager20.processManualInput("");
        superManager20.addParkingLot();
        boolean boolean29 = superManager20.validateEmail();
        superManager20.processManualInput("Visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "SuperManager", "hi!");
        managementTeamMember3.addParkingLot();
        boolean boolean5 = managementTeamMember3.validateEmail();
        user.ManagementTeamMember managementTeamMember9 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember9.processManualInput("");
        java.lang.String str12 = managementTeamMember9.getPassword();
        managementTeamMember9.disableParkingLot();
        managementTeamMember9.enableParkingLot();
        boolean boolean15 = managementTeamMember9.validateEmail();
        java.lang.String str16 = managementTeamMember9.getPassword();
        user.ManagementTeamMember managementTeamMember20 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember20.disableParkingLot();
        boolean boolean24 = managementTeamMember20.login("", "");
        managementTeamMember9.approveUser((user.User) managementTeamMember20);
        managementTeamMember9.register();
        boolean boolean27 = managementTeamMember9.validatePassword();
        java.lang.String str28 = managementTeamMember9.getPassword();
        managementTeamMember9.verifyLicencePlate();
        java.lang.String str30 = managementTeamMember9.getEmail();
        managementTeamMember3.rejectUser((user.User) managementTeamMember9);
        java.lang.String str32 = managementTeamMember9.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        superManager0.enableParkingLot();
        java.lang.String str7 = superManager0.getPassword();
        boolean boolean8 = superManager0.validatePassword();
        boolean boolean9 = superManager0.validatePassword();
        superManager0.enableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "adminPass" + "'", str7, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.processManualInput("Student");
        managementTeamMember3.processManualInput("SuperManager");
        java.lang.String str12 = managementTeamMember3.getPassword();
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        java.lang.String str6 = managementTeamMember3.getUsername();
        boolean boolean9 = managementTeamMember3.login("hi!", "hi!");
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        boolean boolean8 = managementTeamMember3.login("Management Team", "Student");
        java.lang.String str9 = managementTeamMember3.getUserType();
        user.ManagementTeamMember managementTeamMember13 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember13.enableParkingSpace();
        managementTeamMember13.disableParkingSpace();
        boolean boolean16 = managementTeamMember13.validateEmail();
        managementTeamMember3.approveUser((user.User) managementTeamMember13);
        managementTeamMember13.receiveError("SuperManager");
        managementTeamMember13.register();
// flaky "37) test1251(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Management Team" + "'", str9, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "adminPass", "Visitor");
        boolean boolean6 = managementTeamMember3.login("Faculty", "Faculty");
        java.lang.String str7 = managementTeamMember3.getEmail();
        managementTeamMember3.receiveError("SuperManager");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        boolean boolean3 = superManager0.validatePassword();
        boolean boolean6 = superManager0.login("Student", "SuperManager");
        boolean boolean7 = superManager0.validateEmail();
        boolean boolean8 = superManager0.validateEmail();
        superManager0.addParkingLot();
        boolean boolean12 = superManager0.login("Student", "Management Team");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "38) test1253(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        user.Visitor visitor3 = new user.Visitor("adminPass", "adminPass", "Management Team");
        java.lang.String str4 = visitor3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "adminPass" + "'", str4, "adminPass");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        managementTeamMember3.register();
        boolean boolean12 = managementTeamMember3.validateEmail();
        user.SuperManager superManager13 = user.SuperManager.getInstance();
        superManager13.enableParkingSpace();
        superManager13.enableParkingSpace();
        superManager13.addParkingLot();
        managementTeamMember3.rejectUser((user.User) superManager13);
        managementTeamMember3.verifyLicencePlate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(superManager13);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.generateManagementAccount("adminPass", "SuperManager", "adminPass");
        boolean boolean8 = superManager0.validateEmail();
        user.ManagementTeamMember managementTeamMember12 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str13 = managementTeamMember12.getUsername();
        managementTeamMember12.receiveError("");
        managementTeamMember12.addParkingLot();
        managementTeamMember12.processManualInput("Student");
        managementTeamMember12.enableParkingLot();
        superManager0.rejectUser((user.User) managementTeamMember12);
        java.lang.String str21 = superManager0.getPassword();
        user.ManagementTeamMember managementTeamMember25 = new user.ManagementTeamMember("", "adminPass", "Faculty");
        superManager0.approveUser((user.User) managementTeamMember25);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "adminPass" + "'", str21, "adminPass");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Faculty", "Student", "SuperManager", "Visitor");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        user.Faculty faculty3 = new user.Faculty("", "adminPass", "Management Team");
        faculty3.register();
        java.lang.Class<?> wildcardClass5 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        user.Visitor visitor3 = new user.Visitor("Student", "", "Management Team");
        java.lang.String str4 = visitor3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Management Team" + "'", str4, "Management Team");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        superManager0.generateManagementAccount("", "Student", "adminPass");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Visitor", "hi!", "SuperManager", "Management Team");
        java.lang.Class<?> wildcardClass5 = userConcrete4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.disableParkingLot();
        boolean boolean18 = managementTeamMember14.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember14);
        user.SuperManager superManager20 = user.SuperManager.getInstance();
        superManager20.register();
        superManager20.enableParkingSpace();
        java.lang.String str23 = superManager20.getUsername();
        boolean boolean24 = superManager20.validatePassword();
        managementTeamMember3.approveUser((user.User) superManager20);
        superManager20.processManualInput("");
        superManager20.addParkingLot();
        user.ManagementTeamMember managementTeamMember32 = new user.ManagementTeamMember("SuperManager", "adminPass", "Student");
        superManager20.approveUser((user.User) managementTeamMember32);
        user.ManagementTeamMember managementTeamMember37 = new user.ManagementTeamMember("", "Management Team", "Visitor");
        managementTeamMember32.rejectUser((user.User) managementTeamMember37);
        managementTeamMember37.enableParkingLot();
        user.UserConcrete userConcrete44 = new user.UserConcrete("adminPass", "SuperManager", "Visitor", "SuperManager");
        managementTeamMember37.approveUser((user.User) userConcrete44);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        boolean boolean18 = managementTeamMember3.login("Student", "SuperManager");
        managementTeamMember3.processManualInput("Visitor");
        boolean boolean23 = managementTeamMember3.login("SuperManager", "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "39) test1263(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        user.Faculty faculty9 = new user.Faculty("hi!", "", "");
        managementTeamMember3.approveUser((user.User) faculty9);
        java.lang.String str11 = managementTeamMember3.getUsername();
        managementTeamMember3.addParkingLot();
        boolean boolean13 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("", "SuperManager", "Student", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        user.Student student3 = new user.Student("adminPass", "", "SuperManager");
        java.lang.String str4 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SuperManager" + "'", str4, "SuperManager");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        user.ManagementTeamMember managementTeamMember6 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember6.enableParkingSpace();
        user.SuperManager superManager8 = user.SuperManager.getInstance();
        superManager8.enableParkingSpace();
        superManager8.enableParkingSpace();
        java.lang.String str11 = superManager8.getPassword();
        superManager8.disableParkingLot();
        user.ManagementTeamMember managementTeamMember16 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember16.processManualInput("");
        java.lang.String str19 = managementTeamMember16.getPassword();
        managementTeamMember16.disableParkingLot();
        managementTeamMember16.enableParkingLot();
        boolean boolean22 = managementTeamMember16.validateEmail();
        java.lang.String str23 = managementTeamMember16.getPassword();
        superManager8.rejectUser((user.User) managementTeamMember16);
        managementTeamMember16.receiveError("Management Team");
        managementTeamMember6.approveUser((user.User) managementTeamMember16);
        superManager0.approveUser((user.User) managementTeamMember6);
        java.lang.String str29 = managementTeamMember6.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        managementTeamMember3.processManualInput("Visitor");
        java.lang.String str12 = managementTeamMember3.getPassword();
        managementTeamMember3.addParkingLot();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        managementTeamMember3.disableParkingSpace();
        java.lang.String str9 = managementTeamMember3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Visitor", "SuperManager", "adminPass", "Visitor");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.processManualInput("Student");
        managementTeamMember3.enableParkingLot();
        java.lang.String str11 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Visitor", "Student", "Management Team", "SuperManager");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = clientUserFactory0.createUser("SuperManager", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Management Team", "Management Team", "adminPass");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.disableParkingLot();
        boolean boolean18 = managementTeamMember14.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember14);
        user.SuperManager superManager20 = user.SuperManager.getInstance();
        superManager20.register();
        superManager20.enableParkingSpace();
        java.lang.String str23 = superManager20.getUsername();
        boolean boolean24 = superManager20.validatePassword();
        managementTeamMember3.approveUser((user.User) superManager20);
        superManager20.processManualInput("");
        superManager20.addParkingLot();
        java.lang.String str29 = superManager20.getEmail();
        superManager20.receiveError("Management Team");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.addParkingLot();
        boolean boolean6 = managementTeamMember3.validateEmail();
        managementTeamMember3.register();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        java.lang.String str11 = managementTeamMember8.getPassword();
        managementTeamMember8.disableParkingLot();
        managementTeamMember8.enableParkingLot();
        boolean boolean14 = managementTeamMember8.validateEmail();
        java.lang.String str15 = managementTeamMember8.getPassword();
        superManager0.rejectUser((user.User) managementTeamMember8);
        boolean boolean19 = managementTeamMember8.login("adminPass", "adminPass");
        boolean boolean20 = managementTeamMember8.validateEmail();
        managementTeamMember8.register();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean10 = managementTeamMember3.login("Student", "");
        managementTeamMember3.receiveError("Student");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.verifyLicencePlate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "40) test1277(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingSpace();
        user.ManagementTeamMember managementTeamMember11 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember11.processManualInput("");
        java.lang.String str14 = managementTeamMember11.getPassword();
        managementTeamMember11.disableParkingLot();
        managementTeamMember11.enableParkingLot();
        boolean boolean17 = managementTeamMember11.validateEmail();
        java.lang.String str18 = managementTeamMember11.getPassword();
        user.ManagementTeamMember managementTeamMember22 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember22.disableParkingLot();
        boolean boolean26 = managementTeamMember22.login("", "");
        managementTeamMember11.approveUser((user.User) managementTeamMember22);
        managementTeamMember11.receiveError("Visitor");
        managementTeamMember11.enableParkingSpace();
        managementTeamMember3.rejectUser((user.User) managementTeamMember11);
        user.User user32 = null;
        managementTeamMember11.approveUser(user32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.disableParkingLot();
        boolean boolean18 = managementTeamMember14.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember14);
        user.SuperManager superManager20 = user.SuperManager.getInstance();
        superManager20.register();
        superManager20.enableParkingSpace();
        java.lang.String str23 = superManager20.getUsername();
        boolean boolean24 = superManager20.validatePassword();
        managementTeamMember3.approveUser((user.User) superManager20);
        superManager20.processManualInput("");
        superManager20.addParkingLot();
        boolean boolean29 = superManager20.validateEmail();
        boolean boolean32 = superManager20.login("Faculty", "SuperManager");
        java.lang.String str33 = superManager20.getUserType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Management Team" + "'", str33, "Management Team");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Management Team", "Management Team", "");
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.register();
        managementTeamMember3.disableParkingSpace();
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.disableParkingLot();
        boolean boolean18 = managementTeamMember14.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember14);
        java.lang.String str20 = managementTeamMember14.getEmail();
        managementTeamMember14.register();
        user.ManagementTeamMember managementTeamMember25 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember25.disableParkingLot();
        boolean boolean27 = managementTeamMember25.validatePassword();
        java.lang.String str28 = managementTeamMember25.getUsername();
        managementTeamMember14.approveUser((user.User) managementTeamMember25);
        managementTeamMember14.addParkingLot();
        managementTeamMember14.register();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("Management Team", "adminPass");
        java.lang.String str9 = managementTeamMember3.getPassword();
        managementTeamMember3.verifyLicencePlate();
        java.lang.String str11 = managementTeamMember3.getEmail();
        managementTeamMember3.receiveError("Faculty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "41) test1282(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        user.User user10 = managementUserFactory0.createUser("Management Team", "SuperManager", "Student", "adminPass");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("hi!", "Visitor", "Visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        boolean boolean5 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        java.lang.String str7 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        managementTeamMember10.verifyLicencePlate();
        java.lang.String str17 = managementTeamMember10.getPassword();
        managementTeamMember10.disableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.generateManagementAccount("hi!", "hi!", "adminPass");
        superManager0.register();
        boolean boolean8 = superManager0.login("", "Management Team");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "42) test1286(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        boolean boolean8 = managementTeamMember3.login("Management Team", "Student");
        java.lang.String str9 = managementTeamMember3.getUserType();
        user.ManagementTeamMember managementTeamMember13 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember13.enableParkingSpace();
        managementTeamMember13.disableParkingSpace();
        boolean boolean16 = managementTeamMember13.validateEmail();
        managementTeamMember3.approveUser((user.User) managementTeamMember13);
        managementTeamMember13.receiveError("SuperManager");
        managementTeamMember13.enableParkingSpace();
// flaky "43) test1287(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Management Team" + "'", str9, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("", "Faculty", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Faculty", "Visitor", "Faculty", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "Student", "Management Team", "SuperManager");
        user.User user20 = clientUserFactory0.createUser("Student", "Student", "Visitor", "Visitor");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        user.Visitor visitor3 = new user.Visitor("Student", "adminPass", "hi!");
        java.lang.String str4 = visitor3.getPassword();
        java.lang.String str5 = visitor3.getUserType();
        java.lang.Class<?> wildcardClass6 = visitor3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor" + "'", str5, "Visitor");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        boolean boolean5 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        superManager0.generateManagementAccount("Visitor", "hi!", "hi!");
        superManager0.disableParkingLot();
        boolean boolean14 = superManager0.login("Visitor", "Student");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "44) test1291(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "adminPass", "Management Team", "Management Team");
        boolean boolean5 = userConcrete4.validatePassword();
        boolean boolean8 = userConcrete4.login("", "SuperManager");
        boolean boolean9 = userConcrete4.validatePassword();
        boolean boolean10 = userConcrete4.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        user.Faculty faculty3 = new user.Faculty("Management Team", "Student", "");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Visitor", "Management Team", "Student");
        boolean boolean6 = managementTeamMember3.login("adminPass", "Student");
        java.lang.String str7 = managementTeamMember3.getUserType();
        java.lang.String str8 = managementTeamMember3.getUserType();
// flaky "45) test1294(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Management Team" + "'", str7, "Management Team");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        boolean boolean4 = superManager0.validateEmail();
        java.lang.String str5 = superManager0.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SuperManager" + "'", str5, "SuperManager");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.generateManagementAccount("hi!", "hi!", "adminPass");
        superManager0.register();
        superManager0.generateManagementAccount("Management Team", "hi!", "SuperManager");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        user.ManagementTeamMember managementTeamMember6 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember6.enableParkingSpace();
        user.SuperManager superManager8 = user.SuperManager.getInstance();
        superManager8.enableParkingSpace();
        superManager8.enableParkingSpace();
        java.lang.String str11 = superManager8.getPassword();
        superManager8.disableParkingLot();
        user.ManagementTeamMember managementTeamMember16 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember16.processManualInput("");
        java.lang.String str19 = managementTeamMember16.getPassword();
        managementTeamMember16.disableParkingLot();
        managementTeamMember16.enableParkingLot();
        boolean boolean22 = managementTeamMember16.validateEmail();
        java.lang.String str23 = managementTeamMember16.getPassword();
        superManager8.rejectUser((user.User) managementTeamMember16);
        managementTeamMember16.receiveError("Management Team");
        managementTeamMember6.approveUser((user.User) managementTeamMember16);
        superManager0.approveUser((user.User) managementTeamMember6);
        user.Faculty faculty32 = new user.Faculty("", "SuperManager", "SuperManager");
        superManager0.rejectUser((user.User) faculty32);
        user.ManagementTeamMember managementTeamMember37 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember37.disableParkingLot();
        boolean boolean41 = managementTeamMember37.login("", "");
        managementTeamMember37.processManualInput("");
        superManager0.rejectUser((user.User) managementTeamMember37);
        java.lang.String str45 = managementTeamMember37.getPassword();
        java.lang.Class<?> wildcardClass46 = managementTeamMember37.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        user.Visitor visitor12 = new user.Visitor("hi!", "adminPass", "Student");
        managementTeamMember7.rejectUser((user.User) visitor12);
        managementTeamMember7.register();
        managementTeamMember7.verifyLicencePlate();
        managementTeamMember7.disableParkingLot();
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        java.lang.String str4 = superManager0.getEmail();
        java.lang.String str5 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        boolean boolean12 = managementTeamMember8.validatePassword();
        java.lang.String str13 = managementTeamMember8.getUserType();
        superManager0.rejectUser((user.User) managementTeamMember8);
        boolean boolean17 = managementTeamMember8.login("adminPass", "Student");
        boolean boolean20 = managementTeamMember8.login("", "Management Team");
        boolean boolean23 = managementTeamMember8.login("Visitor", "Management Team");
        managementTeamMember8.disableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
// flaky "46) test1300(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "3) test1300(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        java.lang.String str11 = managementTeamMember8.getPassword();
        managementTeamMember8.disableParkingLot();
        managementTeamMember8.enableParkingLot();
        boolean boolean14 = managementTeamMember8.validateEmail();
        java.lang.String str15 = managementTeamMember8.getPassword();
        superManager0.rejectUser((user.User) managementTeamMember8);
        java.lang.String str17 = superManager0.getEmail();
        superManager0.disableParkingSpace();
        superManager0.processManualInput("SuperManager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        managementTeamMember3.register();
        user.ManagementTeamMember managementTeamMember11 = new user.ManagementTeamMember("SuperManager", "hi!", "adminPass");
        managementTeamMember11.processManualInput("Faculty");
        java.lang.String str14 = managementTeamMember11.getEmail();
        managementTeamMember11.receiveError("hi!");
        managementTeamMember3.rejectUser((user.User) managementTeamMember11);
        boolean boolean18 = managementTeamMember11.validateEmail();
        user.Faculty faculty22 = new user.Faculty("Management Team", "Visitor", "");
        java.lang.String str23 = faculty22.getPassword();
        managementTeamMember11.approveUser((user.User) faculty22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SuperManager" + "'", str14, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Student", "hi!");
    }
}
