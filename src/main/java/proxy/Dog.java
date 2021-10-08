package proxy;

import java.util.Objects;

public class Dog {

    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void printDogInformation() {
        System.out.println("------Dog Info-------");
        System.out.println("Address:" + System.identityHashCode(this));
        System.out.println(name);
        System.out.println(breed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return getName().equals(dog.getName()) && getBreed().equals(dog.getBreed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBreed());
    }


}
