class DebitCardAdapter implements PaymentGateway {
    private DebitCardPayment debitCardPayment;
    
    public DebitCardAdapter() {
        this.debitCardPayment = new DebitCardPayment();
    }
    
    public boolean processTransaction(String transactionID, double amount, String paymentType) {
        debitCardPayment.payWithDebit(transactionID, amount);
        return true;
    }
    
    public void paymentConfirmation(String transactionID) {
        System.out.println("Debit Card Payment Confirmed: " + transactionID);
    }
    
    public void paymentFailure(String errorCode) {
        System.out.println("Debit Card Payment Failed: Error " + errorCode);
    }
    
    public boolean refundRequest(String transactionID) {
        System.out.println("Processing Debit Card Refund for: " + transactionID);
        return true;
    }
    
    public void notifyRefundIssued(String transactionID) {
        System.out.println("Refund Issued for Debit Card Transaction: " + transactionID);
    }
}
