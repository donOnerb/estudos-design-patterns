package visitor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var geometricShapes = new ArrayList<GeometricShape>();
        geometricShapes.add(new House());
        geometricShapes.add(new Building());
        geometricShapes.forEach(geometricShape -> geometricShape.accept(new ExportVisitor()));
    }
}
