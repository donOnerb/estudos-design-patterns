package prototype;

public class Ford extends Carro {

    public Ford() {
    }

    public Ford(Ford source) {
        super(source);
    }

    @Override
    public Carro clone()  {
        return new Ford(this);
    }
}