package builder;

public class House {

    private int windows;
    private Wall wall;
    private Roof roof;
    private int doors;
    private Pool pool;
    private Garage garage;
    private SolarPanel solarPanel;
    private Garden garden;

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public Wall getWall() {
        return wall;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public SolarPanel getSolarPanel() {
        return solarPanel;
    }

    public void setSolarPanel(SolarPanel solarPanel) {
        this.solarPanel = solarPanel;
    }

    public Garden getGarden() {
        return garden;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", wall=" + wall +
                ", roof=" + roof +
                ", doors=" + doors +
                ", pool=" + pool +
                ", garage=" + garage +
                ", solarPanel=" + solarPanel +
                ", garden=" + garden +
                '}';
    }
}
