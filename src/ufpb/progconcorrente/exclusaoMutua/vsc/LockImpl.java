package disciplinas.progconcorrente.exclusaoMutua.vsc;

public class LockImpl implements Lock{
	
	int turn = 0;
	
	public void requestCS(int id) {
		while (turn == 1 - id); // Um processo pode bloquear ou atrasar o outro
		// Garante a exclusão mútua mas os processos são dependentes.
	}
	
	public void releaseCS(int id) {
		turn = 1 - id;
	}
}
