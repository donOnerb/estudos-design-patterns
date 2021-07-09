package visitor;

public class House implements GeometricShape {
    public void accept(Visitor v) {
        v.visit(this);
    }
}
