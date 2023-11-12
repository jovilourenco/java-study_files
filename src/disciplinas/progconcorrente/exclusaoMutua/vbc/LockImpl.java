package progconcorrente.exclusaoMutua.vbc;

public class LockImpl implements Lock{
	boolean busy = false;
		
	public void requestCS() {
		// Não garante a exclusão mútua por conta do escalonamento.
		while (busy);
		busy = true;
	}
		
	public void releaseCS() {
		busy = false;
	}
}
