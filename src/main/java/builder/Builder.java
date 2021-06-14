package builder;

public interface Builder {
    void reset();

    Builder buildWindows(int windows);

    Builder buildWall();

    Builder buildRoof();

    Builder buildDoors(int doors);

    Builder buildPool();

    Builder buildGarage();

    Builder buildSolarPanel();

    Builder buildGarden();

    House getResult();
}
