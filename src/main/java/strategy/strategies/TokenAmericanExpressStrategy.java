package strategy.strategies;

import strategy.TokenStrategy;
import strategy.model.PaymentProcessor;
import strategy.model.Token;
import strategy.model.TokenActivationResponse;

import static strategy.model.PaymentProcessor.AMERICAN_EXPRESS;

public class TokenAmericanExpressStrategy implements TokenStrategy {

    @Override
    public PaymentProcessor getPaymentProcessor() {
        return AMERICAN_EXPRESS;
    }

    @Override
    public Token getTokensByCard(Long cardId) {
        return new Token();
    }

    @Override
    public TokenActivationResponse activateToken(String tokenReferenceId) {
        System.out.printf("Activating %s for paymentProcessor %s%n", tokenReferenceId, AMERICAN_EXPRESS);
        return new TokenActivationResponse().setPaymentProcessor(AMERICAN_EXPRESS).setTokenRefId(tokenReferenceId);
    }

    @Override
    public void deleteToken(String tokenReferenceId) {
        System.out.printf("Deleting %s for paymentProcessor %s%n", tokenReferenceId, AMERICAN_EXPRESS);
    }

    @Override
    public void suspendToken(String tokenReferenceId) {
        System.out.printf("Suspending %s for paymentProcessor %s%n", tokenReferenceId, AMERICAN_EXPRESS);
    }
}
