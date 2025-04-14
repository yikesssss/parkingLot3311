package parking;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Path;
import java.util.*;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import database.*;
import payment.*;
import user.*;


class UserDatabasePaymentTest {

	@BeforeEach
 	void resetDatabaseSingleton() {
 		try {
 			Database.resetInstance(); // This ensures isolation of singleton
 		} catch (Exception e) {
 
 		}
 	}
 
 
 		@Test
 		void testRegisterNewUser() {
 
 			Path testCsv = createTestCsv("users_test_" + UUID.randomUUID() + ".csv",
 					"email,username,password,userType\n");// CVS setup
 			UserConcrete.csvPath = testCsv.toString();
 
 			UserConcrete user = new UserConcrete("alice@example.com", "Alice", "pass123", "Visitor");
 			user.register();
 
 
 			Database db = Database.getInstance(testCsv.toString());
 			// Both assertions check if user was actually added to the database
 			assertEquals(1, db.users.size());
 			assertTrue(db.users.get(0) instanceof UserConcrete);
 
 			cleanupTestCsv(testCsv);
 		}
 
 		@Test
 		void testRegisterDuplicateEmail() {
 			Path testCsv = createTestCsv("users_test_" + UUID.randomUUID() + ".csv",
 					"email,username,password,userType\n" + "bob@example.com,Bob,abc123,Regular\n");
 			UserConcrete.csvPath = testCsv.toString();
 
 			UserConcrete user = new UserConcrete("bob@example.com", "Bob2", "zzz999", "Visitor"); // Attempts to
 																									// register anther
 																									// email with the
 																									// same email that
 																									// // exist in the
 																									// database
 			user.register();
 
 
 			Database db = Database.getInstance(testCsv.toString());
 			assertEquals(1, db.users.size());
 
 			cleanupTestCsv(testCsv);
 		}
 
 		@Test
 		void testLoginSuccess() {
 			Path testCsv = createTestCsv("users_test_" + UUID.randomUUID() + ".csv",
 					"email,username,password,userType\n" + "jane@example.com,Jane,secret,Admin\n");
 			UserConcrete.csvPath = testCsv.toString();
 
 			UserConcrete user = new UserConcrete("jane@example.com", "Jane", "secret", "Faculty");
 			boolean result = user.login("jane@example.com", "secret");
 			assertTrue(result, "Login should succeed with correct email/password.");
 
 			cleanupTestCsv(testCsv);
 		}
 
 		@Test
 		void testLoginFailure() {
 			Path testCsv = createTestCsv("users_test_" + UUID.randomUUID() + ".csv",
 					"email,username,password,userType\n" + "jane@example.com,JaneFinch,Lamalama2.0,Faculty\n");
 			UserConcrete.csvPath = testCsv.toString();
 
 			UserConcrete user = new UserConcrete("jane@example.com", "JaneFinch", "Lamalama2.0", "Faculty");
 			boolean result = user.login("jane@example.com", "Lamalama3.8"); // Failed login because password wrong
 
 			assertFalse(result, "Login should fail for invalid credentials.");
 
 			cleanupTestCsv(testCsv);
 		}
 
 		@Test
 		void testValidateEmail() {
 			UserConcrete user = new UserConcrete("fatimagmail.com", "Fatima", "lingo321", "Visitor");
 			assertFalse(user.validateEmail(), "Should fail because 'fatimagmail.com' is missing '@'.");
 
 			UserConcrete user2 = new UserConcrete("fatima@gmail.com", "Fatima", "lingo321", "Visitor");
 			assertTrue(user2.validateEmail(), "Passes since email has correct format");
 		}
 
 		@Test
 		void testValidatePassword() {
 			UserConcrete user = new UserConcrete("Yohan@hotmail.com", "YohanU", "crab2", "Student");
 			assertFalse(user.validatePassword(), "Password too short, must be >=6 chars.");
 
 			UserConcrete user2 = new UserConcrete("Yohan@hotmail.com", "YohanU", "crab231", "Student");
 			assertTrue(user2.validatePassword());
 		}
 
 		@Test
 		void testGetters() {
 			UserConcrete user = new UserConcrete("fatiha@gmail.com", "Fatiha", "Lima734", "Faculty");
 			assertEquals("fatiha@gmail.com", user.getEmail());
 			assertEquals("Lima734", user.getPassword());
 			assertEquals("Faculty", user.getUserType());
 			assertEquals("Fatiha", user.getUsername());
 		}
 
 
 
 		@Test
 		void testMultipleRegisters() {
 			Path testCsv = createTestCsv("users_test_" + UUID.randomUUID() + ".csv",
 					"email,username,password,userType\n");
 			UserConcrete.csvPath = testCsv.toString();
 
 			UserConcrete user1 = new UserConcrete("mikeLenor@gmail.com", "Mikey", "lizard453", "Visitor");
 			UserConcrete user2 = new UserConcrete("saraharon@hotmail.com", "SaraH", "birdy746", "Faculty");
 			user1.register();
 			user2.register();
 
 			Database db = Database.getInstance(testCsv.toString());
 			assertEquals(2, db.users.size());
 
 			cleanupTestCsv(testCsv);
 		}
 
 		@Test
 		void testRegisterThenLogin() {
 			Path testCsv = createTestCsv("users_test_" + UUID.randomUUID() + ".csv",
 					"email,username,password,userType\n");
 			UserConcrete.csvPath = testCsv.toString();
 
 			UserConcrete user = new UserConcrete("alexRider@example.com", "AlexR", "M16agent", "Visitor");
 			user.register();
 
 			assertTrue(user.login("alexRider@example.com", "M16agent"), "Should login successfully after registering.");
 
 			cleanupTestCsv(testCsv);
 		}
 
 
 		@Test
 		void testVisitorInstantiation() {
 			Visitor v = new Visitor("fatimaY@ulook.com", "Fatyma", "KuzkooGroove23");
 			assertEquals("Visitor", v.getUserType());
 			assertEquals("fatimaY@ulook.com", v.getEmail());
 		}
 
 		@Test
 		void testVisitorRegisterAndLogin() {
 			Path testCsv = createTestCsv("visitor_test_" + UUID.randomUUID() + ".csv",
 					"email,username,password,userType\n");
 			UserConcrete.csvPath = testCsv.toString();
 
 			Visitor v = new Visitor("fatimaY@ulook.com", "Fatyma", "KuzkooGroove23");
 			v.register();
 
 			assertTrue(v.login("fatimaY@ulook.com", "KuzkooGroove23"));
 
 			cleanupTestCsv(testCsv);
 		}
 
 
 		@Test
 		void testStudentBasics() {
 			Student s = new Student("nalaK@hotmail.com", "Nalkamir", "studio241");
 			assertEquals("Student", s.getUserType());
 			assertEquals("nalaK@hotmail.com", s.getEmail());
 		}
 
 		@Test
 		void testStudentRegister() {
 			Path testCsv = createTestCsv("student_test_" + UUID.randomUUID() + ".csv",
 					"email,username,password,userType\n");
 			UserConcrete.csvPath = testCsv.toString();
 
 			Student s = new Student("nalaK@hotmail.com", "Nalkamir", "studio241");
 			s.register();
 
 			Database db = Database.getInstance(testCsv.toString());
 			assertEquals(1, db.users.size());
 
 			cleanupTestCsv(testCsv);
 		}
 
 
 		@Test
 		void testFacultyInstantiation() {
 			Faculty f = new Faculty("random@gmail.com", "Rando", "2718dinner");
 			assertEquals("Faculty", f.getUserType());
 			assertEquals("random@gmail.com", f.getEmail());
 		}
 
 		@Test
 		void testFacultyRegisterAndLogin() {
 			Path testCsv = createTestCsv("faculty_test_" + UUID.randomUUID() + ".csv",
 					"email,username,password,userType\n");
 			UserConcrete.csvPath = testCsv.toString();
 
 			Faculty f = new Faculty("random@gmail.com", "Rando", "2718dinner");
 			f.register();
 
 			assertTrue(f.login("random@gmail.com", "2718dinner"));
 
 			cleanupTestCsv(testCsv);
 		}
 
 
 		@Test
 		void testManagementTeamMemberCreate() {
 			ManagementTeamMember mtm = new ManagementTeamMember("Karen@hotmail.com", "Kerlla", "LoveMyJob32");
 			assertEquals("Management Team", mtm.getUserType());
 		}
 
 		@Test
 		void testApproveUser() {
 			ManagementTeamMember mtm = new ManagementTeamMember("Karen@hotmail.com", "Kerlla", "LoveMyJob32");
 			UserConcrete user = new UserConcrete("u@ex.com", "UserX", "pass", "Regular");
 			// We just verify calling the method doesn't crash
 			mtm.approveUser(user);
 		}
 
 		@Test
 		void testRejectUser() {
 			ManagementTeamMember mtm = new ManagementTeamMember("Karen@hotmail.com", "Kerlla", "LoveMyJob32");
 			UserConcrete user = new UserConcrete("YasirM@hotmail.com", "YasirM", "FootballIs323", "Student");
 			mtm.rejectUser(user);
 		}
 
 		@Test
 		void testEnableDisableParkingLot() {
 			ManagementTeamMember mtm = new ManagementTeamMember("Karen@hotmail.com", "Kerlla", "LoveMyJob32");
 			mtm.enableParkingLot();
 			mtm.disableParkingLot();
 		}
 
 		@Test
 		void testProcessManualInput() {
 			ManagementTeamMember mtm = new ManagementTeamMember("Karen@hotmail.com", "Kerlla", "LoveMyJob32");
 			mtm.processManualInput("Manual override");
 		}
 
 
 
 		@Test
 		void testSuperManagerSingleton() {
 			SuperManager s1 = SuperManager.getInstance();
 			SuperManager s2 = SuperManager.getInstance();
 			assertSame(s1, s2, "SuperManager should be a singleton.");
 		}
 
 		@Test
 		void testGenerateManagementAccount() {
 			Path testCsv = createTestCsv("supermanager_test_" + UUID.randomUUID() + ".csv",
 					"email,username,password,userType\n");
 
 			Database.resetInstance();
 			Database db = Database.getInstance("users.csv");
 
 
 			SuperManager sm = SuperManager.getInstance();
 			sm.generateManagementAccount("CruellaD@hotmail.com", "DevilleCruella", "FurCoatsLover43");
 
 			assertTrue(db.users.stream().anyMatch(u -> u.getEmail().equals("CruellaD@hotmail.com")),
 					"Should contain the new manager user.");
 
 			cleanupTestCsv(testCsv);
 		}
 
 		@Test
 		void testSuperManagerDefaults() {
 			SuperManager sm = SuperManager.getInstance();
 			assertEquals("supermanager@example.com", sm.getEmail());
 			assertEquals("adminPass", sm.getPassword());
 			assertEquals("SuperManager", sm.getUsername());
 		}
 
 		@Test
 		void testReInitSingleton() throws Exception {
 			SuperManager s1 = SuperManager.getInstance();
 			Field f = SuperManager.class.getDeclaredField("instance");
 			f.setAccessible(true);
 			f.set(null, null);
 
 			SuperManager s2 = SuperManager.getInstance();
 			assertNotSame(s1, s2, "After reflection reset, we should get a new instance.");
 		}
 
 		@Test
 		void testGenerateMultipleManagers() {
 			SuperManager sm = SuperManager.getInstance();
 			sm.generateManagementAccount("Lilian12@hotmail.com", "Lilyana", "minney23");
 			sm.generateManagementAccount("Beruite23@gmail.com", "Beru", "lebanon34");
 
 		}
 
 
 
 		@Test
 		void testCreateManagementTeamUser() {
 			ManagementUserFactory factory = new ManagementUserFactory();
 			User user = factory.createUser("Management Team", "Hanvir@ex.com", "Hanny", "Bahubali23");
 			assertTrue(user instanceof ManagementTeamMember);
 			assertEquals("Management Team", ((ManagementTeamMember) user).getUserType());
 		}
 
 		@Test
 		void testCreateSuperManager() {
 			ManagementUserFactory factory = new ManagementUserFactory();
 			User user = factory.createUser("Super Manager", "Hanvir@ex.com", "Hanny", "Bahubali23");
 			assertTrue(user instanceof SuperManager, "Should get the singleton SuperManager object.");
 		}
 
 		@Test
 		void testCreateInvalidType() {
 			ManagementUserFactory factory = new ManagementUserFactory();
 			assertThrows(IllegalArgumentException.class,
 					() -> factory.createUser("Faculty", "AndrewVelo@gmail.com", "Andy", "parrotsSing32"));
 		}
 
 		@Test
 		void testCreateAndRegisterManager() {
 			ManagementUserFactory factory = new ManagementUserFactory();
 			User manager = factory.createUser("Management Team", "Hanvir@ex.com", "Hanny", "Bahubali23");
 			manager.register();
 
 		}
 
 		@Test
 		void testCreateAndLoginSuperManager() {
 			ManagementUserFactory factory = new ManagementUserFactory();
 			User sm = factory.createUser("Super Manager", "Hanvir@ex.com", "Hanny", "Bahubali23");
 
 			boolean result = sm.login("Hanvir@ex.com", "Bahubali23");
 
 			assertFalse(result, "We didn't actually store supermanager in CSV yet, so might fail real login. It's ok.");
 		}
 
 
 	private Path createTestCsv(String filename, String content) {
 		Path p = Paths.get(filename);
 		try (BufferedWriter writer = Files.newBufferedWriter(p)) {
 			writer.write(content);
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
 		return p;
 	}
 
 	private void cleanupTestCsv(Path p) {
 		try {
 			Files.deleteIfExists(p);
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
 	}
 
 	@Test
 	void testClientUserFactoryCreatesStudent() {
 		ClientUserFactory factory = new ClientUserFactory();
 		User user = factory.createUser("Student", "Hurem@outlook.com", "HurremNM", "Turkeiya32");
 		assertTrue(user instanceof Student);
 		assertEquals("Hurem@outlook.com", user.getEmail());
 	}
 
 	@Test
 	void testClientUserFactoryCreatesFaculty() {
 		ClientUserFactory factory = new ClientUserFactory();
 		User user = factory.createUser("Faculty", "Hurem@outlook.com", "HurremNM", "Turkeiya32");
 		assertTrue(user instanceof Faculty);
 		assertEquals("Hurem@outlook.com", user.getEmail());
 	}
 
 	@Test
 	void testClientUserFactoryCreatesVisitor() {
 		ClientUserFactory factory = new ClientUserFactory();
 		User user = factory.createUser("Visitor", "Hurem@outlook.com", "HurremNM", "Turkeiya32");
 		assertTrue(user instanceof Visitor);
 		assertEquals("Hurem@outlook.com", user.getEmail());
 	}
 
 	@Test
 	void testClientUserFactoryCreatesInvalidType() {
 		ClientUserFactory factory = new ClientUserFactory();
 		assertThrows(IllegalArgumentException.class,
 				() -> factory.createUser("Delivery", "Hurem@outlook.com", "HurremNM", "Turkeiya32"));
 	}
 
 	@Test
 	void testCreditCardAdapterNoArgConstructor() {
 
 		CreditCardAdapter adapter = new CreditCardAdapter();
 		boolean result = adapter.processTransaction("TXN3462783", 10.0, "Credit");
 		assertTrue(result, "Should return true by default.");
 
 		adapter.paymentConfirmation("TXN3462783");
 		adapter.paymentFailure("ERR313");
 		boolean refunded = adapter.refundRequest("TXN2892313");
 		assertTrue(refunded, "Default refundRequest is true.");
 
 		adapter.notifyRefundIssued("TXN2892313");
 	}
 
 	@Test
 	void testCreditCardPaymentRealMethod() {
 
 		CreditCardPayment payment = new CreditCardPayment();
 		payment.payWithCredit("TXN100", 50.0);
 
 	}
 
 	@Test
 	void testDatabaseSingletonConstructorAndUsage() {
 
 
 		DatabaseSingleton singleton = DatabaseSingleton.getInstance();
 		assertNotNull(singleton, "Should have created a new DatabaseSingleton instance.");
 
 		ParkingSpot spot = new ParkingSpot(77, "RowZ", "LotZ");
 		singleton.saveParkingSpot(spot);
 
 		ParkingSpot fetched = singleton.getParkingSpot(77);
 		assertNotNull(fetched, "Should fetch the saved spot from CSV (assuming it's appended).");
 		assertEquals(77, fetched.getId());
 		assertEquals("RowZ", fetched.getLocation());
 		assertEquals("LotZ", fetched.getParkingLot());
 	}
 
 
 
 	@Test
 	void testPayPalAdapterNoArgConstructor() {
 		PayPalAdapter adapter = new PayPalAdapter();
 		assertNotNull(adapter.payPalPayment, "payPalPayment should be initialized in the constructor.");
 
 		boolean result = adapter.processTransaction("PP-TXN12", 20.0, "PayPal");
 		assertTrue(result, "Default processTransaction returns true.");
 
 		adapter.paymentConfirmation("PP-TXN59");
 		adapter.paymentFailure("ERR-313");
 		boolean refund = adapter.refundRequest("PP-TXN43");
 		assertTrue(refund, "refundRequest should return true by default.");
 		adapter.notifyRefundIssued("PP-TXN43");
 	}
 
 	@Test
 	void testPayPalPaymentMethod() {
 		PayPalPayment payment = new PayPalPayment();
 		payment.payWithPaypal("PP-TXN21", 35.0);
 	}
 
 	@Test
 	void testPayPalPaymentZeroNegative() {
 		PayPalPayment payment = new PayPalPayment();
 		payment.payWithPaypal("PP-Zero", 0.0);
 		payment.payWithPaypal("PP-Neg", -50.0);
 
 	}
 
 	@Test
 	void testPayWithPaypalNegativeOutput() {
 		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
 		System.setOut(new PrintStream(outContent));
 
 		try {
 			PayPalPayment payment = new PayPalPayment();
 			payment.payWithPaypal("PP-TXN21", -50.0);
 
 			String printed = outContent.toString().trim();
 			assertTrue(printed.contains("Cannot Process PayPal payment: PP-TXN21"),
 					"Output should indicate amount is negative");
 
 		} finally {
 			// just required to complete the try block
 		}
 	}
 
 
 
 	@Test
 	void testFactoryProducerClientFactory() {
 		UserAbstractFactory factory = FactoryProducer.getFactory(true);
 		assertTrue(factory instanceof ClientUserFactory, "Should return a ClientUserFactory when isClient=true.");
 	}
 
 	@Test
 	void testFactoryProducerManagementFactory() {
 		UserAbstractFactory factory = FactoryProducer.getFactory(false);
 		assertTrue(factory instanceof ManagementUserFactory,
 				"Should return a ManagementUserFactory when isClient=false.");
 	}
 
 
 	@Test
 	void testDebitCardPaymentBasic() {
 		DebitCardPayment payment = new DebitCardPayment();
 		payment.payWithDebit("DC-TXN34", 15.0);
 
 	}
 
 	@Test
 	void testDebitCardPaymentZeroNegative() {
 		DebitCardPayment payment = new DebitCardPayment();
 		payment.payWithDebit("DC-Zero", 0.0);
 		payment.payWithDebit("DC-Neg", -25.0);
 
 	}
 
 
 	@Test
 	void testDebitCardAdapterNoArgConstructor() {
 		DebitCardAdapter adapter = new DebitCardAdapter();
 		assertNotNull(adapter.debitCardPayment, "debitCardPayment should be initialized.");
 
 		boolean result = adapter.processTransaction("DC-TXN45", 20.0, "Debit");
 		assertTrue(result, "Default processTransaction returns true.");
 
 		adapter.paymentConfirmation("DC-TXN45");
 		adapter.paymentFailure("ERR313");
 		boolean refund = adapter.refundRequest("DC-REFUND");
 		assertTrue(refund, "refundRequest should return true by default.");
 		adapter.notifyRefundIssued("DC-REFUND");
 	}
 
 	@Test
 	void testDebitCardAdapterZeroNegativeTransaction() {
 		DebitCardAdapter adapter = new DebitCardAdapter();
 		assertTrue(adapter.processTransaction("DC-Zero", 0.0, "Debit"));
 		assertTrue(adapter.processTransaction("DC-Neg", -1.0, "Debit"));
 	}
 
 	private static class MockGateway implements PaymentGateway {
 		private final boolean shouldSucceed;
 
 		public MockGateway(boolean shouldSucceed) {
 			this.shouldSucceed = shouldSucceed;
 		}
 
 		@Override
 		public boolean processTransaction(String transactionID, double amount, String paymentType) {
 			return shouldSucceed;
 		}
 
 		@Override
 		public String paymentConfirmation(String transactionID) {
			return null;
 
 		}
 
 		@Override
 		public String paymentFailure(String errorCode) {
			return null;
 
 		}
 
 		@Override
 		public boolean refundRequest(String transactionID) {
 			return false;
 		}
 
 		@Override
 		public String notifyRefundIssued(String transactionID) {
			return null;
 
 		}
 	}
 
 
 	@Test
 	void testGetPaymentGatewayCreditCard() {
 		PaymentGateway gateway = PaymentProcessor.getPaymentGateway("CreditCard");
 		assertTrue(gateway instanceof CreditCardAdapter, "Should return a CreditCardAdapter for 'CreditCard'");
 	}
 
 	@Test
 	void testGetPaymentGatewayDebitCard() {
 		PaymentGateway gateway = PaymentProcessor.getPaymentGateway("DebitCard");
 		assertTrue(gateway instanceof DebitCardAdapter, "Should return a DebitCardAdapter for 'DebitCard'");
 	}
 
 	@Test
 	void testGetPaymentGatewayPayPal() {
 		PaymentGateway gateway = PaymentProcessor.getPaymentGateway("PayPal");
 		assertTrue(gateway instanceof PayPalAdapter, "Should return a PayPalAdapter for 'PayPal'");
 	}
 
 	@Test
 	void testGetPaymentGatewayInvalid() {
 		assertThrows(IllegalArgumentException.class, () -> PaymentProcessor.getPaymentGateway("ApplePay"),
 				"Should throw exception for unrecognized payment type");
 	}
 
 
 	@Test
 	void testProcessPaymentByTypeCreditCardSuccess() {
 		PaymentProcessor processor = new PaymentProcessor();
 		boolean result = processor.processPayment("CreditCard", "TXN14", 10.0);
 		assertTrue(result, "Should succeed with a standard credit card adapter");
 	}
 
 	@Test
 	void testProcessPaymentByTypeDebitCardSuccess() {
 		PaymentProcessor processor = new PaymentProcessor();
 		boolean result = processor.processPayment("DebitCard", "TXN25", 50.0);
 		assertTrue(result, "Should succeed with a standard debit card adapter");
 	}
 
 	@Test
 	void testProcessPaymentByTypePayPalSuccess() {
 		PaymentProcessor processor = new PaymentProcessor();
 		boolean result = processor.processPayment("PayPal", "TXN13", 5.0);
 		assertTrue(result, "Should succeed with a standard PayPal adapter");
 	}
 
 	@Test
 	void testProcessPaymentByTypeInvalidThrows() {
 		PaymentProcessor processor = new PaymentProcessor();
 		assertThrows(IllegalArgumentException.class, () -> processor.processPayment("ApplePay", "TXN98", 15.0),
 				"Should throw for invalid type");
 	}
 
 
 	@Test
 	void testProcessPaymentWithGatewaySuccess() {
 		PaymentProcessor processor = new PaymentProcessor();
 		PaymentGateway gateway = new MockGateway(true); // always succeed
 		boolean result = processor.processPayment(gateway, "TXN57", 20.0, "AnyCard");
 		assertTrue(result, "Should succeed using a mock gateway that returns true");
 	}
 
 	@Test
 	void testProcessPaymentWithGatewayFailure() {
 		PaymentProcessor processor = new PaymentProcessor();
 		PaymentGateway gateway = new MockGateway(false); // always fail
 		boolean result = processor.processPayment(gateway, "TXN12", 30.0, "AnyCard");
 		assertFalse(result, "Should fail using a mock gateway that returns false");
 	}
 
 	@Test
 	void testProcessPaymentNullGatewayThrows() {
 		PaymentProcessor processor = new PaymentProcessor();
 		assertThrows(NullPointerException.class,
 				() -> processor.processPayment((PaymentGateway) null, "TXN53", 25.0, "AnyCard"));
 	}

}
