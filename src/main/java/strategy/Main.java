package strategy;

import strategy.model.PaymentProcessor;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        var tokenService = new TokenServiceImpl();

        tokenService.activateToken(PaymentProcessor.VISA, UUID.randomUUID().toString());
        tokenService.deleteToken(PaymentProcessor.MASTERCARD, UUID.randomUUID().toString());
    }
}
