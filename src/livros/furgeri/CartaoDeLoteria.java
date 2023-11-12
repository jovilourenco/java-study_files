package livros.furgeri;

import javax.swing.JOptionPane;

public class CartaoDeLoteria {

	public static void main(String[] args) {
		String senha = "";
		for(int i = 1; i<=10; i++) {
			int num = (int) (Math.random() * 10);
			senha += num;
		}
		JOptionPane.showMessageDialog(null, "Senha gerada: " + senha);
		
		for (int cartao = 1; cartao<= 4; cartao++) {
			String numerosCartao = "";
			for (int numCartao = 1; numCartao <=6; numCartao++) {
				int num = (int) (Math.random() * 100);
				numerosCartao += num + "   ";
			}
			JOptionPane.showMessageDialog(null, "Números do Cartão: " + cartao + "\n" + numerosCartao);
		}
		System.exit(0);
	}

}
