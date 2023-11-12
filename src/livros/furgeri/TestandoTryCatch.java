package livros.furgeri;

import javax.swing.JOptionPane;

public class TestandoTryCatch{

	public static void main(String[] args) {
		try {
			String aux1 = JOptionPane.showInputDialog("Forneça o valor do 1º número. ");
			int num1 = Integer.parseInt(aux1.toString());
			String aux2 = JOptionPane.showInputDialog("Forneça o valor do 2º número.");
			int num2 = Integer.parseInt(aux2.toString());
			JOptionPane.showMessageDialog(null,"Soma = " + (num1 + num2));
			JOptionPane.showMessageDialog(null,"Subtração = " + (num1 - num2));
			JOptionPane.showMessageDialog(null,"Multiplicação = " + (num1 * num2));
			JOptionPane.showMessageDialog(null,"Divisão = " + (num1 / num2));
		}catch(ArithmeticException erro){
			JOptionPane.showMessageDialog(null,"Erro de divisão por zero!\n" + erro.toString(),"ERRO",JOptionPane.ERROR_MESSAGE);
		}catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null,"Erro de conversão!\n" + erro.toString(),"ERRO",JOptionPane.ERROR_MESSAGE);
		}catch(NullPointerException erro) {
			JOptionPane.showMessageDialog(null,"Tecla cancel pressionada!\n" + erro.toString(),"Cancelado pelo usuário",JOptionPane.ERROR_MESSAGE);
		}
		System.exit(0);
		
	}
}
