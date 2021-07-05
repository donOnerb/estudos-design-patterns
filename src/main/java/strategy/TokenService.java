package strategy;

import strategy.model.PaymentProcessor;
import strategy.model.TokenActivationResponse;
import strategy.model.Token;

public interface TokenService {

    Token getTokensByCard(PaymentProcessor paymentProcessor, Long cardId);

    TokenActivationResponse activateToken(PaymentProcessor paymentProcessor, String tokenReferenceId);

    void deleteToken(PaymentProcessor paymentProcessor, String tokenReferenceId);

    void suspendToken(PaymentProcessor paymentProcessor, String tokenReferenceId);
}
