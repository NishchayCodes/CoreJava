package coreJavaTraining;

public abstract class ParentAircraft {
	
	public void engine() {
		System.out.println("Follow engine guidelines");
	}
	
	public void safety() {
		System.out.println("Follow safety guidelines");
	}

	
	public abstract void colour();
}
