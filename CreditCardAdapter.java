class CreditCardAdapter implements PaymentGateway {
    private CreditCardPayment creditCardPayment;
    
    public CreditCardAdapter() {
        this.creditCardPayment = new CreditCardPayment();
    }
    
    public boolean processTransaction(String transactionID, double amount, String paymentType) {
        creditCardPayment.payWithCredit(transactionID, amount);
        return true;
    }
    
    public void paymentConfirmation(String transactionID) {
        System.out.println("Credit Card Payment Confirmed: " + transactionID);
    }
    
    public void paymentFailure(String errorCode) {
        System.out.println("Credit Card Payment Failed: Error " + errorCode);
    }
    
    public boolean refundRequest(String transactionID) {
        System.out.println("Processing Credit Card Refund for: " + transactionID);
        return true;
    }
    
    public void notifyRefundIssued(String transactionID) {
        System.out.println("Refund Issued for Credit Card Transaction: " + transactionID);
    }
}
