class PayPalAdapter implements PaymentGateway {
    private PayPalPayment payPalPayment;
    
    public PayPalAdapter() {
        this.payPalPayment = new PayPalPayment();
    }
    
    public boolean processTransaction(String transactionID, double amount, String paymentType) {
        payPalPayment.payWithPaypal(transactionID, amount);
        return true;
    }
    
    public void paymentConfirmation(String transactionID) {
        System.out.println("PayPal Payment Confirmed: " + transactionID);
    }
    
    public void paymentFailure(String errorCode) {
        System.out.println("PayPal Payment Failed: Error " + errorCode);
    }
    
    public boolean refundRequest(String transactionID) {
        System.out.println("Processing PayPal Refund for: " + transactionID);
        return true;
    }
    
    public void notifyRefundIssued(String transactionID) {
        System.out.println("Refund Issued for PayPal Transaction: " + transactionID);
    }
}
