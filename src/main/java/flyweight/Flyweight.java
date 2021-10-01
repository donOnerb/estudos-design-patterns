package flyweight;

public class Flyweight {

    private String color;
    private String species;

    public Flyweight(String color, String species) {
        this.color = color;
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this)
            return true;
        if(!(o instanceof Flyweight))
            return false;
        var flyweight = (Flyweight) o;
        if(this.color.equals(flyweight.getColor()) && this.species.equals(flyweight.getSpecies()))
            return true;
        return false;
    }
}
