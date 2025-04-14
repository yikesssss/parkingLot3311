package payment;

public class PaymentProcessor {
	
		    public static PaymentGateway getPaymentGateway(String paymentType) {
		        switch (paymentType) {
		            case "CreditCard": return new CreditCardAdapter();
		            case "DebitCard": return new DebitCardAdapter();
		 			case "PayPal": return new PayPalAdapter();
		 			default: throw new IllegalArgumentException("Invalid payment type: " + paymentType);
		 			}
		 		}
		 
		 
		 		public boolean processPayment(String paymentType, String transactionID, double amount) {
		 
		 			PaymentGateway gateway = getPaymentGateway(paymentType);
		 
		 			boolean success = gateway.processTransaction(transactionID, amount, paymentType);
		 
		 			if (success) {
		 				gateway.paymentConfirmation(transactionID);
		 			} else {
		 				gateway.paymentFailure("ERR-PAYMENT-FAILED");
		 			}
		 			return success;
		 		}
		 
		 
		 		public boolean processPayment(PaymentGateway gateway, String transactionID, double amount,
		 				String PaymentType) {
		 			if (gateway == null) {
		 				throw new NullPointerException("PaymentGateway cannot be null");
		 			}
		 
		 			boolean success = gateway.processTransaction(transactionID, amount, PaymentType);
		 			if (success) {
		 				gateway.paymentConfirmation(transactionID);
		 			} else {
		 				gateway.paymentFailure("ERR-PAYMENT-FAILED");
		         }
		 			return success;
		     }
		 
		 
		 		public void reset() {
		 
		 		}
		    
	
}
