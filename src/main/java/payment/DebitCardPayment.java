package payment;

public class DebitCardPayment {
	
	public String payWithDebit(String transactionID, double amount) {
        return "Processing debit card payment: " + transactionID + " for amount: " + amount;
    }

}
