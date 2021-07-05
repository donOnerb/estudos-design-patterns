package strategy.model;

import java.util.UUID;

public class Token {

    private final String uuid;

    public Token() {
        uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "Token{" +
                "uuid='" + uuid + '\'' +
                '}';
    }
}
