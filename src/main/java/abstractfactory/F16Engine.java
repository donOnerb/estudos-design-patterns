package abstractfactory;

public class F16Engine implements Engine {
    @Override
    public void start() {
        System.out.println("F16 engine on");
    }
}