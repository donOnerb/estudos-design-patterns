package adapter;

public class Program {

    public static void main(String[] args) {
        var bibliotecaDeAnalises = new BibliotecaDeAnalises();
        var AdaptadorAParaB = new AdaptadorAParaB(bibliotecaDeAnalises);
        var provedorDeDados = new ProvedorDeDados(AdaptadorAParaB);

        System.out.println(provedorDeDados.plotData("Eu sou um dado\n"));
    }
}
