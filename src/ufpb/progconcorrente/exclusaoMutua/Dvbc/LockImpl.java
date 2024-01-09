package disciplinas.progconcorrente.exclusaoMutua.Dvbc;

public class LockImpl implements Lock{
	volatile boolean wantCS[] = {false, false};
	
	public void requestCS(int id) {
		// Garante a exclusão mútua e os processos são independentes
		// Este trecho pode gerar DeadLock
		// Uma thread espera a outra liberar infinitamente
		this.wantCS[id] = true;
		while (this.wantCS[1-id]);
	}
	
	public void releaseCS(int id) {
		this.wantCS[id] = false;
	}
}
