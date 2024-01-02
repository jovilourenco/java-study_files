package disciplinas.progconcorrente.sincronizacao.produtorConsumidor;

public class ProducerConsumer {

	public static void main(String[] args) {
		String message = args[0];
		// Single Menssager
		SingleBuffer b = new SingleBuffer();
		Producer p = new Producer(b,message);
		Consumer c = new Consumer(b);
		
		p.start();
		c.start();
	}

}
