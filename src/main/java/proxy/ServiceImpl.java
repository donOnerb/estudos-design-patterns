package proxy;

import java.util.Date;

public class ServiceImpl implements Service {

    public Person createPerson(String document, String name, Date birthDate) {
        return new Person(document, name, birthDate);
    }

    public Dog createDog(String name, String breed) {
        return new Dog(name, breed);
    }
}
