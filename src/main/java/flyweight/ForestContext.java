package flyweight;

public interface ForestContext {

    Animal createAnimal(Float height, Float weight, String name, String color, String species);
}
