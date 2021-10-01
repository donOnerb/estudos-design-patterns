package flyweight;

import java.util.ArrayList;
import java.util.List;

public class ForestContextImpl implements ForestContext{

    private FlyweightFactory flyweightFactory;

    private List<Animal> animalList;

    public ForestContextImpl() {
        flyweightFactory = new FlyweightFactoryImpl();
        animalList = new ArrayList<>();
    }

    public Animal createAnimal(Float height, Float weight, String name, String color, String species) {
        var flyweight = flyweightFactory.getFlyweight(color, species);
        Animal animal = new AnimalImpl(height, weight, name, flyweight);
        animalList.add(animal);
        return animal;
    }

}
