import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.io.IOException;

public class TesteEscrevendoArquivo {
    public static void main(String[] args) throws IOException{

        Socket s = new Socket();

        //Fluxo de dados com arquivo
        InputStream fis = s.getInputStream(); // Criando o fluxo de dados com arquivo binário. //System.in (entrada console)
        Reader isr = new InputStreamReader(fis); // Melhorando os dados de binário para caracteres.
        BufferedReader br = new BufferedReader(isr); // Criando buffer de leitura de arquivo.

        OutputStream fos = s.getOutputStream(); // Criando o fluxo de dados com arquivo binário.
        Writer osw = new OutputStreamWriter(fos); // Melhorando os dados de binário para caracteres.
        BufferedWriter bw = new BufferedWriter(osw); // Criando buffer de escrita de arquivo.

        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()){

            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();

        }

        br.close();
        bw.close();
    }
}
