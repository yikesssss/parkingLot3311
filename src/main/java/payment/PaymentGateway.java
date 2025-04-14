package payment;

public interface PaymentGateway {
	boolean processTransaction(String transactionID, double amount, String paymentType);
    String paymentConfirmation(String transactionID);
    String paymentFailure(String errorCode);
    boolean refundRequest(String transactionID);
    String notifyRefundIssued(String transactionID);
}
