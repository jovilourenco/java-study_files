package livros.furgeri;

import java.util.*;

public class MetodoComArray {

	public static void main(String[] args) {
		double[] numeros = {12.4, 3.4, 9, 7.3};
		double maior = buscaMaior(numeros);
		System.out.println(maior);
		
		String[] nomes = {"Jequiti", "Boticário", "Natura", "Egeo","Avon"};
		String[] retorno = ordenarPalavras(nomes);
		for(int i = 0; i<retorno.length; i++) {
			System.out.println(retorno[i]);
		}
	}
	
	// Recebe um vetor de números e retorna o maior deles
	public static double buscaMaior(double[] numeros) {
		double maior = numeros[0];
		for(int i=1; i<numeros.length; i++) {
			maior = Math.max(maior, numeros[i]);
		}
		return maior;
	}
	
	// Recebe um vetor de palavras e retorna o vetor em ordem alfabética
	public static String[] ordenarPalavras(String[] palavras) {
		Arrays.sort(palavras);
		return palavras;
	}

}
