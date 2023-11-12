package livros.furgeri;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class BuscaBinaria {

	public static void main(String[] args) {
		int[] n = new int [10000];
		for(int i = 0;i<n.length;i++) {
			n[i] = (int) (Math.random() *1000);
		}
		
		try {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número: "));
			String r = "Valor não encontrado";
			for(int i=0; i<n.length;i++) {
				if(n[i] == valor) {
					r = "Valor encontrao na posição " + i;
					break;
				}
			}
			System.out.println(r);
			Arrays.sort(n);
			int pos = Arrays.binarySearch(n, valor);
			System.out.println("Nova posição ordenada: " + pos);
			
		}catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Opa. Você deve digitar apenas números.\n" + erro.toString());
		}
		
		
	}

}
