package com;
class DebitCardAdapter implements PaymentGateway {
   protected DebitCardPayment debitCardPayment;

    public DebitCardAdapter() {
        this.debitCardPayment = new DebitCardPayment();
    }

    @Override
	public boolean processTransaction(String transactionID, double amount, String paymentType) {
        debitCardPayment.payWithDebit(transactionID, amount);
        return true;
    }

    @Override
	public void paymentConfirmation(String transactionID) {
        System.out.println("Debit Card Payment Confirmed: " + transactionID);
    }

    @Override
	public void paymentFailure(String errorCode) {
        System.out.println("Debit Card Payment Failed: Error " + errorCode);
    }

    @Override
	public boolean refundRequest(String transactionID) {
        System.out.println("Processing Debit Card Refund for: " + transactionID);
        return true;
    }

    @Override
	public void notifyRefundIssued(String transactionID) {
        System.out.println("Refund Issued for Debit Card Transaction: " + transactionID);
    }


	}

