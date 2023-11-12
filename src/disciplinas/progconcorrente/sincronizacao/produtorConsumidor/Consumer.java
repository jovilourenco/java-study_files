package progconcorrente.sincronizacao.produtorConsumidor;

public class Consumer extends Thread{
	SingleBuffer buffer;
	String value;
	
	public Consumer(SingleBuffer b) {
		buffer = b;
	}
	
	public void run() {	
		value = buffer.fetch();	
	}
	
}
