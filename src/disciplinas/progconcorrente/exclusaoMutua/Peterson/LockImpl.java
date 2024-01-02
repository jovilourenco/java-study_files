package disciplinas.progconcorrente.exclusaoMutua.Peterson;

public class LockImpl implements Lock{
	boolean wantCS[] = {false, false};
	int turn = 1;
	
	public void requestCS(int id) {
		int otherId = 1 - id;
		wantCS[id] = true;
		turn = otherId;
		while (wantCS[otherId] && turn == otherId);
	}
	
	public void releaseCS(int id) {
		wantCS[id] = false;
	}
}
