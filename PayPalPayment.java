package com;
class PayPalPayment {
    public void payWithPaypal(String transactionID, double amount) {
		if (amount > 0) {
			System.out.println("Processing PayPal payment: " + transactionID + " for amount: " + amount);
		} else {
			System.out.println("Cannot Process PayPal payment: " + transactionID + " for amount: " + amount + "because amont negative");
		}
    }
}
