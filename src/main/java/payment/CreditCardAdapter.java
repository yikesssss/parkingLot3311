package payment;

public class CreditCardAdapter implements PaymentGateway {
	public CreditCardPayment creditCardPayment;
	    
	    public CreditCardAdapter() {
	        this.creditCardPayment = new CreditCardPayment();
	    }
	    
	    public boolean processTransaction(String transactionID, double amount, String paymentType) {
	        creditCardPayment.payWithCredit(transactionID, amount);
	        return true;
	    }
	    
	    public String paymentConfirmation(String transactionID) {
	        return "Credit Card Payment Confirmed: " + transactionID;
	    }
	    
	    public String paymentFailure(String errorCode) {
	        return "Credit Card Payment Failed: Error " + errorCode;
	    }
	    
	    public boolean refundRequest(String transactionID) {
	        System.out.println("Processing Credit Card Refund for: " + transactionID);
	        return true;
	    }
	    
	    public String notifyRefundIssued(String transactionID) {
	        return "Refund Issued for Credit Card Transaction: " + transactionID;
	    }

}
