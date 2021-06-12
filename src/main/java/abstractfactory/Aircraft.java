package abstractfactory;

public class Aircraft {
    private Engine engine;
    private Cockpit cockpit;
    private Wings wings;
    private AircraftFactory factory;

    public Aircraft(AircraftFactory factory) {
        this.factory = factory;
    }

    protected Aircraft makeAircraft() {
        engine = factory.createEngine();
        cockpit = factory.createCockpit();
        wings = factory.createWings();
        return this;
    }

    public void fly() {
        Aircraft aircraft = makeAircraft();
        System.out.println("Flying");
    }
}