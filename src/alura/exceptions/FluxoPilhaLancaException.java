package alura.exceptions;

public class FluxoPilhaLancaException {

	public static void main(String[] args) {
		// Click Direito > Debug as > Fazer a depuração para verificar a pilha.
		System.out.println("Iní do main");
		try {
			metodo1();
		}catch(ArithmeticException | MinhaException ex){
			// String msg = ex.getMessage();
			// System.out.println("Erro Aritmético: " + msg); // <-- Imprime o erro que ocorreu;
			ex.printStackTrace(); // <-- Imprime o rastro da pilha em que o erro percorreu;
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() throws MinhaException{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaException {
        System.out.println("Ini do metodo2");
        
        throw new MinhaException("Deu errado boy..."); // Lançando minha exception. Pense que uma exception também é um objeto.
        //throw -> Serve para lançar a exceção.
        // System.out.println("Fim do metodo2");        
    }

}