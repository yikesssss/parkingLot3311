package payment;

public class CreditCardPayment {
	public void payWithCredit(String transactionID, double amount) {
        System.out.println("Processing credit card payment: " + transactionID + " for amount: " + amount);
    }
}
