package coreJavaTraining;

public class superDemoChild extends superDemoParent {

	String name="Nishchay";
	public superDemoChild() {
	super(); 
		System.out.println("Child Consstructor");
	}
	public void getData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	public void getStringdata() {
		super.getStringdata();
		System.out.println("I am in child classs");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superDemoChild cd=new superDemoChild();
		cd.getData();
		cd.getStringdata();
	}

}
