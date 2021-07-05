package strategy.model;

public class TokenActivationResponse {

    private PaymentProcessor paymentProcessor;

    private String tokenRefId;

    public PaymentProcessor getPaymentProcessor() {
        return paymentProcessor;
    }

    public TokenActivationResponse setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
        return this;
    }

    public String getTokenRefId() {
        return tokenRefId;
    }

    public TokenActivationResponse setTokenRefId(String tokenRefId) {
        this.tokenRefId = tokenRefId;
        return this;
    }
}
