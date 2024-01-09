package disciplinas.progconcorrente.sincronizacao.produtorConsumidor;

import java.util.concurrent.Semaphore;

public class SingleBuffer {
	Semaphore s;
	String value;
	
	public SingleBuffer() {
		s = new Semaphore(0);
		value = null;
	}
	
	public void deposit(String v) {
		value = v;
		s.release();
	}
	
	public String fetch(){
		try {
			s.acquire();
		}catch(InterruptedException e) {}
		return value;
	}
}
