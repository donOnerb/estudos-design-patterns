package proxy;

public class FirstClient {
    private Service service;

    public FirstClient() {
        service = new Proxy();
    }


    public void doSomething() {
        var dog1 = service.createDog("scooby-doo", "fila");
        var dog2 = service.createDog("snoopy", "labrador");
        var dog3 = service.createDog("scooby-doo", "fila");
        dog1.printDogInformation();
        dog2.printDogInformation();
        dog3.printDogInformation();
    }



}
