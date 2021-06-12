package abstractfactory;

public class Client {

    public static void main(String[] args) {
        var f16 = new Aircraft(new F16Factory());
        f16.fly();
    }
}
