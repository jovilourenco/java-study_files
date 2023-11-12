package alura;

public class Enums {

	public static void main(String[] args) {
		
//		System.out.println(Thread.NORM_PRIORITY);
//		
//		Thread t = new Thread(() -> System.out.println("Rodando..."));
//		
//		t.setPriority(Thread.MAX_PRIORITY);
//		t.start();
		
		
		/*
		 * Enums podem ser utilizadas para enumerar estados de ações em seu programa.
		 * Ex: Ligado, Desligado; Estações do ano...
		 */
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX; //Enums não são instanciáveis.

		System.out.println(pMin.name());
		System.out.println(pMin.ordinal());
		
		System.out.println(pMax.name());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMin.getValor());
		System.out.println(pMax.getValor());
	}

}
