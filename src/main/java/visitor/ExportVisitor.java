package visitor;

public class ExportVisitor implements Visitor {

    @Override
    public void visit(House house) {
        System.out.println("Export house xml");
    }

    @Override
    public void visit(Building building) {
        System.out.println("Export building xml");
    }
}
