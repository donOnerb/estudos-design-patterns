package abstractfactory;

public class Boeing747Engine implements Engine {
    @Override
    public void start() {
        System.out.println("Boeing747 engine on");
    }
}
