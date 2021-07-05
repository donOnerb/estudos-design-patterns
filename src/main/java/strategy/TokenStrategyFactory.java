package strategy;

import strategy.model.PaymentProcessor;
import strategy.strategies.TokenAmericanExpressStrategy;
import strategy.strategies.TokenMastercardStrategy;
import strategy.strategies.TokenVisaStrategy;

import java.util.EnumMap;

public class TokenStrategyFactory {

    private final EnumMap<PaymentProcessor, TokenStrategy> strategies;

    public TokenStrategyFactory() {
        this.strategies = new EnumMap<>(PaymentProcessor.class);
        this.strategies.put(PaymentProcessor.VISA, new TokenVisaStrategy());
        this.strategies.put(PaymentProcessor.MASTERCARD, new TokenMastercardStrategy());
        this.strategies.put(PaymentProcessor.AMERICAN_EXPRESS, new TokenAmericanExpressStrategy());
    }

    public TokenStrategy findStrategy(PaymentProcessor paymentProcessor) {
        return this.strategies.get(paymentProcessor);
    }
}
