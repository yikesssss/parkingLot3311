package payment;

public class PayPalAdapter implements PaymentGateway{
	public PayPalPayment payPalPayment;
	    
	    public PayPalAdapter() {
	        this.payPalPayment = new PayPalPayment();
	    }
	    
	    public boolean processTransaction(String transactionID, double amount, String paymentType) {
	        payPalPayment.payWithPaypal(transactionID, amount);
	        return true;
	    }
	    
	    public String paymentConfirmation(String transactionID) {
	        return "PayPal Payment Confirmed: " + transactionID;
	    }
	    
	    public String paymentFailure(String errorCode) {
	        return "PayPal Payment Failed: Error " + errorCode;
	    }
	    
	    public boolean refundRequest(String transactionID) {
	        System.out.println("Processing PayPal Refund for: " + transactionID);
	        return true;
	    }
	    
	    public String notifyRefundIssued(String transactionID) {
	        return "Refund Issued for PayPal Transaction: " + transactionID;
	    }
}
