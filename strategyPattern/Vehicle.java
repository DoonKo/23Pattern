package strategyPattern;

public abstract class Vehicle  {
	
	private GoAlgorithm algo;
	
	
	
	public void setAlgo(GoAlgorithm algo) { //forNullPointerException
		this.algo = algo;
	}



	public String go() {
		return algo.go();
	}
}
