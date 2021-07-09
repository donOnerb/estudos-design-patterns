package visitor;

public class Building implements GeometricShape {
    public void accept(Visitor v) {
        v.visit(this);
    }
}
