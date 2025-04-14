package rando.payment;
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
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        java.lang.String str2 = creditCardAdapter0.notifyRefundIssued("Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str4 = creditCardAdapter0.notifyRefundIssued("PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str6 = creditCardAdapter0.notifyRefundIssued("Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        boolean boolean10 = creditCardAdapter0.processTransaction("Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ", (double) 0.0f, "PayPal Payment Confirmed: Processing debit card payment:  for amount: -1.0");
        payment.CreditCardAdapter creditCardAdapter11 = new payment.CreditCardAdapter();
        boolean boolean13 = creditCardAdapter11.refundRequest("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean17 = creditCardAdapter11.processTransaction("Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) 10.0f, "Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        java.lang.String str19 = creditCardAdapter11.notifyRefundIssued("PayPal Payment Failed: Error ");
        java.lang.String str21 = creditCardAdapter11.notifyRefundIssued("Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        payment.CreditCardPayment creditCardPayment22 = creditCardAdapter11.creditCardPayment;
        creditCardAdapter0.creditCardPayment = creditCardPayment22;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str2, "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str4, "Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str6, "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Refund Issued for Credit Card Transaction: PayPal Payment Failed: Error " + "'", str19, "Refund Issued for Credit Card Transaction: PayPal Payment Failed: Error ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str21, "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertNotNull(creditCardPayment22);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        payment.DebitCardAdapter debitCardAdapter0 = new payment.DebitCardAdapter();
        boolean boolean2 = debitCardAdapter0.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str4 = debitCardAdapter0.paymentConfirmation("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean8 = debitCardAdapter0.processTransaction("PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", (double) (-1L), "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        java.lang.String str10 = debitCardAdapter0.paymentFailure("Processing debit card payment:  for amount: -1.0");
        payment.DebitCardPayment debitCardPayment11 = debitCardAdapter0.debitCardPayment;
        boolean boolean15 = debitCardAdapter0.processTransaction("Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!", (double) 1, "Refund Issued for Credit Card Transaction: ");
        payment.DebitCardAdapter debitCardAdapter16 = new payment.DebitCardAdapter();
        boolean boolean18 = debitCardAdapter16.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str20 = debitCardAdapter16.paymentConfirmation("hi!");
        java.lang.String str22 = debitCardAdapter16.notifyRefundIssued("");
        boolean boolean24 = debitCardAdapter16.refundRequest("Debit Card Payment Confirmed: hi!");
        boolean boolean26 = debitCardAdapter16.refundRequest("Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!");
        payment.DebitCardPayment debitCardPayment27 = new payment.DebitCardPayment();
        java.lang.String str30 = debitCardPayment27.payWithDebit("Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!", (double) (byte) 0);
        debitCardAdapter16.debitCardPayment = debitCardPayment27;
        java.lang.String str34 = debitCardPayment27.payWithDebit("PayPal Payment Failed: Error Credit Card Payment Confirmed: PayPal Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!", (double) 100.0f);
        debitCardAdapter0.debitCardPayment = debitCardPayment27;
        java.lang.String str38 = debitCardPayment27.payWithDebit("Refund Issued for PayPal Transaction: PayPal Payment Confirmed: Credit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error ", (double) 100L);
        java.lang.String str41 = debitCardPayment27.payWithDebit("Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ", (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str4, "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0" + "'", str10, "Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        org.junit.Assert.assertNotNull(debitCardPayment11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card Payment Confirmed: hi!" + "'", str20, "Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Refund Issued for Debit Card Transaction: " + "'", str22, "Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0" + "'", str30, "Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Processing debit card payment: PayPal Payment Failed: Error Credit Card Payment Confirmed: PayPal Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 100.0" + "'", str34, "Processing debit card payment: PayPal Payment Failed: Error Credit Card Payment Confirmed: PayPal Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 100.0");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Processing debit card payment: Refund Issued for PayPal Transaction: PayPal Payment Confirmed: Credit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 100.0" + "'", str38, "Processing debit card payment: Refund Issued for PayPal Transaction: PayPal Payment Confirmed: Credit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 100.0");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Processing debit card payment: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction:  for amount: 1.0" + "'", str41, "Processing debit card payment: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction:  for amount: 1.0");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        boolean boolean4 = creditCardAdapter0.processTransaction("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) (byte) 1, "Refund Issued for Credit Card Transaction: ");
        java.lang.String str6 = creditCardAdapter0.paymentConfirmation("Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str8 = creditCardAdapter0.paymentFailure("PayPal Payment Failed: Error Processing PayPal payment: Refund Issued for Debit Card Transaction: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 100.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str6, "Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Failed: Error Processing PayPal payment: Refund Issued for Debit Card Transaction: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 100.0" + "'", str8, "Credit Card Payment Failed: Error PayPal Payment Failed: Error Processing PayPal payment: Refund Issued for Debit Card Transaction: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 100.0");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        payment.PayPalAdapter payPalAdapter0 = new payment.PayPalAdapter();
        java.lang.String str2 = payPalAdapter0.notifyRefundIssued("hi!");
        java.lang.String str4 = payPalAdapter0.paymentConfirmation("hi!");
        payment.PayPalPayment payPalPayment5 = payPalAdapter0.payPalPayment;
        java.lang.String str7 = payPalAdapter0.notifyRefundIssued("Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        boolean boolean9 = payPalAdapter0.refundRequest("Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        boolean boolean11 = payPalAdapter0.refundRequest("Refund Issued for Debit Card Transaction: Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        boolean boolean13 = payPalAdapter0.refundRequest("Refund Issued for Credit Card Transaction: Processing PayPal payment: Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi! for amount: 1.0");
        java.lang.String str15 = payPalAdapter0.notifyRefundIssued("Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        java.lang.String str17 = payPalAdapter0.paymentConfirmation("Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        boolean boolean21 = payPalAdapter0.processTransaction("", (double) (-1L), "Refund Issued for PayPal Transaction: Refund Issued for Credit Card Transaction: PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refund Issued for PayPal Transaction: hi!" + "'", str2, "Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal Payment Confirmed: hi!" + "'", str4, "PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertNotNull(payPalPayment5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str7, "Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: " + "'", str15, "Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PayPal Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str17, "PayPal Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        boolean boolean2 = creditCardAdapter0.refundRequest("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean6 = creditCardAdapter0.processTransaction("Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) 10.0f, "Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        boolean boolean10 = creditCardAdapter0.processTransaction("PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", (double) 'a', "PayPal Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error ");
        java.lang.String str12 = creditCardAdapter0.notifyRefundIssued("Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        java.lang.String str14 = creditCardAdapter0.paymentConfirmation("Processing PayPal payment: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 10.0");
        java.lang.String str16 = creditCardAdapter0.paymentConfirmation("Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: ");
        boolean boolean20 = creditCardAdapter0.processTransaction("Credit Card Payment Confirmed: Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", (double) 10, "Refund Issued for Debit Card Transaction: Processing debit card payment: Processing PayPal payment: PayPal Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction:  for amount: 97.0 for amount: 10.0");
        payment.CreditCardPayment creditCardPayment21 = creditCardAdapter0.creditCardPayment;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Refund Issued for Credit Card Transaction: Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error PayPal Payment Failed: Error " + "'", str12, "Refund Issued for Credit Card Transaction: Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card Payment Confirmed: Processing PayPal payment: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 10.0" + "'", str14, "Credit Card Payment Confirmed: Processing PayPal payment: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card Payment Confirmed: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: " + "'", str16, "Credit Card Payment Confirmed: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(creditCardPayment21);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        java.lang.String str2 = creditCardAdapter0.notifyRefundIssued("Refund Issued for Credit Card Transaction: ");
        payment.PaymentProcessor paymentProcessor3 = new payment.PaymentProcessor();
        payment.CreditCardAdapter creditCardAdapter4 = new payment.CreditCardAdapter();
        java.lang.String str6 = creditCardAdapter4.paymentFailure("PayPal Payment Failed: Error ");
        boolean boolean10 = paymentProcessor3.processPayment((payment.PaymentGateway) creditCardAdapter4, "PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", 10.0d, "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        payment.CreditCardPayment creditCardPayment11 = creditCardAdapter4.creditCardPayment;
        creditCardPayment11.payWithCredit("PayPal Payment Confirmed: Credit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error ", (double) (-1L));
        creditCardAdapter0.creditCardPayment = creditCardPayment11;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: " + "'", str2, "Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Failed: Error " + "'", str6, "Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(creditCardPayment11);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        boolean boolean4 = creditCardAdapter0.processTransaction("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) (byte) 1, "Refund Issued for Credit Card Transaction: ");
        payment.CreditCardPayment creditCardPayment5 = creditCardAdapter0.creditCardPayment;
        boolean boolean9 = creditCardAdapter0.processTransaction("Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!", (double) 100, "PayPal Payment Confirmed: Credit Card Payment Failed: Error ");
        payment.CreditCardAdapter creditCardAdapter10 = new payment.CreditCardAdapter();
        boolean boolean14 = creditCardAdapter10.processTransaction("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) (byte) 1, "Refund Issued for Credit Card Transaction: ");
        payment.CreditCardPayment creditCardPayment15 = creditCardAdapter10.creditCardPayment;
        creditCardAdapter0.creditCardPayment = creditCardPayment15;
        java.lang.Class<?> wildcardClass17 = creditCardPayment15.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(creditCardPayment5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(creditCardPayment15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        payment.PaymentProcessor paymentProcessor0 = new payment.PaymentProcessor();
        payment.PayPalAdapter payPalAdapter1 = new payment.PayPalAdapter();
        java.lang.String str3 = payPalAdapter1.notifyRefundIssued("hi!");
        java.lang.String str5 = payPalAdapter1.paymentFailure("");
        boolean boolean9 = paymentProcessor0.processPayment((payment.PaymentGateway) payPalAdapter1, "Credit Card Payment Failed: Error Processing PayPal payment: Refund Issued for Debit Card Transaction:  for amount: 10.0", (double) 0L, "Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!");
        java.lang.String str11 = payPalAdapter1.notifyRefundIssued("Refund Issued for Debit Card Transaction: Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0");
        payment.PayPalAdapter payPalAdapter12 = new payment.PayPalAdapter();
        boolean boolean16 = payPalAdapter12.processTransaction("Refund Issued for PayPal Transaction: hi!", 1.0d, "");
        boolean boolean18 = payPalAdapter12.refundRequest("Debit Card Payment Confirmed: hi!");
        payment.PayPalPayment payPalPayment19 = payPalAdapter12.payPalPayment;
        java.lang.String str22 = payPalPayment19.payWithPaypal("Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!", (double) 1.0f);
        java.lang.String str25 = payPalPayment19.payWithPaypal("PayPal Payment Failed: Error Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0", 0.0d);
        payPalAdapter1.payPalPayment = payPalPayment19;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Refund Issued for PayPal Transaction: hi!" + "'", str3, "Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal Payment Failed: Error " + "'", str5, "PayPal Payment Failed: Error ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0" + "'", str11, "Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(payPalPayment19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing PayPal payment: Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi! for amount: 1.0" + "'", str22, "Processing PayPal payment: Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi! for amount: 1.0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cannot Process PayPal payment: PayPal Payment Failed: Error Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0 for amount: 0.0because amont negative" + "'", str25, "Cannot Process PayPal payment: PayPal Payment Failed: Error Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0 for amount: 0.0because amont negative");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        payment.DebitCardAdapter debitCardAdapter0 = new payment.DebitCardAdapter();
        boolean boolean2 = debitCardAdapter0.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str4 = debitCardAdapter0.paymentConfirmation("hi!");
        java.lang.String str6 = debitCardAdapter0.notifyRefundIssued("");
        boolean boolean8 = debitCardAdapter0.refundRequest("Debit Card Payment Confirmed: hi!");
        boolean boolean10 = debitCardAdapter0.refundRequest("Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!");
        java.lang.String str12 = debitCardAdapter0.notifyRefundIssued("Credit Card Payment Failed: Error Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        payment.DebitCardPayment debitCardPayment13 = debitCardAdapter0.debitCardPayment;
        java.lang.String str15 = debitCardAdapter0.paymentConfirmation("Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card Payment Confirmed: hi!" + "'", str4, "Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Refund Issued for Debit Card Transaction: " + "'", str6, "Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str12, "Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertNotNull(debitCardPayment13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: " + "'", str15, "Debit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: ");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        payment.PayPalAdapter payPalAdapter0 = new payment.PayPalAdapter();
        java.lang.String str2 = payPalAdapter0.notifyRefundIssued("hi!");
        boolean boolean6 = payPalAdapter0.processTransaction("", (double) (byte) 10, "");
        boolean boolean8 = payPalAdapter0.refundRequest("PayPal Payment Confirmed: hi!");
        java.lang.String str10 = payPalAdapter0.paymentFailure("Processing debit card payment:  for amount: -1.0");
        boolean boolean12 = payPalAdapter0.refundRequest("Credit Card Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        java.lang.String str14 = payPalAdapter0.paymentConfirmation("Credit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str16 = payPalAdapter0.paymentConfirmation("Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refund Issued for PayPal Transaction: hi!" + "'", str2, "Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0" + "'", str10, "PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PayPal Payment Confirmed: Credit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str14, "PayPal Payment Confirmed: Credit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PayPal Payment Confirmed: Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str16, "PayPal Payment Confirmed: Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        payment.DebitCardAdapter debitCardAdapter0 = new payment.DebitCardAdapter();
        boolean boolean2 = debitCardAdapter0.refundRequest("Refund Issued for PayPal Transaction: hi!");
        payment.DebitCardPayment debitCardPayment3 = debitCardAdapter0.debitCardPayment;
        java.lang.String str5 = debitCardAdapter0.paymentFailure("Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        boolean boolean7 = debitCardAdapter0.refundRequest("Cannot Process PayPal payment: PayPal Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction:  for amount: -1.0because amont negative");
        boolean boolean11 = debitCardAdapter0.processTransaction("Refund Issued for PayPal Transaction: hi!", (double) 10, "Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        java.lang.String str13 = debitCardAdapter0.paymentFailure("Processing debit card payment: Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: 35.0");
        boolean boolean15 = debitCardAdapter0.refundRequest("Credit Card Payment Failed: Error PayPal Payment Confirmed: Processing debit card payment:  for amount: -1.0");
        payment.DebitCardPayment debitCardPayment16 = debitCardAdapter0.debitCardPayment;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(debitCardPayment3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str5, "Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Debit Card Payment Failed: Error Processing debit card payment: Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: 35.0" + "'", str13, "Debit Card Payment Failed: Error Processing debit card payment: Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: 35.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(debitCardPayment16);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        boolean boolean2 = creditCardAdapter0.refundRequest("Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!");
        java.lang.String str4 = creditCardAdapter0.notifyRefundIssued("");
        boolean boolean6 = creditCardAdapter0.refundRequest("");
        java.lang.String str8 = creditCardAdapter0.notifyRefundIssued("Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!");
        boolean boolean12 = creditCardAdapter0.processTransaction("Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!", (double) (short) 0, "Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        boolean boolean16 = creditCardAdapter0.processTransaction("Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0", (double) 0.0f, "PayPal Payment Confirmed: PayPal Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        payment.CreditCardAdapter creditCardAdapter17 = new payment.CreditCardAdapter();
        boolean boolean21 = creditCardAdapter17.processTransaction("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) (byte) 1, "Refund Issued for Credit Card Transaction: ");
        payment.CreditCardPayment creditCardPayment22 = creditCardAdapter17.creditCardPayment;
        boolean boolean26 = creditCardAdapter17.processTransaction("Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!", (double) 100, "PayPal Payment Confirmed: Credit Card Payment Failed: Error ");
        payment.CreditCardAdapter creditCardAdapter27 = new payment.CreditCardAdapter();
        boolean boolean31 = creditCardAdapter27.processTransaction("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) (byte) 1, "Refund Issued for Credit Card Transaction: ");
        payment.CreditCardPayment creditCardPayment32 = creditCardAdapter27.creditCardPayment;
        creditCardAdapter17.creditCardPayment = creditCardPayment32;
        payment.CreditCardAdapter creditCardAdapter34 = new payment.CreditCardAdapter();
        boolean boolean38 = creditCardAdapter34.processTransaction("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) (byte) 1, "Refund Issued for Credit Card Transaction: ");
        payment.CreditCardPayment creditCardPayment39 = creditCardAdapter34.creditCardPayment;
        boolean boolean43 = creditCardAdapter34.processTransaction("Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!", (double) 100, "PayPal Payment Confirmed: Credit Card Payment Failed: Error ");
        payment.CreditCardAdapter creditCardAdapter44 = new payment.CreditCardAdapter();
        boolean boolean48 = creditCardAdapter44.processTransaction("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) (byte) 1, "Refund Issued for Credit Card Transaction: ");
        payment.CreditCardPayment creditCardPayment49 = creditCardAdapter44.creditCardPayment;
        creditCardAdapter34.creditCardPayment = creditCardPayment49;
        creditCardAdapter17.creditCardPayment = creditCardPayment49;
        creditCardAdapter0.creditCardPayment = creditCardPayment49;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Refund Issued for Credit Card Transaction: " + "'", str4, "Refund Issued for Credit Card Transaction: ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!" + "'", str8, "Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(creditCardPayment22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(creditCardPayment32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(creditCardPayment39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(creditCardPayment49);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        java.lang.String str2 = creditCardAdapter0.paymentFailure("PayPal Payment Failed: Error ");
        java.lang.String str4 = creditCardAdapter0.notifyRefundIssued("Debit Card Payment Confirmed: hi!");
        java.lang.String str6 = creditCardAdapter0.paymentFailure("Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean8 = creditCardAdapter0.refundRequest("Credit Card Payment Confirmed: PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        boolean boolean12 = creditCardAdapter0.processTransaction("PayPal Payment Failed: Error Processing PayPal payment: Refund Issued for Debit Card Transaction: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 100.0", (double) (short) 1, "Credit Card Payment Failed: Error ");
        boolean boolean14 = creditCardAdapter0.refundRequest("Refund Issued for Debit Card Transaction: Credit Card Payment Confirmed: Credit Card Payment Failed: Error ");
        boolean boolean16 = creditCardAdapter0.refundRequest("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Failed: Error " + "'", str2, "Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!" + "'", str4, "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str6, "Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        payment.DebitCardAdapter debitCardAdapter0 = new payment.DebitCardAdapter();
        boolean boolean4 = debitCardAdapter0.processTransaction("PayPal Payment Failed: Error ", (double) 100L, "PayPal Payment Confirmed: hi!");
        java.lang.String str6 = debitCardAdapter0.paymentFailure("PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        boolean boolean10 = debitCardAdapter0.processTransaction("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", 10.0d, "Debit Card Payment Confirmed: PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean12 = debitCardAdapter0.refundRequest("Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        payment.DebitCardPayment debitCardPayment13 = debitCardAdapter0.debitCardPayment;
        java.lang.String str15 = debitCardAdapter0.notifyRefundIssued("Debit Card Payment Confirmed: PayPal Payment Failed: Error Credit Card Payment Confirmed: PayPal Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str6, "Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(debitCardPayment13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Credit Card Payment Confirmed: PayPal Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str15, "Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Credit Card Payment Confirmed: PayPal Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        payment.PayPalAdapter payPalAdapter0 = new payment.PayPalAdapter();
        boolean boolean4 = payPalAdapter0.processTransaction("Refund Issued for PayPal Transaction: hi!", 1.0d, "");
        boolean boolean8 = payPalAdapter0.processTransaction("Refund Issued for PayPal Transaction: hi!", (double) (short) 10, "PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str10 = payPalAdapter0.paymentFailure("Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error ");
        boolean boolean14 = payPalAdapter0.processTransaction("PayPal Payment Confirmed: Processing debit card payment: Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error PayPal Payment Failed: Error  for amount: 100.0", (double) (short) 100, "Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        boolean boolean18 = payPalAdapter0.processTransaction("PayPal Payment Failed: Error PayPal Payment Failed: Error Credit Card Payment Confirmed: Processing debit card payment: PayPal Payment Confirmed: Processing PayPal payment: Refund Issued for Debit Card Transaction:  for amount: 10.0 for amount: 0.0", (double) 0L, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error " + "'", str10, "PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        payment.PaymentProcessor paymentProcessor0 = new payment.PaymentProcessor();
        payment.DebitCardAdapter debitCardAdapter1 = new payment.DebitCardAdapter();
        boolean boolean3 = debitCardAdapter1.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str5 = debitCardAdapter1.paymentConfirmation("hi!");
        java.lang.String str7 = debitCardAdapter1.notifyRefundIssued("");
        java.lang.String str9 = debitCardAdapter1.paymentConfirmation("Refund Issued for Credit Card Transaction: ");
        java.lang.String str11 = debitCardAdapter1.notifyRefundIssued("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean15 = paymentProcessor0.processPayment((payment.PaymentGateway) debitCardAdapter1, "Refund Issued for Credit Card Transaction: PayPal Payment Failed: Error ", (double) 'a', "Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0");
        payment.DebitCardAdapter debitCardAdapter16 = new payment.DebitCardAdapter();
        boolean boolean18 = debitCardAdapter16.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str20 = debitCardAdapter16.paymentFailure("PayPal Payment Confirmed: hi!");
        java.lang.String str22 = debitCardAdapter16.notifyRefundIssued("Refund Issued for PayPal Transaction: ");
        java.lang.String str24 = debitCardAdapter16.notifyRefundIssued("Debit Card Payment Failed: Error Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        boolean boolean28 = debitCardAdapter16.processTransaction("Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0", (double) 1L, "Refund Issued for PayPal Transaction: hi!");
        java.lang.String str30 = debitCardAdapter16.notifyRefundIssued("Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean34 = paymentProcessor0.processPayment((payment.PaymentGateway) debitCardAdapter16, "Processing debit card payment: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 0.0", (double) 'a', "Processing debit card payment: Credit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0 for amount: 100.0");
        paymentProcessor0.reset();
        paymentProcessor0.reset();
        paymentProcessor0.reset();
        payment.PaymentProcessor paymentProcessor38 = new payment.PaymentProcessor();
        payment.CreditCardAdapter creditCardAdapter39 = new payment.CreditCardAdapter();
        java.lang.String str41 = creditCardAdapter39.paymentFailure("PayPal Payment Failed: Error ");
        boolean boolean45 = paymentProcessor38.processPayment((payment.PaymentGateway) creditCardAdapter39, "PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", 10.0d, "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str47 = creditCardAdapter39.paymentConfirmation("PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error ");
        java.lang.String str49 = creditCardAdapter39.paymentConfirmation("PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        boolean boolean53 = paymentProcessor0.processPayment((payment.PaymentGateway) creditCardAdapter39, "Refund Issued for Debit Card Transaction: Processing PayPal payment: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 10.0", (double) (byte) 0, "PayPal Payment Confirmed: Processing debit card payment:  for amount: -1.0");
        payment.CreditCardAdapter creditCardAdapter54 = new payment.CreditCardAdapter();
        java.lang.String str56 = creditCardAdapter54.paymentConfirmation("Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: ");
        payment.CreditCardPayment creditCardPayment57 = new payment.CreditCardPayment();
        creditCardAdapter54.creditCardPayment = creditCardPayment57;
        creditCardPayment57.payWithCredit("Processing debit card payment:  for amount: -1.0", (double) 0.0f);
        creditCardPayment57.payWithCredit("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) 1.0f);
        creditCardPayment57.payWithCredit("Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!", (double) 100L);
        creditCardPayment57.payWithCredit("Refund Issued for PayPal Transaction: Processing debit card payment:  for amount: -1.0", (double) '#');
        creditCardAdapter39.creditCardPayment = creditCardPayment57;
        boolean boolean73 = creditCardAdapter39.refundRequest("Processing debit card payment: Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi! for amount: -1.0");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card Payment Confirmed: hi!" + "'", str5, "Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Refund Issued for Debit Card Transaction: " + "'", str7, "Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: " + "'", str9, "Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str11, "Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str20, "Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: " + "'", str22, "Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Refund Issued for Debit Card Transaction: Debit Card Payment Failed: Error Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: " + "'", str24, "Refund Issued for Debit Card Transaction: Debit Card Payment Failed: Error Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str30, "Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Failed: Error " + "'", str41, "Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Credit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error " + "'", str47, "Credit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error ");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Credit Card Payment Confirmed: PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0" + "'", str49, "Credit Card Payment Confirmed: PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: " + "'", str56, "Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: ");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        payment.PayPalAdapter payPalAdapter0 = new payment.PayPalAdapter();
        java.lang.String str2 = payPalAdapter0.notifyRefundIssued("hi!");
        boolean boolean6 = payPalAdapter0.processTransaction("", (double) (byte) 10, "");
        boolean boolean8 = payPalAdapter0.refundRequest("PayPal Payment Confirmed: hi!");
        java.lang.String str10 = payPalAdapter0.paymentConfirmation("PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str12 = payPalAdapter0.notifyRefundIssued("PayPal Payment Failed: Error Credit Card Payment Failed: Error Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        payment.PayPalAdapter payPalAdapter13 = new payment.PayPalAdapter();
        java.lang.String str15 = payPalAdapter13.notifyRefundIssued("hi!");
        boolean boolean19 = payPalAdapter13.processTransaction("", (double) (byte) 10, "");
        boolean boolean21 = payPalAdapter13.refundRequest("PayPal Payment Confirmed: hi!");
        payment.PayPalAdapter payPalAdapter22 = new payment.PayPalAdapter();
        java.lang.String str24 = payPalAdapter22.notifyRefundIssued("hi!");
        java.lang.String str26 = payPalAdapter22.paymentConfirmation("hi!");
        payment.PayPalPayment payPalPayment27 = payPalAdapter22.payPalPayment;
        java.lang.String str30 = payPalPayment27.payWithPaypal("PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", (double) 10.0f);
        java.lang.String str33 = payPalPayment27.payWithPaypal("Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0", 0.0d);
        payPalAdapter13.payPalPayment = payPalPayment27;
        payPalAdapter0.payPalPayment = payPalPayment27;
        java.lang.String str37 = payPalAdapter0.paymentFailure("Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        boolean boolean39 = payPalAdapter0.refundRequest("Processing PayPal payment: Refund Issued for Debit Card Transaction: Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0 for amount: 52.0");
        boolean boolean41 = payPalAdapter0.refundRequest("Refund Issued for Debit Card Transaction: Credit Card Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.Class<?> wildcardClass42 = payPalAdapter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refund Issued for PayPal Transaction: hi!" + "'", str2, "Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str10, "PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Refund Issued for PayPal Transaction: PayPal Payment Failed: Error Credit Card Payment Failed: Error Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str12, "Refund Issued for PayPal Transaction: PayPal Payment Failed: Error Credit Card Payment Failed: Error Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Refund Issued for PayPal Transaction: hi!" + "'", str15, "Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Refund Issued for PayPal Transaction: hi!" + "'", str24, "Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PayPal Payment Confirmed: hi!" + "'", str26, "PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertNotNull(payPalPayment27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Processing PayPal payment: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 10.0" + "'", str30, "Processing PayPal payment: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 10.0");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cannot Process PayPal payment: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0 for amount: 0.0because amont negative" + "'", str33, "Cannot Process PayPal payment: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0 for amount: 0.0because amont negative");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str37, "PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        payment.DebitCardAdapter debitCardAdapter0 = new payment.DebitCardAdapter();
        boolean boolean2 = debitCardAdapter0.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str4 = debitCardAdapter0.paymentConfirmation("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean8 = debitCardAdapter0.processTransaction("PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", (double) (-1L), "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        java.lang.String str10 = debitCardAdapter0.paymentFailure("Processing debit card payment:  for amount: -1.0");
        payment.DebitCardPayment debitCardPayment11 = debitCardAdapter0.debitCardPayment;
        payment.DebitCardPayment debitCardPayment12 = debitCardAdapter0.debitCardPayment;
        java.lang.String str14 = debitCardAdapter0.paymentFailure("Credit Card Payment Failed: Error Credit Card Payment Confirmed: Debit Card Payment Confirmed: Debit Card Payment Failed: Error Cannot Process PayPal payment: Processing PayPal payment: PayPal Payment Confirmed: Refund Issued for Debit Card Transaction:  for amount: 10.0 for amount: 0.0because amont negative");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str4, "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0" + "'", str10, "Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        org.junit.Assert.assertNotNull(debitCardPayment11);
        org.junit.Assert.assertNotNull(debitCardPayment12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card Payment Failed: Error Credit Card Payment Failed: Error Credit Card Payment Confirmed: Debit Card Payment Confirmed: Debit Card Payment Failed: Error Cannot Process PayPal payment: Processing PayPal payment: PayPal Payment Confirmed: Refund Issued for Debit Card Transaction:  for amount: 10.0 for amount: 0.0because amont negative" + "'", str14, "Debit Card Payment Failed: Error Credit Card Payment Failed: Error Credit Card Payment Confirmed: Debit Card Payment Confirmed: Debit Card Payment Failed: Error Cannot Process PayPal payment: Processing PayPal payment: PayPal Payment Confirmed: Refund Issued for Debit Card Transaction:  for amount: 10.0 for amount: 0.0because amont negative");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        payment.PayPalAdapter payPalAdapter0 = new payment.PayPalAdapter();
        boolean boolean4 = payPalAdapter0.processTransaction("Refund Issued for PayPal Transaction: hi!", 1.0d, "");
        boolean boolean6 = payPalAdapter0.refundRequest("Debit Card Payment Confirmed: hi!");
        payment.PayPalPayment payPalPayment7 = payPalAdapter0.payPalPayment;
        boolean boolean9 = payPalAdapter0.refundRequest("Cannot Process PayPal payment: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0 for amount: 0.0because amont negative");
        java.lang.String str11 = payPalAdapter0.notifyRefundIssued("Debit Card Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: Refund Issued for Debit Card Transaction: Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(payPalPayment7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: Refund Issued for Debit Card Transaction: Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str11, "Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: Refund Issued for Debit Card Transaction: Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        payment.PaymentProcessor paymentProcessor0 = new payment.PaymentProcessor();
        payment.DebitCardAdapter debitCardAdapter1 = new payment.DebitCardAdapter();
        boolean boolean3 = debitCardAdapter1.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str5 = debitCardAdapter1.paymentConfirmation("hi!");
        java.lang.String str7 = debitCardAdapter1.notifyRefundIssued("");
        java.lang.String str9 = debitCardAdapter1.paymentConfirmation("Refund Issued for Credit Card Transaction: ");
        java.lang.String str11 = debitCardAdapter1.notifyRefundIssued("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean15 = paymentProcessor0.processPayment((payment.PaymentGateway) debitCardAdapter1, "Refund Issued for Credit Card Transaction: PayPal Payment Failed: Error ", (double) 'a', "Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0");
        payment.DebitCardAdapter debitCardAdapter16 = new payment.DebitCardAdapter();
        boolean boolean18 = debitCardAdapter16.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str20 = debitCardAdapter16.paymentConfirmation("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean24 = debitCardAdapter16.processTransaction("PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", (double) (-1L), "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        java.lang.String str26 = debitCardAdapter16.paymentFailure("Processing debit card payment:  for amount: -1.0");
        boolean boolean28 = debitCardAdapter16.refundRequest("Credit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        java.lang.String str30 = debitCardAdapter16.notifyRefundIssued("Credit Card Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        boolean boolean34 = paymentProcessor0.processPayment((payment.PaymentGateway) debitCardAdapter16, "PayPal Payment Confirmed: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!", (double) (short) 1, "Cannot Process PayPal payment: Credit Card Payment Confirmed: Credit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction:  for amount: -1.0because amont negative");
        boolean boolean36 = debitCardAdapter16.refundRequest("Debit Card Payment Failed: Error PayPal Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Debit Card Payment Confirmed: hi!" + "'", str5, "Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Refund Issued for Debit Card Transaction: " + "'", str7, "Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: " + "'", str9, "Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str11, "Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str20, "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0" + "'", str26, "Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Refund Issued for Debit Card Transaction: Credit Card Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str30, "Refund Issued for Debit Card Transaction: Credit Card Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        payment.PayPalAdapter payPalAdapter0 = new payment.PayPalAdapter();
        java.lang.String str2 = payPalAdapter0.notifyRefundIssued("hi!");
        java.lang.String str4 = payPalAdapter0.paymentConfirmation("hi!");
        payment.PayPalPayment payPalPayment5 = payPalAdapter0.payPalPayment;
        java.lang.String str7 = payPalAdapter0.notifyRefundIssued("Debit Card Payment Confirmed: hi!");
        java.lang.String str9 = payPalAdapter0.notifyRefundIssued("Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        boolean boolean13 = payPalAdapter0.processTransaction("Processing PayPal payment: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 10.0", 1.0d, "PayPal Payment Failed: Error Credit Card Payment Confirmed: PayPal Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str15 = payPalAdapter0.paymentConfirmation("Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!");
        boolean boolean19 = payPalAdapter0.processTransaction("Credit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!", (double) '4', "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        java.lang.String str21 = payPalAdapter0.paymentFailure("Processing PayPal payment: Refund Issued for Debit Card Transaction: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 100.0");
        boolean boolean23 = payPalAdapter0.refundRequest("Credit Card Payment Failed: Error Processing debit card payment: Refund Issued for Debit Card Transaction:  for amount: -1.0");
        boolean boolean25 = payPalAdapter0.refundRequest("PayPal Payment Confirmed: Credit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refund Issued for PayPal Transaction: hi!" + "'", str2, "Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal Payment Confirmed: hi!" + "'", str4, "PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertNotNull(payPalPayment5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!" + "'", str7, "Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Refund Issued for PayPal Transaction: Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str9, "Refund Issued for PayPal Transaction: Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PayPal Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!" + "'", str15, "PayPal Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PayPal Payment Failed: Error Processing PayPal payment: Refund Issued for Debit Card Transaction: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 100.0" + "'", str21, "PayPal Payment Failed: Error Processing PayPal payment: Refund Issued for Debit Card Transaction: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 100.0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        java.lang.String str2 = creditCardAdapter0.paymentFailure("PayPal Payment Failed: Error ");
        java.lang.String str4 = creditCardAdapter0.notifyRefundIssued("Debit Card Payment Confirmed: hi!");
        payment.CreditCardPayment creditCardPayment5 = creditCardAdapter0.creditCardPayment;
        java.lang.String str7 = creditCardAdapter0.paymentFailure("Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error ");
        boolean boolean11 = creditCardAdapter0.processTransaction("Debit Card Payment Failed: Error PayPal Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!", 0.0d, "Processing debit card payment: Refund Issued for PayPal Transaction: PayPal Payment Confirmed: Credit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 100.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Failed: Error " + "'", str2, "Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!" + "'", str4, "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertNotNull(creditCardPayment5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Credit Card Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error " + "'", str7, "Credit Card Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        java.lang.String str2 = creditCardAdapter0.paymentConfirmation("Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: ");
        payment.CreditCardPayment creditCardPayment3 = new payment.CreditCardPayment();
        creditCardAdapter0.creditCardPayment = creditCardPayment3;
        java.lang.String str6 = creditCardAdapter0.paymentConfirmation("Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        payment.CreditCardPayment creditCardPayment7 = null;
        creditCardAdapter0.creditCardPayment = creditCardPayment7;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = creditCardAdapter0.processTransaction("Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error PayPal Payment Failed: Error ", (double) (-1.0f), "PayPal Payment Confirmed: Refund Issued for Credit Card Transaction: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"payment.CreditCardPayment.payWithCredit(String, double)\" because \"this.creditCardPayment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: " + "'", str2, "Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str6, "Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        payment.DebitCardAdapter debitCardAdapter0 = new payment.DebitCardAdapter();
        boolean boolean4 = debitCardAdapter0.processTransaction("PayPal Payment Failed: Error ", (double) 100L, "PayPal Payment Confirmed: hi!");
        boolean boolean6 = debitCardAdapter0.refundRequest("Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!");
        payment.DebitCardPayment debitCardPayment7 = null;
        debitCardAdapter0.debitCardPayment = debitCardPayment7;
        java.lang.String str10 = debitCardAdapter0.notifyRefundIssued("PayPal Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        payment.DebitCardPayment debitCardPayment11 = debitCardAdapter0.debitCardPayment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = debitCardAdapter0.processTransaction("Refund Issued for Credit Card Transaction: Processing debit card payment:  for amount: -1.0", (double) 0, "Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"payment.DebitCardPayment.payWithDebit(String, double)\" because \"this.debitCardPayment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str10, "Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertNull(debitCardPayment11);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        java.lang.String str2 = creditCardAdapter0.paymentFailure("PayPal Payment Failed: Error ");
        java.lang.String str4 = creditCardAdapter0.notifyRefundIssued("Debit Card Payment Confirmed: hi!");
        java.lang.String str6 = creditCardAdapter0.paymentConfirmation("Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!");
        java.lang.String str8 = creditCardAdapter0.notifyRefundIssued("Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str10 = creditCardAdapter0.paymentFailure("Debit Card Payment Failed: Error Processing debit card payment: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 0.0");
        payment.CreditCardAdapter creditCardAdapter11 = new payment.CreditCardAdapter();
        java.lang.String str13 = creditCardAdapter11.paymentConfirmation("Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: ");
        payment.CreditCardPayment creditCardPayment14 = new payment.CreditCardPayment();
        creditCardAdapter11.creditCardPayment = creditCardPayment14;
        creditCardPayment14.payWithCredit("Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0", (double) 1.0f);
        creditCardAdapter0.creditCardPayment = creditCardPayment14;
        creditCardPayment14.payWithCredit("Refund Issued for Credit Card Transaction: Credit Card Payment Confirmed: Credit Card Payment Confirmed: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0", 1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Failed: Error " + "'", str2, "Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!" + "'", str4, "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card Payment Confirmed: Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!" + "'", str6, "Credit Card Payment Confirmed: Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str8, "Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card Payment Failed: Error Debit Card Payment Failed: Error Processing debit card payment: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 0.0" + "'", str10, "Credit Card Payment Failed: Error Debit Card Payment Failed: Error Processing debit card payment: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: " + "'", str13, "Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: ");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        payment.PaymentProcessor paymentProcessor0 = new payment.PaymentProcessor();
        payment.PayPalAdapter payPalAdapter1 = new payment.PayPalAdapter();
        boolean boolean5 = paymentProcessor0.processPayment((payment.PaymentGateway) payPalAdapter1, "PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) '#', "Debit Card Payment Confirmed: hi!");
        paymentProcessor0.reset();
        paymentProcessor0.reset();
        paymentProcessor0.reset();
        paymentProcessor0.reset();
        payment.CreditCardAdapter creditCardAdapter10 = new payment.CreditCardAdapter();
        java.lang.String str12 = creditCardAdapter10.paymentFailure("PayPal Payment Failed: Error ");
        java.lang.String str14 = creditCardAdapter10.notifyRefundIssued("Debit Card Payment Confirmed: hi!");
        java.lang.String str16 = creditCardAdapter10.paymentFailure("Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!");
        java.lang.String str18 = creditCardAdapter10.paymentFailure("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean22 = paymentProcessor0.processPayment((payment.PaymentGateway) creditCardAdapter10, "Processing debit card payment: Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction:  for amount: 100.0", (double) (byte) 0, "Debit Card Payment Confirmed: PayPal Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        payment.CreditCardAdapter creditCardAdapter23 = new payment.CreditCardAdapter();
        java.lang.String str25 = creditCardAdapter23.paymentFailure("PayPal Payment Failed: Error ");
        java.lang.String str27 = creditCardAdapter23.notifyRefundIssued("Debit Card Payment Confirmed: hi!");
        java.lang.String str29 = creditCardAdapter23.paymentFailure("Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        payment.CreditCardAdapter creditCardAdapter30 = new payment.CreditCardAdapter();
        java.lang.String str32 = creditCardAdapter30.paymentFailure("PayPal Payment Failed: Error ");
        java.lang.String str34 = creditCardAdapter30.notifyRefundIssued("Debit Card Payment Confirmed: hi!");
        java.lang.String str36 = creditCardAdapter30.paymentFailure("Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean38 = creditCardAdapter30.refundRequest("Credit Card Payment Confirmed: PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        payment.CreditCardPayment creditCardPayment39 = creditCardAdapter30.creditCardPayment;
        creditCardAdapter23.creditCardPayment = creditCardPayment39;
        creditCardAdapter10.creditCardPayment = creditCardPayment39;
        boolean boolean45 = creditCardAdapter10.processTransaction("Credit Card Payment Failed: Error Debit Card Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) 0.0f, "Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!");
        payment.CreditCardAdapter creditCardAdapter46 = new payment.CreditCardAdapter();
        boolean boolean48 = creditCardAdapter46.refundRequest("Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!");
        java.lang.String str50 = creditCardAdapter46.notifyRefundIssued("");
        java.lang.String str52 = creditCardAdapter46.notifyRefundIssued("Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        java.lang.String str54 = creditCardAdapter46.paymentConfirmation("Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        boolean boolean56 = creditCardAdapter46.refundRequest("Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        payment.CreditCardPayment creditCardPayment57 = creditCardAdapter46.creditCardPayment;
        java.lang.String str59 = creditCardAdapter46.paymentFailure("PayPal Payment Confirmed: PayPal Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: ");
        java.lang.String str61 = creditCardAdapter46.notifyRefundIssued("Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        payment.CreditCardAdapter creditCardAdapter62 = new payment.CreditCardAdapter();
        boolean boolean64 = creditCardAdapter62.refundRequest("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean68 = creditCardAdapter62.processTransaction("Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) 10.0f, "Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        java.lang.String str70 = creditCardAdapter62.notifyRefundIssued("PayPal Payment Failed: Error ");
        java.lang.String str72 = creditCardAdapter62.notifyRefundIssued("Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        payment.CreditCardPayment creditCardPayment73 = creditCardAdapter62.creditCardPayment;
        creditCardAdapter46.creditCardPayment = creditCardPayment73;
        creditCardAdapter10.creditCardPayment = creditCardPayment73;
        creditCardPayment73.payWithCredit("Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Failed: Error " + "'", str12, "Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!" + "'", str14, "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Credit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!" + "'", str16, "Credit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str18, "Credit Card Payment Failed: Error PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Failed: Error " + "'", str25, "Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!" + "'", str27, "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Credit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str29, "Credit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Failed: Error " + "'", str32, "Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!" + "'", str34, "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str36, "Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(creditCardPayment39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Refund Issued for Credit Card Transaction: " + "'", str50, "Refund Issued for Credit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0" + "'", str52, "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str54, "Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(creditCardPayment57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: " + "'", str59, "Credit Card Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str61, "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Refund Issued for Credit Card Transaction: PayPal Payment Failed: Error " + "'", str70, "Refund Issued for Credit Card Transaction: PayPal Payment Failed: Error ");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str72, "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertNotNull(creditCardPayment73);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        java.lang.String str2 = creditCardAdapter0.paymentFailure("PayPal Payment Failed: Error ");
        java.lang.String str4 = creditCardAdapter0.notifyRefundIssued("Debit Card Payment Confirmed: hi!");
        java.lang.String str6 = creditCardAdapter0.paymentFailure("Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean8 = creditCardAdapter0.refundRequest("Credit Card Payment Confirmed: PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        java.lang.String str10 = creditCardAdapter0.notifyRefundIssued("");
        boolean boolean12 = creditCardAdapter0.refundRequest("Refund Issued for Credit Card Transaction: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!");
        java.lang.String str14 = creditCardAdapter0.paymentConfirmation("Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Processing debit card payment: Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: 35.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Failed: Error " + "'", str2, "Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!" + "'", str4, "Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str6, "Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Refund Issued for Credit Card Transaction: " + "'", str10, "Refund Issued for Credit Card Transaction: ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Credit Card Payment Confirmed: Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Processing debit card payment: Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: 35.0" + "'", str14, "Credit Card Payment Confirmed: Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Processing debit card payment: Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: 35.0");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        boolean boolean2 = creditCardAdapter0.refundRequest("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean6 = creditCardAdapter0.processTransaction("Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) 10.0f, "Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        boolean boolean10 = creditCardAdapter0.processTransaction("Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!", (double) '4', "Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        boolean boolean12 = creditCardAdapter0.refundRequest("PayPal Payment Failed: Error Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0");
        payment.CreditCardPayment creditCardPayment13 = creditCardAdapter0.creditCardPayment;
        payment.CreditCardPayment creditCardPayment14 = creditCardAdapter0.creditCardPayment;
        java.lang.String str16 = creditCardAdapter0.notifyRefundIssued("Credit Card Payment Failed: Error Processing PayPal payment: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 10.0");
        java.lang.String str18 = creditCardAdapter0.paymentConfirmation("Credit Card Payment Confirmed: Cannot Process PayPal payment: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: -1.0because amont negative");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(creditCardPayment13);
        org.junit.Assert.assertNotNull(creditCardPayment14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Refund Issued for Credit Card Transaction: Credit Card Payment Failed: Error Processing PayPal payment: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 10.0" + "'", str16, "Refund Issued for Credit Card Transaction: Credit Card Payment Failed: Error Processing PayPal payment: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Credit Card Payment Confirmed: Credit Card Payment Confirmed: Cannot Process PayPal payment: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: -1.0because amont negative" + "'", str18, "Credit Card Payment Confirmed: Credit Card Payment Confirmed: Cannot Process PayPal payment: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: -1.0because amont negative");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        payment.PayPalAdapter payPalAdapter0 = new payment.PayPalAdapter();
        java.lang.String str2 = payPalAdapter0.notifyRefundIssued("hi!");
        java.lang.String str4 = payPalAdapter0.paymentConfirmation("hi!");
        java.lang.String str6 = payPalAdapter0.notifyRefundIssued("Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!");
        payment.PayPalPayment payPalPayment7 = payPalAdapter0.payPalPayment;
        java.lang.String str10 = payPalPayment7.payWithPaypal("Credit Card Payment Confirmed: Credit Card Payment Confirmed: Cannot Process PayPal payment: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: -1.0because amont negative", (double) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refund Issued for PayPal Transaction: hi!" + "'", str2, "Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal Payment Confirmed: hi!" + "'", str4, "PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!" + "'", str6, "Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertNotNull(payPalPayment7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cannot Process PayPal payment: Credit Card Payment Confirmed: Credit Card Payment Confirmed: Cannot Process PayPal payment: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: -1.0because amont negative for amount: 0.0because amont negative" + "'", str10, "Cannot Process PayPal payment: Credit Card Payment Confirmed: Credit Card Payment Confirmed: Cannot Process PayPal payment: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: -1.0because amont negative for amount: 0.0because amont negative");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        payment.PaymentProcessor paymentProcessor0 = new payment.PaymentProcessor();
        payment.DebitCardAdapter debitCardAdapter1 = new payment.DebitCardAdapter();
        boolean boolean5 = debitCardAdapter1.processTransaction("PayPal Payment Failed: Error ", (double) 100L, "PayPal Payment Confirmed: hi!");
        java.lang.String str7 = debitCardAdapter1.notifyRefundIssued("Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!");
        boolean boolean11 = paymentProcessor0.processPayment((payment.PaymentGateway) debitCardAdapter1, "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", 1.0d, "Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        payment.DebitCardAdapter debitCardAdapter12 = new payment.DebitCardAdapter();
        boolean boolean14 = debitCardAdapter12.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str16 = debitCardAdapter12.paymentConfirmation("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean20 = debitCardAdapter12.processTransaction("Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) 100L, "Refund Issued for Debit Card Transaction: ");
        java.lang.String str22 = debitCardAdapter12.notifyRefundIssued("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean26 = paymentProcessor0.processPayment((payment.PaymentGateway) debitCardAdapter12, "Debit Card Payment Failed: Error PayPal Payment Confirmed: Credit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error ", 0.0d, "Credit Card Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: ");
        payment.CreditCardAdapter creditCardAdapter27 = new payment.CreditCardAdapter();
        java.lang.String str29 = creditCardAdapter27.notifyRefundIssued("Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str31 = creditCardAdapter27.notifyRefundIssued("PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str33 = creditCardAdapter27.notifyRefundIssued("Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        java.lang.String str35 = creditCardAdapter27.notifyRefundIssued("Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!");
        boolean boolean39 = creditCardAdapter27.processTransaction("PayPal Payment Failed: Error ", (double) 100, "Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        boolean boolean43 = paymentProcessor0.processPayment((payment.PaymentGateway) creditCardAdapter27, "Refund Issued for PayPal Transaction: PayPal Payment Failed: Error PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", 0.0d, "PayPal Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        paymentProcessor0.reset();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!" + "'", str7, "Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str16, "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str22, "Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str29, "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str31, "Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str33, "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!" + "'", str35, "Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        boolean boolean2 = creditCardAdapter0.refundRequest("PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        payment.CreditCardPayment creditCardPayment3 = null;
        creditCardAdapter0.creditCardPayment = creditCardPayment3;
        java.lang.String str6 = creditCardAdapter0.paymentFailure("PayPal Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        payment.CreditCardPayment creditCardPayment7 = creditCardAdapter0.creditCardPayment;
        payment.CreditCardPayment creditCardPayment8 = creditCardAdapter0.creditCardPayment;
        java.lang.String str10 = creditCardAdapter0.paymentConfirmation("PayPal Payment Failed: Error Debit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = creditCardAdapter0.processTransaction("Refund Issued for Debit Card Transaction: Processing debit card payment: Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi! for amount: -1.0", 0.0d, "PayPal Payment Confirmed: Debit Card Payment Failed: Error Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"payment.CreditCardPayment.payWithCredit(String, double)\" because \"this.creditCardPayment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str6, "Credit Card Payment Failed: Error PayPal Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertNull(creditCardPayment7);
        org.junit.Assert.assertNull(creditCardPayment8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Credit Card Payment Confirmed: PayPal Payment Failed: Error Debit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!" + "'", str10, "Credit Card Payment Confirmed: PayPal Payment Failed: Error Debit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        payment.PaymentProcessor paymentProcessor0 = new payment.PaymentProcessor();
        payment.PayPalAdapter payPalAdapter1 = new payment.PayPalAdapter();
        java.lang.String str3 = payPalAdapter1.notifyRefundIssued("hi!");
        java.lang.String str5 = payPalAdapter1.paymentFailure("");
        boolean boolean9 = paymentProcessor0.processPayment((payment.PaymentGateway) payPalAdapter1, "Credit Card Payment Failed: Error Processing PayPal payment: Refund Issued for Debit Card Transaction:  for amount: 10.0", (double) 0L, "Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi!");
        paymentProcessor0.reset();
        payment.DebitCardAdapter debitCardAdapter11 = new payment.DebitCardAdapter();
        boolean boolean13 = debitCardAdapter11.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str15 = debitCardAdapter11.paymentConfirmation("hi!");
        java.lang.String str17 = debitCardAdapter11.notifyRefundIssued("");
        java.lang.String str19 = debitCardAdapter11.notifyRefundIssued("Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        payment.DebitCardPayment debitCardPayment20 = debitCardAdapter11.debitCardPayment;
        boolean boolean24 = paymentProcessor0.processPayment((payment.PaymentGateway) debitCardAdapter11, "Refund Issued for Debit Card Transaction: Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0", (-1.0d), "Credit Card Payment Failed: Error ");
        payment.PaymentProcessor paymentProcessor25 = new payment.PaymentProcessor();
        payment.CreditCardAdapter creditCardAdapter26 = new payment.CreditCardAdapter();
        java.lang.String str28 = creditCardAdapter26.paymentFailure("PayPal Payment Failed: Error ");
        boolean boolean32 = paymentProcessor25.processPayment((payment.PaymentGateway) creditCardAdapter26, "PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", 10.0d, "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        payment.CreditCardPayment creditCardPayment33 = creditCardAdapter26.creditCardPayment;
        java.lang.String str35 = creditCardAdapter26.notifyRefundIssued("Refund Issued for PayPal Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str37 = creditCardAdapter26.paymentConfirmation("Processing debit card payment: Refund Issued for Debit Card Transaction:  for amount: -1.0");
        boolean boolean41 = paymentProcessor0.processPayment((payment.PaymentGateway) creditCardAdapter26, "", (double) (short) 0, "PayPal Payment Confirmed: Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        payment.DebitCardAdapter debitCardAdapter42 = new payment.DebitCardAdapter();
        boolean boolean44 = debitCardAdapter42.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str46 = debitCardAdapter42.paymentConfirmation("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean50 = debitCardAdapter42.processTransaction("PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", (double) (-1L), "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        java.lang.String str52 = debitCardAdapter42.paymentFailure("Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: ");
        java.lang.String str54 = debitCardAdapter42.notifyRefundIssued("Credit Card Payment Failed: Error PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        boolean boolean58 = paymentProcessor0.processPayment((payment.PaymentGateway) debitCardAdapter42, "PayPal Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: ", (double) (byte) 10, "Processing PayPal payment: PayPal Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 1.0");
        payment.PayPalAdapter payPalAdapter59 = new payment.PayPalAdapter();
        java.lang.String str61 = payPalAdapter59.notifyRefundIssued("hi!");
        boolean boolean65 = payPalAdapter59.processTransaction("", (double) (byte) 10, "");
        boolean boolean67 = payPalAdapter59.refundRequest("PayPal Payment Confirmed: hi!");
        java.lang.String str69 = payPalAdapter59.paymentConfirmation("PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        boolean boolean73 = payPalAdapter59.processTransaction("Credit Card Payment Failed: Error PayPal Payment Failed: Error ", (double) (short) 0, "PayPal Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        boolean boolean75 = payPalAdapter59.refundRequest("Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        boolean boolean79 = payPalAdapter59.processTransaction("Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ", (-1.0d), "Credit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!");
        boolean boolean83 = paymentProcessor0.processPayment((payment.PaymentGateway) payPalAdapter59, "Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Processing debit card payment: Credit Card Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: 1.0", (double) (short) 0, "Refund Issued for PayPal Transaction: PayPal Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Failed: Error ");
        java.lang.String str85 = payPalAdapter59.paymentFailure("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Refund Issued for PayPal Transaction: hi!" + "'", str3, "Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PayPal Payment Failed: Error " + "'", str5, "PayPal Payment Failed: Error ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card Payment Confirmed: hi!" + "'", str15, "Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Refund Issued for Debit Card Transaction: " + "'", str17, "Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str19, "Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertNotNull(debitCardPayment20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Credit Card Payment Failed: Error PayPal Payment Failed: Error " + "'", str28, "Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(creditCardPayment33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str35, "Refund Issued for Credit Card Transaction: Refund Issued for PayPal Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Credit Card Payment Confirmed: Processing debit card payment: Refund Issued for Debit Card Transaction:  for amount: -1.0" + "'", str37, "Credit Card Payment Confirmed: Processing debit card payment: Refund Issued for Debit Card Transaction:  for amount: -1.0");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str46, "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: " + "'", str52, "Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: ");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0" + "'", str54, "Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Refund Issued for PayPal Transaction: hi!" + "'", str61, "Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str69, "PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "PayPal Payment Failed: Error PayPal Payment Failed: Error Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error PayPal Payment Failed: Error " + "'", str85, "PayPal Payment Failed: Error PayPal Payment Failed: Error Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        payment.PayPalAdapter payPalAdapter0 = new payment.PayPalAdapter();
        boolean boolean4 = payPalAdapter0.processTransaction("Refund Issued for PayPal Transaction: hi!", 1.0d, "");
        boolean boolean8 = payPalAdapter0.processTransaction("Refund Issued for PayPal Transaction: hi!", (double) (short) 10, "PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        boolean boolean10 = payPalAdapter0.refundRequest("Debit Card Payment Failed: Error Credit Card Payment Failed: Error ");
        java.lang.String str12 = payPalAdapter0.notifyRefundIssued("Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: ");
        java.lang.String str14 = payPalAdapter0.notifyRefundIssued("Processing debit card payment: Debit Card Payment Confirmed: PayPal Payment Confirmed: Processing debit card payment: Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi! for amount: -1.0 for amount: 0.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: " + "'", str12, "Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Refund Issued for PayPal Transaction: Processing debit card payment: Debit Card Payment Confirmed: PayPal Payment Confirmed: Processing debit card payment: Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi! for amount: -1.0 for amount: 0.0" + "'", str14, "Refund Issued for PayPal Transaction: Processing debit card payment: Debit Card Payment Confirmed: PayPal Payment Confirmed: Processing debit card payment: Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi! for amount: -1.0 for amount: 0.0");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        payment.DebitCardAdapter debitCardAdapter0 = new payment.DebitCardAdapter();
        boolean boolean2 = debitCardAdapter0.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str4 = debitCardAdapter0.paymentFailure("PayPal Payment Confirmed: hi!");
        java.lang.String str6 = debitCardAdapter0.notifyRefundIssued("Refund Issued for PayPal Transaction: ");
        java.lang.String str8 = debitCardAdapter0.notifyRefundIssued("Debit Card Payment Failed: Error Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        java.lang.String str10 = debitCardAdapter0.paymentFailure("Credit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        payment.DebitCardPayment debitCardPayment11 = debitCardAdapter0.debitCardPayment;
        payment.DebitCardPayment debitCardPayment12 = debitCardAdapter0.debitCardPayment;
        java.lang.String str14 = debitCardAdapter0.paymentConfirmation("Credit Card Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Failed: Error ");
        java.lang.String str16 = debitCardAdapter0.paymentConfirmation("Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        java.lang.String str18 = debitCardAdapter0.paymentFailure("Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str4, "Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: " + "'", str6, "Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Refund Issued for Debit Card Transaction: Debit Card Payment Failed: Error Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: " + "'", str8, "Refund Issued for Debit Card Transaction: Debit Card Payment Failed: Error Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Debit Card Payment Failed: Error Credit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str10, "Debit Card Payment Failed: Error Credit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertNotNull(debitCardPayment11);
        org.junit.Assert.assertNotNull(debitCardPayment12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Debit Card Payment Confirmed: Credit Card Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Failed: Error " + "'", str14, "Debit Card Payment Confirmed: Credit Card Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Failed: Error ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str16, "Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error " + "'", str18, "Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Failed: Error ");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        payment.PayPalAdapter payPalAdapter0 = new payment.PayPalAdapter();
        java.lang.String str2 = payPalAdapter0.notifyRefundIssued("hi!");
        boolean boolean6 = payPalAdapter0.processTransaction("", (double) (byte) 10, "");
        boolean boolean8 = payPalAdapter0.refundRequest("PayPal Payment Confirmed: hi!");
        java.lang.String str10 = payPalAdapter0.paymentFailure("Processing debit card payment:  for amount: -1.0");
        java.lang.String str12 = payPalAdapter0.paymentFailure("Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0");
        boolean boolean14 = payPalAdapter0.refundRequest("PayPal Payment Failed: Error Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        java.lang.String str16 = payPalAdapter0.paymentFailure("PayPal Payment Confirmed: Processing debit card payment:  for amount: -1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refund Issued for PayPal Transaction: hi!" + "'", str2, "Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0" + "'", str10, "PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PayPal Payment Failed: Error Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0" + "'", str12, "PayPal Payment Failed: Error Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PayPal Payment Failed: Error PayPal Payment Confirmed: Processing debit card payment:  for amount: -1.0" + "'", str16, "PayPal Payment Failed: Error PayPal Payment Confirmed: Processing debit card payment:  for amount: -1.0");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        payment.DebitCardAdapter debitCardAdapter0 = new payment.DebitCardAdapter();
        boolean boolean2 = debitCardAdapter0.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str4 = debitCardAdapter0.paymentConfirmation("Refund Issued for PayPal Transaction: hi!");
        payment.DebitCardAdapter debitCardAdapter5 = new payment.DebitCardAdapter();
        boolean boolean7 = debitCardAdapter5.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str9 = debitCardAdapter5.paymentConfirmation("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean13 = debitCardAdapter5.processTransaction("PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", (double) (-1L), "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        java.lang.String str15 = debitCardAdapter5.paymentFailure("Processing debit card payment:  for amount: -1.0");
        payment.DebitCardPayment debitCardPayment16 = debitCardAdapter5.debitCardPayment;
        debitCardAdapter0.debitCardPayment = debitCardPayment16;
        payment.DebitCardAdapter debitCardAdapter18 = new payment.DebitCardAdapter();
        boolean boolean20 = debitCardAdapter18.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str22 = debitCardAdapter18.paymentConfirmation("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean26 = debitCardAdapter18.processTransaction("Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", (double) 100L, "Refund Issued for Debit Card Transaction: ");
        java.lang.String str28 = debitCardAdapter18.notifyRefundIssued("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean30 = debitCardAdapter18.refundRequest("Refund Issued for PayPal Transaction: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        payment.DebitCardAdapter debitCardAdapter31 = new payment.DebitCardAdapter();
        boolean boolean33 = debitCardAdapter31.refundRequest("Refund Issued for PayPal Transaction: hi!");
        payment.DebitCardPayment debitCardPayment34 = debitCardAdapter31.debitCardPayment;
        java.lang.String str36 = debitCardAdapter31.paymentFailure("Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        boolean boolean38 = debitCardAdapter31.refundRequest("Cannot Process PayPal payment: PayPal Payment Confirmed: Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction:  for amount: -1.0because amont negative");
        boolean boolean42 = debitCardAdapter31.processTransaction("Refund Issued for PayPal Transaction: hi!", (double) 10, "Credit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        payment.DebitCardPayment debitCardPayment43 = debitCardAdapter31.debitCardPayment;
        debitCardAdapter18.debitCardPayment = debitCardPayment43;
        payment.DebitCardPayment debitCardPayment45 = debitCardAdapter18.debitCardPayment;
        debitCardAdapter0.debitCardPayment = debitCardPayment45;
        java.lang.String str48 = debitCardAdapter0.paymentConfirmation("");
        boolean boolean52 = debitCardAdapter0.processTransaction("Refund Issued for PayPal Transaction: Credit Card Payment Failed: Error Processing debit card payment: PayPal Payment Confirmed: PayPal Payment Failed: Error  for amount: 10.0", (double) 0L, "Credit Card Payment Confirmed: Debit Card Payment Confirmed: Processing debit card payment: Refund Issued for Debit Card Transaction:  for amount: -1.0");
        java.lang.String str54 = debitCardAdapter0.paymentFailure("Credit Card Payment Confirmed: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: ");
        java.lang.String str56 = debitCardAdapter0.paymentFailure("Refund Issued for Debit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!");
        java.lang.String str58 = debitCardAdapter0.paymentConfirmation("Refund Issued for Credit Card Transaction: Processing PayPal payment: Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi! for amount: 1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!" + "'", str4, "Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str9, "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0" + "'", str15, "Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        org.junit.Assert.assertNotNull(debitCardPayment16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str22, "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str28, "Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(debitCardPayment34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str36, "Debit Card Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(debitCardPayment43);
        org.junit.Assert.assertNotNull(debitCardPayment45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Debit Card Payment Confirmed: " + "'", str48, "Debit Card Payment Confirmed: ");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Debit Card Payment Failed: Error Credit Card Payment Confirmed: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: " + "'", str54, "Debit Card Payment Failed: Error Credit Card Payment Confirmed: Credit Card Payment Confirmed: Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!" + "'", str56, "Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: Processing PayPal payment: Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi! for amount: 1.0" + "'", str58, "Debit Card Payment Confirmed: Refund Issued for Credit Card Transaction: Processing PayPal payment: Credit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: hi! for amount: 1.0");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        payment.DebitCardAdapter debitCardAdapter0 = new payment.DebitCardAdapter();
        boolean boolean2 = debitCardAdapter0.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str4 = debitCardAdapter0.paymentConfirmation("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean8 = debitCardAdapter0.processTransaction("PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", (double) (-1L), "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        java.lang.String str10 = debitCardAdapter0.paymentFailure("Processing debit card payment:  for amount: -1.0");
        payment.DebitCardPayment debitCardPayment11 = new payment.DebitCardPayment();
        debitCardAdapter0.debitCardPayment = debitCardPayment11;
        payment.DebitCardPayment debitCardPayment13 = debitCardAdapter0.debitCardPayment;
        java.lang.String str15 = debitCardAdapter0.paymentConfirmation("Refund Issued for PayPal Transaction: PayPal Payment Failed: Error Credit Card Payment Failed: Error Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        java.lang.String str17 = debitCardAdapter0.notifyRefundIssued("Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        payment.DebitCardPayment debitCardPayment18 = debitCardAdapter0.debitCardPayment;
        java.lang.String str20 = debitCardAdapter0.paymentConfirmation("PayPal Payment Failed: Error Credit Card Payment Failed: Error Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        java.lang.String str22 = debitCardAdapter0.paymentConfirmation("PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        java.lang.String str24 = debitCardAdapter0.notifyRefundIssued("Processing PayPal payment: Refund Issued for Debit Card Transaction: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 100.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str4, "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0" + "'", str10, "Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        org.junit.Assert.assertNotNull(debitCardPayment13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: PayPal Payment Failed: Error Credit Card Payment Failed: Error Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str15, "Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: PayPal Payment Failed: Error Credit Card Payment Failed: Error Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error PayPal Payment Failed: Error " + "'", str17, "Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction: Refund Issued for Debit Card Transaction: Credit Card Payment Failed: Error PayPal Payment Failed: Error ");
        org.junit.Assert.assertNotNull(debitCardPayment18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Debit Card Payment Confirmed: PayPal Payment Failed: Error Credit Card Payment Failed: Error Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str20, "Debit Card Payment Confirmed: PayPal Payment Failed: Error Credit Card Payment Failed: Error Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Debit Card Payment Confirmed: PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0" + "'", str22, "Debit Card Payment Confirmed: PayPal Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Refund Issued for Debit Card Transaction: Processing PayPal payment: Refund Issued for Debit Card Transaction: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 100.0" + "'", str24, "Refund Issued for Debit Card Transaction: Processing PayPal payment: Refund Issued for Debit Card Transaction: Processing PayPal payment: Processing debit card payment: Debit Card Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 0.0 for amount: 10.0 for amount: 100.0");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        payment.DebitCardAdapter debitCardAdapter0 = new payment.DebitCardAdapter();
        boolean boolean4 = debitCardAdapter0.processTransaction("PayPal Payment Failed: Error ", (double) 100L, "PayPal Payment Confirmed: hi!");
        boolean boolean6 = debitCardAdapter0.refundRequest("Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!");
        payment.DebitCardPayment debitCardPayment7 = null;
        debitCardAdapter0.debitCardPayment = debitCardPayment7;
        java.lang.String str10 = debitCardAdapter0.notifyRefundIssued("");
        java.lang.String str12 = debitCardAdapter0.paymentConfirmation("Refund Issued for Debit Card Transaction: PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean14 = debitCardAdapter0.refundRequest("Debit Card Payment Failed: Error Credit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        java.lang.String str16 = debitCardAdapter0.paymentFailure("Debit Card Payment Confirmed: Debit Card Payment Confirmed: Debit Card Payment Confirmed: Processing PayPal payment: PayPal Payment Confirmed: Refund Issued for Debit Card Transaction:  for amount: 10.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Refund Issued for Debit Card Transaction: " + "'", str10, "Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Debit Card Payment Confirmed: Refund Issued for Debit Card Transaction: PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str12, "Debit Card Payment Confirmed: Refund Issued for Debit Card Transaction: PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Debit Card Payment Failed: Error Debit Card Payment Confirmed: Debit Card Payment Confirmed: Debit Card Payment Confirmed: Processing PayPal payment: PayPal Payment Confirmed: Refund Issued for Debit Card Transaction:  for amount: 10.0" + "'", str16, "Debit Card Payment Failed: Error Debit Card Payment Confirmed: Debit Card Payment Confirmed: Debit Card Payment Confirmed: Processing PayPal payment: PayPal Payment Confirmed: Refund Issued for Debit Card Transaction:  for amount: 10.0");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        payment.PayPalAdapter payPalAdapter0 = new payment.PayPalAdapter();
        java.lang.String str2 = payPalAdapter0.notifyRefundIssued("hi!");
        java.lang.String str4 = payPalAdapter0.paymentConfirmation("hi!");
        java.lang.String str6 = payPalAdapter0.paymentFailure("Refund Issued for PayPal Transaction: hi!");
        payment.PayPalPayment payPalPayment7 = payPalAdapter0.payPalPayment;
        boolean boolean11 = payPalAdapter0.processTransaction("Refund Issued for PayPal Transaction: ", 100.0d, "Processing debit card payment: Credit Card Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: 1.0");
        boolean boolean15 = payPalAdapter0.processTransaction("PayPal Payment Confirmed: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!", 100.0d, "Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: Debit Card Payment Failed: Error PayPal Payment Failed: Error Refund Issued for PayPal Transaction: Debit Card Payment Confirmed: Debit Card Payment Confirmed: hi!");
        payment.PayPalPayment payPalPayment16 = null;
        payPalAdapter0.payPalPayment = payPalPayment16;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refund Issued for PayPal Transaction: hi!" + "'", str2, "Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal Payment Confirmed: hi!" + "'", str4, "PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str6, "PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertNotNull(payPalPayment7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        payment.CreditCardAdapter creditCardAdapter0 = new payment.CreditCardAdapter();
        java.lang.String str2 = creditCardAdapter0.notifyRefundIssued("Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str4 = creditCardAdapter0.notifyRefundIssued("PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str6 = creditCardAdapter0.notifyRefundIssued("Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        boolean boolean10 = creditCardAdapter0.processTransaction("Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ", (double) 0.0f, "PayPal Payment Confirmed: Processing debit card payment:  for amount: -1.0");
        payment.CreditCardPayment creditCardPayment11 = creditCardAdapter0.creditCardPayment;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str2, "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str4, "Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: " + "'", str6, "Refund Issued for Credit Card Transaction: Debit Card Payment Failed: Error Refund Issued for Credit Card Transaction: Debit Card Payment Confirmed: Credit Card Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(creditCardPayment11);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        payment.DebitCardAdapter debitCardAdapter0 = new payment.DebitCardAdapter();
        boolean boolean2 = debitCardAdapter0.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str4 = debitCardAdapter0.paymentConfirmation("hi!");
        java.lang.String str6 = debitCardAdapter0.notifyRefundIssued("");
        java.lang.String str8 = debitCardAdapter0.notifyRefundIssued("Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        java.lang.String str10 = debitCardAdapter0.notifyRefundIssued("Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        boolean boolean14 = debitCardAdapter0.processTransaction("Refund Issued for Credit Card Transaction: Refund Issued for Credit Card Transaction: PayPal Payment Failed: Error Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", (double) (short) 10, "Credit Card Payment Confirmed: Credit Card Payment Confirmed: PayPal Payment Confirmed: Debit Card Payment Failed: Error Processing PayPal payment: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi! for amount: 10.0");
        payment.DebitCardPayment debitCardPayment15 = debitCardAdapter0.debitCardPayment;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card Payment Confirmed: hi!" + "'", str4, "Debit Card Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Refund Issued for Debit Card Transaction: " + "'", str6, "Refund Issued for Debit Card Transaction: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str8, "Refund Issued for Debit Card Transaction: Refund Issued for Debit Card Transaction: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Refund Issued for Debit Card Transaction: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str10, "Refund Issued for Debit Card Transaction: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(debitCardPayment15);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        payment.PayPalAdapter payPalAdapter0 = new payment.PayPalAdapter();
        java.lang.String str2 = payPalAdapter0.notifyRefundIssued("hi!");
        java.lang.String str4 = payPalAdapter0.paymentConfirmation("hi!");
        java.lang.String str6 = payPalAdapter0.paymentFailure("Refund Issued for PayPal Transaction: hi!");
        payment.PayPalPayment payPalPayment7 = payPalAdapter0.payPalPayment;
        java.lang.String str9 = payPalAdapter0.paymentFailure("PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        java.lang.String str11 = payPalAdapter0.paymentFailure("PayPal Payment Failed: Error PayPal Payment Failed: Error Processing debit card payment: Refund Issued for PayPal Transaction: PayPal Payment Failed: Error PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: 0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refund Issued for PayPal Transaction: hi!" + "'", str2, "Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PayPal Payment Confirmed: hi!" + "'", str4, "PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str6, "PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertNotNull(payPalPayment7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!" + "'", str9, "PayPal Payment Failed: Error PayPal Payment Confirmed: PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PayPal Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Failed: Error Processing debit card payment: Refund Issued for PayPal Transaction: PayPal Payment Failed: Error PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: 0.0" + "'", str11, "PayPal Payment Failed: Error PayPal Payment Failed: Error PayPal Payment Failed: Error Processing debit card payment: Refund Issued for PayPal Transaction: PayPal Payment Failed: Error PayPal Payment Confirmed: Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi! for amount: 0.0");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        payment.DebitCardAdapter debitCardAdapter0 = new payment.DebitCardAdapter();
        boolean boolean2 = debitCardAdapter0.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str4 = debitCardAdapter0.paymentConfirmation("Refund Issued for PayPal Transaction: hi!");
        payment.DebitCardAdapter debitCardAdapter5 = new payment.DebitCardAdapter();
        boolean boolean7 = debitCardAdapter5.refundRequest("Refund Issued for PayPal Transaction: hi!");
        java.lang.String str9 = debitCardAdapter5.paymentConfirmation("PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        boolean boolean13 = debitCardAdapter5.processTransaction("PayPal Payment Confirmed: PayPal Payment Failed: Error PayPal Payment Confirmed: hi!", (double) (-1L), "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        java.lang.String str15 = debitCardAdapter5.paymentFailure("Processing debit card payment:  for amount: -1.0");
        payment.DebitCardPayment debitCardPayment16 = debitCardAdapter5.debitCardPayment;
        debitCardAdapter0.debitCardPayment = debitCardPayment16;
        java.lang.String str20 = debitCardPayment16.payWithDebit("PayPal Payment Failed: Error ", (double) (short) 10);
        java.lang.String str23 = debitCardPayment16.payWithDebit("Processing debit card payment: Credit Card Payment Confirmed: Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction:  for amount: 10.0", (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!" + "'", str4, "Debit Card Payment Confirmed: Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!" + "'", str9, "Debit Card Payment Confirmed: PayPal Payment Failed: Error Refund Issued for PayPal Transaction: hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0" + "'", str15, "Debit Card Payment Failed: Error Processing debit card payment:  for amount: -1.0");
        org.junit.Assert.assertNotNull(debitCardPayment16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing debit card payment: PayPal Payment Failed: Error  for amount: 10.0" + "'", str20, "Processing debit card payment: PayPal Payment Failed: Error  for amount: 10.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Processing debit card payment: Processing debit card payment: Credit Card Payment Confirmed: Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction:  for amount: 10.0 for amount: 32.0" + "'", str23, "Processing debit card payment: Processing debit card payment: Credit Card Payment Confirmed: Credit Card Payment Confirmed: Refund Issued for Credit Card Transaction: PayPal Payment Confirmed: Debit Card Payment Failed: Error Refund Issued for Debit Card Transaction: Refund Issued for PayPal Transaction:  for amount: 10.0 for amount: 32.0");
    }
}

