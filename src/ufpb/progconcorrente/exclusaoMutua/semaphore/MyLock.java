package disciplinas.progconcorrente.exclusaoMutua.semaphore;

import java.util.concurrent.Semaphore;

import disciplinas.progconcorrente.exclusaoMutua.Dvbc.Lock;
import disciplinas.progconcorrente.exclusaoMutua.Dvbc.LockImpl;

public class MyLock extends Thread{
	Semaphore s;
	int id;
	
	public MyLock(Semaphore s, int id) {
		this.s = s;
		this.id = id;
	}
	
	public void run() {
		while(true) {
			try {
				s.acquire();
				System.out.println("Testando seção crítica. Thread: " + getId());
				s.release();
			}catch(InterruptedException e) {
			}
		}
	}
	
	public static void main(String[] args) {
		int nproc = 10;
		
		Semaphore s = new Semaphore(1, true);
		for(int i = 0; i<nproc; i++) {
			(new MyLock(s,i)).start();
		}
	}
	
}
