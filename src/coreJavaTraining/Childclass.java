package coreJavaTraining;

public class Childclass extends ParentAircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childclass c=new Childclass();
		c.engine();
		c.safety();
		c.colour();
		//ParentAircraft p=new ParentAircraft();  Can not instantiate abstract class
	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("Red color on body");
	}

}
