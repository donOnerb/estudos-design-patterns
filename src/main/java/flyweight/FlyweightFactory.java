package flyweight;

public interface FlyweightFactory {

    Flyweight getFlyweight(String color, String species);
}
