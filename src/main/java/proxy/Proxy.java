package proxy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Proxy implements Service{
    private Service service;

    private List<Dog> cacheDogs;
    private List<Person> cachePersons;

    public Proxy() {

        service = new ServiceImpl();
        cacheDogs = new ArrayList<>();
        cachePersons = new ArrayList<>();
    }

    public Person createPerson(String document, String name, Date birthDate) {
        var personSearch = cachePersons.stream()
                .filter((person) -> person.getDocument().equals(document))
                .findFirst();
        if(personSearch.isPresent()) {
            return personSearch.get();
        }
        var newPerson = service.createPerson(document, name, birthDate);
        cachePersons.add(newPerson);
        return newPerson;
    }

    public Dog createDog(String name, String breed) {
        var dogSearch = cacheDogs.stream()
                .filter((dog) -> dog.getBreed().equals(breed) && dog.getName().equals(name))
                .findFirst();
        if(dogSearch.isPresent()) {
            return dogSearch.get();
        }
        var newDog = service.createDog(name, breed);
        cacheDogs.add(newDog);
        return newDog;
    }

    public Integer getNumberOfDogInstances() {
        return cacheDogs.size();
    }

    public Integer getNumberOfPersonInstances() {
        return cacheDogs.size();
    }

    private void clearCachePersons(){
        cachePersons.clear();
    }

    private void clearCacheDogs(){
        cacheDogs.clear();
    }





}
