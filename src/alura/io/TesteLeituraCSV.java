import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCSV {
    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(new File("contas.csv"));
        
        while(scanner.hasNextLine()){
            String linha = scanner.nextLine(); // Escaneia a linha inteira
            //System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha); // Escaneia cada elemento da linha separada por ","
            linhaScanner.useLocale(Locale.US); // Forçando que ele use o padrão americano.
            linhaScanner.useDelimiter(",");

            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();

            String valorFormatado = String.format(Locale.US, "%s | %d | %d | %12s | %10.2f", valor1,valor2,valor3,valor4,valor5);
            System.out.println(valorFormatado);

            linhaScanner.close();

            //String[] valores = linha.split(",");
            //System.out.println(Arrays.toString(valores));
        }

        scanner.close();

    }
}
