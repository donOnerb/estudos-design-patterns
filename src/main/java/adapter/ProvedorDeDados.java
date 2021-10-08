package adapter;

public class ProvedorDeDados {
    private UtilitariosProvedorDeDados utilitariosProvedorDeDados;


    public ProvedorDeDados(UtilitariosProvedorDeDados utilitariosProvedorDeDados) {
        this.utilitariosProvedorDeDados = utilitariosProvedorDeDados;
    }
    public String plotData(String data) {
        var A = new A(data + "Sou o Provedor de dados, eu transformei o dado em adapter.A\n");
        return utilitariosProvedorDeDados.plotData(A);
    }
}
