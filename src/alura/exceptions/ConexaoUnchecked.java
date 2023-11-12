package alura.exceptions;

public class ConexaoUnchecked implements AutoCloseable{

    public ConexaoUnchecked() {
        System.out.println("Abrindo conexao");
        // throw new IllegalStateException(); --> Se tiver no construtor, ele nem instancia o objeto.
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

//    public void fecha() {
//        System.out.println("Fechando conexao");
//    }

	@Override
	public void close() {
		System.out.println("Fechando conexão...");
	}
}
