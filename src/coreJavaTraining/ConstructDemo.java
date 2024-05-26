package coreJavaTraining;

public class ConstructDemo {
	
	//Default constructor
	public ConstructDemo() {
		System.out.println("I am the Default Constructor");
	}
	
	//Parameterized constructor
	public ConstructDemo(int a) {
		System.out.println("I am the Parameterized Constructor");
	}
	public ConstructDemo(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ConstructDemo cd=new ConstructDemo();
		ConstructDemo sd=new ConstructDemo(5);
		ConstructDemo xd=new ConstructDemo("hello");
	}

}
