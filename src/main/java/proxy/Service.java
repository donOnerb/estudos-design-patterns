package proxy;

import java.util.Date;

public interface Service {

    Person createPerson(String document, String name, Date birthDate);

    Dog createDog(String name, String breed);
}
