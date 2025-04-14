package rando.user;

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
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        java.lang.Class<?> wildcardClass1 = clientUserFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("hi!", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        user.FactoryProducer factoryProducer0 = new user.FactoryProducer();
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        java.lang.Class<?> wildcardClass5 = managementTeamMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        java.lang.Class<?> wildcardClass2 = userAbstractFactory1.getClass();
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        java.lang.Class<?> wildcardClass2 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        user.UserConcrete.csvPath = "hi!";
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str0 = user.UserConcrete.csvPath;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hi!" + "'", str0, "hi!");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("", "SuperManager", "", "adminPass");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        managementTeamMember3.enableParkingSpace();
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("SuperManager", "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("", "SuperManager", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("SuperManager", "Management Team", "Management Team", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("", "hi!", "hi!", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(true);
        // The following exception was thrown during execution in test generation
        try {
            user.User user6 = userAbstractFactory1.createUser("adminPass", "adminPass", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("SuperManager", "hi!", "Management Team", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(true);
        // The following exception was thrown during execution in test generation
        try {
            user.User user6 = userAbstractFactory1.createUser("", "SuperManager", "Management Team", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("SuperManager", "adminPass", "Student", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("SuperManager", "adminPass", "SuperManager", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("SuperManager", "", "Management Team", "adminPass");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.processManualInput("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        user.Faculty faculty3 = new user.Faculty("hi!", "Student", "Management Team");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.register();
        java.lang.String str7 = managementTeamMember3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        user.UserConcrete.csvPath = "SuperManager";
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        boolean boolean4 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("SuperManager", "Management Team", "", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("adminPass", "hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("Student", "hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        user.UserConcrete.csvPath = "Management Team";
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("SuperManager", "Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        user.Visitor visitor3 = new user.Visitor("Student", "adminPass", "hi!");
        java.lang.Class<?> wildcardClass4 = visitor3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        user.Faculty faculty3 = new user.Faculty("Student", "", "SuperManager");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        // The following exception was thrown during execution in test generation
        try {
            user.User user6 = userAbstractFactory1.createUser("", "SuperManager", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("adminPass", "Student", "SuperManager", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        java.lang.Class<?> wildcardClass7 = managementTeamMember3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        // The following exception was thrown during execution in test generation
        try {
            user.User user6 = userAbstractFactory1.createUser("Student", "hi!", "adminPass", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("", "", "Management Team", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("Student", "hi!", "adminPass", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("hi!", "Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        user.Faculty faculty3 = new user.Faculty("", "SuperManager", "SuperManager");
        faculty3.register();
        boolean boolean5 = faculty3.validateEmail();
        java.lang.String str6 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SuperManager" + "'", str6, "SuperManager");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "", "Management Team", "adminPass");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("Student", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        user.UserConcrete.csvPath = "Student";
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        user.Visitor visitor3 = new user.Visitor("Student", "adminPass", "hi!");
        java.lang.String str4 = visitor3.getEmail();
        java.lang.String str5 = visitor3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        user.Faculty faculty3 = new user.Faculty("", "SuperManager", "SuperManager");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        user.Student student3 = new user.Student("Student", "adminPass", "");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        user.Visitor visitor3 = new user.Visitor("Student", "Management Team", "SuperManager");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(true);
        // The following exception was thrown during execution in test generation
        try {
            user.User user6 = userAbstractFactory1.createUser("hi!", "", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "adminPass", "hi!", "Management Team");
        java.lang.Class<?> wildcardClass5 = userConcrete4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        java.lang.Class<?> wildcardClass4 = managementTeamMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        java.lang.String str6 = managementTeamMember3.getUsername();
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("", "", "adminPass", "adminPass");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Visitor", "Visitor", "adminPass", "Management Team");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("Visitor", "hi!", "adminPass", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        user.UserConcrete userConcrete4 = new user.UserConcrete("hi!", "SuperManager", "", "SuperManager");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        java.lang.Class<?> wildcardClass19 = managementTeamMember8.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        boolean boolean8 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        boolean boolean5 = superManager0.login("SuperManager", "SuperManager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("SuperManager", "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        user.Faculty faculty3 = new user.Faculty("Student", "Student", "adminPass");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("SuperManager", "adminPass", "hi!", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "adminPass", "hi!");
        java.lang.Class<?> wildcardClass4 = managementTeamMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        boolean boolean13 = managementTeamMember3.validatePassword();
        java.lang.String str14 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "Student", "adminPass", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user11 = userAbstractFactory1.createUser("Visitor", "Visitor", "adminPass", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("Student", "Visitor", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        user.Visitor visitor3 = new user.Visitor("Student", "adminPass", "hi!");
        java.lang.String str4 = visitor3.getEmail();
        boolean boolean5 = visitor3.validatePassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        user.Visitor visitor3 = new user.Visitor("", "hi!", "");
        boolean boolean4 = visitor3.validateEmail();
        java.lang.Class<?> wildcardClass5 = visitor3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        boolean boolean6 = managementTeamMember3.validateEmail();
        managementTeamMember3.disableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        boolean boolean5 = superManager0.validateEmail();
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "adminPass" + "'", str6, "adminPass");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingLot();
        superManager0.addParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        java.lang.String str4 = managementTeamMember3.getUserType();
        java.lang.Class<?> wildcardClass5 = managementTeamMember3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Management Team" + "'", str4, "Management Team");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("hi!", "hi!", "Visitor", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "adminPass", "hi!");
        user.User user4 = null;
        managementTeamMember3.approveUser(user4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        user.Faculty faculty3 = new user.Faculty("Visitor", "hi!", "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        user.Student student3 = new user.Student("Management Team", "adminPass", "SuperManager");
        boolean boolean6 = student3.login("", "Visitor");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        user.UserConcrete.csvPath = "Visitor";
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        user.Visitor visitor3 = new user.Visitor("SuperManager", "adminPass", "Visitor");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("", "Student", "hi!", "adminPass");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(true);
        // The following exception was thrown during execution in test generation
        try {
            user.User user6 = userAbstractFactory1.createUser("", "SuperManager", "Management Team", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.processManualInput("hi!");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean6 = faculty3.login("hi!", "hi!");
        boolean boolean9 = faculty3.login("Management Team", "hi!");
        java.lang.String str10 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.generateManagementAccount("", "", "");
        boolean boolean6 = superManager0.validatePassword();
        superManager0.addParkingLot();
        superManager0.generateManagementAccount("SuperManager", "Visitor", "");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("Visitor", "", "adminPass", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "hi!", "Visitor", "");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("SuperManager", "Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        superManager0.addParkingLot();
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str8 = managementTeamMember7.getUsername();
        managementTeamMember7.receiveError("");
        managementTeamMember7.receiveError("SuperManager");
        superManager0.rejectUser((user.User) managementTeamMember7);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        user.Visitor visitor3 = new user.Visitor("Management Team", "hi!", "Management Team");
        java.lang.String str4 = visitor3.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        user.Visitor visitor3 = new user.Visitor("SuperManager", "SuperManager", "adminPass");
        java.lang.String str4 = visitor3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "adminPass" + "'", str4, "adminPass");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        user.Visitor visitor3 = new user.Visitor("", "hi!", "");
        boolean boolean4 = visitor3.validateEmail();
        java.lang.String str5 = visitor3.getEmail();
        java.lang.String str6 = visitor3.getUserType();
        boolean boolean9 = visitor3.login("Visitor", "adminPass");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Visitor" + "'", str6, "Visitor");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("Management Team", "Management Team", "adminPass", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        user.Visitor visitor3 = new user.Visitor("", "hi!", "hi!");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "Student", "adminPass", "Student");
        user.User user11 = userAbstractFactory1.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user16 = userAbstractFactory1.createUser("hi!", "Management Team", "hi!", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        // The following exception was thrown during execution in test generation
        try {
            user.User user6 = userAbstractFactory1.createUser("SuperManager", "Visitor", "Visitor", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        user.UserConcrete.csvPath = "";
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "adminPass", "hi!");
        managementTeamMember3.enableParkingSpace();
        java.lang.Class<?> wildcardClass5 = managementTeamMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "adminPass", "hi!");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.receiveError("Visitor");
        java.lang.String str7 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("SuperManager", "Management Team", "Visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("hi!", "", "adminPass", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.processManualInput("Student");
        user.SuperManager superManager10 = user.SuperManager.getInstance();
        superManager10.enableParkingSpace();
        superManager10.enableParkingSpace();
        boolean boolean13 = superManager10.validateEmail();
        boolean boolean14 = superManager10.validatePassword();
        superManager10.receiveError("");
        managementTeamMember3.rejectUser((user.User) superManager10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        user.Student student3 = new user.Student("hi!", "hi!", "Management Team");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "adminPass");
        boolean boolean6 = faculty3.login("", "adminPass");
        boolean boolean7 = faculty3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        user.Faculty faculty3 = new user.Faculty("Management Team", "SuperManager", "SuperManager");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        user.Visitor visitor3 = new user.Visitor("SuperManager", "Student", "SuperManager");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        user.Visitor visitor3 = new user.Visitor("adminPass", "", "hi!");
        visitor3.register();
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Visitor", "Visitor", "Student");
        java.lang.Class<?> wildcardClass4 = managementTeamMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        managementTeamMember13.disableParkingLot();
        managementTeamMember13.register();
        org.junit.Assert.assertNotNull(superManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "adminPass" + "'", str8, "adminPass");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("Management Team", "Management Team", "hi!", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("", "adminPass", "Management Team", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "adminPass");
        java.lang.String str4 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "adminPass" + "'", str4, "adminPass");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.disableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean10 = managementTeamMember3.login("Student", "");
        java.lang.String str11 = managementTeamMember3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "1) test0114(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Management Team" + "'", str11, "Management Team");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        boolean boolean16 = managementTeamMember3.validatePassword();
        managementTeamMember3.receiveError("adminPass");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        boolean boolean6 = managementTeamMember3.login("adminPass", "Student");
        managementTeamMember3.disableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        boolean boolean6 = managementTeamMember3.login("SuperManager", "Student");
        boolean boolean7 = managementTeamMember3.validatePassword();
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        user.Faculty faculty3 = new user.Faculty("", "SuperManager", "SuperManager");
        faculty3.register();
        java.lang.Class<?> wildcardClass5 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("adminPass", "Management Team", "adminPass", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        managementTeamMember3.register();
        java.lang.Class<?> wildcardClass12 = managementTeamMember3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "hi!", "adminPass");
        managementTeamMember3.verifyLicencePlate();
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.disableParkingLot();
        boolean boolean6 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        java.lang.String str13 = managementTeamMember3.getPassword();
        java.lang.Class<?> wildcardClass14 = managementTeamMember3.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        user.Faculty faculty3 = new user.Faculty("adminPass", "Management Team", "");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "adminPass" + "'", str4, "adminPass");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Student", "adminPass");
        managementTeamMember3.verifyLicencePlate();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.disableParkingLot();
        boolean boolean10 = managementTeamMember8.validatePassword();
        managementTeamMember3.rejectUser((user.User) managementTeamMember8);
        java.lang.String str12 = managementTeamMember3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Management Team" + "'", str12, "Management Team");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("", "SuperManager", "hi!", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        user.Faculty faculty9 = new user.Faculty("hi!", "", "");
        managementTeamMember3.approveUser((user.User) faculty9);
        java.lang.String str11 = faculty9.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        superManager0.receiveError("Visitor");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("Management Team", "adminPass");
        java.lang.String str9 = managementTeamMember3.getPassword();
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.disableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "2) test0129(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.receiveError("");
        superManager0.enableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("hi!", "", "Visitor", "adminPass");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        user.Student student3 = new user.Student("", "", "");
        boolean boolean6 = student3.login("Management Team", "Visitor");
// flaky "3) test0132(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("hi!", "Management Team", "hi!", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        boolean boolean6 = superManager0.validateEmail();
        superManager0.generateManagementAccount("Student", "Visitor", "hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        superManager0.generateManagementAccount("Student", "", "SuperManager");
        superManager0.verifyLicencePlate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "adminPass", "hi!");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.receiveError("Visitor");
        java.lang.Class<?> wildcardClass7 = managementTeamMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Visitor", "Visitor", "Management Team", "");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        user.Student student3 = new user.Student("hi!", "hi!", "hi!");
        java.lang.String str4 = student3.getPassword();
        java.lang.Class<?> wildcardClass5 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.register();
        boolean boolean8 = managementTeamMember3.validateEmail();
        java.lang.String str9 = managementTeamMember3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "SuperManager", "hi!");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.verifyLicencePlate();
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "SuperManager", "SuperManager");
        boolean boolean6 = faculty3.login("hi!", "Student");
        boolean boolean9 = faculty3.login("", "Student");
        boolean boolean10 = faculty3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "4) test0141(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        superManager0.generateManagementAccount("", "hi!", "Student");
        java.lang.String str10 = superManager0.getUsername();
        superManager0.register();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SuperManager" + "'", str10, "SuperManager");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        java.lang.String str21 = managementTeamMember15.getUsername();
        user.ManagementTeamMember managementTeamMember25 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str26 = managementTeamMember25.getUsername();
        managementTeamMember25.receiveError("");
        managementTeamMember25.processManualInput("hi!");
        managementTeamMember25.disableParkingSpace();
        user.SuperManager superManager32 = user.SuperManager.getInstance();
        superManager32.enableParkingSpace();
        superManager32.enableParkingSpace();
        user.ManagementTeamMember managementTeamMember38 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember38.enableParkingSpace();
        user.SuperManager superManager40 = user.SuperManager.getInstance();
        superManager40.enableParkingSpace();
        superManager40.enableParkingSpace();
        java.lang.String str43 = superManager40.getPassword();
        superManager40.disableParkingLot();
        user.ManagementTeamMember managementTeamMember48 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember48.processManualInput("");
        java.lang.String str51 = managementTeamMember48.getPassword();
        managementTeamMember48.disableParkingLot();
        managementTeamMember48.enableParkingLot();
        boolean boolean54 = managementTeamMember48.validateEmail();
        java.lang.String str55 = managementTeamMember48.getPassword();
        superManager40.rejectUser((user.User) managementTeamMember48);
        managementTeamMember48.receiveError("Management Team");
        managementTeamMember38.approveUser((user.User) managementTeamMember48);
        superManager32.approveUser((user.User) managementTeamMember38);
        user.Faculty faculty64 = new user.Faculty("", "SuperManager", "SuperManager");
        superManager32.rejectUser((user.User) faculty64);
        superManager32.processManualInput("SuperManager");
        java.lang.String str68 = superManager32.getUsername();
        managementTeamMember25.rejectUser((user.User) superManager32);
        managementTeamMember15.approveUser((user.User) managementTeamMember25);
        managementTeamMember25.register();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(superManager32);
        org.junit.Assert.assertNotNull(superManager40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "adminPass" + "'", str43, "adminPass");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "SuperManager" + "'", str68, "SuperManager");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("Student", "adminPass", "SuperManager", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.addParkingLot();
        managementTeamMember3.processManualInput("");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("adminPass", "", "Student");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("Student", "", "Visitor", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        boolean boolean6 = superManager0.validateEmail();
        superManager0.receiveError("Student");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        java.lang.Class<?> wildcardClass6 = user5.getClass();
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        user.Faculty faculty3 = new user.Faculty("", "SuperManager", "SuperManager");
        boolean boolean4 = faculty3.validateEmail();
        java.lang.Class<?> wildcardClass5 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("adminPass", "Management Team", "SuperManager", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        user.UserConcrete userConcrete4 = new user.UserConcrete("hi!", "Management Team", "Management Team", "hi!");
        userConcrete4.register();
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean4 = faculty3.validateEmail();
        boolean boolean5 = faculty3.validatePassword();
        java.lang.String str6 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validatePassword();
        java.lang.String str3 = superManager0.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.generateManagementAccount("", "", "");
        boolean boolean6 = superManager0.validatePassword();
        superManager0.generateManagementAccount("", "", "Management Team");
        java.lang.String str11 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        // The following exception was thrown during execution in test generation
        try {
            user.User user6 = userAbstractFactory1.createUser("", "hi!", "SuperManager", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        user.Visitor visitor3 = new user.Visitor("", "hi!", "");
        boolean boolean4 = visitor3.validateEmail();
        java.lang.String str5 = visitor3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        java.lang.String str9 = managementTeamMember3.getUserType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Management Team" + "'", str9, "Management Team");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Management Team", "Visitor", "Management Team", "Student");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        boolean boolean8 = managementTeamMember3.login("Management Team", "Student");
        java.lang.String str9 = managementTeamMember3.getUserType();
        managementTeamMember3.enableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Management Team" + "'", str9, "Management Team");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "SuperManager", "SuperManager");
        boolean boolean4 = faculty3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "adminPass", "Visitor");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.verifyLicencePlate();
        superManager0.verifyLicencePlate();
        java.lang.String str4 = superManager0.getEmail();
        boolean boolean5 = superManager0.validatePassword();
        superManager0.receiveError("Student");
        boolean boolean10 = superManager0.login("adminPass", "");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "5) test0165(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("", "hi!", "Management Team", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        user.Visitor visitor3 = new user.Visitor("", "hi!", "");
        boolean boolean4 = visitor3.validateEmail();
        boolean boolean7 = visitor3.login("adminPass", "hi!");
        boolean boolean10 = visitor3.login("Student", "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "6) test0167(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        user.Student student3 = new user.Student("hi!", "Management Team", "hi!");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        user.Student student3 = new user.Student("", "SuperManager", "Management Team");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        user.Faculty faculty9 = new user.Faculty("hi!", "", "");
        managementTeamMember3.approveUser((user.User) faculty9);
        user.Faculty faculty14 = new user.Faculty("hi!", "", "");
        boolean boolean15 = faculty14.validateEmail();
        managementTeamMember3.rejectUser((user.User) faculty14);
        managementTeamMember3.register();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        user.Visitor visitor16 = new user.Visitor("hi!", "hi!", "hi!");
        java.lang.String str17 = visitor16.getUsername();
        managementTeamMember3.rejectUser((user.User) visitor16);
        managementTeamMember3.verifyLicencePlate();
        java.lang.String str20 = managementTeamMember3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Management Team" + "'", str20, "Management Team");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        boolean boolean18 = managementTeamMember3.login("Student", "SuperManager");
        java.lang.String str19 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        user.Visitor visitor3 = new user.Visitor("", "hi!", "");
        boolean boolean6 = visitor3.login("SuperManager", "hi!");
        boolean boolean7 = visitor3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        user.Visitor visitor3 = new user.Visitor("SuperManager", "hi!", "Visitor");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        java.lang.String str22 = managementTeamMember3.getEmail();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        user.Student student3 = new user.Student("hi!", "SuperManager", "");
        student3.register();
        boolean boolean7 = student3.login("", "Management Team");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        managementTeamMember3.register();
        managementTeamMember3.register();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        java.lang.String str45 = managementTeamMember37.getEmail();
        boolean boolean48 = managementTeamMember37.login("hi!", "hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        superManager0.generateManagementAccount("Visitor", "Visitor", "hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Management Team" + "'", str15, "Management Team");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SuperManager" + "'", str18, "SuperManager");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        superManager29.verifyLicencePlate();
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        superManager0.receiveError("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "Student", "adminPass", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user11 = userAbstractFactory1.createUser("", "", "hi!", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        user.ManagementTeamMember managementTeamMember25 = new user.ManagementTeamMember("", "SuperManager", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("adminPass", "Management Team", "SuperManager");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("Student", "SuperManager", "adminPass", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        user.User user12 = null;
        managementTeamMember3.approveUser(user12);
        managementTeamMember3.disableParkingSpace();
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "hi!", "", "Visitor");
        boolean boolean7 = userConcrete4.login("hi!", "Visitor");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        managementTeamMember3.receiveError("adminPass");
        managementTeamMember3.enableParkingLot();
        java.lang.String str11 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        java.lang.String str5 = managementTeamMember3.getPassword();
        java.lang.String str6 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        user.Student student3 = new user.Student("hi!", "hi!", "hi!");
        java.lang.String str4 = student3.getUserType();
        java.lang.String str5 = student3.getEmail();
        boolean boolean8 = student3.login("", "Visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        managementTeamMember8.processManualInput("Management Team");
        user.ManagementTeamMember managementTeamMember18 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str19 = managementTeamMember18.getUsername();
        managementTeamMember18.receiveError("");
        managementTeamMember18.receiveError("SuperManager");
        managementTeamMember8.rejectUser((user.User) managementTeamMember18);
        managementTeamMember18.register();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        user.UserConcrete.csvPath = "adminPass";
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        boolean boolean34 = superManager25.validatePassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "adminPass" + "'", str10, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Management Team" + "'", str20, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("adminPass", "adminPass", "Management Team", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        user.Faculty faculty3 = new user.Faculty("Visitor", "Visitor", "SuperManager");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        java.lang.String str4 = superManager0.getUserType();
        superManager0.generateManagementAccount("SuperManager", "hi!", "Management Team");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Management Team" + "'", str4, "Management Team");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("Student", "SuperManager", "adminPass", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        boolean boolean9 = managementTeamMember3.validateEmail();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.processManualInput("");
        java.lang.String str13 = managementTeamMember3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.receiveError("SuperManager");
        managementTeamMember3.register();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        user.Faculty faculty3 = new user.Faculty("hi!", "hi!", "");
        boolean boolean4 = faculty3.validateEmail();
        java.lang.String str5 = faculty3.getPassword();
        java.lang.String str6 = faculty3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        user.Visitor visitor3 = new user.Visitor("", "", "hi!");
        boolean boolean4 = visitor3.validateEmail();
        java.lang.String str5 = visitor3.getUsername();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "Visitor", "hi!", "Management Team");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        superManager0.processManualInput("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("Visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        managementTeamMember3.receiveError("adminPass");
        boolean boolean50 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "adminPass" + "'", str21, "adminPass");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "SuperManager" + "'", str46, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        user.Student student3 = new user.Student("", "", "Visitor");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "SuperManager", "SuperManager");
        java.lang.String str4 = faculty3.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SuperManager" + "'", str4, "SuperManager");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("Visitor", "", "Visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.generateManagementAccount("hi!", "hi!", "adminPass");
        boolean boolean5 = superManager0.validatePassword();
        java.lang.String str6 = superManager0.getUsername();
        boolean boolean9 = superManager0.login("Faculty", "Student");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SuperManager" + "'", str6, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        user.Faculty faculty3 = new user.Faculty("adminPass", "Management Team", "Visitor");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        user.Student student3 = new user.Student("Management Team", "adminPass", "SuperManager");
        boolean boolean6 = student3.login("Faculty", "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        user.Visitor visitor3 = new user.Visitor("", "SuperManager", "Visitor");
        java.lang.String str4 = visitor3.getEmail();
        boolean boolean7 = visitor3.login("Visitor", "Management Team");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("Management Team", "Visitor", "Management Team", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        java.lang.Class<?> wildcardClass20 = managementTeamMember8.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky "7) test0215(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Management Team", "Visitor", "Student", "");
        boolean boolean7 = userConcrete4.login("SuperManager", "hi!");
        java.lang.String str8 = userConcrete4.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "adminPass", "SuperManager");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        user.Faculty faculty9 = new user.Faculty("hi!", "", "");
        managementTeamMember3.approveUser((user.User) faculty9);
        managementTeamMember3.disableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        managementTeamMember3.verifyLicencePlate();
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        user.Student student3 = new user.Student("SuperManager", "Student", "Visitor");
        java.lang.String str4 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SuperManager" + "'", str4, "SuperManager");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        java.lang.Class<?> wildcardClass29 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        user.UserConcrete userConcrete4 = new user.UserConcrete("hi!", "hi!", "Visitor", "SuperManager");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.generateManagementAccount("hi!", "hi!", "adminPass");
        boolean boolean5 = superManager0.validatePassword();
        boolean boolean8 = superManager0.login("Student", "");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "8) test0223(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        user.Visitor visitor3 = new user.Visitor("Student", "adminPass", "hi!");
        java.lang.String str4 = visitor3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Management Team", "Visitor", "Visitor", "Faculty");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("", "SuperManager", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        boolean boolean10 = managementTeamMember3.login("hi!", "Management Team");
        managementTeamMember3.register();
        boolean boolean12 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        managementTeamMember8.processManualInput("");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("", "Management Team", "SuperManager", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        managementTeamMember8.processManualInput("Management Team");
        user.ManagementTeamMember managementTeamMember18 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str19 = managementTeamMember18.getUsername();
        managementTeamMember18.receiveError("");
        managementTeamMember18.receiveError("SuperManager");
        managementTeamMember8.rejectUser((user.User) managementTeamMember18);
        boolean boolean25 = managementTeamMember8.validateEmail();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        user.Visitor visitor12 = new user.Visitor("hi!", "adminPass", "Student");
        managementTeamMember7.rejectUser((user.User) visitor12);
        boolean boolean14 = managementTeamMember7.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "adminPass", "Management Team", "Management Team");
        boolean boolean5 = userConcrete4.validatePassword();
        java.lang.String str6 = userConcrete4.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Management Team" + "'", str6, "Management Team");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.receiveError("SuperManager");
        boolean boolean9 = managementTeamMember3.validateEmail();
        managementTeamMember3.receiveError("Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        user.Visitor visitor3 = new user.Visitor("", "", "hi!");
        java.lang.String str4 = visitor3.getEmail();
        boolean boolean7 = visitor3.login("SuperManager", "Visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.receiveError("hi!");
        boolean boolean6 = superManager0.validateEmail();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        boolean boolean13 = visitor10.login("SuperManager", "hi!");
        java.lang.String str14 = visitor10.getEmail();
        visitor10.register();
        superManager0.approveUser((user.User) visitor10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        user.Student student3 = new user.Student("SuperManager", "SuperManager", "SuperManager");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        user.Visitor visitor10 = new user.Visitor("", "hi!", "");
        managementTeamMember3.approveUser((user.User) visitor10);
        user.User user12 = null;
        managementTeamMember3.approveUser(user12);
        managementTeamMember3.addParkingLot();
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        user.User user10 = clientUserFactory0.createUser("Student", "Faculty", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = clientUserFactory0.createUser("Management Team", "SuperManager", "Management Team", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        user.Visitor visitor3 = new user.Visitor("Management Team", "", "hi!");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        user.Faculty faculty9 = new user.Faculty("hi!", "", "");
        managementTeamMember3.approveUser((user.User) faculty9);
        user.Faculty faculty14 = new user.Faculty("hi!", "", "");
        boolean boolean15 = faculty14.validateEmail();
        managementTeamMember3.rejectUser((user.User) faculty14);
        java.lang.String str17 = faculty14.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.receiveError("adminPass");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.receiveError("Faculty");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("hi!", "Visitor", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "hi!", "", "");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        java.lang.Class<?> wildcardClass8 = managementTeamMember3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        user.Visitor visitor3 = new user.Visitor("", "hi!", "");
        boolean boolean4 = visitor3.validateEmail();
        boolean boolean7 = visitor3.login("adminPass", "hi!");
        boolean boolean8 = visitor3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "9) test0245(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("SuperManager", "Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        user.Student student3 = new user.Student("Visitor", "Management Team", "");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "Student", "adminPass", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user11 = userAbstractFactory1.createUser("SuperManager", "adminPass", "", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        user.ManagementTeamMember managementTeamMember9 = new user.ManagementTeamMember("SuperManager", "SuperManager", "hi!");
        managementTeamMember3.approveUser((user.User) managementTeamMember9);
        java.lang.Class<?> wildcardClass11 = managementTeamMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        managementTeamMember37.receiveError("Faculty");
        managementTeamMember37.addParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "adminPass", "hi!");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.receiveError("Visitor");
        java.lang.String str7 = managementTeamMember3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        boolean boolean5 = managementTeamMember3.validatePassword();
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.addParkingLot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "", "adminPass");
        java.lang.String str4 = managementTeamMember3.getUsername();
        java.lang.String str5 = managementTeamMember3.getEmail();
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SuperManager" + "'", str5, "SuperManager");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "adminPass" + "'", str6, "adminPass");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        user.Student student3 = new user.Student("Management Team", "adminPass", "SuperManager");
        boolean boolean4 = student3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        boolean boolean22 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.processManualInput("hi!");
        managementTeamMember3.disableParkingSpace();
        boolean boolean10 = managementTeamMember3.validatePassword();
        boolean boolean13 = managementTeamMember3.login("Faculty", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("hi!", "Student", "Management Team", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("SuperManager", "Faculty", "adminPass", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        java.lang.String str21 = managementTeamMember15.getUsername();
        user.ManagementTeamMember managementTeamMember25 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str26 = managementTeamMember25.getUsername();
        managementTeamMember25.receiveError("");
        managementTeamMember25.processManualInput("hi!");
        managementTeamMember25.disableParkingSpace();
        user.SuperManager superManager32 = user.SuperManager.getInstance();
        superManager32.enableParkingSpace();
        superManager32.enableParkingSpace();
        user.ManagementTeamMember managementTeamMember38 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember38.enableParkingSpace();
        user.SuperManager superManager40 = user.SuperManager.getInstance();
        superManager40.enableParkingSpace();
        superManager40.enableParkingSpace();
        java.lang.String str43 = superManager40.getPassword();
        superManager40.disableParkingLot();
        user.ManagementTeamMember managementTeamMember48 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember48.processManualInput("");
        java.lang.String str51 = managementTeamMember48.getPassword();
        managementTeamMember48.disableParkingLot();
        managementTeamMember48.enableParkingLot();
        boolean boolean54 = managementTeamMember48.validateEmail();
        java.lang.String str55 = managementTeamMember48.getPassword();
        superManager40.rejectUser((user.User) managementTeamMember48);
        managementTeamMember48.receiveError("Management Team");
        managementTeamMember38.approveUser((user.User) managementTeamMember48);
        superManager32.approveUser((user.User) managementTeamMember38);
        user.Faculty faculty64 = new user.Faculty("", "SuperManager", "SuperManager");
        superManager32.rejectUser((user.User) faculty64);
        superManager32.processManualInput("SuperManager");
        java.lang.String str68 = superManager32.getUsername();
        managementTeamMember25.rejectUser((user.User) superManager32);
        managementTeamMember15.approveUser((user.User) managementTeamMember25);
        managementTeamMember25.enableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(superManager32);
        org.junit.Assert.assertNotNull(superManager40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "adminPass" + "'", str43, "adminPass");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "SuperManager" + "'", str68, "SuperManager");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Faculty", "Visitor", "Faculty", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = clientUserFactory0.createUser("adminPass", "adminPass", "adminPass", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "Management Team", "adminPass");
        managementTeamMember3.enableParkingSpace();
        java.lang.String str5 = managementTeamMember3.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Management Team" + "'", str5, "Management Team");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        java.lang.String str11 = managementTeamMember8.getPassword();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        java.lang.String str13 = managementTeamMember3.getUserType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Management Team", "SuperManager", "SuperManager", "");
        boolean boolean5 = userConcrete4.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.addParkingLot();
        managementTeamMember3.processManualInput("Student");
        managementTeamMember3.register();
        boolean boolean11 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        // The following exception was thrown during execution in test generation
        try {
            user.User user6 = userAbstractFactory1.createUser("hi!", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        managementTeamMember3.verifyLicencePlate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("Student", "SuperManager", "adminPass", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        user.Student student3 = new user.Student("SuperManager", "", "SuperManager");
        boolean boolean4 = student3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        managementTeamMember18.receiveError("");
        java.lang.Class<?> wildcardClass23 = managementTeamMember18.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean6 = faculty3.login("hi!", "hi!");
        faculty3.register();
        boolean boolean8 = faculty3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "SuperManager");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        java.lang.Class<?> wildcardClass7 = managementTeamMember3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        boolean boolean22 = managementTeamMember15.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Student", "adminPass");
        managementTeamMember3.verifyLicencePlate();
        user.Student student8 = new user.Student("hi!", "", "adminPass");
        managementTeamMember3.approveUser((user.User) student8);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.addParkingLot();
        java.lang.String str5 = managementTeamMember3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean4 = faculty3.validateEmail();
        boolean boolean5 = faculty3.validatePassword();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.register();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        user.Student student3 = new user.Student("Student", "hi!", "Student");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingSpace();
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "SuperManager", "SuperManager");
        boolean boolean6 = faculty3.login("hi!", "Student");
        boolean boolean9 = faculty3.login("adminPass", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "10) test0279(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.addParkingLot();
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.verifyLicencePlate();
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = clientUserFactory0.createUser("Management Team", "", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Student", "adminPass");
        managementTeamMember3.verifyLicencePlate();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.disableParkingLot();
        boolean boolean10 = managementTeamMember8.validatePassword();
        managementTeamMember3.rejectUser((user.User) managementTeamMember8);
        boolean boolean12 = managementTeamMember8.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "Student", "");
        java.lang.String str4 = faculty3.getPassword();
        boolean boolean5 = faculty3.validatePassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("Student", "", "", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        java.lang.String str13 = managementTeamMember3.getPassword();
        managementTeamMember3.processManualInput("Management Team");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        boolean boolean54 = managementTeamMember48.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.generateManagementAccount("hi!", "hi!", "adminPass");
        boolean boolean5 = superManager0.validatePassword();
        superManager0.enableParkingSpace();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "Management Team", "Student", "");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        superManager20.addParkingLot();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SuperManager" + "'", str23, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "hi!", "Student", "Management Team");
        boolean boolean7 = userConcrete4.login("hi!", "SuperManager");
        java.lang.Class<?> wildcardClass8 = userConcrete4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.lang.String str48 = superManager10.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "adminPass" + "'", str21, "adminPass");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "SuperManager" + "'", str46, "SuperManager");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "adminPass" + "'", str48, "adminPass");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("", "Student", "SuperManager", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Management Team", "", "SuperManager");
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.receiveError("SuperManager");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        java.lang.Class<?> wildcardClass19 = faculty13.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "adminPass" + "'", str14, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        managementTeamMember3.disableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        boolean boolean5 = managementTeamMember3.validatePassword();
        boolean boolean8 = managementTeamMember3.login("Visitor", "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "hi!", "adminPass", "Faculty");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        java.lang.String str21 = managementTeamMember3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean6 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "Student", "adminPass", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user11 = userAbstractFactory1.createUser("Visitor", "", "Faculty", "adminPass");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        boolean boolean9 = managementTeamMember3.validatePassword();
        java.lang.String str10 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Student", "adminPass", "", "hi!");
        boolean boolean5 = userConcrete4.validatePassword();
        java.lang.String str6 = userConcrete4.getUserType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "Student");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        user.Student student3 = new user.Student("", "Faculty", "Visitor");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        java.lang.String str9 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        managementTeamMember14.receiveError("Visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        user.Student student3 = new user.Student("", "adminPass", "hi!");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        managementTeamMember8.processManualInput("Management Team");
        user.ManagementTeamMember managementTeamMember18 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str19 = managementTeamMember18.getUsername();
        managementTeamMember18.receiveError("");
        managementTeamMember18.receiveError("SuperManager");
        managementTeamMember8.rejectUser((user.User) managementTeamMember18);
        java.lang.String str25 = managementTeamMember8.getEmail();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        user.UserConcrete userConcrete9 = new user.UserConcrete("", "Student", "adminPass", "Management Team");
        boolean boolean12 = userConcrete9.login("SuperManager", "adminPass");
        superManager0.rejectUser((user.User) userConcrete9);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        user.Faculty faculty3 = new user.Faculty("adminPass", "Management Team", "hi!");
        boolean boolean4 = faculty3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        user.Student student3 = new user.Student("", "", "hi!");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean6 = faculty3.login("hi!", "hi!");
        faculty3.register();
        java.lang.String str8 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("SuperManager", "Management Team", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("", "Student", "Management Team", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        boolean boolean9 = managementTeamMember3.validatePassword();
        managementTeamMember3.processManualInput("Faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Faculty", "Visitor", "");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        java.lang.Class<?> wildcardClass45 = managementTeamMember37.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        boolean boolean32 = managementTeamMember6.validatePassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.disableParkingLot();
        java.lang.String str6 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        boolean boolean14 = managementTeamMember10.login("", "");
        managementTeamMember3.approveUser((user.User) managementTeamMember10);
        boolean boolean18 = managementTeamMember3.login("Student", "SuperManager");
        managementTeamMember3.enableParkingLot();
        boolean boolean20 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        boolean boolean55 = managementTeamMember48.login("", "");
        managementTeamMember48.verifyLicencePlate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        user.Student student3 = new user.Student("adminPass", "", "hi!");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        user.Student student3 = new user.Student("SuperManager", "Student", "SuperManager");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        user.Faculty faculty3 = new user.Faculty("Student", "adminPass", "Management Team");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        user.Faculty faculty3 = new user.Faculty("Management Team", "hi!", "");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "Student", "adminPass", "Student");
        user.User user11 = userAbstractFactory1.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user16 = userAbstractFactory1.createUser("", "adminPass", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        superManager25.generateManagementAccount("adminPass", "SuperManager", "");
        java.lang.String str37 = superManager25.getUserType();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "adminPass" + "'", str10, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Management Team" + "'", str20, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Management Team" + "'", str37, "Management Team");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        user.Faculty faculty3 = new user.Faculty("", "adminPass", "Student");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("hi!", "hi!", "");
        superManager0.generateManagementAccount("Student", "hi!", "");
        superManager0.addParkingLot();
        java.lang.String str11 = superManager0.getUsername();
        superManager0.enableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SuperManager" + "'", str11, "SuperManager");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("Management Team", "adminPass");
        managementTeamMember3.enableParkingLot();
        boolean boolean10 = managementTeamMember3.validateEmail();
        java.lang.String str11 = managementTeamMember3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "11) test0332(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("adminPass", "hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        java.lang.String str11 = managementTeamMember8.getPassword();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        managementTeamMember3.register();
        managementTeamMember3.register();
        managementTeamMember3.enableParkingSpace();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        java.lang.String str6 = managementTeamMember3.getUsername();
        boolean boolean7 = managementTeamMember3.validatePassword();
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.addParkingLot();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        user.Faculty faculty3 = new user.Faculty("hi!", "Faculty", "SuperManager");
        boolean boolean6 = faculty3.login("adminPass", "hi!");
// flaky "12) test0336(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        user.Student student3 = new user.Student("Faculty", "", "");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        user.Student student3 = new user.Student("Visitor", "SuperManager", "Management Team");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        boolean boolean22 = superManager0.login("Visitor", "Visitor");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "adminPass" + "'", str14, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.processManualInput("Student");
        managementTeamMember3.processManualInput("SuperManager");
        java.lang.String str12 = managementTeamMember3.getPassword();
        managementTeamMember3.verifyLicencePlate();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        user.Faculty faculty9 = new user.Faculty("hi!", "", "");
        managementTeamMember3.approveUser((user.User) faculty9);
        user.Faculty faculty14 = new user.Faculty("hi!", "", "");
        boolean boolean15 = faculty14.validateEmail();
        managementTeamMember3.rejectUser((user.User) faculty14);
        managementTeamMember3.enableParkingLot();
        managementTeamMember3.processManualInput("Faculty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        java.lang.String str4 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "adminPass" + "'", str4, "adminPass");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean6 = faculty3.login("hi!", "hi!");
        boolean boolean9 = faculty3.login("Management Team", "hi!");
        boolean boolean10 = faculty3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "", "hi!", "Student");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Management Team", "", "Management Team");
        boolean boolean4 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("Management Team", "adminPass");
        java.lang.String str9 = managementTeamMember3.getPassword();
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.disableParkingLot();
        boolean boolean14 = managementTeamMember3.login("Visitor", "adminPass");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "13) test0346(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        user.Visitor visitor3 = new user.Visitor("Student", "", "hi!");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        user.Visitor visitor3 = new user.Visitor("Visitor", "Visitor", "Faculty");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getPassword();
        superManager0.verifyLicencePlate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        user.Visitor visitor3 = new user.Visitor("", "hi!", "");
        boolean boolean4 = visitor3.validateEmail();
        java.lang.String str5 = visitor3.getEmail();
        java.lang.String str6 = visitor3.getUserType();
        boolean boolean7 = visitor3.validatePassword();
        visitor3.register();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Visitor" + "'", str6, "Visitor");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        user.Faculty faculty3 = new user.Faculty("Faculty", "Management Team", "Management Team");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("SuperManager", "Student", "adminPass", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Faculty", "Visitor", "Faculty", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = clientUserFactory0.createUser("SuperManager", "Faculty", "adminPass", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("Student", "Visitor", "Management Team", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        boolean boolean8 = managementTeamMember3.login("Management Team", "Student");
        user.UserConcrete userConcrete13 = new user.UserConcrete("hi!", "Student", "Management Team", "Management Team");
        managementTeamMember3.approveUser((user.User) userConcrete13);
        boolean boolean17 = userConcrete13.login("Visitor", "Visitor");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        java.lang.String str13 = managementTeamMember3.getPassword();
        managementTeamMember3.receiveError("Management Team");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        user.Student student3 = new user.Student("SuperManager", "adminPass", "");
        java.lang.String str4 = student3.getPassword();
        java.lang.String str5 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SuperManager" + "'", str5, "SuperManager");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        user.Visitor visitor16 = new user.Visitor("hi!", "hi!", "hi!");
        java.lang.String str17 = visitor16.getUsername();
        managementTeamMember3.rejectUser((user.User) visitor16);
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.disableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        boolean boolean2 = superManager0.validateEmail();
        superManager0.verifyLicencePlate();
        boolean boolean4 = superManager0.validateEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "Student", "adminPass", "Management Team");
        boolean boolean5 = userConcrete4.validateEmail();
        java.lang.Class<?> wildcardClass6 = userConcrete4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getUserType();
        managementTeamMember3.register();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Management Team" + "'", str10, "Management Team");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("hi!", "Faculty", "SuperManager", "adminPass");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.generateManagementAccount("", "", "");
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "adminPass" + "'", str6, "adminPass");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Management Team", "adminPass", "Faculty", "SuperManager");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "", "adminPass");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.register();
        java.lang.String str7 = managementTeamMember3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "adminPass" + "'", str7, "adminPass");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        user.UserConcrete userConcrete4 = new user.UserConcrete("hi!", "", "adminPass", "adminPass");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        user.Faculty faculty9 = new user.Faculty("hi!", "", "");
        managementTeamMember3.approveUser((user.User) faculty9);
        user.Faculty faculty14 = new user.Faculty("hi!", "", "");
        boolean boolean15 = faculty14.validateEmail();
        managementTeamMember3.rejectUser((user.User) faculty14);
        java.lang.String str17 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("Faculty", "", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(true);
        user.User user6 = userAbstractFactory1.createUser("Student", "", "adminPass", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user11 = userAbstractFactory1.createUser("adminPass", "SuperManager", "SuperManager", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        boolean boolean6 = managementTeamMember3.login("SuperManager", "Student");
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getPassword();
        managementTeamMember3.register();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        java.lang.String str6 = managementTeamMember3.getUsername();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.Class<?> wildcardClass8 = managementTeamMember3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        user.Faculty faculty3 = new user.Faculty("Faculty", "Management Team", "Student");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        user.Faculty faculty3 = new user.Faculty("Student", "", "adminPass");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        superManager0.enableParkingLot();
        java.lang.String str7 = superManager0.getPassword();
        superManager0.generateManagementAccount("adminPass", "Management Team", "Management Team");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "adminPass" + "'", str7, "adminPass");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "", "hi!", "Faculty");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "hi!", "");
        managementTeamMember3.disableParkingSpace();
        java.lang.String str5 = managementTeamMember3.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Faculty", "Visitor", "Faculty", "Student");
        user.User user15 = clientUserFactory0.createUser("Faculty", "Student", "Management Team", "SuperManager");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("adminPass", "Visitor", "adminPass", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "Visitor", "Management Team", "Student");
        user.User user10 = clientUserFactory0.createUser("Student", "adminPass", "", "SuperManager");
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "hi!", "hi!", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("", "SuperManager", "Management Team", "SuperManager");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        user.UserConcrete userConcrete4 = new user.UserConcrete("SuperManager", "", "Student", "hi!");
        java.lang.Class<?> wildcardClass5 = userConcrete4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "Visitor", "SuperManager");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        managementTeamMember37.receiveError("Faculty");
        managementTeamMember37.disableParkingSpace();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Management Team", "hi!", "SuperManager");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        user.Student student3 = new user.Student("adminPass", "Visitor", "Management Team");
        java.lang.String str4 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "adminPass" + "'", str4, "adminPass");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.receiveError("SuperManager");
        managementTeamMember3.processManualInput("hi!");
        managementTeamMember3.verifyLicencePlate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        // The following exception was thrown during execution in test generation
        try {
            user.User user10 = managementUserFactory0.createUser("Student", "Management Team", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        managementTeamMember3.register();
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        managementTeamMember3.register();
        org.junit.Assert.assertNotNull(superManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "adminPass" + "'", str8, "adminPass");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "");
        boolean boolean4 = faculty3.validateEmail();
        boolean boolean5 = faculty3.validatePassword();
        boolean boolean8 = faculty3.login("SuperManager", "adminPass");
        boolean boolean9 = faculty3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "14) test0389(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.generateManagementAccount("adminPass", "hi!", "");
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        java.lang.String str42 = managementTeamMember18.getUserType();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Management Team" + "'", str42, "Management Team");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        user.Faculty faculty3 = new user.Faculty("", "Visitor", "Visitor");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("hi!", "hi!", "Management Team", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Student", "SuperManager", "adminPass", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = clientUserFactory0.createUser("adminPass", "", "", "Management Team");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Visitor", "SuperManager", "Student");
        managementTeamMember3.disableParkingSpace();
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        user.Faculty faculty3 = new user.Faculty("", "SuperManager", "SuperManager");
        faculty3.register();
        boolean boolean7 = faculty3.login("Management Team", "Management Team");
        boolean boolean8 = faculty3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.lang.String str18 = managementTeamMember3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Management Team" + "'", str9, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Management Team" + "'", str18, "Management Team");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        user.Student student3 = new user.Student("hi!", "adminPass", "Visitor");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        managementTeamMember3.enableParkingSpace();
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        managementTeamMember3.register();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("adminPass", "SuperManager", "", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        superManager0.enableParkingLot();
        java.lang.String str7 = superManager0.getPassword();
        user.Visitor visitor11 = new user.Visitor("adminPass", "adminPass", "SuperManager");
        superManager0.approveUser((user.User) visitor11);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "adminPass" + "'", str7, "adminPass");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Management Team", "Student");
        user.ClientUserFactory clientUserFactory4 = new user.ClientUserFactory();
        user.User user9 = clientUserFactory4.createUser("Student", "hi!", "", "Visitor");
        user.User user14 = clientUserFactory4.createUser("Student", "Faculty", "hi!", "Student");
        managementTeamMember3.approveUser(user14);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(user14);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Student", "adminPass", "", "hi!");
        boolean boolean5 = userConcrete4.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Faculty", "SuperManager", "Faculty");
        managementTeamMember3.verifyLicencePlate();
        java.lang.String str5 = managementTeamMember3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        superManager0.generateManagementAccount("hi!", "hi!", "");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        boolean boolean71 = managementTeamMember3.login("Student", "");
        org.junit.Assert.assertNotNull(superManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "adminPass" + "'", str8, "adminPass");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        user.Student student3 = new user.Student("adminPass", "hi!", "SuperManager");
        java.lang.String str4 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SuperManager" + "'", str4, "SuperManager");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Student", "hi!", "", "Visitor");
        user.User user10 = clientUserFactory0.createUser("Student", "Faculty", "hi!", "Student");
        user.User user15 = clientUserFactory0.createUser("Visitor", "SuperManager", "SuperManager", "Faculty");
        // The following exception was thrown during execution in test generation
        try {
            user.User user20 = clientUserFactory0.createUser("adminPass", "Visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        java.lang.String str33 = superManager7.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "adminPass" + "'", str10, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Management Team" + "'", str20, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "adminPass" + "'", str33, "adminPass");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        user.Faculty faculty3 = new user.Faculty("", "Student", "");
        faculty3.register();
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        java.lang.String str5 = managementTeamMember3.getUsername();
        java.lang.Class<?> wildcardClass6 = managementTeamMember3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "adminPass", "hi!", "");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "", "adminPass");
        boolean boolean4 = managementTeamMember3.validateEmail();
        managementTeamMember3.processManualInput("Faculty");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        user.User user5 = managementUserFactory0.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user10 = managementUserFactory0.createUser("Management Team", "Visitor", "", "");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = managementUserFactory0.createUser("Visitor", "Management Team", "Visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        java.lang.String str23 = managementTeamMember3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        user.Visitor visitor3 = new user.Visitor("hi!", "Student", "Student");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        superManager0.enableParkingLot();
        java.lang.String str7 = superManager0.getPassword();
        boolean boolean8 = superManager0.validatePassword();
        superManager0.processManualInput("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "adminPass" + "'", str7, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.disableParkingLot();
        java.lang.String str8 = managementTeamMember3.getPassword();
        java.lang.String str9 = managementTeamMember3.getUserType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Management Team" + "'", str9, "Management Team");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        user.Student student3 = new user.Student("adminPass", "Visitor", "Management Team");
        student3.register();
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        user.ManagementTeamMember managementTeamMember7 = new user.ManagementTeamMember("hi!", "", "SuperManager");
        managementTeamMember3.approveUser((user.User) managementTeamMember7);
        java.lang.String str9 = managementTeamMember7.getEmail();
        java.lang.String str10 = managementTeamMember7.getUsername();
        boolean boolean13 = managementTeamMember7.login("Management Team", "adminPass");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "15) test0421(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "Student", "adminPass", "Management Team");
        boolean boolean5 = userConcrete4.validateEmail();
        boolean boolean6 = userConcrete4.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        user.Student student3 = new user.Student("Visitor", "Faculty", "Student");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        managementTeamMember3.receiveError("");
        managementTeamMember3.processManualInput("hi!");
        boolean boolean9 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        java.lang.String str13 = managementTeamMember3.getPassword();
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        boolean boolean31 = managementTeamMember6.login("SuperManager", "Faculty");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        superManager14.verifyLicencePlate();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(superManager14);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean5 = managementTeamMember3.validatePassword();
        user.Faculty faculty9 = new user.Faculty("hi!", "", "");
        managementTeamMember3.approveUser((user.User) faculty9);
        user.Faculty faculty14 = new user.Faculty("hi!", "", "");
        boolean boolean15 = faculty14.validateEmail();
        managementTeamMember3.rejectUser((user.User) faculty14);
        faculty14.register();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        boolean boolean4 = managementTeamMember3.validateEmail();
        boolean boolean7 = managementTeamMember3.login("adminPass", "Management Team");
        boolean boolean8 = managementTeamMember3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.verifyLicencePlate();
        superManager0.register();
        user.ManagementTeamMember managementTeamMember10 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember10.disableParkingLot();
        java.lang.String str12 = managementTeamMember10.getEmail();
        boolean boolean15 = managementTeamMember10.login("Student", "Student");
        user.ManagementTeamMember managementTeamMember19 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember19.processManualInput("");
        managementTeamMember19.addParkingLot();
        boolean boolean23 = managementTeamMember19.validatePassword();
        java.lang.String str24 = managementTeamMember19.getUserType();
        boolean boolean25 = managementTeamMember19.validateEmail();
        boolean boolean26 = managementTeamMember19.validatePassword();
        managementTeamMember10.rejectUser((user.User) managementTeamMember19);
        superManager0.approveUser((user.User) managementTeamMember19);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "16) test0430(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Management Team" + "'", str24, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        java.lang.String str20 = managementTeamMember8.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        boolean boolean6 = managementTeamMember3.login("SuperManager", "Student");
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getPassword();
        boolean boolean9 = managementTeamMember3.validateEmail();
        managementTeamMember3.disableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        user.UserConcrete userConcrete4 = new user.UserConcrete("hi!", "Management Team", "Management Team", "hi!");
        boolean boolean7 = userConcrete4.login("adminPass", "Student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Management Team", "Visitor", "SuperManager");
        java.lang.String str4 = managementTeamMember3.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Visitor" + "'", str4, "Visitor");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        user.Student student3 = new user.Student("Management Team", "hi!", "adminPass");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        boolean boolean5 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        superManager0.verifyLicencePlate();
        java.lang.String str8 = superManager0.getPassword();
        user.ManagementTeamMember managementTeamMember12 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember12.enableParkingSpace();
        managementTeamMember12.disableParkingSpace();
        java.lang.String str15 = managementTeamMember12.getUsername();
        boolean boolean16 = managementTeamMember12.validatePassword();
        managementTeamMember12.enableParkingSpace();
        superManager0.rejectUser((user.User) managementTeamMember12);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "adminPass" + "'", str8, "adminPass");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        java.lang.String str9 = managementTeamMember3.getUsername();
        java.lang.String str10 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Student", "SuperManager", "Visitor", "SuperManager");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        boolean boolean4 = managementTeamMember3.validateEmail();
        boolean boolean5 = managementTeamMember3.validatePassword();
        boolean boolean8 = managementTeamMember3.login("adminPass", "adminPass");
        boolean boolean9 = managementTeamMember3.validatePassword();
        managementTeamMember3.enableParkingSpace();
        java.lang.String str11 = managementTeamMember3.getPassword();
        java.lang.Class<?> wildcardClass12 = managementTeamMember3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validatePassword();
        superManager0.generateManagementAccount("adminPass", "SuperManager", "adminPass");
        boolean boolean8 = superManager0.validateEmail();
        boolean boolean11 = superManager0.login("", "Student");
        superManager0.receiveError("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        java.lang.String str5 = managementTeamMember3.getPassword();
        java.lang.String str6 = managementTeamMember3.getUsername();
        managementTeamMember3.enableParkingLot();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        boolean boolean5 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        superManager0.generateManagementAccount("Visitor", "hi!", "hi!");
        superManager0.disableParkingLot();
        superManager0.enableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(true);
        user.User user6 = userAbstractFactory1.createUser("Faculty", "", "SuperManager", "Visitor");
        org.junit.Assert.assertNotNull(userAbstractFactory1);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        managementTeamMember3.addParkingLot();
        boolean boolean8 = managementTeamMember3.login("Management Team", "Visitor");
        boolean boolean9 = managementTeamMember3.validatePassword();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.enableParkingSpace();
        boolean boolean5 = managementTeamMember3.validatePassword();
        managementTeamMember3.enableParkingSpace();
        managementTeamMember3.disableParkingSpace();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        user.Faculty faculty3 = new user.Faculty("hi!", "", "Visitor");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "SuperManager", "Student", "adminPass");
        boolean boolean5 = userConcrete4.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        superManager0.generateManagementAccount("Student", "SuperManager", "Student");
        superManager0.register();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "SuperManager", "adminPass", "hi!");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        boolean boolean6 = managementTeamMember3.login("SuperManager", "Student");
        boolean boolean7 = managementTeamMember3.validatePassword();
        managementTeamMember3.verifyLicencePlate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Student", "adminPass");
        managementTeamMember3.verifyLicencePlate();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.disableParkingLot();
        boolean boolean10 = managementTeamMember8.validatePassword();
        managementTeamMember3.rejectUser((user.User) managementTeamMember8);
        java.lang.String str12 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = clientUserFactory0.createUser("", "Visitor", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        superManager0.processManualInput("Faculty");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "adminPass" + "'", str11, "adminPass");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        user.Visitor visitor3 = new user.Visitor("Student", "adminPass", "hi!");
        java.lang.String str4 = visitor3.getPassword();
        visitor3.register();
        java.lang.String str6 = visitor3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        superManager0.enableParkingLot();
        superManager0.generateManagementAccount("Management Team", "", "Visitor");
        superManager0.verifyLicencePlate();
        superManager0.addParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        boolean boolean21 = managementTeamMember12.validateEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Management Team" + "'", str17, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.generateManagementAccount("hi!", "hi!", "adminPass");
        boolean boolean5 = superManager0.validatePassword();
        java.lang.String str6 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "adminPass" + "'", str6, "adminPass");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getPassword();
        boolean boolean11 = managementTeamMember3.validatePassword();
        managementTeamMember3.processManualInput("Management Team");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        boolean boolean9 = managementTeamMember3.validateEmail();
        managementTeamMember3.addParkingLot();
        java.lang.String str11 = managementTeamMember3.getEmail();
        managementTeamMember3.receiveError("Visitor");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        managementTeamMember13.processManualInput("Management Team");
        managementTeamMember13.disableParkingLot();
        managementTeamMember13.receiveError("hi!");
        org.junit.Assert.assertNotNull(superManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "adminPass" + "'", str8, "adminPass");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        java.lang.String str11 = managementTeamMember8.getPassword();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        managementTeamMember3.register();
        managementTeamMember3.register();
        java.lang.String str15 = managementTeamMember3.getUserType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Management Team" + "'", str15, "Management Team");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        boolean boolean25 = managementTeamMember3.login("adminPass", "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        user.Visitor visitor3 = new user.Visitor("Visitor", "Management Team", "adminPass");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "Student", "adminPass");
        managementTeamMember3.verifyLicencePlate();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.disableParkingLot();
        boolean boolean10 = managementTeamMember8.validatePassword();
        managementTeamMember3.rejectUser((user.User) managementTeamMember8);
        managementTeamMember8.receiveError("Management Team");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        user.ClientUserFactory clientUserFactory0 = new user.ClientUserFactory();
        user.User user5 = clientUserFactory0.createUser("Visitor", "", "adminPass", "Management Team");
        user.User user10 = clientUserFactory0.createUser("Visitor", "Student", "Management Team", "SuperManager");
        // The following exception was thrown during execution in test generation
        try {
            user.User user15 = clientUserFactory0.createUser("", "", "Visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        superManager0.disableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adminPass" + "'", str3, "adminPass");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Management Team" + "'", str15, "Management Team");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.enableParkingSpace();
        superManager0.enableParkingSpace();
        boolean boolean3 = superManager0.validateEmail();
        boolean boolean4 = superManager0.validatePassword();
        superManager0.disableParkingLot();
        superManager0.register();
        superManager0.disableParkingLot();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        boolean boolean4 = managementTeamMember3.validateEmail();
        boolean boolean5 = managementTeamMember3.validatePassword();
        boolean boolean8 = managementTeamMember3.login("adminPass", "adminPass");
        boolean boolean9 = managementTeamMember3.validatePassword();
        java.lang.String str10 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getUserType();
        java.lang.String str11 = managementTeamMember3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Management Team" + "'", str10, "Management Team");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        user.Faculty faculty3 = new user.Faculty("adminPass", "Student", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        user.UserAbstractFactory userAbstractFactory1 = user.FactoryProducer.getFactory(false);
        user.User user6 = userAbstractFactory1.createUser("Management Team", "Student", "adminPass", "Student");
        user.User user11 = userAbstractFactory1.createUser("Management Team", "", "SuperManager", "Management Team");
        user.User user16 = userAbstractFactory1.createUser("Management Team", "", "SuperManager", "Student");
        // The following exception was thrown during execution in test generation
        try {
            user.User user21 = userAbstractFactory1.createUser("SuperManager", "Student", "Management Team", "SuperManager");
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        java.lang.String str6 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        managementTeamMember3.enableParkingLot();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getEmail();
        user.ManagementTeamMember managementTeamMember14 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str15 = managementTeamMember14.getUsername();
        managementTeamMember14.receiveError("");
        managementTeamMember14.receiveError("SuperManager");
        boolean boolean22 = managementTeamMember14.login("hi!", "");
        boolean boolean23 = managementTeamMember14.validateEmail();
        java.lang.String str24 = managementTeamMember14.getEmail();
        managementTeamMember3.rejectUser((user.User) managementTeamMember14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        boolean boolean46 = managementTeamMember37.validatePassword();
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean10 = managementTeamMember3.login("Student", "");
        managementTeamMember3.receiveError("Student");
        boolean boolean15 = managementTeamMember3.login("adminPass", "");
        java.lang.Class<?> wildcardClass16 = managementTeamMember3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        user.UserConcrete userConcrete4 = new user.UserConcrete("", "Student", "Management Team", "");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        user.Faculty faculty3 = new user.Faculty("Visitor", "Student", "SuperManager");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.ManagementTeamMember managementTeamMember8 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember8.processManualInput("");
        managementTeamMember8.addParkingLot();
        managementTeamMember3.approveUser((user.User) managementTeamMember8);
        managementTeamMember8.processManualInput("Management Team");
        user.ManagementTeamMember managementTeamMember18 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str19 = managementTeamMember18.getUsername();
        managementTeamMember18.receiveError("");
        managementTeamMember18.receiveError("SuperManager");
        managementTeamMember8.rejectUser((user.User) managementTeamMember18);
        java.lang.String str25 = managementTeamMember18.getUserType();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Management Team" + "'", str25, "Management Team");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        user.UserConcrete userConcrete4 = new user.UserConcrete("Visitor", "SuperManager", "", "Visitor");
        boolean boolean5 = userConcrete4.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("SuperManager", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SuperManager" + "'", str4, "SuperManager");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("", "hi!", "");
        managementTeamMember3.verifyLicencePlate();
        boolean boolean5 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.login("Management Team", "adminPass");
        java.lang.String str9 = managementTeamMember3.getPassword();
        managementTeamMember3.verifyLicencePlate();
        java.lang.String str11 = managementTeamMember3.getEmail();
        java.lang.Class<?> wildcardClass12 = managementTeamMember3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "17) test0480(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        java.lang.String str5 = managementTeamMember3.getPassword();
        java.lang.String str6 = managementTeamMember3.getEmail();
        boolean boolean7 = managementTeamMember3.validateEmail();
        boolean boolean8 = managementTeamMember3.validateEmail();
        java.lang.Class<?> wildcardClass9 = managementTeamMember3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("Student", "Management Team", "adminPass");
        managementTeamMember3.register();
        boolean boolean7 = managementTeamMember3.login("Visitor", "Visitor");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        user.Faculty faculty3 = new user.Faculty("SuperManager", "Student", "");
        java.lang.String str4 = faculty3.getPassword();
        java.lang.String str5 = faculty3.getUserType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        managementTeamMember13.processManualInput("Management Team");
        boolean boolean30 = managementTeamMember13.login("Faculty", "adminPass");
        org.junit.Assert.assertNotNull(superManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "adminPass" + "'", str8, "adminPass");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        user.Visitor visitor3 = new user.Visitor("", "", "hi!");
        java.lang.String str4 = visitor3.getEmail();
        boolean boolean5 = visitor3.validatePassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.processManualInput("");
        managementTeamMember3.addParkingLot();
        boolean boolean7 = managementTeamMember3.validatePassword();
        java.lang.String str8 = managementTeamMember3.getUserType();
        boolean boolean9 = managementTeamMember3.validateEmail();
        java.lang.String str10 = managementTeamMember3.getUserType();
        boolean boolean11 = managementTeamMember3.validatePassword();
        managementTeamMember3.addParkingLot();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Management Team" + "'", str8, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Management Team" + "'", str10, "Management Team");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        java.lang.String str4 = managementTeamMember3.getUsername();
        boolean boolean5 = managementTeamMember3.validatePassword();
        java.lang.Class<?> wildcardClass6 = managementTeamMember3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        user.Student student3 = new user.Student("hi!", "", "");
        student3.register();
        boolean boolean7 = student3.login("Management Team", "Management Team");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        user.UserConcrete userConcrete4 = new user.UserConcrete("adminPass", "adminPass", "Management Team", "Management Team");
        java.lang.String str5 = userConcrete4.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "adminPass" + "'", str5, "adminPass");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        java.lang.String str13 = managementTeamMember3.getPassword();
        managementTeamMember3.disableParkingLot();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        user.Faculty faculty3 = new user.Faculty("hi!", "adminPass", "Visitor");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        user.Visitor visitor3 = new user.Visitor("Student", "adminPass", "hi!");
        java.lang.String str4 = visitor3.getPassword();
        java.lang.Class<?> wildcardClass5 = visitor3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        user.ManagementUserFactory managementUserFactory0 = new user.ManagementUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            user.User user5 = managementUserFactory0.createUser("", "adminPass", "", "Visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid management user type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        boolean boolean7 = managementTeamMember3.login("", "");
        boolean boolean10 = managementTeamMember3.login("Student", "");
        managementTeamMember3.receiveError("Student");
        boolean boolean15 = managementTeamMember3.login("adminPass", "");
        managementTeamMember3.verifyLicencePlate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        user.SuperManager superManager0 = user.SuperManager.getInstance();
        superManager0.register();
        superManager0.enableParkingSpace();
        java.lang.String str3 = superManager0.getUsername();
        boolean boolean4 = superManager0.validatePassword();
        boolean boolean5 = superManager0.validateEmail();
        superManager0.disableParkingLot();
        superManager0.verifyLicencePlate();
        java.lang.String str8 = superManager0.getPassword();
        superManager0.generateManagementAccount("hi!", "Visitor", "Student");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager" + "'", str3, "SuperManager");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "adminPass" + "'", str8, "adminPass");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        user.Student student3 = new user.Student("hi!", "SuperManager", "SuperManager");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("adminPass", "SuperManager", "SuperManager");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        user.ManagementTeamMember managementTeamMember3 = new user.ManagementTeamMember("hi!", "hi!", "");
        managementTeamMember3.disableParkingLot();
        user.Visitor visitor8 = new user.Visitor("", "hi!", "");
        boolean boolean11 = visitor8.login("SuperManager", "hi!");
        managementTeamMember3.rejectUser((user.User) visitor8);
        java.lang.String str13 = managementTeamMember3.getUserType();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Management Team" + "'", str13, "Management Team");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        user.Visitor visitor3 = new user.Visitor("", "SuperManager", "Visitor");
        java.lang.String str4 = visitor3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Visitor" + "'", str4, "Visitor");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        managementTeamMember13.addParkingLot();
        org.junit.Assert.assertNotNull(superManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "adminPass" + "'", str8, "adminPass");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }
}
