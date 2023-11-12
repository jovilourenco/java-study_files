package progconcorrente.exclusaoMutua.Dvbc;

public interface Lock {
	public void requestCS(int id);
	public void releaseCS(int id);
}
