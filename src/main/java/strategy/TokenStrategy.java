package strategy;

import strategy.model.PaymentProcessor;
import strategy.model.Token;
import strategy.model.TokenActivationResponse;

public interface TokenStrategy {

    PaymentProcessor getPaymentProcessor();

    Token getTokensByCard(Long cardId);

    TokenActivationResponse activateToken(String tokenReferenceId);

    void deleteToken(String tokenReferenceId);

    void suspendToken(String tokenReferenceId);
}
