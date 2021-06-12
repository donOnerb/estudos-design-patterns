package abstractfactory;

public interface AircraftFactory {
    Engine createEngine();

    Wings createWings();

    Cockpit createCockpit();
}
