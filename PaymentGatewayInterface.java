interface PaymentGateway {
    boolean processTransaction(String transactionID, double amount, String paymentType);
    void paymentConfirmation(String transactionID);
    void paymentFailure(String errorCode);
    boolean refundRequest(String transactionID);
    void notifyRefundIssued(String transactionID);
}
