package payment;

public class PayPalPayment {
	public String payWithPaypal(String transactionID, double amount) {
		if (amount > 0) {
 			return "Processing PayPal payment: " + transactionID + " for amount: " + amount;
 		} else {
 			return "Cannot Process PayPal payment: " + transactionID + " for amount: " + amount + "because amont negative";
 		}
        
    }

}
