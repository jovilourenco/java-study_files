import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintStream {
    public static void main(String[] args) throws IOException{
        
        PrintStream ps = new PrintStream(new File("lorem5.txt"));
        //PrintWriter ps = new PrintWriter("lorem5.txt"); // <- Esse também serve da mesma forma.

        ps.println("Testando o printstream em um arquivo");
        ps.println();
        ps.println("Testando de novo");

        ps.close();
    }
}
