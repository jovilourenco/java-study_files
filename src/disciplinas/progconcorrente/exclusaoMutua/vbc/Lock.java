package disciplinas.progconcorrente.exclusaoMutua.vbc;

public interface Lock {
	public void requestCS();
	public void releaseCS();
}