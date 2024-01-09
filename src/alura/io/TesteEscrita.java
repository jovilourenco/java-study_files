import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteEscrita {
    public static void main(String[] args) throws IOException{
        
        //Fluxo de dados com arquivo
        OutputStream fos = new FileOutputStream("lorem2.txt"); // Criando o fluxo de dados com arquivo binário.
        Writer osw = new OutputStreamWriter(fos); // Melhorando os dados de binário para caracteres.
        BufferedWriter bw = new BufferedWriter(osw); // Criando buffer de escrita de arquivo.

        bw.write("Testando escrita em um novo arquivo.");
        // bw.newLine();
        bw.newLine();
        bw.write("Testando novamente.");

        bw.close();
    }
}
