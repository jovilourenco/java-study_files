package disciplinas.progconcorrente.exclusaoMutua.dekker;

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
			System.out.println("Thread: " + this.id);
			lock.releaseCS(id);
		}
	}
	
	public static void main(String[] args) {
		Lock lock = new LockImpl();
		MyLock t1 = new MyLock(lock, 0);
		MyLock t2 = new MyLock(lock, 1);
		MyLock t3 = new MyLock(lock, 2);
		MyLock t4 = new MyLock(lock, 3);
		MyLock t5 = new MyLock(lock, 4);
		MyLock t6 = new MyLock(lock, 5);
		MyLock t7 = new MyLock(lock, 6);
		MyLock t8 = new MyLock(lock, 7);
		MyLock t9 = new MyLock(lock, 8);
		MyLock t10 = new MyLock(lock, 9);
		MyLock t11 = new MyLock(lock, 10);
		MyLock t12 = new MyLock(lock, 11);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
	}

}
