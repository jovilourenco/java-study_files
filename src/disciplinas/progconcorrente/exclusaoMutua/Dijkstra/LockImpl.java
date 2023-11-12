package progconcorrente.exclusaoMutua.Dijkstra;

public class LockImpl implements Lock{
	volatile int nproc, turn;
	volatile int[] status;
	
	public LockImpl(int n) {
		nproc = n;
		turn = 0;
		status = new int[n];
		for (int i = 0; i < n; i++) {
			status[i] = 0;
		}
	}
	
	public void requestCS(int id) {
		int j;
		do {
			status[id] = 1;
			
			while (turn != id) {
				if (status[turn] == 0) turn = id;
			}
			
			status[id] = 2;
			j = 0;
			
			while ((j < nproc) && ((j == id) || (status[j] != 2)))
				j++;
			
		} while (j != nproc);
	}
	
	public void releaseCS(int id) {
		status[id] = 0;
	}

}
