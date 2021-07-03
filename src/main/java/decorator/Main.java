package decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // FileInputStream é responsavel por ler o arquivo
        FileInputStream fileInputStream = new FileInputStream("myFile.txt");
        // BufferedInputStream estende FilterInputStream e não FileInputStream,
        // é uma classe decorator que amplia a funcionalidade do objeto original
        // se colocando em volta de FileInputStream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        // Assim a operação de leitura agora possivel um buffer
        bufferedInputStream.read();
    }
}
