class PaymentProcessor {
    public static PaymentGateway getPaymentGateway(String paymentType) {
        switch (paymentType) {
            case "CreditCard": return new CreditCardAdapter();
            case "DebitCard": return new DebitCardAdapter();
            case "PayPal": return new PayPalAdapter();
            default: throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
