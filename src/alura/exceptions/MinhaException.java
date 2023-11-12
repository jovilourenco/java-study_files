package alura.exceptions;

public class MinhaException extends Exception { //extends RuntimeException = unchecked -> Não precisará do throws.
	
	public MinhaException(String msg) {
		super(msg);
	}
}
