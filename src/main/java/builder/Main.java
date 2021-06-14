package builder;

public class Main {

    public static void main(String[] args) {
        var simpleHouse = new HouseBuilder()
                .buildDoors(2)
                .buildWall()
                .buildRoof()
                .getResult();

        System.out.println(simpleHouse);
    }
}
