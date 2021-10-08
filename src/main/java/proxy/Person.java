package proxy;

import java.util.Date;
import java.util.Objects;

public class Person {

    private String document;
    private String name;
    private Date birthDate;

    public Person(String document, String name, Date birthDate) {
        this.document = document;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void printPersonInformation() {
        System.out.println("------Person Info-------");
        System.out.println("Address:" + System.identityHashCode(this));
        System.out.println(document);
        System.out.println(name);
        System.out.println(birthDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getDocument().equals(person.getDocument()) && getName().equals(person.getName()) && getBirthDate().equals(person.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDocument(), getName(), getBirthDate());
    }
}
