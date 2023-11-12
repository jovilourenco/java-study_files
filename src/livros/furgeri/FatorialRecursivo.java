package livros.furgeri;

public class FatorialRecursivo {

	public static void main(String[] args) {
		// Calculando fatorial de 0 a 10
		for(int i = 0; i<=10; i++) {
			System.out.println(i + "! = " + calculaFatorial(i));
		}
	}
	
	public static long calculaFatorial(long num) {
		if(num<=1) {
			return 1;
		}else {
			return(num * calculaFatorial(num - 1));
		}
	}

}
