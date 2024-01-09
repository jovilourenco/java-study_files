import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException{
        
        //Fluxo de dados com arquivo
        FileInputStream fis = new FileInputStream("lorem.txt"); // Criando o fluxo de dados com arquivo binário.
        InputStreamReader isr = new InputStreamReader(fis); // Melhorando os dados de binário para caracteres.
        BufferedReader br = new BufferedReader(isr); // Criando buffer de leitura de arquivo.

        OutputStream fos = new FileOutputStream("lorem2.txt"); // Criando o fluxo de dados com arquivo binário.
        Writer osw = new OutputStreamWriter(fos); // Melhorando os dados de binário para caracteres.
        BufferedWriter bw = new BufferedWriter(osw); // Criando buffer de escrita de arquivo.

        String linha = br.readLine();

        while(linha != null){

            bw.write(linha);
            bw.newLine();
            linha = br.readLine();

        }

        br.close();
        bw.close();
    }
}
