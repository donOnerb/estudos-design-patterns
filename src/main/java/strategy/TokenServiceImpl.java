package strategy;

import strategy.model.PaymentProcessor;
import strategy.model.Token;
import strategy.model.TokenActivationResponse;

public class TokenServiceImpl implements TokenService {

    private final TokenStrategyFactory tokenStrategyFactory;

    public TokenServiceImpl() {
        this.tokenStrategyFactory = new TokenStrategyFactory();
    }

    @Override
    public Token getTokensByCard(PaymentProcessor paymentProcessor, Long cardId) {
        return tokenStrategyFactory.findStrategy(paymentProcessor).getTokensByCard(cardId);
    }

    @Override
    public TokenActivationResponse activateToken(PaymentProcessor paymentProcessor, String tokenReferenceId) {
        return tokenStrategyFactory.findStrategy(paymentProcessor).activateToken(tokenReferenceId);
    }

    @Override
    public void deleteToken(PaymentProcessor paymentProcessor, String tokenReferenceId) {
        tokenStrategyFactory.findStrategy(paymentProcessor).deleteToken(tokenReferenceId);
    }

    @Override
    public void suspendToken(PaymentProcessor paymentProcessor, String tokenReferenceId) {
        tokenStrategyFactory.findStrategy(paymentProcessor).suspendToken(tokenReferenceId);
    }
}
