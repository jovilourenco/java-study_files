package alura.exceptions;

public class TestaConexaoUnchecked {

	public static void main(String[] args) {
		
		// Essas linhas(9 a 11) resumem todos os códigos abaixo dela.
		
		try(ConexaoUnchecked conexao = new ConexaoUnchecked()){
			conexao.leDados();
		}catch(Exception e) {
	    	System.out.println("Deu erro.");
	    }
		
		// ---------------- Código sem o implements AutoCloseable e com método fecha():
		
//		ConexaoUnchecked con = null; // Iniciamos fora do try e instanciamos dentro para o finally funcionar.
//		try {
//			con = new ConexaoUnchecked();
//			con.leDados(); // Dará um erro.
//		}catch(Exception e) { //IllegalStateException pertence à classe Exception.
//			System.out.println("Deu erro na conexão. ");
//		}finally {
//			con.fecha(); // Independente de erro ou não, a conexão tem que ser fechada.
//		}

	}

}
