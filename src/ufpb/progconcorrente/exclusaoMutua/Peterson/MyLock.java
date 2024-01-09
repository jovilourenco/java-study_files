package disciplinas.progconcorrente.exclusaoMutua.Peterson;

public class MyLock extends Thread{
	Lock lock;
	int id;
	
	public MyLock(Lock lock, int id) {
		this.lock = lock;
		this.id = id;
	}
	
	public void run() {
		while (true) {
			lock.requestCS(id);
			for(int i = 0; i < 10; i++)
				System.out.println(this.id);
			lock.releaseCS(id);
		}
	}
	
	
	public static void main(String[] args) {
		Lock lock = new LockImpl();
		MyLock t1 = new MyLock(lock, 0);
		MyLock t2 = new MyLock(lock, 1);
		t1.start();
		t2.start();
	}

}
