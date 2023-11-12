package progconcorrente.exclusaoMutua.Dijkstra;

public class MyLock extends Thread{
	Lock lock;
	int id;
	
	public MyLock(Lock lock, int id) {
		this.lock = lock;
		this.id = id;
	}
	
	public void run() {
		while (true) {
			// Pode acontecer starvation. Um processo azarado poderá nunca executar.
			lock.requestCS(id);
			for(int i = 0; i<3; i++) {
				System.out.println(this.id);
			}
			try {
	            Thread.sleep(3000); // Espera por 1 segundo (1000 milissegundos)
	        } catch (InterruptedException e) {
	        }
			
			lock.releaseCS(id);
		}
	}
	
	public static void main(String[] args) {
		int nproc = 10;
		Lock lock = new LockImpl(nproc);
		for (int p = 0; p < nproc; p++)
			(new MyLock(lock, p)).start();
	}

}
