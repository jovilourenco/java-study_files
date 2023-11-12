package progconcorrente.exclusaoMutua.PadeiroLamport;

public class LockImpl implements Lock{
	volatile int N;
	volatile boolean[] choosing;
	volatile int[] number;
	
	public LockImpl(int nproc) {
		N = nproc;
		choosing= new boolean[N]; 
		number = new int[N];
		
		for (int j = 0; j < N; j++) {
			choosing[j] = false;
			number[j] = 0;
		}
	}
	
	public void requestCS(int i) {
		choosing[i] = true;
		
		for (int j = 0; j < N; j++)
			if (number[j] > number[i]) 
				number[i] = number[j];
		
		number[i]++;
		choosing[i] = false;
		
		for (int j = 0; j < N; j++) {
			while (choosing[j]);
			while ((number[j] != 0) && ((number[j] < number[i]) || ((number[j] == number[i]) && (j < i))));
		}
	}
	
	public void releaseCS(int i) {
		number[i] = 0;
	}
}
