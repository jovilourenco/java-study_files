package livros.furgeri;

import javax.swing.JOptionPane;

public class VerificaLetra {

	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Digite a palavra que deseja verificar a letra: ");
		int contador = 0;
		for(int i = 0; i<palavra.length();i++) {
			if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
				contador++;
			}
		}
		if(contador!=0) {
			JOptionPane.showMessageDialog(null, "A palavra digitada tem a letra \"a\" " + contador + " vezes.");
		}else {
			JOptionPane.showMessageDialog(null, "A palavra não possui a letra \"a\"");
		}
		// Substituindo o "a" pelo "u"
		JOptionPane.showMessageDialog(null, palavra.replace("a", "u"));
		
	}
}