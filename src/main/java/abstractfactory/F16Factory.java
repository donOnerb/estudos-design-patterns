package abstractfactory;

public class F16Factory implements AircraftFactory {

    public Engine createEngine() {
        return new F16Engine();
    }

    public Wings createWings() {
        return new F16Wings();
    }

    public Cockpit createCockpit() {
        return new F16Cockpit();
    }
}