package progconcorrente.sincronizacao.produtorConsumidor;

public class Producer extends Thread{
	SingleBuffer buffer;
	String value;
	
	public Producer(SingleBuffer b, String v) {
		buffer = b;
		value = v;
	}
	
	public void run() {
		buffer.deposit(value);
	}
	
}
