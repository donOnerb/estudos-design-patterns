package flyweight;

public class Main {
    public static void main(String args[]) {
        ForestContext forestContext = new ForestContextImpl();
        var monkeyBubbles = forestContext.createAnimal(1.5f, 80.12f, "Bubbles", "Brown", "Chimpanzee");
        var monkeyPeanut = forestContext.createAnimal(1.57f, 84.5f, "Peanut", "Brown", "Chimpanzee");
        var monkeyBLover = forestContext.createAnimal(1.57f, 84.5f, "BLover", "Orange", "Orangutan");
        monkeyBubbles.render();
        monkeyPeanut.render();
        monkeyBLover.render();
    }
}
