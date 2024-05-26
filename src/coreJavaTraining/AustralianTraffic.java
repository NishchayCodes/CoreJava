package coreJavaTraining;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic {
	
	public static void main(String[] args) {
		CentralTraffic a=new AustralianTraffic();
		a.greengo();
		a.redstop();
		a.flashyellow();
		
		AustralianTraffic at=new AustralianTraffic();
		ContinentalTraffic ct=new AustralianTraffic();
		at.walkonsymbol();
		ct.Trainsymbol();
		
	}

	
	public void walkonsymbol() {
		System.out.println("Implement walkonsymbol");
	}
	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("Implement greengo");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("Implement redstop");
	}

	@Override
	public void flashyellow() {
		// TODO Auto-generated method stub
		System.out.println("Implement flashyellow");
	}


	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Implement Trainsymbol");
	}

}
