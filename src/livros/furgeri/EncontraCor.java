package livros.furgeri;

import javax.swing.JOptionPane;

public class EncontraCor {

	public static void main(String[] args) {
		String[] cores = {"Verde","Vermelho","Azul","Amarelo","Preto","Branco","Marrom","Roxo"};
		String cor = JOptionPane.showInputDialog("Digite a cor que deseja pesquisar. ");
		String mensagem = "Cor não encontrada";
		
		for(String elemento: cores) {
			if(elemento.equalsIgnoreCase(cor)) {
				mensagem = "Cor encontrada";
			}
		}
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
