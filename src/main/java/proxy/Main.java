package proxy;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
        try {
            var firstClient = new FirstClient();
            var secondClient = new SecondClient();
            firstClient.doSomething();
            secondClient.doAnotherThing();
        } catch (ParseException parseException) {
            System.out.println("Algo de errado não está certo");
        }

    }
}
