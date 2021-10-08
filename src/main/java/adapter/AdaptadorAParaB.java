package adapter;

public class AdaptadorAParaB implements UtilitariosProvedorDeDados {

    private BibliotecaDeAnalises bibliotecaDeAnalises;

    public AdaptadorAParaB(BibliotecaDeAnalises bibliotecaDeAnalises) {
        this.bibliotecaDeAnalises = bibliotecaDeAnalises;
    }
    public String plotData(A a) {
        var b = converteAParaB(a);
        return bibliotecaDeAnalises.plotData(b);
    }

    private B converteAParaB(A a) {
        return new B(a.getA() + "Sou o Adapter, eu converti adapter.A para adapter.B\n");
    }
}
