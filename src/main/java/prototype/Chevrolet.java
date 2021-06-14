package prototype;

public class Chevrolet extends Carro {

    public Chevrolet() {
    }

    public Chevrolet(Chevrolet source) {
        super(source);
    }

    @Override
    public Carro clone()  {
        return new Chevrolet(this);
    }
}
