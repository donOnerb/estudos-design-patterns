package prototype;

public abstract class Carro implements Cloneable {
    private String nomeModelo;
    private int preco;

    public Carro() {
    }

    public Carro(Carro source) {
        this.nomeModelo = source.getNomeModelo();
        this.preco = source.getPreco();
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public abstract Carro clone();
}
