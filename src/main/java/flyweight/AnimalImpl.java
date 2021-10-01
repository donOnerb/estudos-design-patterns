package flyweight;

public class AnimalImpl implements Animal{

    private Float height;
    private Float weight;
    private String name;
    private Flyweight flyweight;

    public AnimalImpl(Float height, Float weight, String name, Flyweight flyweight) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.flyweight = flyweight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flyweight getFlyweight() {
        return flyweight;
    }

    public void setFlyweight(Flyweight flyweight) {
        this.flyweight = flyweight;
    }

    public void render() {
        System.out.println("------------------------");
        System.out.println("Animal");
        System.out.println("Name:" + this.name);
        System.out.println("Weight:" + this.weight);
        System.out.println("Height:" + this.height);
        System.out.println("Flyweight Address:" + System.identityHashCode(flyweight));
        System.out.println("Color:" + flyweight.getColor());
        System.out.println("Species:" + flyweight.getSpecies());
    }
}
