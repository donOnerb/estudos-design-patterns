package strategy.strategies;

import strategy.TokenStrategy;
import strategy.model.PaymentProcessor;
import strategy.model.Token;
import strategy.model.TokenActivationResponse;

import static strategy.model.PaymentProcessor.MASTERCARD;

public class TokenMastercardStrategy implements TokenStrategy {

    @Override
    public PaymentProcessor getPaymentProcessor() {
        return MASTERCARD;
    }

    @Override
    public Token getTokensByCard(Long cardId) {
        return new Token();
    }

    @Override
    public TokenActivationResponse activateToken(String tokenReferenceId) {
        System.out.printf("Activating %s for paymentProcessor %s%n", tokenReferenceId, MASTERCARD);
        return new TokenActivationResponse().setPaymentProcessor(MASTERCARD).setTokenRefId(tokenReferenceId);
    }

    @Override
    public void deleteToken(String tokenReferenceId) {
        System.out.printf("Deleting %s for paymentProcessor %s%n", tokenReferenceId, MASTERCARD);
    }

    @Override
    public void suspendToken(String tokenReferenceId) {
        System.out.printf("Suspending %s for paymentProcessor %s%n", tokenReferenceId, MASTERCARD);
    }
}
