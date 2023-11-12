package progconcorrente.exclusaoMutua.dekker;

public class LockImpl implements Lock{
	volatile boolean wantCS[] = {false, false};int turn = 1;
	
	public void requestCS(int id) {
		int otherId = 1 - id;
		wantCS[id] = true;
		while (wantCS[otherId]) {
			if (turn == otherId) {
				wantCS[id] = false;
				while (turn == otherId);
				wantCS[id] = true; 
			}
		}
	}
	
	public void releaseCS(int id) {
		turn = 1 - id;
		wantCS[id] = false;
	}
}
