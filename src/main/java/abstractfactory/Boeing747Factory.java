package abstractfactory;

public class Boeing747Factory implements AircraftFactory {

    @Override
    public Engine createEngine() {
        return new Boeing747Engine();
    }

    @Override
    public Wings createWings() {
        return new Boeing747Wings();
    }

    @Override
    public Cockpit createCockpit() {
        return new Boeing747Cockpit();
    }
}
