package prototype;

public class Main {
    public static void main(String args[]) {

        Chevrolet chevrolet = new Chevrolet();
        chevrolet.setNomeModelo("Cruze Sport v6");
        chevrolet.setPreco(500000);

        Ford ford = new Ford();
        ford.setNomeModelo("Focus 2.0");
        ford.setPreco(100000);

        Carro carro = chevrolet.clone();
        System.out.printf("chevrolet clone - modelo:%s, preço:%s", carro.getNomeModelo(), carro.getPreco() + "\n");

        carro = ford.clone();
        System.out.printf("ford clone - modelo:%s, preço:%s%n", carro.getNomeModelo(), carro.getPreco());
    }
}
