package rando.user;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        user.UserConcrete userConcrete4 = new user.UserConcrete("hi!", "Student", "Management Team", "Management Team");
        java.lang.Class<?> wildcardClass5 = userConcrete4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.generateManagementAccount("hi!", "hi!", "adminPass");
        superManager0.receiveError("Faculty");
        superManager0.processManualInput("SuperManager");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        java.lang.String str12 = visitor10.getUsername();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        boolean boolean18 = managementTeamMember3.login("Student", "SuperManager");
        managementTeamMember3.addParkingLot();
        user.SuperManager superManager20 = user.SuperManager.getInstance();
        superManager20.register();
        superManager20.enableParkingSpace();
        superManager20.enableParkingLot();
        superManager20.enableParkingLot();
        superManager20.enableParkingSpace();
        boolean boolean26 = superManager20.validateEmail();
        managementTeamMember3.rejectUser((user.User) superManager20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "1) test0504(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "1) test0504(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean6 = faculty3.login("hi!", "hi!");
        faculty3.register();
        boolean boolean8 = faculty3.validatePassword();
        java.lang.String str9 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "Faculty", "Visitor");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        user.UserConcrete userConcrete4 = new user.UserConcrete("SuperManager", "hi!", "Student", "hi!");
        userConcrete4.register();
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        boolean boolean6 = managementTeamMember3.login("SuperManager", "Student");
        boolean boolean7 = managementTeamMember3.validatePassword();
        boolean boolean10 = managementTeamMember3.login("Visitor", "");
        boolean boolean13 = managementTeamMember3.login("Management Team", "Student");
// flaky "2) test0508(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        java.lang.String str9 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        java.lang.String str9 = managementTeamMember7.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SuperManager" + "'", str9, "SuperManager");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "Management Team", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("hi!", "Management Team", "Management Team", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        java.lang.String str6 = user5.getPassword();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "adminPass");
        boolean boolean6 = faculty3.login("", "adminPass");
        java.lang.String str7 = faculty3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.register();
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "", "Faculty");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean4 = faculty3.validateEmail();
        boolean boolean5 = faculty3.validatePassword();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.register();
        boolean boolean8 = faculty3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.verifyLicencePlate();
        java.lang.Class<?> wildcardClass3 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        boolean boolean13 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.verifyLicencePlate();
        superManager0.register();
        boolean boolean7 = superManager0.validatePassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        java.lang.String str25 = superManager7.getUsername();
        java.lang.String str26 = superManager7.getEmail();
        boolean boolean27 = superManager7.validatePassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "adminPass" + "'", str10, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Management Team" + "'", str20, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SuperManager" + "'", str25, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        user.Faculty faculty3 = new user.Faculty("Management Team", "Management Team", "SuperManager");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "Student", "adminPass", "Management Team");
        boolean boolean7 = userConcrete4.login("SuperManager", "adminPass");
        java.lang.String str8 = userConcrete4.getUsername();
        java.lang.String str9 = userConcrete4.getUsername();
        java.lang.String str10 = userConcrete4.getEmail();
// flaky "3) test0522(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        // The following exception was thrown during execution in test generation
        try {
            user.User user6 = userAbstractFactory1.createUser("", "SuperManager", "hi!", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.enableParkingLot();
        superManager0.enableParkingLot();
        superManager0.enableParkingSpace();
        user.ManagementTeamMember managementTeamMember9 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str10 = managementTeamMember9.getUsername();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember14.processManualInput("");
        java.lang.String str17 = managementTeamMember14.getPassword();
        managementTeamMember9.approveUser((user.User) managementTeamMember14);
        managementTeamMember9.register();
        managementTeamMember9.verifyLicencePlate();
        superManager0.rejectUser((user.User) managementTeamMember9);
        boolean boolean22 = superManager0.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "Student", "adminPass", "Student");
        user.User user11 = userAbstractFactory1.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user16 = userAbstractFactory1.createUser("Management Team", "", "SuperManager", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user21 = userAbstractFactory1.createUser("Visitor", "", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user16);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        user.Student student3 = new user.Student("SuperManager", "Student", "hi!");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "Student", "");
        java.lang.String str4 = faculty3.getPassword();
        boolean boolean5 = faculty3.validateEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("Management Team", "hi!", "Management Team", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Faculty", "SuperManager", "SuperManager", "Management Team");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "SuperManager", "hi!");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("SuperManager", "Management Team", "adminPass", "adminPass");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Student", "SuperManager", "adminPass", "");
        user.User user15 = clientUserFactory0.createUser("Student", "Management Team", "Student", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("hi!", "Student", "Management Team", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean6 = faculty3.login("hi!", "hi!");
        faculty3.register();
        boolean boolean8 = faculty3.validatePassword();
        java.lang.String str9 = faculty3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        user.ManagementTeamMember managementTeamMember21 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember25 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember21.approveUser((user.User) managementTeamMember25);
        java.lang.String str27 = managementTeamMember25.getEmail();
        java.lang.String str28 = managementTeamMember25.getUsername();
        managementTeamMember8.approveUser((user.User) managementTeamMember25);
        managementTeamMember25.verifyLicencePlate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
// flaky "4) test0535(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.register();
        boolean boolean8 = managementTeamMember3.validateEmail();
        managementTeamMember3.addParkingLot();
        java.lang.String str10 = managementTeamMember3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        managementTeamMember48.disableParkingSpace();
        java.lang.String str53 = managementTeamMember48.getEmail();
        java.lang.String str54 = managementTeamMember48.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "", "adminPass");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        boolean boolean6 = managementTeamMember3.login("SuperManager", "Student");
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getPassword();
        boolean boolean9 = managementTeamMember3.validateEmail();
        managementTeamMember3.register();
// flaky "5) test0539(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        user.Student student3 = new user.Student("Management Team", "Visitor", "adminPass");
        java.lang.Class<?> wildcardClass4 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        boolean boolean9 = managementTeamMember3.validateEmail();
        managementTeamMember3.disableParkingLot();
        user.Faculty faculty14 = new user.Faculty("", "SuperManager", "SuperManager");
        faculty14.register();
        boolean boolean18 = faculty14.login("Management Team", "Management Team");
        managementTeamMember3.rejectUser((user.User) faculty14);
        java.lang.String str20 = faculty14.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        boolean boolean5 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        java.lang.String str7 = superManager0.getEmail();
        boolean boolean8 = superManager0.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        java.lang.String str22 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "adminPass" + "'", str21, "adminPass");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Management Team" + "'", str22, "Management Team");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Visitor", "Management Team", "Faculty", "Faculty");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        java.lang.String str13 = managementTeamMember3.getPassword();
        user.SuperManager superManager14 = user.SuperManager.getInstance();
        superManager14.enableParkingSpace();
        superManager14.verifyLicencePlate();
        superManager14.verifyLicencePlate();
        superManager14.addParkingLot();
        managementTeamMember3.rejectUser((user.User) superManager14);
        managementTeamMember3.register();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(superManager14);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("Management Team", "adminPass");
        java.lang.String str9 = managementTeamMember3.getPassword();
        java.lang.String str10 = managementTeamMember3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "6) test0546(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getEmail();
        managementTeamMember3.disableParkingLot();
        boolean boolean6 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        java.lang.String str11 = managementTeamMember8.getPassword();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        managementTeamMember3.register();
        managementTeamMember3.verifyLicencePlate();
        java.lang.String str15 = managementTeamMember3.getEmail();
        managementTeamMember3.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.receiveError("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "adminPass", "hi!", "");
        java.lang.String str5 = userConcrete4.getUserType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.disableParkingLot();
        boolean boolean8 = managementTeamMember3.login("adminPass", "Visitor");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "SuperManager", "adminPass");
        boolean boolean6 = faculty3.login("SuperManager", "SuperManager");
        boolean boolean7 = faculty3.validatePassword();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SuperManager" + "'", str8, "SuperManager");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "adminPass" + "'", str9, "adminPass");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        user.ManagementTeamMember managementTeamMember21 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember25 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember21.approveUser((user.User) managementTeamMember25);
        java.lang.String str27 = managementTeamMember25.getEmail();
        java.lang.String str28 = managementTeamMember25.getUsername();
        managementTeamMember8.approveUser((user.User) managementTeamMember25);
        java.lang.String str30 = managementTeamMember8.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
// flaky "7) test0553(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        superManager0.enableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.generateManagementAccount("hi!", "hi!", "adminPass");
        superManager0.generateManagementAccount("adminPass", "Student", "");
        superManager0.verifyLicencePlate();
        java.lang.String str10 = superManager0.getUsername();
        boolean boolean11 = superManager0.validateEmail();
        superManager0.generateManagementAccount("Student", "SuperManager", "adminPass");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SuperManager" + "'", str10, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.generateManagementAccount("", "", "");
        java.lang.String str6 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        boolean boolean4 = managementTeamMember3.validateEmail();
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.receiveError("adminPass");
        managementTeamMember3.disableParkingLot();
        boolean boolean9 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        user.Student student3 = new user.Student("Management Team", "SuperManager", "adminPass");
        java.lang.Class<?> wildcardClass4 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.processManualInput("hi!");
        managementTeamMember3.disableParkingSpace();
        user.SuperManager superManager10 = user.SuperManager.getInstance();
        superManager10.enableParkingSpace();
        superManager10.enableParkingSpace();
        user.ManagementTeamMember managementTeamMember16 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember16.enableParkingSpace();
        user.SuperManager superManager18 = user.SuperManager.getInstance();
        superManager18.enableParkingSpace();
        superManager18.enableParkingSpace();
        java.lang.String str21 = superManager18.getPassword();
        superManager18.disableParkingLot();
        user.ManagementTeamMember managementTeamMember26 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember26.processManualInput("");
        java.lang.String str29 = managementTeamMember26.getPassword();
        managementTeamMember26.disableParkingLot();
        managementTeamMember26.enableParkingLot();
        boolean boolean32 = managementTeamMember26.validateEmail();
        java.lang.String str33 = managementTeamMember26.getPassword();
        superManager18.rejectUser((user.User) managementTeamMember26);
        managementTeamMember26.receiveError("Management Team");
        managementTeamMember16.approveUser((user.User) managementTeamMember26);
        superManager10.approveUser((user.User) managementTeamMember16);
        user.Faculty faculty42 = new user.Faculty("", "SuperManager", "SuperManager");
        superManager10.rejectUser((user.User) faculty42);
        superManager10.processManualInput("SuperManager");
        java.lang.String str46 = superManager10.getUsername();
        managementTeamMember3.rejectUser((user.User) superManager10);
        boolean boolean48 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "adminPass" + "'", str21, "adminPass");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "SuperManager" + "'", str46, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("Student", "Management Team", "Management Team");
        user.UserConcrete userConcrete11 = new user.UserConcrete("Student", "Management Team", "hi!", "");
        superManager0.rejectUser((user.User) userConcrete11);
        java.lang.String str13 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "hi!", "Student", "Management Team");
        boolean boolean7 = userConcrete4.login("hi!", "SuperManager");
        userConcrete4.register();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        java.lang.String str4 = managementTeamMember3.getUserType();
        java.lang.String str5 = managementTeamMember3.getUserType();
        managementTeamMember3.register();
        managementTeamMember3.processManualInput("SuperManager");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Management Team" + "'", str4, "Management Team");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Management Team" + "'", str5, "Management Team");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        boolean boolean36 = managementTeamMember25.login("SuperManager", "Management Team");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
// flaky "8) test0564(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Visitor", "Student", "Management Team", "SuperManager");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = clientUserFactory0.createUser("", "Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("Management Team", "adminPass");
        managementTeamMember3.enableParkingLot();
        boolean boolean10 = managementTeamMember3.validateEmail();
        java.lang.Class<?> wildcardClass11 = managementTeamMember3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "9) test0566(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        user.Student student3 = new user.Student("Visitor", "Faculty", "adminPass");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        user.Visitor visitor3 = new user.Visitor("", "adminPass", "adminPass");
        visitor3.register();
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        managementTeamMember3.receiveError("hi!");
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.register();
        boolean boolean25 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        boolean boolean10 = managementTeamMember3.login("hi!", "Management Team");
        managementTeamMember3.receiveError("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        user.Faculty faculty3 = new user.Faculty("Management Team", "Visitor", "");
        java.lang.String str4 = faculty3.getPassword();
        boolean boolean7 = faculty3.login("Management Team", "Faculty");
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        java.lang.String str5 = managementTeamMember3.getPassword();
        java.lang.String str6 = managementTeamMember3.getPassword();
        java.lang.String str7 = managementTeamMember3.getUserType();
        managementTeamMember3.verifyLicencePlate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Management Team" + "'", str7, "Management Team");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        java.lang.String str26 = superManager20.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "adminPass" + "'", str26, "adminPass");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "hi!");
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.disableParkingLot();
        java.lang.String str6 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean6 = managementTeamMember3.validatePassword();
        managementTeamMember3.register();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        user.Student student3 = new user.Student("hi!", "hi!", "hi!");
        java.lang.String str4 = student3.getUserType();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.validateEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "Student", "Student", "SuperManager");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        user.UserConcrete.csvPath = "Faculty";
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Student", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember7.disableParkingLot();
        boolean boolean9 = managementTeamMember7.validatePassword();
        java.lang.String str10 = managementTeamMember7.getEmail();
        managementTeamMember7.addParkingLot();
        managementTeamMember3.rejectUser((user.User) managementTeamMember7);
        boolean boolean13 = managementTeamMember7.validateEmail();
        managementTeamMember7.addParkingLot();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        user.Student student3 = new user.Student("Student", "adminPass", "Management Team");
        java.lang.String str4 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        user.Student student3 = new user.Student("", "adminPass", "Student");
        boolean boolean4 = student3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        user.Visitor visitor3 = new user.Visitor("Student", "Faculty", "hi!");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        user.UserConcrete userConcrete4 = new user.UserConcrete("hi!", "Student", "Student", "hi!");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("hi!", "Faculty", "", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("adminPass", "Faculty", "Faculty");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Student", "SuperManager", "adminPass", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = clientUserFactory0.createUser("Management Team", "Faculty", "Student", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "Management Team", "SuperManager");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Visitor", "Visitor", "SuperManager");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        user.Student student3 = new user.Student("Visitor", "Visitor", "SuperManager");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Student", "Management Team", "Faculty");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("", "hi!", "SuperManager", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        boolean boolean6 = managementTeamMember3.validateEmail();
        managementTeamMember3.receiveError("");
        java.lang.String str9 = managementTeamMember3.getPassword();
        boolean boolean10 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        boolean boolean4 = managementTeamMember3.validateEmail();
        boolean boolean7 = managementTeamMember3.login("adminPass", "Management Team");
        java.lang.String str8 = managementTeamMember3.getEmail();
        boolean boolean9 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "10) test0592(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("Visitor", "adminPass", "hi!", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.generateManagementAccount("hi!", "hi!", "adminPass");
        superManager0.generateManagementAccount("adminPass", "Student", "");
        superManager0.verifyLicencePlate();
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        user.Visitor visitor3 = new user.Visitor("Visitor", "", "Visitor");
        visitor3.register();
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        user.Faculty faculty3 = new user.Faculty("Faculty", "", "Management Team");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        user.Faculty faculty3 = new user.Faculty("Management Team", "Visitor", "");
        boolean boolean4 = faculty3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        superManager0.generateManagementAccount("Student", "hi!", "");
        boolean boolean12 = superManager0.login("SuperManager", "");
        superManager0.disableParkingLot();
        boolean boolean16 = superManager0.login("Visitor", "Visitor");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "11) test0598(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "2) test0598(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        user.Student student3 = new user.Student("Student", "hi!", "");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Visitor", "adminPass", "Visitor", "Visitor");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.receiveError("adminPass");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.enableParkingSpace();
        boolean boolean8 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        user.Faculty faculty3 = new user.Faculty("Management Team", "Visitor", "hi!");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("hi!", "adminPass", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        user.Visitor visitor3 = new user.Visitor("", "hi!", "");
        boolean boolean4 = visitor3.validateEmail();
        java.lang.String str5 = visitor3.getEmail();
        java.lang.String str6 = visitor3.getUserType();
        java.lang.String str7 = visitor3.getPassword();
        java.lang.String str8 = visitor3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Visitor" + "'", str6, "Visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        user.Visitor visitor3 = new user.Visitor("SuperManager", "SuperManager", "adminPass");
        boolean boolean4 = visitor3.validateEmail();
        java.lang.String str5 = visitor3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "adminPass" + "'", str5, "adminPass");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str6 = superManager0.getUserType();
        boolean boolean9 = superManager0.login("adminPass", "hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Management Team" + "'", str6, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("adminPass", "Visitor", "hi!", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("hi!", "Faculty", "adminPass", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        managementTeamMember8.addParkingLot();
        java.lang.String str21 = managementTeamMember8.getUserType();
        boolean boolean22 = managementTeamMember8.validateEmail();
        managementTeamMember8.register();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Management Team" + "'", str21, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.addParkingLot();
        managementTeamMember3.disableParkingSpace();
        boolean boolean7 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Faculty", "Visitor", "Faculty", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "Student", "Management Team", "SuperManager");
        user.User user20 = clientUserFactory0.createUser("Faculty", "", "", "hi!");
        user.User user25 = clientUserFactory0.createUser("Visitor", "Management Team", "SuperManager", "adminPass");
        // The following exception was thrown during execution in test generation
        try {
            user.User user30 = clientUserFactory0.createUser("SuperManager", "", "Visitor", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user25);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        user.Visitor visitor3 = new user.Visitor("", "SuperManager", "adminPass");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        user.Faculty faculty3 = new user.Faculty("", "Management Team", "Student");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        managementTeamMember8.enableParkingLot();
        managementTeamMember8.register();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        user.Visitor visitor3 = new user.Visitor("Management Team", "", "");
        java.lang.String str4 = visitor3.getUserType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Visitor" + "'", str4, "Visitor");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        user.Visitor visitor3 = new user.Visitor("", "Student", "hi!");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.enableParkingLot();
        superManager0.generateManagementAccount("Management Team", "", "Visitor");
        java.lang.String str8 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        managementTeamMember3.receiveError("adminPass");
        managementTeamMember3.enableParkingLot();
        boolean boolean11 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Faculty", "Visitor", "Faculty", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "Student", "Management Team", "SuperManager");
        user.User user20 = clientUserFactory0.createUser("Faculty", "", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            user.User user25 = clientUserFactory0.createUser("", "Visitor", "SuperManager", "Visitor");
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        user.Faculty faculty3 = new user.Faculty("", "SuperManager", "Faculty");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        user.ManagementTeamMember managementTeamMember21 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember25 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember21.approveUser((user.User) managementTeamMember25);
        java.lang.String str27 = managementTeamMember25.getEmail();
        java.lang.String str28 = managementTeamMember25.getUsername();
        managementTeamMember8.approveUser((user.User) managementTeamMember25);
        managementTeamMember8.register();
        boolean boolean31 = managementTeamMember8.validatePassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
// flaky "12) test0621(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Student", "Management Team", "hi!", "");
        userConcrete4.register();
        java.lang.String str6 = userConcrete4.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        user.User user10 = clientUserFactory0.createUser("Student", "Faculty", "hi!", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "Visitor", "Management Team", "adminPass");
        user.User user20 = clientUserFactory0.createUser("Visitor", "Visitor", "Visitor", "SuperManager");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        user.User user10 = clientUserFactory0.createUser("Student", "Faculty", "hi!", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "Visitor", "Management Team", "adminPass");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("Management Team", "Student", "Faculty", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.generateManagementAccount("", "", "");
        superManager0.generateManagementAccount("Student", "Management Team", "adminPass");
        superManager0.register();
        user.SuperManager superManager11 = user.SuperManager.getInstance();
        superManager11.enableParkingSpace();
        superManager11.enableParkingSpace();
        user.ManagementTeamMember managementTeamMember17 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember17.enableParkingSpace();
        user.SuperManager superManager19 = user.SuperManager.getInstance();
        superManager19.enableParkingSpace();
        superManager19.enableParkingSpace();
        java.lang.String str22 = superManager19.getPassword();
        superManager19.disableParkingLot();
        user.ManagementTeamMember managementTeamMember27 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember27.processManualInput("");
        java.lang.String str30 = managementTeamMember27.getPassword();
        managementTeamMember27.disableParkingLot();
        managementTeamMember27.enableParkingLot();
        boolean boolean33 = managementTeamMember27.validateEmail();
        java.lang.String str34 = managementTeamMember27.getPassword();
        superManager19.rejectUser((user.User) managementTeamMember27);
        managementTeamMember27.receiveError("Management Team");
        managementTeamMember17.approveUser((user.User) managementTeamMember27);
        superManager11.approveUser((user.User) managementTeamMember17);
        user.Faculty faculty43 = new user.Faculty("", "SuperManager", "SuperManager");
        superManager11.rejectUser((user.User) faculty43);
        superManager11.processManualInput("SuperManager");
        superManager0.approveUser((user.User) superManager11);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "adminPass" + "'", str22, "adminPass");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("Visitor", "SuperManager", "adminPass", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean4 = faculty3.validateEmail();
        boolean boolean5 = faculty3.validatePassword();
        boolean boolean8 = faculty3.login("SuperManager", "adminPass");
        java.lang.String str9 = faculty3.getEmail();
        faculty3.register();
        boolean boolean11 = faculty3.validatePassword();
        java.lang.String str12 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "13) test0627(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        managementTeamMember3.register();
        boolean boolean12 = managementTeamMember3.validateEmail();
        managementTeamMember3.addParkingLot();
        managementTeamMember3.register();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("adminPass", "Visitor", "SuperManager", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean6 = faculty3.login("hi!", "hi!");
        boolean boolean9 = faculty3.login("Management Team", "hi!");
        boolean boolean10 = faculty3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        boolean boolean5 = managementTeamMember3.validatePassword();
        managementTeamMember3.enableParkingSpace();
        boolean boolean7 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        user.Student student3 = new user.Student("SuperManager", "", "SuperManager");
        student3.register();
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Visitor", "Management Team", "Student", "Visitor");
        boolean boolean5 = userConcrete4.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        java.lang.String str5 = managementTeamMember3.getPassword();
        java.lang.String str6 = managementTeamMember3.getEmail();
        boolean boolean7 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.validateEmail();
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean8 = managementTeamMember3.validatePassword();
        user.ManagementTeamMember managementTeamMember12 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember12.processManualInput("");
        java.lang.String str15 = managementTeamMember12.getPassword();
        managementTeamMember12.disableParkingLot();
        managementTeamMember12.enableParkingLot();
        boolean boolean18 = managementTeamMember12.validateEmail();
        java.lang.String str19 = managementTeamMember12.getPassword();
        user.ManagementTeamMember managementTeamMember23 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember23.disableParkingLot();
        boolean boolean27 = managementTeamMember23.login("", "");
        managementTeamMember12.approveUser((user.User) managementTeamMember23);
        user.SuperManager superManager29 = user.SuperManager.getInstance();
        superManager29.register();
        superManager29.enableParkingSpace();
        java.lang.String str32 = superManager29.getUsername();
        boolean boolean33 = superManager29.validatePassword();
        managementTeamMember12.approveUser((user.User) superManager29);
        user.Student student38 = new user.Student("hi!", "Management Team", "");
        superManager29.rejectUser((user.User) student38);
        superManager29.generateManagementAccount("Management Team", "Visitor", "Visitor");
        managementTeamMember3.approveUser((user.User) superManager29);
        superManager29.register();
        java.lang.String str46 = superManager29.getUserType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(superManager29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "SuperManager" + "'", str32, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Management Team" + "'", str46, "Management Team");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        managementTeamMember15.addParkingLot();
        managementTeamMember15.addParkingLot();
        java.lang.String str23 = managementTeamMember15.getPassword();
        boolean boolean24 = managementTeamMember15.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        superManager0.enableParkingSpace();
        java.lang.String str7 = superManager0.getPassword();
        user.SuperManager superManager8 = user.SuperManager.getInstance();
        superManager8.register();
        superManager8.generateManagementAccount("", "", "");
        boolean boolean14 = superManager8.validatePassword();
        user.SuperManager superManager15 = user.SuperManager.getInstance();
        superManager15.enableParkingSpace();
        superManager15.enableParkingSpace();
        java.lang.String str18 = superManager15.getPassword();
        superManager15.disableParkingLot();
        user.ManagementTeamMember managementTeamMember23 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember23.processManualInput("");
        managementTeamMember23.addParkingLot();
        boolean boolean27 = managementTeamMember23.validatePassword();
        java.lang.String str28 = managementTeamMember23.getUserType();
        superManager15.rejectUser((user.User) managementTeamMember23);
        superManager15.register();
        boolean boolean31 = superManager15.validateEmail();
        superManager8.rejectUser((user.User) superManager15);
        user.SuperManager superManager33 = user.SuperManager.getInstance();
        superManager33.register();
        superManager33.enableParkingSpace();
        superManager33.generateManagementAccount("Student", "Management Team", "Management Team");
        superManager15.approveUser((user.User) superManager33);
        superManager33.addParkingLot();
        superManager0.rejectUser((user.User) superManager33);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "adminPass" + "'", str7, "adminPass");
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(superManager15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "adminPass" + "'", str18, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Management Team" + "'", str28, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(superManager33);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Student", "SuperManager", "adminPass", "");
        user.User user15 = clientUserFactory0.createUser("Faculty", "Faculty", "", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("adminPass", "hi!", "Faculty", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.verifyLicencePlate();
        superManager0.register();
        superManager0.enableParkingLot();
        superManager0.generateManagementAccount("Faculty", "SuperManager", "hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.register();
        java.lang.String str8 = managementTeamMember3.getUserType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        java.lang.String str36 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "adminPass" + "'", str36, "adminPass");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        user.Faculty faculty3 = new user.Faculty("hi!", "Student", "");
        java.lang.String str4 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("Student", "SuperManager", "Visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        boolean boolean24 = managementTeamMember3.login("hi!", "adminPass");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "14) test0644(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        java.lang.String str25 = superManager7.getUsername();
        java.lang.String str26 = superManager7.getEmail();
        user.ManagementTeamMember managementTeamMember30 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember34 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember30.approveUser((user.User) managementTeamMember34);
        user.Visitor visitor39 = new user.Visitor("hi!", "adminPass", "Student");
        managementTeamMember34.rejectUser((user.User) visitor39);
        superManager7.rejectUser((user.User) managementTeamMember34);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "adminPass" + "'", str10, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Management Team" + "'", str20, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "SuperManager" + "'", str25, "SuperManager");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        superManager0.processManualInput("Visitor");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        boolean boolean5 = managementTeamMember3.validatePassword();
        managementTeamMember3.processManualInput("Student");
        java.lang.String str8 = managementTeamMember3.getEmail();
        boolean boolean9 = managementTeamMember3.validatePassword();
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "hi!", "");
        boolean boolean6 = faculty3.login("Visitor", "Faculty");
        faculty3.register();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean4 = faculty3.validateEmail();
        boolean boolean5 = faculty3.validatePassword();
        java.lang.String str6 = faculty3.getEmail();
        boolean boolean7 = faculty3.validateEmail();
        boolean boolean8 = faculty3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        user.UserConcrete userConcrete4 = new user.UserConcrete("hi!", "adminPass", "adminPass", "Visitor");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        java.lang.String str25 = managementTeamMember13.getPassword();
        java.lang.Class<?> wildcardClass26 = managementTeamMember13.getClass();
        org.junit.Assert.assertNotNull(superManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "adminPass" + "'", str8, "adminPass");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        boolean boolean16 = managementTeamMember3.validatePassword();
        boolean boolean19 = managementTeamMember3.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        managementTeamMember18.enableParkingLot();
        managementTeamMember18.enableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        user.Visitor visitor3 = new user.Visitor("Student", "adminPass", "hi!");
        java.lang.String str4 = visitor3.getPassword();
        boolean boolean7 = visitor3.login("Management Team", "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "15) test0654(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        user.Student student3 = new user.Student("Management Team", "Faculty", "Faculty");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        java.lang.String str52 = managementTeamMember48.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Visitor", "Student", "Faculty");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("Visitor", "", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        java.lang.String str42 = managementTeamMember22.getEmail();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Management Team", "Student");
        managementTeamMember3.processManualInput("Management Team");
        java.lang.String str6 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.receiveError("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.addParkingLot();
        boolean boolean8 = managementTeamMember3.login("Management Team", "Visitor");
        java.lang.String str9 = managementTeamMember3.getEmail();
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Student", "Faculty", "Student", "SuperManager");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean4 = faculty3.validateEmail();
        boolean boolean5 = faculty3.validatePassword();
        java.lang.String str6 = faculty3.getEmail();
        boolean boolean7 = faculty3.validateEmail();
        boolean boolean10 = faculty3.login("hi!", "adminPass");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("Faculty", "", "SuperManager", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        boolean boolean9 = managementTeamMember3.login("Management Team", "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "16) test0666(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        superManager0.register();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        managementTeamMember3.register();
        boolean boolean12 = managementTeamMember3.validateEmail();
        managementTeamMember3.addParkingLot();
        managementTeamMember3.processManualInput("Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        managementTeamMember37.addParkingLot();
        boolean boolean46 = managementTeamMember37.validateEmail();
        managementTeamMember37.processManualInput("hi!");
        boolean boolean49 = managementTeamMember37.validatePassword();
        managementTeamMember37.enableParkingSpace();
        managementTeamMember37.receiveError("Visitor");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        java.lang.String str16 = managementTeamMember10.getUserType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Management Team" + "'", str16, "Management Team");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        user.User user12 = null;
        managementTeamMember3.approveUser(user12);
        managementTeamMember3.verifyLicencePlate();
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "Management Team", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("SuperManager", "adminPass", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        managementTeamMember3.processManualInput("Management Team");
        boolean boolean10 = managementTeamMember3.login("adminPass", "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "17) test0673(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Faculty", "Visitor", "Faculty", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "Student", "Management Team", "SuperManager");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("", "Visitor", "Management Team", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        java.lang.String str5 = managementTeamMember3.getPassword();
        java.lang.String str6 = managementTeamMember3.getEmail();
        boolean boolean7 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.validateEmail();
        managementTeamMember3.enableParkingSpace();
        boolean boolean12 = managementTeamMember3.login("Student", "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "18) test0675(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "Student", "adminPass", "Student");
        java.lang.String str7 = user6.getPassword();
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.receiveError("SuperManager");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        user.Student student3 = new user.Student("hi!", "Management Team", "");
        java.lang.String str4 = student3.getPassword();
        boolean boolean7 = student3.login("hi!", "Faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        user.Visitor visitor3 = new user.Visitor("adminPass", "Management Team", "Visitor");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "Management Team", "", "");
        user.User user10 = clientUserFactory0.createUser("Visitor", "SuperManager", "Management Team", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = clientUserFactory0.createUser("hi!", "Visitor", "adminPass", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Faculty", "SuperManager", "Faculty");
        managementTeamMember3.verifyLicencePlate();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        java.lang.String str11 = managementTeamMember8.getPassword();
        managementTeamMember8.disableParkingSpace();
        user.ManagementTeamMember managementTeamMember16 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember16.processManualInput("");
        java.lang.String str19 = managementTeamMember16.getPassword();
        managementTeamMember16.disableParkingLot();
        managementTeamMember16.enableParkingLot();
        boolean boolean22 = managementTeamMember16.validateEmail();
        java.lang.String str23 = managementTeamMember16.getPassword();
        user.ManagementTeamMember managementTeamMember27 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember27.disableParkingLot();
        boolean boolean31 = managementTeamMember27.login("", "");
        managementTeamMember16.approveUser((user.User) managementTeamMember27);
        managementTeamMember16.receiveError("Visitor");
        managementTeamMember16.enableParkingSpace();
        managementTeamMember8.rejectUser((user.User) managementTeamMember16);
        managementTeamMember3.rejectUser((user.User) managementTeamMember8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.receiveError("");
        java.lang.String str9 = managementTeamMember3.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getEmail();
        managementTeamMember3.enableParkingLot();
        java.lang.String str8 = managementTeamMember3.getUsername();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        java.lang.String str12 = visitor10.getPassword();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "SuperManager", "", "Faculty");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        boolean boolean18 = managementTeamMember3.login("Student", "SuperManager");
        user.ManagementTeamMember managementTeamMember22 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str23 = managementTeamMember22.getUsername();
        boolean boolean24 = managementTeamMember22.validateEmail();
        boolean boolean25 = managementTeamMember22.validatePassword();
        managementTeamMember3.rejectUser((user.User) managementTeamMember22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "19) test0686(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "adminPass", "hi!");
        java.lang.String str4 = managementTeamMember3.getPassword();
        java.lang.String str5 = managementTeamMember3.getUserType();
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Management Team" + "'", str5, "Management Team");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Student", "SuperManager", "adminPass", "");
        user.User user15 = clientUserFactory0.createUser("Student", "Management Team", "Student", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("SuperManager", "hi!", "SuperManager", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Management Team", "Visitor", "SuperManager");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember7.processManualInput("");
        java.lang.String str10 = managementTeamMember7.getPassword();
        managementTeamMember7.disableParkingLot();
        managementTeamMember7.enableParkingLot();
        boolean boolean13 = managementTeamMember7.validateEmail();
        java.lang.String str14 = managementTeamMember7.getPassword();
        managementTeamMember7.register();
        boolean boolean16 = managementTeamMember7.validateEmail();
        managementTeamMember3.rejectUser((user.User) managementTeamMember7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        superManager0.generateManagementAccount("Student", "hi!", "");
        boolean boolean12 = superManager0.login("SuperManager", "");
        java.lang.Class<?> wildcardClass13 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "20) test0690(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        superManager0.generateManagementAccount("Student", "hi!", "");
        boolean boolean12 = superManager0.login("SuperManager", "");
        superManager0.generateManagementAccount("Faculty", "Faculty", "");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "21) test0691(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        user.Student student3 = new user.Student("Management Team", "adminPass", "hi!");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "SuperManager", "Visitor");
        managementTeamMember3.register();
        managementTeamMember3.disableParkingLot();
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        superManager0.generateManagementAccount("Student", "", "Visitor");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        managementTeamMember8.processManualInput("Management Team");
        managementTeamMember8.enableParkingLot();
        managementTeamMember8.disableParkingLot();
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "hi!", "adminPass");
        boolean boolean6 = managementTeamMember3.login("Faculty", "adminPass");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        superManager0.addParkingLot();
        superManager0.generateManagementAccount("hi!", "Student", "");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        user.Student student29 = new user.Student("hi!", "Management Team", "");
        superManager20.rejectUser((user.User) student29);
        user.Faculty faculty34 = new user.Faculty("", "SuperManager", "SuperManager");
        boolean boolean35 = faculty34.validateEmail();
        superManager20.approveUser((user.User) faculty34);
        superManager20.receiveError("Student");
        boolean boolean41 = superManager20.login("Student", "Visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("Faculty", "", "Management Team", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "", "Student", "Student");
        java.lang.String str5 = userConcrete4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        user.Visitor visitor12 = new user.Visitor("hi!", "adminPass", "Student");
        managementTeamMember7.rejectUser((user.User) visitor12);
        boolean boolean16 = visitor12.login("hi!", "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        boolean boolean5 = managementTeamMember3.validatePassword();
        managementTeamMember3.processManualInput("Student");
        java.lang.String str8 = managementTeamMember3.getEmail();
        boolean boolean9 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Visitor", "Faculty", "", "");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        user.User user10 = clientUserFactory0.createUser("Student", "Faculty", "hi!", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("SuperManager", "", "Visitor", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        user.UserConcrete userConcrete4 = new user.UserConcrete("SuperManager", "Visitor", "Faculty", "Visitor");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("SuperManager", "Management Team", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        managementTeamMember3.processManualInput("Management Team");
        java.lang.String str8 = managementTeamMember3.getUsername();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Management Team", "Student", "adminPass", "");
        userConcrete4.register();
        java.lang.String str6 = userConcrete4.getUserType();
        userConcrete4.register();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        user.Visitor visitor3 = new user.Visitor("Faculty", "adminPass", "Faculty");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        user.Student student3 = new user.Student("SuperManager", "adminPass", "");
        java.lang.String str4 = student3.getPassword();
        java.lang.String str5 = student3.getPassword();
        java.lang.String str6 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SuperManager" + "'", str6, "SuperManager");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        boolean boolean21 = managementTeamMember18.validateEmail();
        managementTeamMember18.processManualInput("adminPass");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        user.Faculty faculty3 = new user.Faculty("", "Visitor", "hi!");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        managementTeamMember15.verifyLicencePlate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "22) test0714(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        user.UserConcrete userConcrete4 = new user.UserConcrete("hi!", "Management Team", "", "Student");
        boolean boolean7 = userConcrete4.login("adminPass", "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingSpace();
        user.User user8 = null;
        managementTeamMember3.approveUser(user8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        user.User user10 = clientUserFactory0.createUser("Student", "Faculty", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = clientUserFactory0.createUser("", "Student", "Student", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        boolean boolean4 = superManager0.validatePassword();
        java.lang.String str5 = superManager0.getPassword();
        superManager0.generateManagementAccount("SuperManager", "Visitor", "adminPass");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "adminPass" + "'", str5, "adminPass");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        user.Faculty faculty3 = new user.Faculty("adminPass", "Student", "hi!");
        boolean boolean4 = faculty3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        user.Student student3 = new user.Student("Visitor", "Visitor", "Student");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        boolean boolean4 = managementTeamMember3.validateEmail();
        boolean boolean7 = managementTeamMember3.login("adminPass", "Management Team");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.verifyLicencePlate();
        boolean boolean10 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "23) test0721(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("Management Team", "adminPass");
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.addParkingLot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "24) test0722(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        user.Faculty faculty3 = new user.Faculty("", "hi!", "");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        java.lang.String str13 = managementTeamMember3.getPassword();
        managementTeamMember3.verifyLicencePlate();
        user.SuperManager superManager15 = user.SuperManager.getInstance();
        superManager15.enableParkingSpace();
        superManager15.enableParkingSpace();
        java.lang.String str18 = superManager15.getPassword();
        superManager15.disableParkingLot();
        user.ManagementTeamMember managementTeamMember23 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember23.processManualInput("");
        java.lang.String str26 = managementTeamMember23.getPassword();
        managementTeamMember23.disableParkingLot();
        managementTeamMember23.enableParkingLot();
        boolean boolean29 = managementTeamMember23.validateEmail();
        java.lang.String str30 = managementTeamMember23.getPassword();
        superManager15.rejectUser((user.User) managementTeamMember23);
        managementTeamMember23.receiveError("Management Team");
        managementTeamMember23.register();
        managementTeamMember23.addParkingLot();
        managementTeamMember3.rejectUser((user.User) managementTeamMember23);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(superManager15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "adminPass" + "'", str18, "adminPass");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        user.Faculty faculty3 = new user.Faculty("hi!", "hi!", "");
        boolean boolean4 = faculty3.validateEmail();
        java.lang.String str5 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass6 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        user.Visitor visitor3 = new user.Visitor("", "", "hi!");
        java.lang.String str4 = visitor3.getEmail();
        java.lang.String str5 = visitor3.getPassword();
        visitor3.register();
        java.lang.Class<?> wildcardClass7 = visitor3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Student", "Management Team", "hi!", "");
        userConcrete4.register();
        boolean boolean6 = userConcrete4.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validatePassword();
        superManager0.verifyLicencePlate();
        superManager0.enableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.enableParkingSpace();
        user.Faculty faculty14 = new user.Faculty("hi!", "", "");
        boolean boolean15 = faculty14.validateEmail();
        boolean boolean16 = faculty14.validatePassword();
        boolean boolean19 = faculty14.login("", "Visitor");
        managementTeamMember3.approveUser((user.User) faculty14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Faculty", "Faculty", "Student", "SuperManager");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        user.User user10 = managementUserFactory0.createUser("Management Team", "SuperManager", "Student", "adminPass");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("Visitor", "Student", "adminPass", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        user.Visitor visitor3 = new user.Visitor("Student", "hi!", "Management Team");
        java.lang.String str4 = visitor3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Management Team" + "'", str4, "Management Team");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Management Team", "hi!", "");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "Student", "adminPass", "Student");
        user.User user11 = userAbstractFactory1.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user16 = userAbstractFactory1.createUser("Management Team", "", "SuperManager", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user21 = userAbstractFactory1.createUser("", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user16);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.enableParkingLot();
        superManager0.enableParkingLot();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str7 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "adminPass" + "'", str7, "adminPass");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        superManager0.generateManagementAccount("SuperManager", "hi!", "Visitor");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Visitor", "hi!", "SuperManager", "Faculty");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        managementTeamMember3.register();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        user.Faculty faculty9 = new user.Faculty("hi!", "", "");
        managementTeamMember3.approveUser((user.User) faculty9);
        boolean boolean13 = managementTeamMember3.login("", "Visitor");
        managementTeamMember3.disableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        boolean boolean15 = managementTeamMember8.login("Student", "Management Team");
        managementTeamMember8.disableParkingSpace();
        managementTeamMember8.register();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.receiveError("SuperManager");
        managementTeamMember3.processManualInput("hi!");
        managementTeamMember3.processManualInput("Visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("hi!", "Faculty", "", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Student", "SuperManager", "adminPass", "");
        user.User user15 = clientUserFactory0.createUser("Student", "Management Team", "Student", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("adminPass", "Visitor", "Student", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "Student", "");
        managementTeamMember3.processManualInput("hi!");
        managementTeamMember3.register();
        user.Student student10 = new user.Student("hi!", "", "");
        student10.register();
        managementTeamMember3.rejectUser((user.User) student10);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.enableParkingSpace();
        boolean boolean6 = managementTeamMember3.validatePassword();
        boolean boolean7 = managementTeamMember3.validateEmail();
        java.lang.String str8 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        java.lang.String str5 = managementTeamMember3.getPassword();
        java.lang.String str6 = managementTeamMember3.getEmail();
        java.lang.String str7 = managementTeamMember3.getUserType();
        java.lang.String str8 = managementTeamMember3.getEmail();
        boolean boolean11 = managementTeamMember3.login("SuperManager", "Management Team");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Management Team" + "'", str7, "Management Team");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "25) test0746(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Faculty", "Faculty", "SuperManager", "Visitor");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        user.Student student3 = new user.Student("", "", "");
        java.lang.String str4 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        user.Visitor visitor3 = new user.Visitor("SuperManager", "adminPass", "");
        boolean boolean4 = visitor3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        java.lang.String str5 = managementTeamMember3.getPassword();
        java.lang.String str6 = managementTeamMember3.getEmail();
        boolean boolean7 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.validateEmail();
        managementTeamMember3.receiveError("SuperManager");
        managementTeamMember3.register();
        managementTeamMember3.processManualInput("Visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.processManualInput("hi!");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.register();
        managementTeamMember3.disableParkingLot();
        boolean boolean12 = managementTeamMember3.validateEmail();
        boolean boolean15 = managementTeamMember3.login("hi!", "Management Team");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.processManualInput("hi!");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.register();
        managementTeamMember3.disableParkingLot();
        boolean boolean12 = managementTeamMember3.validateEmail();
        managementTeamMember3.processManualInput("Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        boolean boolean4 = managementTeamMember3.validateEmail();
        managementTeamMember3.enableParkingSpace();
        boolean boolean6 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        boolean boolean5 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        superManager0.addParkingLot();
        superManager0.receiveError("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.enableParkingLot();
        superManager0.disableParkingLot();
        superManager0.register();
        superManager0.disableParkingSpace();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        java.lang.String str18 = superManager0.getUsername();
        superManager0.receiveError("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Management Team" + "'", str15, "Management Team");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SuperManager" + "'", str18, "SuperManager");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        boolean boolean20 = managementTeamMember3.login("", "hi!");
// flaky "26) test0757(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Management Team" + "'", str9, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("Management Team", "adminPass");
        managementTeamMember3.enableParkingLot();
        boolean boolean10 = managementTeamMember3.validateEmail();
        boolean boolean11 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "27) test0758(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.register();
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        managementTeamMember3.register();
        boolean boolean21 = managementTeamMember3.validatePassword();
        java.lang.String str22 = managementTeamMember3.getPassword();
        managementTeamMember3.verifyLicencePlate();
        java.lang.String str24 = managementTeamMember3.getEmail();
        java.lang.String str25 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.enableParkingLot();
        superManager0.enableParkingLot();
        superManager0.disableParkingSpace();
        superManager0.disableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        boolean boolean9 = managementTeamMember3.validateEmail();
        user.SuperManager superManager10 = user.SuperManager.getInstance();
        superManager10.register();
        superManager10.enableParkingSpace();
        java.lang.String str13 = superManager10.getUsername();
        boolean boolean14 = superManager10.validatePassword();
        boolean boolean15 = superManager10.validateEmail();
        managementTeamMember3.rejectUser((user.User) superManager10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SuperManager" + "'", str13, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        user.Student student3 = new user.Student("SuperManager", "adminPass", "");
        java.lang.String str4 = student3.getPassword();
        java.lang.String str5 = student3.getUserType();
        java.lang.Class<?> wildcardClass6 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        java.lang.String str26 = managementTeamMember3.getPassword();
        boolean boolean27 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        java.lang.String str36 = superManager0.getUsername();
        superManager0.register();
        superManager0.addParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "SuperManager" + "'", str36, "SuperManager");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        boolean boolean3 = superManager0.validateEmail();
        user.SuperManager superManager4 = user.SuperManager.getInstance();
        superManager4.enableParkingSpace();
        superManager4.enableParkingSpace();
        boolean boolean7 = superManager4.validatePassword();
        superManager4.generateManagementAccount("adminPass", "SuperManager", "adminPass");
        boolean boolean12 = superManager4.validateEmail();
        superManager4.enableParkingLot();
        user.Faculty faculty17 = new user.Faculty("adminPass", "Management Team", "");
        java.lang.String str18 = faculty17.getEmail();
        boolean boolean21 = faculty17.login("hi!", "hi!");
        superManager4.rejectUser((user.User) faculty17);
        superManager0.rejectUser((user.User) faculty17);
        java.lang.String str24 = superManager0.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "adminPass" + "'", str18, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "SuperManager" + "'", str24, "SuperManager");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        boolean boolean27 = managementTeamMember13.login("Faculty", "Visitor");
        org.junit.Assert.assertNotNull(superManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "adminPass" + "'", str8, "adminPass");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        managementTeamMember18.register();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        java.lang.Class<?> wildcardClass15 = managementTeamMember3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        user.Student student3 = new user.Student("Faculty", "Faculty", "hi!");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        boolean boolean20 = superManager0.login("Management Team", "SuperManager");
        boolean boolean21 = superManager0.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Management Team" + "'", str15, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        user.User user10 = managementUserFactory0.createUser("Management Team", "SuperManager", "Student", "adminPass");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("Faculty", "SuperManager", "adminPass", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("Faculty", "Faculty", "adminPass", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        java.lang.String str25 = superManager0.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "adminPass" + "'", str10, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Management Team" + "'", str20, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Management Team" + "'", str25, "Management Team");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        user.Faculty faculty3 = new user.Faculty("", "SuperManager", "SuperManager");
        faculty3.register();
        boolean boolean5 = faculty3.validateEmail();
        java.lang.String str6 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        superManager0.generateManagementAccount("adminPass", "", "adminPass");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "adminPass" + "'", str21, "adminPass");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        user.Visitor visitor3 = new user.Visitor("Student", "Visitor", "");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        superManager0.enableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.verifyLicencePlate();
        superManager0.verifyLicencePlate();
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean5 = superManager0.validatePassword();
        superManager0.receiveError("Student");
        superManager0.generateManagementAccount("SuperManager", "adminPass", "adminPass");
        superManager0.register();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        user.Student student3 = new user.Student("hi!", "SuperManager", "");
        student3.register();
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        java.lang.String str6 = managementTeamMember3.getUsername();
        boolean boolean7 = managementTeamMember3.validatePassword();
        managementTeamMember3.enableParkingSpace();
        boolean boolean9 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        user.User user10 = clientUserFactory0.createUser("Student", "Faculty", "hi!", "Student");
        user.User user15 = clientUserFactory0.createUser("Visitor", "SuperManager", "SuperManager", "Faculty");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("SuperManager", "Visitor", "", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        boolean boolean19 = managementTeamMember8.validatePassword();
        managementTeamMember8.verifyLicencePlate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        java.lang.String str23 = managementTeamMember3.getUserType();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Management Team" + "'", str23, "Management Team");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        superManager0.generateManagementAccount("adminPass", "Management Team", "adminPass");
        boolean boolean7 = superManager0.validatePassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.register();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        user.User user10 = clientUserFactory0.createUser("Student", "Faculty", "hi!", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "hi!", "hi!", "Student");
        user.User user20 = clientUserFactory0.createUser("Student", "", "Management Team", "adminPass");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "Management Team", "Student");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.enableParkingSpace();
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        user.Faculty faculty3 = new user.Faculty("hi!", "SuperManager", "hi!");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        java.lang.String str5 = managementTeamMember3.getPassword();
        java.lang.String str6 = managementTeamMember3.getEmail();
        java.lang.String str7 = managementTeamMember3.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        user.Faculty faculty3 = new user.Faculty("Visitor", "SuperManager", "Student");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        boolean boolean30 = superManager20.login("Visitor", "");
        superManager20.enableParkingSpace();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "", "adminPass");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.register();
        managementTeamMember3.enableParkingSpace();
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.addParkingLot();
        boolean boolean8 = managementTeamMember3.login("Student", "adminPass");
        managementTeamMember3.register();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Management Team", "Faculty", "Faculty");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.verifyLicencePlate();
        superManager0.generateManagementAccount("Visitor", "SuperManager", "Faculty");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        boolean boolean35 = managementTeamMember3.login("SuperManager", "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Faculty", "SuperManager", "Faculty");
        managementTeamMember3.verifyLicencePlate();
        java.lang.String str5 = managementTeamMember3.getPassword();
        managementTeamMember3.register();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        user.Visitor visitor3 = new user.Visitor("Student", "adminPass", "hi!");
        java.lang.String str4 = visitor3.getPassword();
        java.lang.String str5 = visitor3.getUserType();
        java.lang.String str6 = visitor3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor" + "'", str5, "Visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        user.Student student3 = new user.Student("hi!", "", "");
        boolean boolean4 = student3.validateEmail();
        boolean boolean7 = student3.login("Faculty", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.enableParkingLot();
        java.lang.Class<?> wildcardClass8 = managementTeamMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        user.Student student48 = new user.Student("Management Team", "Visitor", "adminPass");
        managementTeamMember37.rejectUser((user.User) student48);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        boolean boolean2 = superManager0.validatePassword();
        superManager0.generateManagementAccount("hi!", "Management Team", "");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        java.lang.String str17 = superManager0.getUserType();
        boolean boolean18 = superManager0.validatePassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Management Team" + "'", str17, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("hi!", "SuperManager", "Student", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "Management Team", "", "");
        user.User user10 = clientUserFactory0.createUser("Visitor", "Student", "hi!", "adminPass");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = clientUserFactory0.createUser("adminPass", "hi!", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        managementTeamMember3.disableParkingSpace();
        user.ManagementTeamMember managementTeamMember13 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember13.processManualInput("");
        java.lang.String str16 = managementTeamMember13.getPassword();
        managementTeamMember13.disableParkingLot();
        managementTeamMember13.enableParkingLot();
        java.lang.String str19 = managementTeamMember13.getPassword();
        managementTeamMember3.approveUser((user.User) managementTeamMember13);
        managementTeamMember3.processManualInput("");
        boolean boolean25 = managementTeamMember3.login("adminPass", "Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        superManager0.generateManagementAccount("Student", "hi!", "");
        superManager0.addParkingLot();
        java.lang.String str11 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.processManualInput("Student");
        managementTeamMember3.register();
        java.lang.String str11 = managementTeamMember3.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        user.ManagementTeamMember managementTeamMember37 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember37.disableParkingLot();
        boolean boolean41 = managementTeamMember37.login("", "");
        superManager25.rejectUser((user.User) managementTeamMember37);
        managementTeamMember37.processManualInput("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "adminPass" + "'", str10, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Management Team" + "'", str20, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "Student", "adminPass", "Student");
        user.User user11 = userAbstractFactory1.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user16 = userAbstractFactory1.createUser("Management Team", "", "SuperManager", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user21 = userAbstractFactory1.createUser("", "adminPass", "adminPass", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user16);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        java.lang.String str5 = managementTeamMember3.getPassword();
        java.lang.String str6 = managementTeamMember3.getEmail();
        boolean boolean7 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.validateEmail();
        managementTeamMember3.receiveError("SuperManager");
        managementTeamMember3.verifyLicencePlate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        boolean boolean2 = superManager0.validatePassword();
        superManager0.processManualInput("adminPass");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean10 = managementTeamMember3.login("Student", "");
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        boolean boolean4 = managementTeamMember3.validateEmail();
        boolean boolean7 = managementTeamMember3.login("adminPass", "Management Team");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.addParkingLot();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "28) test0815(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "SuperManager", "", "adminPass");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("", "", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        user.Visitor visitor3 = new user.Visitor("hi!", "hi!", "hi!");
        boolean boolean6 = visitor3.login("Management Team", "SuperManager");
        boolean boolean7 = visitor3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("adminPass", "adminPass", "adminPass");
        boolean boolean4 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.receiveError("");
        user.ManagementTeamMember managementTeamMember12 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember12.processManualInput("");
        managementTeamMember12.enableParkingLot();
        user.Visitor visitor19 = new user.Visitor("", "hi!", "");
        managementTeamMember12.approveUser((user.User) visitor19);
        boolean boolean21 = managementTeamMember12.validateEmail();
        boolean boolean22 = managementTeamMember12.validatePassword();
        user.ManagementTeamMember managementTeamMember26 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember26.disableParkingLot();
        user.ManagementTeamMember managementTeamMember31 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember31.processManualInput("");
        managementTeamMember31.addParkingLot();
        managementTeamMember26.approveUser((user.User) managementTeamMember31);
        managementTeamMember31.processManualInput("Management Team");
        user.ManagementTeamMember managementTeamMember41 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str42 = managementTeamMember41.getUsername();
        managementTeamMember41.receiveError("");
        managementTeamMember41.receiveError("SuperManager");
        managementTeamMember31.rejectUser((user.User) managementTeamMember41);
        managementTeamMember31.processManualInput("Faculty");
        managementTeamMember12.rejectUser((user.User) managementTeamMember31);
        managementTeamMember3.rejectUser((user.User) managementTeamMember12);
        boolean boolean52 = managementTeamMember12.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        user.Student student3 = new user.Student("hi!", "hi!", "hi!");
        boolean boolean6 = student3.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        user.User user10 = clientUserFactory0.createUser("Student", "Faculty", "hi!", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("Management Team", "Visitor", "SuperManager", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        user.Visitor visitor3 = new user.Visitor("hi!", "Management Team", "Management Team");
        java.lang.String str4 = visitor3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.generateManagementAccount("adminPass", "SuperManager", "adminPass");
        boolean boolean8 = superManager0.validateEmail();
        boolean boolean11 = superManager0.login("", "Management Team");
        superManager0.verifyLicencePlate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "29) test0823(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        user.Visitor visitor16 = new user.Visitor("hi!", "hi!", "hi!");
        java.lang.String str17 = visitor16.getUsername();
        managementTeamMember3.rejectUser((user.User) visitor16);
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.addParkingLot();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Faculty", "Faculty", "");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean10 = managementTeamMember3.login("Student", "");
        java.lang.String str11 = managementTeamMember3.getEmail();
        managementTeamMember3.processManualInput("Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "hi!", "Management Team", "");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        user.Visitor visitor3 = new user.Visitor("", "", "hi!");
        boolean boolean6 = visitor3.login("Visitor", "Management Team");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        boolean boolean9 = managementTeamMember3.validateEmail();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.processManualInput("");
        boolean boolean13 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Visitor", "Management Team", "Student", "SuperManager");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        user.Visitor visitor3 = new user.Visitor("", "hi!", "");
        boolean boolean4 = visitor3.validateEmail();
        java.lang.String str5 = visitor3.getEmail();
        boolean boolean6 = visitor3.validateEmail();
        java.lang.String str7 = visitor3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "SuperManager", "hi!");
        managementTeamMember3.addParkingLot();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("adminPass", "Management Team");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "30) test0832(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Student", "adminPass");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.addParkingLot();
        managementTeamMember3.processManualInput("Faculty");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Faculty", "Visitor", "Faculty", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "Student", "Management Team", "SuperManager");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("", "Visitor", "Visitor", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "SuperManager", "", "adminPass");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("Student", "adminPass", "Visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean4 = faculty3.validateEmail();
        boolean boolean5 = faculty3.validatePassword();
        boolean boolean8 = faculty3.login("SuperManager", "adminPass");
        java.lang.String str9 = faculty3.getEmail();
        faculty3.register();
        java.lang.String str11 = faculty3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "SuperManager", "Management Team");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        java.lang.String str13 = faculty11.getUserType();
        boolean boolean16 = faculty11.login("Management Team", "Visitor");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        managementTeamMember37.register();
        managementTeamMember37.processManualInput("hi!");
        managementTeamMember37.verifyLicencePlate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        user.Student student3 = new user.Student("SuperManager", "adminPass", "");
        student3.register();
        student3.register();
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Management Team", "Student", "Faculty");
        managementTeamMember3.addParkingLot();
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        user.Student student3 = new user.Student("SuperManager", "adminPass", "");
        student3.register();
        java.lang.String str5 = student3.getUserType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Faculty", "Visitor", "Faculty", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "Faculty", "", "Visitor");
        user.User user20 = clientUserFactory0.createUser("Faculty", "Management Team", "adminPass", "Student");
        java.lang.String str21 = user20.getEmail();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Management Team" + "'", str21, "Management Team");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Student", "", "Student", "Visitor");
        userConcrete4.register();
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        boolean boolean19 = superManager0.validatePassword();
        superManager0.generateManagementAccount("Student", "SuperManager", "Student");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "adminPass" + "'", str14, "adminPass");
// flaky "31) test0845(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.verifyLicencePlate();
        superManager0.verifyLicencePlate();
        superManager0.generateManagementAccount("SuperManager", "adminPass", "hi!");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        user.User user10 = clientUserFactory0.createUser("Student", "Faculty", "hi!", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("adminPass", "Faculty", "adminPass", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        managementTeamMember13.disableParkingLot();
        java.lang.String str21 = managementTeamMember13.getPassword();
// flaky "32) test0848(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Management Team" + "'", str9, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Faculty", "adminPass", "adminPass");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        managementTeamMember10.disableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        managementTeamMember3.verifyLicencePlate();
        boolean boolean24 = managementTeamMember3.login("SuperManager", "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "33) test0852(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Management Team", "SuperManager", "");
        managementTeamMember3.register();
        java.lang.String str5 = managementTeamMember3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Management Team" + "'", str5, "Management Team");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Faculty", "Visitor", "Faculty", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "Student", "Management Team", "SuperManager");
        user.User user20 = clientUserFactory0.createUser("Faculty", "", "", "hi!");
        user.User user25 = clientUserFactory0.createUser("Visitor", "Management Team", "SuperManager", "adminPass");
        // The following exception was thrown during execution in test generation
        try {
            user.User user30 = clientUserFactory0.createUser("", "hi!", "adminPass", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user25);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("Faculty", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("Faculty", "Visitor", "Visitor", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        user.Faculty faculty3 = new user.Faculty("adminPass", "Visitor", "hi!");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "SuperManager", "hi!");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.login("Faculty", "");
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.enableParkingLot();
        superManager0.enableParkingLot();
        boolean boolean7 = superManager0.login("", "SuperManager");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "34) test0859(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        boolean boolean17 = superManager0.validatePassword();
        boolean boolean18 = superManager0.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        user.Student student3 = new user.Student("SuperManager", "adminPass", "");
        student3.register();
        java.lang.String str5 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SuperManager" + "'", str5, "SuperManager");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        java.lang.String str5 = managementTeamMember3.getEmail();
        boolean boolean8 = managementTeamMember3.login("Student", "Student");
        user.ManagementTeamMember managementTeamMember12 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember12.processManualInput("");
        managementTeamMember12.addParkingLot();
        boolean boolean16 = managementTeamMember12.validatePassword();
        java.lang.String str17 = managementTeamMember12.getUserType();
        boolean boolean18 = managementTeamMember12.validateEmail();
        boolean boolean19 = managementTeamMember12.validatePassword();
        managementTeamMember3.rejectUser((user.User) managementTeamMember12);
        java.lang.String str21 = managementTeamMember12.getUserType();
        boolean boolean22 = managementTeamMember12.validatePassword();
        boolean boolean23 = managementTeamMember12.validatePassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Management Team" + "'", str17, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Management Team" + "'", str21, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Management Team", "Student", "adminPass", "");
        userConcrete4.register();
        java.lang.String str6 = userConcrete4.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "adminPass" + "'", str6, "adminPass");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("Management Team", "adminPass");
        managementTeamMember3.register();
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "35) test0864(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        superManager0.generateManagementAccount("", "hi!", "Student");
        java.lang.String str10 = superManager0.getUsername();
        boolean boolean11 = superManager0.validatePassword();
        superManager0.addParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SuperManager" + "'", str10, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Student", "Management Team", "Faculty");
        java.lang.Class<?> wildcardClass6 = clientUserFactory0.getClass();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        boolean boolean5 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        superManager0.generateManagementAccount("Visitor", "hi!", "hi!");
        superManager0.disableParkingLot();
        superManager0.generateManagementAccount("adminPass", "adminPass", "Visitor");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        java.lang.Class<?> wildcardClass26 = managementTeamMember3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "36) test0868(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        java.lang.String str9 = managementTeamMember7.getEmail();
        java.lang.String str10 = managementTeamMember7.getUsername();
        java.lang.String str11 = managementTeamMember7.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        user.Visitor visitor12 = new user.Visitor("hi!", "adminPass", "Student");
        managementTeamMember7.rejectUser((user.User) visitor12);
        java.lang.String str14 = managementTeamMember7.getEmail();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "hi!");
        managementTeamMember3.disableParkingSpace();
        boolean boolean5 = managementTeamMember3.validatePassword();
        managementTeamMember3.addParkingLot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Student", "Management Team", "Faculty");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("adminPass", "Faculty", "SuperManager", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "Management Team", "Student");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        java.lang.String str5 = managementTeamMember3.getEmail();
        boolean boolean8 = managementTeamMember3.login("Student", "Student");
        user.ManagementTeamMember managementTeamMember12 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember12.processManualInput("");
        managementTeamMember12.addParkingLot();
        boolean boolean16 = managementTeamMember12.validatePassword();
        java.lang.String str17 = managementTeamMember12.getUserType();
        boolean boolean18 = managementTeamMember12.validateEmail();
        boolean boolean19 = managementTeamMember12.validatePassword();
        managementTeamMember3.rejectUser((user.User) managementTeamMember12);
        java.lang.String str21 = managementTeamMember12.getUserType();
        boolean boolean24 = managementTeamMember12.login("SuperManager", "SuperManager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Management Team" + "'", str17, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Management Team" + "'", str21, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "hi!");
        boolean boolean6 = managementTeamMember3.login("SuperManager", "hi!");
        managementTeamMember3.register();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.enableParkingLot();
        superManager0.enableParkingLot();
        superManager0.enableParkingSpace();
        boolean boolean6 = superManager0.validateEmail();
        boolean boolean7 = superManager0.validatePassword();
        boolean boolean8 = superManager0.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        user.Student student3 = new user.Student("Faculty", "Management Team", "Student");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        user.Faculty faculty3 = new user.Faculty("adminPass", "", "");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "", "adminPass");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        java.lang.String str11 = managementTeamMember8.getPassword();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        managementTeamMember3.register();
        managementTeamMember3.verifyLicencePlate();
        java.lang.String str15 = managementTeamMember3.getEmail();
        java.lang.String str16 = managementTeamMember3.getEmail();
        managementTeamMember3.enableParkingSpace();
        boolean boolean20 = managementTeamMember3.login("adminPass", "Visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        superManager0.generateManagementAccount("Student", "hi!", "");
        superManager0.addParkingLot();
        superManager0.enableParkingLot();
        superManager0.generateManagementAccount("Student", "Faculty", "hi!");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        user.Student student3 = new user.Student("Visitor", "hi!", "Faculty");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        user.User user10 = clientUserFactory0.createUser("Student", "Faculty", "hi!", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "Visitor", "Management Team", "adminPass");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("hi!", "Visitor", "Management Team", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.addParkingLot();
        boolean boolean8 = managementTeamMember3.login("Student", "adminPass");
        boolean boolean11 = managementTeamMember3.login("hi!", "Management Team");
        boolean boolean14 = managementTeamMember3.login("adminPass", "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "37) test0884(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        java.lang.String str13 = managementTeamMember3.getPassword();
        managementTeamMember3.receiveError("hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        user.Student student3 = new user.Student("Visitor", "hi!", "");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "Management Team", "Management Team", "SuperManager");
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "Student", "adminPass", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user11 = userAbstractFactory1.createUser("Faculty", "Management Team", "Visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "adminPass", "Student");
        managementTeamMember3.addParkingLot();
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        user.UserConcrete userConcrete4 = new user.UserConcrete("hi!", "Student", "Management Team", "Management Team");
        java.lang.String str5 = userConcrete4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        user.ManagementTeamMember managementTeamMember9 = new user.ManagementTeamMember("SuperManager", "SuperManager", "hi!");
        managementTeamMember3.approveUser((user.User) managementTeamMember9);
        managementTeamMember9.disableParkingLot();
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.processManualInput("Student");
        boolean boolean10 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        user.Visitor visitor3 = new user.Visitor("", "Visitor", "");
        java.lang.String str4 = visitor3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        managementTeamMember3.receiveError("adminPass");
        managementTeamMember3.disableParkingSpace();
        java.lang.String str11 = managementTeamMember3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "", "Faculty");
        managementTeamMember3.processManualInput("SuperManager");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        user.Visitor visitor3 = new user.Visitor("", "", "Student");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        java.lang.String str11 = managementTeamMember8.getPassword();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        managementTeamMember8.addParkingLot();
        java.lang.String str14 = managementTeamMember8.getPassword();
        boolean boolean15 = managementTeamMember8.validateEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        superManager0.register();
        boolean boolean16 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Faculty", "hi!");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "Management Team", "adminPass");
        managementTeamMember3.register();
        java.lang.String str5 = managementTeamMember3.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Management Team" + "'", str5, "Management Team");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        user.Visitor visitor3 = new user.Visitor("hi!", "adminPass", "Student");
        boolean boolean4 = visitor3.validateEmail();
        java.lang.String str5 = visitor3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor" + "'", str5, "Visitor");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("", "hi!", "", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        managementTeamMember25.enableParkingLot();
        managementTeamMember25.register();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        managementTeamMember11.enableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SuperManager" + "'", str14, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        java.lang.String str38 = student36.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "adminPass" + "'", str10, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Management Team" + "'", str20, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Student" + "'", str38, "Student");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        user.Faculty faculty3 = new user.Faculty("adminPass", "", "Faculty");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        user.Student student3 = new user.Student("Student", "", "");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        boolean boolean13 = managementTeamMember3.validatePassword();
        boolean boolean14 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        boolean boolean18 = managementTeamMember3.login("Student", "SuperManager");
        managementTeamMember3.addParkingLot();
        java.lang.String str20 = managementTeamMember3.getEmail();
        managementTeamMember3.addParkingLot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "38) test0909(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "Student", "Visitor");
        managementTeamMember3.addParkingLot();
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        java.lang.String str6 = superManager0.getUsername();
        boolean boolean7 = superManager0.validatePassword();
        superManager0.generateManagementAccount("adminPass", "hi!", "hi!");
        superManager0.generateManagementAccount("hi!", "", "Faculty");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SuperManager" + "'", str6, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        java.lang.String str5 = managementTeamMember3.getEmail();
        boolean boolean8 = managementTeamMember3.login("Student", "Student");
        user.ManagementTeamMember managementTeamMember12 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember12.processManualInput("");
        managementTeamMember12.addParkingLot();
        boolean boolean16 = managementTeamMember12.validatePassword();
        java.lang.String str17 = managementTeamMember12.getUserType();
        boolean boolean18 = managementTeamMember12.validateEmail();
        boolean boolean19 = managementTeamMember12.validatePassword();
        managementTeamMember3.rejectUser((user.User) managementTeamMember12);
        java.lang.String str21 = managementTeamMember12.getUserType();
        boolean boolean22 = managementTeamMember12.validatePassword();
        boolean boolean23 = managementTeamMember12.validateEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Management Team" + "'", str17, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Management Team" + "'", str21, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        user.Visitor visitor3 = new user.Visitor("hi!", "adminPass", "Faculty");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        user.Student student3 = new user.Student("hi!", "", "");
        java.lang.String str4 = student3.getUserType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        boolean boolean13 = superManager0.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "Student", "");
        boolean boolean6 = faculty3.login("adminPass", "adminPass");
        boolean boolean9 = faculty3.login("Visitor", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        superManager0.addParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Faculty", "adminPass", "Management Team");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        user.Visitor visitor3 = new user.Visitor("", "Student", "Visitor");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        superManager0.generateManagementAccount("", "hi!", "Student");
        java.lang.String str10 = superManager0.getUsername();
        superManager0.receiveError("Faculty");
        superManager0.disableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SuperManager" + "'", str10, "SuperManager");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("Student", "Management Team", "Management Team");
        user.UserConcrete userConcrete11 = new user.UserConcrete("Student", "Management Team", "hi!", "");
        superManager0.rejectUser((user.User) userConcrete11);
        java.lang.String str13 = userConcrete11.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        boolean boolean15 = managementTeamMember3.validatePassword();
        java.lang.String str16 = managementTeamMember3.getUsername();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        user.Student student3 = new user.Student("Visitor", "", "SuperManager");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        user.Visitor visitor16 = new user.Visitor("hi!", "hi!", "hi!");
        java.lang.String str17 = visitor16.getUsername();
        managementTeamMember3.rejectUser((user.User) visitor16);
        managementTeamMember3.register();
        managementTeamMember3.receiveError("Visitor");
        boolean boolean22 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        user.Visitor visitor3 = new user.Visitor("Student", "Faculty", "Faculty");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.receiveError("hi!");
        boolean boolean6 = superManager0.validateEmail();
        superManager0.disableParkingSpace();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        boolean boolean25 = managementTeamMember13.validateEmail();
        user.ManagementTeamMember managementTeamMember29 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str30 = managementTeamMember29.getUsername();
        java.lang.String str31 = managementTeamMember29.getPassword();
        java.lang.String str32 = managementTeamMember29.getEmail();
        boolean boolean33 = managementTeamMember29.validateEmail();
        boolean boolean34 = managementTeamMember29.validateEmail();
        managementTeamMember29.enableParkingSpace();
        managementTeamMember13.approveUser((user.User) managementTeamMember29);
        org.junit.Assert.assertNotNull(superManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "adminPass" + "'", str8, "adminPass");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "Student", "");
        managementTeamMember3.processManualInput("hi!");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.enableParkingSpace();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean6 = managementTeamMember3.validatePassword();
        boolean boolean7 = managementTeamMember3.validatePassword();
        managementTeamMember3.register();
        managementTeamMember3.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Student", "Management Team", "Faculty");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("Management Team", "SuperManager", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "SuperManager", "Faculty");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("Management Team", "adminPass");
        java.lang.String str9 = managementTeamMember3.getPassword();
        managementTeamMember3.verifyLicencePlate();
        boolean boolean11 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "39) test0932(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingSpace();
        java.lang.String str8 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        user.Student student3 = new user.Student("adminPass", "Visitor", "SuperManager");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "", "adminPass");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "", "Faculty");
        java.lang.String str4 = managementTeamMember3.getUserType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Management Team" + "'", str4, "Management Team");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        user.Visitor visitor3 = new user.Visitor("Management Team", "adminPass", "adminPass");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        boolean boolean12 = visitor10.validateEmail();
        java.lang.Class<?> wildcardClass13 = visitor10.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        user.ManagementTeamMember managementTeamMember9 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember9.receiveError("adminPass");
        managementTeamMember9.verifyLicencePlate();
        superManager0.approveUser((user.User) managementTeamMember9);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Student", "SuperManager", "", "hi!");
        user.User user15 = clientUserFactory0.createUser("Faculty", "adminPass", "Student", "Faculty");
        user.User user20 = clientUserFactory0.createUser("Student", "Faculty", "Faculty", "SuperManager");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Faculty", "SuperManager", "hi!");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        superManager0.generateManagementAccount("", "hi!", "Student");
        boolean boolean10 = superManager0.validatePassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        user.ManagementTeamMember managementTeamMember9 = new user.ManagementTeamMember("SuperManager", "SuperManager", "hi!");
        managementTeamMember3.approveUser((user.User) managementTeamMember9);
        managementTeamMember3.processManualInput("Faculty");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        boolean boolean29 = superManager0.validatePassword();
        superManager0.generateManagementAccount("SuperManager", "Student", "hi!");
        superManager0.generateManagementAccount("", "adminPass", "adminPass");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        managementTeamMember10.verifyLicencePlate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        user.Visitor visitor3 = new user.Visitor("hi!", "hi!", "hi!");
        boolean boolean6 = visitor3.login("Management Team", "SuperManager");
        java.lang.String str7 = visitor3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Visitor", "SuperManager", "Student", "Visitor");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "Student", "");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SuperManager" + "'", str4, "SuperManager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        boolean boolean31 = managementTeamMember6.login("adminPass", "Student");
        user.ManagementTeamMember managementTeamMember35 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember35.disableParkingLot();
        boolean boolean37 = managementTeamMember35.validatePassword();
        java.lang.String str38 = managementTeamMember35.getUsername();
        user.ManagementTeamMember managementTeamMember42 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember42.disableParkingLot();
        boolean boolean46 = managementTeamMember42.login("", "");
        managementTeamMember35.approveUser((user.User) managementTeamMember42);
        managementTeamMember42.verifyLicencePlate();
        java.lang.String str49 = managementTeamMember42.getPassword();
        managementTeamMember6.approveUser((user.User) managementTeamMember42);
        boolean boolean53 = managementTeamMember42.login("Faculty", "Management Team");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
// flaky "40) test0949(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean10 = managementTeamMember3.login("Student", "");
        managementTeamMember3.receiveError("Student");
        managementTeamMember3.register();
        java.lang.String str14 = managementTeamMember3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        boolean boolean29 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        superManager0.generateManagementAccount("", "hi!", "Student");
        java.lang.String str10 = superManager0.getUsername();
        boolean boolean11 = superManager0.validatePassword();
        superManager0.disableParkingSpace();
        boolean boolean15 = superManager0.login("Management Team", "");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SuperManager" + "'", str10, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        user.Student student3 = new user.Student("Student", "Visitor", "adminPass");
        java.lang.String str4 = student3.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Visitor" + "'", str4, "Visitor");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("Student", "Management Team", "Management Team");
        user.UserConcrete userConcrete11 = new user.UserConcrete("Student", "Management Team", "hi!", "");
        superManager0.rejectUser((user.User) userConcrete11);
        boolean boolean13 = superManager0.validateEmail();
        superManager0.processManualInput("adminPass");
        superManager0.disableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Management Team", "Student", "Management Team");
        user.SuperManager superManager4 = user.SuperManager.getInstance();
        superManager4.enableParkingSpace();
        superManager4.enableParkingSpace();
        java.lang.String str7 = superManager4.getPassword();
        superManager4.disableParkingLot();
        user.ManagementTeamMember managementTeamMember12 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember12.processManualInput("");
        java.lang.String str15 = managementTeamMember12.getPassword();
        managementTeamMember12.disableParkingLot();
        managementTeamMember12.enableParkingLot();
        boolean boolean18 = managementTeamMember12.validateEmail();
        java.lang.String str19 = managementTeamMember12.getPassword();
        superManager4.rejectUser((user.User) managementTeamMember12);
        managementTeamMember12.receiveError("Management Team");
        boolean boolean23 = managementTeamMember12.validatePassword();
        managementTeamMember3.rejectUser((user.User) managementTeamMember12);
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "adminPass" + "'", str7, "adminPass");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "Faculty");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getEmail();
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.register();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("adminPass", "hi!", "");
        superManager0.generateManagementAccount("Management Team", "Student", "Student");
        superManager0.register();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        boolean boolean4 = managementTeamMember3.validateEmail();
        boolean boolean7 = managementTeamMember3.login("adminPass", "Management Team");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.verifyLicencePlate();
        user.ManagementTeamMember managementTeamMember13 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember13.disableParkingLot();
        user.Visitor visitor18 = new user.Visitor("", "hi!", "");
        boolean boolean21 = visitor18.login("SuperManager", "hi!");
        managementTeamMember13.rejectUser((user.User) visitor18);
        java.lang.String str23 = managementTeamMember13.getPassword();
        user.SuperManager superManager24 = user.SuperManager.getInstance();
        superManager24.enableParkingSpace();
        superManager24.verifyLicencePlate();
        superManager24.verifyLicencePlate();
        superManager24.addParkingLot();
        managementTeamMember13.rejectUser((user.User) superManager24);
        managementTeamMember3.rejectUser((user.User) superManager24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "41) test0959(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(superManager24);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean8 = managementTeamMember3.validatePassword();
        user.ManagementTeamMember managementTeamMember12 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember12.processManualInput("");
        java.lang.String str15 = managementTeamMember12.getPassword();
        managementTeamMember12.disableParkingLot();
        managementTeamMember12.enableParkingLot();
        boolean boolean18 = managementTeamMember12.validateEmail();
        java.lang.String str19 = managementTeamMember12.getPassword();
        user.ManagementTeamMember managementTeamMember23 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember23.disableParkingLot();
        boolean boolean27 = managementTeamMember23.login("", "");
        managementTeamMember12.approveUser((user.User) managementTeamMember23);
        user.SuperManager superManager29 = user.SuperManager.getInstance();
        superManager29.register();
        superManager29.enableParkingSpace();
        java.lang.String str32 = superManager29.getUsername();
        boolean boolean33 = superManager29.validatePassword();
        managementTeamMember12.approveUser((user.User) superManager29);
        user.Student student38 = new user.Student("hi!", "Management Team", "");
        superManager29.rejectUser((user.User) student38);
        superManager29.generateManagementAccount("Management Team", "Visitor", "Visitor");
        managementTeamMember3.approveUser((user.User) superManager29);
        superManager29.register();
        superManager29.processManualInput("Management Team");
        superManager29.enableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(superManager29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "SuperManager" + "'", str32, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        user.Student student3 = new user.Student("adminPass", "Student", "Faculty");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        managementTeamMember18.disableParkingLot();
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        boolean boolean1 = superManager0.validateEmail();
        user.SuperManager superManager2 = user.SuperManager.getInstance();
        superManager2.enableParkingSpace();
        superManager2.generateManagementAccount("hi!", "hi!", "");
        superManager2.generateManagementAccount("Student", "hi!", "");
        superManager2.addParkingLot();
        superManager2.enableParkingLot();
        superManager0.rejectUser((user.User) superManager2);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(superManager2);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Faculty", "", "Student", "adminPass");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getEmail();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingSpace();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.receiveError("hi!");
        boolean boolean6 = superManager0.validatePassword();
        superManager0.disableParkingSpace();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Visitor", "Management Team", "Student");
        boolean boolean6 = managementTeamMember3.login("adminPass", "Student");
        java.lang.String str7 = managementTeamMember3.getEmail();
// flaky "42) test0967(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Visitor" + "'", str7, "Visitor");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        user.Student student29 = new user.Student("hi!", "Management Team", "");
        superManager20.rejectUser((user.User) student29);
        superManager20.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("Student", "adminPass", "adminPass", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "hi!", "");
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.receiveError("SuperManager");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        user.ManagementTeamMember managementTeamMember19 = new user.ManagementTeamMember("", "hi!", "");
        boolean boolean20 = managementTeamMember19.validateEmail();
        managementTeamMember19.enableParkingSpace();
        superManager0.approveUser((user.User) managementTeamMember19);
        managementTeamMember19.verifyLicencePlate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Management Team" + "'", str15, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        user.Student student3 = new user.Student("Visitor", "adminPass", "");
        boolean boolean4 = student3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "hi!", "adminPass", "Management Team");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        superManager0.register();
        superManager0.register();
        superManager0.generateManagementAccount("SuperManager", "hi!", "adminPass");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("Management Team", "hi!", "Faculty", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean8 = managementTeamMember3.validatePassword();
        user.ManagementTeamMember managementTeamMember12 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember12.processManualInput("");
        java.lang.String str15 = managementTeamMember12.getPassword();
        managementTeamMember12.disableParkingLot();
        managementTeamMember12.enableParkingLot();
        boolean boolean18 = managementTeamMember12.validateEmail();
        java.lang.String str19 = managementTeamMember12.getPassword();
        user.ManagementTeamMember managementTeamMember23 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember23.disableParkingLot();
        boolean boolean27 = managementTeamMember23.login("", "");
        managementTeamMember12.approveUser((user.User) managementTeamMember23);
        user.SuperManager superManager29 = user.SuperManager.getInstance();
        superManager29.register();
        superManager29.enableParkingSpace();
        java.lang.String str32 = superManager29.getUsername();
        boolean boolean33 = superManager29.validatePassword();
        managementTeamMember12.approveUser((user.User) superManager29);
        user.Student student38 = new user.Student("hi!", "Management Team", "");
        superManager29.rejectUser((user.User) student38);
        superManager29.generateManagementAccount("Management Team", "Visitor", "Visitor");
        managementTeamMember3.approveUser((user.User) superManager29);
        managementTeamMember3.disableParkingSpace();
        user.Student student49 = new user.Student("Student", "Visitor", "adminPass");
        boolean boolean50 = student49.validateEmail();
        managementTeamMember3.approveUser((user.User) student49);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(superManager29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "SuperManager" + "'", str32, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.processManualInput("hi!");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.register();
        managementTeamMember3.disableParkingLot();
        boolean boolean12 = managementTeamMember3.validateEmail();
        boolean boolean15 = managementTeamMember3.login("Visitor", "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        user.Faculty faculty3 = new user.Faculty("Faculty", "hi!", "SuperManager");
        java.lang.String str4 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        boolean boolean3 = superManager0.validateEmail();
        user.SuperManager superManager4 = user.SuperManager.getInstance();
        superManager4.enableParkingSpace();
        superManager4.enableParkingSpace();
        boolean boolean7 = superManager4.validatePassword();
        superManager4.generateManagementAccount("adminPass", "SuperManager", "adminPass");
        boolean boolean12 = superManager4.validateEmail();
        superManager4.enableParkingLot();
        user.Faculty faculty17 = new user.Faculty("adminPass", "Management Team", "");
        java.lang.String str18 = faculty17.getEmail();
        boolean boolean21 = faculty17.login("hi!", "hi!");
        superManager4.rejectUser((user.User) faculty17);
        superManager0.rejectUser((user.User) faculty17);
        boolean boolean24 = faculty17.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "adminPass" + "'", str18, "adminPass");
// flaky "43) test0979(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        boolean boolean29 = superManager0.validatePassword();
        superManager0.generateManagementAccount("SuperManager", "Student", "hi!");
        java.lang.String str34 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "adminPass" + "'", str34, "adminPass");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        user.Faculty faculty3 = new user.Faculty("Faculty", "", "");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        managementTeamMember3.verifyLicencePlate();
        java.lang.String str22 = managementTeamMember3.getUsername();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "44) test0982(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        boolean boolean21 = managementTeamMember12.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Faculty", "SuperManager", "Faculty");
        java.lang.String str4 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "", "Faculty");
        managementTeamMember3.register();
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "hi!", "Student", "Management Team");
        boolean boolean5 = userConcrete4.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        user.Faculty faculty3 = new user.Faculty("Management Team", "hi!", "Visitor");
        java.lang.String str4 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Visitor" + "'", str4, "Visitor");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getEmail();
        java.lang.String str5 = managementTeamMember3.getPassword();
        managementTeamMember3.receiveError("adminPass");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        managementTeamMember37.addParkingLot();
        boolean boolean46 = managementTeamMember37.validateEmail();
        managementTeamMember37.processManualInput("hi!");
        managementTeamMember37.register();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        user.Visitor visitor16 = new user.Visitor("hi!", "hi!", "hi!");
        java.lang.String str17 = visitor16.getUsername();
        managementTeamMember3.rejectUser((user.User) visitor16);
        java.lang.String str19 = visitor16.getEmail();
        visitor16.register();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        java.lang.String str4 = superManager0.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        java.lang.String str5 = managementTeamMember3.getEmail();
        boolean boolean8 = managementTeamMember3.login("Student", "Student");
        user.ManagementTeamMember managementTeamMember12 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember12.processManualInput("");
        managementTeamMember12.addParkingLot();
        boolean boolean16 = managementTeamMember12.validatePassword();
        java.lang.String str17 = managementTeamMember12.getUserType();
        boolean boolean18 = managementTeamMember12.validateEmail();
        boolean boolean19 = managementTeamMember12.validatePassword();
        managementTeamMember3.rejectUser((user.User) managementTeamMember12);
        java.lang.String str21 = managementTeamMember12.getUserType();
        boolean boolean22 = managementTeamMember12.validatePassword();
        managementTeamMember12.receiveError("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Management Team" + "'", str17, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Management Team" + "'", str21, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        managementTeamMember37.processManualInput("");
        managementTeamMember37.enableParkingLot();
        java.lang.String str41 = managementTeamMember37.getPassword();
        superManager0.rejectUser((user.User) managementTeamMember37);
        managementTeamMember37.enableParkingSpace();
        managementTeamMember37.processManualInput("adminPass");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("hi!", "hi!", "adminPass", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.processManualInput("hi!");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.register();
        managementTeamMember3.disableParkingLot();
        boolean boolean12 = managementTeamMember3.validateEmail();
        managementTeamMember3.addParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.addParkingLot();
        superManager0.generateManagementAccount("Student", "Management Team", "");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "hi!", "Management Team", "Faculty");
        // The following exception was thrown during execution in test generation
        try {
            user.User user11 = userAbstractFactory1.createUser("", "SuperManager", "", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        user.Student student3 = new user.Student("", "Student", "Visitor");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "hi!");
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingSpace();
    }
}
