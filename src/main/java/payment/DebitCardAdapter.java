package payment;

public class DebitCardAdapter implements PaymentGateway{
	public DebitCardPayment debitCardPayment;
	    
	    public DebitCardAdapter() {
	        this.debitCardPayment = new DebitCardPayment();
	    }
	    
	    @Override
	    public boolean processTransaction(String transactionID, double amount, String paymentType) {
	        debitCardPayment.payWithDebit(transactionID, amount);
	        return true;
	    }
	    
	    @Override
	    public String paymentConfirmation(String transactionID) {
	        return "Debit Card Payment Confirmed: " + transactionID;
	    }
	    
	    @Override
	    public String paymentFailure(String errorCode) {
	        return "Debit Card Payment Failed: Error " + errorCode;
	    }
	    
	    @Override
	    public boolean refundRequest(String transactionID) {
	        System.out.println("Processing Debit Card Refund for: " + transactionID);
	        return true;
	    }
	    
	    @Override
	    public String notifyRefundIssued(String transactionID) {
	        return "Refund Issued for Debit Card Transaction: " + transactionID;
	    }
}
