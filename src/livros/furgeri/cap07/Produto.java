package livros.furgeri.cap07;

import java.io.Serializable;

/*
 * Serializable: Os objetos da classe podem trafegar por um canal de comunicação. Sejam redes,
 * sejam arquivos de um computador.
 */

public class Produto implements Serializable{
	private int codigo;
	private String descricao;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
