package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlyweightFactoryImpl  implements FlyweightFactory{

    private List<Flyweight> cache;
    public FlyweightFactoryImpl() {
        cache = new ArrayList<>();
    }

    public Flyweight getFlyweight(String color, String species) {
        var newFlyweight = new Flyweight(color, species);
       var flyweightSearch = cache.stream()
                .filter(flyweight -> flyweight.equals(newFlyweight))
                .findFirst();
       if(!flyweightSearch.isPresent()) {
           cache.add(newFlyweight);
           return newFlyweight;
       }
       return flyweightSearch.get();
    }


}
