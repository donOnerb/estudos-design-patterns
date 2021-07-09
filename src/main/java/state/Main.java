package state;

public class Main {
    public static void main(String[] args) {
        var document = new Document(new User(true, false));
        document.publish();
        document.render();
    }
}
