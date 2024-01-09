import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
    public static void main(String[] args) throws IOException{

        //Fluxo de dados com arquivo
        FileInputStream fis = new FileInputStream("lorem.txt"); // Criando o fluxo de dados com arquivo binário.
        InputStreamReader isr = new InputStreamReader(fis); // Melhorando os dados de binário para caracteres.
        BufferedReader br = new BufferedReader(isr); // Criando buffer de leitura de arquivo.

        String linha = br.readLine();

        while(linha != null){

            System.out.println(linha);
            linha = br.readLine();

        }

        br.close();

    }
}
