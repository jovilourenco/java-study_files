package livros.furgeri;

import javax.swing.JOptionPane;

public class EntradaDeDadosComMetodos {

	public static void main(String[] args) {
		// Testando entradas de dados com métodos.
		String nome = lerString("Forneça seu nome");
		int idade = lerNumeroInt(0, 120, "Forneça sua idade");
		float altura = lerNumeroFloat(0, 2.5f, "Forneça sua altura");
		double peso = lerNumeroDouble(0, 300, "Forneça seu peso");
		char op = selecionarOpcao("Você gosta de Java?");
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: " + peso + "\nGosta de java: " + op);
		
	}
	
	static String aux = "";
	
	public static int lerNumeroInt(int min, int max, String men) {
		int n = 0;
		while (true) {
			try {
				aux = JOptionPane.showInputDialog(men);
				n = Integer.parseInt(aux);
				if(n<min || n>max) {
					JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida!");
				}else {
					break; 
				}
			}catch(NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite apenas números\n" + erro.toString());
			}
		}
		return n;
	}
	
	public static float lerNumeroFloat(float min, float max, String men) {
		float n = 0;
		while (true) {
			try {
				aux = JOptionPane.showInputDialog(men);
				n = Float.parseFloat(aux);
				if(n<min || n>max) {
					JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida!");
				}else {
					break; 
				}
			}catch(NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite apenas números\n" + erro.toString());
			}
		}
		return n;
	}
	
	public static double lerNumeroDouble(int min, int max, String men) {
		double n = 0;
		while (true) {
			try {
				aux = JOptionPane.showInputDialog(men);
				n = Double.parseDouble(aux);
				if(n<min || n>max) {
					JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida!");
				}else {
					break; 
				}
			}catch(NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite apenas números\n" + erro.toString());
			}
		}
		return n;
	}
	
	public static String lerString(String men) {
		aux = JOptionPane.showInputDialog(men);
		return men;
	}
	
	public static char selecionarOpcao(String men) {
		Object[] op = {"Sim","Não"};
		char opcao = 'N';
		String resp = (String) JOptionPane.showInputDialog(null, men + "\n", "Pesquisa", JOptionPane.PLAIN_MESSAGE, null,op,"Sim");
		if(resp == "Sim") {
			opcao = 'S';
		}
		return opcao;
	}
	
}
