package livros.furgeri.cap07;

import java.io.*;

public class ProdutoPersiste extends Produto{
	
	/* Linhas 14 a 20:
	 * encarregam-se de gravar o objeto produto em um arquivo localizado na unidade C.
	 * O arquivo será gravado com o nome Produto, concatenado com o conteúdo do código do produto,
	 * isto é, se o código do produto for 1, então o nome do arquivo será Produto1; se o código for 22,
	 * então o nome do arquivo será Produto22 e assim por diante.
	 */
	
	public String gravar() {
		String ret = "Produto armazenado com sucesso!";
		try {
			FileOutputStream file = new FileOutputStream("c:/Produto" + this.getCodigo());
			ObjectOutputStream stream = new ObjectOutputStream(file);
			stream.writeObject(this);
			stream.flush();
		}catch (Exception erro) {
			ret = "Falha na gravação\n " + erro.toString();
		}
		return ret;
	}
	
	/* Linhas 35 a 38:
	 * encarregam-se de ler e retornar o objeto armazenado em arquivo. O objeto será
	 * retornado na linha 21. Se ocorrer algum problema nesse processo, como, por exemplo, o arquivo
	 * não for encontrado, o controle da execução passa para a linha 23, imprimindo o erro ocorrido e
	 * retornando null para a classe (no caso a classe UsaProduto) que chamou o método “ler”.
	 */
	
	public static Produto ler(int codigo) {
		try {
			FileInputStream file = new FileInputStream("c:/Produto" + codigo);
			ObjectInputStream stream = new ObjectInputStream(file);
			return ((Produto) stream.readObject());
		}catch (Exception erro) {
			System.out.println("Falha na gravação\n " + erro.toString());
			return null;
		}
	}
}
