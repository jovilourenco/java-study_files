package livros.furgeri;

public class AreaSobrecarregada {

	public static void main(String[] args) {
		System.out.println("Calculando área de um quadrado: " + calcularArea(3));
		System.out.println("Calculando área de um retângulo: " + calcularArea(2,3));
		System.out.println("Calculando área de um cubo: " + calcularArea(2, 2, 2));
	}
	
	public static double calcularArea(int x) {
		return x*x;
	}
	public static double calcularArea(int x, int y) {
		return x*y;
	}
	public static double calcularArea(int x,int y,int z) {
		return (x*y*z);
	}

}
