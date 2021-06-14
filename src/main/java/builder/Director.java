package builder;

public class Director {

    private HouseBuilder builder;

    public Director(HouseBuilder builder) {
        this.builder = builder;
    }

    public HouseBuilder buildSimpleHouse() {
        return new HouseBuilder()
                .buildDoors(2)
                .buildWall()
                .buildRoof();
    }
}
