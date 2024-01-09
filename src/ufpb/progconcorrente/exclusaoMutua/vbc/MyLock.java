package disciplinas.progconcorrente.exclusaoMutua.vbc;

public class MyLock extends Thread{
	Lock lock;
	
	public MyLock(Lock lock) {
		this.lock = lock;
	}
	
	public void run() {
		while (true) {
			lock.requestCS();
			// Em teoria: Executar a contagem de 1 até 10 na ordem.
				for(int i = 0; i < 10; i++) {
					System.out.println(i);
				}
			lock.releaseCS();
		}
	}
	
	public static void main (String[] args) {
		Lock lock = new LockImpl();
		MyLock t1 = new MyLock(lock);
		MyLock t2 = new MyLock(lock);
		t1.start();
		t2.start();
	}
}