package builder;

public class HouseBuilder implements Builder {

    private House house = new House();

    @Override
    public void reset() {
        this.house = new House();
    }

    @Override
    public HouseBuilder buildWindows(int windows) {
        this.house.setWindows(windows);
        return this;
    }

    @Override
    public HouseBuilder buildWall() {
        this.house.setWall(new Wall());
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        this.house.setRoof(new Roof());
        return this;
    }

    @Override
    public HouseBuilder buildDoors(int doors) {
        this.house.setDoors(doors);
        return this;
    }

    @Override
    public HouseBuilder buildPool() {
        this.house.setPool(new Pool());
        return this;
    }

    @Override
    public HouseBuilder buildGarage() {
        this.house.setGarage(new Garage());
        return this;
    }

    @Override
    public HouseBuilder buildSolarPanel() {
        this.house.setSolarPanel(new SolarPanel());
        return this;
    }

    @Override
    public HouseBuilder buildGarden() {
        this.house.setGarden(new Garden());
        return this;
    }

    @Override
    public House getResult() {
        var house = this.house;
        this.reset();
        return house;
    }
}
