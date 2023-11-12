package alura.exceptions;

public class FluxoPilha {

	public static void main(String[] args) {
		// Click Direito > Debug as > Fazer a depuração para verificar a pilha.
		System.out.println("Iní do main");
		try {
			metodo1();
		}catch(Exception ex){
			// String msg = ex.getMessage();
			// System.out.println("Erro Aritmético: " + msg); // <-- Imprime o erro que ocorreu;
			ex.printStackTrace(); // <-- Imprime o rastro da pilha em que o erro percorreu;
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0;
        }
        System.out.println("Fim do metodo2");        
    }

}